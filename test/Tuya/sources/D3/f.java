package D3;

import com.stripe.android.model.p;
import com.stripe.android.paymentsheet.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1477e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f1478a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1479b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1480c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1481d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final f a(l.a confirmationOption) {
            AbstractC3159y.i(confirmationOption, "confirmationOption");
            p c8 = confirmationOption.c();
            p.e eVar = p.f24581u;
            p.b i8 = eVar.i(c8);
            String r8 = eVar.r(c8);
            String q8 = eVar.q(c8);
            if (i8 != null && r8 != null && q8 != null) {
                return new f(r8, q8, i8.b(), i8.c());
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public f(String name, String email, String accountNumber, String sortCode) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(accountNumber, "accountNumber");
        AbstractC3159y.i(sortCode, "sortCode");
        this.f1478a = name;
        this.f1479b = email;
        this.f1480c = accountNumber;
        this.f1481d = sortCode;
    }

    public final String a() {
        return this.f1480c;
    }

    public final String b() {
        return this.f1479b;
    }

    public final String c() {
        return this.f1478a;
    }

    public final String d() {
        return this.f1481d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f1478a, fVar.f1478a) && AbstractC3159y.d(this.f1479b, fVar.f1479b) && AbstractC3159y.d(this.f1480c, fVar.f1480c) && AbstractC3159y.d(this.f1481d, fVar.f1481d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f1478a.hashCode() * 31) + this.f1479b.hashCode()) * 31) + this.f1480c.hashCode()) * 31) + this.f1481d.hashCode();
    }

    public String toString() {
        return "BacsMandateData(name=" + this.f1478a + ", email=" + this.f1479b + ", accountNumber=" + this.f1480c + ", sortCode=" + this.f1481d + ")";
    }
}
