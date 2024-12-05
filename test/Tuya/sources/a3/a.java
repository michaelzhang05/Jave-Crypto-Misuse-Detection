package A3;

import b4.C1880b;
import c4.InterfaceC1925a;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r3.C3686a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f99a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1925a f100b;

    /* renamed from: c, reason: collision with root package name */
    private final String f101c;

    /* renamed from: d, reason: collision with root package name */
    private final C1880b f102d;

    /* renamed from: e, reason: collision with root package name */
    private final u.c f103e;

    /* renamed from: f, reason: collision with root package name */
    private final C3686a f104f;

    /* renamed from: g, reason: collision with root package name */
    private final u.d f105g;

    public a(String paymentMethodCode, InterfaceC1925a cbcEligibility, String merchantName, C1880b c1880b, u.c cVar, C3686a c3686a, u.d billingDetailsCollectionConfiguration) {
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.f99a = paymentMethodCode;
        this.f100b = cbcEligibility;
        this.f101c = merchantName;
        this.f102d = c1880b;
        this.f103e = cVar;
        this.f104f = c3686a;
        this.f105g = billingDetailsCollectionConfiguration;
    }

    public final C1880b a() {
        return this.f102d;
    }

    public final u.c b() {
        return this.f103e;
    }

    public final u.d c() {
        return this.f105g;
    }

    public final String d() {
        return this.f101c;
    }

    public final String e() {
        return this.f99a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f99a, aVar.f99a) && AbstractC3159y.d(this.f100b, aVar.f100b) && AbstractC3159y.d(this.f101c, aVar.f101c) && AbstractC3159y.d(this.f102d, aVar.f102d) && AbstractC3159y.d(this.f103e, aVar.f103e) && AbstractC3159y.d(this.f104f, aVar.f104f) && AbstractC3159y.d(this.f105g, aVar.f105g)) {
            return true;
        }
        return false;
    }

    public final C3686a f() {
        return this.f104f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f99a.hashCode() * 31) + this.f100b.hashCode()) * 31) + this.f101c.hashCode()) * 31;
        C1880b c1880b = this.f102d;
        int i8 = 0;
        if (c1880b == null) {
            hashCode = 0;
        } else {
            hashCode = c1880b.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        u.c cVar = this.f103e;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C3686a c3686a = this.f104f;
        if (c3686a != null) {
            i8 = c3686a.hashCode();
        }
        return ((i10 + i8) * 31) + this.f105g.hashCode();
    }

    public String toString() {
        return "FormArguments(paymentMethodCode=" + this.f99a + ", cbcEligibility=" + this.f100b + ", merchantName=" + this.f101c + ", amount=" + this.f102d + ", billingDetails=" + this.f103e + ", shippingDetails=" + this.f104f + ", billingDetailsCollectionConfiguration=" + this.f105g + ")";
    }

    public /* synthetic */ a(String str, InterfaceC1925a interfaceC1925a, String str2, C1880b c1880b, u.c cVar, C3686a c3686a, u.d dVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, interfaceC1925a, str2, (i8 & 8) != 0 ? null : c1880b, (i8 & 16) != 0 ? null : cVar, (i8 & 32) != 0 ? null : c3686a, (i8 & 64) != 0 ? new u.d(null, null, null, null, false, 31, null) : dVar);
    }
}
