package O3;

import O3.s;
import O5.I;
import a6.InterfaceC1668n;
import b3.C1970d;
import com.stripe.android.model.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;
import o6.InterfaceC3698L;
import t3.C4028b;
import t3.C4037k;
import w3.C4145a;

/* loaded from: classes4.dex */
public final class d implements s {

    /* renamed from: l, reason: collision with root package name */
    public static final a f7996l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f7997m = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f7998a;

    /* renamed from: b, reason: collision with root package name */
    private final D3.a f7999b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8000c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1668n f8001d;

    /* renamed from: e, reason: collision with root package name */
    private final E3.d f8002e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f8003f;

    /* renamed from: g, reason: collision with root package name */
    private final Z2.a f8004g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f8005h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8006i;

    /* renamed from: j, reason: collision with root package name */
    private final M f8007j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3698L f8008k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0158a extends C3252v implements InterfaceC1668n {
            C0158a(Object obj) {
                super(2, obj, C4037k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(z3.c cVar, String p12) {
                AbstractC3255y.i(p12, "p1");
                ((C4037k) this.receiver).c(cVar, p12);
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((z3.c) obj, (String) obj2);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3252v implements Function1 {
            b(Object obj) {
                super(1, obj, C4145a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((C4145a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f8009a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P3.a aVar) {
                super(0);
                this.f8009a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f8009a.r().e());
            }
        }

        private a() {
        }

        public final s a(String selectedPaymentMethodCode, P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder) {
            String str;
            AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(customerStateHolder, "customerStateHolder");
            boolean z8 = true;
            M a8 = N.a(C3347b0.a().plus(U0.b(null, 1, null)));
            C4037k a9 = C4037k.f39662g.a(viewModel, t3.m.f39672h.a(viewModel, a8), paymentMethodMetadata);
            D3.a a10 = a9.a(selectedPaymentMethodCode);
            List b8 = a9.b(selectedPaymentMethodCode);
            C0158a c0158a = new C0158a(a9);
            E3.d a11 = E3.d.f2382q.a(viewModel, paymentMethodMetadata, "payment_element", selectedPaymentMethodCode);
            Iterable iterable = (Iterable) customerStateHolder.c().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    o.p pVar = ((com.stripe.android.model.o) it.next()).f25467e;
                    if (pVar != null) {
                        str = pVar.f25605a;
                    } else {
                        str = null;
                    }
                    if (AbstractC3255y.d(str, selectedPaymentMethodCode)) {
                        break;
                    }
                }
            }
            z8 = false;
            return new d(selectedPaymentMethodCode, a10, b8, c0158a, a11, new b(viewModel.c()), paymentMethodMetadata.p(selectedPaymentMethodCode, z8), new c(viewModel), paymentMethodMetadata.W().c(), viewModel.v(), a8);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        public final s.a a(boolean z8) {
            return new s.a(d.this.f7998a, z8, d.this.f8002e, d.this.f7999b, d.this.f8000c, d.this.f8004g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public d(String selectedPaymentMethodCode, D3.a formArguments, List formElements, InterfaceC1668n onFormFieldValuesChanged, E3.d usBankAccountArguments, Function1 reportFieldInteraction, Z2.a aVar, Function0 canGoBackDelegate, boolean z8, InterfaceC3698L processing, M coroutineScope) {
        AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3255y.i(formArguments, "formArguments");
        AbstractC3255y.i(formElements, "formElements");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(usBankAccountArguments, "usBankAccountArguments");
        AbstractC3255y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3255y.i(canGoBackDelegate, "canGoBackDelegate");
        AbstractC3255y.i(processing, "processing");
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        this.f7998a = selectedPaymentMethodCode;
        this.f7999b = formArguments;
        this.f8000c = formElements;
        this.f8001d = onFormFieldValuesChanged;
        this.f8002e = usBankAccountArguments;
        this.f8003f = reportFieldInteraction;
        this.f8004g = aVar;
        this.f8005h = canGoBackDelegate;
        this.f8006i = z8;
        this.f8007j = coroutineScope;
        this.f8008k = y4.g.m(processing, new b());
    }

    @Override // O3.s
    public boolean a() {
        return ((Boolean) this.f8005h.invoke()).booleanValue();
    }

    @Override // O3.s
    public void b(s.b viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (AbstractC3255y.d(viewAction, s.b.a.f8210a)) {
            this.f8003f.invoke(this.f7998a);
        } else if (viewAction instanceof s.b.C0164b) {
            this.f8001d.invoke(((s.b.C0164b) viewAction).a(), this.f7998a);
        }
    }

    @Override // O3.s
    public boolean c() {
        return this.f8006i;
    }

    @Override // O3.s
    public void close() {
        N.d(this.f8007j, null, 1, null);
    }

    @Override // O3.s
    public InterfaceC3698L getState() {
        return this.f8008k;
    }
}
