package z3;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f10033a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10034b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10035c;

    private r(Class cls, int i6, int i7) {
        this(e0.b(cls), i6, i7);
    }

    private static String a(int i6) {
        if (i6 == 0) {
            return "direct";
        }
        if (i6 == 1) {
            return "provider";
        }
        if (i6 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i6);
    }

    public static r g(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r h(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r i(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r j(e0 e0Var) {
        return new r(e0Var, 1, 0);
    }

    public static r k(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r l(Class cls) {
        return new r(cls, 2, 0);
    }

    public e0 b() {
        return this.f10033a;
    }

    public boolean c() {
        return this.f10035c == 2;
    }

    public boolean d() {
        return this.f10035c == 0;
    }

    public boolean e() {
        return this.f10034b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10033a.equals(rVar.f10033a) && this.f10034b == rVar.f10034b && this.f10035c == rVar.f10035c;
    }

    public boolean f() {
        return this.f10034b == 2;
    }

    public int hashCode() {
        return ((((this.f10033a.hashCode() ^ 1000003) * 1000003) ^ this.f10034b) * 1000003) ^ this.f10035c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f10033a);
        sb.append(", type=");
        int i6 = this.f10034b;
        sb.append(i6 == 1 ? "required" : i6 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f10035c));
        sb.append("}");
        return sb.toString();
    }

    private r(e0 e0Var, int i6, int i7) {
        this.f10033a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.f10034b = i6;
        this.f10035c = i7;
    }
}
