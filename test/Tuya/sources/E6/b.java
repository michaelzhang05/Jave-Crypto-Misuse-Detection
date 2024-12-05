package E6;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final GBCConsentValue f2360b;

    public b(int i8, GBCConsentValue defaultValue) {
        AbstractC3159y.i(defaultValue, "defaultValue");
        this.f2359a = i8;
        this.f2360b = defaultValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2359a == bVar.f2359a && this.f2360b == bVar.f2360b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2360b.hashCode() + (this.f2359a * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCApplicablePurpose(id=");
        a8.append(this.f2359a);
        a8.append(", defaultValue=");
        a8.append(this.f2360b);
        a8.append(')');
        return a8.toString();
    }
}
