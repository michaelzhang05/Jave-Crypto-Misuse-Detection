package l6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3361i0;

/* loaded from: classes5.dex */
public final class S extends AbstractC3361i0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g, reason: collision with root package name */
    public static final S f34581g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f34582h;

    static {
        Long l8;
        S s8 = new S();
        f34581g = s8;
        AbstractC3359h0.K(s8, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f34582h = timeUnit.toNanos(l8.longValue());
    }

    private S() {
    }

    private final synchronized void g0() {
        if (!j0()) {
            return;
        }
        debugStatus = 3;
        a0();
        AbstractC3255y.g(this, "null cannot be cast to non-null type java.lang.Object");
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
        AbstractC3255y.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void l0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l6.AbstractC3363j0
    protected Thread Q() {
        Thread thread = _thread;
        if (thread == null) {
            return h0();
        }
        return thread;
    }

    @Override // l6.AbstractC3363j0
    protected void R(long j8, AbstractC3361i0.c cVar) {
        l0();
    }

    @Override // l6.AbstractC3361i0
    public void W(Runnable runnable) {
        if (i0()) {
            l0();
        }
        super.W(runnable);
    }

    @Override // l6.AbstractC3361i0, l6.W
    public InterfaceC3351d0 l(long j8, Runnable runnable, S5.g gVar) {
        return d0(j8, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean Y7;
        X0.f34587a.d(this);
        AbstractC3348c.a();
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
                    AbstractC3348c.a();
                    long nanoTime = System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f34582h + nanoTime;
                    }
                    long j9 = j8 - nanoTime;
                    if (j9 <= 0) {
                        _thread = null;
                        g0();
                        AbstractC3348c.a();
                        if (!Y()) {
                            Q();
                            return;
                        }
                        return;
                    }
                    N8 = g6.m.h(N8, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (N8 > 0) {
                    if (j0()) {
                        _thread = null;
                        g0();
                        AbstractC3348c.a();
                        if (!Y()) {
                            Q();
                            return;
                        }
                        return;
                    }
                    AbstractC3348c.a();
                    LockSupport.parkNanos(this, N8);
                }
            }
        } finally {
            _thread = null;
            g0();
            AbstractC3348c.a();
            if (!Y()) {
                Q();
            }
        }
    }

    @Override // l6.AbstractC3361i0, l6.AbstractC3359h0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
