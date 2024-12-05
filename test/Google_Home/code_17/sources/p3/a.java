package P3;

import B3.f;
import M3.G;
import M3.InterfaceC1324t;
import O5.C1352h;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b3.C1970d;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.B;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.h;
import com.stripe.android.paymentsheet.i;
import com.stripe.android.paymentsheet.j;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e3.EnumC2791e;
import h4.P;
import h4.Q;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o2.InterfaceC3515b;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;
import t3.C4028b;
import w3.C4145a;

/* loaded from: classes4.dex */
public abstract class a extends ViewModel {

    /* renamed from: A, reason: collision with root package name */
    public static final b f8740A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f8741B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final u.g f8742a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f8743b;

    /* renamed from: c, reason: collision with root package name */
    private final K3.c f8744c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f8745d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f8746e;

    /* renamed from: f, reason: collision with root package name */
    private final h f8747f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1324t.a f8748g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3515b.a f8749h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8750i;

    /* renamed from: j, reason: collision with root package name */
    private final w f8751j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3698L f8752k;

    /* renamed from: l, reason: collision with root package name */
    private final C3.b f8753l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f8754m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f8755n;

    /* renamed from: o, reason: collision with root package name */
    private final w f8756o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3698L f8757p;

    /* renamed from: q, reason: collision with root package name */
    private final w f8758q;

    /* renamed from: r, reason: collision with root package name */
    private final i f8759r;

    /* renamed from: s, reason: collision with root package name */
    private final w f8760s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f8761t;

    /* renamed from: u, reason: collision with root package name */
    private final w f8762u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3698L f8763v;

    /* renamed from: w, reason: collision with root package name */
    private final C4145a f8764w;

    /* renamed from: x, reason: collision with root package name */
    private final C4028b f8765x;

    /* renamed from: y, reason: collision with root package name */
    private final B f8766y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3698L f8767z;

