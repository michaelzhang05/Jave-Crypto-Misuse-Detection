package L3;

import L3.s;
import L5.I;
import com.stripe.android.model.o;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.InterfaceC3349K;
import q3.C3649b;
import q3.C3658k;
import t3.C3791a;

/* loaded from: classes4.dex */
public final class d implements s {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6205l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f6206m = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f6207a;

    /* renamed from: b, reason: collision with root package name */
    private final A3.a f6208b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6209c;

    /* renamed from: d, reason: collision with root package name */
    private final X5.n f6210d;

    /* renamed from: e, reason: collision with root package name */
    private final B3.d f6211e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f6212f;

    /* renamed from: g, reason: collision with root package name */
    private final W2.a f6213g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f6214h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6215i;

    /* renamed from: j, reason: collision with root package name */
    private final M f6216j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f6217k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0130a extends C3156v implements X5.n {
            C0130a(Object obj) {
                super(2, obj, C3658k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(w3.c cVar, String p12) {
                AbstractC3159y.i(p12, "p1");
                ((C3658k) this.receiver).c(cVar, p12);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((w3.c) obj, (String) obj2);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3156v implements Function1 {
            b(Object obj) {
                super(1, obj, C3791a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((C3791a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6218a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M3.a aVar) {
                super(0);
                this.f6218a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f6218a.r().e());
            }
        }

        private a() {
        }

        public final s a(String selectedPaymentMethodCode, M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder) {
            String str;
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            boolean z8 = true;
            M a8 = N.a(C2812b0.a().plus(U0.b(null, 1, null)));
            C3658k a9 = C3658k.f37340g.a(viewModel, q3.m.f37350h.a(viewModel, a8), paymentMethodMetadata);
            A3.a a10 = a9.a(selectedPaymentMethodCode);
            List b8 = a9.b(selectedPaymentMethodCode);
            C0130a c0130a = new C0130a(a9);
            B3.d a11 = B3.d.f787q.a(viewModel, paymentMethodMetadata, "payment_element", selectedPaymentMethodCode);
            Iterable iterable = (Iterable) customerStateHolder.c().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    o.p pVar = ((com.stripe.android.model.o) it.next()).f24412e;
                    if (pVar != null) {
                        str = pVar.f24550a;
                    } else {
                        str = null;
                    }
                    if (AbstractC3159y.d(str, selectedPaymentMethodCode)) {
                        break;
                    }
                }
            }
            z8 = false;
            return new d(selectedPaymentMethodCode, a10, b8, c0130a, a11, new b(viewModel.c()), paymentMethodMetadata.k(selectedPaymentMethodCode, z8), new c(viewModel), paymentMethodMetadata.V().a(), viewModel.v(), a8);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        public final s.a a(boolean z8) {
            return new s.a(d.this.f6207a, z8, d.this.f6211e, d.this.f6208b, d.this.f6209c, d.this.f6213g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public d(String selectedPaymentMethodCode, A3.a formArguments, List formElements, X5.n onFormFieldValuesChanged, B3.d usBankAccountArguments, Function1 reportFieldInteraction, W2.a aVar, Function0 canGoBackDelegate, boolean z8, InterfaceC3349K processing, M coroutineScope) {
        AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3159y.i(formArguments, "formArguments");
        AbstractC3159y.i(formElements, "formElements");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(usBankAccountArguments, "usBankAccountArguments");
        AbstractC3159y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3159y.i(canGoBackDelegate, "canGoBackDelegate");
        AbstractC3159y.i(processing, "processing");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        this.f6207a = selectedPaymentMethodCode;
        this.f6208b = formArguments;
        this.f6209c = formElements;
        this.f6210d = onFormFieldValuesChanged;
        this.f6211e = usBankAccountArguments;
        this.f6212f = reportFieldInteraction;
        this.f6213g = aVar;
        this.f6214h = canGoBackDelegate;
        this.f6215i = z8;
        this.f6216j = coroutineScope;
        this.f6217k = v4.g.m(processing, new b());
    }

    @Override // L3.s
    public boolean a() {
        return this.f6215i;
    }

    @Override // L3.s
    public boolean b() {
        return ((Boolean) this.f6214h.invoke()).booleanValue();
    }

    @Override // L3.s
    public void c(s.b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (AbstractC3159y.d(viewAction, s.b.a.f6419a)) {
            this.f6212f.invoke(this.f6207a);
        } else if (viewAction instanceof s.b.C0136b) {
            this.f6210d.invoke(((s.b.C0136b) viewAction).a(), this.f6207a);
        }
    }

    @Override // L3.s
    public void close() {
        N.d(this.f6216j, null, 1, null);
    }

    @Override // L3.s
    public InterfaceC3349K getState() {
        return this.f6217k;
    }
}
