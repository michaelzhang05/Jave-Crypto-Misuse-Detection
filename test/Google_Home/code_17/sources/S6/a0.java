package S6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f9861d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f9862e = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f9863a;

    /* renamed from: b, reason: collision with root package name */
    private long f9864b;

    /* renamed from: c, reason: collision with root package name */
    private long f9865c;

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public a0 a() {
        this.f9863a = false;
        return this;
    }

    public a0 b() {
        this.f9865c = 0L;
        return this;
    }

    public long c() {
        if (this.f9863a) {
            return this.f9864b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j8) {
        this.f9863a = true;
        this.f9864b = j8;
        return this;
    }

    public boolean e() {
        return this.f9863a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f9863a && this.f9864b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public a0 g(long j8, TimeUnit unit) {
        AbstractC3255y.i(unit, "unit");
        if (j8 >= 0) {
            this.f9865c = unit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j8).toString());
    }

    public long h() {
        return this.f9865c;
    }

    /* loaded from: classes5.dex */
    public static final class a extends a0 {
        a() {
        }

        @Override // S6.a0
        public a0 g(long j8, TimeUnit unit) {
            AbstractC3255y.i(unit, "unit");
            return this;
        }

        @Override // S6.a0
        public void f() {
        }

        @Override // S6.a0
        public a0 d(long j8) {
            return this;
        }
    }
}
