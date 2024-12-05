package M7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7409c;

    public p(int i8, String label, String state) {
        AbstractC3255y.i(label, "label");
        AbstractC3255y.i(state, "state");
        this.f7407a = i8;
        this.f7408b = label;
        this.f7409c = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7407a == pVar.f7407a && AbstractC3255y.d(this.f7408b, pVar.f7408b) && AbstractC3255y.d(this.f7409c, pVar.f7409c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7409c.hashCode() + t.a(this.f7408b, this.f7407a * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("StackInfo(id=");
        a8.append(this.f7407a);
        a8.append(", label=");
        a8.append(this.f7408b);
        a8.append(", state=");
        a8.append(this.f7409c);
        a8.append(')');
        return a8.toString();
    }
}
