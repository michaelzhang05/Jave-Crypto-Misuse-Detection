package j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public class d extends e0 {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static d head;
    private boolean inQueue;
    private d next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                if (!dVar.inQueue) {
                    return false;
                }
                dVar.inQueue = false;
                for (d dVar2 = d.head; dVar2 != null; dVar2 = dVar2.next) {
                    if (dVar2.next == dVar) {
                        dVar2.next = dVar.next;
                        dVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(d dVar, long j2, boolean z) {
            synchronized (d.class) {
                if (!dVar.inQueue) {
                    dVar.inQueue = true;
                    if (d.head == null) {
                        d.head = new d();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        dVar.timeoutAt = Math.min(j2, dVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j2 != 0) {
                        dVar.timeoutAt = j2 + nanoTime;
                    } else if (z) {
                        dVar.timeoutAt = dVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = dVar.remainingNanos(nanoTime);
                    d dVar2 = d.head;
                    kotlin.jvm.internal.l.c(dVar2);
                    while (dVar2.next != null) {
                        d dVar3 = dVar2.next;
                        kotlin.jvm.internal.l.c(dVar3);
                        if (remainingNanos < dVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        dVar2 = dVar2.next;
                        kotlin.jvm.internal.l.c(dVar2);
                    }
                    dVar.next = dVar2.next;
                    dVar2.next = dVar;
                    if (dVar2 == d.head) {
                        d.class.notify();
                    }
                    kotlin.u uVar = kotlin.u.a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        public final d c() throws InterruptedException {
            d dVar = d.head;
            kotlin.jvm.internal.l.c(dVar);
            d dVar2 = dVar.next;
            if (dVar2 != null) {
                long remainingNanos = dVar2.remainingNanos(System.nanoTime());
                if (remainingNanos <= 0) {
                    d dVar3 = d.head;
                    kotlin.jvm.internal.l.c(dVar3);
                    dVar3.next = dVar2.next;
                    dVar2.next = null;
                    return dVar2;
                }
                long j2 = remainingNanos / 1000000;
                d.class.wait(j2, (int) (remainingNanos - (1000000 * j2)));
                return null;
            }
            long nanoTime = System.nanoTime();
            d.class.wait(d.IDLE_TIMEOUT_MILLIS);
            d dVar4 = d.head;
            kotlin.jvm.internal.l.c(dVar4);
            if (dVar4.next != null || System.nanoTime() - nanoTime < d.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return d.head;
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d c2;
            while (true) {
                try {
                    synchronized (d.class) {
                        try {
                            c2 = d.Companion.c();
                            if (c2 == d.head) {
                                d.head = null;
                                return;
                            }
                            kotlin.u uVar = kotlin.u.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c2 != null) {
                        c2.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b0 {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f19355g;

        c(b0 b0Var) {
            this.f19355g = b0Var;
        }

        @Override // j.b0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d timeout() {
            return d.this;
        }

        @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f19355g.close();
                kotlin.u uVar = kotlin.u.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        @Override // j.b0, java.io.Flushable
        public void flush() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f19355g.flush();
                kotlin.u uVar = kotlin.u.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f19355g + ')';
        }

        @Override // j.b0
        public void write(f fVar, long j2) {
            kotlin.jvm.internal.l.f(fVar, "source");
            j.c.b(fVar.size(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                y yVar = fVar.f19358f;
                kotlin.jvm.internal.l.c(yVar);
                while (true) {
                    if (j3 >= d.TIMEOUT_WRITE_SIZE) {
                        break;
                    }
                    j3 += yVar.f19407d - yVar.f19406c;
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                    }
                }
                d dVar = d.this;
                dVar.enter();
                try {
                    this.f19355g.write(fVar, j3);
                    kotlin.u uVar = kotlin.u.a;
                    if (dVar.exit()) {
                        throw dVar.access$newTimeoutException(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    if (!dVar.exit()) {
                        throw e2;
                    }
                    throw dVar.access$newTimeoutException(e2);
                } finally {
                    dVar.exit();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0269d implements d0 {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0 f19357g;

        C0269d(d0 d0Var) {
            this.f19357g = d0Var;
        }

        @Override // j.d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d timeout() {
            return d.this;
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f19357g.close();
                kotlin.u uVar = kotlin.u.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        @Override // j.d0
        public long read(f fVar, long j2) {
            kotlin.jvm.internal.l.f(fVar, "sink");
            d dVar = d.this;
            dVar.enter();
            try {
                long read = this.f19357g.read(fVar, j2);
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e2) {
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(e2);
                }
                throw e2;
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f19357g + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final b0 sink(b0 b0Var) {
        kotlin.jvm.internal.l.f(b0Var, "sink");
        return new c(b0Var);
    }

    public final d0 source(d0 d0Var) {
        kotlin.jvm.internal.l.f(d0Var, "source");
        return new C0269d(d0Var);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> function0) {
        kotlin.jvm.internal.l.f(function0, "block");
        enter();
        try {
            try {
                T invoke = function0.invoke();
                kotlin.jvm.internal.k.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.k.a(1);
                return invoke;
            } catch (IOException e2) {
                if (exit()) {
                    throw access$newTimeoutException(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.k.b(1);
            exit();
            kotlin.jvm.internal.k.a(1);
            throw th;
        }
    }
}
