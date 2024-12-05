package D3;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1470a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1471b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1472c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1473d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f1474e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3983b f1475f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f1476g;

    public e(String email, String nameOnAccount, String sortCode, String accountNumber, InterfaceC3983b payer, InterfaceC3983b supportAddressAsHtml, InterfaceC3983b debitGuaranteeAsHtml) {
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(nameOnAccount, "nameOnAccount");
        AbstractC3159y.i(sortCode, "sortCode");
        AbstractC3159y.i(accountNumber, "accountNumber");
        AbstractC3159y.i(payer, "payer");
        AbstractC3159y.i(supportAddressAsHtml, "supportAddressAsHtml");
        AbstractC3159y.i(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        this.f1470a = email;
        this.f1471b = nameOnAccount;
        this.f1472c = sortCode;
        this.f1473d = accountNumber;
        this.f1474e = payer;
        this.f1475f = supportAddressAsHtml;
        this.f1476g = debitGuaranteeAsHtml;
    }

    public final String a() {
        return this.f1473d;
    }

    public final InterfaceC3983b b() {
        return this.f1476g;
    }

    public final String c() {
        return this.f1470a;
    }

    public final String d() {
        return this.f1471b;
    }

    public final InterfaceC3983b e() {
        return this.f1474e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f1470a, eVar.f1470a) && AbstractC3159y.d(this.f1471b, eVar.f1471b) && AbstractC3159y.d(this.f1472c, eVar.f1472c) && AbstractC3159y.d(this.f1473d, eVar.f1473d) && AbstractC3159y.d(this.f1474e, eVar.f1474e) && AbstractC3159y.d(this.f1475f, eVar.f1475f) && AbstractC3159y.d(this.f1476g, eVar.f1476g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f1472c;
    }

    public final InterfaceC3983b g() {
        return this.f1475f;
    }

    public int hashCode() {
        return (((((((((((this.f1470a.hashCode() * 31) + this.f1471b.hashCode()) * 31) + this.f1472c.hashCode()) * 31) + this.f1473d.hashCode()) * 31) + this.f1474e.hashCode()) * 31) + this.f1475f.hashCode()) * 31) + this.f1476g.hashCode();
    }

    public String toString() {
        return "BacsMandateConfirmationViewState(email=" + this.f1470a + ", nameOnAccount=" + this.f1471b + ", sortCode=" + this.f1472c + ", accountNumber=" + this.f1473d + ", payer=" + this.f1474e + ", supportAddressAsHtml=" + this.f1475f + ", debitGuaranteeAsHtml=" + this.f1476g + ")";
    }
}
