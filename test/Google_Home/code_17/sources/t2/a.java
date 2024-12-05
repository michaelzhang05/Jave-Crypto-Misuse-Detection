package T2;

import A2.C0947e;
import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.C0989h;
import A6.K;
import A6.Q;
import A6.n0;
import A6.r0;
import B6.o;
import O5.I;
import O5.p;
import O5.x;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import w6.l;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 0)
@w6.g
/* loaded from: classes4.dex */
public final class a {
    public static final c Companion = new c(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f9974q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final w6.b[] f9975r;

    /* renamed from: s, reason: collision with root package name */
    private static final B6.a f9976s;

    /* renamed from: a, reason: collision with root package name */
    private final String f9977a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9978b;

    /* renamed from: c, reason: collision with root package name */
    private final f f9979c;

    /* renamed from: d, reason: collision with root package name */
    private final d f9980d;

    /* renamed from: e, reason: collision with root package name */
    private final g f9981e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9982f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9983g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9984h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9985i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9986j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f9987k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f9988l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9989m;

    /* renamed from: n, reason: collision with root package name */
    private final String f9990n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f9991o;

    /* renamed from: p, reason: collision with root package name */
    private final Map f9992p;

    /* renamed from: T2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0198a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0198a f9993a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f9994b;

        static {
            C0198a c0198a = new C0198a();
            f9993a = c0198a;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.link.serialization.PopupPayload", c0198a, 16);
            c0985e0.k("publishableKey", false);
            c0985e0.k("stripeAccount", false);
            c0985e0.k("merchantInfo", false);
            c0985e0.k("customerInfo", false);
            c0985e0.k("paymentInfo", false);
            c0985e0.k("appId", false);
            c0985e0.k("locale", false);
            c0985e0.k("paymentUserAgent", false);
            c0985e0.k("paymentObject", false);
            c0985e0.k("intentMode", false);
            c0985e0.k("setupFutureUsage", false);
            c0985e0.k("flags", false);
            c0985e0.k(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, true);
            c0985e0.k("integrationType", true);
            c0985e0.k("loggerMetadata", true);
            c0985e0.k("experiments", true);
            f9994b = c0985e0;
        }

        private C0198a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f9994b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = a.f9975r;
            r0 r0Var = r0.f595a;
            return new w6.b[]{r0Var, AbstractC4193a.p(r0Var), f.C0201a.f10008a, d.C0200a.f9999a, AbstractC4193a.p(g.C0202a.f10012a), r0Var, r0Var, r0Var, r0Var, r0Var, C0989h.f567a, bVarArr[11], r0Var, r0Var, bVarArr[14], bVarArr[15]};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e5. Please report as an issue. */
        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(z6.e decoder) {
            f fVar;
            int i8;
            Map map;
            Map map2;
            g gVar;
            Map map3;
            d dVar;
            String str;
            boolean z8;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = a.f9975r;
            int i9 = 10;
            if (d8.w()) {
                String e8 = d8.e(a8, 0);
                String str10 = (String) d8.q(a8, 1, r0.f595a, null);
                f fVar2 = (f) d8.x(a8, 2, f.C0201a.f10008a, null);
                d dVar2 = (d) d8.x(a8, 3, d.C0200a.f9999a, null);
                g gVar2 = (g) d8.q(a8, 4, g.C0202a.f10012a, null);
                String e9 = d8.e(a8, 5);
                String e10 = d8.e(a8, 6);
                String e11 = d8.e(a8, 7);
                String e12 = d8.e(a8, 8);
                String e13 = d8.e(a8, 9);
                boolean f8 = d8.f(a8, 10);
                Map map4 = (Map) d8.x(a8, 11, bVarArr[11], null);
                String e14 = d8.e(a8, 12);
                String e15 = d8.e(a8, 13);
                Map map5 = (Map) d8.x(a8, 14, bVarArr[14], null);
                map = (Map) d8.x(a8, 15, bVarArr[15], null);
                map2 = map5;
                z8 = f8;
                str7 = e13;
                str5 = e11;
                str4 = e10;
                str3 = e9;
                dVar = dVar2;
                str6 = e12;
                gVar = gVar2;
                str8 = e14;
                str9 = e15;
                str = str10;
                map3 = map4;
                fVar = fVar2;
                str2 = e8;
                i8 = 65535;
            } else {
                int i10 = 15;
                f fVar3 = null;
                Map map6 = null;
                Map map7 = null;
                g gVar3 = null;
                Map map8 = null;
                d dVar3 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                int i11 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int g8 = d8.g(a8);
                    switch (g8) {
                        case -1:
                            i10 = 15;
                            z10 = false;
                        case 0:
                            str12 = d8.e(a8, 0);
                            i11 |= 1;
                            i10 = 15;
                            i9 = 10;
                        case 1:
                            str11 = (String) d8.q(a8, 1, r0.f595a, str11);
                            i11 |= 2;
                            i10 = 15;
                            i9 = 10;
                        case 2:
                            fVar3 = (f) d8.x(a8, 2, f.C0201a.f10008a, fVar3);
                            i11 |= 4;
                            i10 = 15;
                            i9 = 10;
                        case 3:
                            dVar3 = (d) d8.x(a8, 3, d.C0200a.f9999a, dVar3);
                            i11 |= 8;
                            i10 = 15;
                            i9 = 10;
                        case 4:
                            gVar3 = (g) d8.q(a8, 4, g.C0202a.f10012a, gVar3);
                            i11 |= 16;
                            i10 = 15;
                            i9 = 10;
                        case 5:
                            str13 = d8.e(a8, 5);
                            i11 |= 32;
                            i10 = 15;
                        case 6:
                            str14 = d8.e(a8, 6);
                            i11 |= 64;
                            i10 = 15;
                        case 7:
                            str15 = d8.e(a8, 7);
                            i11 |= 128;
                            i10 = 15;
                        case 8:
                            str16 = d8.e(a8, 8);
                            i11 |= 256;
                            i10 = 15;
                        case 9:
                            str17 = d8.e(a8, 9);
                            i11 |= 512;
                            i10 = 15;
                        case 10:
                            z9 = d8.f(a8, i9);
                            i11 |= 1024;
                            i10 = 15;
                        case 11:
                            map8 = (Map) d8.x(a8, 11, bVarArr[11], map8);
                            i11 |= 2048;
                            i10 = 15;
                        case 12:
                            str18 = d8.e(a8, 12);
                            i11 |= 4096;
                            i10 = 15;
                        case 13:
                            str19 = d8.e(a8, 13);
                            i11 |= 8192;
                            i10 = 15;
                        case 14:
                            map7 = (Map) d8.x(a8, 14, bVarArr[14], map7);
                            i11 |= 16384;
                            i10 = 15;
                        case 15:
                            map6 = (Map) d8.x(a8, i10, bVarArr[i10], map6);
                            i11 |= 32768;
                        default:
                            throw new l(g8);
                    }
                }
                fVar = fVar3;
                i8 = i11;
                map = map6;
                map2 = map7;
                gVar = gVar3;
                map3 = map8;
                dVar = dVar3;
                str = str11;
                z8 = z9;
                str2 = str12;
                str3 = str13;
                str4 = str14;
                str5 = str15;
                str6 = str16;
                str7 = str17;
                str8 = str18;
                str9 = str19;
            }
            d8.b(a8);
            return new a(i8, str2, str, fVar, dVar, gVar, str3, str4, str5, str6, str7, z8, map3, str8, str9, map2, map, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, a value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            a.c(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9995a = new b();

        b() {
            super(1);
        }

        public final void a(B6.d Json) {
            AbstractC3255y.i(Json, "$this$Json");
            Json.e(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B6.d) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: T2.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0199a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9996a;

            static {
                int[] iArr = new int[StripeIntent.Usage.values().length];
                try {
                    iArr[StripeIntent.Usage.f25217e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Usage.f25216d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Usage.f25215c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9996a = iArr;
            }
        }

        private c() {
        }

        private final String b(Context context) {
            Locale locale;
            LocaleList locales;
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            String country = locale.getCountry();
            AbstractC3255y.h(country, "getCountry(...)");
            return country;
        }

        private final boolean c(StripeIntent.Usage usage) {
            int i8;
            if (usage == null) {
                i8 = -1;
            } else {
                i8 = C0199a.f9996a[usage.ordinal()];
            }
            if (i8 != -1 && i8 != 1) {
                if (i8 == 2 || i8 == 3) {
                    return true;
                }
                throw new p();
            }
            return false;
        }

        private final boolean d(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return c(((n) stripeIntent).G());
            }
            if (stripeIntent instanceof u) {
                return true;
            }
            throw new p();
        }

        private final String e(N2.d dVar) {
            if (dVar.i()) {
                return "card_payment_method";
            }
            return "link_payment_method";
        }

        private final e f(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return e.f10001b;
            }
            if (stripeIntent instanceof u) {
                return e.f10002c;
            }
            throw new p();
        }

        private final g g(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                n nVar = (n) stripeIntent;
                String M8 = nVar.M();
                Long g8 = nVar.g();
                if (M8 == null || g8 == null) {
                    return null;
                }
                return new g(M8, g8.longValue());
            }
            if (stripeIntent instanceof u) {
                return null;
            }
            throw new p();
        }

        private final a h(N2.d dVar, Context context, String str, String str2, String str3) {
            f fVar = new f(dVar.h(), dVar.g());
            String b8 = dVar.a().b();
            String a8 = dVar.a().a();
            if (a8 == null) {
                a8 = b(context);
            }
            d dVar2 = new d(b8, a8);
            g g8 = g(dVar.l());
            String packageName = context.getApplicationInfo().packageName;
            AbstractC3255y.h(packageName, "packageName");
            return new a(str, str2, fVar, dVar2, g8, packageName, b(context), str3, e(dVar), f(dVar.l()).b(), d(dVar.l()), dVar.b());
        }

        public final a a(N2.d configuration, Context context, String publishableKey, String str, String paymentUserAgent) {
            AbstractC3255y.i(configuration, "configuration");
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(publishableKey, "publishableKey");
            AbstractC3255y.i(paymentUserAgent, "paymentUserAgent");
            return h(configuration, context, publishableKey, str, paymentUserAgent);
        }

        public final w6.b serializer() {
            return C0198a.f9993a;
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @StabilityInferred(parameters = 1)
    @w6.g
    /* loaded from: classes4.dex */
    public static final class d {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f9997a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9998b;

        /* renamed from: T2.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0200a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0200a f9999a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C0985e0 f10000b;

            static {
                C0200a c0200a = new C0200a();
                f9999a = c0200a;
                C0985e0 c0985e0 = new C0985e0("com.stripe.android.link.serialization.PopupPayload.CustomerInfo", c0200a, 2);
                c0985e0.k(NotificationCompat.CATEGORY_EMAIL, false);
                c0985e0.k("country", false);
                f10000b = c0985e0;
            }

            private C0200a() {
            }

            @Override // w6.b, w6.i, w6.InterfaceC4150a
            public y6.f a() {
                return f10000b;
            }

            @Override // A6.C
            public w6.b[] c() {
                return C.a.a(this);
            }

            @Override // A6.C
            public w6.b[] e() {
                r0 r0Var = r0.f595a;
                return new w6.b[]{AbstractC4193a.p(r0Var), AbstractC4193a.p(r0Var)};
            }

            @Override // w6.InterfaceC4150a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public d b(z6.e decoder) {
                String str;
                int i8;
                String str2;
                AbstractC3255y.i(decoder, "decoder");
                y6.f a8 = a();
                z6.c d8 = decoder.d(a8);
                n0 n0Var = null;
                if (d8.w()) {
                    r0 r0Var = r0.f595a;
                    str2 = (String) d8.q(a8, 0, r0Var, null);
                    str = (String) d8.q(a8, 1, r0Var, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int g8 = d8.g(a8);
                        if (g8 != -1) {
                            if (g8 != 0) {
                                if (g8 == 1) {
                                    str = (String) d8.q(a8, 1, r0.f595a, str);
                                    i9 |= 2;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                str3 = (String) d8.q(a8, 0, r0.f595a, str3);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    i8 = i9;
                    str2 = str3;
                }
                d8.b(a8);
                return new d(i8, str2, str, n0Var);
            }

            @Override // w6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void d(z6.f encoder, d value) {
                AbstractC3255y.i(encoder, "encoder");
                AbstractC3255y.i(value, "value");
                y6.f a8 = a();
                z6.d d8 = encoder.d(a8);
                d.a(value, d8, a8);
                d8.b(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final w6.b serializer() {
                return C0200a.f9999a;
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public /* synthetic */ d(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC0983d0.a(i8, 3, C0200a.f9999a.a());
            }
            this.f9997a = str;
            this.f9998b = str2;
        }

        public static final /* synthetic */ void a(d dVar, z6.d dVar2, y6.f fVar) {
            r0 r0Var = r0.f595a;
            dVar2.x(fVar, 0, r0Var, dVar.f9997a);
            dVar2.x(fVar, 1, r0Var, dVar.f9998b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3255y.d(this.f9997a, dVar.f9997a) && AbstractC3255y.d(this.f9998b, dVar.f9998b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f9997a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f9998b;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "CustomerInfo(email=" + this.f9997a + ", country=" + this.f9998b + ")";
        }

        public d(String str, String str2) {
            this.f9997a = str;
            this.f9998b = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final e f10001b = new e("Payment", 0, "payment");

        /* renamed from: c, reason: collision with root package name */
        public static final e f10002c = new e("Setup", 1, "setup");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ e[] f10003d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f10004e;

        /* renamed from: a, reason: collision with root package name */
        private final String f10005a;

        static {
            e[] a8 = a();
            f10003d = a8;
            f10004e = U5.b.a(a8);
        }

        private e(String str, int i8, String str2) {
            this.f10005a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f10001b, f10002c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f10003d.clone();
        }

        public final String b() {
            return this.f10005a;
        }
    }

    @StabilityInferred(parameters = 1)
    @w6.g
    /* loaded from: classes4.dex */
    public static final class f {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f10006a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10007b;

        /* renamed from: T2.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0201a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0201a f10008a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C0985e0 f10009b;

            static {
                C0201a c0201a = new C0201a();
                f10008a = c0201a;
                C0985e0 c0985e0 = new C0985e0("com.stripe.android.link.serialization.PopupPayload.MerchantInfo", c0201a, 2);
                c0985e0.k("businessName", false);
                c0985e0.k("country", false);
                f10009b = c0985e0;
            }

            private C0201a() {
            }

            @Override // w6.b, w6.i, w6.InterfaceC4150a
            public y6.f a() {
                return f10009b;
            }

            @Override // A6.C
            public w6.b[] c() {
                return C.a.a(this);
            }

            @Override // A6.C
            public w6.b[] e() {
                r0 r0Var = r0.f595a;
                return new w6.b[]{r0Var, AbstractC4193a.p(r0Var)};
            }

            @Override // w6.InterfaceC4150a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public f b(z6.e decoder) {
                String str;
                String str2;
                int i8;
                AbstractC3255y.i(decoder, "decoder");
                y6.f a8 = a();
                z6.c d8 = decoder.d(a8);
                n0 n0Var = null;
                if (d8.w()) {
                    str = d8.e(a8, 0);
                    str2 = (String) d8.q(a8, 1, r0.f595a, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int g8 = d8.g(a8);
                        if (g8 != -1) {
                            if (g8 != 0) {
                                if (g8 == 1) {
                                    str3 = (String) d8.q(a8, 1, r0.f595a, str3);
                                    i9 |= 2;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                str = d8.e(a8, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str2 = str3;
                    i8 = i9;
                }
                d8.b(a8);
                return new f(i8, str, str2, n0Var);
            }

            @Override // w6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void d(z6.f encoder, f value) {
                AbstractC3255y.i(encoder, "encoder");
                AbstractC3255y.i(value, "value");
                y6.f a8 = a();
                z6.d d8 = encoder.d(a8);
                f.a(value, d8, a8);
                d8.b(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final w6.b serializer() {
                return C0201a.f10008a;
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public /* synthetic */ f(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC0983d0.a(i8, 3, C0201a.f10008a.a());
            }
            this.f10006a = str;
            this.f10007b = str2;
        }

        public static final /* synthetic */ void a(f fVar, z6.d dVar, y6.f fVar2) {
            dVar.e(fVar2, 0, fVar.f10006a);
            dVar.x(fVar2, 1, r0.f595a, fVar.f10007b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (AbstractC3255y.d(this.f10006a, fVar.f10006a) && AbstractC3255y.d(this.f10007b, fVar.f10007b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f10006a.hashCode() * 31;
            String str = this.f10007b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "MerchantInfo(businessName=" + this.f10006a + ", country=" + this.f10007b + ")";
        }

        public f(String businessName, String str) {
            AbstractC3255y.i(businessName, "businessName");
            this.f10006a = businessName;
            this.f10007b = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @w6.g
    /* loaded from: classes4.dex */
    public static final class g {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f10010a;

        /* renamed from: b, reason: collision with root package name */
        private final long f10011b;

        /* renamed from: T2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0202a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0202a f10012a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C0985e0 f10013b;

            static {
                C0202a c0202a = new C0202a();
                f10012a = c0202a;
                C0985e0 c0985e0 = new C0985e0("com.stripe.android.link.serialization.PopupPayload.PaymentInfo", c0202a, 2);
                c0985e0.k("currency", false);
                c0985e0.k(RewardPlus.AMOUNT, false);
                f10013b = c0985e0;
            }

            private C0202a() {
            }

            @Override // w6.b, w6.i, w6.InterfaceC4150a
            public y6.f a() {
                return f10013b;
            }

            @Override // A6.C
            public w6.b[] c() {
                return C.a.a(this);
            }

            @Override // A6.C
            public w6.b[] e() {
                return new w6.b[]{r0.f595a, Q.f522a};
            }

            @Override // w6.InterfaceC4150a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public g b(z6.e decoder) {
                String str;
                long j8;
                int i8;
                AbstractC3255y.i(decoder, "decoder");
                y6.f a8 = a();
                z6.c d8 = decoder.d(a8);
                if (d8.w()) {
                    str = d8.e(a8, 0);
                    j8 = d8.y(a8, 1);
                    i8 = 3;
                } else {
                    String str2 = null;
                    long j9 = 0;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int g8 = d8.g(a8);
                        if (g8 != -1) {
                            if (g8 != 0) {
                                if (g8 == 1) {
                                    j9 = d8.y(a8, 1);
                                    i9 |= 2;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                str2 = d8.e(a8, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str = str2;
                    j8 = j9;
                    i8 = i9;
                }
                d8.b(a8);
                return new g(i8, str, j8, null);
            }

            @Override // w6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void d(z6.f encoder, g value) {
                AbstractC3255y.i(encoder, "encoder");
                AbstractC3255y.i(value, "value");
                y6.f a8 = a();
                z6.d d8 = encoder.d(a8);
                g.a(value, d8, a8);
                d8.b(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final w6.b serializer() {
                return C0202a.f10012a;
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public /* synthetic */ g(int i8, String str, long j8, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC0983d0.a(i8, 3, C0202a.f10012a.a());
            }
            this.f10010a = str;
            this.f10011b = j8;
        }

        public static final /* synthetic */ void a(g gVar, z6.d dVar, y6.f fVar) {
            dVar.e(fVar, 0, gVar.f10010a);
            dVar.A(fVar, 1, gVar.f10011b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (AbstractC3255y.d(this.f10010a, gVar.f10010a) && this.f10011b == gVar.f10011b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f10010a.hashCode() * 31) + androidx.collection.a.a(this.f10011b);
        }

        public String toString() {
            return "PaymentInfo(currency=" + this.f10010a + ", amount=" + this.f10011b + ")";
        }

        public g(String currency, long j8) {
            AbstractC3255y.i(currency, "currency");
            this.f10010a = currency;
            this.f10011b = j8;
        }
    }

    static {
        r0 r0Var = r0.f595a;
        f9975r = new w6.b[]{null, null, null, null, null, null, null, null, null, null, null, new K(r0Var, C0989h.f567a), null, null, new K(r0Var, r0Var), new K(r0Var, r0Var)};
        f9976s = o.b(null, b.f9995a, 1, null);
    }

    public /* synthetic */ a(int i8, String str, String str2, f fVar, d dVar, g gVar, String str3, String str4, String str5, String str6, String str7, boolean z8, Map map, String str8, String str9, Map map2, Map map3, n0 n0Var) {
        if (4095 != (i8 & 4095)) {
            AbstractC0983d0.a(i8, 4095, C0198a.f9993a.a());
        }
        this.f9977a = str;
        this.f9978b = str2;
        this.f9979c = fVar;
        this.f9980d = dVar;
        this.f9981e = gVar;
        this.f9982f = str3;
        this.f9983g = str4;
        this.f9984h = str5;
        this.f9985i = str6;
        this.f9986j = str7;
        this.f9987k = z8;
        this.f9988l = map;
        this.f9989m = (i8 & 4096) == 0 ? "mobile_pay" : str8;
        this.f9990n = (i8 & 8192) == 0 ? "mobile" : str9;
        this.f9991o = (i8 & 16384) == 0 ? P5.Q.e(x.a("mobile_session_id", C0947e.f145g.a().toString())) : map2;
        this.f9992p = (i8 & 32768) == 0 ? P5.Q.h() : map3;
    }

    public static final /* synthetic */ void c(a aVar, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f9975r;
        dVar.e(fVar, 0, aVar.f9977a);
        dVar.x(fVar, 1, r0.f595a, aVar.f9978b);
        dVar.C(fVar, 2, f.C0201a.f10008a, aVar.f9979c);
        dVar.C(fVar, 3, d.C0200a.f9999a, aVar.f9980d);
        dVar.x(fVar, 4, g.C0202a.f10012a, aVar.f9981e);
        dVar.e(fVar, 5, aVar.f9982f);
        dVar.e(fVar, 6, aVar.f9983g);
        dVar.e(fVar, 7, aVar.f9984h);
        dVar.e(fVar, 8, aVar.f9985i);
        dVar.e(fVar, 9, aVar.f9986j);
        dVar.s(fVar, 10, aVar.f9987k);
        dVar.C(fVar, 11, bVarArr[11], aVar.f9988l);
        if (dVar.p(fVar, 12) || !AbstractC3255y.d(aVar.f9989m, "mobile_pay")) {
            dVar.e(fVar, 12, aVar.f9989m);
        }
        if (dVar.p(fVar, 13) || !AbstractC3255y.d(aVar.f9990n, "mobile")) {
            dVar.e(fVar, 13, aVar.f9990n);
        }
        if (dVar.p(fVar, 14) || !AbstractC3255y.d(aVar.f9991o, P5.Q.e(x.a("mobile_session_id", C0947e.f145g.a().toString())))) {
            dVar.C(fVar, 14, bVarArr[14], aVar.f9991o);
        }
        if (dVar.p(fVar, 15) || !AbstractC3255y.d(aVar.f9992p, P5.Q.h())) {
            dVar.C(fVar, 15, bVarArr[15], aVar.f9992p);
        }
    }

    public final String b() {
        return "https://checkout.link.com/#" + Base64.encodeToString(j6.n.p(f9976s.c(Companion.serializer(), this)), 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f9977a, aVar.f9977a) && AbstractC3255y.d(this.f9978b, aVar.f9978b) && AbstractC3255y.d(this.f9979c, aVar.f9979c) && AbstractC3255y.d(this.f9980d, aVar.f9980d) && AbstractC3255y.d(this.f9981e, aVar.f9981e) && AbstractC3255y.d(this.f9982f, aVar.f9982f) && AbstractC3255y.d(this.f9983g, aVar.f9983g) && AbstractC3255y.d(this.f9984h, aVar.f9984h) && AbstractC3255y.d(this.f9985i, aVar.f9985i) && AbstractC3255y.d(this.f9986j, aVar.f9986j) && this.f9987k == aVar.f9987k && AbstractC3255y.d(this.f9988l, aVar.f9988l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f9977a.hashCode() * 31;
        String str = this.f9978b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f9979c.hashCode()) * 31) + this.f9980d.hashCode()) * 31;
        g gVar = this.f9981e;
        if (gVar != null) {
            i8 = gVar.hashCode();
        }
        return ((((((((((((((hashCode3 + i8) * 31) + this.f9982f.hashCode()) * 31) + this.f9983g.hashCode()) * 31) + this.f9984h.hashCode()) * 31) + this.f9985i.hashCode()) * 31) + this.f9986j.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f9987k)) * 31) + this.f9988l.hashCode();
    }

    public String toString() {
        return "PopupPayload(publishableKey=" + this.f9977a + ", stripeAccount=" + this.f9978b + ", merchantInfo=" + this.f9979c + ", customerInfo=" + this.f9980d + ", paymentInfo=" + this.f9981e + ", appId=" + this.f9982f + ", locale=" + this.f9983g + ", paymentUserAgent=" + this.f9984h + ", paymentObject=" + this.f9985i + ", intentMode=" + this.f9986j + ", setupFutureUsage=" + this.f9987k + ", flags=" + this.f9988l + ")";
    }

    public a(String publishableKey, String str, f merchantInfo, d customerInfo, g gVar, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean z8, Map flags) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(merchantInfo, "merchantInfo");
        AbstractC3255y.i(customerInfo, "customerInfo");
        AbstractC3255y.i(appId, "appId");
        AbstractC3255y.i(locale, "locale");
        AbstractC3255y.i(paymentUserAgent, "paymentUserAgent");
        AbstractC3255y.i(paymentObject, "paymentObject");
        AbstractC3255y.i(intentMode, "intentMode");
        AbstractC3255y.i(flags, "flags");
        this.f9977a = publishableKey;
        this.f9978b = str;
        this.f9979c = merchantInfo;
        this.f9980d = customerInfo;
        this.f9981e = gVar;
        this.f9982f = appId;
        this.f9983g = locale;
        this.f9984h = paymentUserAgent;
        this.f9985i = paymentObject;
        this.f9986j = intentMode;
        this.f9987k = z8;
        this.f9988l = flags;
        this.f9989m = "mobile_pay";
        this.f9990n = "mobile";
        this.f9991o = P5.Q.e(x.a("mobile_session_id", C0947e.f145g.a().toString()));
        this.f9992p = P5.Q.h();
    }
}
