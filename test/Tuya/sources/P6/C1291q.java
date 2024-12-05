package P6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: P6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1291q implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f8105a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f8106b;

    public C1291q(InputStream input, a0 timeout) {
        AbstractC3159y.i(input, "input");
        AbstractC3159y.i(timeout, "timeout");
        this.f8105a = input;
        this.f8106b = timeout;
    }

    @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8105a.close();
    }

    @Override // P6.Z
    public a0 timeout() {
        return this.f8106b;
    }

    public String toString() {
        return "source(" + this.f8105a + ')';
    }

    @Override // P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        if (j8 == 0) {
            return 0L;
        }
        if (j8 >= 0) {
            try {
                this.f8106b.f();
                U F8 = sink.F(1);
                int read = this.f8105a.read(F8.f8013a, F8.f8015c, (int) Math.min(j8, 8192 - F8.f8015c));
                if (read == -1) {
                    if (F8.f8014b == F8.f8015c) {
                        sink.f8056a = F8.b();
                        V.b(F8);
                        return -1L;
                    }
                    return -1L;
                }
                F8.f8015c += read;
                long j9 = read;
                sink.w(sink.x() + j9);
                return j9;
            } catch (AssertionError e8) {
                if (L.e(e8)) {
                    throw new IOException(e8);
                }
                throw e8;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }
}
