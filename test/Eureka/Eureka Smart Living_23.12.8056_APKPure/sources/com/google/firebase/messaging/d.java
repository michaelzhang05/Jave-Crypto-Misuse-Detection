package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.t;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f5885a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final t.e f5886a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5887b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5888c;

        a(t.e eVar, String str, int i6) {
            this.f5886a = eVar;
            this.f5887b = str;
            this.f5888c = i6;
        }
    }

    private static PendingIntent a(Context context, h0 h0Var, String str, PackageManager packageManager) {
        Intent f6 = f(str, h0Var, packageManager);
        if (f6 == null) {
            return null;
        }
        f6.addFlags(67108864);
        f6.putExtras(h0Var.y());
        if (q(h0Var)) {
            f6.putExtra("gcm.n.analytics_data", h0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f6, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, h0 h0Var) {
        if (q(h0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(h0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, h0 h0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        t.e eVar = new t.e(context2, str);
        String n6 = h0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n6)) {
            eVar.k(n6);
        }
        String n7 = h0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n7)) {
            eVar.j(n7);
            eVar.w(new t.c().h(n7));
        }
        eVar.u(m(packageManager, resources, packageName, h0Var.p("gcm.n.icon"), bundle));
        Uri n8 = n(packageName, h0Var, resources);
        if (n8 != null) {
            eVar.v(n8);
        }
        eVar.i(a(context, h0Var, packageName, packageManager));
        PendingIntent b6 = b(context, context2, h0Var);
        if (b6 != null) {
            eVar.m(b6);
        }
        Integer h6 = h(context2, h0Var.p("gcm.n.color"), bundle);
        if (h6 != null) {
            eVar.h(h6.intValue());
        }
        eVar.f(!h0Var.a("gcm.n.sticky"));
        eVar.q(h0Var.a("gcm.n.local_only"));
        String p6 = h0Var.p("gcm.n.ticker");
        if (p6 != null) {
            eVar.x(p6);
        }
        Integer m6 = h0Var.m();
        if (m6 != null) {
            eVar.s(m6.intValue());
        }
        Integer r5 = h0Var.r();
        if (r5 != null) {
            eVar.z(r5.intValue());
        }
        Integer l6 = h0Var.l();
        if (l6 != null) {
            eVar.r(l6.intValue());
        }
        Long j6 = h0Var.j("gcm.n.event_time");
        if (j6 != null) {
            eVar.t(true);
            eVar.A(j6.longValue());
        }
        long[] q6 = h0Var.q();
        if (q6 != null) {
            eVar.y(q6);
        }
        int[] e6 = h0Var.e();
        if (e6 != null) {
            eVar.p(e6[0], e6[1], e6[2]);
        }
        eVar.l(i(h0Var));
        return new a(eVar, o(h0Var), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(Context context, h0 h0Var) {
        Bundle j6 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, h0Var, k(context, h0Var.k(), j6), j6);
    }

    private static Intent f(String str, h0 h0Var, PackageManager packageManager) {
        String p6 = h0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p6)) {
            Intent intent = new Intent(p6);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f6 = h0Var.f();
        if (f6 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f6);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f5885a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i6 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i6 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.c(context, i6));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(h0 h0Var) {
        boolean a6 = h0Var.a("gcm.n.default_sound");
        ?? r02 = a6;
        if (h0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a6 ? 1 : 0) | 2;
        }
        return h0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e6) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e6);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        Object systemService;
        String str2;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                com.capacitorjs.plugins.pushnotifications.m.a();
                notificationManager.createNotificationChannel(com.capacitorjs.plugins.pushnotifications.k.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i6) {
        return Build.VERSION.SDK_INT >= 23 ? i6 | 67108864 : i6;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i6 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i6 == 0 || !p(resources, i6)) {
            try {
                i6 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e6) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e6);
            }
        }
        return (i6 == 0 || !p(resources, i6)) ? R.drawable.sym_def_app_icon : i6;
    }

    private static Uri n(String str, h0 h0Var, Resources resources) {
        String o6 = h0Var.o();
        if (TextUtils.isEmpty(o6)) {
            return null;
        }
        if ("default".equals(o6) || resources.getIdentifier(o6, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o6);
    }

    private static String o(h0 h0Var) {
        String p6 = h0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p6)) {
            return p6;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i6) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!c.a(resources.getDrawable(i6, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i6);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i6 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(h0 h0Var) {
        return h0Var.a("google.c.a.e");
    }
}
