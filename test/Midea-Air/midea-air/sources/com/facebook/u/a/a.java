package com.facebook.u.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.f;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.w;
import com.facebook.internal.x;
import com.google.zxing.WriterException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.g.b;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceRequestsHelper.java */
/* loaded from: classes.dex */
public class a {
    private static final String a = "com.facebook.u.a.a";

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<String, NsdManager.RegistrationListener> f9703b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceRequestsHelper.java */
    /* renamed from: com.facebook.u.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0157a implements NsdManager.RegistrationListener {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9704b;

        C0157a(String str, String str2) {
            this.a = str;
            this.f9704b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            a.a(this.f9704b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (this.a.equals(nsdServiceInfo.getServiceName())) {
                return;
            }
            a.a(this.f9704b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
        }
    }

    public static void a(String str) {
        b(str);
    }

    @TargetApi(16)
    private static void b(String str) {
        NsdManager.RegistrationListener registrationListener = f9703b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) f.e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e2) {
                x.U(a, e2);
            }
            f9703b.remove(str);
        }
    }

    public static Bitmap c(String str) {
        EnumMap enumMap = new EnumMap(c.class);
        enumMap.put((EnumMap) c.MARGIN, (c) 2);
        Bitmap bitmap = null;
        try {
            b a2 = new d().a(str, com.google.zxing.a.QR_CODE, 200, 200, enumMap);
            int g2 = a2.g();
            int h2 = a2.h();
            int[] iArr = new int[g2 * h2];
            for (int i2 = 0; i2 < g2; i2++) {
                int i3 = i2 * h2;
                for (int i4 = 0; i4 < h2; i4++) {
                    iArr[i3 + i4] = a2.e(i4, i2) ? -16777216 : -1;
                }
            }
            bitmap = Bitmap.createBitmap(h2, g2, Bitmap.Config.ARGB_8888);
            bitmap.setPixels(iArr, 0, h2, 0, 0, h2, g2);
            return bitmap;
        } catch (WriterException unused) {
            return bitmap;
        }
    }

    public static String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static boolean e() {
        m j2 = n.j(f.f());
        return Build.VERSION.SDK_INT >= 16 && j2 != null && j2.k().contains(w.Enabled);
    }

    public static boolean f(String str) {
        if (e()) {
            return g(str);
        }
        return false;
    }

    @TargetApi(16)
    private static boolean g(String str) {
        if (f9703b.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", f.t().replace('.', '|')), str);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) f.e().getSystemService("servicediscovery");
        C0157a c0157a = new C0157a(format, str);
        f9703b.put(str, c0157a);
        nsdManager.registerService(nsdServiceInfo, 1, c0157a);
        return true;
    }
}
