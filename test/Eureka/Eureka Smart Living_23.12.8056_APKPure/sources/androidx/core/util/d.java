package androidx.core.util;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2263a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2264b;

    public d(Object obj, Object obj2) {
        this.f2263a = obj;
        this.f2264b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f2263a, this.f2263a) && c.a(dVar.f2264b, this.f2264b);
    }

    public int hashCode() {
        Object obj = this.f2263a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2264b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2263a + " " + this.f2264b + "}";
    }
}
