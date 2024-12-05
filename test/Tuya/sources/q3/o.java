package q3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f37379a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.p f37380b;

    public o(List items, com.stripe.android.paymentsheet.p pVar) {
        AbstractC3159y.i(items, "items");
        this.f37379a = items;
        this.f37380b = pVar;
    }

    public final List a() {
        return this.f37379a;
    }

    public final com.stripe.android.paymentsheet.p b() {
        return this.f37380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f37379a, oVar.f37379a) && AbstractC3159y.d(this.f37380b, oVar.f37380b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f37379a.hashCode() * 31;
        com.stripe.android.paymentsheet.p pVar = this.f37380b;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.f37379a + ", selectedItem=" + this.f37380b + ")";
    }
}
