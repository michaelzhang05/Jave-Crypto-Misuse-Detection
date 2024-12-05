package S6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1425m implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final Z f9925a;

    public AbstractC1425m(Z delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.f9925a = delegate;
    }

    @Override // S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        return this.f9925a.C(sink, j8);
    }

    public final Z a() {
        return this.f9925a;
    }

    @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9925a.close();
    }

    @Override // S6.Z
    public a0 timeout() {
        return this.f9925a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f9925a + ')';
    }
}
