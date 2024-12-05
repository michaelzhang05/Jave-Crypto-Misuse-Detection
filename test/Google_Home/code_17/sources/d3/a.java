package D3;

import com.stripe.android.paymentsheet.u;
import e4.C2801b;
import f4.InterfaceC2835a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u3.C4059a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1801a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2835a f1802b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1803c;

    /* renamed from: d, reason: collision with root package name */
    private final C2801b f1804d;

    /* renamed from: e, reason: collision with root package name */
    private final u.c f1805e;

    /* renamed from: f, reason: collision with root package name */
    private final C4059a f1806f;

    /* renamed from: g, reason: collision with root package name */
    private final u.d f1807g;

    public a(String paymentMethodCode, InterfaceC2835a cbcEligibility, String merchantName, C2801b c2801b, u.c cVar, C4059a c4059a, u.d billingDetailsCollectionConfiguration) {
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.f1801a = paymentMethodCode;
        this.f1802b = cbcEligibility;
        this.f1803c = merchantName;
        this.f1804d = c2801b;
        this.f1805e = cVar;
        this.f1806f = c4059a;
        this.f1807g = billingDetailsCollectionConfiguration;
    }

    public final C2801b a() {
        return this.f1804d;
    }

    public final u.c b() {
        return this.f1805e;
    }

    public final u.d c() {
        return this.f1807g;
    }

    public final String d() {
        return this.f1803c;
    }

    public final String e() {
        return this.f1801a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f1801a, aVar.f1801a) && AbstractC3255y.d(this.f1802b, aVar.f1802b) && AbstractC3255y.d(this.f1803c, aVar.f1803c) && AbstractC3255y.d(this.f1804d, aVar.f1804d) && AbstractC3255y.d(this.f1805e, aVar.f1805e) && AbstractC3255y.d(this.f1806f, aVar.f1806f) && AbstractC3255y.d(this.f1807g, aVar.f1807g)) {
            return true;
        }
        return false;
    }

    public final C4059a f() {
        return this.f1806f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f1801a.hashCode() * 31) + this.f1802b.hashCode()) * 31) + this.f1803c.hashCode()) * 31;
        C2801b c2801b = this.f1804d;
        int i8 = 0;
        if (c2801b == null) {
            hashCode = 0;
        } else {
            hashCode = c2801b.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        u.c cVar = this.f1805e;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C4059a c4059a = this.f1806f;
        if (c4059a != null) {
            i8 = c4059a.hashCode();
        }
        return ((i10 + i8) * 31) + this.f1807g.hashCode();
    }

    public String toString() {
        return "FormArguments(paymentMethodCode=" + this.f1801a + ", cbcEligibility=" + this.f1802b + ", merchantName=" + this.f1803c + ", amount=" + this.f1804d + ", billingDetails=" + this.f1805e + ", shippingDetails=" + this.f1806f + ", billingDetailsCollectionConfiguration=" + this.f1807g + ")";
    }

    public /* synthetic */ a(String str, InterfaceC2835a interfaceC2835a, String str2, C2801b c2801b, u.c cVar, C4059a c4059a, u.d dVar, int i8, AbstractC3247p abstractC3247p) {
        this(str, interfaceC2835a, str2, (i8 & 8) != 0 ? null : c2801b, (i8 & 16) != 0 ? null : cVar, (i8 & 32) != 0 ? null : c4059a, (i8 & 64) != 0 ? new u.d(null, null, null, null, false, 31, null) : dVar);
    }
}
