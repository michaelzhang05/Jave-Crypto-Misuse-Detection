package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsu {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f15557b;

    /* renamed from: c, reason: collision with root package name */
    private int f15558c;

    /* renamed from: d, reason: collision with root package name */
    private int f15559d = 0;

    public zzsu(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f15558c = i2;
        this.f15557b = i3;
        h();
    }

    private final boolean c(int i2) {
        if (2 > i2 || i2 >= this.f15557b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    private final int g() {
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? a(i2) : 0);
    }

    private final void h() {
        int i2;
        int i3;
        int i4 = this.f15558c;
        zzsk.e(i4 >= 0 && (i2 = this.f15559d) >= 0 && i2 < 8 && (i4 < (i3 = this.f15557b) || (i4 == i3 && i2 == 0)));
    }

    public final int a(int i2) {
        int i3;
        int i4;
        if (i2 == 0) {
            return 0;
        }
        int i5 = i2 / 8;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = c(this.f15558c + 1) ? this.f15558c + 2 : this.f15558c + 1;
            int i9 = this.f15559d;
            if (i9 != 0) {
                byte[] bArr = this.a;
                i4 = ((bArr[i8] & 255) >>> (8 - i9)) | ((bArr[this.f15558c] & 255) << i9);
            } else {
                i4 = this.a[this.f15558c];
            }
            i2 -= 8;
            i6 |= (255 & i4) << i2;
            this.f15558c = i8;
        }
        if (i2 > 0) {
            int i10 = this.f15559d + i2;
            byte b2 = (byte) (255 >> (8 - i2));
            int i11 = c(this.f15558c + 1) ? this.f15558c + 2 : this.f15558c + 1;
            if (i10 > 8) {
                byte[] bArr2 = this.a;
                i3 = (b2 & (((255 & bArr2[i11]) >> (16 - i10)) | ((bArr2[this.f15558c] & 255) << (i10 - 8)))) | i6;
                this.f15558c = i11;
            } else {
                i3 = (b2 & ((255 & this.a[this.f15558c]) >> (8 - i10))) | i6;
                if (i10 == 8) {
                    this.f15558c = i11;
                }
            }
            i6 = i3;
            this.f15559d = i10 % 8;
        }
        h();
        return i6;
    }

    public final void b(int i2) {
        int i3 = this.f15558c;
        int i4 = (i2 / 8) + i3;
        this.f15558c = i4;
        int i5 = this.f15559d + (i2 % 8);
        this.f15559d = i5;
        if (i5 > 7) {
            this.f15558c = i4 + 1;
            this.f15559d = i5 - 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.f15558c) {
                if (c(i3)) {
                    this.f15558c++;
                    i3 += 2;
                }
            } else {
                h();
                return;
            }
        }
    }

    public final boolean d() {
        return a(1) == 1;
    }

    public final int e() {
        return g();
    }

    public final int f() {
        int g2 = g();
        return (g2 % 2 == 0 ? -1 : 1) * ((g2 + 1) / 2);
    }
}
