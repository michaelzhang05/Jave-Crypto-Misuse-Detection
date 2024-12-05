package M7;

import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f7393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7394b;

    public m(String disclosureLabel, String backLabel) {
        AbstractC3255y.i(disclosureLabel, "disclosureLabel");
        AbstractC3255y.i(backLabel, "backLabel");
        this.f7393a = disclosureLabel;
        this.f7394b = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3255y.d(this.f7393a, mVar.f7393a) && AbstractC3255y.d(this.f7394b, mVar.f7394b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7394b.hashCode() + (this.f7393a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PartnersDisclosureLabels(disclosureLabel=");
        a8.append(this.f7393a);
        a8.append(", backLabel=");
        a8.append(this.f7394b);
        a8.append(')');
        return a8.toString();
    }
}
