package j;

import java.io.IOException;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes2.dex */
public abstract class k implements b0 {
    private final b0 delegate;

    public k(b0 b0Var) {
        kotlin.jvm.internal.l.f(b0Var, "delegate");
        this.delegate = b0Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final b0 m369deprecated_delegate() {
        return this.delegate;
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final b0 delegate() {
        return this.delegate;
    }

    @Override // j.b0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // j.b0
    public void write(f fVar, long j2) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "source");
        this.delegate.write(fVar, j2);
    }
}
