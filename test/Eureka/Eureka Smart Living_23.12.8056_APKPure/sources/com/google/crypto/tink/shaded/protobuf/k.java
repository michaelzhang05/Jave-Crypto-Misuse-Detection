package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.o1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k extends g {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f5528c = Logger.getLogger(k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f5529d = n1.E();

    /* renamed from: a, reason: collision with root package name */
    l f5530a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5531b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends k {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f5532e;

        /* renamed from: f, reason: collision with root package name */
        private final int f5533f;

        /* renamed from: g, reason: collision with root package name */
        private final int f5534g;

        /* renamed from: h, reason: collision with root package name */
        private int f5535h;

        b(byte[] bArr, int i6, int i7) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i8 = i6 + i7;
            if ((i6 | i7 | (bArr.length - i8)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            this.f5532e = bArr;
            this.f5533f = i6;
            this.f5535h = i6;
            this.f5534g = i8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void C0(int i6, String str) {
            D0(i6, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void D0(int i6, int i7) {
            F0(p1.c(i6, i7));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void E0(int i6, int i7) {
            D0(i6, 0);
            F0(i7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void F0(int i6) {
            while ((i6 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f5532e;
                    int i7 = this.f5535h;
                    this.f5535h = i7 + 1;
                    bArr[i7] = (byte) ((i6 & 127) | 128);
                    i6 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), 1), e6);
                }
            }
            byte[] bArr2 = this.f5532e;
            int i8 = this.f5535h;
            this.f5535h = i8 + 1;
            bArr2[i8] = (byte) i6;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void G0(int i6, long j6) {
            D0(i6, 0);
            H0(j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void H0(long j6) {
            if (k.f5529d && W() >= 10) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.f5532e;
                    int i6 = this.f5535h;
                    this.f5535h = i6 + 1;
                    n1.K(bArr, i6, (byte) ((((int) j6) & 127) | 128));
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.f5532e;
                int i7 = this.f5535h;
                this.f5535h = i7 + 1;
                n1.K(bArr2, i7, (byte) j6);
                return;
            }
            while ((j6 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f5532e;
                    int i8 = this.f5535h;
                    this.f5535h = i8 + 1;
                    bArr3[i8] = (byte) ((((int) j6) & 127) | 128);
                    j6 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), 1), e6);
                }
            }
            byte[] bArr4 = this.f5532e;
            int i9 = this.f5535h;
            this.f5535h = i9 + 1;
            bArr4[i9] = (byte) j6;
        }

        public final void I0(byte[] bArr, int i6, int i7) {
            try {
                System.arraycopy(bArr, i6, this.f5532e, this.f5535h, i7);
                this.f5535h += i7;
            } catch (IndexOutOfBoundsException e6) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), Integer.valueOf(i7)), e6);
            }
        }

        public final void J0(h hVar) {
            F0(hVar.size());
            hVar.F(this);
        }

        public final void K0(int i6, o0 o0Var) {
            D0(i6, 2);
            L0(o0Var);
        }

        public final void L0(o0 o0Var) {
            F0(o0Var.c());
            o0Var.b(this);
        }

        public final void M0(String str) {
            int f6;
            int i6 = this.f5535h;
            try {
                int N = k.N(str.length() * 3);
                int N2 = k.N(str.length());
                if (N2 == N) {
                    int i7 = i6 + N2;
                    this.f5535h = i7;
                    f6 = o1.f(str, this.f5532e, i7, W());
                    this.f5535h = i6;
                    F0((f6 - i6) - N2);
                } else {
                    F0(o1.g(str));
                    f6 = o1.f(str, this.f5532e, this.f5535h, W());
                }
                this.f5535h = f6;
            } catch (o1.d e6) {
                this.f5535h = i6;
                S(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new c(e7);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final int W() {
            return this.f5534g - this.f5535h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void X(byte b6) {
            try {
                byte[] bArr = this.f5532e;
                int i6 = this.f5535h;
                this.f5535h = i6 + 1;
                bArr[i6] = b6;
            } catch (IndexOutOfBoundsException e6) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), 1), e6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void Y(int i6, boolean z5) {
            D0(i6, 0);
            X(z5 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.g
        public final void a(byte[] bArr, int i6, int i7) {
            I0(bArr, i6, i7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void a0(int i6, h hVar) {
            D0(i6, 2);
            J0(hVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void f0(int i6, int i7) {
            D0(i6, 5);
            g0(i7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void g0(int i6) {
            try {
                byte[] bArr = this.f5532e;
                int i7 = this.f5535h;
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i6 & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((i6 >> 8) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((i6 >> 16) & 255);
                this.f5535h = i10 + 1;
                bArr[i10] = (byte) ((i6 >> 24) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), 1), e6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void h0(int i6, long j6) {
            D0(i6, 1);
            i0(j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void i0(long j6) {
            try {
                byte[] bArr = this.f5532e;
                int i6 = this.f5535h;
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) j6) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j6 >> 8)) & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((int) (j6 >> 16)) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((int) (j6 >> 24)) & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) (j6 >> 32)) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j6 >> 40)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j6 >> 48)) & 255);
                this.f5535h = i13 + 1;
                bArr[i13] = (byte) (((int) (j6 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5535h), Integer.valueOf(this.f5534g), 1), e6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void n0(int i6, int i7) {
            D0(i6, 0);
            o0(i7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void o0(int i6) {
            if (i6 >= 0) {
                F0(i6);
            } else {
                H0(i6);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        final void r0(int i6, o0 o0Var, d1 d1Var) {
            D0(i6, 2);
            F0(((com.google.crypto.tink.shaded.protobuf.a) o0Var).h(d1Var));
            d1Var.e(o0Var, this.f5530a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void s0(int i6, o0 o0Var) {
            D0(1, 3);
            E0(2, i6);
            K0(3, o0Var);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void t0(int i6, h hVar) {
            D0(1, 3);
            E0(2, i6);
            a0(3, hVar);
            D0(1, 4);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private k() {
    }

    public static int A(int i6, h hVar) {
        return (L(1) * 2) + M(2, i6) + f(3, hVar);
    }

    public static int B(int i6, int i7) {
        return L(i6) + C(i7);
    }

    public static int C(int i6) {
        return 4;
    }

    public static int D(int i6, long j6) {
        return L(i6) + E(j6);
    }

    public static int E(long j6) {
        return 8;
    }

    public static int F(int i6, int i7) {
        return L(i6) + G(i7);
    }

    public static int G(int i6) {
        return N(Q(i6));
    }

    public static int H(int i6, long j6) {
        return L(i6) + I(j6);
    }

    public static int I(long j6) {
        return P(R(j6));
    }

    public static int J(int i6, String str) {
        return L(i6) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = o1.g(str);
        } catch (o1.d unused) {
            length = str.getBytes(z.f5708b).length;
        }
        return x(length);
    }

    public static int L(int i6) {
        return N(p1.c(i6, 0));
    }

    public static int M(int i6, int i7) {
        return L(i6) + N(i7);
    }

    public static int N(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        return (i6 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int O(int i6, long j6) {
        return L(i6) + P(j6);
    }

    public static int P(long j6) {
        int i6;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i6 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i6 + 1 : i6;
    }

    public static int Q(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long R(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static k U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static k V(byte[] bArr, int i6, int i7) {
        return new b(bArr, i6, i7);
    }

    public static int d(int i6, boolean z5) {
        return L(i6) + e(z5);
    }

    public static int e(boolean z5) {
        return 1;
    }

    public static int f(int i6, h hVar) {
        return L(i6) + g(hVar);
    }

    public static int g(h hVar) {
        return x(hVar.size());
    }

    public static int h(int i6, double d6) {
        return L(i6) + i(d6);
    }

    public static int i(double d6) {
        return 8;
    }

    public static int j(int i6, int i7) {
        return L(i6) + k(i7);
    }

    public static int k(int i6) {
        return u(i6);
    }

    public static int l(int i6, int i7) {
        return L(i6) + m(i7);
    }

    public static int m(int i6) {
        return 4;
    }

    public static int n(int i6, long j6) {
        return L(i6) + o(j6);
    }

    public static int o(long j6) {
        return 8;
    }

    public static int p(int i6, float f6) {
        return L(i6) + q(f6);
    }

    public static int q(float f6) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i6, o0 o0Var, d1 d1Var) {
        return (L(i6) * 2) + s(o0Var, d1Var);
    }

    static int s(o0 o0Var, d1 d1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) o0Var).h(d1Var);
    }

    public static int t(int i6, int i7) {
        return L(i6) + u(i7);
    }

    public static int u(int i6) {
        if (i6 >= 0) {
            return N(i6);
        }
        return 10;
    }

    public static int v(int i6, long j6) {
        return L(i6) + w(j6);
    }

    public static int w(long j6) {
        return P(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i6) {
        return N(i6) + i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i6, o0 o0Var, d1 d1Var) {
        return L(i6) + z(o0Var, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(o0 o0Var, d1 d1Var) {
        return x(((com.google.crypto.tink.shaded.protobuf.a) o0Var).h(d1Var));
    }

    public final void A0(int i6, long j6) {
        G0(i6, R(j6));
    }

    public final void B0(long j6) {
        H0(R(j6));
    }

    public abstract void C0(int i6, String str);

    public abstract void D0(int i6, int i7);

    public abstract void E0(int i6, int i7);

    public abstract void F0(int i6);

    public abstract void G0(int i6, long j6);

    public abstract void H0(long j6);

    final void S(String str, o1.d dVar) {
        f5528c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f5708b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e6) {
            throw new c(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T() {
        return this.f5531b;
    }

    public abstract int W();

    public abstract void X(byte b6);

    public abstract void Y(int i6, boolean z5);

    public final void Z(boolean z5) {
        X(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g
    public abstract void a(byte[] bArr, int i6, int i7);

    public abstract void a0(int i6, h hVar);

    public final void b0(int i6, double d6) {
        h0(i6, Double.doubleToRawLongBits(d6));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d6) {
        i0(Double.doubleToRawLongBits(d6));
    }

    public final void d0(int i6, int i7) {
        n0(i6, i7);
    }

    public final void e0(int i6) {
        o0(i6);
    }

    public abstract void f0(int i6, int i7);

    public abstract void g0(int i6);

    public abstract void h0(int i6, long j6);

    public abstract void i0(long j6);

    public final void j0(int i6, float f6) {
        f0(i6, Float.floatToRawIntBits(f6));
    }

    public final void k0(float f6) {
        g0(Float.floatToRawIntBits(f6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l0(int i6, o0 o0Var, d1 d1Var) {
        D0(i6, 3);
        m0(o0Var, d1Var);
        D0(i6, 4);
    }

    final void m0(o0 o0Var, d1 d1Var) {
        d1Var.e(o0Var, this.f5530a);
    }

    public abstract void n0(int i6, int i7);

    public abstract void o0(int i6);

    public final void p0(int i6, long j6) {
        G0(i6, j6);
    }

    public final void q0(long j6) {
        H0(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void r0(int i6, o0 o0Var, d1 d1Var);

    public abstract void s0(int i6, o0 o0Var);

    public abstract void t0(int i6, h hVar);

    public final void u0(int i6, int i7) {
        f0(i6, i7);
    }

    public final void v0(int i6) {
        g0(i6);
    }

    public final void w0(int i6, long j6) {
        h0(i6, j6);
    }

    public final void x0(long j6) {
        i0(j6);
    }

    public final void y0(int i6, int i7) {
        E0(i6, Q(i7));
    }

    public final void z0(int i6) {
        F0(Q(i6));
    }
}
