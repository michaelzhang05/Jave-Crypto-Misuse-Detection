package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z extends j {

    /* renamed from: A, reason: collision with root package name */
    private static String f21164A = "";

    /* renamed from: B, reason: collision with root package name */
    private static Object f21165B = null;

    /* renamed from: C, reason: collision with root package name */
    private static int f21166C = 0;

    /* renamed from: D, reason: collision with root package name */
    private static int f21167D = 0;

    /* renamed from: E, reason: collision with root package name */
    private static String f21168E = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f21169e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f21170f = "";

    /* renamed from: g, reason: collision with root package name */
    private static int f21171g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static String f21172h = "";

    /* renamed from: i, reason: collision with root package name */
    private static int f21173i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static int f21174j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static String f21175k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f21176l = -1;

    /* renamed from: m, reason: collision with root package name */
    private static String f21177m = "";

    /* renamed from: n, reason: collision with root package name */
    private static String f21178n = "";

    /* renamed from: o, reason: collision with root package name */
    private static volatile int f21179o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static String f21180p = "";

    /* renamed from: q, reason: collision with root package name */
    private static String f21181q = "";

    /* renamed from: r, reason: collision with root package name */
    private static int f21182r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static int f21183s = -1;

    /* renamed from: t, reason: collision with root package name */
    private static int f21184t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static String f21185u = "";

    /* renamed from: v, reason: collision with root package name */
    private static String f21186v = null;

    /* renamed from: w, reason: collision with root package name */
    private static int f21187w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static String f21188x = "";

    /* renamed from: y, reason: collision with root package name */
    private static int f21189y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f21190z;

    private static void A() {
        String str = Build.VERSION.RELEASE;
        String h8 = h();
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h8)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla/5.0 (Linux; Android ");
            sb.append(str);
            sb.append("; ");
            sb.append(h8);
            sb.append(" Build/");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            f21188x = sb.toString();
            return;
        }
        f21188x = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    private static long B() {
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c8 != null) {
            ActivityManager activityManager = (ActivityManager) c8.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    private static String C() {
        String str;
        if (!TextUtils.isEmpty(f21172h)) {
            return f21172h;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th2) {
                    ad.b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    ad.b("SameDiTool", th3.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = x.b(jSONObject2);
                }
                f21172h = jSONObject2;
            } else {
                f21172h = "android";
            }
        } catch (Throwable th4) {
            ad.b("SameDiTool", th4.getMessage());
        }
        return f21172h;
    }

    public static String a(Context context, int i8) {
        TelephonyManager telephonyManager;
        if (i8 == 0 || i8 == 9) {
            return "";
        }
        try {
            if (!com.mbridge.msdk.foundation.same.a.f20493z || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
                return "";
            }
            return String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static int b(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static int c(String str) {
        if (f21167D == 0) {
            f21167D = ai.f(str);
        }
        return f21167D;
    }

    public static int f() {
        try {
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        long j8 = 0;
        long longValue = ((Long) al.a(c8, "FreeRamSize", 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue <= 1800000) {
            if (f21182r == -1) {
            }
            return f21182r;
        }
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c9 != null) {
            ActivityManager activityManager = (ActivityManager) c9.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            j8 = memoryInfo.availMem;
        }
        f21182r = Long.valueOf((j8 / 1000) / 1000).intValue();
        al.b(c8, "FreeRamSize", Long.valueOf(currentTimeMillis));
        return f21182r;
    }

    public static String g() {
        if (TextUtils.isEmpty(f21188x)) {
            f(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f21188x;
    }

    public static String h() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MODEL;
    }

    public static String i() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void j() {
        try {
            Object a8 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID, "");
            Object a9 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (a8 instanceof String) {
                String str = (String) a8;
                if (!TextUtils.isEmpty(str)) {
                    e.a(str);
                }
                if (a9 instanceof Integer) {
                    e.f21119d = ((Integer) a9).intValue();
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameDiTool", e8.getMessage());
            }
        }
    }

    public static int k() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String l() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String m() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String n() {
        Context c8;
        long a8;
        long B8;
        String z8;
        String str;
        String str2;
        String str3 = "";
        try {
            c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            a8 = y.a();
            B8 = B();
            z8 = z(c8);
            str = "app_tki_" + a8 + "_" + B8 + "_" + z8;
            str2 = (String) al.a(c8, str, "");
            try {
            } catch (Exception e8) {
                e = e8;
                str3 = str2;
                e.printStackTrace();
                return str3;
            }
        } catch (Exception e9) {
            e = e9;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", z8);
            jSONObject.put("2", String.valueOf(B8));
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(a8));
            jSONObject.put("4", "");
            jSONObject.put(CampaignEx.CLICKMODE_ON, "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        str3 = C2595a.a(jSONObject.toString());
        al.b(c8, str, str3);
        return str3;
    }

    public static int o() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (f21183s < 1) {
            try {
                Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                long longValue = ((Long) al.a(c8, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue <= 1800000) {
                    if (f21183s == -1) {
                    }
                }
                f21183s = Long.valueOf((B() / 1000) / 1000).intValue();
                al.b(c8, "TotalRamSize", Long.valueOf(currentTimeMillis));
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage(), th);
            }
        }
        return f21183s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.BufferedReader] */
    public static String p() {
        FileReader fileReader;
        Throwable th;
        Exception e8;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (f21187w > 0) {
            return f21187w + "GB";
        }
        ?? r12 = "/proc/meminfo";
        f21187w = 0;
        try {
            try {
                try {
                    fileReader = new FileReader("/proc/meminfo");
                    try {
                        r12 = new BufferedReader(fileReader, 8192);
                        try {
                            String str = r12.readLine().split("\\s+")[1];
                            r12.close();
                            if (str != null) {
                                f21187w = (int) Math.ceil(new Float(Float.valueOf(str).floatValue() / 1048576.0f).doubleValue());
                            }
                            try {
                                fileReader.close();
                            } catch (IOException unused) {
                            }
                            r12.close();
                        } catch (Exception e9) {
                            e8 = e9;
                            ad.a("SameDiTool", e8.getMessage(), e8);
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (r12 != 0) {
                                r12.close();
                            }
                            return f21187w + "GB";
                        } catch (Throwable th2) {
                            th = th2;
                            ad.a("SameDiTool", th.getMessage(), th);
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (r12 != 0) {
                                r12.close();
                            }
                            return f21187w + "GB";
                        }
                    } catch (Exception e10) {
                        e8 = e10;
                        r12 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        r12 = 0;
                    }
                } finally {
                }
            } catch (Exception e11) {
                fileReader = null;
                e8 = e11;
                r12 = 0;
            } catch (Throwable th4) {
                fileReader = null;
                th = th4;
                r12 = 0;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        return f21187w + "GB";
    }

    public static int q(Context context) {
        if (context == null) {
            return f21190z;
        }
        int i8 = f21190z;
        if (i8 != 0) {
            return i8;
        }
        try {
            int i9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f21190z = i9;
            return i9;
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static int s() {
        return f21189y;
    }

    public static int t() {
        if (f21166C == 0) {
            f21166C = ai.e();
        }
        return f21166C;
    }

    public static int u() {
        return f21176l;
    }

    public static String v() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f21180p)) {
            f21180p = r() + "";
        }
        return f21180p;
    }

    private static void x(final Context context) {
        try {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        str = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                        str = null;
                    }
                    try {
                        if (!TextUtils.isEmpty(str) && !str.equals(z.f21188x)) {
                            String unused2 = z.f21188x = str;
                            z.y(context);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context) {
        try {
            al.b(context, "mbridge_ua", f21188x);
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
    }

    public static Object b(String str) {
        if (f21165B == null) {
            f21165B = ai.g(str);
        }
        return f21165B;
    }

    public static String e(Context context) {
        if (context == null) {
            return f21181q;
        }
        try {
            if (TextUtils.isEmpty(f21181q)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f21181q = str;
                return str;
            }
            return f21181q;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String s(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f21175k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f21175k = languageTag;
                return languageTag;
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage());
                f21175k = "en-US";
            }
        }
        return f21175k;
    }

    public static int u(Context context) {
        if (f21171g == -1) {
            f21171g = ai.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f21171g;
    }

    public static String w() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    private static String z(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f21170f)) {
                    f21170f = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperatorName();
                }
            } else {
                f21170f = "";
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            f21170f = "";
        }
        return f21170f;
    }

    public static void d(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e.b(context);
            } else {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.b(context);
                    }
                });
            }
        } catch (Exception e8) {
            ad.a("SameDiTool", "", e8);
        }
    }

    public static int i(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h8 = h(context);
            return h8.get("width") == null ? displayMetrics.widthPixels : ((Integer) h8.get("width")).intValue();
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static String k(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f21178n)) {
                    if (context == null) {
                        f21178n = "";
                        return f21177m;
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
                    if (ai.j(simOperator)) {
                        f21178n = simOperator.substring(Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f21178n = "";
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            f21178n = "";
        }
        return f21178n;
    }

    public static int r(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static int y() {
        if (f21173i == -1) {
            f21173i = ai.f() ? 1 : 0;
        }
        return f21173i;
    }

    public static void c(int i8) {
        f21176l = i8;
    }

    public static int g(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h8 = h(context);
            return h8.get("height") == null ? displayMetrics.heightPixels : ((Integer) h8.get("height")).intValue();
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static HashMap h(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e8) {
            ad.a("SameDiTool", e8.getMessage(), e8);
        }
        return hashMap;
    }

    public static int l(Context context) {
        try {
            final Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f21179o;
            }
            if (c8 == null) {
                return f21179o;
            }
            if (f21179o != -1) {
                try {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ConnectivityManager connectivityManager = (ConnectivityManager) c8.getSystemService("connectivity");
                                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f20493z) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    if (activeNetworkInfo == null) {
                                        int unused = z.f21179o = 0;
                                        return;
                                    }
                                    if (activeNetworkInfo.getType() == 1) {
                                        int unused2 = z.f21179o = 9;
                                        return;
                                    }
                                    TelephonyManager telephonyManager = (TelephonyManager) c8.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                                    if (telephonyManager == null) {
                                        int unused3 = z.f21179o = 0;
                                    } else {
                                        int unused4 = z.f21179o = z.b(telephonyManager.getNetworkType());
                                    }
                                }
                            } catch (Exception e8) {
                                ad.a("SameDiTool", e8.getMessage(), e8);
                                int unused5 = z.f21179o = 0;
                            }
                        }
                    };
                    if (com.mbridge.msdk.foundation.same.f.b.f().getActiveCount() < 1) {
                        com.mbridge.msdk.foundation.same.f.b.f().execute(runnable);
                    }
                } catch (Throwable th) {
                    ad.b("SameDiTool", th.getMessage());
                }
                return f21179o;
            }
            f21179o = 0;
            return f21179o;
        } catch (Exception e8) {
            ad.a("SameDiTool", e8.getMessage(), e8);
            f21179o = 0;
            return f21179o;
        }
    }

    public static String m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e8) {
            ad.a("SameDiTool", e8.getMessage(), e8);
            return "";
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return f21184t;
        }
        if (f21184t == 0) {
            try {
                f21184t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e8) {
                ad.b("SameDiTool", e8.getMessage());
            }
        }
        return f21184t;
    }

    public static String x() {
        try {
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(f21185u)) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = z.f21185u = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }).start();
            return f21185u;
        }
        return f21185u;
    }

    public static int q() {
        try {
        } catch (Exception e8) {
            f21174j = 0;
            ad.b("SameDiTool", e8.getMessage());
        }
        if (!af.a.a().a("v_a_d_p", false)) {
            return 0;
        }
        if (ai.h()) {
            f21174j = 1;
        } else if (ai.i()) {
            f21174j = 2;
        } else {
            f21174j = 0;
        }
        return f21174j;
    }

    public static boolean v(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e8) {
            ad.a("SameDiTool", e8.getMessage(), e8);
        }
        if (!TextUtils.isEmpty(f21169e)) {
            return f21169e;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f21169e = context.getPackageManager().getInstallerPackageName(str);
            ad.a("SameDiTool", "PKGSource:" + f21169e);
        }
        return f21169e;
    }

    public static void o(Context context) {
        try {
            e.a(context);
            v();
            e(context);
            p(context);
            q(context);
            r(context);
            h();
            w();
            s(context);
            x();
            com.mbridge.msdk.foundation.same.a.f20446B = false;
            com.mbridge.msdk.foundation.same.a.f20493z = ai.a("android.permission.ACCESS_NETWORK_STATE", context);
            t(context);
            C();
            e.e();
            try {
                com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.f.c.a();
                        } catch (Exception e8) {
                            ad.b("SameDiTool", e8.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage());
        }
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f21177m)) {
                    if (context == null) {
                        f21177m = "";
                        return "";
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
                    if (ai.j(simOperator)) {
                        f21177m = simOperator.substring(0, Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f21177m = "";
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            f21177m = "";
        }
        return f21177m;
    }

    public static String f(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        if (TextUtils.isEmpty(f21188x)) {
            try {
                f21188x = al.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage(), th);
            }
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper() && !MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f21188x)) {
                    try {
                        f21188x = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(f21188x)) {
                        try {
                            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                            declaredConstructor.setAccessible(true);
                            f21188x = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                            declaredConstructor.setAccessible(false);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (TextUtils.isEmpty(f21188x)) {
                            try {
                                f21188x = new WebView(context).getSettings().getUserAgentString();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        if (TextUtils.isEmpty(f21188x)) {
                            A();
                        }
                    }
                } else {
                    x(context);
                }
            } else {
                if (TextUtils.isEmpty(f21188x)) {
                    A();
                }
                x(context);
            }
        } catch (Throwable th4) {
            ad.a("SameDiTool", th4.getMessage(), th4);
        }
        y(context);
        return f21188x;
    }

    public static String n(Context context) {
        FileReader fileReader;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(f21186v)) {
            return f21186v;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    fileReader = new FileReader("/proc/meminfo");
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                        try {
                            String formatFileSize = Formatter.formatFileSize(context, Long.valueOf(bufferedReader2.readLine().split("\\s+")[1]).longValue() * 1024);
                            f21186v = formatFileSize;
                            try {
                                bufferedReader2.close();
                            } catch (IOException e8) {
                                ad.a("SameDiTool", e8.getMessage(), e8);
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e9) {
                                ad.a("SameDiTool", e9.getMessage(), e9);
                            }
                            return formatFileSize;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedReader = bufferedReader2;
                            ad.a("SameDiTool", e.getMessage(), e);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e11) {
                                    ad.a("SameDiTool", e11.getMessage(), e11);
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            ad.a("SameDiTool", th.getMessage(), th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e12) {
                                    ad.a("SameDiTool", e12.getMessage(), e12);
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                            return "";
                        }
                    } catch (IOException e13) {
                        e = e13;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e14) {
                    ad.a("SameDiTool", e14.getMessage(), e14);
                    return "";
                }
            } catch (IOException e15) {
                e = e15;
                fileReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
            }
        } finally {
        }
    }

    public static String p(Context context) {
        if (context == null) {
            return f21164A;
        }
        try {
            if (TextUtils.isEmpty(f21164A)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f21164A = str;
                return str;
            }
            return f21164A;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }
}
