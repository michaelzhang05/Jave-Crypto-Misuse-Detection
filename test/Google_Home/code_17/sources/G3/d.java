package G3;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f3012a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3013b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3014c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3015d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f3016e;

    /* renamed from: f, reason: collision with root package name */
    private final B2.b f3017f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.b f3018g;

    public d(String email, String nameOnAccount, String sortCode, String accountNumber, B2.b payer, B2.b supportAddressAsHtml, B2.b debitGuaranteeAsHtml) {
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(nameOnAccount, "nameOnAccount");
        AbstractC3255y.i(sortCode, "sortCode");
        AbstractC3255y.i(accountNumber, "accountNumber");
        AbstractC3255y.i(payer, "payer");
        AbstractC3255y.i(supportAddressAsHtml, "supportAddressAsHtml");
        AbstractC3255y.i(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        this.f3012a = email;
        this.f3013b = nameOnAccount;
        this.f3014c = sortCode;
        this.f3015d = accountNumber;
        this.f3016e = payer;
        this.f3017f = supportAddressAsHtml;
        this.f3018g = debitGuaranteeAsHtml;
    }

    public final String a() {
        return this.f3015d;
    }

    public final B2.b b() {
        return this.f3018g;
    }

    public final String c() {
        return this.f3012a;
    }

    public final String d() {
        return this.f3013b;
    }

    public final B2.b e() {
        return this.f3016e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f3012a, dVar.f3012a) && AbstractC3255y.d(this.f3013b, dVar.f3013b) && AbstractC3255y.d(this.f3014c, dVar.f3014c) && AbstractC3255y.d(this.f3015d, dVar.f3015d) && AbstractC3255y.d(this.f3016e, dVar.f3016e) && AbstractC3255y.d(this.f3017f, dVar.f3017f) && AbstractC3255y.d(this.f3018g, dVar.f3018g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f3014c;
    }

    public final B2.b g() {
        return this.f3017f;
    }

    public int hashCode() {
        return (((((((((((this.f3012a.hashCode() * 31) + this.f3013b.hashCode()) * 31) + this.f3014c.hashCode()) * 31) + this.f3015d.hashCode()) * 31) + this.f3016e.hashCode()) * 31) + this.f3017f.hashCode()) * 31) + this.f3018g.hashCode();
    }

    public String toString() {
        return "BacsMandateConfirmationViewState(email=" + this.f3012a + ", nameOnAccount=" + this.f3013b + ", sortCode=" + this.f3014c + ", accountNumber=" + this.f3015d + ", payer=" + this.f3016e + ", supportAddressAsHtml=" + this.f3017f + ", debitGuaranteeAsHtml=" + this.f3018g + ")";
    }
}
