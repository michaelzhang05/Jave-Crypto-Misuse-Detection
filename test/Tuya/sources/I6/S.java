package i6;

import i6.AbstractC2826i0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class S extends AbstractC2826i0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g, reason: collision with root package name */
    public static final S f31729g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f31730h;

    static {
        Long l8;
        S s8 = new S();
        f31729g = s8;
        AbstractC2824h0.K(s8, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f31730h = timeUnit.toNanos(l8.longValue());
    }

    private S() {
    }

    private final synchronized void g0() {
        if (!j0()) {
            return;
        }
        debugStatus = 3;
        a0();
        AbstractC3159y.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    private final synchronized Thread h0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean i0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean j0() {
        int i8 = debugStatus;
        if (i8 != 2 && i8 != 3) {
            return false;
        }
        return true;
    }

    private final synchronized boolean k0() {
        if (j0()) {
            return false;
        }
        debugStatus = 1;
        AbstractC3159y.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void l0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // i6.AbstractC2828j0
    protected Thread Q() {
        Thread thread = _thread;
        if (thread == null) {
            return h0();
        }
        return thread;
    }

    @Override // i6.AbstractC2828j0
    protected void R(long j8, AbstractC2826i0.c cVar) {
        l0();
    }

    @Override // i6.AbstractC2826i0
    public void W(Runnable runnable) {
        if (i0()) {
            l0();
        }
        super.W(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean Y7;
        X0.f31735a.d(this);
        AbstractC2813c.a();
        try {
            if (!k0()) {
                if (!Y7) {
                    return;
                } else {
                    return;
                }
            }
            long j8 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long N8 = N();
                if (N8 == Long.MAX_VALUE) {
                    AbstractC2813c.a();
                    long nanoTime = System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f31730h + nanoTime;
                    }
                    long j9 = j8 - nanoTime;
                    if (j9 <= 0) {
                        _thread = null;
                        g0();
                        AbstractC2813c.a();
                        if (!Y()) {
                            Q();
                            return;
                        }
                        return;
                    }
                    N8 = d6.m.h(N8, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (N8 > 0) {
                    if (j0()) {
                        _thread = null;
                        g0();
                        AbstractC2813c.a();
                        if (!Y()) {
                            Q();
                            return;
                        }
                        return;
                    }
                    AbstractC2813c.a();
                    LockSupport.parkNanos(this, N8);
                }
            }
        } finally {
            _thread = null;
            g0();
            AbstractC2813c.a();
            if (!Y()) {
                Q();
            }
        }
    }

    @Override // i6.AbstractC2826i0, i6.AbstractC2824h0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // i6.AbstractC2826i0, i6.W
    public InterfaceC2816d0 w(long j8, Runnable runnable, P5.g gVar) {
        return d0(j8, runnable);
    }
}
