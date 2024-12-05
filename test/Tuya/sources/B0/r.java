package B0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final F f652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f653b;

    /* renamed from: c, reason: collision with root package name */
    private final int f654c;

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

    public static r i(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r j(F f8) {
        return new r(f8, 1, 0);
    }

    public static r k(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r l(F f8) {
        return new r(f8, 1, 1);
    }

    public static r m(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r n(Class cls) {
        return new r(cls, 2, 0);
    }

    public F c() {
        return this.f652a;
    }

    public boolean d() {
        if (this.f654c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f654c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f652a.equals(rVar.f652a) || this.f653b != rVar.f653b || this.f654c != rVar.f654c) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f653b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f653b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f652a.hashCode() ^ 1000003) * 1000003) ^ this.f653b) * 1000003) ^ this.f654c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f652a);
        sb.append(", type=");
        int i8 = this.f653b;
        if (i8 == 1) {
            str = "required";
        } else if (i8 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.f654c));
        sb.append("}");
        return sb.toString();
    }

    private r(F f8, int i8, int i9) {
        this.f652a = (F) E.c(f8, "Null dependency anInterface.");
        this.f653b = i8;
        this.f654c = i9;
    }
}
