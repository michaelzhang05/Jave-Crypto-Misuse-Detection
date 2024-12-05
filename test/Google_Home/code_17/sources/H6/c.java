package H6;

import F6.l;
import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3912b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3913c;

    public c(boolean z8, List locations, List applicablePurposes) {
        AbstractC3255y.i(locations, "locations");
        AbstractC3255y.i(applicablePurposes, "applicablePurposes");
        this.f3911a = z8;
        this.f3912b = locations;
        this.f3913c = applicablePurposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3911a == cVar.f3911a && AbstractC3255y.d(this.f3912b, cVar.f3912b) && AbstractC3255y.d(this.f3913c, cVar.f3913c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z8 = this.f3911a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return this.f3913c.hashCode() + l.a(this.f3912b, r02 * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GBCConfig(enabled=");
        a8.append(this.f3911a);
        a8.append(", locations=");
        a8.append(this.f3912b);
        a8.append(", applicablePurposes=");
        a8.append(this.f3913c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ c(boolean z8, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? AbstractC1378t.m() : null, (i8 & 4) != 0 ? AbstractC1378t.m() : null);
    }
}
