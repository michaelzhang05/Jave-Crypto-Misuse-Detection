package j;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes2.dex */
public final class j implements b0 {

    /* renamed from: f, reason: collision with root package name */
    private boolean f19373f;

    /* renamed from: g, reason: collision with root package name */
    private final g f19374g;

    /* renamed from: h, reason: collision with root package name */
    private final Deflater f19375h;

    public j(g gVar, Deflater deflater) {
        kotlin.jvm.internal.l.f(gVar, "sink");
        kotlin.jvm.internal.l.f(deflater, "deflater");
        this.f19374g = gVar;
        this.f19375h = deflater;
    }

    @IgnoreJRERequirement
    private final void a(boolean z) {
        y J0;
        int deflate;
        f e2 = this.f19374g.e();
        while (true) {
            J0 = e2.J0(1);
            if (z) {
                Deflater deflater = this.f19375h;
                byte[] bArr = J0.f19405b;
                int i2 = J0.f19407d;
                deflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f19375h;
                byte[] bArr2 = J0.f19405b;
                int i3 = J0.f19407d;
                deflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (deflate > 0) {
                J0.f19407d += deflate;
                e2.G0(e2.size() + deflate);
                this.f19374g.B();
            } else if (this.f19375h.needsInput()) {
                break;
            }
        }
        if (J0.f19406c == J0.f19407d) {
            e2.f19358f = J0.b();
            z.b(J0);
        }
    }

    public final void b() {
        this.f19375h.finish();
        a(false);
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19373f) {
            return;
        }
        Throwable th = null;
        try {
            b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f19375h.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f19374g.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f19373f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // j.b0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f19374g.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f19374g.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f19374g + ')';
    }

    @Override // j.b0
    public void write(f fVar, long j2) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "source");
        c.b(fVar.size(), 0L, j2);
        while (j2 > 0) {
            y yVar = fVar.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int min = (int) Math.min(j2, yVar.f19407d - yVar.f19406c);
            this.f19375h.setInput(yVar.f19405b, yVar.f19406c, min);
            a(false);
            long j3 = min;
            fVar.G0(fVar.size() - j3);
            int i2 = yVar.f19406c + min;
            yVar.f19406c = i2;
            if (i2 == yVar.f19407d) {
                fVar.f19358f = yVar.b();
                z.b(yVar);
            }
            j2 -= j3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(b0 b0Var, Deflater deflater) {
        this(q.c(b0Var), deflater);
        kotlin.jvm.internal.l.f(b0Var, "sink");
        kotlin.jvm.internal.l.f(deflater, "deflater");
    }
}
