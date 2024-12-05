package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zztv extends zztd {
    private static final Logger a = Logger.getLogger(zztv.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f16110b = z2.K();

    /* renamed from: c, reason: collision with root package name */
    t0 f16111c;

    /* loaded from: classes2.dex */
    static class a extends zztv {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f16112d;

        /* renamed from: e, reason: collision with root package name */
        private final int f16113e;

        /* renamed from: f, reason: collision with root package name */
        private final int f16114f;

        /* renamed from: g, reason: collision with root package name */
        private int f16115g;

        a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr != null) {
                int i4 = i2 + i3;
                if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                    this.f16112d = bArr;
                    this.f16113e = i2;
                    this.f16115g = i2;
                    this.f16114f = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void E(int i2, zzte zzteVar) throws IOException {
            f0(1, 3);
            n0(2, i2);
            i(3, zzteVar);
            f0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void F(int i2, zzvv zzvvVar) throws IOException {
            f0(1, 3);
            n0(2, i2);
            j(3, zzvvVar);
            f0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final int F0() {
            return this.f16114f - this.f16115g;
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void G(int i2, String str) throws IOException {
            f0(i2, 2);
            s0(str);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void H(int i2, boolean z) throws IOException {
            f0(i2, 0);
            e0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void I(zzvv zzvvVar) throws IOException {
            K(zzvvVar.j());
            zzvvVar.c(this);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void K(int i2) throws IOException {
            if (zztv.f16110b && F0() >= 10) {
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f16112d;
                    int i3 = this.f16115g;
                    this.f16115g = i3 + 1;
                    z2.h(bArr, i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f16112d;
                int i4 = this.f16115g;
                this.f16115g = i4 + 1;
                z2.h(bArr2, i4, (byte) i2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f16112d;
                    int i5 = this.f16115g;
                    this.f16115g = i5 + 1;
                    bArr3[i5] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), 1), e2);
                }
            }
            byte[] bArr4 = this.f16112d;
            int i6 = this.f16115g;
            this.f16115g = i6 + 1;
            bArr4[i6] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void N(int i2) throws IOException {
            try {
                byte[] bArr = this.f16112d;
                int i3 = this.f16115g;
                int i4 = i3 + 1;
                this.f16115g = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f16115g = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f16115g = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f16115g = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zztd
        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            b(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void b(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.f16112d, this.f16115g, i3);
                this.f16115g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void e0(byte b2) throws IOException {
            try {
                byte[] bArr = this.f16112d;
                int i2 = this.f16115g;
                this.f16115g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void f0(int i2, int i3) throws IOException {
            K((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void g0(int i2, long j2) throws IOException {
            f0(i2, 1);
            p(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void h(int i2, long j2) throws IOException {
            f0(i2, 0);
            n(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void i(int i2, zzte zzteVar) throws IOException {
            f0(i2, 2);
            l(zzteVar);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void j(int i2, zzvv zzvvVar) throws IOException {
            f0(i2, 2);
            I(zzvvVar);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        final void k(int i2, zzvv zzvvVar, e2 e2Var) throws IOException {
            f0(i2, 2);
            zzsx zzsxVar = (zzsx) zzvvVar;
            int g2 = zzsxVar.g();
            if (g2 == -1) {
                g2 = e2Var.d(zzsxVar);
                zzsxVar.a(g2);
            }
            K(g2);
            e2Var.e(zzvvVar, this.f16111c);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void l(zzte zzteVar) throws IOException {
            K(zzteVar.size());
            zzteVar.o(this);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void l0(int i2, int i3) throws IOException {
            f0(i2, 0);
            u(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void n(long j2) throws IOException {
            if (zztv.f16110b && F0() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f16112d;
                    int i2 = this.f16115g;
                    this.f16115g = i2 + 1;
                    z2.h(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f16112d;
                int i3 = this.f16115g;
                this.f16115g = i3 + 1;
                z2.h(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f16112d;
                    int i4 = this.f16115g;
                    this.f16115g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), 1), e2);
                }
            }
            byte[] bArr4 = this.f16112d;
            int i5 = this.f16115g;
            this.f16115g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void n0(int i2, int i3) throws IOException {
            f0(i2, 0);
            K(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void p(long j2) throws IOException {
            try {
                byte[] bArr = this.f16112d;
                int i2 = this.f16115g;
                int i3 = i2 + 1;
                this.f16115g = i3;
                bArr[i2] = (byte) j2;
                int i4 = i3 + 1;
                this.f16115g = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i4 + 1;
                this.f16115g = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i5 + 1;
                this.f16115g = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i6 + 1;
                this.f16115g = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i7 + 1;
                this.f16115g = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i8 + 1;
                this.f16115g = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.f16115g = i9 + 1;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16115g), Integer.valueOf(this.f16114f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void r0(int i2, int i3) throws IOException {
            f0(i2, 5);
            N(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void s0(String str) throws IOException {
            int i2 = this.f16115g;
            try {
                int Q = zztv.Q(str.length() * 3);
                int Q2 = zztv.Q(str.length());
                if (Q2 == Q) {
                    int i3 = i2 + Q2;
                    this.f16115g = i3;
                    int b2 = b3.b(str, this.f16112d, i3, F0());
                    this.f16115g = i2;
                    K((b2 - i2) - Q2);
                    this.f16115g = b2;
                    return;
                }
                K(b3.a(str));
                this.f16115g = b3.b(str, this.f16112d, this.f16115g, F0());
            } catch (e3 e2) {
                this.f16115g = i2;
                m(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zztv
        public final void u(int i2) throws IOException {
            if (i2 >= 0) {
                K(i2);
            } else {
                n(i2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L11
                java.lang.String r3 = r0.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zztv.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zztv() {
    }

    public static int A(zzte zzteVar) {
        int size = zzteVar.size();
        return Q(size) + size;
    }

    public static int A0(byte[] bArr) {
        int length = bArr.length;
        return Q(length) + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(zzvv zzvvVar, e2 e2Var) {
        zzsx zzsxVar = (zzsx) zzvvVar;
        int g2 = zzsxVar.g();
        if (g2 == -1) {
            g2 = e2Var.d(zzsxVar);
            zzsxVar.a(g2);
        }
        return Q(g2) + g2;
    }

    public static int B0(int i2, int i3) {
        return O(i2) + 4;
    }

    public static int C0(int i2, int i3) {
        return O(i2) + P(i3);
    }

    public static int E0(boolean z) {
        return 1;
    }

    public static int J(long j2) {
        return 8;
    }

    private static long L(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int O(int i2) {
        return Q(i2 << 3);
    }

    public static int P(int i2) {
        if (i2 >= 0) {
            return Q(i2);
        }
        return 10;
    }

    public static int Q(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int R(int i2) {
        return Q(V(i2));
    }

    public static int S(int i2) {
        return 4;
    }

    public static int T(int i2) {
        return 4;
    }

    public static int U(int i2) {
        return P(i2);
    }

    private static int V(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    @Deprecated
    public static int W(int i2) {
        return Q(i2);
    }

    public static int X(double d2) {
        return 8;
    }

    public static int Y(int i2, zzte zzteVar) {
        int O = O(i2);
        int size = zzteVar.size();
        return O + Q(size) + size;
    }

    public static int Z(int i2, zzvv zzvvVar) {
        return O(i2) + d0(zzvvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int a0(int i2, zzvv zzvvVar, e2 e2Var) {
        int O = O(i2) << 1;
        zzsx zzsxVar = (zzsx) zzvvVar;
        int g2 = zzsxVar.g();
        if (g2 == -1) {
            g2 = e2Var.d(zzsxVar);
            zzsxVar.a(g2);
        }
        return O + g2;
    }

    public static int b0(int i2, String str) {
        return O(i2) + t0(str);
    }

    public static int c(int i2, zzvc zzvcVar) {
        int O = O(i2);
        int d2 = zzvcVar.d();
        return O + Q(d2) + d2;
    }

    public static int c0(int i2, boolean z) {
        return O(i2) + 1;
    }

    public static int d(zzvc zzvcVar) {
        int d2 = zzvcVar.d();
        return Q(d2) + d2;
    }

    public static int d0(zzvv zzvvVar) {
        int j2 = zzvvVar.j();
        return Q(j2) + j2;
    }

    public static int h0(int i2, long j2) {
        return O(i2) + r(j2);
    }

    public static int i0(int i2, zzte zzteVar) {
        return (O(1) << 1) + w0(2, i2) + Y(3, zzteVar);
    }

    public static int j0(int i2, zzvv zzvvVar) {
        return (O(1) << 1) + w0(2, i2) + Z(3, zzvvVar);
    }

    @Deprecated
    public static int k0(zzvv zzvvVar) {
        return zzvvVar.j();
    }

    public static int m0(int i2, long j2) {
        return O(i2) + r(j2);
    }

    public static int o0(int i2, long j2) {
        return O(i2) + r(L(j2));
    }

    public static int q(long j2) {
        return r(j2);
    }

    public static int q0(int i2, long j2) {
        return O(i2) + 8;
    }

    public static int r(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int s(long j2) {
        return r(L(j2));
    }

    public static int t(long j2) {
        return 8;
    }

    public static int t0(String str) {
        int length;
        try {
            length = b3.a(str);
        } catch (e3 unused) {
            length = str.getBytes(zzuq.a).length;
        }
        return Q(length) + length;
    }

    public static int u0(int i2, int i3) {
        return O(i2) + P(i3);
    }

    public static int v(float f2) {
        return 4;
    }

    public static int v0(int i2, long j2) {
        return O(i2) + 8;
    }

    public static int w(int i2, double d2) {
        return O(i2) + 8;
    }

    public static int w0(int i2, int i3) {
        return O(i2) + Q(i3);
    }

    public static int x(int i2, float f2) {
        return O(i2) + 4;
    }

    public static int x0(int i2, int i3) {
        return O(i2) + Q(V(i3));
    }

    public static int y(int i2, zzvc zzvcVar) {
        return (O(1) << 1) + w0(2, i2) + c(3, zzvcVar);
    }

    public static zztv y0(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i2, zzvv zzvvVar, e2 e2Var) {
        return O(i2) + B(zzvvVar, e2Var);
    }

    public static int z0(int i2, int i3) {
        return O(i2) + 4;
    }

    public final void C(double d2) throws IOException {
        p(Double.doubleToRawLongBits(d2));
    }

    public final void D(int i2, long j2) throws IOException {
        h(i2, L(j2));
    }

    public final void D0(boolean z) throws IOException {
        e0(z ? (byte) 1 : (byte) 0);
    }

    public abstract void E(int i2, zzte zzteVar) throws IOException;

    public abstract void F(int i2, zzvv zzvvVar) throws IOException;

    public abstract int F0();

    public abstract void G(int i2, String str) throws IOException;

    public abstract void H(int i2, boolean z) throws IOException;

    public abstract void I(zzvv zzvvVar) throws IOException;

    public abstract void K(int i2) throws IOException;

    public final void M(int i2) throws IOException {
        K(V(i2));
    }

    public abstract void N(int i2) throws IOException;

    public abstract void b(byte[] bArr, int i2, int i3) throws IOException;

    public final void e(float f2) throws IOException {
        N(Float.floatToRawIntBits(f2));
    }

    public abstract void e0(byte b2) throws IOException;

    public final void f(int i2, double d2) throws IOException {
        g0(i2, Double.doubleToRawLongBits(d2));
    }

    public abstract void f0(int i2, int i3) throws IOException;

    public final void g(int i2, float f2) throws IOException {
        r0(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void g0(int i2, long j2) throws IOException;

    public abstract void h(int i2, long j2) throws IOException;

    public abstract void i(int i2, zzte zzteVar) throws IOException;

    public abstract void j(int i2, zzvv zzvvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void k(int i2, zzvv zzvvVar, e2 e2Var) throws IOException;

    public abstract void l(zzte zzteVar) throws IOException;

    public abstract void l0(int i2, int i3) throws IOException;

    final void m(String str, e3 e3Var) throws IOException {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3Var);
        byte[] bytes = str.getBytes(zzuq.a);
        try {
            K(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (zzc e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzc(e3);
        }
    }

    public abstract void n(long j2) throws IOException;

    public abstract void n0(int i2, int i3) throws IOException;

    public final void o(long j2) throws IOException {
        n(L(j2));
    }

    public abstract void p(long j2) throws IOException;

    public final void p0(int i2, int i3) throws IOException {
        n0(i2, V(i3));
    }

    public abstract void r0(int i2, int i3) throws IOException;

    public abstract void s0(String str) throws IOException;

    public abstract void u(int i2) throws IOException;
}
