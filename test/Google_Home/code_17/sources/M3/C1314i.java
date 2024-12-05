package M3;

import M3.InterfaceC1307b;
import O5.C1352h;
import a6.InterfaceC1668n;
import b3.C1970d;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.U0;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import t3.C4037k;
import w3.C4145a;

/* renamed from: M3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1314i implements InterfaceC1307b {

    /* renamed from: r, reason: collision with root package name */
    public static final e f6895r = new e(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f6896s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f6897a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f6898b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f6899c;

    /* renamed from: d, reason: collision with root package name */
    private final List f6900d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f6901e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f6902f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f6903g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f6904h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1668n f6905i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f6906j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6907k;

    /* renamed from: l, reason: collision with root package name */
    private final l6.M f6908l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f6909m;

    /* renamed from: n, reason: collision with root package name */
    private final o6.w f6910n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f6911o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f6912p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f6913q;

    /* renamed from: M3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6914a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0126a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1314i f6916a;

            C0126a(C1314i c1314i) {
                this.f6916a = c1314i;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.f fVar, S5.d dVar) {
                this.f6916a.f6903g.invoke();
                return O5.I.f8278a;
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
            int i8 = this.f6914a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1314i.this.f6898b;
                C0126a c0126a = new C0126a(C1314i.this);
                this.f6914a = 1;
                if (interfaceC3698L.collect(c0126a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.i$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6917a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1314i f6919a;

            a(C1314i c1314i) {
                this.f6919a = c1314i;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, S5.d dVar) {
                this.f6919a.f6912p.setValue(InterfaceC1307b.a.b((InterfaceC1307b.a) this.f6919a.f6912p.getValue(), str, null, (D3.a) this.f6919a.f6901e.invoke(str), (List) this.f6919a.f6902f.invoke(str), null, false, (E3.d) this.f6919a.f6907k.invoke(str), 50, null));
                return O5.I.f8278a;
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6917a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1314i.this.f6911o;
                a aVar = new a(C1314i.this);
                this.f6917a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.i$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6920a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1314i f6922a;

            a(C1314i c1314i) {
                this.f6922a = c1314i;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.f fVar, S5.d dVar) {
                this.f6922a.f6912p.setValue(InterfaceC1307b.a.b((InterfaceC1307b.a) this.f6922a.f6912p.getValue(), null, null, null, null, fVar, false, null, 111, null));
                return O5.I.f8278a;
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6920a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1314i.this.f6898b;
                a aVar = new a(C1314i.this);
                this.f6920a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.i$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6923a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1314i f6925a;

            a(C1314i c1314i) {
                this.f6925a = c1314i;
            }

            public final Object a(boolean z8, S5.d dVar) {
                this.f6925a.f6912p.setValue(InterfaceC1307b.a.b((InterfaceC1307b.a) this.f6925a.f6912p.getValue(), null, null, null, null, null, z8, null, 95, null));
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6923a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = C1314i.this.f6899c;
                a aVar = new a(C1314i.this);
                this.f6923a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.i$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function1 {
            a(Object obj) {
                super(1, obj, C4037k.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final D3.a invoke(String p02) {
                AbstractC3255y.i(p02, "p0");
                return ((C4037k) this.receiver).a(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3252v implements Function1 {
            b(Object obj) {
                super(1, obj, C4037k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3255y.i(p02, "p0");
                return ((C4037k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3252v implements Function0 {
            c(Object obj) {
                super(0, obj, P3.a.class, "clearErrorMessages", "clearErrorMessages()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m34invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34invoke() {
                ((P3.a) this.receiver).b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3252v implements Function1 {
            d(Object obj) {
                super(1, obj, C4145a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((C4145a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0127e extends C3252v implements InterfaceC1668n {
            C0127e(Object obj) {
                super(2, obj, C4037k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(z3.c cVar, String p12) {
                AbstractC3255y.i(p12, "p1");
                ((C4037k) this.receiver).c(cVar, p12);
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((z3.c) obj, (String) obj2);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$f */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3252v implements Function1 {
            f(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.i$e$g */
        /* loaded from: classes4.dex */
        public static final class g extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f6926a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1970d f6927b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(P3.a aVar, C1970d c1970d) {
                super(1);
                this.f6926a = aVar;
                this.f6927b = c1970d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E3.d invoke(String it) {
                AbstractC3255y.i(it, "it");
                return E3.d.f2382q.a(this.f6926a, this.f6927b, "payment_element", it);
            }
        }

        private e() {
        }

        public final InterfaceC1307b a(P3.a viewModel, C1970d paymentMethodMetadata) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            l6.M a8 = l6.N.a(C3347b0.a().plus(U0.b(null, 1, null)));
            C4037k a9 = C4037k.f39662g.a(viewModel, t3.m.f39672h.a(viewModel, a8), paymentMethodMetadata);
            return new C1314i(viewModel.o(), viewModel.y(), viewModel.v(), paymentMethodMetadata.e0(), new a(a9), new b(a9), new c(viewModel), new d(viewModel.c()), new C0127e(a9), new f(viewModel.n()), new g(viewModel, paymentMethodMetadata), a8, paymentMethodMetadata.W().c());
        }

        public /* synthetic */ e(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1314i(String initiallySelectedPaymentMethodType, InterfaceC3698L selection, InterfaceC3698L processing, List supportedPaymentMethods, Function1 createFormArguments, Function1 formElementsForCode, Function0 clearErrorMessages, Function1 reportFieldInteraction, InterfaceC1668n onFormFieldValuesChanged, Function1 reportPaymentMethodTypeSelected, Function1 createUSBankAccountFormArguments, l6.M coroutineScope, boolean z8) {
        AbstractC3255y.i(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(processing, "processing");
        AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3255y.i(createFormArguments, "createFormArguments");
        AbstractC3255y.i(formElementsForCode, "formElementsForCode");
        AbstractC3255y.i(clearErrorMessages, "clearErrorMessages");
        AbstractC3255y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3255y.i(createUSBankAccountFormArguments, "createUSBankAccountFormArguments");
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        this.f6897a = initiallySelectedPaymentMethodType;
        this.f6898b = selection;
        this.f6899c = processing;
        this.f6900d = supportedPaymentMethods;
        this.f6901e = createFormArguments;
        this.f6902f = formElementsForCode;
        this.f6903g = clearErrorMessages;
        this.f6904h = reportFieldInteraction;
        this.f6905i = onFormFieldValuesChanged;
        this.f6906j = reportPaymentMethodTypeSelected;
        this.f6907k = createUSBankAccountFormArguments;
        this.f6908l = coroutineScope;
        this.f6909m = z8;
        o6.w a8 = AbstractC3700N.a(initiallySelectedPaymentMethodType);
        this.f6910n = a8;
        this.f6911o = a8;
        o6.w a9 = AbstractC3700N.a(k());
        this.f6912p = a9;
        this.f6913q = a9;
        AbstractC3364k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final InterfaceC1307b.a k() {
        String str = (String) this.f6911o.getValue();
        return new InterfaceC1307b.a(str, this.f6900d, (D3.a) this.f6901e.invoke(str), (List) this.f6902f.invoke(str), (B3.f) this.f6898b.getValue(), ((Boolean) this.f6899c.getValue()).booleanValue(), (E3.d) this.f6907k.invoke(str));
    }

    @Override // M3.InterfaceC1307b
    public boolean c() {
        return this.f6909m;
    }

    @Override // M3.InterfaceC1307b
    public void close() {
        l6.N.d(this.f6908l, null, 1, null);
    }

    @Override // M3.InterfaceC1307b
    public void d(InterfaceC1307b.AbstractC0121b viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1307b.AbstractC0121b.c) {
            this.f6904h.invoke(((InterfaceC1307b.AbstractC0121b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof InterfaceC1307b.AbstractC0121b.a) {
            InterfaceC1307b.AbstractC0121b.a aVar = (InterfaceC1307b.AbstractC0121b.a) viewAction;
            this.f6905i.invoke(aVar.a(), aVar.b());
        } else if (viewAction instanceof InterfaceC1307b.AbstractC0121b.C0122b) {
            InterfaceC1307b.AbstractC0121b.C0122b c0122b = (InterfaceC1307b.AbstractC0121b.C0122b) viewAction;
            if (!AbstractC3255y.d(this.f6911o.getValue(), c0122b.a())) {
                this.f6910n.setValue(c0122b.a());
                this.f6906j.invoke(c0122b.a());
            }
        }
    }

    @Override // M3.InterfaceC1307b
    public InterfaceC3698L getState() {
        return this.f6913q;
    }
}
