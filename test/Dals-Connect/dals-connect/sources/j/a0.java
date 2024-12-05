package j;

import java.security.MessageDigest;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes2.dex */
public final class a0 extends i {

    /* renamed from: k, reason: collision with root package name */
    private final transient byte[][] f19353k;
    private final transient int[] l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(byte[][] bArr, int[] iArr) {
        super(i.f19368f.B());
        kotlin.jvm.internal.l.f(bArr, "segments");
        kotlin.jvm.internal.l.f(iArr, "directory");
        this.f19353k = bArr;
        this.l = iArr;
    }

    private final i X() {
        return new i(W());
    }

    private final Object writeReplace() {
        i X = X();
        if (X != null) {
            return X;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // j.i
    public int D() {
        return U()[V().length - 1];
    }

    @Override // j.i
    public String F() {
        return X().F();
    }

    @Override // j.i
    public byte[] G() {
        return W();
    }

    @Override // j.i
    public byte H(int i2) {
        c.b(U()[V().length - 1], i2, 1L);
        int b2 = j.g0.c.b(this, i2);
        return V()[b2][(i2 - (b2 == 0 ? 0 : U()[b2 - 1])) + U()[V().length + b2]];
    }

    @Override // j.i
    public boolean J(int i2, i iVar, int i3, int i4) {
        kotlin.jvm.internal.l.f(iVar, "other");
        if (i2 < 0 || i2 > P() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = j.g0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = b2 == 0 ? 0 : U()[b2 - 1];
            int i7 = U()[b2] - i6;
            int i8 = U()[V().length + b2];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!iVar.K(i3, V()[b2], i8 + (i2 - i6), min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    @Override // j.i
    public boolean K(int i2, byte[] bArr, int i3, int i4) {
        kotlin.jvm.internal.l.f(bArr, "other");
        if (i2 < 0 || i2 > P() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = j.g0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = b2 == 0 ? 0 : U()[b2 - 1];
            int i7 = U()[b2] - i6;
            int i8 = U()[V().length + b2];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!c.a(V()[b2], i8 + (i2 - i6), bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    @Override // j.i
    public i R() {
        return X().R();
    }

    @Override // j.i
    public void T(f fVar, int i2, int i3) {
        kotlin.jvm.internal.l.f(fVar, "buffer");
        int i4 = i2 + i3;
        int b2 = j.g0.c.b(this, i2);
        while (i2 < i4) {
            int i5 = b2 == 0 ? 0 : U()[b2 - 1];
            int i6 = U()[b2] - i5;
            int i7 = U()[V().length + b2];
            int min = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            y yVar = new y(V()[b2], i8, i8 + min, true, false);
            y yVar2 = fVar.f19358f;
            if (yVar2 == null) {
                yVar.f19411h = yVar;
                yVar.f19410g = yVar;
                fVar.f19358f = yVar;
            } else {
                kotlin.jvm.internal.l.c(yVar2);
                y yVar3 = yVar2.f19411h;
                kotlin.jvm.internal.l.c(yVar3);
                yVar3.c(yVar);
            }
            i2 += min;
            b2++;
        }
        fVar.G0(fVar.size() + i3);
    }

    public final int[] U() {
        return this.l;
    }

    public final byte[][] V() {
        return this.f19353k;
    }

    public byte[] W() {
        byte[] bArr = new byte[P()];
        int length = V().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = U()[length + i2];
            int i6 = U()[i2];
            int i7 = i6 - i3;
            kotlin.collections.m.d(V()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // j.i
    public String d() {
        return X().d();
    }

    @Override // j.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.P() == P() && J(0, iVar, 0, P())) {
                return true;
            }
        }
        return false;
    }

    @Override // j.i
    public int hashCode() {
        int C = C();
        if (C != 0) {
            return C;
        }
        int length = V().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = U()[length + i2];
            int i6 = U()[i2];
            byte[] bArr = V()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        L(i3);
        return i3;
    }

    @Override // j.i
    public i n(String str) {
        kotlin.jvm.internal.l.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = V().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = U()[length + i2];
            int i5 = U()[i2];
            messageDigest.update(V()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.e(digest, "digestBytes");
        return new i(digest);
    }

    @Override // j.i
    public String toString() {
        return X().toString();
    }
}
