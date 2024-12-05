package S6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1415c extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f9874i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f9875j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f9876k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f9877l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f9878m;

    /* renamed from: n, reason: collision with root package name */
    private static C1415c f9879n;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9880f;

    /* renamed from: g, reason: collision with root package name */
    private C1415c f9881g;

    /* renamed from: h, reason: collision with root package name */
    private long f9882h;

    /* renamed from: S6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C1415c c1415c) {
            ReentrantLock f8 = C1415c.f9874i.f();
            f8.lock();
            try {
                if (c1415c.f9880f) {
                    c1415c.f9880f = false;
                    for (C1415c c1415c2 = C1415c.f9879n; c1415c2 != null; c1415c2 = c1415c2.f9881g) {
                        if (c1415c2.f9881g == c1415c) {
                            c1415c2.f9881g = c1415c.f9881g;
                            c1415c.f9881g = null;
                            return false;
                        }
                    }
                    f8.unlock();
                    return true;
                }
                return false;
            } finally {
                f8.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1415c c1415c, long j8, boolean z8) {
            ReentrantLock f8 = C1415c.f9874i.f();
            f8.lock();
            try {
                if (!c1415c.f9880f) {
                    c1415c.f9880f = true;
                    if (C1415c.f9879n == null) {
                        C1415c.f9879n = new C1415c();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j8 != 0 && z8) {
                        c1415c.f9882h = Math.min(j8, c1415c.c() - nanoTime) + nanoTime;
                    } else if (j8 != 0) {
                        c1415c.f9882h = j8 + nanoTime;
                    } else if (z8) {
                        c1415c.f9882h = c1415c.c();
                    } else {
                        throw new AssertionError();
                    }
                    long y8 = c1415c.y(nanoTime);
                    C1415c c1415c2 = C1415c.f9879n;
                    AbstractC3255y.f(c1415c2);
                    while (c1415c2.f9881g != null) {
                        C1415c c1415c3 = c1415c2.f9881g;
                        AbstractC3255y.f(c1415c3);
                        if (y8 < c1415c3.y(nanoTime)) {
                            break;
                        }
                        c1415c2 = c1415c2.f9881g;
                        AbstractC3255y.f(c1415c2);
                    }
                    c1415c.f9881g = c1415c2.f9881g;
                    c1415c2.f9881g = c1415c;
                    if (c1415c2 == C1415c.f9879n) {
                        C1415c.f9874i.e().signal();
                    }
                    O5.I i8 = O5.I.f8278a;
                    f8.unlock();
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } catch (Throwable th) {
                f8.unlock();
                throw th;
            }
        }

        public final C1415c c() {
            C1415c c1415c = C1415c.f9879n;
            AbstractC3255y.f(c1415c);
            C1415c c1415c2 = c1415c.f9881g;
            if (c1415c2 != null) {
                long y8 = c1415c2.y(System.nanoTime());
                if (y8 <= 0) {
                    C1415c c1415c3 = C1415c.f9879n;
                    AbstractC3255y.f(c1415c3);
                    c1415c3.f9881g = c1415c2.f9881g;
                    c1415c2.f9881g = null;
                    return c1415c2;
                }
                e().await(y8, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            e().await(C1415c.f9877l, TimeUnit.MILLISECONDS);
            C1415c c1415c4 = C1415c.f9879n;
            AbstractC3255y.f(c1415c4);
            if (c1415c4.f9881g == null && System.nanoTime() - nanoTime >= C1415c.f9878m) {
                return C1415c.f9879n;
            }
            return null;
        }

        public final Condition e() {
            return C1415c.f9876k;
        }

        public final ReentrantLock f() {
            return C1415c.f9875j;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S6.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f8;
            C1415c c8;
            while (true) {
                try {
                    a aVar = C1415c.f9874i;
                    f8 = aVar.f();
                    f8.lock();
                    try {
                        c8 = aVar.c();
                    } finally {
                        f8.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c8 == C1415c.f9879n) {
                    C1415c.f9879n = null;
                    return;
                }
                O5.I i8 = O5.I.f8278a;
                f8.unlock();
                if (c8 != null) {
                    c8.B();
                }
            }
        }
    }

    /* renamed from: S6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0197c implements X {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X f9884b;

        C0197c(X x8) {
            this.f9884b = x8;
        }

        @Override // S6.X
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1415c timeout() {
            return C1415c.this;
        }

        @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1415c c1415c = C1415c.this;
            X x8 = this.f9884b;
            c1415c.v();
            try {
                x8.close();
                O5.I i8 = O5.I.f8278a;
                if (!c1415c.w()) {
                } else {
                    throw c1415c.p(null);
                }
            } catch (IOException e8) {
                if (!c1415c.w()) {
                    throw e8;
                }
                throw c1415c.p(e8);
            } finally {
                c1415c.w();
            }
        }

        @Override // S6.X, java.io.Flushable
        public void flush() {
            C1415c c1415c = C1415c.this;
            X x8 = this.f9884b;
            c1415c.v();
            try {
                x8.flush();
                O5.I i8 = O5.I.f8278a;
                if (!c1415c.w()) {
                } else {
                    throw c1415c.p(null);
                }
            } catch (IOException e8) {
                if (!c1415c.w()) {
                    throw e8;
                }
                throw c1415c.p(e8);
            } finally {
                c1415c.w();
            }
        }

        @Override // S6.X
        public void h(C1417e source, long j8) {
            AbstractC3255y.i(source, "source");
            AbstractC1414b.b(source.E(), 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 > 0) {
                    U u8 = source.f9887a;
                    AbstractC3255y.f(u8);
                    while (true) {
                        if (j9 >= 65536) {
                            break;
                        }
                        j9 += u8.f9846c - u8.f9845b;
                        if (j9 >= j8) {
                            j9 = j8;
                            break;
                        } else {
                            u8 = u8.f9849f;
                            AbstractC3255y.f(u8);
                        }
                    }
                    C1415c c1415c = C1415c.this;
                    X x8 = this.f9884b;
                    c1415c.v();
                    try {
                        x8.h(source, j9);
                        O5.I i8 = O5.I.f8278a;
                        if (!c1415c.w()) {
                            j8 -= j9;
                        } else {
                            throw c1415c.p(null);
                        }
                    } catch (IOException e8) {
                        if (!c1415c.w()) {
                            throw e8;
                        }
                        throw c1415c.p(e8);
                    } finally {
                        c1415c.w();
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f9884b + ')';
        }
    }

    /* renamed from: S6.c$d */
    /* loaded from: classes5.dex */
    public static final class d implements Z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z f9886b;

        d(Z z8) {
            this.f9886b = z8;
        }

        @Override // S6.Z
        public long C(C1417e sink, long j8) {
            AbstractC3255y.i(sink, "sink");
            C1415c c1415c = C1415c.this;
            Z z8 = this.f9886b;
            c1415c.v();
            try {
                long C8 = z8.C(sink, j8);
                if (!c1415c.w()) {
                    return C8;
                }
                throw c1415c.p(null);
            } catch (IOException e8) {
                if (!c1415c.w()) {
                    throw e8;
                }
                throw c1415c.p(e8);
            } finally {
                c1415c.w();
            }
        }

        @Override // S6.Z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1415c timeout() {
            return C1415c.this;
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1415c c1415c = C1415c.this;
            Z z8 = this.f9886b;
            c1415c.v();
            try {
                z8.close();
                O5.I i8 = O5.I.f8278a;
                if (!c1415c.w()) {
                } else {
                    throw c1415c.p(null);
                }
            } catch (IOException e8) {
                if (!c1415c.w()) {
                    throw e8;
                }
                throw c1415c.p(e8);
            } finally {
                c1415c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f9886b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f9875j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC3255y.h(newCondition, "lock.newCondition()");
        f9876k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f9877l = millis;
        f9878m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j8) {
        return this.f9882h - j8;
    }

    public final Z A(Z source) {
        AbstractC3255y.i(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h8 = h();
        boolean e8 = e();
        if (h8 != 0 || e8) {
            f9874i.g(this, h8, e8);
        }
    }

    public final boolean w() {
        return f9874i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final X z(X sink) {
        AbstractC3255y.i(sink, "sink");
        return new C0197c(sink);
    }

    protected void B() {
    }
}
