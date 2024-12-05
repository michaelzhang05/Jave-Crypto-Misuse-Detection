package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import f1.C2657a;
import f1.C2658b;
import java.util.concurrent.ExecutionException;
import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
public abstract class F {
    public static boolean A(Intent intent) {
        if (intent != null && !r(intent)) {
            return B(intent.getExtras());
        }
        return false;
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
            y0.e.l();
            Context k8 = y0.e.l().k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
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

    static C2657a b(C2657a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C2657a.C0737a h8 = C2657a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(C2657a.d.ANDROID).h(k(extras));
        String h9 = h(extras);
        if (h9 != null) {
            h8.g(h9);
        }
        String o8 = o(extras);
        if (o8 != null) {
            h8.l(o8);
        }
        String c8 = c(extras);
        if (c8 != null) {
            h8.c(c8);
        }
        String i8 = i(extras);
        if (i8 != null) {
            h8.b(i8);
        }
        String e8 = e(extras);
        if (e8 != null) {
            h8.d(e8);
        }
        long n8 = n(extras);
        if (n8 > 0) {
            h8.j(n8);
        }
        return h8.a();
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
            return (String) r0.l.a(com.google.firebase.installations.c.q(y0.e.l()).getId());
        } catch (InterruptedException | ExecutionException e8) {
            throw new RuntimeException(e8);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static C2657a.c k(Bundle bundle) {
        if (bundle != null && H.t(bundle)) {
            return C2657a.c.DISPLAY_NOTIFICATION;
        }
        return C2657a.c.DATA_MESSAGE;
    }

    static String l(Bundle bundle) {
        if (bundle != null && H.t(bundle)) {
            return "display";
        }
        return DataSchemeDataSource.SCHEME_DATA;
    }

    static String m() {
        return y0.e.l().k().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing project number", e8);
            }
        }
        y0.e l8 = y0.e.l();
        String d8 = l8.n().d();
        if (d8 != null) {
            try {
                return Long.parseLong(d8);
            } catch (NumberFormatException e9) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e9);
            }
        }
        String c8 = l8.n().c();
        if (!c8.startsWith("1:")) {
            try {
                return Long.parseLong(c8);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing app ID", e10);
            }
        } else {
            String[] split = c8.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing app ID", e11);
            }
        }
        return 0L;
    }

    static String o(Bundle bundle) {
        String string = bundle.getString(TypedValues.TransitionType.S_FROM);
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
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
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
            w(C2657a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.q());
        }
    }

    private static void w(C2657a.b bVar, Intent intent, s.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C2657a b8 = b(bVar, intent);
        if (b8 == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", C2658b.class, C3700b.b("proto"), new InterfaceC3703e() { // from class: com.google.firebase.messaging.E
                @Override // s.InterfaceC3703e
                public final Object apply(Object obj) {
                    return ((C2658b) obj).c();
                }
            }).b(AbstractC3701c.d(C2658b.b().b(b8).a()));
        } catch (RuntimeException e8) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            y0.e.l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d8 = d(bundle);
            if (d8 != null) {
                bundle2.putString("_nmid", d8);
            }
            String e8 = e(bundle);
            if (e8 != null) {
                bundle2.putString("_nmn", e8);
            }
            String i8 = i(bundle);
            if (!TextUtils.isEmpty(i8)) {
                bundle2.putString("label", i8);
            }
            String g8 = g(bundle);
            if (!TextUtils.isEmpty(g8)) {
                bundle2.putString("message_channel", g8);
            }
            String o8 = o(bundle);
            if (o8 != null) {
                bundle2.putString("_nt", o8);
            }
            String j8 = j(bundle);
            if (j8 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j8));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String q8 = q(bundle);
            if (q8 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q8));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String l8 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l8);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC4011a interfaceC4011a = (InterfaceC4011a) y0.e.l().j(InterfaceC4011a.class);
            if (interfaceC4011a != null) {
                interfaceC4011a.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC4011a interfaceC4011a = (InterfaceC4011a) y0.e.l().j(InterfaceC4011a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC4011a != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC4011a.c("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                interfaceC4011a.b("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean z(Intent intent) {
        if (intent != null && !r(intent)) {
            return a();
        }
        return false;
    }
}
