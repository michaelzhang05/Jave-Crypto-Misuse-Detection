package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class zzya {
    private final ByteBuffer a;

    private zzya(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, i2, i3));
    }

    public static int a(int i2, zzyi zzyiVar) {
        int c2 = c(i2);
        int c3 = zzyiVar.c();
        return c2 + d(c3) + c3;
    }

    public static int c(int i2) {
        return d(i2 << 3);
    }

    public static int d(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    private final void f(int i2) throws IOException {
        byte b2 = (byte) i2;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new zzyb(this.a.position(), this.a.limit());
    }

    public static zzya h(byte[] bArr, int i2, int i3) {
        return new zzya(bArr, 0, i3);
    }

    public static zzya i(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public final void b(zzyi zzyiVar) throws IOException {
        g(zzyiVar.e());
        zzyiVar.a(this);
    }

    public final void e(int i2, int i3) throws IOException {
        g((i2 << 3) | i3);
    }

    public final void g(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            f((i2 & 127) | 128);
            i2 >>>= 7;
        }
        f(i2);
    }

    public final void j(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new zzyb(this.a.position(), this.a.limit());
    }

    private zzya(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
