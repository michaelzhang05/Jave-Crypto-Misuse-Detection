package J7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f5559a;

    public d(List disclosures) {
        AbstractC3159y.i(disclosures, "disclosures");
        this.f5559a = disclosures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3159y.d(this.f5559a, ((d) obj).f5559a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5559a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("CookieDisclosure(disclosures=");
        a8.append(this.f5559a);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ d(List list, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null);
    }
}
