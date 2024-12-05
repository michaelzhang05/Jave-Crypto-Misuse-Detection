package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.x;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserSettingsManager.java */
/* loaded from: classes.dex */
public final class s {
    private static final String a = "com.facebook.s";

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f9392b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f9393c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static b f9394d = new b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e, reason: collision with root package name */
    private static b f9395e = new b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f, reason: collision with root package name */
    private static b f9396f = new b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g, reason: collision with root package name */
    private static b f9397g = new b(false, "auto_event_setup_enabled");

    /* renamed from: h, reason: collision with root package name */
    private static b f9398h = new b(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i, reason: collision with root package name */
    private static SharedPreferences f9399i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserSettingsManager.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9400f;

        a(long j2) {
            this.f9400f = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.internal.m o;
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (s.f9396f.a() && (o = com.facebook.internal.n.o(f.f(), false)) != null && o.b()) {
                    com.facebook.internal.a h2 = com.facebook.internal.a.h(f.e());
                    if (((h2 == null || h2.b() == null) ? null : h2.b()) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h2.b());
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest J = GraphRequest.J(null, f.f(), null);
                        J.b0(true);
                        J.a0(bundle);
                        JSONObject h3 = J.g().h();
                        if (h3 != null) {
                            s.f9397g.f9401b = Boolean.valueOf(h3.optBoolean("auto_event_setup_enabled", false));
                            s.f9397g.f9403d = this.f9400f;
                            s.s(s.f9397g);
                        }
                    }
                }
                s.f9393c.set(false);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserSettingsManager.java */
    /* loaded from: classes.dex */
    public static class b {
        String a;

        /* renamed from: b, reason: collision with root package name */
        Boolean f9401b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9402c;

        /* renamed from: d, reason: collision with root package name */
        long f9403d;

        b(boolean z, String str) {
            this.f9402c = z;
            this.a = str;
        }

        boolean a() {
            Boolean bool = this.f9401b;
            return bool == null ? this.f9402c : bool.booleanValue();
        }
    }

    public static boolean e() {
        k();
        return f9396f.a();
    }

    public static boolean f() {
        k();
        return f9394d.a();
    }

    public static boolean g() {
        k();
        return f9395e.a();
    }

    public static boolean h() {
        k();
        return f9397g.a();
    }

    public static boolean i() {
        k();
        return f9398h.a();
    }

    private static void j() {
        q(f9397g);
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = f9397g;
        if (bVar.f9401b == null || currentTimeMillis - bVar.f9403d >= 604800000) {
            bVar.f9401b = null;
            bVar.f9403d = 0L;
            if (f9393c.compareAndSet(false, true)) {
                f.m().execute(new a(currentTimeMillis));
            }
        }
    }

    public static void k() {
        if (f.w() && f9392b.compareAndSet(false, true)) {
            f9399i = f.e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            l(f9395e, f9396f, f9394d);
            j();
            p();
            o();
        }
    }

    private static void l(b... bVarArr) {
        for (b bVar : bVarArr) {
            if (bVar == f9397g) {
                j();
            } else if (bVar.f9401b == null) {
                q(bVar);
                if (bVar.f9401b == null) {
                    m(bVar);
                }
            } else {
                s(bVar);
            }
        }
    }

    private static void m(b bVar) {
        Bundle bundle;
        r();
        try {
            Context e2 = f.e();
            ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(bVar.a)) {
                return;
            }
            bVar.f9401b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.a, bVar.f9402c));
        } catch (PackageManager.NameNotFoundException e3) {
            x.U(a, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n() {
        Bundle bundle;
        try {
            Context e2 = f.e();
            ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.t.m mVar = new com.facebook.t.m(e2);
            Bundle bundle2 = new Bundle();
            if (!x.J()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            mVar.f("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static void o() {
        int i2;
        ApplicationInfo applicationInfo;
        if (f9392b.get() && f.w()) {
            Context e2 = f.e();
            int i3 = 0;
            int i4 = ((f9394d.a() ? 1 : 0) << 0) | 0 | ((f9395e.a() ? 1 : 0) << 1) | ((f9396f.a() ? 1 : 0) << 2) | ((f9398h.a() ? 1 : 0) << 3);
            int i5 = f9399i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i5 != i4) {
                f9399i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).commit();
                try {
                    applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    int i6 = 0;
                    i2 = 0;
                    for (int i7 = 0; i7 < 4; i7++) {
                        try {
                            i2 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                            i6 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    i3 = i6;
                    com.facebook.t.m mVar = new com.facebook.t.m(e2);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i2);
                    bundle.putInt("initial", i3);
                    bundle.putInt("previous", i5);
                    bundle.putInt("current", i4);
                    mVar.i("fb_sdk_settings_changed", bundle);
                }
                i2 = 0;
                com.facebook.t.m mVar2 = new com.facebook.t.m(e2);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i2);
                bundle2.putInt("initial", i3);
                bundle2.putInt("previous", i5);
                bundle2.putInt("current", i4);
                mVar2.i("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    private static void p() {
        Bundle bundle;
        try {
            Context e2 = f.e();
            ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return;
            }
            if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                Log.w(a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                Log.w(a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (e()) {
                return;
            }
            Log.w(a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static void q(b bVar) {
        r();
        try {
            String string = f9399i.getString(bVar.a, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            bVar.f9401b = Boolean.valueOf(jSONObject.getBoolean("value"));
            bVar.f9403d = jSONObject.getLong("last_timestamp");
        } catch (JSONException e2) {
            x.U(a, e2);
        }
    }

    private static void r() {
        if (!f9392b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(b bVar) {
        r();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", bVar.f9401b);
            jSONObject.put("last_timestamp", bVar.f9403d);
            f9399i.edit().putString(bVar.a, jSONObject.toString()).commit();
            o();
        } catch (Exception e2) {
            x.U(a, e2);
        }
    }
}
