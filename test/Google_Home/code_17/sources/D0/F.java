package D0;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Class f1701a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f1702b;

    /* loaded from: classes3.dex */
    private @interface a {
    }

    public F(Class cls, Class cls2) {
        this.f1701a = cls;
        this.f1702b = cls2;
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
        if (!this.f1702b.equals(f8.f1702b)) {
            return false;
        }
        return this.f1701a.equals(f8.f1701a);
    }

    public int hashCode() {
        return (this.f1702b.hashCode() * 31) + this.f1701a.hashCode();
    }

    public String toString() {
        if (this.f1701a == a.class) {
            return this.f1702b.getName();
        }
        return "@" + this.f1701a.getName() + " " + this.f1702b.getName();
    }
}
