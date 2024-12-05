package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class h00 {
    private static final int[] a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11498b = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    private int f11499c;

    /* renamed from: d, reason: collision with root package name */
    private int f11500d;

    public final void a() {
        this.f11499c = 0;
        this.f11500d = 0;
    }

    public final long b(zzie zzieVar, boolean z, boolean z2) throws IOException, InterruptedException {
        if (this.f11499c == 0) {
            if (!zzieVar.b(this.f11498b, 0, 1, z)) {
                return -1L;
            }
            int i2 = this.f11498b[0] & 255;
            this.f11500d = -1;
            int i3 = 0;
            while (true) {
                int[] iArr = a;
                if (i3 >= iArr.length) {
                    break;
                }
                if ((iArr[i3] & i2) != 0) {
                    this.f11500d = i3 + 1;
                    break;
                }
                i3++;
            }
            if (this.f11500d != -1) {
                this.f11499c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        zzieVar.readFully(this.f11498b, 1, this.f11500d - 1);
        if (z2) {
            byte[] bArr = this.f11498b;
            bArr[0] = (byte) (bArr[0] & (a[this.f11500d - 1] ^ (-1)));
        }
        long j2 = 0;
        for (int i4 = 0; i4 < this.f11500d; i4++) {
            j2 = (j2 << 8) | (this.f11498b[i4] & 255);
        }
        this.f11499c = 0;
        return j2;
    }

    public final int c() {
        return this.f11500d;
    }
}
