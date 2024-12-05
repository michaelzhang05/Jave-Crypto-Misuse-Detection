package B5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Long f937a;

    /* renamed from: b, reason: collision with root package name */
    public Map f938b;

    public g(Long l8, Map cmpInfoMap) {
        AbstractC3255y.i(cmpInfoMap, "cmpInfoMap");
        this.f937a = l8;
        this.f938b = cmpInfoMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3255y.d(this.f937a, gVar.f937a) && AbstractC3255y.d(this.f938b, gVar.f938b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Long l8 = this.f937a;
        if (l8 == null) {
            hashCode = 0;
        } else {
            hashCode = l8.hashCode();
        }
        return this.f938b.hashCode() + (hashCode * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("IabApprovedCmpList(lastUpdated=");
        a8.append(this.f937a);
        a8.append(", cmpInfoMap=");
        a8.append(this.f938b);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ g(Long l8, Map map, int i8) {
        this(null, (i8 & 2) != 0 ? new LinkedHashMap() : null);
    }
}
