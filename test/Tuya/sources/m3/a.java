package M3;

import J3.G;
import J3.InterfaceC1211t;
import L5.C1224h;
import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X5.n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.B;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.h;
import com.stripe.android.paymentsheet.i;
import com.stripe.android.paymentsheet.j;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e4.P;
import e4.Q;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;
import q3.C3649b;
import t3.C3791a;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.C4020b;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public abstract class a extends ViewModel {

    /* renamed from: A, reason: collision with root package name */
    public static final b f6916A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f6917B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final u.g f6918a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f6919b;

    /* renamed from: c, reason: collision with root package name */
    private final H3.c f6920c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f6921d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f6922e;

    /* renamed from: f, reason: collision with root package name */
    private final h f6923f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1211t.a f6924g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3167b.a f6925h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6926i;

    /* renamed from: j, reason: collision with root package name */
    private final v f6927j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f6928k;

    /* renamed from: l, reason: collision with root package name */
    private final C4020b f6929l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f6930m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f6931n;

    /* renamed from: o, reason: collision with root package name */
    private final v f6932o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f6933p;

    /* renamed from: q, reason: collision with root package name */
    private final v f6934q;

    /* renamed from: r, reason: collision with root package name */
    private final i f6935r;

    /* renamed from: s, reason: collision with root package name */
    private final v f6936s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f6937t;

    /* renamed from: u, reason: collision with root package name */
    private final v f6938u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f6939v;

    /* renamed from: w, reason: collision with root package name */
    private final C3791a f6940w;

    /* renamed from: x, reason: collision with root package name */
    private final C3649b f6941x;

    /* renamed from: y, reason: collision with root package name */
    private final B f6942y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3349K f6943z;

    /* renamed from: M3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0141a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f6944a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0142a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f6946a;

            C0142a(a aVar) {
                this.f6946a = aVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC4021c interfaceC4021c, P5.d dVar) {
                this.f6946a.b();
                return I.f6487a;
            }
        }

        C0141a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0141a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0141a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6944a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f o8 = AbstractC3360h.o(a.this.r().f(), 1);
                C0142a c0142a = new C0142a(a.this);
                this.f6944a = 1;
                if (o8.collect(c0142a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return a.this.o();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6948a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0143a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0143a f6949a = new C0143a();

            C0143a() {
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
        public final InterfaceC3349K invoke(InterfaceC4021c currentScreen) {
            AbstractC3159y.i(currentScreen, "currentScreen");
            return v4.g.m(currentScreen.m(), C0143a.f6949a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6950a = new e();

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

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {
        f() {
            super(1);
        }

        public final void a(InterfaceC4021c poppedScreen) {
            AbstractC3159y.i(poppedScreen, "poppedScreen");
            a.this.c().h(poppedScreen);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC4021c) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f6952a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0144a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f6954a;

            C0144a(a aVar) {
                this.f6954a = aVar;
            }

            public final Object b(boolean z8, P5.d dVar) {
                this.f6954a.f6938u.setValue(kotlin.coroutines.jvm.internal.b.a(z8));
                return I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6952a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K t8 = ((Q) a.this.j().getValue()).t();
                C0144a c0144a = new C0144a(a.this);
                this.f6952a = 1;
                if (t8.collect(c0144a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    public a(u.g config, EventReporter eventReporter, H3.c customerRepository, P5.g workContext, SavedStateHandle savedStateHandle, h linkHandler, InterfaceC1211t.a editInteractorFactory, InterfaceC3167b.a cardAccountRangeRepositoryFactory, boolean z8) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(customerRepository, "customerRepository");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(linkHandler, "linkHandler");
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.f6918a = config;
        this.f6919b = eventReporter;
        this.f6920c = customerRepository;
        this.f6921d = workContext;
        this.f6922e = savedStateHandle;
        this.f6923f = linkHandler;
        this.f6924g = editInteractorFactory;
        this.f6925h = cardAccountRangeRepositoryFactory;
        this.f6926i = z8;
        v a8 = AbstractC3351M.a(null);
        this.f6927j = a8;
        this.f6928k = a8;
        C4020b c4020b = new C4020b(ViewModelKt.getViewModelScope(this), new f());
        this.f6929l = c4020b;
        this.f6930m = savedStateHandle.getStateFlow("selection", null);
        InterfaceC3349K stateFlow = savedStateHandle.getStateFlow("processing", Boolean.FALSE);
        this.f6931n = stateFlow;
        v a9 = AbstractC3351M.a(null);
        this.f6932o = a9;
        this.f6933p = a9;
        this.f6934q = AbstractC3351M.a(null);
        this.f6935r = i.f26017g.a(this);
        v a10 = AbstractC3351M.a(new Q(new P(), v4.g.n(EnumC1870e.f14446w), null, false, 12, null));
        this.f6936s = a10;
        this.f6937t = a10;
        v a11 = AbstractC3351M.a(Boolean.TRUE);
        this.f6938u = a11;
        this.f6939v = a11;
        this.f6940w = new C3791a(savedStateHandle, eventReporter, c4020b.f(), ViewModelKt.getViewModelScope(this), new c());
        this.f6941x = C3649b.f37304f.a(this);
        this.f6942y = B.f25370u.a(this);
        this.f6943z = v4.g.d(stateFlow, v4.g.l(c4020b.f(), d.f6948a), e.f6950a);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new C0141a(null), 3, null);
    }

    private final void K(AbstractC3991f abstractC3991f) {
        EnumC1870e enumC1870e;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            AbstractC3991f.C0916f c0916f = (AbstractC3991f.C0916f) abstractC3991f;
            if (c0916f.v().f24412e == o.p.f24532i) {
                v vVar = this.f6936s;
                P p8 = new P();
                o.g gVar = c0916f.v().f24415h;
                if (gVar == null || (enumC1870e = gVar.f24475a) == null) {
                    enumC1870e = EnumC1870e.f14446w;
                }
                vVar.setValue(new Q(p8, v4.g.n(enumC1870e), null, false, 12, null));
                AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
            }
        }
    }

    public abstract InterfaceC3349K A();

    public final P5.g B() {
        return this.f6921d;
    }

    public final void C() {
        if (((Boolean) this.f6931n.getValue()).booleanValue()) {
            return;
        }
        if (this.f6929l.e()) {
            this.f6929l.i();
        } else {
            H();
        }
    }

    public abstract void D(AbstractC3991f.e.d dVar);

    public abstract void E(AbstractC3991f abstractC3991f);

    public final boolean F() {
        return this.f6926i;
    }

    public abstract void G(InterfaceC3983b interfaceC3983b);

    public abstract void H();

    public abstract void I(j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(Y2.d dVar) {
        this.f6927j.setValue(dVar);
    }

    public final void L(PrimaryButton.a state) {
        AbstractC3159y.i(state, "state");
        this.f6932o.setValue(state);
    }

    public final void M(AbstractC3991f abstractC3991f) {
        if (abstractC3991f instanceof AbstractC3991f.e) {
            I(new j.b((AbstractC3991f.e) abstractC3991f));
        } else if (abstractC3991f instanceof AbstractC3991f.b) {
            I(new j.a((AbstractC3991f.b) abstractC3991f));
        }
        this.f6922e.set("selection", abstractC3991f);
        K(abstractC3991f);
        b();
    }

    public abstract void b();

    public final C3791a c() {
        return this.f6940w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3349K d() {
        return this.f6943z;
    }

    public final InterfaceC3167b.a e() {
        return this.f6925h;
    }

    public final u.g f() {
        return this.f6918a;
    }

    public final v g() {
        return this.f6934q;
    }

    public final H3.c h() {
        return this.f6920c;
    }

    public final C3649b i() {
        return this.f6941x;
    }

    public final InterfaceC3349K j() {
        return this.f6937t;
    }

    public final InterfaceC3349K k() {
        return this.f6939v;
    }

    public final InterfaceC1211t.a l() {
        return this.f6924g;
    }

    public abstract InterfaceC3349K m();

    public final EventReporter n() {
        return this.f6919b;
    }

    public final String o() {
        String b8;
        j s8 = s();
        if (s8 == null || (b8 = s8.b()) == null) {
            Object value = this.f6928k.getValue();
            AbstractC3159y.f(value);
            return (String) AbstractC1246t.m0(((Y2.d) value).h0());
        }
        return b8;
    }

    public final h p() {
        return this.f6923f;
    }

    public final i q() {
        return this.f6935r;
    }

    public final C4020b r() {
        return this.f6929l;
    }

    public abstract j s();

    public final InterfaceC3349K t() {
        return this.f6928k;
    }

    public abstract InterfaceC3349K u();

    public final InterfaceC3349K v() {
        return this.f6931n;
    }

    public final B w() {
        return this.f6942y;
    }

    public final SavedStateHandle x() {
        return this.f6922e;
    }

    public final InterfaceC3349K y() {
        return this.f6930m;
    }

    public abstract InterfaceC3349K z();
}
