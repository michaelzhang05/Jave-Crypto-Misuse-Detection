package com.albahra.plugin.networkinterface;

import android.net.wifi.WifiManager;
import android.util.Log;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.net.URI;
import java.util.Enumeration;
import java.util.HashMap;
import org.apache.cordova.a;
import org.apache.cordova.b;
import org.apache.cordova.f;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class networkinterface extends b {
    public static final String GET_CARRIER_IP_ADDRESS = "getCarrierIPAddress";
    public static final String GET_HTTP_PROXY_INFORMATION = "getHttpProxyInformation";
    public static final String GET__WIFI_IP_ADDRESS = "getWiFiIPAddress";

    private JSONObject a(Proxy.Type type, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", type.toString());
        jSONObject.put("host", str);
        jSONObject.put("port", str2);
        return jSONObject;
    }

    private boolean b(String[] strArr, a aVar) {
        String str = strArr[0];
        String str2 = strArr[1];
        if (str == null || str.equals("0.0.0.0")) {
            aVar.error("No valid IP address identified");
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ip", str);
        hashMap.put("subnet", str2);
        aVar.sendPluginResult(new f(f.a.OK, new JSONObject(hashMap)));
        return true;
    }

    private String[] c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && !nextElement.getName().equals("wlan0") && (nextElement2 instanceof Inet4Address)) {
                        return new String[]{nextElement2.getHostAddress().toString(), getIPv4Subnet(nextElement2)};
                    }
                }
            }
        } catch (SocketException e6) {
            Log.e("cordova-plugin-networkinterface", "Exception in Get IP Address: " + e6.toString());
        }
        return new String[]{null, null};
    }

    private boolean d(String str, a aVar) {
        JSONArray jSONArray = new JSONArray();
        ProxySelector proxySelector = ProxySelector.getDefault();
        if (proxySelector != null) {
            for (Proxy proxy : proxySelector.select(new URI(str))) {
                if (Proxy.Type.DIRECT.equals(proxy.type())) {
                    break;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                if (inetSocketAddress != null) {
                    jSONArray.put(a(proxy.type(), inetSocketAddress.getHostString(), String.valueOf(inetSocketAddress.getPort())));
                }
            }
        }
        if (jSONArray.length() < 1) {
            jSONArray.put(a(Proxy.Type.DIRECT, NetworkManager.TYPE_NONE, NetworkManager.TYPE_NONE));
        }
        aVar.sendPluginResult(new f(f.a.OK, jSONArray));
        return true;
    }

    private String[] e() {
        String str;
        int ipAddress = ((WifiManager) this.f8371cordova.getActivity().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        String format = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        try {
            str = getIPv4Subnet(InetAddress.getByName(format));
        } catch (Exception unused) {
            str = "";
        }
        return new String[]{format, str};
    }

    public static String getIPv4Subnet(InetAddress inetAddress) {
        try {
            for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
                if (!interfaceAddress.getAddress().isLoopbackAddress() && (interfaceAddress.getAddress() instanceof Inet4Address)) {
                    return getIPv4SubnetFromNetPrefixLength(interfaceAddress.getNetworkPrefixLength()).getHostAddress().toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static InetAddress getIPv4SubnetFromNetPrefixLength(int i6) {
        int i7 = Integer.MIN_VALUE;
        for (int i8 = i6 - 1; i8 > 0; i8--) {
            i7 >>= 1;
        }
        try {
            return InetAddress.getByName(Integer.toString((i7 >> 24) & 255) + "." + Integer.toString((i7 >> 16) & 255) + "." + Integer.toString((i7 >> 8) & 255) + "." + Integer.toString(i7 & 255));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, a aVar) {
        try {
            if (GET__WIFI_IP_ADDRESS.equals(str)) {
                return b(e(), aVar);
            }
            if (GET_CARRIER_IP_ADDRESS.equals(str)) {
                return b(c(), aVar);
            }
            if (GET_HTTP_PROXY_INFORMATION.equals(str)) {
                return d(jSONArray.getString(0), aVar);
            }
            aVar.error("Error no such method '" + str + "'");
            return false;
        } catch (Exception e6) {
            aVar.error("Error while calling ''" + str + "' '" + e6.getMessage());
            return false;
        }
    }
}
