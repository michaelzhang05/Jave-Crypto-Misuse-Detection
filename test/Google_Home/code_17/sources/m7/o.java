package M7;

import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f7405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7406b;

    public o(String label, String link) {
        AbstractC3255y.i(label, "label");
        AbstractC3255y.i(link, "link");
        this.f7405a = label;
        this.f7406b = link;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3255y.d(this.f7405a, oVar.f7405a) && AbstractC3255y.d(this.f7406b, oVar.f7406b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7406b.hashCode() + (this.f7405a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PublisherCustomLink(label=");
        a8.append(this.f7405a);
        a8.append(", link=");
        a8.append(this.f7406b);
        a8.append(')');
        return a8.toString();
    }
}
