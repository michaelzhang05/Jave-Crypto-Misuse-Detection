package P6;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1283i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8071a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8072b;

    /* renamed from: c, reason: collision with root package name */
    private int f8073c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f8074d = c0.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1283i f8075a;

        /* renamed from: b, reason: collision with root package name */
        private long f8076b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8077c;

        public a(AbstractC1283i fileHandle, long j8) {
            AbstractC3159y.i(fileHandle, "fileHandle");
            this.f8075a = fileHandle;
            this.f8076b = j8;
        }

        @Override // P6.X
        public void C(C1279e source, long j8) {
            AbstractC3159y.i(source, "source");
            if (!this.f8077c) {
                this.f8075a.F(this.f8076b, source, j8);
                this.f8076b += j8;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8077c) {
                return;
            }
            this.f8077c = true;
            ReentrantLock h8 = this.f8075a.h();
            h8.lock();
            try {
                AbstractC1283i abstractC1283i = this.f8075a;
                abstractC1283i.f8073c--;
                if (this.f8075a.f8073c == 0 && this.f8075a.f8072b) {
                    L5.I i8 = L5.I.f6487a;
                    h8.unlock();
                    this.f8075a.l();
                }
            } finally {
                h8.unlock();
            }
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            if (!this.f8077c) {
                this.f8075a.m();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // P6.X
        public a0 timeout() {
            return a0.f8031e;
        }
    }

    /* renamed from: P6.i$b */
    /* loaded from: classes5.dex */
    private static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1283i f8078a;

        /* renamed from: b, reason: collision with root package name */
        private long f8079b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8080c;

        public b(AbstractC1283i fileHandle, long j8) {
            AbstractC3159y.i(fileHandle, "fileHandle");
            this.f8078a = fileHandle;
            this.f8079b = j8;
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8080c) {
                return;
            }
            this.f8080c = true;
            ReentrantLock h8 = this.f8078a.h();
            h8.lock();
            try {
                AbstractC1283i abstractC1283i = this.f8078a;
                abstractC1283i.f8073c--;
                if (this.f8078a.f8073c == 0 && this.f8078a.f8072b) {
                    L5.I i8 = L5.I.f6487a;
                    h8.unlock();
                    this.f8078a.l();
                }
            } finally {
                h8.unlock();
            }
        }

        @Override // P6.Z
        public a0 timeout() {
            return a0.f8031e;
        }

        @Override // P6.Z
        public long y(C1279e sink, long j8) {
            AbstractC3159y.i(sink, "sink");
            if (!this.f8080c) {
                long u8 = this.f8078a.u(this.f8079b, sink, j8);
                if (u8 != -1) {
                    this.f8079b += u8;
                }
                return u8;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public AbstractC1283i(boolean z8) {
        this.f8071a = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j8, C1279e c1279e, long j9) {
        AbstractC1276b.b(c1279e.x(), 0L, j9);
        long j10 = j9 + j8;
        while (j8 < j10) {
            U u8 = c1279e.f8056a;
            AbstractC3159y.f(u8);
            int min = (int) Math.min(j10 - j8, u8.f8015c - u8.f8014b);
            t(j8, u8.f8013a, u8.f8014b, min);
            u8.f8014b += min;
            long j11 = min;
            j8 += j11;
            c1279e.w(c1279e.x() - j11);
            if (u8.f8014b == u8.f8015c) {
                c1279e.f8056a = u8.b();
                V.b(u8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j8, C1279e c1279e, long j9) {
        if (j9 >= 0) {
            long j10 = j9 + j8;
            long j11 = j8;
            while (true) {
                if (j11 >= j10) {
                    break;
                }
                U F8 = c1279e.F(1);
                int o8 = o(j11, F8.f8013a, F8.f8015c, (int) Math.min(j10 - j11, 8192 - r7));
                if (o8 == -1) {
                    if (F8.f8014b == F8.f8015c) {
                        c1279e.f8056a = F8.b();
                        V.b(F8);
                    }
                    if (j8 == j11) {
                        return -1L;
                    }
                } else {
                    F8.f8015c += o8;
                    long j12 = o8;
                    j11 += j12;
                    c1279e.w(c1279e.x() + j12);
                }
            }
            return j11 - j8;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
    }

    public static /* synthetic */ X x(AbstractC1283i abstractC1283i, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            return abstractC1283i.w(j8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public final long A() {
        ReentrantLock reentrantLock = this.f8074d;
        reentrantLock.lock();
        try {
            if (!this.f8072b) {
                L5.I i8 = L5.I.f6487a;
                reentrantLock.unlock();
                return r();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Z E(long j8) {
        ReentrantLock reentrantLock = this.f8074d;
        reentrantLock.lock();
        try {
            if (!this.f8072b) {
                this.f8073c++;
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
        ReentrantLock reentrantLock = this.f8074d;
        reentrantLock.lock();
        try {
            if (this.f8072b) {
                return;
            }
            this.f8072b = true;
            if (this.f8073c != 0) {
                return;
            }
            L5.I i8 = L5.I.f6487a;
            reentrantLock.unlock();
            l();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f8071a) {
            ReentrantLock reentrantLock = this.f8074d;
            reentrantLock.lock();
            try {
                if (!this.f8072b) {
                    L5.I i8 = L5.I.f6487a;
                    reentrantLock.unlock();
                    m();
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

    public final ReentrantLock h() {
        return this.f8074d;
    }

    protected abstract void l();

    protected abstract void m();

    protected abstract int o(long j8, byte[] bArr, int i8, int i9);

    protected abstract long r();

    protected abstract void t(long j8, byte[] bArr, int i8, int i9);

    public final X w(long j8) {
        if (this.f8071a) {
            ReentrantLock reentrantLock = this.f8074d;
            reentrantLock.lock();
            try {
                if (!this.f8072b) {
                    this.f8073c++;
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