    /* renamed from: P3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0169a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f8768a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0170a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f8770a;

            C0170a(a aVar) {
                this.f8770a = aVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C3.c cVar, S5.d dVar) {
                this.f8770a.b();
                return I.f8278a;
            }
        }

        C0169a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0169a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f8768a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f q8 = AbstractC3708h.q(a.this.r().f(), 1);
                C0170a c0170a = new C0170a(a.this);
                this.f8768a = 1;
                if (q8.collect(c0170a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0169a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return a.this.o();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8772a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0171a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0171a f8773a = new C0171a();

            C0171a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(G g8) {
                boolean z8 = false;
                if (g8 != null && g8.g()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(C3.c currentScreen) {
            AbstractC3255y.i(currentScreen, "currentScreen");
            return y4.g.m(currentScreen.o(), C0171a.f8773a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8774a = new e();

        e() {
            super(2);
        }

        public final Boolean a(boolean z8, boolean z9) {
            boolean z10;
            if (!z8 && !z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {
        f() {
            super(1);
        }

        public final void a(C3.c poppedScreen) {
            AbstractC3255y.i(poppedScreen, "poppedScreen");
            a.this.c().h(poppedScreen);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3.c) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f8776a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0172a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f8778a;

            C0172a(a aVar) {
                this.f8778a = aVar;
            }

            public final Object a(boolean z8, S5.d dVar) {
                this.f8778a.f8762u.setValue(kotlin.coroutines.jvm.internal.b.a(z8));
                return I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f8776a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L t8 = ((Q) a.this.j().getValue()).t();
                C0172a c0172a = new C0172a(a.this);
                this.f8776a = 1;
                if (t8.collect(c0172a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(u.g config, EventReporter eventReporter, K3.c customerRepository, S5.g workContext, SavedStateHandle savedStateHandle, h linkHandler, InterfaceC1324t.a editInteractorFactory, InterfaceC3515b.a cardAccountRangeRepositoryFactory, boolean z8) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(customerRepository, "customerRepository");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(linkHandler, "linkHandler");
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.f8742a = config;
        this.f8743b = eventReporter;
        this.f8744c = customerRepository;
        this.f8745d = workContext;
        this.f8746e = savedStateHandle;
        this.f8747f = linkHandler;
        this.f8748g = editInteractorFactory;
        this.f8749h = cardAccountRangeRepositoryFactory;
        this.f8750i = z8;
        w a8 = AbstractC3700N.a(null);
        this.f8751j = a8;
        this.f8752k = a8;
        C3.b bVar = new C3.b(ViewModelKt.getViewModelScope(this), new f());
        this.f8753l = bVar;
        this.f8754m = savedStateHandle.getStateFlow("selection", null);
        InterfaceC3698L stateFlow = savedStateHandle.getStateFlow("processing", Boolean.FALSE);
        this.f8755n = stateFlow;
        w a9 = AbstractC3700N.a(null);
        this.f8756o = a9;
        this.f8757p = a9;
        this.f8758q = AbstractC3700N.a(null);
        this.f8759r = i.f27072g.a(this);
        w a10 = AbstractC3700N.a(new Q(new P(), y4.g.n(EnumC2791e.f31452w), null, false, 12, null));
        this.f8760s = a10;
        this.f8761t = a10;
        w a11 = AbstractC3700N.a(Boolean.TRUE);
        this.f8762u = a11;
        this.f8763v = a11;
        this.f8764w = new C4145a(savedStateHandle, eventReporter, bVar.f(), ViewModelKt.getViewModelScope(this), new c());
        this.f8765x = C4028b.f39626f.a(this);
        this.f8766y = B.f26425u.a(this);
        this.f8767z = y4.g.d(stateFlow, y4.g.l(bVar.f(), d.f8772a), e.f8774a);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new C0169a(null), 3, null);
    }

    private final void K(B3.f fVar) {
        EnumC2791e enumC2791e;
        if (fVar instanceof f.C0009f) {
            f.C0009f c0009f = (f.C0009f) fVar;
            if (c0009f.r().f25467e == o.p.f25587i) {
                w wVar = this.f8760s;
                P p8 = new P();
                o.g gVar = c0009f.r().f25470h;
                if (gVar == null || (enumC2791e = gVar.f25530a) == null) {
                    enumC2791e = EnumC2791e.f31452w;
                }
                wVar.setValue(new Q(p8, y4.g.n(enumC2791e), null, false, 12, null));
                AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
            }
        }
    }

    public abstract InterfaceC3698L A();

    public final S5.g B() {
        return this.f8745d;
    }

    public final void C() {
        if (((Boolean) this.f8755n.getValue()).booleanValue()) {
            return;
        }
        if (this.f8753l.e()) {
            this.f8753l.i();
        } else {
            H();
        }
    }

    public abstract void D(f.e.d dVar);

    public abstract void E(B3.f fVar);

    public final boolean F() {
        return this.f8750i;
    }

    public abstract void G(B2.b bVar);

    public abstract void H();

    public abstract void I(j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(C1970d c1970d) {
        this.f8751j.setValue(c1970d);
    }

    public final void L(PrimaryButton.a state) {
        AbstractC3255y.i(state, "state");
        this.f8756o.setValue(state);
    }

    public final void M(B3.f fVar) {
        if (fVar instanceof f.e) {
            I(new j.b((f.e) fVar));
        } else if (fVar instanceof f.b) {
            I(new j.a((f.b) fVar));
        }
        this.f8746e.set("selection", fVar);
        K(fVar);
        b();
    }

    public abstract void b();

    public final C4145a c() {
        return this.f8764w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3698L d() {
        return this.f8767z;
    }

    public final InterfaceC3515b.a e() {
        return this.f8749h;
    }

    public final u.g f() {
        return this.f8742a;
    }

    public final w g() {
        return this.f8758q;
    }

    public final K3.c h() {
        return this.f8744c;
    }

    public final C4028b i() {
        return this.f8765x;
    }

    public final InterfaceC3698L j() {
        return this.f8761t;
    }

    public final InterfaceC3698L k() {
        return this.f8763v;
    }

    public final InterfaceC1324t.a l() {
        return this.f8748g;
    }

    public abstract InterfaceC3698L m();

    public final EventReporter n() {
        return this.f8743b;
    }

    public final String o() {
        String b8;
        j s8 = s();
        if (s8 == null || (b8 = s8.b()) == null) {
            Object value = this.f8752k.getValue();
            AbstractC3255y.f(value);
            return (String) AbstractC1378t.m0(((C1970d) value).h0());
        }
        return b8;
    }

    public final h p() {
        return this.f8747f;
    }

    public final i q() {
        return this.f8759r;
    }

    public final C3.b r() {
        return this.f8753l;
    }

    public abstract j s();

    public final InterfaceC3698L t() {
        return this.f8752k;
    }

    public abstract InterfaceC3698L u();

    public final InterfaceC3698L v() {
        return this.f8755n;
    }

    public final B w() {
        return this.f8766y;
    }

    public final SavedStateHandle x() {
        return this.f8746e;
    }

    public final InterfaceC3698L y() {
        return this.f8754m;
    }

    public abstract InterfaceC3698L z();
}
