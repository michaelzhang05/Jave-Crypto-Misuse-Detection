package S6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1424l implements X {

    /* renamed from: a, reason: collision with root package name */
    private final X f9924a;

    public AbstractC1424l(X delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.f9924a = delegate;
    }

    @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9924a.close();
    }

    @Override // S6.X, java.io.Flushable
    public void flush() {
        this.f9924a.flush();
    }

    @Override // S6.X
    public void h(C1417e source, long j8) {
        AbstractC3255y.i(source, "source");
        this.f9924a.h(source, j8);
    }

    @Override // S6.X
    public a0 timeout() {
        return this.f9924a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f9924a + ')';
    }
}
