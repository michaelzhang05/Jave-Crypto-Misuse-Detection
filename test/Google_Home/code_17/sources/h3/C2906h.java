package h3;

import O5.r;
import O5.x;
import P5.Q;
import android.os.Build;
import android.util.DisplayMetrics;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2906h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f32169g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f32170h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayMetrics f32171a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32172b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32173c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32174d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32175e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32176f;

    /* renamed from: h3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            int convert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (convert % 60 == 0) {
                return String.valueOf(convert / 60);
            }
            String bigDecimal = new BigDecimal(convert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            AbstractC3255y.h(bigDecimal, "toString(...)");
            return bigDecimal;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2906h(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        AbstractC3255y.i(displayMetrics, "displayMetrics");
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(timeZone, "timeZone");
        this.f32171a = displayMetrics;
        this.f32172b = packageName;
        this.f32173c = str;
        this.f32174d = timeZone;
        this.f32175e = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.f32176f = "Android " + Build.VERSION.RELEASE + " " + Build.VERSION.CODENAME + " " + Build.VERSION.SDK_INT;
    }

    private final Map a() {
        String locale = Locale.getDefault().toString();
        AbstractC3255y.h(locale, "toString(...)");
        return Q.k(x.a("c", d(locale)), x.a("d", d(this.f32176f)), x.a("f", d(this.f32175e)), x.a("g", d(this.f32174d)));
    }

    private final Map c(C2902d c2902d) {
        String str;
        String str2;
        Map map = null;
        if (c2902d != null) {
            str = c2902d.b();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        r a8 = x.a("d", str);
        if (c2902d != null) {
            str2 = c2902d.h();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        Map k8 = Q.k(a8, x.a("e", str3), x.a("k", this.f32172b), x.a("o", Build.VERSION.RELEASE), x.a(TtmlNode.TAG_P, Integer.valueOf(Build.VERSION.SDK_INT)), x.a(CampaignEx.JSON_KEY_AD_Q, Build.MANUFACTURER), x.a(CampaignEx.JSON_KEY_AD_R, Build.BRAND), x.a("s", Build.MODEL), x.a("t", Build.TAGS));
        String str4 = this.f32173c;
        if (str4 != null) {
            map = Q.e(x.a("l", str4));
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }

    private final Map d(String str) {
        return Q.e(x.a("v", str));
    }

    public final /* synthetic */ Map b(C2902d c2902d) {
        return Q.k(x.a("v2", 1), x.a("tag", "20.49.0"), x.a("src", "android-sdk"), x.a("a", a()), x.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, c(c2902d)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2906h(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "getDisplayMetrics(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            java.lang.String r1 = r4.getPackageName()
            if (r1 != 0) goto L1a
            java.lang.String r1 = ""
        L1a:
            D2.a r2 = D2.a.f1776a
            android.content.pm.PackageInfo r4 = r2.a(r4)
            if (r4 == 0) goto L25
            java.lang.String r4 = r4.versionName
            goto L26
        L25:
            r4 = 0
        L26:
            h3.h$a r2 = h3.C2906h.f32169g
            java.lang.String r2 = h3.C2906h.a.a(r2)
            r3.<init>(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C2906h.<init>(android.content.Context):void");
    }
}