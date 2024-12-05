package com.mbridge.msdk.foundation.tools;

import G.a;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f20061a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f20062b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f20063c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f20064d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f20065e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f20066f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f20067g = "";

    public static int a() {
        return f20064d;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            return TextUtils.isEmpty(f20062b) ? "" : f20062b;
        }
        if (TextUtils.isEmpty(f20062b)) {
            if (!f20063c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f20063c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            return f20062b;
        }
        return f20064d == 0 ? f20062b : "";
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            if (TextUtils.isEmpty(f20061a)) {
                return "";
            }
            return f20061a;
        }
        if (TextUtils.isEmpty(f20061a)) {
            z.j();
            if (!f20063c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f20063c = true;
            }
            if (TextUtils.isEmpty(f20061a)) {
                return "";
            }
            return f20061a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            if (f20064d != 0) {
                return "";
            }
            return f20061a;
        }
        return f20061a;
    }

    public static String d() {
        if (TextUtils.isEmpty(f20067g) && !f20066f) {
            e();
        }
        return f20067g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f20066f) {
            return f20065e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver();
                int i8 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i8);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    f20067g = jSONObject2;
                    f20065e = x.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e8) {
                ad.b("DomainSameDiTool", e8.getMessage());
            }
        } catch (Throwable th) {
            ad.b("DomainSameDiTool", th.getMessage());
        }
        f20066f = true;
        return f20065e;
    }

    public static void a(int i8) {
        f20064d = i8;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                    try {
                        a.C0045a a8 = G.a.a(context);
                        e.a(a8.a());
                        e.f20064d = a8.b() ? 1 : 0;
                        e.a(context, a8.a(), e.f20064d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a a9 = new b().a(context);
                            e.a(a9.a());
                            e.f20064d = a9.b() ? 1 : 0;
                            e.a(context, a9.a(), e.f20064d);
                        } catch (Exception unused2) {
                            ad.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th) {
                        ad.b("DomainSameDiTool", th.getMessage());
                    }
                }
            }
        }).start();
    }

    public static void a(String str) {
        f20062b = x.b(str);
        f20061a = str;
    }

    static /* synthetic */ void a(Context context, String str, int i8) {
        try {
            if (an.b(str)) {
                al.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            al.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i8));
        } catch (Exception e8) {
            ad.b("DomainSameDiTool", e8.getMessage());
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
