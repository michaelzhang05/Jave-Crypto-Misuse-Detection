package c.h.j;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class f<F, S> {
    public final F a;

    /* renamed from: b, reason: collision with root package name */
    public final S f2746b;

    public f(F f2, S s) {
        this.a = f2;
        this.f2746b = s;
    }

    public static <A, B> f<A, B> a(A a, B b2) {
        return new f<>(a, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.a(fVar.a, this.a) && e.a(fVar.f2746b, this.f2746b);
    }

    public int hashCode() {
        F f2 = this.a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f2746b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.f2746b + "}";
    }
}
