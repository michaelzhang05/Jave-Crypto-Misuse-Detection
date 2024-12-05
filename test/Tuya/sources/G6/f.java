package g6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31309a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.i f31310b;

    public f(String value, d6.i range) {
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(range, "range");
        this.f31309a = value;
        this.f31310b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f31309a, fVar.f31309a) && AbstractC3159y.d(this.f31310b, fVar.f31310b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31309a.hashCode() * 31) + this.f31310b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f31309a + ", range=" + this.f31310b + ')';
    }
}
