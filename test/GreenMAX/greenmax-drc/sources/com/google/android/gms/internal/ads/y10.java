package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class y10 {
    private static final long[] a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12417b = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    private int f12418c;

    /* renamed from: d, reason: collision with root package name */
    private int f12419d;

    public static long c(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= a[i2 - 1] ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public static int d(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = a;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & i2) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    public final void a() {
        this.f12418c = 0;
        this.f12419d = 0;
    }

    public final long b(zzno zznoVar, boolean z, boolean z2, int i2) throws IOException, InterruptedException {
        if (this.f12418c == 0) {
            if (!zznoVar.b(this.f12417b, 0, 1, z)) {
                return -1L;
            }
            int d2 = d(this.f12417b[0] & 255);
            this.f12419d = d2;
            if (d2 != -1) {
                this.f12418c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.f12419d;
        if (i3 > i2) {
            this.f12418c = 0;
            return -2L;
        }
        if (i3 != 1) {
            zznoVar.readFully(this.f12417b, 1, i3 - 1);
        }
        this.f12418c = 0;
        return c(this.f12417b, this.f12419d, z2);
    }

    public final int e() {
        return this.f12419d;
    }
}
