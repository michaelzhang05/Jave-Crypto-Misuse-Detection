package O7;

import E6.f;
import H7.g;
import L7.j;
import L7.k;
import L7.m;
import L7.o;
import L7.q;
import L7.s;
import L7.u;
import L7.v;
import L7.w;
import L7.x;
import M7.l;
import android.app.Application;
import android.net.ConnectivityManager;
import androidx.core.os.ConfigurationCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import r1.C3680a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public static k f7804A;

    /* renamed from: B, reason: collision with root package name */
    public static s f7805B;

    /* renamed from: b, reason: collision with root package name */
    public static Application f7807b;

    /* renamed from: c, reason: collision with root package name */
    public static K7.a f7808c;

    /* renamed from: e, reason: collision with root package name */
    public static J7.b f7810e;

    /* renamed from: f, reason: collision with root package name */
    public static J7.c f7811f;

    /* renamed from: g, reason: collision with root package name */
    public static y5.s f7812g;

    /* renamed from: h, reason: collision with root package name */
    public static f f7813h;

    /* renamed from: i, reason: collision with root package name */
    public static SharedStorage f7814i;

    /* renamed from: j, reason: collision with root package name */
    public static K7.b f7815j;

    /* renamed from: k, reason: collision with root package name */
    public static g f7816k;

    /* renamed from: l, reason: collision with root package name */
    public static G5.c f7817l;

    /* renamed from: m, reason: collision with root package name */
    public static C6.a f7818m;

    /* renamed from: o, reason: collision with root package name */
    public static C3680a f7820o;

    /* renamed from: p, reason: collision with root package name */
    public static M7.c f7821p;

    /* renamed from: q, reason: collision with root package name */
    public static q f7822q;

    /* renamed from: r, reason: collision with root package name */
    public static L7.c f7823r;

    /* renamed from: s, reason: collision with root package name */
    public static L7.f f7824s;

    /* renamed from: t, reason: collision with root package name */
    public static j f7825t;

    /* renamed from: u, reason: collision with root package name */
    public static u f7826u;

    /* renamed from: v, reason: collision with root package name */
    public static w f7827v;

    /* renamed from: w, reason: collision with root package name */
    public static m f7828w;

    /* renamed from: x, reason: collision with root package name */
    public static o f7829x;

    /* renamed from: y, reason: collision with root package name */
    public static L7.g f7830y;

    /* renamed from: z, reason: collision with root package name */
    public static L7.a f7831z;

    /* renamed from: a, reason: collision with root package name */
    public static final d f7806a = new d();

    /* renamed from: d, reason: collision with root package name */
    public static ChoiceStyle f7809d = new ChoiceStyle();

    /* renamed from: n, reason: collision with root package name */
    public static String f7819n = "";

    public final Locale a() {
        if (f7807b != null) {
            Locale locale = ConfigurationCompat.getLocales(b().getResources().getConfiguration()).get(0);
            if (locale == null) {
                locale = Locale.US;
            }
            AbstractC3159y.h(locale, "{\n            Configurat…0] ?: Locale.US\n        }");
            return locale;
        }
        Locale locale2 = Locale.US;
        AbstractC3159y.h(locale2, "{\n            Locale.US\n        }");
        return locale2;
    }

    public final Application b() {
        Application application = f7807b;
        if (application != null) {
            return application;
        }
        AbstractC3159y.y(MimeTypes.BASE_TYPE_APPLICATION);
        return null;
    }

    public final L7.f c() {
        if (f7824s == null) {
            f7824s = new L7.f(m(), n(), ChoiceCmp.INSTANCE.getCallback());
        }
        L7.f fVar = f7824s;
        if (fVar == null) {
            AbstractC3159y.y("consentRepository_");
            return null;
        }
        return fVar;
    }

    public final M7.c d() {
        if (f7821p == null) {
            f7821p = new M7.c();
        }
        M7.c cVar = f7821p;
        if (cVar == null) {
            AbstractC3159y.y("coreUiLabelsResolver");
            return null;
        }
        return cVar;
    }

    public final G5.c e() {
        G5.c cVar = f7817l;
        if (cVar == null) {
            return new G5.c(null, null, null, 7);
        }
        return cVar;
    }

    public final j f() {
        if (f7825t == null) {
            f7825t = new j(m(), ChoiceCmp.INSTANCE.getCallback());
        }
        j jVar = f7825t;
        if (jVar == null) {
            AbstractC3159y.y("gbcConsentRepository_");
            return null;
        }
        return jVar;
    }

    public final C3680a g() {
        if (f7820o == null) {
            f7820o = new C3680a();
        }
        C3680a c3680a = f7820o;
        if (c3680a == null) {
            AbstractC3159y.y("gppModel");
            return null;
        }
        return c3680a;
    }

    public final C6.a h() {
        C6.a aVar = f7818m;
        if (aVar == null) {
            return new C6.a(null, null, null, null, 15);
        }
        return aVar;
    }

    public final K7.a i() {
        if (f7808c == null) {
            Object systemService = b().getSystemService("connectivity");
            if (systemService != null) {
                f7808c = new K7.a((ConnectivityManager) systemService);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }
        K7.a aVar = f7808c;
        if (aVar == null) {
            AbstractC3159y.y("networkUtil_");
            return null;
        }
        return aVar;
    }

    public final f j() {
        f fVar = f7813h;
        if (fVar == null) {
            return new f(null, null, null, null, null, null, 63);
        }
        return fVar;
    }

    public final u k() {
        if (f7826u == null) {
            K7.a i8 = i();
            SharedStorage m8 = m();
            K7.b l8 = l();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f7826u = new v(i8, m8, l8, new l(choiceCmp.getCallback(), d()), choiceCmp.getAppPackageId(), choiceCmp.getPCode());
        }
        u uVar = f7826u;
        if (uVar == null) {
            AbstractC3159y.y("portalConfigRepository_");
            return null;
        }
        return uVar;
    }

    public final K7.b l() {
        if (f7815j == null) {
            f7815j = new K7.c();
        }
        K7.b bVar = f7815j;
        if (bVar == null) {
            AbstractC3159y.y("requestApi_");
            return null;
        }
        return bVar;
    }

    public final SharedStorage m() {
        if (f7814i == null) {
            f7814i = new SharedStorage(b());
        }
        SharedStorage sharedStorage = f7814i;
        if (sharedStorage == null) {
            AbstractC3159y.y("storage_");
            return null;
        }
        return sharedStorage;
    }

    public final y5.s n() {
        if (f7812g == null) {
            f7812g = new y5.s(null);
        }
        y5.s sVar = f7812g;
        if (sVar == null) {
            AbstractC3159y.y("tcModel");
            return null;
        }
        return sVar;
    }

    public final g o() {
        E6.a aVar;
        if (f7816k == null) {
            y5.s n8 = n();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f portalConfig$app_release = choiceCmp.getPortalConfig$app_release();
            if (portalConfig$app_release == null) {
                aVar = null;
            } else {
                aVar = portalConfig$app_release.f2375b;
            }
            f7816k = new g(n8, aVar, i(), l(), choiceCmp.getCallback(), choiceCmp.getAppPackageId());
        }
        g gVar = f7816k;
        if (gVar == null) {
            AbstractC3159y.y("tracking");
            return null;
        }
        return gVar;
    }

    public final w p() {
        if (f7827v == null) {
            f7827v = new x(a(), i(), m(), l(), new M7.m(d()));
        }
        w wVar = f7827v;
        if (wVar == null) {
            AbstractC3159y.y("translationsTextRepository_");
            return null;
        }
        return wVar;
    }
}
