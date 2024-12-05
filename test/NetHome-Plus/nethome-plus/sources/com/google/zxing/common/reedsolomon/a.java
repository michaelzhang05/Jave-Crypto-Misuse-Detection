package com.google.zxing.common.reedsolomon;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GenericGF.java */
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a(4201, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: b, reason: collision with root package name */
    public static final a f17002b = new a(1033, 1024, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f17003c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f17004d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f17005e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f17006f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f17007g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f17008h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f17009i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f17010j;

    /* renamed from: k, reason: collision with root package name */
    private final b f17011k;
    private final b l;
    private final int m;
    private final int n;
    private final int o;

    static {
        a aVar = new a(67, 64, 1);
        f17003c = aVar;
        f17004d = new a(19, 16, 1);
        f17005e = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f17006f = aVar2;
        f17007g = aVar2;
        f17008h = aVar;
    }

    public a(int i2, int i3, int i4) {
        this.n = i2;
        this.m = i3;
        this.o = i4;
        this.f17009i = new int[i3];
        this.f17010j = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f17009i[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f17010j[this.f17009i[i7]] = i7;
        }
        this.f17011k = new b(this, new int[]{0});
        this.l = new b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f17011k;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new b(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i2) {
        return this.f17009i[i2];
    }

    public int d() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e() {
        return this.f17011k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i2) {
        if (i2 != 0) {
            return this.f17009i[(this.m - this.f17010j[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(int i2) {
        if (i2 != 0) {
            return this.f17010j[i2];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f17009i;
        int[] iArr2 = this.f17010j;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.m - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.n) + ',' + this.m + ')';
    }
}
