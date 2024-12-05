package P6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1286l implements X {

    /* renamed from: a, reason: collision with root package name */
    private final X f8093a;

    public AbstractC1286l(X delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8093a = delegate;
    }

    @Override // P6.X
    public void C(C1279e source, long j8) {
        AbstractC3159y.i(source, "source");
        this.f8093a.C(source, j8);
    }

    @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8093a.close();
    }

    @Override // P6.X, java.io.Flushable
    public void flush() {
        this.f8093a.flush();
    }

    @Override // P6.X
    public a0 timeout() {
        return this.f8093a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f8093a + ')';
    }
}
