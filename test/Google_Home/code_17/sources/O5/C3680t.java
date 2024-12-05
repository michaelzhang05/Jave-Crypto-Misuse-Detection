package o5;

/* renamed from: o5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3680t {

    /* renamed from: a, reason: collision with root package name */
    public static final C3680t f36531a = new C3680t();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f36532b = true;

    /* renamed from: c, reason: collision with root package name */
    private static int f36533c;

    /* renamed from: d, reason: collision with root package name */
    private static int f36534d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f36535e;

    private C3680t() {
    }

    public final int a() {
        return f36533c;
    }

    public final int b() {
        return f36534d;
    }

    public final boolean c() {
        int i8 = f36533c;
        if (i8 == 0) {
            return true;
        }
        if (f36532b && (f36535e || i8 >= 4300)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return f36532b;
    }

    public final boolean e() {
        if (f36532b && (f36535e || f36534d >= 9152)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return f36535e;
    }

    public final void g(int i8) {
        f36533c = i8;
    }

    public final void h(boolean z8) {
        f36532b = z8;
    }

    public final void i(int i8) {
        f36534d = i8;
    }

    public final void j(boolean z8) {
        f36535e = z8;
    }
}
