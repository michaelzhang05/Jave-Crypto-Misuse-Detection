package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class n0 extends z0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final n0 l;
    private static final long m;

    static {
        Long l2;
        n0 n0Var = new n0();
        l = n0Var;
        y0.z0(n0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        m = timeUnit.toNanos(l2.longValue());
    }

    private n0() {
    }

    private final synchronized void U0() {
        if (W0()) {
            debugStatus = 3;
            P0();
            notifyAll();
        }
    }

    private final synchronized Thread V0() {
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

    private final boolean W0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean X0() {
        if (W0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // kotlinx.coroutines.a1
    protected Thread D0() {
        Thread thread = _thread;
        return thread == null ? V0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        b2.a.c(this);
        if (e.a() != null) {
            throw null;
        }
        try {
            if (!X0()) {
                _thread = null;
                U0();
                if (e.a() == null) {
                    if (M0()) {
                        return;
                    }
                    D0();
                    return;
                }
                throw null;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long N0 = N0();
                if (N0 != Long.MAX_VALUE) {
                    j2 = Long.MAX_VALUE;
                } else {
                    if (e.a() != null) {
                        throw null;
                    }
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = m + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        U0();
                        if (e.a() == null) {
                            if (M0()) {
                                return;
                            }
                            D0();
                            return;
                        }
                        throw null;
                    }
                    N0 = kotlin.ranges.f.e(N0, j3);
                }
                if (N0 > 0) {
                    if (W0()) {
                        _thread = null;
                        U0();
                        if (e.a() == null) {
                            if (M0()) {
                                return;
                            }
                            D0();
                            return;
                        }
                        throw null;
                    }
                    if (e.a() != null) {
                        throw null;
                    }
                    LockSupport.parkNanos(this, N0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            U0();
            if (e.a() == null) {
                if (!M0()) {
                    D0();
                }
                throw th;
            }
            throw null;
        }
    }
}
