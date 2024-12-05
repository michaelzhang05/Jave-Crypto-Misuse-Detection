package S6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: S6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1429q implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f9936a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f9937b;

    public C1429q(InputStream input, a0 timeout) {
        AbstractC3255y.i(input, "input");
        AbstractC3255y.i(timeout, "timeout");
        this.f9936a = input;
        this.f9937b = timeout;
    }

    @Override // S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        if (j8 == 0) {
            return 0L;
        }
        if (j8 >= 0) {
            try {
                this.f9937b.f();
                U H8 = sink.H(1);
                int read = this.f9936a.read(H8.f9844a, H8.f9846c, (int) Math.min(j8, 8192 - H8.f9846c));
                if (read == -1) {
                    if (H8.f9845b == H8.f9846c) {
                        sink.f9887a = H8.b();
                        V.b(H8);
                        return -1L;
                    }
                    return -1L;
                }
                H8.f9846c += read;
                long j9 = read;
                sink.D(sink.E() + j9);
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

    @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9936a.close();
    }

    @Override // S6.Z
    public a0 timeout() {
        return this.f9937b;
    }

    public String toString() {
        return "source(" + this.f9936a + ')';
    }
}
