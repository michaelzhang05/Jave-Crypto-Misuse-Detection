package org.apache.cordova.networkinformation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Locale;
import m5.h;
import m5.k;
import m5.o;
import org.apache.cordova.b;
import org.apache.cordova.f;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class NetworkManager extends b {
    public static final String CDMA = "cdma";
    public static final String CELLULAR = "cellular";
    public static final String EDGE = "edge";
    public static final String EHRPD = "ehrpd";
    public static final String FOUR_G = "4g";
    public static final String GPRS = "gprs";
    public static final String GSM = "gsm";
    public static final String HSDPA = "hsdpa";
    public static final String HSPA = "hspa";
    public static final String HSPA_PLUS = "hspa+";
    public static final String HSUPA = "hsupa";
    public static final String LTE = "lte";
    public static final String MOBILE = "mobile";
    public static int NOT_REACHABLE = 0;
    public static final String ONEXRTT = "1xrtt";
    public static int REACHABLE_VIA_CARRIER_DATA_NETWORK = 1;
    public static int REACHABLE_VIA_WIFI_NETWORK = 2;
    public static final String THREE_G = "3g";
    public static final String TWO_G = "2g";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_ETHERNET_SHORT = "eth";
    public static final String TYPE_NONE = "none";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_WIFI = "wifi";
    public static final String UMB = "umb";
    public static final String UMTS = "umts";
    public static final String WIFI = "wifi";
    public static final String WIMAX = "wimax";

    /* renamed from: c, reason: collision with root package name */
    private org.apache.cordova.a f8579c;

    /* renamed from: d, reason: collision with root package name */
    ConnectivityManager f8580d;

    /* renamed from: e, reason: collision with root package name */
    BroadcastReceiver f8581e;

    /* renamed from: f, reason: collision with root package name */
    private String f8582f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkManager networkManager = NetworkManager.this;
            if (networkManager.webView != null) {
                networkManager.i(networkManager.f8580d.getActiveNetworkInfo());
            }
            String str = NetworkManager.this.f8582f == null ? NetworkManager.TYPE_NONE : NetworkManager.this.f8582f;
            if (Build.VERSION.SDK_INT < 23 || !NetworkManager.TYPE_NONE.equals(str)) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            o.a("NetworkManager", "Intent no connectivity: " + booleanExtra);
            if (booleanExtra) {
                o.a("NetworkManager", "Really no connectivity");
            } else {
                o.a("NetworkManager", "!!! Switching to unknown, Intent states there is a connectivity.");
                NetworkManager.this.g(NetworkManager.TYPE_UNKNOWN);
            }
        }
    }

    private String d(NetworkInfo networkInfo) {
        String typeName = networkInfo.getTypeName();
        Locale locale = Locale.US;
        String lowerCase = typeName.toLowerCase(locale);
        o.a("NetworkManager", "toLower : " + lowerCase);
        if (lowerCase.equals("wifi")) {
            return "wifi";
        }
        if (lowerCase.toLowerCase().equals(TYPE_ETHERNET) || lowerCase.toLowerCase().startsWith(TYPE_ETHERNET_SHORT)) {
            return TYPE_ETHERNET;
        }
        if (!lowerCase.equals(MOBILE) && !lowerCase.equals(CELLULAR)) {
            return TYPE_UNKNOWN;
        }
        String lowerCase2 = networkInfo.getSubtypeName().toLowerCase(locale);
        String str = "2g";
        if (!lowerCase2.equals(GSM) && !lowerCase2.equals(GPRS) && !lowerCase2.equals(EDGE) && !lowerCase2.equals("2g")) {
            str = "3g";
            if (!lowerCase2.startsWith(CDMA) && !lowerCase2.equals(UMTS) && !lowerCase2.equals(ONEXRTT) && !lowerCase2.equals(EHRPD) && !lowerCase2.equals(HSUPA) && !lowerCase2.equals(HSDPA) && !lowerCase2.equals(HSPA) && !lowerCase2.equals("3g")) {
                str = "4g";
                if (!lowerCase2.equals(LTE) && !lowerCase2.equals(UMB) && !lowerCase2.equals(HSPA_PLUS) && !lowerCase2.equals("4g")) {
                    return TYPE_UNKNOWN;
                }
            }
        }
        return str;
    }

    private String e(NetworkInfo networkInfo) {
        String str = TYPE_NONE;
        if (networkInfo != null && networkInfo.isConnected()) {
            str = d(networkInfo);
        }
        o.a("NetworkManager", "Connection Type: " + str);
        return str;
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.f8581e == null) {
            this.f8581e = new a();
        }
        this.webView.getContext().registerReceiver(this.f8581e, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        if (this.f8579c != null) {
            f fVar = new f(f.a.OK, str);
            fVar.h(true);
            this.f8579c.sendPluginResult(fVar);
        }
        this.webView.postMessage("networkconnection", str);
    }

    private void h() {
        if (this.f8581e != null) {
            try {
                try {
                    this.webView.getContext().unregisterReceiver(this.f8581e);
                } catch (Exception e6) {
                    o.d("NetworkManager", "Error unregistering network receiver: " + e6.getMessage(), e6);
                }
            } finally {
                this.f8581e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(NetworkInfo networkInfo) {
        String e6 = e(networkInfo);
        if (e6.equals(this.f8582f)) {
            o.a("NetworkManager", "Networkinfo state didn't change, there is no event propagated to the JavaScript side.");
        } else {
            g(e6);
            this.f8582f = e6;
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        if (!str.equals("getConnectionInfo")) {
            return false;
        }
        this.f8579c = aVar;
        f fVar = new f(f.a.OK, e(this.f8580d.getActiveNetworkInfo()));
        fVar.h(true);
        aVar.sendPluginResult(fVar);
        return true;
    }

    @Override // org.apache.cordova.b
    public void initialize(h hVar, k kVar) {
        super.initialize(hVar, kVar);
        this.f8580d = (ConnectivityManager) hVar.getActivity().getSystemService("connectivity");
        this.f8579c = null;
        f();
    }

    @Override // org.apache.cordova.b
    public void onDestroy() {
        h();
    }

    @Override // org.apache.cordova.b
    public void onPause(boolean z5) {
        h();
    }

    @Override // org.apache.cordova.b
    public void onResume(boolean z5) {
        super.onResume(z5);
        h();
        f();
    }
}
