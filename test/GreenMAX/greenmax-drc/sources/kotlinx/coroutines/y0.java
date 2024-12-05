package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class y0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    private long f22300g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22301h;

    /* renamed from: i, reason: collision with root package name */
    private kotlinx.coroutines.internal.a<s0<?>> f22302i;

    private final long v0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void z0(y0 y0Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        y0Var.y0(z);
    }

    public final boolean A0() {
        return this.f22300g >= v0(true);
    }

    public final boolean B0() {
        kotlinx.coroutines.internal.a<s0<?>> aVar = this.f22302i;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean C0() {
        s0<?> d2;
        kotlinx.coroutines.internal.a<s0<?>> aVar = this.f22302i;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return false;
        }
        d2.run();
        return true;
    }

    protected void shutdown() {
    }

    public final void u0(boolean z) {
        long v0 = this.f22300g - v0(z);
        this.f22300g = v0;
        if (v0 > 0) {
            return;
        }
        if (l0.a()) {
            if (!(this.f22300g == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f22301h) {
            shutdown();
        }
    }

    public final void w0(s0<?> s0Var) {
        kotlinx.coroutines.internal.a<s0<?>> aVar = this.f22302i;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f22302i = aVar;
        }
        aVar.a(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long x0() {
        kotlinx.coroutines.internal.a<s0<?>> aVar = this.f22302i;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void y0(boolean z) {
        this.f22300g += v0(z);
        if (z) {
            return;
        }
        this.f22301h = true;
    }
}
