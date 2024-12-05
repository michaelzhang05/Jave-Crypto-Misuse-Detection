package j6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f34036a;

    /* renamed from: b, reason: collision with root package name */
    private final g6.i f34037b;

    public f(String value, g6.i range) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(range, "range");
        this.f34036a = value;
        this.f34037b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f34036a, fVar.f34036a) && AbstractC3255y.d(this.f34037b, fVar.f34037b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34036a.hashCode() * 31) + this.f34037b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f34036a + ", range=" + this.f34037b + ')';
    }
}
