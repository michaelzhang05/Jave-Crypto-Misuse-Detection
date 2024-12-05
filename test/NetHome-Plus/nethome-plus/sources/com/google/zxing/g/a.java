package com.google.zxing.g;

import java.util.Arrays;

/* compiled from: BitArray.java */
/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private int[] f17032f;

    /* renamed from: g, reason: collision with root package name */
    private int f17033g;

    public a() {
        this.f17033g = 0;
        this.f17032f = new int[1];
    }

    private void g(int i2) {
        if (i2 > (this.f17032f.length << 5)) {
            int[] k2 = k(i2);
            int[] iArr = this.f17032f;
            System.arraycopy(iArr, 0, k2, 0, iArr.length);
            this.f17032f = k2;
        }
    }

    private static int[] k(int i2) {
        return new int[(i2 + 31) / 32];
    }

    public void b(boolean z) {
        g(this.f17033g + 1);
        if (z) {
            int[] iArr = this.f17032f;
            int i2 = this.f17033g;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f17033g++;
    }

    public void c(a aVar) {
        int i2 = aVar.f17033g;
        g(this.f17033g + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            b(aVar.h(i3));
        }
    }

    public void d(int i2, int i3) {
        if (i3 >= 0 && i3 <= 32) {
            g(this.f17033g + i3);
            while (i3 > 0) {
                boolean z = true;
                if (((i2 >> (i3 - 1)) & 1) != 1) {
                    z = false;
                }
                b(z);
                i3--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f17032f.clone(), this.f17033g);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17033g == aVar.f17033g && Arrays.equals(this.f17032f, aVar.f17032f);
    }

    public boolean h(int i2) {
        return ((1 << (i2 & 31)) & this.f17032f[i2 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f17033g * 31) + Arrays.hashCode(this.f17032f);
    }

    public int i() {
        return this.f17033g;
    }

    public int j() {
        return (this.f17033g + 7) / 8;
    }

    public void l(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (h(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    public void m(a aVar) {
        if (this.f17033g != aVar.f17033g) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f17032f;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] ^ aVar.f17032f[i2];
            i2++;
        }
    }

    public String toString() {
        int i2 = this.f17033g;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.f17033g; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(h(i3) ? 'X' : '.');
        }
        return sb.toString();
    }

    a(int[] iArr, int i2) {
        this.f17032f = iArr;
        this.f17033g = i2;
    }
}
