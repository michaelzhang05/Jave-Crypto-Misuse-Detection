package S6;

import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O implements X {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f9830a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f9831b;

    public O(OutputStream out, a0 timeout) {
        AbstractC3255y.i(out, "out");
        AbstractC3255y.i(timeout, "timeout");
        this.f9830a = out;
        this.f9831b = timeout;
    }

    @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9830a.close();
    }

    @Override // S6.X, java.io.Flushable
    public void flush() {
        this.f9830a.flush();
    }

    @Override // S6.X
    public void h(C1417e source, long j8) {
        AbstractC3255y.i(source, "source");
        AbstractC1414b.b(source.E(), 0L, j8);
        while (j8 > 0) {
            this.f9831b.f();
            U u8 = source.f9887a;
            AbstractC3255y.f(u8);
            int min = (int) Math.min(j8, u8.f9846c - u8.f9845b);
            this.f9830a.write(u8.f9844a, u8.f9845b, min);
            u8.f9845b += min;
            long j9 = min;
            j8 -= j9;
            source.D(source.E() - j9);
            if (u8.f9845b == u8.f9846c) {
                source.f9887a = u8.b();
                V.b(u8);
            }
        }
    }

    @Override // S6.X
    public a0 timeout() {
        return this.f9831b;
    }

    public String toString() {
        return "sink(" + this.f9830a + ')';
    }
}
