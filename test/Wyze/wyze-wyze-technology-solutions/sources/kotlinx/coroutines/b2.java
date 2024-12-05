package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class b2 {
    public static final b2 a = new b2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<y0> f22137b = new ThreadLocal<>();

    private b2() {
    }

    public final y0 a() {
        ThreadLocal<y0> threadLocal = f22137b;
        y0 y0Var = threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        y0 a2 = b1.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void b() {
        f22137b.set(null);
    }

    public final void c(y0 y0Var) {
        f22137b.set(y0Var);
    }
}
