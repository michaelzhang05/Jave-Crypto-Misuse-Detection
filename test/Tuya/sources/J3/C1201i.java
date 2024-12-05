package J3;

import J3.InterfaceC1194b;
import L5.C1224h;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.U0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import q3.C3658k;
import t3.C3791a;
import y3.AbstractC3991f;

/* renamed from: J3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1201i implements InterfaceC1194b {

    /* renamed from: r, reason: collision with root package name */
    public static final e f5189r = new e(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f5190s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f5191a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f5192b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f5193c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5194d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f5195e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f5196f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f5197g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f5198h;

    /* renamed from: i, reason: collision with root package name */
    private final X5.n f5199i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f5200j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f5201k;

    /* renamed from: l, reason: collision with root package name */
    private final i6.M f5202l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5203m;

    /* renamed from: n, reason: collision with root package name */
    private final l6.v f5204n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f5205o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f5206p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f5207q;

    /* renamed from: J3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5208a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0101a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1201i f5210a;

            C0101a(C1201i c1201i) {
                this.f5210a = c1201i;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                this.f5210a.f5197g.invoke();
                return L5.I.f6487a;
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
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5208a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1201i.this.f5192b;
                C0101a c0101a = new C0101a(C1201i.this);
                this.f5208a = 1;
                if (interfaceC3349K.collect(c0101a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.i$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5211a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1201i f5213a;

            a(C1201i c1201i) {
                this.f5213a = c1201i;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, P5.d dVar) {
                this.f5213a.f5206p.setValue(InterfaceC1194b.a.b((InterfaceC1194b.a) this.f5213a.f5206p.getValue(), str, null, (A3.a) this.f5213a.f5195e.invoke(str), (List) this.f5213a.f5196f.invoke(str), null, false, (B3.d) this.f5213a.f5201k.invoke(str), 50, null));
                return L5.I.f6487a;
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5211a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1201i.this.f5205o;
                a aVar = new a(C1201i.this);
                this.f5211a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.i$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5214a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1201i f5216a;

            a(C1201i c1201i) {
                this.f5216a = c1201i;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                this.f5216a.f5206p.setValue(InterfaceC1194b.a.b((InterfaceC1194b.a) this.f5216a.f5206p.getValue(), null, null, null, null, abstractC3991f, false, null, 111, null));
                return L5.I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5214a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1201i.this.f5192b;
                a aVar = new a(C1201i.this);
                this.f5214a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.i$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5217a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1201i f5219a;

            a(C1201i c1201i) {
                this.f5219a = c1201i;
            }

            public final Object b(boolean z8, P5.d dVar) {
                this.f5219a.f5206p.setValue(InterfaceC1194b.a.b((InterfaceC1194b.a) this.f5219a.f5206p.getValue(), null, null, null, null, null, z8, null, 95, null));
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5217a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1201i.this.f5193c;
                a aVar = new a(C1201i.this);
                this.f5217a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.i$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function1 {
            a(Object obj) {
                super(1, obj, C3658k.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final A3.a invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return ((C3658k) this.receiver).a(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3156v implements Function1 {
            b(Object obj) {
                super(1, obj, C3658k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return ((C3658k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3156v implements Function0 {
            c(Object obj) {
                super(0, obj, M3.a.class, "clearErrorMessages", "clearErrorMessages()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m29invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m29invoke() {
                ((M3.a) this.receiver).b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3156v implements Function1 {
            d(Object obj) {
                super(1, obj, C3791a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((C3791a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0102e extends C3156v implements X5.n {
            C0102e(Object obj) {
                super(2, obj, C3658k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(w3.c cVar, String p12) {
                AbstractC3159y.i(p12, "p1");
                ((C3658k) this.receiver).c(cVar, p12);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((w3.c) obj, (String) obj2);
                return L5.I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$f */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3156v implements Function1 {
            f(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.i$e$g */
        /* loaded from: classes4.dex */
        public static final class g extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f5220a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f5221b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(M3.a aVar, Y2.d dVar) {
                super(1);
                this.f5220a = aVar;
                this.f5221b = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B3.d invoke(String it) {
                AbstractC3159y.i(it, "it");
                return B3.d.f787q.a(this.f5220a, this.f5221b, "payment_element", it);
            }
        }

        private e() {
        }

        public final InterfaceC1194b a(M3.a viewModel, Y2.d paymentMethodMetadata) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            i6.M a8 = i6.N.a(C2812b0.a().plus(U0.b(null, 1, null)));
            C3658k a9 = C3658k.f37340g.a(viewModel, q3.m.f37350h.a(viewModel, a8), paymentMethodMetadata);
            return new C1201i(viewModel.o(), viewModel.y(), viewModel.v(), paymentMethodMetadata.e0(), new a(a9), new b(a9), new c(viewModel), new d(viewModel.c()), new C0102e(a9), new f(viewModel.n()), new g(viewModel, paymentMethodMetadata), a8, paymentMethodMetadata.V().a());
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1201i(String initiallySelectedPaymentMethodType, InterfaceC3349K selection, InterfaceC3349K processing, List supportedPaymentMethods, Function1 createFormArguments, Function1 formElementsForCode, Function0 clearErrorMessages, Function1 reportFieldInteraction, X5.n onFormFieldValuesChanged, Function1 reportPaymentMethodTypeSelected, Function1 createUSBankAccountFormArguments, i6.M coroutineScope, boolean z8) {
        AbstractC3159y.i(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(processing, "processing");
        AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3159y.i(createFormArguments, "createFormArguments");
        AbstractC3159y.i(formElementsForCode, "formElementsForCode");
        AbstractC3159y.i(clearErrorMessages, "clearErrorMessages");
        AbstractC3159y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3159y.i(createUSBankAccountFormArguments, "createUSBankAccountFormArguments");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        this.f5191a = initiallySelectedPaymentMethodType;
        this.f5192b = selection;
        this.f5193c = processing;
        this.f5194d = supportedPaymentMethods;
        this.f5195e = createFormArguments;
        this.f5196f = formElementsForCode;
        this.f5197g = clearErrorMessages;
        this.f5198h = reportFieldInteraction;
        this.f5199i = onFormFieldValuesChanged;
        this.f5200j = reportPaymentMethodTypeSelected;
        this.f5201k = createUSBankAccountFormArguments;
        this.f5202l = coroutineScope;
        this.f5203m = z8;
        l6.v a8 = AbstractC3351M.a(initiallySelectedPaymentMethodType);
        this.f5204n = a8;
        this.f5205o = a8;
        l6.v a9 = AbstractC3351M.a(k());
        this.f5206p = a9;
        this.f5207q = a9;
        AbstractC2829k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final InterfaceC1194b.a k() {
        String str = (String) this.f5205o.getValue();
        return new InterfaceC1194b.a(str, this.f5194d, (A3.a) this.f5195e.invoke(str), (List) this.f5196f.invoke(str), (AbstractC3991f) this.f5192b.getValue(), ((Boolean) this.f5193c.getValue()).booleanValue(), (B3.d) this.f5201k.invoke(str));
    }

    @Override // J3.InterfaceC1194b
    public boolean a() {
        return this.f5203m;
    }

    @Override // J3.InterfaceC1194b
    public void b(InterfaceC1194b.AbstractC0096b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1194b.AbstractC0096b.c) {
            this.f5198h.invoke(((InterfaceC1194b.AbstractC0096b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof InterfaceC1194b.AbstractC0096b.a) {
            InterfaceC1194b.AbstractC0096b.a aVar = (InterfaceC1194b.AbstractC0096b.a) viewAction;
            this.f5199i.invoke(aVar.a(), aVar.b());
        } else if (viewAction instanceof InterfaceC1194b.AbstractC0096b.C0097b) {
            InterfaceC1194b.AbstractC0096b.C0097b c0097b = (InterfaceC1194b.AbstractC0096b.C0097b) viewAction;
            if (!AbstractC3159y.d(this.f5205o.getValue(), c0097b.a())) {
                this.f5204n.setValue(c0097b.a());
                this.f5200j.invoke(c0097b.a());
            }
        }
    }

    @Override // J3.InterfaceC1194b
    public void close() {
        i6.N.d(this.f5202l, null, 1, null);
    }

    @Override // J3.InterfaceC1194b
    public InterfaceC3349K getState() {
        return this.f5207q;
    }
}
