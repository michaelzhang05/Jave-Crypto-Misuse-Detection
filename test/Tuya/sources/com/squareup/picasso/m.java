package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f23284a;

    /* renamed from: b, reason: collision with root package name */
    private long f23285b;

    /* renamed from: c, reason: collision with root package name */
    private long f23286c;

    /* renamed from: d, reason: collision with root package name */
    private long f23287d;

    /* renamed from: e, reason: collision with root package name */
    private long f23288e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23289f;

    /* renamed from: g, reason: collision with root package name */
    private int f23290g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void f(long j8) {
        try {
            long j9 = this.f23286c;
            long j10 = this.f23285b;
            if (j9 < j10 && j10 <= this.f23287d) {
                this.f23284a.reset();
                this.f23284a.mark((int) (j8 - this.f23286c));
                g(this.f23286c, this.f23285b);
            } else {
                this.f23286c = j10;
                this.f23284a.mark((int) (j8 - j10));
            }
            this.f23287d = j8;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void g(long j8, long j9) {
        while (j8 < j9) {
            long skip = this.f23284a.skip(j9 - j8);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j8 += skip;
        }
    }

    public void a(boolean z8) {
        this.f23289f = z8;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f23284a.available();
    }

    public void b(long j8) {
        if (this.f23285b <= this.f23287d && j8 >= this.f23286c) {
            this.f23284a.reset();
            g(this.f23286c, j8);
            this.f23285b = j8;
            return;
        }
        throw new IOException("Cannot reset");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23284a.close();
    }

    public long e(int i8) {
        long j8 = this.f23285b + i8;
        if (this.f23287d < j8) {
            f(j8);
        }
        return this.f23285b;
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.f23288e = e(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f23284a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f23289f) {
            long j8 = this.f23285b + 1;
            long j9 = this.f23287d;
            if (j8 > j9) {
                f(j9 + this.f23290g);
            }
        }
        int read = this.f23284a.read();
        if (read != -1) {
            this.f23285b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.f23288e);
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        if (!this.f23289f) {
            long j9 = this.f23285b;
            if (j9 + j8 > this.f23287d) {
                f(j9 + j8 + this.f23290g);
            }
        }
        long skip = this.f23284a.skip(j8);
        this.f23285b += skip;
        return skip;
    }

    m(InputStream inputStream, int i8) {
        this(inputStream, i8, 1024);
    }

    private m(InputStream inputStream, int i8, int i9) {
        this.f23288e = -1L;
        this.f23289f = true;
        this.f23290g = -1;
        this.f23284a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i8);
        this.f23290g = i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f23289f) {
            long j8 = this.f23285b;
            if (bArr.length + j8 > this.f23287d) {
                f(j8 + bArr.length + this.f23290g);
            }
        }
        int read = this.f23284a.read(bArr);
        if (read != -1) {
            this.f23285b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.f23289f) {
            long j8 = this.f23285b;
            long j9 = i9;
            if (j8 + j9 > this.f23287d) {
                f(j8 + j9 + this.f23290g);
            }
        }
        int read = this.f23284a.read(bArr, i8, i9);
        if (read != -1) {
            this.f23285b += read;
        }
        return read;
    }
}
