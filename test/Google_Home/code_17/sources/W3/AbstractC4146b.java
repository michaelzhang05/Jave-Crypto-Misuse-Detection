package w3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u2.f;
import w2.AbstractC4144k;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4146b extends Throwable {

    /* renamed from: w3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4146b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40372a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f40373b = null;

        private a() {
            super(null);
        }

        @Override // w3.AbstractC4146b
        public String a() {
            return "externalPaymentMethodError";
        }

        @Override // w3.AbstractC4146b
        public String b() {
            return f40373b;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* renamed from: w3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0918b extends AbstractC4146b {

        /* renamed from: a, reason: collision with root package name */
        private final int f40374a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40375b;

        public C0918b(int i8) {
            super(null);
            this.f40374a = i8;
            this.f40375b = String.valueOf(i8);
        }

        @Override // w3.AbstractC4146b
        public String a() {
            return "googlePay_" + b();
        }

        @Override // w3.AbstractC4146b
        public String b() {
            return this.f40375b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0918b) && this.f40374a == ((C0918b) obj).f40374a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f40374a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.f40374a + ")";
        }
    }

    /* renamed from: w3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4146b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f40376a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4144k f40377b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Throwable cause) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(cause, "cause");
            this.f40376a = cause;
            AbstractC4144k b8 = AbstractC4144k.f40356e.b(getCause());
            this.f40377b = b8;
            f d8 = b8.d();
            this.f40378c = d8 != null ? d8.o() : null;
        }

        @Override // w3.AbstractC4146b
        public String a() {
            return this.f40377b.a();
        }

        @Override // w3.AbstractC4146b
        public String b() {
            return this.f40378c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f40376a, ((c) obj).f40376a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f40376a;
        }

        public int hashCode() {
            return this.f40376a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.f40376a + ")";
        }
    }

    public /* synthetic */ AbstractC4146b(AbstractC3247p abstractC3247p) {
        this();
    }

    public abstract String a();

    public abstract String b();

    private AbstractC4146b() {
    }
}
