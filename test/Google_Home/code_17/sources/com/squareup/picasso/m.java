package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f24339a;

    /* renamed from: b, reason: collision with root package name */
    private long f24340b;

    /* renamed from: c, reason: collision with root package name */
    private long f24341c;

    /* renamed from: d, reason: collision with root package name */
    private long f24342d;

    /* renamed from: e, reason: collision with root package name */
    private long f24343e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24344f;

    /* renamed from: g, reason: collision with root package name */
    private int f24345g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void g(long j8) {
        try {
            long j9 = this.f24341c;
            long j10 = this.f24340b;
            if (j9 < j10 && j10 <= this.f24342d) {
                this.f24339a.reset();
                this.f24339a.mark((int) (j8 - this.f24341c));
                l(this.f24341c, this.f24340b);
            } else {
                this.f24341c = j10;
                this.f24339a.mark((int) (j8 - j10));
            }
            this.f24342d = j8;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void l(long j8, long j9) {
        while (j8 < j9) {
            long skip = this.f24339a.skip(j9 - j8);
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
        this.f24344f = z8;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f24339a.available();
    }

    public void b(long j8) {
        if (this.f24340b <= this.f24342d && j8 >= this.f24341c) {
            this.f24339a.reset();
            l(this.f24341c, j8);
            this.f24340b = j8;
            return;
        }
        throw new IOException("Cannot reset");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24339a.close();
    }

    public long f(int i8) {
        long j8 = this.f24340b + i8;
        if (this.f24342d < j8) {
            g(j8);
        }
        return this.f24340b;
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.f24343e = f(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f24339a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f24344f) {
            long j8 = this.f24340b + 1;
            long j9 = this.f24342d;
            if (j8 > j9) {
                g(j9 + this.f24345g);
            }
        }
        int read = this.f24339a.read();
        if (read != -1) {
            this.f24340b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.f24343e);
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        if (!this.f24344f) {
            long j9 = this.f24340b;
            if (j9 + j8 > this.f24342d) {
                g(j9 + j8 + this.f24345g);
            }
        }
        long skip = this.f24339a.skip(j8);
        this.f24340b += skip;
        return skip;
    }

    m(InputStream inputStream, int i8) {
        this(inputStream, i8, 1024);
    }

    private m(InputStream inputStream, int i8, int i9) {
        this.f24343e = -1L;
        this.f24344f = true;
        this.f24345g = -1;
        this.f24339a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i8);
        this.f24345g = i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f24344f) {
            long j8 = this.f24340b;
            if (bArr.length + j8 > this.f24342d) {
                g(j8 + bArr.length + this.f24345g);
            }
        }
        int read = this.f24339a.read(bArr);
        if (read != -1) {
            this.f24340b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.f24344f) {
            long j8 = this.f24340b;
            long j9 = i9;
            if (j8 + j9 > this.f24342d) {
                g(j8 + j9 + this.f24345g);
            }
        }
        int read = this.f24339a.read(bArr, i8, i9);
        if (read != -1) {
            this.f24340b += read;
        }
        return read;
    }
}
