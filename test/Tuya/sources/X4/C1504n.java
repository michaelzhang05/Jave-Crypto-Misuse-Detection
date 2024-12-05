package X4;

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
import kotlin.jvm.internal.AbstractC3141f;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X4.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1504n {

    /* renamed from: a, reason: collision with root package name */
    private String f12653a;

    /* renamed from: b, reason: collision with root package name */
    private String f12654b;

    /* renamed from: c, reason: collision with root package name */
    private String f12655c;

    /* renamed from: d, reason: collision with root package name */
    private String f12656d;

    /* renamed from: e, reason: collision with root package name */
    private String f12657e;

    /* renamed from: f, reason: collision with root package name */
    private String f12658f;

    /* renamed from: g, reason: collision with root package name */
    private String f12659g;

    /* renamed from: h, reason: collision with root package name */
    private int f12660h;

    /* renamed from: i, reason: collision with root package name */
    private int f12661i;

    /* renamed from: j, reason: collision with root package name */
    private int f12662j;

    /* renamed from: k, reason: collision with root package name */
    private float f12663k;

    /* renamed from: l, reason: collision with root package name */
    private String f12664l;

    /* renamed from: m, reason: collision with root package name */
    private long f12665m;

    /* renamed from: n, reason: collision with root package name */
    private String[] f12666n;

    /* renamed from: o, reason: collision with root package name */
    private String[] f12667o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f12668p;

    /* renamed from: q, reason: collision with root package name */
    private String f12669q;

    /* renamed from: r, reason: collision with root package name */
    private int f12670r;

    /* renamed from: s, reason: collision with root package name */
    private String f12671s;

    /* renamed from: t, reason: collision with root package name */
    private int f12672t;

    public final String a() {
        String str = this.f12653a + this.f12660h;
        if (this.f12654b != null) {
            str = str + this.f12654b;
        }
        if (this.f12656d != null) {
            str = str + this.f12656d;
        }
        return N4.d.f7201a.c(str);
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
            kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
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
            int r3 = r4.f12660h
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
            l5.k r1 = new l5.k
            r1.<init>()
            java.lang.String r3 = r4.f12654b
            boolean r0 = r1.s(r0, r3)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "language"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L62
            java.lang.String r2 = r5.getString(r0)
        L62:
            l5.k r5 = new l5.k
            r5.<init>()
            java.lang.String r0 = r4.f12656d
            boolean r2 = r5.s(r2, r0)
            goto L6f
        L6e:
            r2 = r0
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.C1504n.b(java.lang.String):boolean");
    }

    public final String c() {
        return this.f12655c;
    }

    public final String d() {
        return this.f12653a;
    }

    public final boolean e(C1505o download) {
        AbstractC3159y.i(download, "download");
        if (download.b0() == null || this.f12666n == null) {
            return true;
        }
        String b02 = download.b0();
        AbstractC3159y.f(b02);
        String[] strArr = (String[]) new g6.j(",").j(b02, 0).toArray(new String[0]);
        String[] strArr2 = this.f12666n;
        AbstractC3159y.f(strArr2);
        for (String str : strArr2) {
            for (String str2 : strArr) {
                if (g6.n.s(str2, "universal", true) || g6.n.s(str, str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(C1505o download) {
        AbstractC3159y.i(download, "download");
        if (download.c0() != null) {
            ArrayList c02 = download.c0();
            AbstractC3159y.f(c02);
            if (c02.size() > 0) {
                ArrayList c03 = download.c0();
                AbstractC3159y.f(c03);
                Iterator it = c03.iterator();
                while (it.hasNext()) {
                    String density = (String) it.next();
                    AbstractC3159y.h(density, "density");
                    if (Integer.parseInt(density) == this.f12672t || Integer.parseInt(density) == 65534 || Integer.parseInt(density) == 65535) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean g(C1505o download) {
        AbstractC3159y.i(download, "download");
        if (download.V() <= this.f12660h) {
            return true;
        }
        return false;
    }

    public final void h(Context context) {
        String str;
        AbstractC3159y.i(context, "context");
        this.f12653a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Q e8 = Q.f12437k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            this.f12654b = e8.getId();
        } else {
            this.f12654b = null;
        }
        this.f12660h = Build.VERSION.SDK_INT;
        if (new G4.a(context).l()) {
            this.f12670r = 1;
        }
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        h(context);
        this.f12661i = context.getResources().getDisplayMetrics().widthPixels;
        this.f12662j = context.getResources().getDisplayMetrics().heightPixels;
        this.f12663k = context.getResources().getDisplayMetrics().density;
        this.f12672t = context.getResources().getDisplayMetrics().densityDpi;
        this.f12655c = Locale.getDefault().getCountry();
        this.f12656d = Locale.getDefault().getLanguage();
        this.f12657e = Build.BRAND;
        this.f12659g = Build.MANUFACTURER;
        this.f12658f = Build.MODEL;
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        this.f12664l = telephonyManager.getNetworkOperatorName();
        String str = this.f12655c;
        if (str == null || str.length() == 0) {
            this.f12655c = telephonyManager.getNetworkCountryIso();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService2 = context.getSystemService("activity");
            AbstractC3159y.g(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            this.f12665m = memoryInfo.totalMem;
        } catch (Error e8) {
            e8.getMessage();
        } catch (Exception e9) {
            e9.getMessage();
        }
        this.f12666n = Build.SUPPORTED_ABIS;
        this.f12667o = Build.SUPPORTED_32_BIT_ABIS;
        this.f12668p = Build.SUPPORTED_64_BIT_ABIS;
        this.f12669q = context.getString(R.string.version, context.getString(R.string.app_name), "6.27", "627");
        this.f12671s = Build.HARDWARE;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f12653a);
        jSONObject.put("userID", this.f12654b);
        jSONObject.put("country", this.f12655c);
        jSONObject.put("language", this.f12656d);
        jSONObject.put("brand", this.f12657e);
        jSONObject.put("model", this.f12658f);
        jSONObject.put("manufacturer", this.f12659g);
        int i8 = this.f12660h;
        if (i8 > 0) {
            jSONObject.put("sdk", i8);
        }
        int i9 = this.f12661i;
        if (i9 > 0) {
            jSONObject.put("displayWidth", i9);
        }
        int i10 = this.f12662j;
        if (i10 > 0) {
            jSONObject.put("displayHeight", i10);
        }
        float f8 = this.f12663k;
        if (f8 > 0.0f) {
            jSONObject.put("displayDensity", f8);
        }
        long j8 = this.f12665m;
        if (j8 > 0) {
            jSONObject.put("ram", j8);
        }
        jSONObject.put("operador", this.f12664l);
        String[] strArr = this.f12666n;
        if (strArr != null && strArr.length != 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator a8 = AbstractC3141f.a(strArr);
            while (a8.hasNext()) {
                jSONArray.put((String) a8.next());
            }
            jSONObject.put("supportedABIs", jSONArray);
        }
        String[] strArr2 = this.f12667o;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator a9 = AbstractC3141f.a(strArr2);
            while (a9.hasNext()) {
                jSONArray2.put((String) a9.next());
            }
            jSONObject.put("supported32BitsABIs", jSONArray2);
        }
        String[] strArr3 = this.f12668p;
        if (strArr3 != null && strArr3.length != 0) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator a10 = AbstractC3141f.a(strArr3);
            while (a10.hasNext()) {
                jSONArray3.put((String) a10.next());
            }
            jSONObject.put("supported64BitsABIs", jSONArray3);
        }
        jSONObject.put("appVersion", this.f12669q);
        jSONObject.put("rooted", this.f12670r);
        return jSONObject;
    }

    public String toString() {
        return "DeviceInfo(identifier=" + this.f12653a + ", userId=" + this.f12654b + ", country=" + this.f12655c + ", language=" + this.f12656d + ", brand=" + this.f12657e + ", model=" + this.f12658f + ", manufacturer=" + this.f12659g + ", sdk=" + this.f12660h + ", displayWidth=" + this.f12661i + ", displayHeight=" + this.f12662j + ", displayDensity=" + this.f12663k + ", operador=" + this.f12664l + ", ram=" + this.f12665m + ", supportedAbis=" + Arrays.toString(this.f12666n) + ", supported32BitsAbis=" + Arrays.toString(this.f12667o) + ", supported64BitsAbis=" + Arrays.toString(this.f12668p) + ", appVersion=" + this.f12669q + ", rooted=" + this.f12670r + ", hardware=" + this.f12671s + ')';
    }
}
