package p6;

import i6.AbstractC2836n0;
import i6.I;
import java.util.concurrent.Executor;
import n6.G;

/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC3613b extends AbstractC2836n0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC3613b f37109b = new ExecutorC3613b();

    /* renamed from: c, reason: collision with root package name */
    private static final I f37110c;

    static {
        int e8;
        C3624m c3624m = C3624m.f37130a;
        e8 = n6.I.e("kotlinx.coroutines.io.parallelism", d6.m.d(64, G.a()), 0, 0, 12, null);
        f37110c = c3624m.limitedParallelism(e8);
    }

    private ExecutorC3613b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // i6.I
    public void dispatch(P5.g gVar, Runnable runnable) {
        f37110c.dispatch(gVar, runnable);
    }

    @Override // i6.I
    public void dispatchYield(P5.g gVar, Runnable runnable) {
        f37110c.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(P5.h.f7994a, runnable);
    }

    @Override // i6.I
    public I limitedParallelism(int i8) {
        return C3624m.f37130a.limitedParallelism(i8);
    }

    @Override // i6.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
