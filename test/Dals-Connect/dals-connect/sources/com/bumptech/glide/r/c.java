package com.bumptech.glide.r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    private final long f8950f;

    /* renamed from: g, reason: collision with root package name */
    private int f8951g;

    private c(InputStream inputStream, long j2) {
        super(inputStream);
        this.f8950f = j2;
    }

    private int a(int i2) throws IOException {
        if (i2 >= 0) {
            this.f8951g += i2;
        } else if (this.f8950f - this.f8951g > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f8950f + ", but read: " + this.f8951g);
        }
        return i2;
    }

    public static InputStream b(InputStream inputStream, long j2) {
        return new c(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f8950f - this.f8951g, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        return a(super.read(bArr, i2, i3));
    }
}
