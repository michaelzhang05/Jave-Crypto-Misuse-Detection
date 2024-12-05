package q3;

import L5.I;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import i6.AbstractC2829k;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.O;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final b f37350h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f37351i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f37352a;

    /* renamed from: b, reason: collision with root package name */
    private final X5.p f37353b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f37354c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f37355d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f37356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f37357f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f37358g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f37359a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0856a extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f37361a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37362b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37363c;

            C0856a(P5.d dVar) {
                super(3, dVar);
            }

            @Override // X5.o
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC3991f abstractC3991f, T2.e eVar, P5.d dVar) {
                C0856a c0856a = new C0856a(dVar);
                c0856a.f37362b = abstractC3991f;
                c0856a.f37363c = eVar;
                return c0856a.invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f37361a == 0) {
                    L5.t.b(obj);
                    return new L5.r((AbstractC3991f) this.f37362b, (T2.e) this.f37363c);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f37364a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f37365b;

            b(O o8, m mVar) {
                this.f37364a = o8;
                this.f37365b = mVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(L5.r rVar, P5.d dVar) {
                AbstractC3991f abstractC3991f = (AbstractC3991f) rVar.a();
                T2.e eVar = (T2.e) rVar.b();
                if (!(abstractC3991f instanceof AbstractC3991f.e.a)) {
                    if (this.f37364a.f33757a) {
                        if (!(abstractC3991f instanceof AbstractC3991f.e.d)) {
                            this.f37365b.f37355d.invoke(null);
                        }
                        this.f37364a.f33757a = false;
                    }
                    return I.f6487a;
                }
                this.f37364a.f33757a = true;
                if (eVar != null) {
                    this.f37365b.j(eVar);
                }
                return I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f37359a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                O o8 = new O();
                InterfaceC3358f i9 = AbstractC3360h.i(m.this.f37354c, m.this.f37358g, new C0856a(null));
                b bVar = new b(o8, m.this);
                this.f37359a = 1;
                if (i9.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements X5.p {
            a(Object obj) {
                super(4, obj, com.stripe.android.paymentsheet.h.class, "payWithLinkInline", "payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object d(T2.m mVar, AbstractC3991f abstractC3991f, boolean z8, P5.d dVar) {
                return ((com.stripe.android.paymentsheet.h) this.receiver).k(mVar, abstractC3991f, z8, dVar);
            }

            @Override // X5.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return d((T2.m) obj, (AbstractC3991f) obj2, ((Boolean) obj3).booleanValue(), (P5.d) obj4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0857b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f37366a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0857b(M3.a aVar) {
                super(1);
                this.f37366a = aVar;
            }

            public final void a(PrimaryButton.b bVar) {
                this.f37366a.g().setValue(bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((PrimaryButton.b) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f37367a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(PrimaryButton.b bVar) {
                if (bVar != null) {
                    return bVar.d();
                }
                return null;
            }
        }

        private b() {
        }

        public final m a(M3.a viewModel, M coroutineScope) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(coroutineScope, "coroutineScope");
            return new m(coroutineScope, new a(viewModel.p()), viewModel.y(), new C0857b(viewModel), v4.g.m(viewModel.u(), c.f37367a), viewModel.F());
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f37368a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T2.m f37370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T2.m mVar, P5.d dVar) {
            super(2, dVar);
            this.f37370c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f37370c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f37368a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                X5.p pVar = m.this.f37353b;
                T2.m mVar = this.f37370c;
                Object value = m.this.f37354c.getValue();
                Boolean a8 = kotlin.coroutines.jvm.internal.b.a(m.this.f37357f);
                this.f37368a = 1;
                if (pVar.invoke(mVar, value, a8, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T2.m f37372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T2.m mVar) {
            super(0);
            this.f37372b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5622invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5622invoke() {
            m.this.i(this.f37372b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37373a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5623invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5623invoke() {
        }
    }

    public m(M coroutineScope, X5.p payWithLink, InterfaceC3349K selection, Function1 updateLinkPrimaryButtonUiState, InterfaceC3349K primaryButtonLabel, boolean z8) {
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(payWithLink, "payWithLink");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(updateLinkPrimaryButtonUiState, "updateLinkPrimaryButtonUiState");
        AbstractC3159y.i(primaryButtonLabel, "primaryButtonLabel");
        this.f37352a = coroutineScope;
        this.f37353b = payWithLink;
        this.f37354c = selection;
        this.f37355d = updateLinkPrimaryButtonUiState;
        this.f37356e = primaryButtonLabel;
        this.f37357f = z8;
        this.f37358g = AbstractC3351M.a(null);
        AbstractC2829k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(T2.m mVar) {
        AbstractC2829k.d(this.f37352a, null, null, new c(mVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(T2.e eVar) {
        PrimaryButton.b bVar;
        InterfaceC3983b interfaceC3983b = (InterfaceC3983b) this.f37356e.getValue();
        if (interfaceC3983b == null) {
            return;
        }
        Function1 function1 = this.f37355d;
        if (eVar.h()) {
            T2.m i8 = eVar.i();
            AbstractC3991f abstractC3991f = (AbstractC3991f) this.f37354c.getValue();
            if (i8 != null && abstractC3991f != null) {
                bVar = new PrimaryButton.b(interfaceC3983b, new d(i8), true, this.f37357f);
            } else {
                bVar = new PrimaryButton.b(interfaceC3983b, e.f37373a, false, this.f37357f);
            }
        } else {
            bVar = null;
        }
        function1.invoke(bVar);
    }

    public final void h(T2.e state) {
        AbstractC3159y.i(state, "state");
        this.f37358g.setValue(state);
    }
}
