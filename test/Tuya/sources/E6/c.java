package E6;

import C6.l;
import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2361a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2362b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2363c;

    public c(boolean z8, List locations, List applicablePurposes) {
        AbstractC3159y.i(locations, "locations");
        AbstractC3159y.i(applicablePurposes, "applicablePurposes");
        this.f2361a = z8;
        this.f2362b = locations;
        this.f2363c = applicablePurposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2361a == cVar.f2361a && AbstractC3159y.d(this.f2362b, cVar.f2362b) && AbstractC3159y.d(this.f2363c, cVar.f2363c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z8 = this.f2361a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return this.f2363c.hashCode() + l.a(this.f2362b, r02 * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCConfig(enabled=");
        a8.append(this.f2361a);
        a8.append(", locations=");
        a8.append(this.f2362b);
        a8.append(", applicablePurposes=");
        a8.append(this.f2363c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ c(boolean z8, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? AbstractC1246t.m() : null, (i8 & 4) != 0 ? AbstractC1246t.m() : null);
    }
}
