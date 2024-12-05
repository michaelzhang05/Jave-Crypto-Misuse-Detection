package E3;

import B3.f;
import O5.I;
import a3.AbstractC1624f;
import a6.InterfaceC1668n;
import b3.C1970d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import o6.w;
import u3.C4059a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: q, reason: collision with root package name */
    public static final a f2382q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f2383r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2384a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2385b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2386c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2387d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2388e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2389f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2390g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2391h;

    /* renamed from: i, reason: collision with root package name */
    private final C4059a f2392i;

    /* renamed from: j, reason: collision with root package name */
    private final B3.f f2393j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1668n f2394k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f2395l;

    /* renamed from: m, reason: collision with root package name */
    private final Function1 f2396m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f2397n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f2398o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f2399p;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: E3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0032a extends C3252v implements InterfaceC1668n {
            C0032a(Object obj) {
                super(2, obj, com.stripe.android.paymentsheet.i.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0);
            }

            public final void d(B2.b bVar, boolean z8) {
                ((com.stripe.android.paymentsheet.i) this.receiver).e(bVar, z8);
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((B2.b) obj, ((Boolean) obj2).booleanValue());
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3252v implements Function1 {
            b(Object obj) {
                super(1, obj, P3.a.class, "handleConfirmUSBankAccount", "handleConfirmUSBankAccount(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0);
            }

            public final void d(f.e.d p02) {
                AbstractC3255y.i(p02, "p0");
                ((P3.a) this.receiver).D(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((f.e.d) obj);
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class c extends C3252v implements Function1 {
            c(Object obj) {
                super(1, obj, P3.a.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", 0);
            }

            public final void d(PrimaryButton.a p02) {
                AbstractC3255y.i(p02, "p0");
                ((P3.a) this.receiver).L(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((PrimaryButton.a) obj);
                return I.f8278a;
            }
        }

        /* renamed from: E3.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0033d extends C3252v implements Function1 {
            C0033d(Object obj) {
                super(1, obj, P3.a.class, "onError", "onError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
            }

            public final void d(B2.b bVar) {
                ((P3.a) this.receiver).G(bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((B2.b) obj);
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f2400a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(P3.a aVar) {
                super(1);
                this.f2400a = aVar;
            }

            public final void a(Function1 it) {
                Object value;
                AbstractC3255y.i(it, "it");
                w g8 = this.f2400a.g();
                do {
                    value = g8.getValue();
                } while (!g8.c(value, it.invoke(value)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Function1) obj);
                return I.f8278a;
            }
        }

        private a() {
        }

        public final d a(P3.a viewModel, C1970d paymentMethodMetadata, String hostedSurface, String selectedPaymentMethodCode) {
            y yVar;
            u.l lVar;
            u.l.a aVar;
            String str;
            boolean z8;
            B3.f fVar;
            u.m b8;
            PaymentSheetContractV2.a k02;
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(hostedSurface, "hostedSurface");
            AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            boolean a8 = AbstractC1624f.a(selectedPaymentMethodCode, paymentMethodMetadata.U(), paymentMethodMetadata.W(), paymentMethodMetadata.z());
            boolean d8 = AbstractC3255y.d(selectedPaymentMethodCode, o.p.f25586h.f25605a);
            if (viewModel instanceof y) {
                yVar = (y) viewModel;
            } else {
                yVar = null;
            }
            if (yVar != null && (k02 = yVar.k0()) != null) {
                lVar = k02.g();
            } else {
                lVar = null;
            }
            if (lVar instanceof u.l.a) {
                aVar = (u.l.a) lVar;
            } else {
                aVar = null;
            }
            if (aVar != null && (b8 = aVar.b()) != null) {
                str = b8.b();
            } else {
                str = null;
            }
            StripeIntent W7 = paymentMethodMetadata.W();
            if (a8 && !d8) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean F8 = viewModel.F();
            boolean z9 = W7 instanceof n;
            String id = W7.getId();
            String d9 = W7.d();
            C4059a q8 = viewModel.f().q();
            com.stripe.android.paymentsheet.j s8 = viewModel.s();
            if (s8 != null) {
                fVar = s8.d();
            } else {
                fVar = null;
            }
            return new d(d8, str, z8, F8, z9, id, d9, hostedSurface, q8, fVar, new C0032a(viewModel.q()), new b(viewModel), null, new e(viewModel), new c(viewModel), new C0033d(viewModel));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public d(boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, String str3, String hostedSurface, C4059a c4059a, B3.f fVar, InterfaceC1668n onMandateTextChanged, Function1 onConfirmUSBankAccount, Function1 function1, Function1 onUpdatePrimaryButtonUIState, Function1 onUpdatePrimaryButtonState, Function1 onError) {
        AbstractC3255y.i(hostedSurface, "hostedSurface");
        AbstractC3255y.i(onMandateTextChanged, "onMandateTextChanged");
        AbstractC3255y.i(onConfirmUSBankAccount, "onConfirmUSBankAccount");
        AbstractC3255y.i(onUpdatePrimaryButtonUIState, "onUpdatePrimaryButtonUIState");
        AbstractC3255y.i(onUpdatePrimaryButtonState, "onUpdatePrimaryButtonState");
        AbstractC3255y.i(onError, "onError");
        this.f2384a = z8;
        this.f2385b = str;
        this.f2386c = z9;
        this.f2387d = z10;
        this.f2388e = z11;
        this.f2389f = str2;
        this.f2390g = str3;
        this.f2391h = hostedSurface;
        this.f2392i = c4059a;
        this.f2393j = fVar;
        this.f2394k = onMandateTextChanged;
        this.f2395l = onConfirmUSBankAccount;
        this.f2396m = function1;
        this.f2397n = onUpdatePrimaryButtonUIState;
        this.f2398o = onUpdatePrimaryButtonState;
        this.f2399p = onError;
    }

    public final String a() {
        return this.f2390g;
    }

    public final B3.f b() {
        return this.f2393j;
    }

    public final String c() {
        return this.f2391h;
    }

    public final boolean d() {
        return this.f2384a;
    }

    public final String e() {
        return this.f2385b;
    }

    public final Function1 f() {
        return this.f2396m;
    }

    public final Function1 g() {
        return this.f2395l;
    }

    public final Function1 h() {
        return this.f2399p;
    }

    public final InterfaceC1668n i() {
        return this.f2394k;
    }

    public final Function1 j() {
        return this.f2398o;
    }

    public final Function1 k() {
        return this.f2397n;
    }

    public final C4059a l() {
        return this.f2392i;
    }

    public final boolean m() {
        return this.f2386c;
    }

    public final String n() {
        return this.f2389f;
    }

    public final boolean o() {
        return this.f2387d;
    }

    public final boolean p() {
        return this.f2388e;
    }
}
