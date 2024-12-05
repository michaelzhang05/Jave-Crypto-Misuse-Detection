package s6;

import java.util.concurrent.Executor;
import l6.AbstractC3371n0;
import l6.I;
import q6.G;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC4007b extends AbstractC3371n0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC4007b f39308b = new ExecutorC4007b();

    /* renamed from: c, reason: collision with root package name */
    private static final I f39309c;

    static {
        int e8;
        C4018m c4018m = C4018m.f39329a;
        e8 = q6.I.e("kotlinx.coroutines.io.parallelism", g6.m.d(64, G.a()), 0, 0, 12, null);
        f39309c = c4018m.limitedParallelism(e8);
    }

    private ExecutorC4007b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // l6.I
    public void dispatch(S5.g gVar, Runnable runnable) {
        f39309c.dispatch(gVar, runnable);
    }

    @Override // l6.I
    public void dispatchYield(S5.g gVar, Runnable runnable) {
        f39309c.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(S5.h.f9825a, runnable);
    }

    @Override // l6.I
    public I limitedParallelism(int i8) {
        return C4018m.f39329a.limitedParallelism(i8);
    }

    @Override // l6.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
