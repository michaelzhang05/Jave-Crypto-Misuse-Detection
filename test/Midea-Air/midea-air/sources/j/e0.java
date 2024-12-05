package j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* compiled from: Timeout.kt */
/* loaded from: classes2.dex */
public class e0 {
    public static final b Companion = new b(null);
    public static final e0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e0 {
        a() {
        }

        @Override // j.e0
        public e0 deadlineNanoTime(long j2) {
            return this;
        }

        @Override // j.e0
        public void throwIfReached() {
        }

        @Override // j.e0
        public e0 timeout(long j2, TimeUnit timeUnit) {
            kotlin.jvm.internal.l.f(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public final long a(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public e0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final e0 deadline(long j2, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f(timeUnit, "unit");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(e0 e0Var, Function0<kotlin.u> function0) {
        kotlin.jvm.internal.l.f(e0Var, "other");
        kotlin.jvm.internal.l.f(function0, "block");
        long timeoutNanos = timeoutNanos();
        long a2 = Companion.a(e0Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), e0Var.deadlineNanoTime()));
            }
            try {
                function0.invoke();
                kotlin.jvm.internal.k.b(1);
                timeout(timeoutNanos, timeUnit);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.k.a(1);
                return;
            } catch (Throwable th) {
                kotlin.jvm.internal.k.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.k.a(1);
                throw th;
            }
        }
        if (e0Var.hasDeadline()) {
            deadlineNanoTime(e0Var.deadlineNanoTime());
        }
        try {
            function0.invoke();
            kotlin.jvm.internal.k.b(1);
            timeout(timeoutNanos, timeUnit);
            if (e0Var.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.k.a(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.k.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (e0Var.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.k.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.l.e(currentThread, "Thread.currentThread()");
        if (!currentThread.isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public e0 timeout(long j2, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f(timeUnit, "unit");
        if (j2 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        kotlin.jvm.internal.l.f(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j2 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j3 = timeoutNanos / 1000000;
                Long.signum(j3);
                obj.wait(j3, (int) (timeoutNanos - (1000000 * j3)));
                j2 = System.nanoTime() - nanoTime;
            }
            if (j2 >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public e0 deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }
}
