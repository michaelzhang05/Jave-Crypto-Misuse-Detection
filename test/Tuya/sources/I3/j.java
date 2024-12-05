package I3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public abstract class j extends Throwable {

    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private final n.e f4058a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4059b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.e confirmationMethod) {
            super(null);
            AbstractC3159y.i(confirmationMethod, "confirmationMethod");
            this.f4058a = confirmationMethod;
            this.f4059b = "invalidConfirmationMethod";
            this.f4060c = g6.n.e("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // I3.j
        public String a() {
            return this.f4059b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f4058a == ((a) obj).f4058a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f4060c;
        }

        public int hashCode() {
            return this.f4058a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.f4058a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4061a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f4062b = "missingAmountOrCurrency";

        /* renamed from: c, reason: collision with root package name */
        private static final String f4063c = "PaymentIntent must contain amount and currency.";

        private b() {
            super(null);
        }

        @Override // I3.j
        public String a() {
            return f4062b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f4063c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final String f4064a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requested) {
            super(null);
            AbstractC3159y.i(requested, "requested");
            this.f4064a = requested;
            this.f4065b = "noPaymentMethodTypesAvailable";
        }

        @Override // I3.j
        public String a() {
            return this.f4065b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f4064a, ((c) obj).f4064a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.f4064a + ") are supported.";
        }

        public int hashCode() {
            return this.f4064a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.f4064a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f4066a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4067b;

        public d(StripeIntent.Status status) {
            super(null);
            this.f4066a = status;
            this.f4067b = "paymentIntentInTerminalState";
        }

        @Override // I3.j
        public String a() {
            return this.f4067b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.f4066a == ((d) obj).f4066a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return g6.n.e("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.f4066a + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f4066a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.f4066a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f4068a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4069b;

        public e(StripeIntent.Status status) {
            super(null);
            this.f4068a = status;
            this.f4069b = "setupIntentInTerminalState";
        }

        @Override // I3.j
        public String a() {
            return this.f4069b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.f4068a == ((e) obj).f4068a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return g6.n.e("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.f4068a + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f4068a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.f4068a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f4070a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable cause) {
            super(null);
            AbstractC3159y.i(cause, "cause");
            this.f4070a = cause;
            this.f4071b = getCause().getMessage();
        }

        @Override // I3.j
        public String a() {
            return AbstractC3790k.f38229e.b(getCause()).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3159y.d(this.f4070a, ((f) obj).f4070a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f4070a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f4071b;
        }

        public int hashCode() {
            return this.f4070a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.f4070a + ")";
        }
    }

    public /* synthetic */ j(AbstractC3151p abstractC3151p) {
        this();
    }

    public abstract String a();

    private j() {
    }
}
