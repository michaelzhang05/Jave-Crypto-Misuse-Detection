package M2;

import A2.d;
import L5.I;
import L5.p;
import L5.t;
import L5.x;
import M2.d;
import M2.e;
import M5.Q;
import P5.g;
import X5.n;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h6.C2758a;
import h6.EnumC2761d;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.util.Map;
import k3.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;
import r2.f;
import t2.AbstractC3783d;
import t2.C3785f;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: g, reason: collision with root package name */
    private static final C0139a f6866g = new C0139a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f6867h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f6868a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f6869b;

    /* renamed from: c, reason: collision with root package name */
    private final i f6870c;

    /* renamed from: d, reason: collision with root package name */
    private final g f6871d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3684d f6872e;

    /* renamed from: f, reason: collision with root package name */
    private final A2.d f6873f;

    /* renamed from: M2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0139a {
        private C0139a() {
        }

        public /* synthetic */ C0139a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6874a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.f6911a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.f6912b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.f6913c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6874a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f6875a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f6877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f6878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Map map, P5.d dVar2) {
            super(2, dVar2);
            this.f6877c = dVar;
            this.f6878d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f6877c, this.f6878d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f6875a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = a.this.f6868a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f6869b;
                d dVar = this.f6877c;
                Map map = this.f6878d;
                if (map == null) {
                    map = Q.h();
                }
                interfaceC3873c.a(paymentAnalyticsRequestFactory.g(dVar, map));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i errorReporter, g workContext, InterfaceC3684d logger, A2.d durationProvider) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(durationProvider, "durationProvider");
        this.f6868a = analyticsRequestExecutor;
        this.f6869b = paymentAnalyticsRequestFactory;
        this.f6870c = errorReporter;
        this.f6871d = workContext;
        this.f6872e = logger;
        this.f6873f = durationProvider;
    }

    private final Map o(C2758a c2758a) {
        if (c2758a != null) {
            return Q.e(x.a(TypedValues.TransitionType.S_DURATION, Float.valueOf((float) C2758a.G(c2758a.L(), EnumC2761d.f31419e))));
        }
        return null;
    }

    private final void p(d dVar, Map map) {
        this.f6872e.b("Link event: " + dVar.a() + " " + map);
        AbstractC2829k.d(N.a(this.f6871d), null, null, new c(dVar, map, null), 3, null);
    }

    static /* synthetic */ void q(a aVar, d dVar, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        aVar.p(dVar, map);
    }

    private final String r(e.a aVar) {
        int i8 = b.f6874a[aVar.ordinal()];
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

    @Override // M2.e
    public void a(boolean z8) {
        p(d.i.f6903a, o(this.f6873f.a(d.b.f80c)));
    }

    @Override // M2.e
    public void b(boolean z8) {
        d.a.a(this.f6873f, d.b.f80c, false, 2, null);
        q(this, d.l.f6909a, null, 2, null);
    }

    @Override // M2.e
    public void c(e.a state) {
        AbstractC3159y.i(state, "state");
        Map e8 = Q.e(x.a("sessionState", r(state)));
        i.b.a(this.f6870c, i.f.f33430f, null, null, 6, null);
        p(d.k.f6907a, e8);
    }

    @Override // M2.e
    public void d() {
        q(this, d.b.f6889a, null, 2, null);
    }

    @Override // M2.e
    public void e() {
        q(this, d.f.f6897a, null, 2, null);
    }

    @Override // M2.e
    public void f(Throwable error) {
        AbstractC3159y.i(error, "error");
        p(d.c.f6891a, Q.e(x.a("error_message", AbstractC3783d.a(error))));
    }

    @Override // M2.e
    public void g() {
        q(this, d.e.f6895a, null, 2, null);
    }

    @Override // M2.e
    public void h(boolean z8, Throwable error) {
        f d8;
        String j8;
        AbstractC3159y.i(error, "error");
        Map map = null;
        if ((error instanceof C3785f) && (d8 = ((C3785f) error).d()) != null && (j8 = d8.j()) != null) {
            map = Q.e(x.a("error_message", j8));
        }
        if (map == null) {
            map = Q.e(x.a("error_message", AbstractC3783d.a(error)));
        }
        p(d.j.f6905a, Q.q(map, i.f33394a.c(error)));
    }

    @Override // M2.e
    public void i(Throwable error) {
        AbstractC3159y.i(error, "error");
        p(d.a.f6887a, Q.q(Q.e(x.a("error_message", AbstractC3783d.a(error))), i.f33394a.c(error)));
    }

    @Override // M2.e
    public void j() {
        q(this, d.h.f6901a, null, 2, null);
    }

    @Override // M2.e
    public void k() {
        q(this, d.g.f6899a, null, 2, null);
    }

    @Override // M2.e
    public void l() {
        q(this, d.C0140d.f6893a, null, 2, null);
    }
}
