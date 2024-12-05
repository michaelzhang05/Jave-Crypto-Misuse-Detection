package t3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f39701a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.p f39702b;

    public o(List items, com.stripe.android.paymentsheet.p pVar) {
        AbstractC3255y.i(items, "items");
        this.f39701a = items;
        this.f39702b = pVar;
    }

    public final List a() {
        return this.f39701a;
    }

    public final com.stripe.android.paymentsheet.p b() {
        return this.f39702b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3255y.d(this.f39701a, oVar.f39701a) && AbstractC3255y.d(this.f39702b, oVar.f39702b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f39701a.hashCode() * 31;
        com.stripe.android.paymentsheet.p pVar = this.f39702b;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.f39701a + ", selectedItem=" + this.f39702b + ")";
    }
}
