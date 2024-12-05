package B3;

import L5.I;
import X5.n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.v;
import r3.C3686a;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: q, reason: collision with root package name */
    public static final a f787q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f788r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f789a;

    /* renamed from: b, reason: collision with root package name */
    private final String f790b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f791c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f792d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f793e;

    /* renamed from: f, reason: collision with root package name */
    private final String f794f;

    /* renamed from: g, reason: collision with root package name */
    private final String f795g;

    /* renamed from: h, reason: collision with root package name */
    private final String f796h;

    /* renamed from: i, reason: collision with root package name */
    private final C3686a f797i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3991f f798j;

    /* renamed from: k, reason: collision with root package name */
    private final n f799k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f800l;

    /* renamed from: m, reason: collision with root package name */
    private final Function1 f801m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f802n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f803o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f804p;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: B3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0007a extends C3156v implements n {
            C0007a(Object obj) {
                super(2, obj, com.stripe.android.paymentsheet.i.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0);
            }

            public final void d(InterfaceC3983b interfaceC3983b, boolean z8) {
                ((com.stripe.android.paymentsheet.i) this.receiver).e(interfaceC3983b, z8);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((InterfaceC3983b) obj, ((Boolean) obj2).booleanValue());
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3156v implements Function1 {
            b(Object obj) {
                super(1, obj, M3.a.class, "handleConfirmUSBankAccount", "handleConfirmUSBankAccount(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0);
            }

            public final void d(AbstractC3991f.e.d p02) {
                AbstractC3159y.i(p02, "p0");
                ((M3.a) this.receiver).D(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((AbstractC3991f.e.d) obj);
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class c extends C3156v implements Function1 {
            c(Object obj) {
                super(1, obj, M3.a.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", 0);
            }

            public final void d(PrimaryButton.a p02) {
                AbstractC3159y.i(p02, "p0");
                ((M3.a) this.receiver).L(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((PrimaryButton.a) obj);
                return I.f6487a;
            }
        }

        /* renamed from: B3.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0008d extends C3156v implements Function1 {
            C0008d(Object obj) {
                super(1, obj, M3.a.class, "onError", "onError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
            }

            public final void d(InterfaceC3983b interfaceC3983b) {
                ((M3.a) this.receiver).G(interfaceC3983b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((InterfaceC3983b) obj);
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f805a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M3.a aVar) {
                super(1);
                this.f805a = aVar;
            }

            public final void a(Function1 it) {
                Object value;
                AbstractC3159y.i(it, "it");
                v g8 = this.f805a.g();
                do {
                    value = g8.getValue();
                } while (!g8.a(value, it.invoke(value)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Function1) obj);
                return I.f6487a;
            }
        }

        private a() {
        }

        public final d a(M3.a viewModel, Y2.d paymentMethodMetadata, String hostedSurface, String selectedPaymentMethodCode) {
            y yVar;
            u.l lVar;
            u.l.a aVar;
            String str;
            boolean z8;
            AbstractC3991f abstractC3991f;
            u.m c8;
            PaymentSheetContractV2.a k02;
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(hostedSurface, "hostedSurface");
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            boolean a8 = X2.f.a(selectedPaymentMethodCode, paymentMethodMetadata.T(), paymentMethodMetadata.V(), paymentMethodMetadata.I());
            boolean d8 = AbstractC3159y.d(selectedPaymentMethodCode, o.p.f24531h.f24550a);
            if (viewModel instanceof y) {
                yVar = (y) viewModel;
            } else {
                yVar = null;
            }
            if (yVar != null && (k02 = yVar.k0()) != null) {
                lVar = k02.e();
            } else {
                lVar = null;
            }
            if (lVar instanceof u.l.a) {
                aVar = (u.l.a) lVar;
            } else {
                aVar = null;
            }
            if (aVar != null && (c8 = aVar.c()) != null) {
                str = c8.c();
            } else {
                str = null;
            }
            StripeIntent V7 = paymentMethodMetadata.V();
            if (a8 && !d8) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean F8 = viewModel.F();
            boolean z9 = V7 instanceof com.stripe.android.model.n;
            String id = V7.getId();
            String d9 = V7.d();
            C3686a t8 = viewModel.f().t();
            com.stripe.android.paymentsheet.j s8 = viewModel.s();
            if (s8 != null) {
                abstractC3991f = s8.d();
            } else {
                abstractC3991f = null;
            }
            return new d(d8, str, z8, F8, z9, id, d9, hostedSurface, t8, abstractC3991f, new C0007a(viewModel.q()), new b(viewModel), null, new e(viewModel), new c(viewModel), new C0008d(viewModel));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public d(boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, String str3, String hostedSurface, C3686a c3686a, AbstractC3991f abstractC3991f, n onMandateTextChanged, Function1 onConfirmUSBankAccount, Function1 function1, Function1 onUpdatePrimaryButtonUIState, Function1 onUpdatePrimaryButtonState, Function1 onError) {
        AbstractC3159y.i(hostedSurface, "hostedSurface");
        AbstractC3159y.i(onMandateTextChanged, "onMandateTextChanged");
        AbstractC3159y.i(onConfirmUSBankAccount, "onConfirmUSBankAccount");
        AbstractC3159y.i(onUpdatePrimaryButtonUIState, "onUpdatePrimaryButtonUIState");
        AbstractC3159y.i(onUpdatePrimaryButtonState, "onUpdatePrimaryButtonState");
        AbstractC3159y.i(onError, "onError");
        this.f789a = z8;
        this.f790b = str;
        this.f791c = z9;
        this.f792d = z10;
        this.f793e = z11;
        this.f794f = str2;
        this.f795g = str3;
        this.f796h = hostedSurface;
        this.f797i = c3686a;
        this.f798j = abstractC3991f;
        this.f799k = onMandateTextChanged;
        this.f800l = onConfirmUSBankAccount;
        this.f801m = function1;
        this.f802n = onUpdatePrimaryButtonUIState;
        this.f803o = onUpdatePrimaryButtonState;
        this.f804p = onError;
    }

    public final String a() {
        return this.f795g;
    }

    public final AbstractC3991f b() {
        return this.f798j;
    }

    public final String c() {
        return this.f796h;
    }

    public final boolean d() {
        return this.f789a;
    }

    public final String e() {
        return this.f790b;
    }

    public final Function1 f() {
        return this.f801m;
    }

    public final Function1 g() {
        return this.f800l;
    }

    public final Function1 h() {
        return this.f804p;
    }

    public final n i() {
        return this.f799k;
    }

    public final Function1 j() {
        return this.f803o;
    }

    public final Function1 k() {
        return this.f802n;
    }

    public final C3686a l() {
        return this.f797i;
    }

    public final boolean m() {
        return this.f791c;
    }

    public final String n() {
        return this.f794f;
    }

    public final boolean o() {
        return this.f792d;
    }

    public final boolean p() {
        return this.f793e;
    }
}
