package l5;

/* renamed from: l5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3332t {

    /* renamed from: a, reason: collision with root package name */
    public static final C3332t f34530a = new C3332t();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34531b = true;

    /* renamed from: c, reason: collision with root package name */
    private static int f34532c;

    /* renamed from: d, reason: collision with root package name */
    private static int f34533d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f34534e;

    private C3332t() {
    }

    public final int a() {
        return f34532c;
    }

    public final int b() {
        return f34533d;
    }

    public final boolean c() {
        int i8 = f34532c;
        if (i8 == 0) {
            return true;
        }
        if (f34531b && (f34534e || i8 >= 4300)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return f34531b;
    }

    public final boolean e() {
        if (f34531b && (f34534e || f34533d >= 9152)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return f34534e;
    }

    public final void g(int i8) {
        f34532c = i8;
    }

    public final void h(boolean z8) {
        f34531b = z8;
    }

    public final void i(int i8) {
        f34533d = i8;
    }

    public final void j(boolean z8) {
        f34534e = z8;
    }
}
