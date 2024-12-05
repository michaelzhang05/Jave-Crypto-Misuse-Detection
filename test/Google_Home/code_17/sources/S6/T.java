package S6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class T implements InterfaceC1419g {

    /* renamed from: a, reason: collision with root package name */
    public final Z f9839a;

    /* renamed from: b, reason: collision with root package name */
    public final C1417e f9840b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9841c;

    public T(Z source) {
        AbstractC3255y.i(source, "source");
        this.f9839a = source;
        this.f9840b = new C1417e();
    }

    @Override // S6.Z
    public long C(C1417e sink, long j8) {
        AbstractC3255y.i(sink, "sink");
        if (j8 >= 0) {
            if (!this.f9841c) {
                if (this.f9840b.E() == 0 && this.f9839a.C(this.f9840b, 8192L) == -1) {
                    return -1L;
                }
                return this.f9840b.C(sink, Math.min(j8, this.f9840b.E()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    public boolean a(long j8, C1420h bytes, int i8, int i9) {
        AbstractC3255y.i(bytes, "bytes");
        if (!this.f9841c) {
            if (j8 >= 0 && i8 >= 0 && i9 >= 0 && bytes.K() - i8 >= i9) {
                for (int i10 = 0; i10 < i9; i10++) {
                    long j9 = i10 + j8;
                    if (request(1 + j9) && this.f9840b.n(j9) == bytes.h(i8 + i10)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1419g
    public C1417e buffer() {
        return this.f9840b;
    }

    @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f9841c) {
            this.f9841c = true;
            this.f9839a.close();
            this.f9840b.a();
        }
    }

    @Override // S6.InterfaceC1419g
    public boolean d(long j8, C1420h bytes) {
        AbstractC3255y.i(bytes, "bytes");
        return a(j8, bytes, 0, bytes.K());
    }

    @Override // S6.InterfaceC1419g
    public boolean exhausted() {
        if (!this.f9841c) {
            if (this.f9840b.exhausted() && this.f9839a.C(this.f9840b, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.InterfaceC1419g
    public C1417e i() {
        return this.f9840b;
    }

    public long indexOf(byte b8) {
        return indexOf(b8, 0L, Long.MAX_VALUE);
    }

    @Override // S6.InterfaceC1419g
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9841c;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC3255y.i(sink, "sink");
        if (this.f9840b.E() == 0 && this.f9839a.C(this.f9840b, 8192L) == -1) {
            return -1;
        }
        return this.f9840b.read(sink);
    }

    @Override // S6.InterfaceC1419g
    public byte readByte() {
        require(1L);
        return this.f9840b.readByte();
    }

    @Override // S6.InterfaceC1419g
    public byte[] readByteArray() {
        this.f9840b.L(this.f9839a);
        return this.f9840b.readByteArray();
    }

    @Override // S6.InterfaceC1419g
    public C1420h readByteString(long j8) {
        require(j8);
        return this.f9840b.readByteString(j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, j6.AbstractC3202a.a(j6.AbstractC3202a.a(16)));
        kotlin.jvm.internal.AbstractC3255y.h(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // S6.InterfaceC1419g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L56
            S6.e r8 = r10.f9840b
            byte r8 = r8.n(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r9 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = j6.AbstractC3202a.a(r2)
            int r2 = j6.AbstractC3202a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            S6.e r0 = r10.f9840b
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.T.readDecimalLong():long");
    }

    @Override // S6.InterfaceC1419g
    public void readFully(byte[] sink) {
        AbstractC3255y.i(sink, "sink");
        try {
            require(sink.length);
            this.f9840b.readFully(sink);
        } catch (EOFException e8) {
            int i8 = 0;
            while (this.f9840b.E() > 0) {
                C1417e c1417e = this.f9840b;
                int read = c1417e.read(sink, i8, (int) c1417e.E());
                if (read != -1) {
                    i8 += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, j6.AbstractC3202a.a(j6.AbstractC3202a.a(16)));
        kotlin.jvm.internal.AbstractC3255y.h(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // S6.InterfaceC1419g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5e
            S6.e r2 = r5.f9840b
            long r3 = (long) r0
            byte r2 = r2.n(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = j6.AbstractC3202a.a(r3)
            int r3 = j6.AbstractC3202a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            S6.e r0 = r5.f9840b
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.T.readHexadecimalUnsignedLong():long");
    }

    @Override // S6.InterfaceC1419g
    public int readInt() {
        require(4L);
        return this.f9840b.readInt();
    }

    @Override // S6.InterfaceC1419g
    public int readIntLe() {
        require(4L);
        return this.f9840b.readIntLe();
    }

    @Override // S6.InterfaceC1419g
    public long readLongLe() {
        require(8L);
        return this.f9840b.readLongLe();
    }

    @Override // S6.InterfaceC1419g
    public short readShort() {
        require(2L);
        return this.f9840b.readShort();
    }

    @Override // S6.InterfaceC1419g
    public short readShortLe() {
        require(2L);
        return this.f9840b.readShortLe();
    }

    @Override // S6.InterfaceC1419g
    public String readUtf8(long j8) {
        require(j8);
        return this.f9840b.readUtf8(j8);
    }

    @Override // S6.InterfaceC1419g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j8) {
        if (j8 >= 0) {
            if (!(!this.f9841c)) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f9840b.E() < j8) {
                if (this.f9839a.C(this.f9840b, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // S6.InterfaceC1419g
    public void require(long j8) {
        if (request(j8)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // S6.InterfaceC1419g
    public void skip(long j8) {
        if (!this.f9841c) {
            while (j8 > 0) {
                if (this.f9840b.E() == 0 && this.f9839a.C(this.f9840b, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j8, this.f9840b.E());
                this.f9840b.skip(min);
                j8 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // S6.Z
    public a0 timeout() {
        return this.f9839a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f9839a + ')';
    }

    public long indexOf(byte b8, long j8, long j9) {
        if (!(!this.f9841c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        while (j8 < j9) {
            long indexOf = this.f9840b.indexOf(b8, j8, j9);
            if (indexOf != -1) {
                return indexOf;
            }
            long E8 = this.f9840b.E();
            if (E8 >= j9 || this.f9839a.C(this.f9840b, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, E8);
        }
        return -1L;
    }

    @Override // S6.InterfaceC1419g
    public String readUtf8LineStrict(long j8) {
        if (j8 >= 0) {
            long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return T6.a.b(this.f9840b, indexOf);
            }
            if (j9 < Long.MAX_VALUE && request(j9) && this.f9840b.n(j9 - 1) == 13 && request(1 + j9) && this.f9840b.n(j9) == 10) {
                return T6.a.b(this.f9840b, j9);
            }
            C1417e c1417e = new C1417e();
            C1417e c1417e2 = this.f9840b;
            c1417e2.l(c1417e, 0L, Math.min(32, c1417e2.E()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f9840b.E(), j8) + " content=" + c1417e.A().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j8).toString());
    }

    @Override // S6.InterfaceC1419g
    public byte[] readByteArray(long j8) {
        require(j8);
        return this.f9840b.readByteArray(j8);
    }

    /* loaded from: classes5.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            T t8 = T.this;
            if (!t8.f9841c) {
                return (int) Math.min(t8.f9840b.E(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            T.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            T t8 = T.this;
            if (!t8.f9841c) {
                if (t8.f9840b.E() == 0) {
                    T t9 = T.this;
                    if (t9.f9839a.C(t9.f9840b, 8192L) == -1) {
                        return -1;
                    }
                }
                return T.this.f9840b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return T.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i8, int i9) {
            AbstractC3255y.i(data, "data");
            if (!T.this.f9841c) {
                AbstractC1414b.b(data.length, i8, i9);
                if (T.this.f9840b.E() == 0) {
                    T t8 = T.this;
                    if (t8.f9839a.C(t8.f9840b, 8192L) == -1) {
                        return -1;
                    }
                }
                return T.this.f9840b.read(data, i8, i9);
            }
            throw new IOException("closed");
        }
    }
}
