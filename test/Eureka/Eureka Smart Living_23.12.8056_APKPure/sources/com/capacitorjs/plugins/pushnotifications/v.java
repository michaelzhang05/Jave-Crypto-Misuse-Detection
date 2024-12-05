package com.capacitorjs.plugins.pushnotifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.l0;
import com.getcapacitor.v0;
import com.getcapacitor.w0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class v {

    /* renamed from: d, reason: collision with root package name */
    private static String f4246d = "id";

    /* renamed from: e, reason: collision with root package name */
    private static String f4247e = "name";

    /* renamed from: f, reason: collision with root package name */
    private static String f4248f = "description";

    /* renamed from: g, reason: collision with root package name */
    private static String f4249g = "importance";

    /* renamed from: h, reason: collision with root package name */
    private static String f4250h = "visibility";

    /* renamed from: i, reason: collision with root package name */
    private static String f4251i = "sound";

    /* renamed from: j, reason: collision with root package name */
    private static String f4252j = "vibration";

    /* renamed from: k, reason: collision with root package name */
    private static String f4253k = "lights";

    /* renamed from: l, reason: collision with root package name */
    private static String f4254l = "lightColor";

    /* renamed from: a, reason: collision with root package name */
    private Context f4255a;

    /* renamed from: b, reason: collision with root package name */
    private NotificationManager f4256b;

    /* renamed from: c, reason: collision with root package name */
    private w0 f4257c;

    public v(Context context, NotificationManager notificationManager, w0 w0Var) {
        this.f4255a = context;
        this.f4256b = notificationManager;
        this.f4257c = w0Var;
    }

    public void a(j0 j0Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.a();
            NotificationChannel a6 = k.a(j0Var.getString(f4246d), j0Var.getString(f4247e), j0Var.d(f4249g).intValue());
            a6.setDescription(j0Var.getString(f4248f));
            a6.setLockscreenVisibility(j0Var.d(f4250h).intValue());
            a6.enableVibration(j0Var.b(f4252j).booleanValue());
            a6.enableLights(j0Var.b(f4253k).booleanValue());
            String string = j0Var.getString(f4254l);
            if (string != null) {
                try {
                    a6.setLightColor(a1.e.a(string));
                } catch (IllegalArgumentException unused) {
                    l0.d(l0.k("NotificationChannel"), "Invalid color provided for light color.", null);
                }
            }
            String h6 = j0Var.h(f4251i, null);
            if (h6 != null && !h6.isEmpty()) {
                if (h6.contains(".")) {
                    h6 = h6.substring(0, h6.lastIndexOf(46));
                }
                a6.setSound(Uri.parse("android.resource://" + this.f4255a.getPackageName() + "/raw/" + h6), new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            }
            this.f4256b.createNotificationChannel(a6);
        }
    }

    public void b(v0 v0Var) {
        String str;
        if (Build.VERSION.SDK_INT < 26) {
            v0Var.z();
            return;
        }
        j0 j0Var = new j0();
        if (v0Var.n(f4246d) != null) {
            String str2 = f4246d;
            j0Var.m(str2, v0Var.n(str2));
            if (v0Var.n(f4247e) != null) {
                String str3 = f4247e;
                j0Var.m(str3, v0Var.n(str3));
                String str4 = f4249g;
                j0Var.put(str4, v0Var.j(str4, 3));
                String str5 = f4248f;
                j0Var.m(str5, v0Var.o(str5, ""));
                String str6 = f4250h;
                j0Var.put(str6, v0Var.j(str6, 1));
                String str7 = f4251i;
                j0Var.m(str7, v0Var.o(str7, null));
                String str8 = f4252j;
                Boolean bool = Boolean.FALSE;
                j0Var.put(str8, v0Var.f(str8, bool));
                String str9 = f4253k;
                j0Var.put(str9, v0Var.f(str9, bool));
                String str10 = f4254l;
                j0Var.m(str10, v0Var.o(str10, null));
                a(j0Var);
                v0Var.w();
                return;
            }
            str = "Channel missing name";
        } else {
            str = "Channel missing identifier";
        }
        v0Var.r(str);
    }

    public void c(v0 v0Var) {
        if (Build.VERSION.SDK_INT < 26) {
            v0Var.z();
            return;
        }
        this.f4256b.deleteNotificationChannel(v0Var.n("id"));
        v0Var.w();
    }

    public void d(v0 v0Var) {
        List notificationChannels;
        String id;
        CharSequence name;
        String description;
        int importance;
        int lockscreenVisibility;
        Uri sound;
        boolean shouldVibrate;
        boolean shouldShowLights;
        int lightColor;
        int lockscreenVisibility2;
        int importance2;
        if (Build.VERSION.SDK_INT < 26) {
            v0Var.z();
            return;
        }
        notificationChannels = this.f4256b.getNotificationChannels();
        g0 g0Var = new g0();
        Iterator it = notificationChannels.iterator();
        while (it.hasNext()) {
            NotificationChannel a6 = d.a(it.next());
            j0 j0Var = new j0();
            String str = f4246d;
            id = a6.getId();
            j0Var.m(str, id);
            String str2 = f4247e;
            name = a6.getName();
            j0Var.put(str2, name);
            String str3 = f4248f;
            description = a6.getDescription();
            j0Var.m(str3, description);
            String str4 = f4249g;
            importance = a6.getImportance();
            j0Var.put(str4, importance);
            String str5 = f4250h;
            lockscreenVisibility = a6.getLockscreenVisibility();
            j0Var.put(str5, lockscreenVisibility);
            String str6 = f4251i;
            sound = a6.getSound();
            j0Var.put(str6, sound);
            String str7 = f4252j;
            shouldVibrate = a6.shouldVibrate();
            j0Var.put(str7, shouldVibrate);
            String str8 = f4253k;
            shouldShowLights = a6.shouldShowLights();
            j0Var.put(str8, shouldShowLights);
            String str9 = f4254l;
            lightColor = a6.getLightColor();
            j0Var.m(str9, String.format("#%06X", Integer.valueOf(16777215 & lightColor)));
            String k6 = l0.k("NotificationChannel");
            StringBuilder sb = new StringBuilder();
            sb.append("visibility ");
            lockscreenVisibility2 = a6.getLockscreenVisibility();
            sb.append(lockscreenVisibility2);
            l0.b(k6, sb.toString());
            String k7 = l0.k("NotificationChannel");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("importance ");
            importance2 = a6.getImportance();
            sb2.append(importance2);
            l0.b(k7, sb2.toString());
            g0Var.put(j0Var);
        }
        j0 j0Var2 = new j0();
        j0Var2.put("channels", g0Var);
        v0Var.x(j0Var2);
    }
}
