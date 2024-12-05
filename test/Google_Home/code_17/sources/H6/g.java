package H6;

import F6.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f3930a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3931b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3932c;

    public g(List vendorBlacklist, List vendorWhitelist, List googleWhitelist) {
        AbstractC3255y.i(vendorBlacklist, "vendorBlacklist");
        AbstractC3255y.i(vendorWhitelist, "vendorWhitelist");
        AbstractC3255y.i(googleWhitelist, "googleWhitelist");
        this.f3930a = vendorBlacklist;
        this.f3931b = vendorWhitelist;
        this.f3932c = googleWhitelist;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3255y.d(this.f3930a, gVar.f3930a) && AbstractC3255y.d(this.f3931b, gVar.f3931b) && AbstractC3255y.d(this.f3932c, gVar.f3932c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3932c.hashCode() + l.a(this.f3931b, this.f3930a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PremiumProperties(vendorBlacklist=");
        a8.append(this.f3930a);
        a8.append(", vendorWhitelist=");
        a8.append(this.f3931b);
        a8.append(", googleWhitelist=");
        a8.append(this.f3932c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ g(List list, List list2, List list3, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null, (i8 & 2) != 0 ? new ArrayList() : null, (i8 & 4) != 0 ? new ArrayList() : null);
    }
}
