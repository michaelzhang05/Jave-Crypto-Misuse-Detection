package S6;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1421i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9902a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9903b;

    /* renamed from: c, reason: collision with root package name */
    private int f9904c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f9905d = c0.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1421i f9906a;

        /* renamed from: b, reason: collision with root package name */
        private long f9907b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9908c;

        public a(AbstractC1421i fileHandle, long j8) {
            AbstractC3255y.i(fileHandle, "fileHandle");
            this.f9906a = fileHandle;
            this.f9907b = j8;
        }

        @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f9908c) {
                return;
            }
            this.f9908c = true;
            ReentrantLock m8 = this.f9906a.m();
            m8.lock();
            try {
                AbstractC1421i abstractC1421i = this.f9906a;
                abstractC1421i.f9904c--;
                if (this.f9906a.f9904c == 0 && this.f9906a.f9903b) {
                    O5.I i8 = O5.I.f8278a;
                    m8.unlock();
                    this.f9906a.n();
                }
            } finally {
                m8.unlock();
            }
        }

        @Override // S6.X, java.io.Flushable
        public void flush() {
            if (!this.f9908c) {
                this.f9906a.o();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // S6.X
        public void h(C1417e source, long j8) {
            AbstractC3255y.i(source, "source");
            if (!this.f9908c) {
                this.f9906a.F(this.f9907b, source, j8);
                this.f9907b += j8;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // S6.X
        public a0 timeout() {
            return a0.f9862e;
        }
    }

    /* renamed from: S6.i$b */
    /* loaded from: classes5.dex */
    private static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1421i f9909a;

        /* renamed from: b, reason: collision with root package name */
        private long f9910b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9911c;

        public b(AbstractC1421i fileHandle, long j8) {
            AbstractC3255y.i(fileHandle, "fileHandle");
            this.f9909a = fileHandle;
            this.f9910b = j8;
        }

        @Override // S6.Z
        public long C(C1417e sink, long j8) {
            AbstractC3255y.i(sink, "sink");
            if (!this.f9911c) {
                long x8 = this.f9909a.x(this.f9910b, sink, j8);
                if (x8 != -1) {
                    this.f9910b += x8;
                }
                return x8;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f9911c) {
                return;
            }
            this.f9911c = true;
            ReentrantLock m8 = this.f9909a.m();
            m8.lock();
            try {
                AbstractC1421i abstractC1421i = this.f9909a;
                abstractC1421i.f9904c--;
                if (this.f9909a.f9904c == 0 && this.f9909a.f9903b) {
                    O5.I i8 = O5.I.f8278a;
                    m8.unlock();
                    this.f9909a.n();
                }
            } finally {
                m8.unlock();
            }
        }

        @Override // S6.Z
        public a0 timeout() {
            return a0.f9862e;
        }
    }

    public AbstractC1421i(boolean z8) {
        this.f9902a = z8;
    }

    public static /* synthetic */ X A(AbstractC1421i abstractC1421i, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            return abstractC1421i.y(j8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j8, C1417e c1417e, long j9) {
        AbstractC1414b.b(c1417e.E(), 0L, j9);
        long j10 = j9 + j8;
        while (j8 < j10) {
            U u8 = c1417e.f9887a;
            AbstractC3255y.f(u8);
            int min = (int) Math.min(j10 - j8, u8.f9846c - u8.f9845b);
            v(j8, u8.f9844a, u8.f9845b, min);
            u8.f9845b += min;
            long j11 = min;
            j8 += j11;
            c1417e.D(c1417e.E() - j11);
            if (u8.f9845b == u8.f9846c) {
                c1417e.f9887a = u8.b();
                V.b(u8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x(long j8, C1417e c1417e, long j9) {
        if (j9 >= 0) {
            long j10 = j9 + j8;
            long j11 = j8;
            while (true) {
                if (j11 >= j10) {
                    break;
                }
                U H8 = c1417e.H(1);
                int s8 = s(j11, H8.f9844a, H8.f9846c, (int) Math.min(j10 - j11, 8192 - r7));
                if (s8 == -1) {
                    if (H8.f9845b == H8.f9846c) {
                        c1417e.f9887a = H8.b();
                        V.b(H8);
                    }
                    if (j8 == j11) {
                        return -1L;
                    }
                } else {
                    H8.f9846c += s8;
                    long j12 = s8;
                    j11 += j12;
                    c1417e.D(c1417e.E() + j12);
                }
            }
            return j11 - j8;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
    }

    public final long D() {
        ReentrantLock reentrantLock = this.f9905d;
        reentrantLock.lock();
        try {
            if (!this.f9903b) {
                O5.I i8 = O5.I.f8278a;
                reentrantLock.unlock();
                return u();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Z E(long j8) {
        ReentrantLock reentrantLock = this.f9905d;
        reentrantLock.lock();
        try {
            if (!this.f9903b) {
                this.f9904c++;
                reentrantLock.unlock();
                return new b(this, j8);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f9905d;
        reentrantLock.lock();
        try {
            if (this.f9903b) {
                return;
            }
            this.f9903b = true;
            if (this.f9904c != 0) {
                return;
            }
            O5.I i8 = O5.I.f8278a;
            reentrantLock.unlock();
            n();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f9902a) {
            ReentrantLock reentrantLock = this.f9905d;
            reentrantLock.lock();
            try {
                if (!this.f9903b) {
                    O5.I i8 = O5.I.f8278a;
                    reentrantLock.unlock();
                    o();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final ReentrantLock m() {
        return this.f9905d;
    }

    protected abstract void n();

    protected abstract void o();

    protected abstract int s(long j8, byte[] bArr, int i8, int i9);

    protected abstract long u();

    protected abstract void v(long j8, byte[] bArr, int i8, int i9);

    public final X y(long j8) {
        if (this.f9902a) {
            ReentrantLock reentrantLock = this.f9905d;
            reentrantLock.lock();
            try {
                if (!this.f9903b) {
                    this.f9904c++;
                    reentrantLock.unlock();
                    return new a(this, j8);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }
}
