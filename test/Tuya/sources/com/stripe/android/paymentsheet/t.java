package com.stripe.android.paymentsheet;

import I3.n;
import J3.C1201i;
import J3.C1203k;
import J3.InterfaceC1211t;
import L5.I;
import M5.AbstractC1246t;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.h;
import com.stripe.android.paymentsheet.j;
import com.stripe.android.paymentsheet.o;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e6.InterfaceC2643c;
import i6.AbstractC2825i;
import i6.M;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k2.C3115g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import l6.AbstractC3340B;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3344F;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import p3.AbstractC3601c;
import q3.C3649b;
import x3.AbstractC3915p;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import y3.EnumC3987b;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class t extends M3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentOptionContract.a f26348C;

    /* renamed from: D, reason: collision with root package name */
    private final M3.c f26349D;

    /* renamed from: E, reason: collision with root package name */
    private final l6.u f26350E;

    /* renamed from: F, reason: collision with root package name */
    private final l6.z f26351F;

    /* renamed from: G, reason: collision with root package name */
    private final l6.v f26352G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3349K f26353H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3349K f26354I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC3349K f26355J;

    /* renamed from: K, reason: collision with root package name */
    private j f26356K;

    /* renamed from: L, reason: collision with root package name */
    private final InterfaceC3349K f26357L;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f26359b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f26360c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0647a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f26361a;

            C0647a(t tVar) {
                this.f26361a = tVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.a aVar, P5.d dVar) {
                this.f26361a.S(aVar);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, t tVar, P5.d dVar) {
            super(2, dVar);
            this.f26359b = hVar;
            this.f26360c = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f26359b, this.f26360c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26358a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f f8 = this.f26359b.f();
                C0647a c0647a = new C0647a(this.f26360c);
                this.f26358a = 1;
                if (f8.collect(c0647a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26362a;

        public b(Function0 starterArgsSupplier) {
            AbstractC3159y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f26362a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            Application a8 = A2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentOptionContract.a aVar = (PaymentOptionContract.a) this.f26362a.invoke();
            t a9 = AbstractC3915p.a().a(a8).b(aVar.b()).build().a().b(a8).c(aVar).a(createSavedStateHandle).build().a();
            AbstractC3159y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f26363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f26364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EventReporter eventReporter, t tVar) {
            super(0);
            this.f26363a = eventReporter;
            this.f26364b = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5536invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5536invoke() {
            this.f26363a.s((AbstractC3991f) this.f26364b.y().getValue());
            this.f26364b.U();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f26366a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(0);
                this.f26366a = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5537invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5537invoke() {
                this.f26366a.M(AbstractC3991f.c.f39776a);
                this.f26366a.U();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f26367a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t tVar) {
                super(0);
                this.f26367a = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5538invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5538invoke() {
                this.f26367a.M(AbstractC3991f.d.f39777a);
                this.f26367a.U();
            }
        }

        d() {
            super(3);
        }

        public final I3.n a(Boolean bool, String str, boolean z8) {
            Y2.d f8 = t.this.f26348C.c().f();
            n.a aVar = I3.n.f4081g;
            boolean a02 = f8.a0();
            List h02 = f8.h0();
            return aVar.a(bool, str, a02, EnumC3987b.f39756f, z8, h02, null, new a(t.this), new b(t.this), f8.V() instanceof com.stripe.android.model.u);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PaymentOptionContract.a args, EventReporter eventReporter, H3.c customerRepository, P5.g workContext, SavedStateHandle savedStateHandle, h linkHandler, InterfaceC3167b.a cardAccountRangeRepositoryFactory, InterfaceC1211t.a editInteractorFactory) {
        super(args.c().b(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, false);
        j jVar;
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(customerRepository, "customerRepository");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(linkHandler, "linkHandler");
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        this.f26348C = args;
        M3.c cVar = new M3.c(f(), args.c().k() instanceof com.stripe.android.model.n, r().f(), d(), v4.g.n(args.c().f().f()), y(), g(), k(), new c(eventReporter, this));
        this.f26349D = cVar;
        l6.u b8 = AbstractC3340B.b(1, 0, null, 6, null);
        this.f26350E = b8;
        this.f26351F = b8;
        l6.v a8 = AbstractC3351M.a(null);
        this.f26352G = a8;
        this.f26353H = a8;
        this.f26354I = AbstractC3360h.b(AbstractC3351M.a(null));
        this.f26355J = v4.g.e(linkHandler.g(), linkHandler.e().d(), d(), new d());
        AbstractC3991f i8 = args.c().i();
        if (i8 instanceof AbstractC3991f.e) {
            jVar = new j.b((AbstractC3991f.e) i8);
        } else if (i8 instanceof AbstractC3991f.b) {
            jVar = new j.a((AbstractC3991f.b) i8);
        } else {
            jVar = null;
        }
        this.f26356K = jVar;
        this.f26357L = AbstractC3360h.H(cVar.i(), ViewModelKt.getViewModelScope(this), InterfaceC3344F.a.b(InterfaceC3344F.f34585a, 0L, 0L, 3, null), null);
        C3115g.f33382a.c(this, savedStateHandle);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        u.j.f26443a.a(linkHandler);
        linkHandler.m(args.c().e());
        if (t().getValue() == null) {
            J(args.c().f());
        }
        i().d(args.c().c());
        savedStateHandle.set("processing", Boolean.FALSE);
        M(args.c().i());
        r().l(P(args.c().f(), i()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [z3.c$j] */
    private final List P(Y2.d dVar, C3649b c3649b) {
        InterfaceC4021c.b bVar;
        if (f().u() == u.n.f26494d) {
            return L3.u.f6429a.a(this, dVar, c3649b);
        }
        if (this.f26348C.c().j()) {
            bVar = new InterfaceC4021c.j(C1203k.f5243r.a(this, dVar, c3649b, w()), null, 2, false ? 1 : 0);
        } else {
            bVar = new InterfaceC4021c.b(C1201i.f5189r.a(this, dVar));
        }
        List c8 = AbstractC1246t.c();
        c8.add(bVar);
        if ((bVar instanceof InterfaceC4021c.j) && s() != null) {
            c8.add(new InterfaceC4021c.a(C1201i.f5189r.a(this, dVar)));
        }
        return AbstractC1246t.a(c8);
    }

    private final AbstractC3991f Q() {
        AbstractC3991f i8 = this.f26348C.c().i();
        if (i8 instanceof AbstractC3991f.C0916f) {
            return X((AbstractC3991f.C0916f) i8);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(h.a aVar) {
        I i8;
        if (AbstractC3159y.d(aVar, h.a.C0610a.f25987a)) {
            T(AbstractC3601c.a.f37024c);
            return;
        }
        if (!(aVar instanceof h.a.f)) {
            if (aVar instanceof h.a.c) {
                T(((h.a.c) aVar).a());
                return;
            }
            if (!AbstractC3159y.d(aVar, h.a.d.f25991a)) {
                if (aVar instanceof h.a.e) {
                    AbstractC3991f a8 = ((h.a.e) aVar).a();
                    if (a8 != null) {
                        M(a8);
                        U();
                        i8 = I.f6487a;
                    } else {
                        i8 = null;
                    }
                    if (i8 == null) {
                        U();
                        return;
                    }
                    return;
                }
                if (AbstractC3159y.d(aVar, h.a.g.f25995a)) {
                    L(PrimaryButton.a.b.f26537b);
                    return;
                } else if (AbstractC3159y.d(aVar, h.a.C0611h.f25996a)) {
                    L(PrimaryButton.a.c.f26538b);
                    return;
                } else {
                    if (AbstractC3159y.d(aVar, h.a.b.f25988a)) {
                        U();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new L5.q("An operation is not implemented: This can't happen. Will follow up to remodel the states better.");
    }

    private final void V(AbstractC3991f abstractC3991f) {
        this.f26350E.d(new o.c(abstractC3991f, (List) i().c().getValue()));
    }

    private final void W(AbstractC3991f abstractC3991f) {
        this.f26350E.d(new o.c(abstractC3991f, (List) i().c().getValue()));
    }

    private final AbstractC3991f.C0916f X(AbstractC3991f.C0916f c0916f) {
        List list = (List) i().c().getValue();
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC3159y.d(((com.stripe.android.model.o) it.next()).f24408a, c0916f.v().f24408a)) {
                    z8 = true;
                    break;
                }
            }
        }
        if (!z8) {
            return null;
        }
        return c0916f;
    }

    @Override // M3.a
    public InterfaceC3349K A() {
        return this.f26355J;
    }

    @Override // M3.a
    public void D(AbstractC3991f.e.d paymentSelection) {
        AbstractC3159y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().s((AbstractC3991f) y().getValue());
        U();
    }

    @Override // M3.a
    public void E(AbstractC3991f abstractC3991f) {
        M(abstractC3991f);
        if (abstractC3991f == null || !abstractC3991f.b()) {
            U();
        }
    }

    @Override // M3.a
    public void G(InterfaceC3983b interfaceC3983b) {
        this.f26352G.setValue(interfaceC3983b);
    }

    @Override // M3.a
    public void H() {
        n().onDismiss();
        this.f26350E.d(new o.a(null, Q(), (List) i().c().getValue()));
    }

    @Override // M3.a
    public void I(j jVar) {
        this.f26356K = jVar;
    }

    public final l6.z R() {
        return this.f26351F;
    }

    public void T(AbstractC3601c paymentResult) {
        AbstractC3159y.i(paymentResult, "paymentResult");
        x().set("processing", Boolean.FALSE);
    }

    public final void U() {
        boolean z8;
        b();
        AbstractC3991f abstractC3991f = (AbstractC3991f) y().getValue();
        if (abstractC3991f != null) {
            n().k(abstractC3991f);
            boolean z9 = true;
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.c;
            }
            if (!z8) {
                z9 = abstractC3991f instanceof AbstractC3991f.d;
            }
            if (z9) {
                V(abstractC3991f);
            } else if (abstractC3991f instanceof AbstractC3991f.e) {
                W(abstractC3991f);
            } else if (abstractC3991f instanceof AbstractC3991f.b) {
                W(abstractC3991f);
            }
        }
    }

    @Override // M3.a
    public void b() {
        this.f26352G.setValue(null);
    }

    @Override // M3.a
    public InterfaceC3349K m() {
        return this.f26353H;
    }

    @Override // M3.a
    public j s() {
        return this.f26356K;
    }

    @Override // M3.a
    public InterfaceC3349K u() {
        return this.f26357L;
    }

    @Override // M3.a
    public InterfaceC3349K z() {
        return this.f26354I;
    }
}
