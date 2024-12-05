package e5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import f5.AbstractC2838c;
import f5.C2840e;
import f5.k;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2802a {

    /* renamed from: i, reason: collision with root package name */
    public static final C0731a f31779i = new C0731a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f31780a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31781b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31782c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31783d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31786g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31787h;

    /* renamed from: e5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0731a {
        public C0731a(AbstractC3247p abstractC3247p) {
        }
    }

    /* renamed from: e5.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f31788a = Build.MODEL;

        /* renamed from: b, reason: collision with root package name */
        public final String f31789b = Build.MANUFACTURER;

        /* renamed from: c, reason: collision with root package name */
        public final String f31790c = Build.BRAND;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            String str = this.f31788a;
            if (str != null && str.length() != 0) {
                jSONObject.put("model", this.f31788a);
            }
            String str2 = this.f31789b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("manufacturer", this.f31789b);
            }
            String str3 = this.f31790c;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("brand", this.f31790c);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        }
    }

    public C2802a(Context context, String token) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(token, "token");
        this.f31780a = token;
        this.f31781b = -1L;
        this.f31782c = -1L;
        this.f31781b = new C2840e(context).a();
        String country = Locale.getDefault().getCountry();
        this.f31783d = country;
        if (country == null || country.length() == 0) {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            this.f31783d = ((TelephonyManager) systemService).getNetworkCountryIso();
        }
        k kVar = k.f31966a;
        String packageName = context.getPackageName();
        AbstractC3255y.h(packageName, "context.packageName");
        this.f31784e = kVar.a(context, packageName);
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            String packageName2 = context.getPackageName();
            AbstractC3255y.h(packageName2, "context.packageName");
            PackageInfo a8 = AbstractC2838c.a(packageManager, packageName2, 0);
            this.f31782c = kVar.e(a8);
            if (kVar.g(a8)) {
                this.f31786g = 1;
            } else {
                this.f31786g = 0;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
        }
        long j8 = this.f31782c;
        long j9 = this.f31781b;
        if (j8 > j9) {
            if (j9 == -1) {
                this.f31785f = 0;
            } else {
                this.f31785f = 1;
            }
        } else {
            this.f31785f = 0;
        }
        this.f31787h = Locale.getDefault().getLanguage();
    }

    public final JSONObject a(Context context) {
        boolean z8;
        AbstractC3255y.i(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f31780a);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        String str = this.f31783d;
        if (str != null && str.length() != 0) {
            String str2 = this.f31783d;
            AbstractC3255y.f(str2);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            jSONObject.put("countryCode", upperCase);
        }
        String str3 = this.f31784e;
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("installer", this.f31784e);
        }
        jSONObject.put("update", this.f31785f);
        jSONObject.put("isSystemApp", this.f31786g);
        JSONObject a8 = new b().a();
        if (a8 != null) {
            jSONObject.put("device", a8);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (strArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : strArr) {
                    jSONArray.put(str4);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("abis", jSONArray);
                }
            }
        }
        String str5 = this.f31787h;
        if (str5 != null && str5.length() != 0) {
            jSONObject.put("deviceLanguageCode", this.f31787h);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            jSONObject.put("identifier", string);
        }
        return jSONObject;
    }
}
