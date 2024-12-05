package z3;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f9993a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f9994b;

    /* loaded from: classes.dex */
    private @interface a {
    }

    public e0(Class cls, Class cls2) {
        this.f9993a = cls;
        this.f9994b = cls2;
    }

    public static e0 a(Class cls, Class cls2) {
        return new e0(cls, cls2);
    }

    public static e0 b(Class cls) {
        return new e0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f9994b.equals(e0Var.f9994b)) {
            return this.f9993a.equals(e0Var.f9993a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f9994b.hashCode() * 31) + this.f9993a.hashCode();
    }

    public String toString() {
        if (this.f9993a == a.class) {
            return this.f9994b.getName();
        }
        return "@" + this.f9993a.getName() + " " + this.f9994b.getName();
    }
}
