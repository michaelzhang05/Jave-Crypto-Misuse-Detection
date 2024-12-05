package p7;

import q7.AbstractC3664a;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3626a {

    /* renamed from: a, reason: collision with root package name */
    private int f37136a;

    /* renamed from: b, reason: collision with root package name */
    private int f37137b;

    /* renamed from: c, reason: collision with root package name */
    private int f37138c;

    /* renamed from: d, reason: collision with root package name */
    private short[][][] f37139d;

    /* renamed from: e, reason: collision with root package name */
    private short[][][] f37140e;

    /* renamed from: f, reason: collision with root package name */
    private short[][] f37141f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f37142g;

    public C3626a(byte b8, byte b9, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i8 = b8 & 255;
        this.f37136a = i8;
        int i9 = b9 & 255;
        this.f37137b = i9;
        this.f37138c = i9 - i8;
        this.f37139d = sArr;
        this.f37140e = sArr2;
        this.f37141f = sArr3;
        this.f37142g = sArr4;
    }

    public short[][][] a() {
        return this.f37139d;
    }

    public short[][][] b() {
        return this.f37140e;
    }

    public short[] c() {
        return this.f37142g;
    }

    public short[][] d() {
        return this.f37141f;
    }

    public int e() {
        return this.f37138c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3626a)) {
            return false;
        }
        C3626a c3626a = (C3626a) obj;
        if (this.f37136a != c3626a.f() || this.f37137b != c3626a.g() || this.f37138c != c3626a.e() || !AbstractC3664a.k(this.f37139d, c3626a.a()) || !AbstractC3664a.k(this.f37140e, c3626a.b()) || !AbstractC3664a.j(this.f37141f, c3626a.d()) || !AbstractC3664a.i(this.f37142g, c3626a.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f37136a;
    }

    public int g() {
        return this.f37137b;
    }

    public int hashCode() {
        return (((((((((((this.f37136a * 37) + this.f37137b) * 37) + this.f37138c) * 37) + E7.a.q(this.f37139d)) * 37) + E7.a.q(this.f37140e)) * 37) + E7.a.p(this.f37141f)) * 37) + E7.a.o(this.f37142g);
    }
}
