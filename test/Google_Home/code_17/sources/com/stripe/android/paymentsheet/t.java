package com.stripe.android.paymentsheet;

import A3.AbstractC0966p;
import B3.f;
import C3.c;
import L3.n;
import M3.C1314i;
import M3.C1316k;
import M3.InterfaceC1324t;
import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.C1970d;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.h;
import com.stripe.android.paymentsheet.j;
import com.stripe.android.paymentsheet.o;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h6.InterfaceC2963c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.M;
import n2.C3470g;
import o2.InterfaceC3515b;
import o6.AbstractC3689C;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import o6.InterfaceC3693G;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import s3.AbstractC3995c;
import t3.C4028b;

/* loaded from: classes4.dex */
public final class t extends P3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentOptionContract.a f27403C;

    /* renamed from: D, reason: collision with root package name */
    private final P3.c f27404D;

    /* renamed from: E, reason: collision with root package name */
    private final o6.v f27405E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3687A f27406F;

    /* renamed from: G, reason: collision with root package name */
    private final o6.w f27407G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3698L f27408H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3698L f27409I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC3698L f27410J;

    /* renamed from: K, reason: collision with root package name */
    private j f27411K;

    /* renamed from: L, reason: collision with root package name */
    private final InterfaceC3698L f27412L;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27413a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f27414b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f27415c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0643a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f27416a;

            C0643a(t tVar) {
                this.f27416a = tVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.a aVar, S5.d dVar) {
                this.f27416a.S(aVar);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, t tVar, S5.d dVar) {
            super(2, dVar);
            this.f27414b = hVar;
            this.f27415c = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f27414b, this.f27415c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27413a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f f8 = this.f27414b.f();
                C0643a c0643a = new C0643a(this.f27415c);
                this.f27413a = 1;
                if (f8.collect(c0643a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f27417a;

        public b(Function0 starterArgsSupplier) {
            AbstractC3255y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f27417a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            Application a8 = D2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentOptionContract.a aVar = (PaymentOptionContract.a) this.f27417a.invoke();
            t a9 = AbstractC0966p.a().a(a8).b(aVar.a()).build().a().b(a8).c(aVar).a(createSavedStateHandle).build().a();
            AbstractC3255y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f27418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f27419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EventReporter eventReporter, t tVar) {
            super(0);
            this.f27418a = eventReporter;
            this.f27419b = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5540invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5540invoke() {
            this.f27418a.j((B3.f) this.f27419b.y().getValue());
            this.f27419b.U();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f27421a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(0);
                this.f27421a = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5541invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5541invoke() {
                this.f27421a.M(f.c.f820a);
                this.f27421a.U();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f27422a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t tVar) {
                super(0);
                this.f27422a = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5542invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5542invoke() {
                this.f27422a.M(f.d.f821a);
                this.f27422a.U();
            }
        }

        d() {
            super(3);
        }

        public final L3.n a(Boolean bool, String str, boolean z8) {
            C1970d h8 = t.this.f27403C.b().h();
            n.a aVar = L3.n.f6076g;
            boolean a02 = h8.a0();
            List h02 = h8.h0();
            return aVar.a(bool, str, a02, B3.b.f800f, z8, h02, null, new a(t.this), new b(t.this), h8.W() instanceof com.stripe.android.model.u);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PaymentOptionContract.a args, EventReporter eventReporter, K3.c customerRepository, S5.g workContext, SavedStateHandle savedStateHandle, h linkHandler, InterfaceC3515b.a cardAccountRangeRepositoryFactory, InterfaceC1324t.a editInteractorFactory) {
        super(args.b().a(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, false);
        j jVar;
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(customerRepository, "customerRepository");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(linkHandler, "linkHandler");
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        this.f27403C = args;
        P3.c cVar = new P3.c(f(), args.b().p() instanceof com.stripe.android.model.n, r().f(), d(), y4.g.n(args.b().h().h()), y(), g(), k(), new c(eventReporter, this));
        this.f27404D = cVar;
        o6.v b8 = AbstractC3689C.b(1, 0, null, 6, null);
        this.f27405E = b8;
        this.f27406F = b8;
        o6.w a8 = AbstractC3700N.a(null);
        this.f27407G = a8;
        this.f27408H = a8;
        this.f27409I = AbstractC3708h.b(AbstractC3700N.a(null));
        this.f27410J = y4.g.e(linkHandler.g(), linkHandler.e().d(), d(), new d());
        B3.f i8 = args.b().i();
        if (i8 instanceof f.e) {
            jVar = new j.b((f.e) i8);
        } else if (i8 instanceof f.b) {
            jVar = new j.a((f.b) i8);
        } else {
            jVar = null;
        }
        this.f27411K = jVar;
        this.f27412L = AbstractC3708h.J(cVar.i(), ViewModelKt.getViewModelScope(this), InterfaceC3693G.a.b(InterfaceC3693G.f36586a, 0L, 0L, 3, null), null);
        C3470g.f35374a.c(this, savedStateHandle);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        u.j.f27498a.a(linkHandler);
        linkHandler.m(args.b().g());
        if (t().getValue() == null) {
            J(args.b().h());
        }
        i().d(args.b().b());
        savedStateHandle.set("processing", Boolean.FALSE);
        M(args.b().i());
        r().l(P(args.b().h(), i()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [C3.c$j] */
    private final List P(C1970d c1970d, C4028b c4028b) {
        c.b bVar;
        if (f().w() == u.n.f27549d) {
            return O3.u.f8220a.a(this, c1970d, c4028b);
        }
        if (this.f27403C.b().l()) {
            bVar = new c.j(C1316k.f6949r.a(this, c1970d, c4028b, w()), null, 2, false ? 1 : 0);
        } else {
            bVar = new c.b(C1314i.f6895r.a(this, c1970d));
        }
        List c8 = AbstractC1378t.c();
        c8.add(bVar);
        if ((bVar instanceof c.j) && s() != null) {
            c8.add(new c.a(C1314i.f6895r.a(this, c1970d)));
        }
        return AbstractC1378t.a(c8);
    }

    private final B3.f Q() {
        B3.f i8 = this.f27403C.b().i();
        if (i8 instanceof f.C0009f) {
            return X((f.C0009f) i8);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(h.a aVar) {
        I i8;
        if (AbstractC3255y.d(aVar, h.a.C0606a.f27042a)) {
            T(AbstractC3995c.a.f39223c);
            return;
        }
        if (!(aVar instanceof h.a.f)) {
            if (aVar instanceof h.a.c) {
                T(((h.a.c) aVar).a());
                return;
            }
            if (!AbstractC3255y.d(aVar, h.a.d.f27046a)) {
                if (aVar instanceof h.a.e) {
                    B3.f a8 = ((h.a.e) aVar).a();
                    if (a8 != null) {
                        M(a8);
                        U();
                        i8 = I.f8278a;
                    } else {
                        i8 = null;
                    }
                    if (i8 == null) {
                        U();
                        return;
                    }
                    return;
                }
                if (AbstractC3255y.d(aVar, h.a.g.f27050a)) {
                    L(PrimaryButton.a.b.f27592b);
                    return;
                } else if (AbstractC3255y.d(aVar, h.a.C0607h.f27051a)) {
                    L(PrimaryButton.a.c.f27593b);
                    return;
                } else {
                    if (AbstractC3255y.d(aVar, h.a.b.f27043a)) {
                        U();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new O5.q("An operation is not implemented: This can't happen. Will follow up to remodel the states better.");
    }

    private final void V(B3.f fVar) {
        this.f27405E.e(new o.c(fVar, (List) i().c().getValue()));
    }

    private final void W(B3.f fVar) {
        this.f27405E.e(new o.c(fVar, (List) i().c().getValue()));
    }

    private final f.C0009f X(f.C0009f c0009f) {
        List list = (List) i().c().getValue();
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC3255y.d(((com.stripe.android.model.o) it.next()).f25463a, c0009f.r().f25463a)) {
                    z8 = true;
                    break;
                }
            }
        }
        if (!z8) {
            return null;
        }
        return c0009f;
    }

    @Override // P3.a
    public InterfaceC3698L A() {
        return this.f27410J;
    }

    @Override // P3.a
    public void D(f.e.d paymentSelection) {
        AbstractC3255y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().j((B3.f) y().getValue());
        U();
    }

    @Override // P3.a
    public void E(B3.f fVar) {
        M(fVar);
        if (fVar == null || !fVar.a()) {
            U();
        }
    }

    @Override // P3.a
    public void G(B2.b bVar) {
        this.f27407G.setValue(bVar);
    }

    @Override // P3.a
    public void H() {
        n().onDismiss();
        this.f27405E.e(new o.a(null, Q(), (List) i().c().getValue()));
    }

    @Override // P3.a
    public void I(j jVar) {
        this.f27411K = jVar;
    }

    public final InterfaceC3687A R() {
        return this.f27406F;
    }

    public void T(AbstractC3995c paymentResult) {
        AbstractC3255y.i(paymentResult, "paymentResult");
        x().set("processing", Boolean.FALSE);
    }

    public final void U() {
        boolean z8;
        b();
        B3.f fVar = (B3.f) y().getValue();
        if (fVar != null) {
            n().i(fVar);
            boolean z9 = true;
            if (fVar instanceof f.C0009f) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.c;
            }
            if (!z8) {
                z9 = fVar instanceof f.d;
            }
            if (z9) {
                V(fVar);
            } else if (fVar instanceof f.e) {
                W(fVar);
            } else if (fVar instanceof f.b) {
                W(fVar);
            }
        }
    }

    @Override // P3.a
    public void b() {
        this.f27407G.setValue(null);
    }

    @Override // P3.a
    public InterfaceC3698L m() {
        return this.f27408H;
    }

    @Override // P3.a
    public j s() {
        return this.f27411K;
    }

    @Override // P3.a
    public InterfaceC3698L u() {
        return this.f27412L;
    }

    @Override // P3.a
    public InterfaceC3698L z() {
        return this.f27409I;
    }
}
