package S6;

import P5.AbstractC1371l;
import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class W extends C1420h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f9856f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f9857g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(byte[][] segments, int[] directory) {
        super(C1420h.f9898e.i());
        AbstractC3255y.i(segments, "segments");
        AbstractC3255y.i(directory, "directory");
        this.f9856f = segments;
        this.f9857g = directory;
    }

    private final C1420h V() {
        return new C1420h(P());
    }

    @Override // S6.C1420h
    public boolean D(int i8, C1420h other, int i9, int i10) {
        int i11;
        AbstractC3255y.i(other, "other");
        if (i8 < 0 || i8 > K() - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b8 = T6.e.b(this, i8);
        while (i8 < i12) {
            if (b8 == 0) {
                i11 = 0;
            } else {
                i11 = S()[b8 - 1];
            }
            int i13 = S()[b8] - i11;
            int i14 = S()[T().length + b8];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!other.E(i9, T()[b8], i14 + (i8 - i11), min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b8++;
        }
        return true;
    }

    @Override // S6.C1420h
    public boolean E(int i8, byte[] other, int i9, int i10) {
        int i11;
        AbstractC3255y.i(other, "other");
        if (i8 < 0 || i8 > K() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b8 = T6.e.b(this, i8);
        while (i8 < i12) {
            if (b8 == 0) {
                i11 = 0;
            } else {
                i11 = S()[b8 - 1];
            }
            int i13 = S()[b8] - i11;
            int i14 = S()[T().length + b8];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!AbstractC1414b.a(T()[b8], i14 + (i8 - i11), other, i9, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b8++;
        }
        return true;
    }

    @Override // S6.C1420h
    public C1420h M(int i8, int i9) {
        int d8 = AbstractC1414b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= K()) {
                int i10 = d8 - i8;
                if (i10 >= 0) {
                    if (i8 == 0 && d8 == K()) {
                        return this;
                    }
                    if (i8 == d8) {
                        return C1420h.f9898e;
                    }
                    int b8 = T6.e.b(this, i8);
                    int b9 = T6.e.b(this, d8 - 1);
                    byte[][] bArr = (byte[][]) AbstractC1371l.p(T(), b8, b9 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i11 = 0;
                    if (b8 <= b9) {
                        int i12 = b8;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(S()[i12] - i8, i10);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr.length] = S()[T().length + i12];
                            if (i12 == b9) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (b8 != 0) {
                        i11 = S()[b8 - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i8 - i11);
                    return new W(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + d8 + " < beginIndex=" + i8).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + d8 + " > length(" + K() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i8 + " < 0").toString());
    }

    @Override // S6.C1420h
    public C1420h O() {
        return V().O();
    }

    @Override // S6.C1420h
    public byte[] P() {
        byte[] bArr = new byte[K()];
        int length = T().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = S()[length + i8];
            int i12 = S()[i8];
            int i13 = i12 - i9;
            AbstractC1371l.d(T()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // S6.C1420h
    public void R(C1417e buffer, int i8, int i9) {
        int i10;
        AbstractC3255y.i(buffer, "buffer");
        int i11 = i8 + i9;
        int b8 = T6.e.b(this, i8);
        while (i8 < i11) {
            if (b8 == 0) {
                i10 = 0;
            } else {
                i10 = S()[b8 - 1];
            }
            int i12 = S()[b8] - i10;
            int i13 = S()[T().length + b8];
            int min = Math.min(i11, i12 + i10) - i8;
            int i14 = i13 + (i8 - i10);
            U u8 = new U(T()[b8], i14, i14 + min, true, false);
            U u9 = buffer.f9887a;
            if (u9 == null) {
                u8.f9850g = u8;
                u8.f9849f = u8;
                buffer.f9887a = u8;
            } else {
                AbstractC3255y.f(u9);
                U u10 = u9.f9850g;
                AbstractC3255y.f(u10);
                u10.c(u8);
            }
            i8 += min;
            b8++;
        }
        buffer.D(buffer.E() + i9);
    }

    public final int[] S() {
        return this.f9857g;
    }

    public final byte[][] T() {
        return this.f9856f;
    }

    @Override // S6.C1420h
    public String a() {
        return V().a();
    }

    @Override // S6.C1420h
    public C1420h e(String algorithm) {
        AbstractC3255y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = T().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = S()[length + i8];
            int i11 = S()[i8];
            messageDigest.update(T()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
        byte[] digestBytes = messageDigest.digest();
        AbstractC3255y.h(digestBytes, "digestBytes");
        return new C1420h(digestBytes);
    }

    @Override // S6.C1420h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1420h) {
            C1420h c1420h = (C1420h) obj;
            if (c1420h.K() == K() && D(0, c1420h, 0, K())) {
                return true;
            }
        }
        return false;
    }

    @Override // S6.C1420h
    public int hashCode() {
        int j8 = j();
        if (j8 == 0) {
            int length = T().length;
            int i8 = 0;
            int i9 = 1;
            int i10 = 0;
            while (i8 < length) {
                int i11 = S()[length + i8];
                int i12 = S()[i8];
                byte[] bArr = T()[i8];
                int i13 = (i12 - i10) + i11;
                while (i11 < i13) {
                    i9 = (i9 * 31) + bArr[i11];
                    i11++;
                }
                i8++;
                i10 = i12;
            }
            F(i9);
            return i9;
        }
        return j8;
    }

    @Override // S6.C1420h
    public int k() {
        return S()[T().length - 1];
    }

    @Override // S6.C1420h
    public String n() {
        return V().n();
    }

    @Override // S6.C1420h
    public int q(byte[] other, int i8) {
        AbstractC3255y.i(other, "other");
        return V().q(other, i8);
    }

    @Override // S6.C1420h
    public byte[] s() {
        return P();
    }

    @Override // S6.C1420h
    public byte t(int i8) {
        int i9;
        AbstractC1414b.b(S()[T().length - 1], i8, 1L);
        int b8 = T6.e.b(this, i8);
        if (b8 == 0) {
            i9 = 0;
        } else {
            i9 = S()[b8 - 1];
        }
        return T()[b8][(i8 - i9) + S()[T().length + b8]];
    }

    @Override // S6.C1420h
    public String toString() {
        return V().toString();
    }

    @Override // S6.C1420h
    public int v(byte[] other, int i8) {
        AbstractC3255y.i(other, "other");
        return V().v(other, i8);
    }
}
