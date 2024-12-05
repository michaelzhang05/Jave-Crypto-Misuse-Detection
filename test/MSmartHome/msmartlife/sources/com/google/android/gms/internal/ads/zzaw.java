package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaw extends ByteArrayOutputStream {

    /* renamed from: f, reason: collision with root package name */
    private final zzal f13020f;

    public zzaw(zzal zzalVar, int i2) {
        this.f13020f = zzalVar;
        ((ByteArrayOutputStream) this).buf = zzalVar.b(Math.max(i2, 256));
    }

    private final void a(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] b2 = this.f13020f.b((i3 + i2) << 1);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b2, 0, ((ByteArrayOutputStream) this).count);
        this.f13020f.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b2;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13020f.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f13020f.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        a(i3);
        super.write(bArr, i2, i3);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        a(1);
        super.write(i2);
    }
}
