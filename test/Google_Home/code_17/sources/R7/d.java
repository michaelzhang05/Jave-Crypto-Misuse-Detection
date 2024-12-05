package R7;

import H6.f;
import K7.g;
import O7.j;
import O7.k;
import O7.m;
import O7.o;
import O7.q;
import O7.s;
import O7.u;
import O7.v;
import O7.w;
import O7.x;
import P7.l;
import android.app.Application;
import android.net.ConnectivityManager;
import androidx.core.os.ConfigurationCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import u1.C4053a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public static k f9660A;

    /* renamed from: B, reason: collision with root package name */
    public static s f9661B;

    /* renamed from: b, reason: collision with root package name */
    public static Application f9663b;

    /* renamed from: c, reason: collision with root package name */
    public static N7.a f9664c;

    /* renamed from: e, reason: collision with root package name */
    public static M7.b f9666e;

    /* renamed from: f, reason: collision with root package name */
    public static M7.c f9667f;

    /* renamed from: g, reason: collision with root package name */
    public static B5.s f9668g;

    /* renamed from: h, reason: collision with root package name */
    public static f f9669h;

    /* renamed from: i, reason: collision with root package name */
    public static SharedStorage f9670i;

    /* renamed from: j, reason: collision with root package name */
    public static N7.b f9671j;

    /* renamed from: k, reason: collision with root package name */
    public static g f9672k;

    /* renamed from: l, reason: collision with root package name */
    public static J5.c f9673l;

    /* renamed from: m, reason: collision with root package name */
    public static F6.a f9674m;

    /* renamed from: o, reason: collision with root package name */
    public static C4053a f9676o;

    /* renamed from: p, reason: collision with root package name */
    public static P7.c f9677p;

    /* renamed from: q, reason: collision with root package name */
    public static q f9678q;

    /* renamed from: r, reason: collision with root package name */
    public static O7.c f9679r;

    /* renamed from: s, reason: collision with root package name */
    public static O7.f f9680s;

    /* renamed from: t, reason: collision with root package name */
    public static j f9681t;

    /* renamed from: u, reason: collision with root package name */
    public static u f9682u;

    /* renamed from: v, reason: collision with root package name */
    public static w f9683v;

    /* renamed from: w, reason: collision with root package name */
    public static m f9684w;

    /* renamed from: x, reason: collision with root package name */
    public static o f9685x;

    /* renamed from: y, reason: collision with root package name */
    public static O7.g f9686y;

    /* renamed from: z, reason: collision with root package name */
    public static O7.a f9687z;

    /* renamed from: a, reason: collision with root package name */
    public static final d f9662a = new d();

    /* renamed from: d, reason: collision with root package name */
    public static ChoiceStyle f9665d = new ChoiceStyle();

    /* renamed from: n, reason: collision with root package name */
    public static String f9675n = "";

    public final Locale a() {
        if (f9663b != null) {
            Locale locale = ConfigurationCompat.getLocales(b().getResources().getConfiguration()).get(0);
            if (locale == null) {
                locale = Locale.US;
            }
            AbstractC3255y.h(locale, "{\n            Configurat…0] ?: Locale.US\n        }");
            return locale;
        }
        Locale locale2 = Locale.US;
        AbstractC3255y.h(locale2, "{\n            Locale.US\n        }");
        return locale2;
    }

    public final Application b() {
        Application application = f9663b;
        if (application != null) {
            return application;
        }
        AbstractC3255y.y(MimeTypes.BASE_TYPE_APPLICATION);
        return null;
    }

    public final O7.f c() {
        if (f9680s == null) {
            f9680s = new O7.f(m(), n(), ChoiceCmp.INSTANCE.getCallback());
        }
        O7.f fVar = f9680s;
        if (fVar == null) {
            AbstractC3255y.y("consentRepository_");
            return null;
        }
        return fVar;
    }

    public final P7.c d() {
        if (f9677p == null) {
            f9677p = new P7.c();
        }
        P7.c cVar = f9677p;
        if (cVar == null) {
            AbstractC3255y.y("coreUiLabelsResolver");
            return null;
        }
        return cVar;
    }

    public final J5.c e() {
        J5.c cVar = f9673l;
        if (cVar == null) {
            return new J5.c(null, null, null, 7);
        }
        return cVar;
    }

    public final j f() {
        if (f9681t == null) {
            f9681t = new j(m(), ChoiceCmp.INSTANCE.getCallback());
        }
        j jVar = f9681t;
        if (jVar == null) {
            AbstractC3255y.y("gbcConsentRepository_");
            return null;
        }
        return jVar;
    }

    public final C4053a g() {
        if (f9676o == null) {
            f9676o = new C4053a();
        }
        C4053a c4053a = f9676o;
        if (c4053a == null) {
            AbstractC3255y.y("gppModel");
            return null;
        }
        return c4053a;
    }

    public final F6.a h() {
        F6.a aVar = f9674m;
        if (aVar == null) {
            return new F6.a(null, null, null, null, 15);
        }
        return aVar;
    }

    public final N7.a i() {
        if (f9664c == null) {
            Object systemService = b().getSystemService("connectivity");
            if (systemService != null) {
                f9664c = new N7.a((ConnectivityManager) systemService);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }
        N7.a aVar = f9664c;
        if (aVar == null) {
            AbstractC3255y.y("networkUtil_");
            return null;
        }
        return aVar;
    }

    public final f j() {
        f fVar = f9669h;
        if (fVar == null) {
            return new f(null, null, null, null, null, null, 63);
        }
        return fVar;
    }

    public final u k() {
        if (f9682u == null) {
            N7.a i8 = i();
            SharedStorage m8 = m();
            N7.b l8 = l();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f9682u = new v(i8, m8, l8, new l(choiceCmp.getCallback(), d()), choiceCmp.getAppPackageId(), choiceCmp.getPCode());
        }
        u uVar = f9682u;
        if (uVar == null) {
            AbstractC3255y.y("portalConfigRepository_");
            return null;
        }
        return uVar;
    }

    public final N7.b l() {
        if (f9671j == null) {
            f9671j = new N7.c();
        }
        N7.b bVar = f9671j;
        if (bVar == null) {
            AbstractC3255y.y("requestApi_");
            return null;
        }
        return bVar;
    }

    public final SharedStorage m() {
        if (f9670i == null) {
            f9670i = new SharedStorage(b());
        }
        SharedStorage sharedStorage = f9670i;
        if (sharedStorage == null) {
            AbstractC3255y.y("storage_");
            return null;
        }
        return sharedStorage;
    }

    public final B5.s n() {
        if (f9668g == null) {
            f9668g = new B5.s(null);
        }
        B5.s sVar = f9668g;
        if (sVar == null) {
            AbstractC3255y.y("tcModel");
            return null;
        }
        return sVar;
    }

    public final g o() {
        H6.a aVar;
        if (f9672k == null) {
            B5.s n8 = n();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f portalConfig$app_release = choiceCmp.getPortalConfig$app_release();
            if (portalConfig$app_release == null) {
                aVar = null;
            } else {
                aVar = portalConfig$app_release.f3925b;
            }
            f9672k = new g(n8, aVar, i(), l(), choiceCmp.getCallback(), choiceCmp.getAppPackageId());
        }
        g gVar = f9672k;
        if (gVar == null) {
            AbstractC3255y.y("tracking");
            return null;
        }
        return gVar;
    }

    public final w p() {
        if (f9683v == null) {
            f9683v = new x(a(), i(), m(), l(), new P7.m(d()));
        }
        w wVar = f9683v;
        if (wVar == null) {
            AbstractC3255y.y("translationsTextRepository_");
            return null;
        }
        return wVar;
    }
}
