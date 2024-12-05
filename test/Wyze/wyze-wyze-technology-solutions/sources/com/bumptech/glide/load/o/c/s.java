package com.bumptech.glide.load.o.c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public class s extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    private volatile byte[] f8795f;

    /* renamed from: g, reason: collision with root package name */
    private int f8796g;

    /* renamed from: h, reason: collision with root package name */
    private int f8797h;

    /* renamed from: i, reason: collision with root package name */
    private int f8798i;

    /* renamed from: j, reason: collision with root package name */
    private int f8799j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.z.b f8800k;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public s(InputStream inputStream, com.bumptech.glide.load.engine.z.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f8798i;
        if (i2 != -1) {
            int i3 = this.f8799j - i2;
            int i4 = this.f8797h;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f8796g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f8800k.e(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f8795f = bArr2;
                    this.f8800k.d(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f8799j - this.f8798i;
                this.f8799j = i5;
                this.f8798i = 0;
                this.f8796g = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f8799j;
                if (read > 0) {
                    i6 += read;
                }
                this.f8796g = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f8798i = -1;
            this.f8799j = 0;
            this.f8796g = read2;
        }
        return read2;
    }

    private static IOException o() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f8795f != null && inputStream != null) {
        } else {
            throw o();
        }
        return (this.f8796g - this.f8799j) + inputStream.available();
    }

    public synchronized void b() {
        this.f8797h = this.f8795f.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8795f != null) {
            this.f8800k.d(this.f8795f);
            this.f8795f = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void f() {
        if (this.f8795f != null) {
            this.f8800k.d(this.f8795f);
            this.f8795f = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f8797h = Math.max(this.f8797h, i2);
        this.f8798i = this.f8799j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f8795f;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f8799j >= this.f8796g && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f8795f && (bArr = this.f8795f) == null) {
                throw o();
            }
            int i2 = this.f8796g;
            int i3 = this.f8799j;
            if (i2 - i3 <= 0) {
                return -1;
            }
            this.f8799j = i3 + 1;
            return bArr[i3] & 255;
        }
        throw o();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f8795f != null) {
            int i2 = this.f8798i;
            if (-1 != i2) {
                this.f8799j = i2;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f8799j + " markLimit: " + this.f8797h);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f8795f;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i2 = this.f8796g;
                int i3 = this.f8799j;
                if (i2 - i3 >= j2) {
                    this.f8799j = (int) (i3 + j2);
                    return j2;
                }
                long j3 = i2 - i3;
                this.f8799j = i2;
                if (this.f8798i != -1 && j2 <= this.f8797h) {
                    if (a(inputStream, bArr) == -1) {
                        return j3;
                    }
                    int i4 = this.f8796g;
                    int i5 = this.f8799j;
                    if (i4 - i5 >= j2 - j3) {
                        this.f8799j = (int) ((i5 + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + i4) - i5;
                    this.f8799j = i4;
                    return j4;
                }
                return j3 + inputStream.skip(j2 - j3);
            }
            throw o();
        }
        throw o();
    }

    s(InputStream inputStream, com.bumptech.glide.load.engine.z.b bVar, int i2) {
        super(inputStream);
        this.f8798i = -1;
        this.f8800k = bVar;
        this.f8795f = (byte[]) bVar.e(i2, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte[] bArr2 = this.f8795f;
        if (bArr2 == null) {
            throw o();
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f8799j;
            int i7 = this.f8796g;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f8799j += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f8798i == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.f8795f && (bArr2 = this.f8795f) == null) {
                        throw o();
                    }
                    int i9 = this.f8796g;
                    int i10 = this.f8799j;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f8799j += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            throw o();
        }
    }
}
