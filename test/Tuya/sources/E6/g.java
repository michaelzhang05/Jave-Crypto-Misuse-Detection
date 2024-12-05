package E6;

import C6.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2381b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2382c;

    public g(List vendorBlacklist, List vendorWhitelist, List googleWhitelist) {
        AbstractC3159y.i(vendorBlacklist, "vendorBlacklist");
        AbstractC3159y.i(vendorWhitelist, "vendorWhitelist");
        AbstractC3159y.i(googleWhitelist, "googleWhitelist");
        this.f2380a = vendorBlacklist;
        this.f2381b = vendorWhitelist;
        this.f2382c = googleWhitelist;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f2380a, gVar.f2380a) && AbstractC3159y.d(this.f2381b, gVar.f2381b) && AbstractC3159y.d(this.f2382c, gVar.f2382c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2382c.hashCode() + l.a(this.f2381b, this.f2380a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PremiumProperties(vendorBlacklist=");
        a8.append(this.f2380a);
        a8.append(", vendorWhitelist=");
        a8.append(this.f2381b);
        a8.append(", googleWhitelist=");
        a8.append(this.f2382c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ g(List list, List list2, List list3, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null, (i8 & 2) != 0 ? new ArrayList() : null, (i8 & 4) != 0 ? new ArrayList() : null);
    }
}
