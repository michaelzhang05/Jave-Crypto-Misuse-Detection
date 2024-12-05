package P2;

import A2.InterfaceC0945c;
import D2.d;
import O5.I;
import O5.p;
import O5.t;
import O5.x;
import P2.d;
import P2.e;
import P5.Q;
import S5.g;
import a6.InterfaceC1668n;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import n3.i;
import u2.InterfaceC4057d;
import u2.f;
import w2.AbstractC4137d;
import w2.C4139f;

/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: g, reason: collision with root package name */
    private static final C0167a f8690g = new C0167a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f8691h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f8692a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f8693b;

    /* renamed from: c, reason: collision with root package name */
    private final i f8694c;

    /* renamed from: d, reason: collision with root package name */
    private final g f8695d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4057d f8696e;

    /* renamed from: f, reason: collision with root package name */
    private final D2.d f8697f;

    /* renamed from: P2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0167a {
        private C0167a() {
        }

        public /* synthetic */ C0167a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8698a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.f8735a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.f8736b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.f8737c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8698a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f8699a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f8701c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f8702d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Map map, S5.d dVar2) {
            super(2, dVar2);
            this.f8701c = dVar;
            this.f8702d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f8701c, this.f8702d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f8699a == 0) {
                t.b(obj);
                InterfaceC0945c interfaceC0945c = a.this.f8692a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f8693b;
                d dVar = this.f8701c;
                Map map = this.f8702d;
                if (map == null) {
                    map = Q.h();
                }
                interfaceC0945c.a(paymentAnalyticsRequestFactory.g(dVar, map));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i errorReporter, g workContext, InterfaceC4057d logger, D2.d durationProvider) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(durationProvider, "durationProvider");
        this.f8692a = analyticsRequestExecutor;
        this.f8693b = paymentAnalyticsRequestFactory;
        this.f8694c = errorReporter;
        this.f8695d = workContext;
        this.f8696e = logger;
        this.f8697f = durationProvider;
    }

    private final Map o(C3225a c3225a) {
        if (c3225a != null) {
            return Q.e(x.a(TypedValues.TransitionType.S_DURATION, Float.valueOf((float) C3225a.K(c3225a.P(), EnumC3228d.f34141e))));
        }
        return null;
    }

    private final void p(d dVar, Map map) {
        this.f8696e.b("Link event: " + dVar.a() + " " + map);
        AbstractC3364k.d(N.a(this.f8695d), null, null, new c(dVar, map, null), 3, null);
    }

    static /* synthetic */ void q(a aVar, d dVar, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        aVar.p(dVar, map);
    }

    private final String r(e.a aVar) {
        int i8 = b.f8698a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return "verified";
                }
                throw new p();
            }
            return "requiresVerification";
        }
        return "requiresSignUp";
    }

    @Override // P2.e
    public void a(boolean z8) {
        p(d.i.f8727a, o(this.f8697f.a(d.b.f1782c)));
    }

    @Override // P2.e
    public void b(boolean z8) {
        d.a.a(this.f8697f, d.b.f1782c, false, 2, null);
        q(this, d.l.f8733a, null, 2, null);
    }

    @Override // P2.e
    public void c() {
        q(this, d.b.f8713a, null, 2, null);
    }

    @Override // P2.e
    public void d() {
        q(this, d.f.f8721a, null, 2, null);
    }

    @Override // P2.e
    public void e(Throwable error) {
        AbstractC3255y.i(error, "error");
        p(d.c.f8715a, Q.e(x.a("error_message", AbstractC4137d.a(error))));
    }

    @Override // P2.e
    public void f() {
        q(this, d.e.f8719a, null, 2, null);
    }

    @Override // P2.e
    public void g(boolean z8, Throwable error) {
        f d8;
        String i8;
        AbstractC3255y.i(error, "error");
        Map map = null;
        if ((error instanceof C4139f) && (d8 = ((C4139f) error).d()) != null && (i8 = d8.i()) != null) {
            map = Q.e(x.a("error_message", i8));
        }
        if (map == null) {
            map = Q.e(x.a("error_message", AbstractC4137d.a(error)));
        }
        p(d.j.f8729a, Q.q(map, i.f35386a.c(error)));
    }

    @Override // P2.e
    public void h(e.a state) {
        AbstractC3255y.i(state, "state");
        Map e8 = Q.e(x.a("sessionState", r(state)));
        i.b.a(this.f8694c, i.f.f35422f, null, null, 6, null);
        p(d.k.f8731a, e8);
    }

    @Override // P2.e
    public void i(Throwable error) {
        AbstractC3255y.i(error, "error");
        p(d.a.f8711a, Q.q(Q.e(x.a("error_message", AbstractC4137d.a(error))), i.f35386a.c(error)));
    }

    @Override // P2.e
    public void j() {
        q(this, d.h.f8725a, null, 2, null);
    }

    @Override // P2.e
    public void k() {
        q(this, d.g.f8723a, null, 2, null);
    }

    @Override // P2.e
    public void l() {
        q(this, d.C0168d.f8717a, null, 2, null);
    }
}
