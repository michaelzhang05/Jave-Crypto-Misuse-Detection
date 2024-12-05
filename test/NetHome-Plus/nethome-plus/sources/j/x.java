package j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes2.dex */
public final class x implements h {

    /* renamed from: f, reason: collision with root package name */
    public final f f19401f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19402g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f19403h;

    public x(d0 d0Var) {
        kotlin.jvm.internal.l.f(d0Var, "source");
        this.f19403h = d0Var;
        this.f19401f = new f();
    }

    @Override // j.h
    public long A(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "targetBytes");
        return o(iVar, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r4 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = kotlin.text.b.a(16);
        r2 = kotlin.text.b.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.l.e(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() {
        /*
            r10 = this;
            r0 = 1
            r10.l0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L5b
            j.f r8 = r10.f19401f
            byte r8 = r8.s0(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2c
            r9 = 45
            byte r9 = (byte) r9
            if (r8 == r9) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L31
            goto L5b
        L31:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.a.a(r2)
            int r2 = kotlin.text.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.l.e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            j.f r0 = r10.f19401f
            long r0 = r0.C()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.x.C():long");
    }

    public short D() {
        l0(2L);
        return this.f19401f.B0();
    }

    @Override // j.h
    public String E(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long b3 = b(b2, 0L, j3);
            if (b3 != -1) {
                return j.g0.a.d(this.f19401f, b3);
            }
            if (j3 < Long.MAX_VALUE && request(j3) && this.f19401f.s0(j3 - 1) == ((byte) 13) && request(1 + j3) && this.f19401f.s0(j3) == b2) {
                return j.g0.a.d(this.f19401f, j3);
            }
            f fVar = new f();
            f fVar2 = this.f19401f;
            fVar2.g0(fVar, 0L, Math.min(32, fVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f19401f.size(), j2) + " content=" + fVar.X().F() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    @Override // j.h
    public boolean Q(long j2, i iVar) {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        return w(j2, iVar, 0, iVar.P());
    }

    @Override // j.h
    public String R(Charset charset) {
        kotlin.jvm.internal.l.f(charset, "charset");
        this.f19401f.V(this.f19403h);
        return this.f19401f.R(charset);
    }

    @Override // j.h
    public i X() {
        this.f19401f.V(this.f19403h);
        return this.f19401f.X();
    }

    public long a(byte b2) {
        return b(b2, 0L, Long.MAX_VALUE);
    }

    public long b(byte b2, long j2, long j3) {
        if (!(!this.f19402g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long t0 = this.f19401f.t0(b2, j2, j3);
            if (t0 != -1) {
                return t0;
            }
            long size = this.f19401f.size();
            if (size >= j3 || this.f19403h.read(this.f19401f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
        return -1L;
    }

    @Override // j.h
    public String b0() {
        return E(Long.MAX_VALUE);
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19402g) {
            return;
        }
        this.f19402g = true;
        this.f19403h.close();
        this.f19401f.b();
    }

    @Override // j.h
    public byte[] d0(long j2) {
        l0(j2);
        return this.f19401f.d0(j2);
    }

    @Override // j.h, j.g
    public f e() {
        return this.f19401f;
    }

    public long f(i iVar, long j2) {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        if (!(!this.f19402g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long u0 = this.f19401f.u0(iVar, j2);
            if (u0 != -1) {
                return u0;
            }
            long size = this.f19401f.size();
            if (this.f19403h.read(this.f19401f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - iVar.P()) + 1);
        }
    }

    @Override // j.h
    public long h0(b0 b0Var) {
        kotlin.jvm.internal.l.f(b0Var, "sink");
        long j2 = 0;
        while (this.f19403h.read(this.f19401f, 8192) != -1) {
            long T = this.f19401f.T();
            if (T > 0) {
                j2 += T;
                b0Var.write(this.f19401f, T);
            }
        }
        if (this.f19401f.size() <= 0) {
            return j2;
        }
        long size = j2 + this.f19401f.size();
        f fVar = this.f19401f;
        b0Var.write(fVar, fVar.size());
        return size;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f19402g;
    }

    @Override // j.h
    public f j() {
        return this.f19401f;
    }

    @Override // j.h
    public i k(long j2) {
        l0(j2);
        return this.f19401f.k(j2);
    }

    @Override // j.h
    public void l0(long j2) {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    public long o(i iVar, long j2) {
        kotlin.jvm.internal.l.f(iVar, "targetBytes");
        if (!(!this.f19402g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long v0 = this.f19401f.v0(iVar, j2);
            if (v0 != -1) {
                return v0;
            }
            long size = this.f19401f.size();
            if (this.f19403h.read(this.f19401f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    @Override // j.h
    public long o0() {
        byte s0;
        int a2;
        int a3;
        l0(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!request(i3)) {
                break;
            }
            s0 = this.f19401f.s0(i2);
            if ((s0 < ((byte) 48) || s0 > ((byte) 57)) && ((s0 < ((byte) 97) || s0 > ((byte) 102)) && (s0 < ((byte) 65) || s0 > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            a2 = kotlin.text.b.a(16);
            a3 = kotlin.text.b.a(a2);
            String num = Integer.toString(s0, a3);
            kotlin.jvm.internal.l.e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.f19401f.o0();
    }

    @Override // j.h
    public InputStream p0() {
        return new a();
    }

    @Override // j.h
    public h peek() {
        return q.d(new v(this));
    }

    @Override // j.h
    public int r0(t tVar) {
        kotlin.jvm.internal.l.f(tVar, "options");
        if (!(!this.f19402g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int e2 = j.g0.a.e(this.f19401f, tVar, true);
            if (e2 != -2) {
                if (e2 != -1) {
                    this.f19401f.skip(tVar.w()[e2].P());
                    return e2;
                }
            } else if (this.f19403h.read(this.f19401f, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (j2 >= 0) {
            if (!(true ^ this.f19402g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f19401f.size() == 0 && this.f19403h.read(this.f19401f, 8192) == -1) {
                return -1L;
            }
            return this.f19401f.read(fVar, Math.min(j2, this.f19401f.size()));
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // j.h
    public byte readByte() {
        l0(1L);
        return this.f19401f.readByte();
    }

    @Override // j.h
    public void readFully(byte[] bArr) {
        kotlin.jvm.internal.l.f(bArr, "sink");
        try {
            l0(bArr.length);
            this.f19401f.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f19401f.size() > 0) {
                f fVar = this.f19401f;
                int read = fVar.read(bArr, i2, (int) fVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i2 += read;
            }
            throw e2;
        }
    }

    @Override // j.h
    public int readInt() {
        l0(4L);
        return this.f19401f.readInt();
    }

    @Override // j.h
    public long readLong() {
        l0(8L);
        return this.f19401f.readLong();
    }

    @Override // j.h
    public short readShort() {
        l0(2L);
        return this.f19401f.readShort();
    }

    @Override // j.h
    public boolean request(long j2) {
        if (j2 >= 0) {
            if (!(!this.f19402g)) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f19401f.size() < j2) {
                if (this.f19403h.read(this.f19401f, 8192) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // j.h
    public byte[] s() {
        this.f19401f.V(this.f19403h);
        return this.f19401f.s();
    }

    @Override // j.h
    public void skip(long j2) {
        if (!(!this.f19402g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.f19401f.size() == 0 && this.f19403h.read(this.f19401f, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.f19401f.size());
            this.f19401f.skip(min);
            j2 -= min;
        }
    }

    @Override // j.h
    public long t(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        return f(iVar, 0L);
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f19403h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f19403h + ')';
    }

    @Override // j.h
    public boolean u() {
        if (!this.f19402g) {
            return this.f19401f.u() && this.f19403h.read(this.f19401f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean w(long j2, i iVar, int i2, int i3) {
        int i4;
        kotlin.jvm.internal.l.f(iVar, "bytes");
        if (!this.f19402g) {
            if (j2 >= 0 && i2 >= 0 && i3 >= 0 && iVar.P() - i2 >= i3) {
                while (i4 < i3) {
                    long j3 = i4 + j2;
                    i4 = (request(1 + j3) && this.f19401f.s0(j3) == iVar.r(i2 + i4)) ? i4 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.h
    public void y(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "sink");
        try {
            l0(j2);
            this.f19401f.y(fVar, j2);
        } catch (EOFException e2) {
            fVar.V(this.f19401f);
            throw e2;
        }
    }

    public int z() {
        l0(4L);
        return this.f19401f.A0();
    }

    /* compiled from: RealBufferedSource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            x xVar = x.this;
            if (!xVar.f19402g) {
                return (int) Math.min(xVar.f19401f.size(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            x.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            x xVar = x.this;
            if (!xVar.f19402g) {
                if (xVar.f19401f.size() == 0) {
                    x xVar2 = x.this;
                    if (xVar2.f19403h.read(xVar2.f19401f, 8192) == -1) {
                        return -1;
                    }
                }
                return x.this.f19401f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            kotlin.jvm.internal.l.f(bArr, "data");
            if (!x.this.f19402g) {
                c.b(bArr.length, i2, i3);
                if (x.this.f19401f.size() == 0) {
                    x xVar = x.this;
                    if (xVar.f19403h.read(xVar.f19401f, 8192) == -1) {
                        return -1;
                    }
                }
                return x.this.f19401f.read(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f(byteBuffer, "sink");
        if (this.f19401f.size() == 0 && this.f19403h.read(this.f19401f, 8192) == -1) {
            return -1;
        }
        return this.f19401f.read(byteBuffer);
    }
}
