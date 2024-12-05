package t3;

import B3.f;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.O;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final b f39672h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f39673i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f39674a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1670p f39675b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f39676c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f39677d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f39678e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39679f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f39680g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39681a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0889a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f39683a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f39684b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f39685c;

            C0889a(S5.d dVar) {
                super(3, dVar);
            }

            @Override // a6.InterfaceC1669o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(B3.f fVar, W2.e eVar, S5.d dVar) {
                C0889a c0889a = new C0889a(dVar);
                c0889a.f39684b = fVar;
                c0889a.f39685c = eVar;
                return c0889a.invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f39683a == 0) {
                    O5.t.b(obj);
                    return new O5.r((B3.f) this.f39684b, (W2.e) this.f39685c);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f39686a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f39687b;

            b(O o8, m mVar) {
                this.f39686a = o8;
                this.f39687b = mVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(O5.r rVar, S5.d dVar) {
                B3.f fVar = (B3.f) rVar.a();
                W2.e eVar = (W2.e) rVar.b();
                if (!(fVar instanceof f.e.a)) {
                    if (this.f39686a.f34158a) {
                        if (!(fVar instanceof f.e.d)) {
                            this.f39687b.f39677d.invoke(null);
                        }
                        this.f39686a.f34158a = false;
                    }
                    return I.f8278a;
                }
                this.f39686a.f34158a = true;
                if (eVar != null) {
                    this.f39687b.j(eVar);
                }
                return I.f8278a;
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f39681a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                O o8 = new O();
                InterfaceC3706f k8 = AbstractC3708h.k(m.this.f39676c, m.this.f39680g, new C0889a(null));
                b bVar = new b(o8, m.this);
                this.f39681a = 1;
                if (k8.collect(bVar, this) == e8) {
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
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements InterfaceC1670p {
            a(Object obj) {
                super(4, obj, com.stripe.android.paymentsheet.h.class, "payWithLinkInline", "payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object d(W2.m mVar, B3.f fVar, boolean z8, S5.d dVar) {
                return ((com.stripe.android.paymentsheet.h) this.receiver).k(mVar, fVar, z8, dVar);
            }

            @Override // a6.InterfaceC1670p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return d((W2.m) obj, (B3.f) obj2, ((Boolean) obj3).booleanValue(), (S5.d) obj4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0890b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f39688a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0890b(P3.a aVar) {
                super(1);
                this.f39688a = aVar;
            }

            public final void a(PrimaryButton.b bVar) {
                this.f39688a.g().setValue(bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((PrimaryButton.b) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f39689a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B2.b invoke(PrimaryButton.b bVar) {
                if (bVar != null) {
                    return bVar.d();
                }
                return null;
            }
        }

        private b() {
        }

        public final m a(P3.a viewModel, M coroutineScope) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(coroutineScope, "coroutineScope");
            return new m(coroutineScope, new a(viewModel.p()), viewModel.y(), new C0890b(viewModel), y4.g.m(viewModel.u(), c.f39689a), viewModel.F());
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39690a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W2.m f39692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(W2.m mVar, S5.d dVar) {
            super(2, dVar);
            this.f39692c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f39692c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f39690a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC1670p interfaceC1670p = m.this.f39675b;
                W2.m mVar = this.f39692c;
                Object value = m.this.f39676c.getValue();
                Boolean a8 = kotlin.coroutines.jvm.internal.b.a(m.this.f39679f);
                this.f39690a = 1;
                if (interfaceC1670p.invoke(mVar, value, a8, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W2.m f39694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(W2.m mVar) {
            super(0);
            this.f39694b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5626invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5626invoke() {
            m.this.i(this.f39694b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39695a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5627invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5627invoke() {
        }
    }

    public m(M coroutineScope, InterfaceC1670p payWithLink, InterfaceC3698L selection, Function1 updateLinkPrimaryButtonUiState, InterfaceC3698L primaryButtonLabel, boolean z8) {
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(payWithLink, "payWithLink");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(updateLinkPrimaryButtonUiState, "updateLinkPrimaryButtonUiState");
        AbstractC3255y.i(primaryButtonLabel, "primaryButtonLabel");
        this.f39674a = coroutineScope;
        this.f39675b = payWithLink;
        this.f39676c = selection;
        this.f39677d = updateLinkPrimaryButtonUiState;
        this.f39678e = primaryButtonLabel;
        this.f39679f = z8;
        this.f39680g = AbstractC3700N.a(null);
        AbstractC3364k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(W2.m mVar) {
        AbstractC3364k.d(this.f39674a, null, null, new c(mVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(W2.e eVar) {
        PrimaryButton.b bVar;
        B2.b bVar2 = (B2.b) this.f39678e.getValue();
        if (bVar2 == null) {
            return;
        }
        Function1 function1 = this.f39677d;
        if (eVar.h()) {
            W2.m i8 = eVar.i();
            B3.f fVar = (B3.f) this.f39676c.getValue();
            if (i8 != null && fVar != null) {
                bVar = new PrimaryButton.b(bVar2, new d(i8), true, this.f39679f);
            } else {
                bVar = new PrimaryButton.b(bVar2, e.f39695a, false, this.f39679f);
            }
        } else {
            bVar = null;
        }
        function1.invoke(bVar);
    }

    public final void h(W2.e state) {
        AbstractC3255y.i(state, "state");
        this.f39680g.setValue(state);
    }
}
