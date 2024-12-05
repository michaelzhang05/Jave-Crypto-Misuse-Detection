package L3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public abstract class j extends Throwable {

    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private final n.e f6053a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6054b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.e confirmationMethod) {
            super(null);
            AbstractC3255y.i(confirmationMethod, "confirmationMethod");
            this.f6053a = confirmationMethod;
            this.f6054b = "invalidConfirmationMethod";
            this.f6055c = j6.n.e("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // L3.j
        public String a() {
            return this.f6054b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f6053a == ((a) obj).f6053a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f6055c;
        }

        public int hashCode() {
            return this.f6053a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.f6053a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6056a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f6057b = "missingAmountOrCurrency";

        /* renamed from: c, reason: collision with root package name */
        private static final String f6058c = "PaymentIntent must contain amount and currency.";

        private b() {
            super(null);
        }

        @Override // L3.j
        public String a() {
            return f6057b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f6058c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final String f6059a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requested) {
            super(null);
            AbstractC3255y.i(requested, "requested");
            this.f6059a = requested;
            this.f6060b = "noPaymentMethodTypesAvailable";
        }

        @Override // L3.j
        public String a() {
            return this.f6060b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f6059a, ((c) obj).f6059a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.f6059a + ") are supported.";
        }

        public int hashCode() {
            return this.f6059a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.f6059a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f6061a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6062b;

        public d(StripeIntent.Status status) {
            super(null);
            this.f6061a = status;
            this.f6062b = "paymentIntentInTerminalState";
        }

        @Override // L3.j
        public String a() {
            return this.f6062b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.f6061a == ((d) obj).f6061a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return j6.n.e("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.f6061a + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f6061a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.f6061a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f6063a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6064b;

        public e(StripeIntent.Status status) {
            super(null);
            this.f6063a = status;
            this.f6064b = "setupIntentInTerminalState";
        }

        @Override // L3.j
        public String a() {
            return this.f6064b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.f6063a == ((e) obj).f6063a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return j6.n.e("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.f6063a + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f6063a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.f6063a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f6065a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable cause) {
            super(null);
            AbstractC3255y.i(cause, "cause");
            this.f6065a = cause;
            this.f6066b = getCause().getMessage();
        }

        @Override // L3.j
        public String a() {
            return AbstractC4144k.f40356e.b(getCause()).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3255y.d(this.f6065a, ((f) obj).f6065a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f6065a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f6066b;
        }

        public int hashCode() {
            return this.f6065a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.f6065a + ")";
        }
    }

    public /* synthetic */ j(AbstractC3247p abstractC3247p) {
        this();
    }

    public abstract String a();

    private j() {
    }
}
