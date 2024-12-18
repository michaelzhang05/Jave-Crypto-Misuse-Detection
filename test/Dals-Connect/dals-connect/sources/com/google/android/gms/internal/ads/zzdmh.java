package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdmh {
    private final byte[] a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f14803b;

    /* renamed from: c, reason: collision with root package name */
    private int f14804c;

    public zzdmh(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.a[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.a;
            i3 = (i3 + bArr2[i4] + bArr[i4 % bArr.length]) & 255;
            byte b2 = bArr2[i4];
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
        }
        this.f14803b = 0;
        this.f14804c = 0;
    }

    public final void a(byte[] bArr) {
        int i2 = this.f14803b;
        int i3 = this.f14804c;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            i2 = (i2 + 1) & 255;
            byte[] bArr2 = this.a;
            i3 = (i3 + bArr2[i2]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b2;
            bArr[i4] = (byte) (bArr2[(bArr2[i2] + bArr2[i3]) & 255] ^ bArr[i4]);
        }
        this.f14803b = i2;
        this.f14804c = i3;
    }
}
