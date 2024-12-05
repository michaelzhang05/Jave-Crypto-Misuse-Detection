package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qu extends zzdnd {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f12065f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12066g;

    /* renamed from: h, reason: collision with root package name */
    private int f12067h;

    /* renamed from: i, reason: collision with root package name */
    private int f12068i;

    /* renamed from: j, reason: collision with root package name */
    private int f12069j;

    /* renamed from: k, reason: collision with root package name */
    private int f12070k;
    private int l;
    private int m;

    private qu(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.m = Integer.MAX_VALUE;
        this.f12065f = bArr;
        this.f12067h = i3 + i2;
        this.f12069j = i2;
        this.f12070k = i2;
        this.f12066g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f12069j
            int r1 = r5.f12067h
            if (r1 == r0) goto L6b
            byte[] r2 = r5.f12065f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.f12069j = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.f12069j = r1
            return r0
        L6b:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu.C():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long D() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu.D():long");
    }

    private final int E() throws IOException {
        int i2 = this.f12069j;
        if (this.f12067h - i2 >= 4) {
            byte[] bArr = this.f12065f;
            this.f12069j = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzdok.a();
    }

    private final long F() throws IOException {
        int i2 = this.f12069j;
        if (this.f12067h - i2 >= 8) {
            byte[] bArr = this.f12065f;
            this.f12069j = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }
        throw zzdok.a();
    }

    private final void G() {
        int i2 = this.f12067h + this.f12068i;
        this.f12067h = i2;
        int i3 = i2 - this.f12070k;
        int i4 = this.m;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f12068i = i5;
            this.f12067h = i2 - i5;
            return;
        }
        this.f12068i = 0;
    }

    private final byte H() throws IOException {
        int i2 = this.f12069j;
        if (i2 != this.f12067h) {
            byte[] bArr = this.f12065f;
            this.f12069j = i2 + 1;
            return bArr[i2];
        }
        throw zzdok.a();
    }

    private final void I(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f12067h;
            int i4 = this.f12069j;
            if (i2 <= i3 - i4) {
                this.f12069j = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzdok.b();
        }
        throw zzdok.a();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final void A(int i2) {
        this.m = i2;
        G();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final double a() throws IOException {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final float b() throws IOException {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final String c() throws IOException {
        int C = C();
        if (C > 0 && C <= this.f12067h - this.f12069j) {
            String str = new String(this.f12065f, this.f12069j, C, zzdod.a);
            this.f12069j += C;
            return str;
        }
        if (C == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (C < 0) {
            throw zzdok.b();
        }
        throw zzdok.a();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int d() throws IOException {
        if (t()) {
            this.l = 0;
            return 0;
        }
        int C = C();
        this.l = C;
        if ((C >>> 3) != 0) {
            return C;
        }
        throw zzdok.d();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long e() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long f() throws IOException {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int g() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long h() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int i() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final boolean j() throws IOException {
        return D() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final String k() throws IOException {
        int C = C();
        if (C > 0) {
            int i2 = this.f12067h;
            int i3 = this.f12069j;
            if (C <= i2 - i3) {
                String m = kx.m(this.f12065f, i3, C);
                this.f12069j += C;
                return m;
            }
        }
        if (C == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (C <= 0) {
            throw zzdok.b();
        }
        throw zzdok.a();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final zzdmr l() throws IOException {
        byte[] bArr;
        int C = C();
        if (C > 0) {
            int i2 = this.f12067h;
            int i3 = this.f12069j;
            if (C <= i2 - i3) {
                zzdmr T = zzdmr.T(this.f12065f, i3, C);
                this.f12069j += C;
                return T;
            }
        }
        if (C == 0) {
            return zzdmr.f14805f;
        }
        if (C > 0) {
            int i4 = this.f12067h;
            int i5 = this.f12069j;
            if (C <= i4 - i5) {
                int i6 = C + i5;
                this.f12069j = i6;
                bArr = Arrays.copyOfRange(this.f12065f, i5, i6);
                return zzdmr.w(bArr);
            }
        }
        if (C > 0) {
            throw zzdok.a();
        }
        if (C == 0) {
            bArr = zzdod.f14856c;
            return zzdmr.w(bArr);
        }
        throw zzdok.b();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int m() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int n() throws IOException {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int o() throws IOException {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long p() throws IOException {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int q() throws IOException {
        return zzdnd.B(C());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long r() throws IOException {
        return zzdnd.w(D());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdnd
    public final long s() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((H() & 128) == 0) {
                return j2;
            }
        }
        throw zzdok.c();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final boolean t() throws IOException {
        return this.f12069j == this.f12067h;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int u() {
        return this.f12069j - this.f12070k;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final void x(int i2) throws zzdok {
        if (this.l != i2) {
            throw zzdok.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final boolean y(int i2) throws IOException {
        int d2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f12067h - this.f12069j >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f12065f;
                    int i5 = this.f12069j;
                    this.f12069j = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzdok.c();
            }
            while (i4 < 10) {
                if (H() < 0) {
                    i4++;
                }
            }
            throw zzdok.c();
            return true;
        }
        if (i3 == 1) {
            I(8);
            return true;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 == 5) {
                    I(4);
                    return true;
                }
                throw zzdok.f();
            }
            do {
                d2 = d();
                if (d2 == 0) {
                    break;
                }
            } while (y(d2));
            x(((i2 >>> 3) << 3) | 4);
            return true;
        }
        I(C());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    public final int z(int i2) throws zzdok {
        if (i2 >= 0) {
            int u = i2 + u();
            int i3 = this.m;
            if (u <= i3) {
                this.m = u;
                G();
                return i3;
            }
            throw zzdok.a();
        }
        throw zzdok.b();
    }
}
