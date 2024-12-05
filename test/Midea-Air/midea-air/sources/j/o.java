package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes2.dex */
public final class o implements d0 {

    /* renamed from: f, reason: collision with root package name */
    private int f19381f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19382g;

    /* renamed from: h, reason: collision with root package name */
    private final h f19383h;

    /* renamed from: i, reason: collision with root package name */
    private final Inflater f19384i;

    public o(h hVar, Inflater inflater) {
        kotlin.jvm.internal.l.f(hVar, "source");
        kotlin.jvm.internal.l.f(inflater, "inflater");
        this.f19383h = hVar;
        this.f19384i = inflater;
    }

    private final void f() {
        int i2 = this.f19381f;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f19384i.getRemaining();
        this.f19381f -= remaining;
        this.f19383h.skip(remaining);
    }

    public final long a(f fVar, long j2) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (j2 >= 0) {
            if (!(!this.f19382g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return 0L;
            }
            try {
                y J0 = fVar.J0(1);
                int min = (int) Math.min(j2, 8192 - J0.f19407d);
                b();
                int inflate = this.f19384i.inflate(J0.f19405b, J0.f19407d, min);
                f();
                if (inflate > 0) {
                    J0.f19407d += inflate;
                    long j3 = inflate;
                    fVar.G0(fVar.size() + j3);
                    return j3;
                }
                if (J0.f19406c == J0.f19407d) {
                    fVar.f19358f = J0.b();
                    z.b(J0);
                }
                return 0L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    public final boolean b() throws IOException {
        if (!this.f19384i.needsInput()) {
            return false;
        }
        if (this.f19383h.u()) {
            return true;
        }
        y yVar = this.f19383h.e().f19358f;
        kotlin.jvm.internal.l.c(yVar);
        int i2 = yVar.f19407d;
        int i3 = yVar.f19406c;
        int i4 = i2 - i3;
        this.f19381f = i4;
        this.f19384i.setInput(yVar.f19405b, i3, i4);
        return false;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19382g) {
            return;
        }
        this.f19384i.end();
        this.f19382g = true;
        this.f19383h.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "sink");
        do {
            long a = a(fVar, j2);
            if (a > 0) {
                return a;
            }
            if (this.f19384i.finished() || this.f19384i.needsDictionary()) {
                return -1L;
            }
        } while (!this.f19383h.u());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f19383h.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(d0 d0Var, Inflater inflater) {
        this(q.d(d0Var), inflater);
        kotlin.jvm.internal.l.f(d0Var, "source");
        kotlin.jvm.internal.l.f(inflater, "inflater");
    }
}
