package W2;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class m {

    /* loaded from: classes4.dex */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f11634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String email) {
            super(null);
            AbstractC3255y.i(email, "email");
            this.f11634a = email;
        }

        public final String a() {
            return this.f11634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3255y.d(this.f11634a, ((a) obj).f11634a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f11634a.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.f11634a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f11635a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11636b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11637c;

        /* renamed from: d, reason: collision with root package name */
        private final String f11638d;

        /* renamed from: e, reason: collision with root package name */
        private final l f11639e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String email, String phone, String country, String str, l consentAction) {
            super(null);
            AbstractC3255y.i(email, "email");
            AbstractC3255y.i(phone, "phone");
            AbstractC3255y.i(country, "country");
            AbstractC3255y.i(consentAction, "consentAction");
            this.f11635a = email;
            this.f11636b = phone;
            this.f11637c = country;
            this.f11638d = str;
            this.f11639e = consentAction;
        }

        public final l a() {
            return this.f11639e;
        }

        public final String b() {
            return this.f11637c;
        }

        public final String c() {
            return this.f11635a;
        }

        public final String d() {
            return this.f11638d;
        }

        public final String e() {
            return this.f11636b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f11635a, bVar.f11635a) && AbstractC3255y.d(this.f11636b, bVar.f11636b) && AbstractC3255y.d(this.f11637c, bVar.f11637c) && AbstractC3255y.d(this.f11638d, bVar.f11638d) && this.f11639e == bVar.f11639e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.f11635a.hashCode() * 31) + this.f11636b.hashCode()) * 31) + this.f11637c.hashCode()) * 31;
            String str = this.f11638d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.f11639e.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.f11635a + ", phone=" + this.f11636b + ", country=" + this.f11637c + ", name=" + this.f11638d + ", consentAction=" + this.f11639e + ")";
        }
    }

    public /* synthetic */ m(AbstractC3247p abstractC3247p) {
        this();
    }

    private m() {
    }
}
