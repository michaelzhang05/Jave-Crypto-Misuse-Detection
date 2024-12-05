package com.bumptech.glide.load.m;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f8675f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8676g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8677h;

    /* renamed from: i, reason: collision with root package name */
    private final byte f8678i;

    /* renamed from: j, reason: collision with root package name */
    private int f8679j;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f8675f = bArr;
        int length = bArr.length;
        f8676g = length;
        f8677h = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f8678i = (byte) i2;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i2;
        int i3 = this.f8679j;
        if (i3 < 2 || i3 > (i2 = f8677h)) {
            read = super.read();
        } else if (i3 == i2) {
            read = this.f8678i;
        } else {
            read = f8675f[i3 - 2] & 255;
        }
        if (read != -1) {
            this.f8679j++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f8679j = (int) (this.f8679j + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f8679j;
        int i6 = f8677h;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f8678i;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f8675f, this.f8679j - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f8679j += i4;
        }
        return i4;
    }
}
