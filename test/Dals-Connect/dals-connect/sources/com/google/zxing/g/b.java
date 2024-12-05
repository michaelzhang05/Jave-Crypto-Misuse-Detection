package com.google.zxing.g;

import java.util.Arrays;

/* compiled from: BitMatrix.java */
/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private final int f17034f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17035g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17036h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f17037i;

    public b(int i2) {
        this(i2, i2);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f17035g * (this.f17034f + 1));
        for (int i2 = 0; i2 < this.f17035g; i2++) {
            for (int i3 = 0; i3 < this.f17034f; i3++) {
                sb.append(e(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void c() {
        int length = this.f17037i.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f17037i[i2] = 0;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f17034f, this.f17035g, this.f17036h, (int[]) this.f17037i.clone());
    }

    public boolean e(int i2, int i3) {
        return ((this.f17037i[(i3 * this.f17036h) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17034f == bVar.f17034f && this.f17035g == bVar.f17035g && this.f17036h == bVar.f17036h && Arrays.equals(this.f17037i, bVar.f17037i);
    }

    public int g() {
        return this.f17035g;
    }

    public int h() {
        return this.f17034f;
    }

    public int hashCode() {
        int i2 = this.f17034f;
        return (((((((i2 * 31) + i2) * 31) + this.f17035g) * 31) + this.f17036h) * 31) + Arrays.hashCode(this.f17037i);
    }

    public void i(int i2, int i3) {
        int i4 = (i3 * this.f17036h) + (i2 / 32);
        int[] iArr = this.f17037i;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void j(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i5 > 0 && i4 > 0) {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.f17035g || i6 > this.f17034f) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i3 < i7) {
                int i8 = this.f17036h * i3;
                for (int i9 = i2; i9 < i6; i9++) {
                    int[] iArr = this.f17037i;
                    int i10 = (i9 / 32) + i8;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                }
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Height and width must be at least 1");
    }

    public String k(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return k("X ", "  ");
    }

    public b(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            this.f17034f = i2;
            this.f17035g = i3;
            int i4 = (i2 + 31) / 32;
            this.f17036h = i4;
            this.f17037i = new int[i4 * i3];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private b(int i2, int i3, int i4, int[] iArr) {
        this.f17034f = i2;
        this.f17035g = i3;
        this.f17036h = i4;
        this.f17037i = iArr;
    }
}
