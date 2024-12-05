package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes2.dex */
public final class n implements d0 {

    /* renamed from: f, reason: collision with root package name */
    private byte f19376f;

    /* renamed from: g, reason: collision with root package name */
    private final x f19377g;

    /* renamed from: h, reason: collision with root package name */
    private final Inflater f19378h;

    /* renamed from: i, reason: collision with root package name */
    private final o f19379i;

    /* renamed from: j, reason: collision with root package name */
    private final CRC32 f19380j;

    public n(d0 d0Var) {
        kotlin.jvm.internal.l.f(d0Var, "source");
        x xVar = new x(d0Var);
        this.f19377g = xVar;
        Inflater inflater = new Inflater(true);
        this.f19378h = inflater;
        this.f19379i = new o((h) xVar, inflater);
        this.f19380j = new CRC32();
    }

    private final void a(String str, int i2, int i3) {
        if (i3 == i2) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        kotlin.jvm.internal.l.e(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        this.f19377g.l0(10L);
        byte s0 = this.f19377g.f19401f.s0(3L);
        boolean z = ((s0 >> 1) & 1) == 1;
        if (z) {
            o(this.f19377g.f19401f, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f19377g.readShort());
        this.f19377g.skip(8L);
        if (((s0 >> 2) & 1) == 1) {
            this.f19377g.l0(2L);
            if (z) {
                o(this.f19377g.f19401f, 0L, 2L);
            }
            long B0 = this.f19377g.f19401f.B0();
            this.f19377g.l0(B0);
            if (z) {
                o(this.f19377g.f19401f, 0L, B0);
            }
            this.f19377g.skip(B0);
        }
        if (((s0 >> 3) & 1) == 1) {
            long a = this.f19377g.a((byte) 0);
            if (a != -1) {
                if (z) {
                    o(this.f19377g.f19401f, 0L, a + 1);
                }
                this.f19377g.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((s0 >> 4) & 1) == 1) {
            long a2 = this.f19377g.a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    o(this.f19377g.f19401f, 0L, a2 + 1);
                }
                this.f19377g.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.f19377g.D(), (short) this.f19380j.getValue());
            this.f19380j.reset();
        }
    }

    private final void f() throws IOException {
        a("CRC", this.f19377g.z(), (int) this.f19380j.getValue());
        a("ISIZE", this.f19377g.z(), (int) this.f19378h.getBytesWritten());
    }

    private final void o(f fVar, long j2, long j3) {
        y yVar = fVar.f19358f;
        kotlin.jvm.internal.l.c(yVar);
        while (true) {
            int i2 = yVar.f19407d;
            int i3 = yVar.f19406c;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(yVar.f19407d - r7, j3);
            this.f19380j.update(yVar.f19405b, (int) (yVar.f19406c + j2), min);
            j3 -= min;
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
            j2 = 0;
        }
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19379i.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws IOException {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f19376f == 0) {
            b();
            this.f19376f = (byte) 1;
        }
        if (this.f19376f == 1) {
            long size = fVar.size();
            long read = this.f19379i.read(fVar, j2);
            if (read != -1) {
                o(fVar, size, read);
                return read;
            }
            this.f19376f = (byte) 2;
        }
        if (this.f19376f == 2) {
            f();
            this.f19376f = (byte) 3;
            if (!this.f19377g.u()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f19377g.timeout();
    }
}
