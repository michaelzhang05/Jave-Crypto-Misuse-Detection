package j;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;

/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: f, reason: collision with root package name */
    public y f19358f;

    /* renamed from: g, reason: collision with root package name */
    private long f19359g;

    /* compiled from: Buffer.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Closeable {

        /* renamed from: f, reason: collision with root package name */
        public f f19360f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f19361g;

        /* renamed from: h, reason: collision with root package name */
        private y f19362h;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f19364j;

        /* renamed from: i, reason: collision with root package name */
        public long f19363i = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f19365k = -1;
        public int l = -1;

        public final y a() {
            return this.f19362h;
        }

        public final int b() {
            long j2 = this.f19363i;
            f fVar = this.f19360f;
            kotlin.jvm.internal.l.c(fVar);
            if (j2 != fVar.size()) {
                long j3 = this.f19363i;
                return o(j3 == -1 ? 0L : j3 + (this.l - this.f19365k));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f19360f != null) {
                this.f19360f = null;
                w(null);
                this.f19363i = -1L;
                this.f19364j = null;
                this.f19365k = -1;
                this.l = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final long f(long j2) {
            f fVar = this.f19360f;
            if (fVar != null) {
                if (this.f19361g) {
                    long size = fVar.size();
                    int i2 = 1;
                    if (j2 <= size) {
                        if (j2 >= 0) {
                            long j3 = size - j2;
                            while (true) {
                                if (j3 <= 0) {
                                    break;
                                }
                                y yVar = fVar.f19358f;
                                kotlin.jvm.internal.l.c(yVar);
                                y yVar2 = yVar.f19411h;
                                kotlin.jvm.internal.l.c(yVar2);
                                int i3 = yVar2.f19407d;
                                long j4 = i3 - yVar2.f19406c;
                                if (j4 <= j3) {
                                    fVar.f19358f = yVar2.b();
                                    z.b(yVar2);
                                    j3 -= j4;
                                } else {
                                    yVar2.f19407d = i3 - ((int) j3);
                                    break;
                                }
                            }
                            w(null);
                            this.f19363i = j2;
                            this.f19364j = null;
                            this.f19365k = -1;
                            this.l = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                        }
                    } else if (j2 > size) {
                        long j5 = j2 - size;
                        boolean z = true;
                        while (j5 > 0) {
                            y J0 = fVar.J0(i2);
                            int min = (int) Math.min(j5, 8192 - J0.f19407d);
                            J0.f19407d += min;
                            j5 -= min;
                            if (z) {
                                w(J0);
                                this.f19363i = size;
                                this.f19364j = J0.f19405b;
                                int i4 = J0.f19407d;
                                this.f19365k = i4 - min;
                                this.l = i4;
                                z = false;
                            }
                            i2 = 1;
                        }
                    }
                    fVar.G0(j2);
                    return size;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int o(long j2) {
            y yVar;
            f fVar = this.f19360f;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > fVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + fVar.size());
            }
            if (j2 != -1 && j2 != fVar.size()) {
                long j3 = 0;
                long size = fVar.size();
                y yVar2 = fVar.f19358f;
                if (a() != null) {
                    long j4 = this.f19363i;
                    int i2 = this.f19365k;
                    kotlin.jvm.internal.l.c(a());
                    long j5 = j4 - (i2 - r12.f19406c);
                    if (j5 > j2) {
                        yVar2 = a();
                        size = j5;
                        yVar = yVar2;
                    } else {
                        yVar = a();
                        j3 = j5;
                    }
                } else {
                    yVar = yVar2;
                }
                if (size - j2 > j2 - j3) {
                    while (true) {
                        kotlin.jvm.internal.l.c(yVar);
                        int i3 = yVar.f19407d;
                        int i4 = yVar.f19406c;
                        if (j2 < (i3 - i4) + j3) {
                            break;
                        }
                        j3 += i3 - i4;
                        yVar = yVar.f19410g;
                    }
                } else {
                    while (size > j2) {
                        kotlin.jvm.internal.l.c(yVar2);
                        yVar2 = yVar2.f19411h;
                        kotlin.jvm.internal.l.c(yVar2);
                        size -= yVar2.f19407d - yVar2.f19406c;
                    }
                    j3 = size;
                    yVar = yVar2;
                }
                if (this.f19361g) {
                    kotlin.jvm.internal.l.c(yVar);
                    if (yVar.f19408e) {
                        y f2 = yVar.f();
                        if (fVar.f19358f == yVar) {
                            fVar.f19358f = f2;
                        }
                        yVar = yVar.c(f2);
                        y yVar3 = yVar.f19411h;
                        kotlin.jvm.internal.l.c(yVar3);
                        yVar3.b();
                    }
                }
                w(yVar);
                this.f19363i = j2;
                kotlin.jvm.internal.l.c(yVar);
                this.f19364j = yVar.f19405b;
                int i5 = yVar.f19406c + ((int) (j2 - j3));
                this.f19365k = i5;
                int i6 = yVar.f19407d;
                this.l = i6;
                return i6 - i5;
            }
            w(null);
            this.f19363i = j2;
            this.f19364j = null;
            this.f19365k = -1;
            this.l = -1;
            return -1;
        }

        public final void w(y yVar) {
            this.f19362h = yVar;
        }
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            f.this.writeByte(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            kotlin.jvm.internal.l.f(bArr, "data");
            f.this.write(bArr, i2, i3);
        }
    }

    public static /* synthetic */ a z0(f fVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a();
        }
        return fVar.y0(aVar);
    }

    @Override // j.h
    public long A(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "targetBytes");
        return v0(iVar, 0L);
    }

    public int A0() throws EOFException {
        return j.c.c(readInt());
    }

    public short B0() throws EOFException {
        return j.c.d(readShort());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[EDGE_INSN: B:48:0x00c4->B:42:0x00c4 BREAK  A[LOOP:0: B:4:0x0011->B:47:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    @Override // j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.C():long");
    }

    public String C0(long j2, Charset charset) throws EOFException {
        kotlin.jvm.internal.l.f(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f19359g < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        y yVar = this.f19358f;
        kotlin.jvm.internal.l.c(yVar);
        int i2 = yVar.f19406c;
        if (i2 + j2 > yVar.f19407d) {
            return new String(d0(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(yVar.f19405b, i2, i3, charset);
        int i4 = yVar.f19406c + i3;
        yVar.f19406c = i4;
        this.f19359g -= j2;
        if (i4 == yVar.f19407d) {
            this.f19358f = yVar.b();
            z.b(yVar);
        }
        return str;
    }

    public String D0() {
        return C0(this.f19359g, Charsets.f21561b);
    }

    @Override // j.h
    public String E(long j2) throws EOFException {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            byte b2 = (byte) 10;
            long t0 = t0(b2, 0L, j3);
            if (t0 != -1) {
                return j.g0.a.d(this, t0);
            }
            if (j3 < size() && s0(j3 - 1) == ((byte) 13) && s0(j3) == b2) {
                return j.g0.a.d(this, j3);
            }
            f fVar = new f();
            g0(fVar, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + fVar.X().F() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    public String E0(long j2) throws EOFException {
        return C0(j2, Charsets.f21561b);
    }

    public int F0() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() != 0) {
            byte s0 = s0(0L);
            if ((s0 & 128) == 0) {
                i2 = s0 & Byte.MAX_VALUE;
                i3 = 1;
                i4 = 0;
            } else if ((s0 & 224) == 192) {
                i2 = s0 & 31;
                i3 = 2;
                i4 = 128;
            } else if ((s0 & 240) == 224) {
                i2 = s0 & 15;
                i3 = 3;
                i4 = RecyclerView.l.FLAG_MOVED;
            } else {
                if ((s0 & 248) != 240) {
                    skip(1L);
                    return 65533;
                }
                i2 = s0 & 7;
                i3 = 4;
                i4 = 65536;
            }
            long j2 = i3;
            if (size() >= j2) {
                for (int i5 = 1; i5 < i3; i5++) {
                    long j3 = i5;
                    byte s02 = s0(j3);
                    if ((s02 & 192) != 128) {
                        skip(j3);
                        return 65533;
                    }
                    i2 = (i2 << 6) | (s02 & 63);
                }
                skip(j2);
                if (i2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
                    return 65533;
                }
                return i2;
            }
            throw new EOFException("size < " + i3 + ": " + size() + " (to read code point prefixed 0x" + j.c.e(s0) + ')');
        }
        throw new EOFException();
    }

    public final void G0(long j2) {
        this.f19359g = j2;
    }

    public final i H0() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return I0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final i I0(int i2) {
        if (i2 == 0) {
            return i.f19368f;
        }
        j.c.b(size(), 0L, i2);
        y yVar = this.f19358f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            kotlin.jvm.internal.l.c(yVar);
            int i6 = yVar.f19407d;
            int i7 = yVar.f19406c;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                yVar = yVar.f19410g;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5];
        int[] iArr = new int[i5 * 2];
        y yVar2 = this.f19358f;
        int i8 = 0;
        while (i3 < i2) {
            kotlin.jvm.internal.l.c(yVar2);
            bArr[i8] = yVar2.f19405b;
            i3 += yVar2.f19407d - yVar2.f19406c;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = yVar2.f19406c;
            yVar2.f19408e = true;
            i8++;
            yVar2 = yVar2.f19410g;
        }
        return new a0(bArr, iArr);
    }

    public final y J0(int i2) {
        if (i2 >= 1 && i2 <= 8192) {
            y yVar = this.f19358f;
            if (yVar == null) {
                y c2 = z.c();
                this.f19358f = c2;
                c2.f19411h = c2;
                c2.f19410g = c2;
                return c2;
            }
            kotlin.jvm.internal.l.c(yVar);
            y yVar2 = yVar.f19411h;
            kotlin.jvm.internal.l.c(yVar2);
            return (yVar2.f19407d + i2 > 8192 || !yVar2.f19409f) ? yVar2.c(z.c()) : yVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // j.g
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public f f0(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "byteString");
        iVar.T(this, 0, iVar.P());
        return this;
    }

    public f L0(d0 d0Var, long j2) throws IOException {
        kotlin.jvm.internal.l.f(d0Var, "source");
        while (j2 > 0) {
            long read = d0Var.read(this, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return this;
    }

    @Override // j.g
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public f write(byte[] bArr) {
        kotlin.jvm.internal.l.f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // j.g
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public f write(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.l.f(bArr, "source");
        long j2 = i3;
        j.c.b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            y J0 = J0(1);
            int min = Math.min(i4 - i2, 8192 - J0.f19407d);
            int i5 = i2 + min;
            kotlin.collections.j.d(bArr, J0.f19405b, J0.f19407d, i2, i5);
            J0.f19407d += min;
            i2 = i5;
        }
        G0(size() + j2);
        return this;
    }

    @Override // j.g
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public f writeByte(int i2) {
        y J0 = J0(1);
        byte[] bArr = J0.f19405b;
        int i3 = J0.f19407d;
        J0.f19407d = i3 + 1;
        bArr[i3] = (byte) i2;
        G0(size() + 1);
        return this;
    }

    @Override // j.g
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public f m0(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return M("-9223372036854775808");
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        y J0 = J0(i2);
        byte[] bArr = J0.f19405b;
        int i3 = J0.f19407d + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = j.g0.a.b()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        J0.f19407d += i2;
        G0(size() + i2);
        return this;
    }

    @Override // j.h
    public boolean Q(long j2, i iVar) {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        return x0(j2, iVar, 0, iVar.P());
    }

    @Override // j.g
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public f W(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        y J0 = J0(i2);
        byte[] bArr = J0.f19405b;
        int i3 = J0.f19407d;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = j.g0.a.b()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        J0.f19407d += i2;
        G0(size() + i2);
        return this;
    }

    @Override // j.h
    public String R(Charset charset) {
        kotlin.jvm.internal.l.f(charset, "charset");
        return C0(this.f19359g, charset);
    }

    @Override // j.g
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public f writeInt(int i2) {
        y J0 = J0(4);
        byte[] bArr = J0.f19405b;
        int i3 = J0.f19407d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        J0.f19407d = i6 + 1;
        G0(size() + 4);
        return this;
    }

    public f S0(long j2) {
        y J0 = J0(8);
        byte[] bArr = J0.f19405b;
        int i2 = J0.f19407d;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        J0.f19407d = i9 + 1;
        G0(size() + 8);
        return this;
    }

    public final long T() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        y yVar = this.f19358f;
        kotlin.jvm.internal.l.c(yVar);
        y yVar2 = yVar.f19411h;
        kotlin.jvm.internal.l.c(yVar2);
        if (yVar2.f19407d < 8192 && yVar2.f19409f) {
            size -= r3 - yVar2.f19406c;
        }
        return size;
    }

    @Override // j.g
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public f writeShort(int i2) {
        y J0 = J0(2);
        byte[] bArr = J0.f19405b;
        int i3 = J0.f19407d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        J0.f19407d = i4 + 1;
        G0(size() + 2);
        return this;
    }

    public f U0(String str, int i2, int i3, Charset charset) {
        kotlin.jvm.internal.l.f(str, "string");
        kotlin.jvm.internal.l.f(charset, "charset");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (i3 <= str.length()) {
                if (kotlin.jvm.internal.l.a(charset, Charsets.f21561b)) {
                    return U(str, i2, i3);
                }
                String substring = str.substring(i2, i3);
                kotlin.jvm.internal.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }

    @Override // j.g
    public long V(d0 d0Var) throws IOException {
        kotlin.jvm.internal.l.f(d0Var, "source");
        long j2 = 0;
        while (true) {
            long read = d0Var.read(this, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    public f V0(String str, Charset charset) {
        kotlin.jvm.internal.l.f(str, "string");
        kotlin.jvm.internal.l.f(charset, "charset");
        return U0(str, 0, str.length(), charset);
    }

    @Override // j.g
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public f M(String str) {
        kotlin.jvm.internal.l.f(str, "string");
        return U(str, 0, str.length());
    }

    @Override // j.h
    public i X() {
        return k(size());
    }

    @Override // j.g
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public f U(String str, int i2, int i3) {
        kotlin.jvm.internal.l.f(str, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (!(i3 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
            }
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    y J0 = J0(1);
                    byte[] bArr = J0.f19405b;
                    int i4 = J0.f19407d - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = J0.f19407d;
                    int i7 = (i4 + i5) - i6;
                    J0.f19407d = i6 + i7;
                    G0(size() + i7);
                    i2 = i5;
                } else {
                    if (charAt < 2048) {
                        y J02 = J0(2);
                        byte[] bArr2 = J02.f19405b;
                        int i8 = J02.f19407d;
                        bArr2[i8] = (byte) ((charAt >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                        J02.f19407d = i8 + 2;
                        G0(size() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            y J03 = J0(4);
                            byte[] bArr3 = J03.f19405b;
                            int i11 = J03.f19407d;
                            bArr3[i11] = (byte) ((i10 >> 18) | 240);
                            bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                            J03.f19407d = i11 + 4;
                            G0(size() + 4);
                            i2 += 2;
                        } else {
                            writeByte(63);
                            i2 = i9;
                        }
                    } else {
                        y J04 = J0(3);
                        byte[] bArr4 = J04.f19405b;
                        int i12 = J04.f19407d;
                        bArr4[i12] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i12 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr4[i12 + 2] = (byte) ((charAt & '?') | 128);
                        J04.f19407d = i12 + 3;
                        G0(size() + 3);
                    }
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }

    public f Y0(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            y J0 = J0(2);
            byte[] bArr = J0.f19405b;
            int i3 = J0.f19407d;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            J0.f19407d = i3 + 2;
            G0(size() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            writeByte(63);
        } else if (i2 < 65536) {
            y J02 = J0(3);
            byte[] bArr2 = J02.f19405b;
            int i4 = J02.f19407d;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            J02.f19407d = i4 + 3;
            G0(size() + 3);
        } else if (i2 <= 1114111) {
            y J03 = J0(4);
            byte[] bArr3 = J03.f19405b;
            int i5 = J03.f19407d;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            J03.f19407d = i5 + 4;
            G0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + j.c.f(i2));
        }
        return this;
    }

    public final void b() {
        skip(size());
    }

    @Override // j.h
    public String b0() throws EOFException {
        return E(Long.MAX_VALUE);
    }

    public final f c0() {
        f fVar = new f();
        if (size() != 0) {
            y yVar = this.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            y d2 = yVar.d();
            fVar.f19358f = d2;
            d2.f19411h = d2;
            d2.f19410g = d2;
            for (y yVar2 = yVar.f19410g; yVar2 != yVar; yVar2 = yVar2.f19410g) {
                y yVar3 = d2.f19411h;
                kotlin.jvm.internal.l.c(yVar3);
                kotlin.jvm.internal.l.c(yVar2);
                yVar3.c(yVar2.d());
            }
            fVar.G0(size());
        }
        return fVar;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // j.h
    public byte[] d0(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() >= j2) {
            byte[] bArr = new byte[(int) j2];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @Override // j.h, j.g
    public f e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (size() != fVar.size()) {
                return false;
            }
            if (size() != 0) {
                y yVar = this.f19358f;
                kotlin.jvm.internal.l.c(yVar);
                y yVar2 = fVar.f19358f;
                kotlin.jvm.internal.l.c(yVar2);
                int i2 = yVar.f19406c;
                int i3 = yVar2.f19406c;
                long j2 = 0;
                while (j2 < size()) {
                    long min = Math.min(yVar.f19407d - i2, yVar2.f19407d - i3);
                    long j3 = 0;
                    while (j3 < min) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (yVar.f19405b[i2] != yVar2.f19405b[i3]) {
                            return false;
                        }
                        j3++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == yVar.f19407d) {
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                        i2 = yVar.f19406c;
                    }
                    if (i3 == yVar2.f19407d) {
                        yVar2 = yVar2.f19410g;
                        kotlin.jvm.internal.l.c(yVar2);
                        i3 = yVar2.f19406c;
                    }
                    j2 += min;
                }
            }
        }
        return true;
    }

    @Override // j.g, j.b0, java.io.Flushable
    public void flush() {
    }

    public final f g0(f fVar, long j2, long j3) {
        kotlin.jvm.internal.l.f(fVar, "out");
        j.c.b(size(), j2, j3);
        if (j3 != 0) {
            fVar.G0(fVar.size() + j3);
            y yVar = this.f19358f;
            while (true) {
                kotlin.jvm.internal.l.c(yVar);
                int i2 = yVar.f19407d;
                int i3 = yVar.f19406c;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                yVar = yVar.f19410g;
            }
            while (j3 > 0) {
                kotlin.jvm.internal.l.c(yVar);
                y d2 = yVar.d();
                int i4 = d2.f19406c + ((int) j2);
                d2.f19406c = i4;
                d2.f19407d = Math.min(i4 + ((int) j3), d2.f19407d);
                y yVar2 = fVar.f19358f;
                if (yVar2 == null) {
                    d2.f19411h = d2;
                    d2.f19410g = d2;
                    fVar.f19358f = d2;
                } else {
                    kotlin.jvm.internal.l.c(yVar2);
                    y yVar3 = yVar2.f19411h;
                    kotlin.jvm.internal.l.c(yVar3);
                    yVar3.c(d2);
                }
                j3 -= d2.f19407d - d2.f19406c;
                yVar = yVar.f19410g;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // j.h
    public long h0(b0 b0Var) throws IOException {
        kotlin.jvm.internal.l.f(b0Var, "sink");
        long size = size();
        if (size > 0) {
            b0Var.write(this, size);
        }
        return size;
    }

    public int hashCode() {
        y yVar = this.f19358f;
        if (yVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = yVar.f19407d;
            for (int i4 = yVar.f19406c; i4 < i3; i4++) {
                i2 = (i2 * 31) + yVar.f19405b[i4];
            }
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
        } while (yVar != this.f19358f);
        return i2;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // j.h
    public f j() {
        return this;
    }

    @Override // j.h
    public i k(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        if (j2 >= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) {
            i I0 = I0((int) j2);
            skip(j2);
            return I0;
        }
        return new i(d0(j2));
    }

    @Override // j.g
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public f n() {
        return this;
    }

    @Override // j.h
    public void l0(long j2) throws EOFException {
        if (this.f19359g < j2) {
            throw new EOFException();
        }
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            j.y r6 = r15.f19358f
            kotlin.jvm.internal.l.c(r6)
            byte[] r7 = r6.f19405b
            int r8 = r6.f19406c
            int r9 = r6.f19407d
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            j.f r0 = new j.f
            r0.<init>()
            j.f r0 = r0.W(r4)
            j.f r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.D0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = j.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            j.y r7 = r6.b()
            r15.f19358f = r7
            j.z.b(r6)
            goto La8
        La6:
            r6.f19406c = r8
        La8:
            if (r1 != 0) goto Lae
            j.y r6 = r15.f19358f
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.G0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto Lbf
        Lbe:
            throw r0
        Lbf:
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.o0():long");
    }

    @Override // j.h
    public InputStream p0() {
        return new b();
    }

    @Override // j.h
    public h peek() {
        return q.d(new v(this));
    }

    @Override // j.g
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public f B() {
        return this;
    }

    @Override // j.h
    public int r0(t tVar) {
        kotlin.jvm.internal.l.f(tVar, "options");
        int f2 = j.g0.a.f(this, tVar, false, 2, null);
        if (f2 == -1) {
            return -1;
        }
        skip(tVar.w()[f2].P());
        return f2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        kotlin.jvm.internal.l.f(byteBuffer, "sink");
        y yVar = this.f19358f;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.f19407d - yVar.f19406c);
        byteBuffer.put(yVar.f19405b, yVar.f19406c, min);
        int i2 = yVar.f19406c + min;
        yVar.f19406c = i2;
        this.f19359g -= min;
        if (i2 == yVar.f19407d) {
            this.f19358f = yVar.b();
            z.b(yVar);
        }
        return min;
    }

    @Override // j.h
    public byte readByte() throws EOFException {
        if (size() != 0) {
            y yVar = this.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int i2 = yVar.f19406c;
            int i3 = yVar.f19407d;
            int i4 = i2 + 1;
            byte b2 = yVar.f19405b[i2];
            G0(size() - 1);
            if (i4 == i3) {
                this.f19358f = yVar.b();
                z.b(yVar);
            } else {
                yVar.f19406c = i4;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // j.h
    public void readFully(byte[] bArr) throws EOFException {
        kotlin.jvm.internal.l.f(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // j.h
    public int readInt() throws EOFException {
        if (size() >= 4) {
            y yVar = this.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int i2 = yVar.f19406c;
            int i3 = yVar.f19407d;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = yVar.f19405b;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            G0(size() - 4);
            if (i9 == i3) {
                this.f19358f = yVar.b();
                z.b(yVar);
            } else {
                yVar.f19406c = i9;
            }
            return i10;
        }
        throw new EOFException();
    }

    @Override // j.h
    public long readLong() throws EOFException {
        if (size() >= 8) {
            y yVar = this.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int i2 = yVar.f19406c;
            int i3 = yVar.f19407d;
            if (i3 - i2 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = yVar.f19405b;
            long j2 = (bArr[i2] & 255) << 56;
            long j3 = j2 | ((bArr[r6] & 255) << 48);
            long j4 = j3 | ((bArr[r1] & 255) << 40);
            int i4 = i2 + 1 + 1 + 1 + 1;
            long j5 = ((bArr[r6] & 255) << 32) | j4;
            long j6 = j5 | ((bArr[i4] & 255) << 24);
            long j7 = j6 | ((bArr[r8] & 255) << 16);
            long j8 = j7 | ((bArr[r1] & 255) << 8);
            int i5 = i4 + 1 + 1 + 1 + 1;
            long j9 = j8 | (bArr[r8] & 255);
            G0(size() - 8);
            if (i5 == i3) {
                this.f19358f = yVar.b();
                z.b(yVar);
            } else {
                yVar.f19406c = i5;
            }
            return j9;
        }
        throw new EOFException();
    }

    @Override // j.h
    public short readShort() throws EOFException {
        if (size() >= 2) {
            y yVar = this.f19358f;
            kotlin.jvm.internal.l.c(yVar);
            int i2 = yVar.f19406c;
            int i3 = yVar.f19407d;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = yVar.f19405b;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            G0(size() - 2);
            if (i5 == i3) {
                this.f19358f = yVar.b();
                z.b(yVar);
            } else {
                yVar.f19406c = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @Override // j.h
    public boolean request(long j2) {
        return this.f19359g >= j2;
    }

    @Override // j.h
    public byte[] s() {
        return d0(size());
    }

    public final byte s0(long j2) {
        j.c.b(size(), j2, 1L);
        y yVar = this.f19358f;
        if (yVar == null) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        if (size() - j2 < j2) {
            long size = size();
            while (size > j2) {
                yVar = yVar.f19411h;
                kotlin.jvm.internal.l.c(yVar);
                size -= yVar.f19407d - yVar.f19406c;
            }
            kotlin.jvm.internal.l.c(yVar);
            return yVar.f19405b[(int) ((yVar.f19406c + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (yVar.f19407d - yVar.f19406c) + j3;
            if (j4 > j2) {
                kotlin.jvm.internal.l.c(yVar);
                return yVar.f19405b[(int) ((yVar.f19406c + j2) - j3)];
            }
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
            j3 = j4;
        }
    }

    public final long size() {
        return this.f19359g;
    }

    @Override // j.h
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            y yVar = this.f19358f;
            if (yVar != null) {
                int min = (int) Math.min(j2, yVar.f19407d - yVar.f19406c);
                long j3 = min;
                G0(size() - j3);
                j2 -= j3;
                int i2 = yVar.f19406c + min;
                yVar.f19406c = i2;
                if (i2 == yVar.f19407d) {
                    this.f19358f = yVar.b();
                    z.b(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // j.h
    public long t(i iVar) throws IOException {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        return u0(iVar, 0L);
    }

    public long t0(byte b2, long j2, long j3) {
        y yVar;
        int i2;
        long j4 = 0;
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > size()) {
            j3 = size();
        }
        if (j2 == j3 || (yVar = this.f19358f) == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j4 = size();
            while (j4 > j2) {
                yVar = yVar.f19411h;
                kotlin.jvm.internal.l.c(yVar);
                j4 -= yVar.f19407d - yVar.f19406c;
            }
            while (j4 < j3) {
                byte[] bArr = yVar.f19405b;
                int min = (int) Math.min(yVar.f19407d, (yVar.f19406c + j3) - j4);
                i2 = (int) ((yVar.f19406c + j2) - j4);
                while (i2 < min) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                j4 += yVar.f19407d - yVar.f19406c;
                yVar = yVar.f19410g;
                kotlin.jvm.internal.l.c(yVar);
                j2 = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (yVar.f19407d - yVar.f19406c) + j4;
            if (j5 > j2) {
                break;
            }
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
            j4 = j5;
        }
        while (j4 < j3) {
            byte[] bArr2 = yVar.f19405b;
            int min2 = (int) Math.min(yVar.f19407d, (yVar.f19406c + j3) - j4);
            i2 = (int) ((yVar.f19406c + j2) - j4);
            while (i2 < min2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            j4 += yVar.f19407d - yVar.f19406c;
            yVar = yVar.f19410g;
            kotlin.jvm.internal.l.c(yVar);
            j2 = j4;
        }
        return -1L;
        return (i2 - yVar.f19406c) + j4;
    }

    @Override // j.d0
    public e0 timeout() {
        return e0.NONE;
    }

    public String toString() {
        return H0().toString();
    }

    @Override // j.h
    public boolean u() {
        return this.f19359g == 0;
    }

    public long u0(i iVar, long j2) throws IOException {
        long j3 = j2;
        kotlin.jvm.internal.l.f(iVar, "bytes");
        if (!(iVar.P() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (j3 >= 0) {
            y yVar = this.f19358f;
            if (yVar != null) {
                if (size() - j3 < j3) {
                    long size = size();
                    while (size > j3) {
                        yVar = yVar.f19411h;
                        kotlin.jvm.internal.l.c(yVar);
                        size -= yVar.f19407d - yVar.f19406c;
                    }
                    byte[] G = iVar.G();
                    byte b2 = G[0];
                    int P = iVar.P();
                    long size2 = (size() - P) + 1;
                    while (size < size2) {
                        byte[] bArr = yVar.f19405b;
                        long j5 = size;
                        int min = (int) Math.min(yVar.f19407d, (yVar.f19406c + size2) - size);
                        for (int i2 = (int) ((yVar.f19406c + j3) - j5); i2 < min; i2++) {
                            if (bArr[i2] == b2 && j.g0.a.c(yVar, i2 + 1, G, 1, P)) {
                                return (i2 - yVar.f19406c) + j5;
                            }
                        }
                        j3 = j5 + (yVar.f19407d - yVar.f19406c);
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                        size = j3;
                    }
                } else {
                    while (true) {
                        long j6 = (yVar.f19407d - yVar.f19406c) + j4;
                        if (j6 > j3) {
                            break;
                        }
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                        j4 = j6;
                    }
                    byte[] G2 = iVar.G();
                    byte b3 = G2[0];
                    int P2 = iVar.P();
                    long size3 = (size() - P2) + 1;
                    while (j4 < size3) {
                        byte[] bArr2 = yVar.f19405b;
                        long j7 = size3;
                        int min2 = (int) Math.min(yVar.f19407d, (yVar.f19406c + size3) - j4);
                        for (int i3 = (int) ((yVar.f19406c + j3) - j4); i3 < min2; i3++) {
                            if (bArr2[i3] == b3 && j.g0.a.c(yVar, i3 + 1, G2, 1, P2)) {
                                return (i3 - yVar.f19406c) + j4;
                            }
                        }
                        j4 += yVar.f19407d - yVar.f19406c;
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                        j3 = j4;
                        size3 = j7;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
    }

    public long v0(i iVar, long j2) {
        int i2;
        int i3;
        kotlin.jvm.internal.l.f(iVar, "targetBytes");
        long j3 = 0;
        if (j2 >= 0) {
            y yVar = this.f19358f;
            if (yVar == null) {
                return -1L;
            }
            if (size() - j2 < j2) {
                j3 = size();
                while (j3 > j2) {
                    yVar = yVar.f19411h;
                    kotlin.jvm.internal.l.c(yVar);
                    j3 -= yVar.f19407d - yVar.f19406c;
                }
                if (iVar.P() == 2) {
                    byte r = iVar.r(0);
                    byte r2 = iVar.r(1);
                    while (j3 < size()) {
                        byte[] bArr = yVar.f19405b;
                        i2 = (int) ((yVar.f19406c + j2) - j3);
                        int i4 = yVar.f19407d;
                        while (i2 < i4) {
                            byte b2 = bArr[i2];
                            if (b2 != r && b2 != r2) {
                                i2++;
                            }
                            i3 = yVar.f19406c;
                        }
                        j3 += yVar.f19407d - yVar.f19406c;
                        yVar = yVar.f19410g;
                        kotlin.jvm.internal.l.c(yVar);
                        j2 = j3;
                    }
                    return -1L;
                }
                byte[] G = iVar.G();
                while (j3 < size()) {
                    byte[] bArr2 = yVar.f19405b;
                    i2 = (int) ((yVar.f19406c + j2) - j3);
                    int i5 = yVar.f19407d;
                    while (i2 < i5) {
                        byte b3 = bArr2[i2];
                        for (byte b4 : G) {
                            if (b3 == b4) {
                                i3 = yVar.f19406c;
                            }
                        }
                        i2++;
                    }
                    j3 += yVar.f19407d - yVar.f19406c;
                    yVar = yVar.f19410g;
                    kotlin.jvm.internal.l.c(yVar);
                    j2 = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (yVar.f19407d - yVar.f19406c) + j3;
                if (j4 > j2) {
                    break;
                }
                yVar = yVar.f19410g;
                kotlin.jvm.internal.l.c(yVar);
                j3 = j4;
            }
            if (iVar.P() == 2) {
                byte r3 = iVar.r(0);
                byte r4 = iVar.r(1);
                while (j3 < size()) {
                    byte[] bArr3 = yVar.f19405b;
                    i2 = (int) ((yVar.f19406c + j2) - j3);
                    int i6 = yVar.f19407d;
                    while (i2 < i6) {
                        byte b5 = bArr3[i2];
                        if (b5 != r3 && b5 != r4) {
                            i2++;
                        }
                        i3 = yVar.f19406c;
                    }
                    j3 += yVar.f19407d - yVar.f19406c;
                    yVar = yVar.f19410g;
                    kotlin.jvm.internal.l.c(yVar);
                    j2 = j3;
                }
                return -1L;
            }
            byte[] G2 = iVar.G();
            while (j3 < size()) {
                byte[] bArr4 = yVar.f19405b;
                i2 = (int) ((yVar.f19406c + j2) - j3);
                int i7 = yVar.f19407d;
                while (i2 < i7) {
                    byte b6 = bArr4[i2];
                    for (byte b7 : G2) {
                        if (b6 == b7) {
                            i3 = yVar.f19406c;
                        }
                    }
                    i2++;
                }
                j3 += yVar.f19407d - yVar.f19406c;
                yVar = yVar.f19410g;
                kotlin.jvm.internal.l.c(yVar);
                j2 = j3;
            }
            return -1L;
            return (i2 - i3) + j3;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    public OutputStream w0() {
        return new c();
    }

    public boolean x0(long j2, i iVar, int i2, int i3) {
        kotlin.jvm.internal.l.f(iVar, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || iVar.P() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (s0(i4 + j2) != iVar.r(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // j.h
    public void y(f fVar, long j2) throws EOFException {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (size() >= j2) {
            fVar.write(this, j2);
        } else {
            fVar.write(this, size());
            throw new EOFException();
        }
    }

    public final a y0(a aVar) {
        kotlin.jvm.internal.l.f(aVar, "unsafeCursor");
        return j.g0.a.a(this, aVar);
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (f.this.size() > 0) {
                return f.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            kotlin.jvm.internal.l.f(bArr, "sink");
            return f.this.read(bArr, i2, i3);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        kotlin.jvm.internal.l.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            y J0 = J0(1);
            int min = Math.min(i2, 8192 - J0.f19407d);
            byteBuffer.get(J0.f19405b, J0.f19407d, min);
            i2 -= min;
            J0.f19407d += min;
        }
        this.f19359g += remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.l.f(bArr, "sink");
        j.c.b(bArr.length, i2, i3);
        y yVar = this.f19358f;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i3, yVar.f19407d - yVar.f19406c);
        byte[] bArr2 = yVar.f19405b;
        int i4 = yVar.f19406c;
        kotlin.collections.j.d(bArr2, bArr, i2, i4, i4 + min);
        yVar.f19406c += min;
        G0(size() - min);
        if (yVar.f19406c != yVar.f19407d) {
            return min;
        }
        this.f19358f = yVar.b();
        z.b(yVar);
        return min;
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        y yVar;
        kotlin.jvm.internal.l.f(fVar, "source");
        if (fVar != this) {
            j.c.b(fVar.size(), 0L, j2);
            while (j2 > 0) {
                y yVar2 = fVar.f19358f;
                kotlin.jvm.internal.l.c(yVar2);
                int i2 = yVar2.f19407d;
                kotlin.jvm.internal.l.c(fVar.f19358f);
                if (j2 < i2 - r2.f19406c) {
                    y yVar3 = this.f19358f;
                    if (yVar3 != null) {
                        kotlin.jvm.internal.l.c(yVar3);
                        yVar = yVar3.f19411h;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null && yVar.f19409f) {
                        if ((yVar.f19407d + j2) - (yVar.f19408e ? 0 : yVar.f19406c) <= 8192) {
                            y yVar4 = fVar.f19358f;
                            kotlin.jvm.internal.l.c(yVar4);
                            yVar4.g(yVar, (int) j2);
                            fVar.G0(fVar.size() - j2);
                            G0(size() + j2);
                            return;
                        }
                    }
                    y yVar5 = fVar.f19358f;
                    kotlin.jvm.internal.l.c(yVar5);
                    fVar.f19358f = yVar5.e((int) j2);
                }
                y yVar6 = fVar.f19358f;
                kotlin.jvm.internal.l.c(yVar6);
                long j3 = yVar6.f19407d - yVar6.f19406c;
                fVar.f19358f = yVar6.b();
                y yVar7 = this.f19358f;
                if (yVar7 == null) {
                    this.f19358f = yVar6;
                    yVar6.f19411h = yVar6;
                    yVar6.f19410g = yVar6;
                } else {
                    kotlin.jvm.internal.l.c(yVar7);
                    y yVar8 = yVar7.f19411h;
                    kotlin.jvm.internal.l.c(yVar8);
                    yVar8.c(yVar6).a();
                }
                fVar.G0(fVar.size() - j3);
                G0(size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        kotlin.jvm.internal.l.f(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j2 > size()) {
            j2 = size();
        }
        fVar.write(this, j2);
        return j2;
    }
}
