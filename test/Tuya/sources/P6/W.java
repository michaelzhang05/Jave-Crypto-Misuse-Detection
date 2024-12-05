package P6;

import M5.AbstractC1239l;
import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class W extends C1282h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f8025f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f8026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(byte[][] segments, int[] directory) {
        super(C1282h.f8067e.j());
        AbstractC3159y.i(segments, "segments");
        AbstractC3159y.i(directory, "directory");
        this.f8025f = segments;
        this.f8026g = directory;
    }

    private final C1282h Q() {
        return new C1282h(L());
    }

    @Override // P6.C1282h
    public boolean A(int i8, C1282h other, int i9, int i10) {
        int i11;
        AbstractC3159y.i(other, "other");
        if (i8 < 0 || i8 > F() - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b8 = Q6.e.b(this, i8);
        while (i8 < i12) {
            if (b8 == 0) {
                i11 = 0;
            } else {
                i11 = O()[b8 - 1];
            }
            int i13 = O()[b8] - i11;
            int i14 = O()[P().length + b8];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!other.B(i9, P()[b8], i14 + (i8 - i11), min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b8++;
        }
        return true;
    }

    @Override // P6.C1282h
    public boolean B(int i8, byte[] other, int i9, int i10) {
        int i11;
        AbstractC3159y.i(other, "other");
        if (i8 < 0 || i8 > F() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b8 = Q6.e.b(this, i8);
        while (i8 < i12) {
            if (b8 == 0) {
                i11 = 0;
            } else {
                i11 = O()[b8 - 1];
            }
            int i13 = O()[b8] - i11;
            int i14 = O()[P().length + b8];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!AbstractC1276b.a(P()[b8], i14 + (i8 - i11), other, i9, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b8++;
        }
        return true;
    }

    @Override // P6.C1282h
    public C1282h I(int i8, int i9) {
        int d8 = AbstractC1276b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= F()) {
                int i10 = d8 - i8;
                if (i10 >= 0) {
                    if (i8 == 0 && d8 == F()) {
                        return this;
                    }
                    if (i8 == d8) {
                        return C1282h.f8067e;
                    }
                    int b8 = Q6.e.b(this, i8);
                    int b9 = Q6.e.b(this, d8 - 1);
                    byte[][] bArr = (byte[][]) AbstractC1239l.p(P(), b8, b9 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i11 = 0;
                    if (b8 <= b9) {
                        int i12 = b8;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(O()[i12] - i8, i10);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr.length] = O()[P().length + i12];
                            if (i12 == b9) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (b8 != 0) {
                        i11 = O()[b8 - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i8 - i11);
                    return new W(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + d8 + " < beginIndex=" + i8).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + d8 + " > length(" + F() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i8 + " < 0").toString());
    }

    @Override // P6.C1282h
    public C1282h K() {
        return Q().K();
    }

    @Override // P6.C1282h
    public byte[] L() {
        byte[] bArr = new byte[F()];
        int length = P().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = O()[length + i8];
            int i12 = O()[i8];
            int i13 = i12 - i9;
            AbstractC1239l.d(P()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // P6.C1282h
    public void N(C1279e buffer, int i8, int i9) {
        int i10;
        AbstractC3159y.i(buffer, "buffer");
        int i11 = i8 + i9;
        int b8 = Q6.e.b(this, i8);
        while (i8 < i11) {
            if (b8 == 0) {
                i10 = 0;
            } else {
                i10 = O()[b8 - 1];
            }
            int i12 = O()[b8] - i10;
            int i13 = O()[P().length + b8];
            int min = Math.min(i11, i12 + i10) - i8;
            int i14 = i13 + (i8 - i10);
            U u8 = new U(P()[b8], i14, i14 + min, true, false);
            U u9 = buffer.f8056a;
            if (u9 == null) {
                u8.f8019g = u8;
                u8.f8018f = u8;
                buffer.f8056a = u8;
            } else {
                AbstractC3159y.f(u9);
                U u10 = u9.f8019g;
                AbstractC3159y.f(u10);
                u10.c(u8);
            }
            i8 += min;
            b8++;
        }
        buffer.w(buffer.x() + i9);
    }

    public final int[] O() {
        return this.f8026g;
    }

    public final byte[][] P() {
        return this.f8025f;
    }

    @Override // P6.C1282h
    public String a() {
        return Q().a();
    }

    @Override // P6.C1282h
    public C1282h e(String algorithm) {
        AbstractC3159y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = P().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = O()[length + i8];
            int i11 = O()[i8];
            messageDigest.update(P()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
        byte[] digestBytes = messageDigest.digest();
        AbstractC3159y.h(digestBytes, "digestBytes");
        return new C1282h(digestBytes);
    }

    @Override // P6.C1282h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1282h) {
            C1282h c1282h = (C1282h) obj;
            if (c1282h.F() == F() && A(0, c1282h, 0, F())) {
                return true;
            }
        }
        return false;
    }

    @Override // P6.C1282h
    public int hashCode() {
        int k8 = k();
        if (k8 == 0) {
            int length = P().length;
            int i8 = 0;
            int i9 = 1;
            int i10 = 0;
            while (i8 < length) {
                int i11 = O()[length + i8];
                int i12 = O()[i8];
                byte[] bArr = P()[i8];
                int i13 = (i12 - i10) + i11;
                while (i11 < i13) {
                    i9 = (i9 * 31) + bArr[i11];
                    i11++;
                }
                i8++;
                i10 = i12;
            }
            C(i9);
            return i9;
        }
        return k8;
    }

    @Override // P6.C1282h
    public int l() {
        return O()[P().length - 1];
    }

    @Override // P6.C1282h
    public String n() {
        return Q().n();
    }

    @Override // P6.C1282h
    public int p(byte[] other, int i8) {
        AbstractC3159y.i(other, "other");
        return Q().p(other, i8);
    }

    @Override // P6.C1282h
    public byte[] r() {
        return L();
    }

    @Override // P6.C1282h
    public byte t(int i8) {
        int i9;
        AbstractC1276b.b(O()[P().length - 1], i8, 1L);
        int b8 = Q6.e.b(this, i8);
        if (b8 == 0) {
            i9 = 0;
        } else {
            i9 = O()[b8 - 1];
        }
        return P()[b8][(i8 - i9) + O()[P().length + b8]];
    }

    @Override // P6.C1282h
    public String toString() {
        return Q().toString();
    }

    @Override // P6.C1282h
    public int v(byte[] other, int i8) {
        AbstractC3159y.i(other, "other");
        return Q().v(other, i8);
    }
}
