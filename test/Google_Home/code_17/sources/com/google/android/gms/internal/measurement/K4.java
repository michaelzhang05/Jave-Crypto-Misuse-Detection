package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class K4 extends AbstractC2215p4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f16177b = Logger.getLogger(K4.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f16178c = AbstractC2243s6.w();

    /* renamed from: a, reason: collision with root package name */
    N4 f16179a;

    /* loaded from: classes3.dex */
    private static class a extends K4 {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f16180d;

        /* renamed from: e, reason: collision with root package name */
        private final int f16181e;

        /* renamed from: f, reason: collision with root package name */
        private int f16182f;

        a(byte[] bArr, int i8, int i9) {
            super();
            if (bArr != null) {
                if (((bArr.length - i9) | i9) >= 0) {
                    this.f16180d = bArr;
                    this.f16182f = 0;
                    this.f16181e = i9;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i9)));
            }
            throw new NullPointerException("buffer");
        }

        private final void A0(byte[] bArr, int i8, int i9) {
            try {
                System.arraycopy(bArr, i8, this.f16180d, this.f16182f, i9);
                this.f16182f += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), Integer.valueOf(i9)), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void H(int i8) {
            if (i8 >= 0) {
                U(i8);
            } else {
                N(i8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void K(int i8, int i9) {
            V(i8, 0);
            H(i9);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void L(int i8, long j8) {
            V(i8, 0);
            N(j8);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void M(int i8, AbstractC2241s4 abstractC2241s4) {
            V(1, 3);
            b0(2, i8);
            n(3, abstractC2241s4);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void N(long j8) {
            if (K4.f16178c && b() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f16180d;
                    int i8 = this.f16182f;
                    this.f16182f = i8 + 1;
                    AbstractC2243s6.m(bArr, i8, (byte) (((int) j8) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f16180d;
                int i9 = this.f16182f;
                this.f16182f = 1 + i9;
                AbstractC2243s6.m(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f16180d;
                    int i10 = this.f16182f;
                    this.f16182f = i10 + 1;
                    bArr3[i10] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), 1), e8);
                }
            }
            byte[] bArr4 = this.f16180d;
            int i11 = this.f16182f;
            this.f16182f = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void U(int i8) {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f16180d;
                    int i9 = this.f16182f;
                    this.f16182f = i9 + 1;
                    bArr[i9] = (byte) (i8 | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), 1), e8);
                }
            }
            byte[] bArr2 = this.f16180d;
            int i10 = this.f16182f;
            this.f16182f = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void V(int i8, int i9) {
            U((i8 << 3) | i9);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2215p4
        public final void a(byte[] bArr, int i8, int i9) {
            A0(bArr, i8, i9);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final int b() {
            return this.f16181e - this.f16182f;
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void b0(int i8, int i9) {
            V(i8, 0);
            U(i9);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void j(byte b8) {
            try {
                byte[] bArr = this.f16180d;
                int i8 = this.f16182f;
                this.f16182f = i8 + 1;
                bArr[i8] = b8;
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void k(int i8) {
            try {
                byte[] bArr = this.f16180d;
                int i9 = this.f16182f;
                int i10 = i9 + 1;
                this.f16182f = i10;
                bArr[i9] = (byte) i8;
                int i11 = i9 + 2;
                this.f16182f = i11;
                bArr[i10] = (byte) (i8 >> 8);
                int i12 = i9 + 3;
                this.f16182f = i12;
                bArr[i11] = (byte) (i8 >> 16);
                this.f16182f = i9 + 4;
                bArr[i12] = (byte) (i8 >>> 24);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void l(int i8, int i9) {
            V(i8, 5);
            k(i9);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void m(int i8, long j8) {
            V(i8, 1);
            s(j8);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void n(int i8, AbstractC2241s4 abstractC2241s4) {
            V(i8, 2);
            t(abstractC2241s4);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void o(int i8, I5 i52) {
            V(1, 3);
            b0(2, i8);
            V(3, 2);
            u(i52);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        final void p(int i8, I5 i52, Y5 y52) {
            V(i8, 2);
            U(((AbstractC2160j4) i52).e(y52));
            y52.g(i52, this.f16179a);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void q(int i8, String str) {
            V(i8, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void r(int i8, boolean z8) {
            V(i8, 0);
            j(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void s(long j8) {
            try {
                byte[] bArr = this.f16180d;
                int i8 = this.f16182f;
                int i9 = i8 + 1;
                this.f16182f = i9;
                bArr[i8] = (byte) j8;
                int i10 = i8 + 2;
                this.f16182f = i10;
                bArr[i9] = (byte) (j8 >> 8);
                int i11 = i8 + 3;
                this.f16182f = i11;
                bArr[i10] = (byte) (j8 >> 16);
                int i12 = i8 + 4;
                this.f16182f = i12;
                bArr[i11] = (byte) (j8 >> 24);
                int i13 = i8 + 5;
                this.f16182f = i13;
                bArr[i12] = (byte) (j8 >> 32);
                int i14 = i8 + 6;
                this.f16182f = i14;
                bArr[i13] = (byte) (j8 >> 40);
                int i15 = i8 + 7;
                this.f16182f = i15;
                bArr[i14] = (byte) (j8 >> 48);
                this.f16182f = i8 + 8;
                bArr[i15] = (byte) (j8 >> 56);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16182f), Integer.valueOf(this.f16181e), 1), e8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void t(AbstractC2241s4 abstractC2241s4) {
            U(abstractC2241s4.r());
            abstractC2241s4.o(this);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void u(I5 i52) {
            U(i52.d());
            i52.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.K4
        public final void v(String str) {
            int i8 = this.f16182f;
            try {
                int v02 = K4.v0(str.length() * 3);
                int v03 = K4.v0(str.length());
                if (v03 == v02) {
                    int i9 = i8 + v03;
                    this.f16182f = i9;
                    int b8 = AbstractC2288x6.b(str, this.f16180d, i9, b());
                    this.f16182f = i8;
                    U((b8 - i8) - v03);
                    this.f16182f = b8;
                    return;
                }
                U(AbstractC2288x6.a(str));
                this.f16182f = AbstractC2288x6.b(str, this.f16180d, this.f16182f, b());
            } catch (B6 e8) {
                this.f16182f = i8;
                w(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new b(e9);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends IOException {
        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(AbstractC2241s4 abstractC2241s4) {
        int r8 = abstractC2241s4.r();
        return v0(r8) + r8;
    }

    public static int B(I5 i52) {
        return i52.d();
    }

    public static int C(String str) {
        int length;
        try {
            length = AbstractC2288x6.a(str);
        } catch (B6 unused) {
            length = str.getBytes(AbstractC2111e5.f16618a).length;
        }
        return v0(length) + length;
    }

    public static K4 D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i8, long j8) {
        return v0(i8 << 3) + 8;
    }

    public static int Q(int i8, AbstractC2241s4 abstractC2241s4) {
        int v02 = v0(i8 << 3);
        int r8 = abstractC2241s4.r();
        return v02 + v0(r8) + r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i8, I5 i52, Y5 y52) {
        return v0(i8 << 3) + g(i52, y52);
    }

    public static int S(long j8) {
        return 8;
    }

    public static int T(I5 i52) {
        int d8 = i52.d();
        return v0(d8) + d8;
    }

    public static int X(int i8) {
        return n0(i8);
    }

    public static int Y(int i8, long j8) {
        return v0(i8 << 3) + n0(j8);
    }

    public static int Z(int i8, AbstractC2241s4 abstractC2241s4) {
        return (v0(8) << 1) + w0(2, i8) + Q(3, abstractC2241s4);
    }

    public static int a0(long j8) {
        return n0(j8);
    }

    public static int c(double d8) {
        return 8;
    }

    public static int c0(int i8) {
        return 4;
    }

    public static int d(float f8) {
        return 4;
    }

    public static int d0(int i8, int i9) {
        return v0(i8 << 3) + n0(i9);
    }

    public static int e(int i8, double d8) {
        return v0(i8 << 3) + 8;
    }

    public static int e0(int i8, long j8) {
        return v0(i8 << 3) + 8;
    }

    public static int f(int i8, float f8) {
        return v0(i8 << 3) + 4;
    }

    public static int f0(long j8) {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(I5 i52, Y5 y52) {
        int e8 = ((AbstractC2160j4) i52).e(y52);
        return v0(e8) + e8;
    }

    public static int g0(int i8) {
        return n0(i8);
    }

    public static int h(boolean z8) {
        return 1;
    }

    public static int h0(int i8, int i9) {
        return v0(i8 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i8, long j8) {
        return v0(i8 << 3) + n0(u0(j8));
    }

    public static int j0(long j8) {
        return n0(u0(j8));
    }

    public static int k0(int i8) {
        return 4;
    }

    public static int l0(int i8, int i9) {
        return v0(i8 << 3) + n0(i9);
    }

    public static int m0(int i8, long j8) {
        return v0(i8 << 3) + n0(j8);
    }

    public static int n0(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int o0(int i8) {
        return v0(z0(i8));
    }

    public static int p0(int i8, int i9) {
        return v0(i8 << 3) + 4;
    }

    public static int s0(int i8) {
        return v0(i8 << 3);
    }

    public static int t0(int i8, int i9) {
        return v0(i8 << 3) + v0(z0(i9));
    }

    private static long u0(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int v0(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int w0(int i8, int i9) {
        return v0(i8 << 3) + v0(i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i8, I5 i52, Y5 y52) {
        return (v0(i8 << 3) << 1) + ((AbstractC2160j4) i52).e(y52);
    }

    public static int y(int i8, String str) {
        return v0(i8 << 3) + C(str);
    }

    public static int z(int i8, boolean z8) {
        return v0(i8 << 3) + 1;
    }

    private static int z0(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public final void E() {
        if (b() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d8) {
        s(Double.doubleToRawLongBits(d8));
    }

    public final void G(float f8) {
        k(Float.floatToRawIntBits(f8));
    }

    public abstract void H(int i8);

    public final void I(int i8, double d8) {
        m(i8, Double.doubleToRawLongBits(d8));
    }

    public final void J(int i8, float f8) {
        l(i8, Float.floatToRawIntBits(f8));
    }

    public abstract void K(int i8, int i9);

    public abstract void L(int i8, long j8);

    public abstract void M(int i8, AbstractC2241s4 abstractC2241s4);

    public abstract void N(long j8);

    public final void O(boolean z8) {
        j(z8 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i8);

    public abstract void V(int i8, int i9);

    public abstract int b();

    public abstract void b0(int i8, int i9);

    public abstract void j(byte b8);

    public abstract void k(int i8);

    public abstract void l(int i8, int i9);

    public abstract void m(int i8, long j8);

    public abstract void n(int i8, AbstractC2241s4 abstractC2241s4);

    public abstract void o(int i8, I5 i52);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(int i8, I5 i52, Y5 y52);

    public abstract void q(int i8, String str);

    public final void q0(int i8, long j8) {
        L(i8, u0(j8));
    }

    public abstract void r(int i8, boolean z8);

    public final void r0(long j8) {
        N(u0(j8));
    }

    public abstract void s(long j8);

    public abstract void t(AbstractC2241s4 abstractC2241s4);

    public abstract void u(I5 i52);

    public abstract void v(String str);

    final void w(String str, B6 b62) {
        f16177b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) b62);
        byte[] bytes = str.getBytes(AbstractC2111e5.f16618a);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new b(e8);
        }
    }

    public final void x0(int i8) {
        U(z0(i8));
    }

    public final void y0(int i8, int i9) {
        b0(i8, z0(i9));
    }

    private K4() {
    }
}
