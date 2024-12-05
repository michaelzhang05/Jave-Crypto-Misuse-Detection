package com.bumptech.glide.load.m;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f8670f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f8671g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.z.b f8672h;

    /* renamed from: i, reason: collision with root package name */
    private int f8673i;

    public c(OutputStream outputStream, com.bumptech.glide.load.engine.z.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i2 = this.f8673i;
        if (i2 > 0) {
            this.f8670f.write(this.f8671g, 0, i2);
            this.f8673i = 0;
        }
    }

    private void b() throws IOException {
        if (this.f8673i == this.f8671g.length) {
            a();
        }
    }

    private void f() {
        byte[] bArr = this.f8671g;
        if (bArr != null) {
            this.f8672h.d(bArr);
            this.f8671g = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f8670f.close();
            f();
        } catch (Throwable th) {
            this.f8670f.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f8670f.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f8671g;
        int i3 = this.f8673i;
        this.f8673i = i3 + 1;
        bArr[i3] = (byte) i2;
        b();
    }

    c(OutputStream outputStream, com.bumptech.glide.load.engine.z.b bVar, int i2) {
        this.f8670f = outputStream;
        this.f8672h = bVar;
        this.f8671g = (byte[]) bVar.e(i2, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f8673i;
            if (i7 == 0 && i5 >= this.f8671g.length) {
                this.f8670f.write(bArr, i6, i5);
                return;
            }
            int min = Math.min(i5, this.f8671g.length - i7);
            System.arraycopy(bArr, i6, this.f8671g, this.f8673i, min);
            this.f8673i += min;
            i4 += min;
            b();
        } while (i4 < i3);
    }
}
