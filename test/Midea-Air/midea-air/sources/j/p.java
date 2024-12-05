package j;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class p implements d0 {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f19385f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f19386g;

    public p(InputStream inputStream, e0 e0Var) {
        kotlin.jvm.internal.l.f(inputStream, "input");
        kotlin.jvm.internal.l.f(e0Var, "timeout");
        this.f19385f = inputStream;
        this.f19386g = e0Var;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19385f.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (j2 >= 0) {
            try {
                this.f19386g.throwIfReached();
                y J0 = fVar.J0(1);
                int read = this.f19385f.read(J0.f19405b, J0.f19407d, (int) Math.min(j2, 8192 - J0.f19407d));
                if (read == -1) {
                    if (J0.f19406c != J0.f19407d) {
                        return -1L;
                    }
                    fVar.f19358f = J0.b();
                    z.b(J0);
                    return -1L;
                }
                J0.f19407d += read;
                long j3 = read;
                fVar.G0(fVar.size() + j3);
                return j3;
            } catch (AssertionError e2) {
                if (q.e(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f19386g;
    }

    public String toString() {
        return "source(" + this.f19385f + ')';
    }
}
