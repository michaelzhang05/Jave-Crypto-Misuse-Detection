package D0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final F f1758a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1759b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1760c;

    private r(Class cls, int i8, int i9) {
        this(F.b(cls), i8, i9);
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i8);
            }
            return "provider";
        }
        return "direct";
    }

    public static r h(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r i(F f8) {
        return new r(f8, 0, 1);
    }

    public static r j(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r k(F f8) {
        return new r(f8, 1, 0);
    }

    public static r l(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r m(F f8) {
        return new r(f8, 1, 1);
    }

    public static r n(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r o(Class cls) {
        return new r(cls, 2, 0);
    }

    public F c() {
        return this.f1758a;
    }

    public boolean d() {
        if (this.f1760c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f1760c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f1758a.equals(rVar.f1758a) || this.f1759b != rVar.f1759b || this.f1760c != rVar.f1760c) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f1759b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f1759b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1758a.hashCode() ^ 1000003) * 1000003) ^ this.f1759b) * 1000003) ^ this.f1760c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f1758a);
        sb.append(", type=");
        int i8 = this.f1759b;
        if (i8 == 1) {
            str = "required";
        } else if (i8 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.f1760c));
        sb.append("}");
        return sb.toString();
    }

    private r(F f8, int i8, int i9) {
        this.f1758a = (F) E.c(f8, "Null dependency anInterface.");
        this.f1759b = i8;
        this.f1760c = i9;
    }
}
