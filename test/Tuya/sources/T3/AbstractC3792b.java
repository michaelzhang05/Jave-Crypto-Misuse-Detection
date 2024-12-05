package t3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.f;
import t2.AbstractC3790k;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3792b extends Throwable {

    /* renamed from: t3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38245a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f38246b = null;

        private a() {
            super(null);
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return "externalPaymentMethodError";
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return f38246b;
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

    /* renamed from: t3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0884b extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        private final int f38247a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38248b;

        public C0884b(int i8) {
            super(null);
            this.f38247a = i8;
            this.f38248b = String.valueOf(i8);
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return "googlePay_" + b();
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return this.f38248b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0884b) && this.f38247a == ((C0884b) obj).f38247a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f38247a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.f38247a + ")";
        }
    }

    /* renamed from: t3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f38249a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3790k f38250b;

        /* renamed from: c, reason: collision with root package name */
        private final String f38251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Throwable cause) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(cause, "cause");
            this.f38249a = cause;
            AbstractC3790k b8 = AbstractC3790k.f38229e.b(getCause());
            this.f38250b = b8;
            f d8 = b8.d();
            this.f38251c = d8 != null ? d8.r() : null;
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return this.f38250b.a();
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return this.f38251c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f38249a, ((c) obj).f38249a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f38249a;
        }

        public int hashCode() {
            return this.f38249a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.f38249a + ")";
        }
    }

    public /* synthetic */ AbstractC3792b(AbstractC3151p abstractC3151p) {
        this();
    }

    public abstract String a();

    public abstract String b();

    private AbstractC3792b() {
    }
}
