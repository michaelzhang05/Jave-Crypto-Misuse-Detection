package B0;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Class f596a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f597b;

    /* loaded from: classes3.dex */
    private @interface a {
    }

    public F(Class cls, Class cls2) {
        this.f596a = cls;
        this.f597b = cls2;
    }

    public static F a(Class cls, Class cls2) {
        return new F(cls, cls2);
    }

    public static F b(Class cls) {
        return new F(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f8 = (F) obj;
        if (!this.f597b.equals(f8.f597b)) {
            return false;
        }
        return this.f596a.equals(f8.f596a);
    }

    public int hashCode() {
        return (this.f597b.hashCode() * 31) + this.f596a.hashCode();
    }

    public String toString() {
        if (this.f596a == a.class) {
            return this.f597b.getName();
        }
        return "@" + this.f596a.getName() + " " + this.f597b.getName();
    }
}
