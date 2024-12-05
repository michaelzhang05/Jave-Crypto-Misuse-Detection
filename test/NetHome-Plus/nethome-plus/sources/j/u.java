package j;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class u implements b0 {

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f19390f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f19391g;

    public u(OutputStream outputStream, e0 e0Var) {
        kotlin.jvm.internal.l.f(outputStream, "out");
        kotlin.jvm.internal.l.f(e0Var, "timeout");
        this.f19390f = outputStream;
        this.f19391g = e0Var;
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19390f.close();
    }

    @Override // j.b0, java.io.Flushable
    public void flush() {
        this.f19390f.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f19391g;
    }

    public String toString() {
        return "sink(" + this.f19390f + ')';
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "source");
        c.b(fVar.size(), 0L, j2);
        while (j2 > 0) {
            this.f19391g.throwIfReached();
            y yVar = fVar.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int min = (int) Math.min(j2, yVar.f19407d - yVar.f19406c);
            this.f19390f.write(yVar.f19405b, yVar.f19406c, min);
            yVar.f19406c += min;
            long j3 = min;
            j2 -= j3;
            fVar.G0(fVar.size() - j3);
            if (yVar.f19406c == yVar.f19407d) {
                fVar.f19358f = yVar.b();
                z.b(yVar);
            }
        }
    }
}
