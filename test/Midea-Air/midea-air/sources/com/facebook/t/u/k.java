package com.facebook.t.u;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import cm.aptoide.pt.BuildConfig;
import cm.aptoide.pt.notification.PullingContentService;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import com.facebook.internal.r;
import com.facebook.t.g;
import com.facebook.t.m;
import java.util.Locale;

/* compiled from: SessionLogger.java */
/* loaded from: classes.dex */
class k {
    private static final String a = "com.facebook.t.u.k";

    /* renamed from: b, reason: collision with root package name */
    private static final long[] f9643b = {LocalNotificationSyncManager.FIVE_MINUTES, 900000, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, 3600000, 21600000, 43200000, PullingContentService.UPDATES_INTERVAL, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    k() {
    }

    private static String a(Context context) {
        if (com.facebook.internal.a0.f.a.c(k.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String a2 = g.a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            sharedPreferences.edit().putString(str, a2).apply();
            return a2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, k.class);
            return null;
        }
    }

    private static int b(long j2) {
        if (com.facebook.internal.a0.f.a.c(k.class)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = f9643b;
                if (i2 >= jArr.length || jArr[i2] >= j2) {
                    break;
                }
                i2++;
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, k.class);
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, l lVar, String str2, Context context) {
        String lVar2;
        if (com.facebook.internal.a0.f.a.c(k.class)) {
            return;
        }
        if (lVar != null) {
            try {
                lVar2 = lVar.toString();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, k.class);
                return;
            }
        } else {
            lVar2 = "Unclassified";
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", lVar2);
        bundle.putString("fb_mobile_pckg_fp", a(context));
        bundle.putString("fb_mobile_app_cert_hash", com.facebook.internal.c0.a.a(context));
        m mVar = new m(str, str2, null);
        mVar.f("fb_mobile_activate_app", bundle);
        if (m.c() != g.a.EXPLICIT_ONLY) {
            mVar.a();
        }
    }

    private static void d() {
        if (com.facebook.internal.a0.f.a.c(k.class)) {
            return;
        }
        try {
            r.g(com.facebook.l.APP_EVENTS, a, "Clock skew detected");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, k.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str, j jVar, String str2) {
        if (com.facebook.internal.a0.f.a.c(k.class) || jVar == null) {
            return;
        }
        try {
            Long valueOf = Long.valueOf(jVar.b() - jVar.e().longValue());
            if (valueOf.longValue() < 0) {
                valueOf = 0L;
                d();
            }
            Long valueOf2 = Long.valueOf(jVar.f());
            if (valueOf2.longValue() < 0) {
                d();
                valueOf2 = 0L;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", jVar.c());
            bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", Integer.valueOf(b(valueOf.longValue()))));
            l g2 = jVar.g();
            bundle.putString("fb_mobile_launch_source", g2 != null ? g2.toString() : "Unclassified");
            bundle.putLong("_logTime", jVar.e().longValue() / 1000);
            m mVar = new m(str, str2, null);
            double longValue = valueOf2.longValue();
            Double.isNaN(longValue);
            mVar.e("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, k.class);
        }
    }
}
