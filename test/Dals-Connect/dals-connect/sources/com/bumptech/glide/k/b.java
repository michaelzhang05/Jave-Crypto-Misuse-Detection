package com.bumptech.glide.k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
class b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f8388f;

    /* renamed from: g, reason: collision with root package name */
    private final Charset f8389g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f8390h;

    /* renamed from: i, reason: collision with root package name */
    private int f8391i;

    /* renamed from: j, reason: collision with root package name */
    private int f8392j;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, b.this.f8389g.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f8388f;
        byte[] bArr = this.f8390h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f8391i = 0;
            this.f8392j = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f8388f) {
            if (this.f8390h != null) {
                this.f8390h = null;
                this.f8388f.close();
            }
        }
    }

    public boolean f() {
        return this.f8392j == -1;
    }

    public String o() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.f8388f) {
            if (this.f8390h != null) {
                if (this.f8391i >= this.f8392j) {
                    b();
                }
                for (int i4 = this.f8391i; i4 != this.f8392j; i4++) {
                    byte[] bArr2 = this.f8390h;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f8391i) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f8390h;
                                int i5 = this.f8391i;
                                String str = new String(bArr3, i5, i3 - i5, this.f8389g.name());
                                this.f8391i = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f8390h;
                        int i52 = this.f8391i;
                        String str2 = new String(bArr32, i52, i3 - i52, this.f8389g.name());
                        this.f8391i = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f8392j - this.f8391i) + 80);
                loop1: while (true) {
                    byte[] bArr4 = this.f8390h;
                    int i6 = this.f8391i;
                    aVar.write(bArr4, i6, this.f8392j - i6);
                    this.f8392j = -1;
                    b();
                    i2 = this.f8391i;
                    while (i2 != this.f8392j) {
                        bArr = this.f8390h;
                        if (bArr[i2] == 10) {
                            break loop1;
                        }
                        i2++;
                    }
                }
                int i7 = this.f8391i;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f8391i = i2 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 >= 0) {
            if (charset.equals(c.a)) {
                this.f8388f = inputStream;
                this.f8389g = charset;
                this.f8390h = new byte[i2];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
