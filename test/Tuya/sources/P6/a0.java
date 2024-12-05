package P6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8030d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f8031e = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f8032a;

    /* renamed from: b, reason: collision with root package name */
    private long f8033b;

    /* renamed from: c, reason: collision with root package name */
    private long f8034c;

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public a0 a() {
        this.f8032a = false;
        return this;
    }

    public a0 b() {
        this.f8034c = 0L;
        return this;
    }

    public long c() {
        if (this.f8032a) {
            return this.f8033b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j8) {
        this.f8032a = true;
        this.f8033b = j8;
        return this;
    }

    public boolean e() {
        return this.f8032a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f8032a && this.f8033b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public a0 g(long j8, TimeUnit unit) {
        AbstractC3159y.i(unit, "unit");
        if (j8 >= 0) {
            this.f8034c = unit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j8).toString());
    }

    public long h() {
        return this.f8034c;
    }

    /* loaded from: classes5.dex */
    public static final class a extends a0 {
        a() {
        }

        @Override // P6.a0
        public a0 g(long j8, TimeUnit unit) {
            AbstractC3159y.i(unit, "unit");
            return this;
        }

        @Override // P6.a0
        public void f() {
        }

        @Override // P6.a0
        public a0 d(long j8) {
            return this;
        }
    }
}
