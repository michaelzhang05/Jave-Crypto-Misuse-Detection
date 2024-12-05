package s7;

import t7.AbstractC4043a;

/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4020a {

    /* renamed from: a, reason: collision with root package name */
    private int f39335a;

    /* renamed from: b, reason: collision with root package name */
    private int f39336b;

    /* renamed from: c, reason: collision with root package name */
    private int f39337c;

    /* renamed from: d, reason: collision with root package name */
    private short[][][] f39338d;

    /* renamed from: e, reason: collision with root package name */
    private short[][][] f39339e;

    /* renamed from: f, reason: collision with root package name */
    private short[][] f39340f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f39341g;

    public C4020a(byte b8, byte b9, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i8 = b8 & 255;
        this.f39335a = i8;
        int i9 = b9 & 255;
        this.f39336b = i9;
        this.f39337c = i9 - i8;
        this.f39338d = sArr;
        this.f39339e = sArr2;
        this.f39340f = sArr3;
        this.f39341g = sArr4;
    }

    public short[][][] a() {
        return this.f39338d;
    }

    public short[][][] b() {
        return this.f39339e;
    }

    public short[] c() {
        return this.f39341g;
    }

    public short[][] d() {
        return this.f39340f;
    }

    public int e() {
        return this.f39337c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4020a)) {
            return false;
        }
        C4020a c4020a = (C4020a) obj;
        if (this.f39335a != c4020a.f() || this.f39336b != c4020a.g() || this.f39337c != c4020a.e() || !AbstractC4043a.k(this.f39338d, c4020a.a()) || !AbstractC4043a.k(this.f39339e, c4020a.b()) || !AbstractC4043a.j(this.f39340f, c4020a.d()) || !AbstractC4043a.i(this.f39341g, c4020a.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f39335a;
    }

    public int g() {
        return this.f39336b;
    }

    public int hashCode() {
        return (((((((((((this.f39335a * 37) + this.f39336b) * 37) + this.f39337c) * 37) + H7.a.q(this.f39338d)) * 37) + H7.a.q(this.f39339e)) * 37) + H7.a.p(this.f39340f)) * 37) + H7.a.o(this.f39341g);
    }
}
