package H6;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3909a;

    /* renamed from: b, reason: collision with root package name */
    public final GBCConsentValue f3910b;

    public b(int i8, GBCConsentValue defaultValue) {
        AbstractC3255y.i(defaultValue, "defaultValue");
        this.f3909a = i8;
        this.f3910b = defaultValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3909a == bVar.f3909a && this.f3910b == bVar.f3910b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3910b.hashCode() + (this.f3909a * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GBCApplicablePurpose(id=");
        a8.append(this.f3909a);
        a8.append(", defaultValue=");
        a8.append(this.f3910b);
        a8.append(')');
        return a8.toString();
    }
}
