package T2;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class m {

    /* loaded from: classes4.dex */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f9977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String email) {
            super(null);
            AbstractC3159y.i(email, "email");
            this.f9977a = email;
        }

        public final String a() {
            return this.f9977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3159y.d(this.f9977a, ((a) obj).f9977a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f9977a.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.f9977a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f9978a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9979b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9980c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9981d;

        /* renamed from: e, reason: collision with root package name */
        private final l f9982e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String email, String phone, String country, String str, l consentAction) {
            super(null);
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(phone, "phone");
            AbstractC3159y.i(country, "country");
            AbstractC3159y.i(consentAction, "consentAction");
            this.f9978a = email;
            this.f9979b = phone;
            this.f9980c = country;
            this.f9981d = str;
            this.f9982e = consentAction;
        }

        public final l a() {
            return this.f9982e;
        }

        public final String b() {
            return this.f9980c;
        }

        public final String c() {
            return this.f9978a;
        }

        public final String d() {
            return this.f9981d;
        }

        public final String e() {
            return this.f9979b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f9978a, bVar.f9978a) && AbstractC3159y.d(this.f9979b, bVar.f9979b) && AbstractC3159y.d(this.f9980c, bVar.f9980c) && AbstractC3159y.d(this.f9981d, bVar.f9981d) && this.f9982e == bVar.f9982e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.f9978a.hashCode() * 31) + this.f9979b.hashCode()) * 31) + this.f9980c.hashCode()) * 31;
            String str = this.f9981d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.f9982e.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.f9978a + ", phone=" + this.f9979b + ", country=" + this.f9980c + ", name=" + this.f9981d + ", consentAction=" + this.f9982e + ")";
        }
    }

    public /* synthetic */ m(AbstractC3151p abstractC3151p) {
        this();
    }

    private m() {
    }
}
