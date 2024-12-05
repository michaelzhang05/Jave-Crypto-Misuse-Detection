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
    public static volatile String f21116a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f21117b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21118c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f21119d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f21120e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f21121f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f21122g = "";

    public static int a() {
        return f21119d;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            return TextUtils.isEmpty(f21117b) ? "" : f21117b;
        }
        if (TextUtils.isEmpty(f21117b)) {
            if (!f21118c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f21118c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            return f21117b;
        }
        return f21119d == 0 ? f21117b : "";
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            if (TextUtils.isEmpty(f21116a)) {
                return "";
            }
            return f21116a;
        }
        if (TextUtils.isEmpty(f21116a)) {
            z.j();
            if (!f21118c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f21118c = true;
            }
            if (TextUtils.isEmpty(f21116a)) {
                return "";
            }
            return f21116a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            if (f21119d != 0) {
                return "";
            }
            return f21116a;
        }
        return f21116a;
    }

    public static String d() {
        if (TextUtils.isEmpty(f21122g) && !f21121f) {
            e();
        }
        return f21122g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f21121f) {
            return f21120e;
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
                    f21122g = jSONObject2;
                    f21120e = x.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e8) {
                ad.b("DomainSameDiTool", e8.getMessage());
            }
        } catch (Throwable th) {
            ad.b("DomainSameDiTool", th.getMessage());
        }
        f21121f = true;
        return f21120e;
    }

    public static void a(int i8) {
        f21119d = i8;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                    try {
                        a.C0050a a8 = G.a.a(context);
                        e.a(a8.a());
                        e.f21119d = a8.b() ? 1 : 0;
                        e.a(context, a8.a(), e.f21119d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a a9 = new b().a(context);
                            e.a(a9.a());
                            e.f21119d = a9.b() ? 1 : 0;
                            e.a(context, a9.a(), e.f21119d);
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
        f21117b = x.b(str);
        f21116a = str;
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
