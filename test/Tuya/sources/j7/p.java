package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f5701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5703c;

    public p(int i8, String label, String state) {
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(state, "state");
        this.f5701a = i8;
        this.f5702b = label;
        this.f5703c = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f5701a == pVar.f5701a && AbstractC3159y.d(this.f5702b, pVar.f5702b) && AbstractC3159y.d(this.f5703c, pVar.f5703c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5703c.hashCode() + t.a(this.f5702b, this.f5701a * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("StackInfo(id=");
        a8.append(this.f5701a);
        a8.append(", label=");
        a8.append(this.f5702b);
        a8.append(", state=");
        a8.append(this.f5703c);
        a8.append(')');
        return a8.toString();
    }
}
