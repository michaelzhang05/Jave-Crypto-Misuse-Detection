package a5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3237f;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a5.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1647n {

    /* renamed from: a, reason: collision with root package name */
    private String f14274a;

    /* renamed from: b, reason: collision with root package name */
    private String f14275b;

    /* renamed from: c, reason: collision with root package name */
    private String f14276c;

    /* renamed from: d, reason: collision with root package name */
    private String f14277d;

    /* renamed from: e, reason: collision with root package name */
    private String f14278e;

    /* renamed from: f, reason: collision with root package name */
    private String f14279f;

    /* renamed from: g, reason: collision with root package name */
    private String f14280g;

    /* renamed from: h, reason: collision with root package name */
    private int f14281h;

    /* renamed from: i, reason: collision with root package name */
    private int f14282i;

    /* renamed from: j, reason: collision with root package name */
    private int f14283j;

    /* renamed from: k, reason: collision with root package name */
    private float f14284k;

    /* renamed from: l, reason: collision with root package name */
    private String f14285l;

    /* renamed from: m, reason: collision with root package name */
    private long f14286m;

    /* renamed from: n, reason: collision with root package name */
    private String[] f14287n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f14288o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f14289p;

    /* renamed from: q, reason: collision with root package name */
    private String f14290q;

    /* renamed from: r, reason: collision with root package name */
    private int f14291r;

    /* renamed from: s, reason: collision with root package name */
    private String f14292s;

    /* renamed from: t, reason: collision with root package name */
    private int f14293t;

    public final String a() {
        String str = this.f14274a + this.f14281h;
        if (this.f14275b != null) {
            str = str + this.f14275b;
        }
        if (this.f14277d != null) {
            str = str + this.f14277d;
        }
        return Q4.d.f9161a.c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.equals(com.mbridge.msdk.MBridgeConstans.ENDCARD_URL_TYPE_PL) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r5)
            java.lang.String r5 = "success"
            boolean r1 = r0.isNull(r5)
            r2 = 0
            if (r1 != 0) goto L6f
            int r5 = r0.getInt(r5)
            r1 = 1
            if (r5 != r1) goto L6f
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r0.getJSONObject(r5)
            java.lang.String r0 = "sdk"
            boolean r3 = r5.isNull(r0)
            if (r3 != 0) goto L31
            int r3 = r4.f14281h
            int r0 = r5.getInt(r0)
            if (r3 != r0) goto L31
            r2 = 1
        L31:
            if (r2 == 0) goto L6f
            java.lang.String r0 = "userID"
            boolean r1 = r5.isNull(r0)
            r2 = 0
            if (r1 != 0) goto L48
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L49
        L48:
            r0 = r2
        L49:
            o5.k r1 = new o5.k
            r1.<init>()
            java.lang.String r3 = r4.f14275b
            boolean r0 = r1.s(r0, r3)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "language"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L62
            java.lang.String r2 = r5.getString(r0)
        L62:
            o5.k r5 = new o5.k
            r5.<init>()
            java.lang.String r0 = r4.f14277d
            boolean r2 = r5.s(r2, r0)
            goto L6f
        L6e:
            r2 = r0
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C1647n.b(java.lang.String):boolean");
    }

    public final String c() {
        return this.f14276c;
    }

    public final String d() {
        return this.f14274a;
    }

    public final boolean e(C1648o download) {
        AbstractC3255y.i(download, "download");
        if (download.b0() == null || this.f14287n == null) {
            return true;
        }
        String b02 = download.b0();
        AbstractC3255y.f(b02);
        String[] strArr = (String[]) new j6.j(",").i(b02, 0).toArray(new String[0]);
        String[] strArr2 = this.f14287n;
        AbstractC3255y.f(strArr2);
        for (String str : strArr2) {
            for (String str2 : strArr) {
                if (j6.n.s(str2, "universal", true) || j6.n.s(str, str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(C1648o download) {
        AbstractC3255y.i(download, "download");
        if (download.c0() != null) {
            ArrayList c02 = download.c0();
            AbstractC3255y.f(c02);
            if (c02.size() > 0) {
                ArrayList c03 = download.c0();
                AbstractC3255y.f(c03);
                Iterator it = c03.iterator();
                while (it.hasNext()) {
                    String density = (String) it.next();
                    AbstractC3255y.h(density, "density");
                    if (Integer.parseInt(density) == this.f14293t || Integer.parseInt(density) == 65534 || Integer.parseInt(density) == 65535) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean g(C1648o download) {
        AbstractC3255y.i(download, "download");
        if (download.W() <= this.f14281h) {
            return true;
        }
        return false;
    }

    public final void h(Context context) {
        String str;
        AbstractC3255y.i(context, "context");
        this.f14274a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Q e8 = Q.f14058k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            this.f14275b = e8.getId();
        } else {
            this.f14275b = null;
        }
        this.f14281h = Build.VERSION.SDK_INT;
        if (new J4.a(context).l()) {
            this.f14291r = 1;
        }
    }

    public final void i(Context context) {
        AbstractC3255y.i(context, "context");
        h(context);
        this.f14282i = context.getResources().getDisplayMetrics().widthPixels;
        this.f14283j = context.getResources().getDisplayMetrics().heightPixels;
        this.f14284k = context.getResources().getDisplayMetrics().density;
        this.f14293t = context.getResources().getDisplayMetrics().densityDpi;
        this.f14276c = Locale.getDefault().getCountry();
        this.f14277d = Locale.getDefault().getLanguage();
        this.f14278e = Build.BRAND;
        this.f14280g = Build.MANUFACTURER;
        this.f14279f = Build.MODEL;
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        this.f14285l = telephonyManager.getNetworkOperatorName();
        String str = this.f14276c;
        if (str == null || str.length() == 0) {
            this.f14276c = telephonyManager.getNetworkCountryIso();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService2 = context.getSystemService("activity");
            AbstractC3255y.g(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            this.f14286m = memoryInfo.totalMem;
        } catch (Error e8) {
            e8.getMessage();
        } catch (Exception e9) {
            e9.getMessage();
        }
        this.f14287n = Build.SUPPORTED_ABIS;
        this.f14288o = Build.SUPPORTED_32_BIT_ABIS;
        this.f14289p = Build.SUPPORTED_64_BIT_ABIS;
        this.f14290q = context.getString(R.string.version, context.getString(R.string.app_name), "6.28", "628");
        this.f14292s = Build.HARDWARE;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f14274a);
        jSONObject.put("userID", this.f14275b);
        jSONObject.put("country", this.f14276c);
        jSONObject.put("language", this.f14277d);
        jSONObject.put("brand", this.f14278e);
        jSONObject.put("model", this.f14279f);
        jSONObject.put("manufacturer", this.f14280g);
        int i8 = this.f14281h;
        if (i8 > 0) {
            jSONObject.put("sdk", i8);
        }
        int i9 = this.f14282i;
        if (i9 > 0) {
            jSONObject.put("displayWidth", i9);
        }
        int i10 = this.f14283j;
        if (i10 > 0) {
            jSONObject.put("displayHeight", i10);
        }
        float f8 = this.f14284k;
        if (f8 > 0.0f) {
            jSONObject.put("displayDensity", f8);
        }
        long j8 = this.f14286m;
        if (j8 > 0) {
            jSONObject.put("ram", j8);
        }
        jSONObject.put("operador", this.f14285l);
        String[] strArr = this.f14287n;
        if (strArr != null && strArr.length != 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator a8 = AbstractC3237f.a(strArr);
            while (a8.hasNext()) {
                jSONArray.put((String) a8.next());
            }
            jSONObject.put("supportedABIs", jSONArray);
        }
        String[] strArr2 = this.f14288o;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator a9 = AbstractC3237f.a(strArr2);
            while (a9.hasNext()) {
                jSONArray2.put((String) a9.next());
            }
            jSONObject.put("supported32BitsABIs", jSONArray2);
        }
        String[] strArr3 = this.f14289p;
        if (strArr3 != null && strArr3.length != 0) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator a10 = AbstractC3237f.a(strArr3);
            while (a10.hasNext()) {
                jSONArray3.put((String) a10.next());
            }
            jSONObject.put("supported64BitsABIs", jSONArray3);
        }
        jSONObject.put("appVersion", this.f14290q);
        jSONObject.put("rooted", this.f14291r);
        return jSONObject;
    }

    public String toString() {
        return "DeviceInfo(identifier=" + this.f14274a + ", userId=" + this.f14275b + ", country=" + this.f14276c + ", language=" + this.f14277d + ", brand=" + this.f14278e + ", model=" + this.f14279f + ", manufacturer=" + this.f14280g + ", sdk=" + this.f14281h + ", displayWidth=" + this.f14282i + ", displayHeight=" + this.f14283j + ", displayDensity=" + this.f14284k + ", operador=" + this.f14285l + ", ram=" + this.f14286m + ", supportedAbis=" + Arrays.toString(this.f14287n) + ", supported32BitsAbis=" + Arrays.toString(this.f14288o) + ", supported64BitsAbis=" + Arrays.toString(this.f14289p) + ", appVersion=" + this.f14290q + ", rooted=" + this.f14291r + ", hardware=" + this.f14292s + ')';
    }
}
