package P6;

import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O implements X {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f7999a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f8000b;

    public O(OutputStream out, a0 timeout) {
        AbstractC3159y.i(out, "out");
        AbstractC3159y.i(timeout, "timeout");
        this.f7999a = out;
        this.f8000b = timeout;
    }

    @Override // P6.X
    public void C(C1279e source, long j8) {
        AbstractC3159y.i(source, "source");
        AbstractC1276b.b(source.x(), 0L, j8);
        while (j8 > 0) {
            this.f8000b.f();
            U u8 = source.f8056a;
            AbstractC3159y.f(u8);
            int min = (int) Math.min(j8, u8.f8015c - u8.f8014b);
            this.f7999a.write(u8.f8013a, u8.f8014b, min);
            u8.f8014b += min;
            long j9 = min;
            j8 -= j9;
            source.w(source.x() - j9);
            if (u8.f8014b == u8.f8015c) {
                source.f8056a = u8.b();
                V.b(u8);
            }
        }
    }

    @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7999a.close();
    }

    @Override // P6.X, java.io.Flushable
    public void flush() {
        this.f7999a.flush();
    }

    @Override // P6.X
    public a0 timeout() {
        return this.f8000b;
    }

    public String toString() {
        return "sink(" + this.f7999a + ')';
    }
}
