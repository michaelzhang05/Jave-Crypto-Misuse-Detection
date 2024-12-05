package M7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f7265a;

    public d(List disclosures) {
        AbstractC3255y.i(disclosures, "disclosures");
        this.f7265a = disclosures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3255y.d(this.f7265a, ((d) obj).f7265a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7265a.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("CookieDisclosure(disclosures=");
        a8.append(this.f7265a);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ d(List list, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null);
    }
}
