package G3;

import com.stripe.android.model.p;
import com.stripe.android.paymentsheet.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3019e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3020a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3021b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3022c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3023d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final e a(l.a confirmationOption) {
            AbstractC3255y.i(confirmationOption, "confirmationOption");
            p b8 = confirmationOption.b();
            p.e eVar = p.f25636u;
            p.b i8 = eVar.i(b8);
            String r8 = eVar.r(b8);
            String q8 = eVar.q(b8);
            if (i8 != null && r8 != null && q8 != null) {
                return new e(r8, q8, i8.a(), i8.b());
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public e(String name, String email, String accountNumber, String sortCode) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(accountNumber, "accountNumber");
        AbstractC3255y.i(sortCode, "sortCode");
        this.f3020a = name;
        this.f3021b = email;
        this.f3022c = accountNumber;
        this.f3023d = sortCode;
    }

    public final String a() {
        return this.f3022c;
    }

    public final String b() {
        return this.f3021b;
    }

    public final String c() {
        return this.f3020a;
    }

    public final String d() {
        return this.f3023d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f3020a, eVar.f3020a) && AbstractC3255y.d(this.f3021b, eVar.f3021b) && AbstractC3255y.d(this.f3022c, eVar.f3022c) && AbstractC3255y.d(this.f3023d, eVar.f3023d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3020a.hashCode() * 31) + this.f3021b.hashCode()) * 31) + this.f3022c.hashCode()) * 31) + this.f3023d.hashCode();
    }

    public String toString() {
        return "BacsMandateData(name=" + this.f3020a + ", email=" + this.f3021b + ", accountNumber=" + this.f3022c + ", sortCode=" + this.f3023d + ")";
    }
}
