package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import q4.a;

/* loaded from: classes.dex */
public abstract class f0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            w3.e.k();
            Context j6 = w3.e.k().j();
            SharedPreferences sharedPreferences = j6.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j6.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(j6.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static q4.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0133a h6 = q4.a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(a.d.ANDROID).h(k(extras));
        String h7 = h(extras);
        if (h7 != null) {
            h6.g(h7);
        }
        String o6 = o(extras);
        if (o6 != null) {
            h6.l(o6);
        }
        String c6 = c(extras);
        if (c6 != null) {
            h6.c(c6);
        }
        String i6 = i(extras);
        if (i6 != null) {
            h6.b(i6);
        }
        String e6 = e(extras);
        if (e6 != null) {
            h6.d(e6);
        }
        long n6 = n(extras);
        if (n6 > 0) {
            h6.j(n6);
        }
        return h6.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) l2.l.a(com.google.firebase.installations.c.q(w3.e.k()).a());
        } catch (InterruptedException | ExecutionException e6) {
            throw new RuntimeException(e6);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c k(Bundle bundle) {
        return (bundle == null || !h0.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    static String l(Bundle bundle) {
        return (bundle == null || !h0.t(bundle)) ? "data" : "display";
    }

    static String m() {
        return w3.e.k().j().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e6) {
                Log.w("FirebaseMessaging", "error parsing project number", e6);
            }
        }
        w3.e k6 = w3.e.k();
        String d6 = k6.m().d();
        if (d6 != null) {
            try {
                return Long.parseLong(d6);
            } catch (NumberFormatException e7) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e7);
            }
        }
        String c6 = k6.m().c();
        try {
            if (!c6.startsWith("1:")) {
                return Long.parseLong(c6);
            }
            String[] split = c6.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e8) {
            Log.w("FirebaseMessaging", "error parsing app ID", e8);
            return 0L;
        }
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.s());
        }
    }

    private static void w(a.b bVar, Intent intent, b1.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        q4.a b6 = b(bVar, intent);
        if (b6 == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", q4.b.class, b1.b.b("proto"), new b1.e() { // from class: com.google.firebase.messaging.e0
                @Override // b1.e
                public final Object apply(Object obj) {
                    return ((q4.b) obj).c();
                }
            }).a(b1.c.d(q4.b.b().b(b6).a()));
        } catch (RuntimeException e6) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            w3.e.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d6 = d(bundle);
            if (d6 != null) {
                bundle2.putString("_nmid", d6);
            }
            String e6 = e(bundle);
            if (e6 != null) {
                bundle2.putString("_nmn", e6);
            }
            String i6 = i(bundle);
            if (!TextUtils.isEmpty(i6)) {
                bundle2.putString("label", i6);
            }
            String g6 = g(bundle);
            if (!TextUtils.isEmpty(g6)) {
                bundle2.putString("message_channel", g6);
            }
            String o6 = o(bundle);
            if (o6 != null) {
                bundle2.putString("_nt", o6);
            }
            String j6 = j(bundle);
            if (j6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j6));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String q6 = q(bundle);
            if (q6 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q6));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e8);
                }
            }
            String l6 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l6);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            androidx.appcompat.app.f0.a(w3.e.k().i(x3.a.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        } else {
            androidx.appcompat.app.f0.a(w3.e.k().i(x3.a.class));
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
