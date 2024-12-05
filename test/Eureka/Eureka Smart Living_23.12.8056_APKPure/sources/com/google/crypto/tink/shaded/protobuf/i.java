package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f5498f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f5499a;

    /* renamed from: b, reason: collision with root package name */
    int f5500b;

    /* renamed from: c, reason: collision with root package name */
    int f5501c;

    /* renamed from: d, reason: collision with root package name */
    j f5502d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5503e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f5504g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f5505h;

        /* renamed from: i, reason: collision with root package name */
        private int f5506i;

        /* renamed from: j, reason: collision with root package name */
        private int f5507j;

        /* renamed from: k, reason: collision with root package name */
        private int f5508k;

        /* renamed from: l, reason: collision with root package name */
        private int f5509l;

        /* renamed from: m, reason: collision with root package name */
        private int f5510m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f5511n;

        /* renamed from: o, reason: collision with root package name */
        private int f5512o;

        private b(byte[] bArr, int i6, int i7, boolean z5) {
            super();
            this.f5512o = Integer.MAX_VALUE;
            this.f5504g = bArr;
            this.f5506i = i7 + i6;
            this.f5508k = i6;
            this.f5509l = i6;
            this.f5505h = z5;
        }

        private void M() {
            int i6 = this.f5506i + this.f5507j;
            this.f5506i = i6;
            int i7 = i6 - this.f5509l;
            int i8 = this.f5512o;
            if (i7 <= i8) {
                this.f5507j = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f5507j = i9;
            this.f5506i = i6 - i9;
        }

        private void P() {
            if (this.f5506i - this.f5508k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f5504g;
                int i7 = this.f5508k;
                this.f5508k = i7 + 1;
                if (bArr[i7] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void R() {
            for (int i6 = 0; i6 < 10; i6++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() {
            int J = J();
            if (J > 0) {
                int i6 = this.f5506i;
                int i7 = this.f5508k;
                if (J <= i6 - i7) {
                    String e6 = o1.e(this.f5504g, i7, J);
                    this.f5508k += J;
                    return e6;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw a0.g();
            }
            throw a0.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int B() {
            if (e()) {
                this.f5510m = 0;
                return 0;
            }
            int J = J();
            this.f5510m = J;
            if (p1.a(J) != 0) {
                return this.f5510m;
            }
            throw a0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean E(int i6) {
            int b6 = p1.b(i6);
            if (b6 == 0) {
                P();
                return true;
            }
            if (b6 == 1) {
                O(8);
                return true;
            }
            if (b6 == 2) {
                O(J());
                return true;
            }
            if (b6 == 3) {
                N();
                a(p1.c(p1.a(i6), 4));
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i6 = this.f5508k;
            if (i6 == this.f5506i) {
                throw a0.m();
            }
            byte[] bArr = this.f5504g;
            this.f5508k = i6 + 1;
            return bArr[i6];
        }

        public byte[] G(int i6) {
            if (i6 > 0) {
                int i7 = this.f5506i;
                int i8 = this.f5508k;
                if (i6 <= i7 - i8) {
                    int i9 = i6 + i8;
                    this.f5508k = i9;
                    return Arrays.copyOfRange(this.f5504g, i8, i9);
                }
            }
            if (i6 > 0) {
                throw a0.m();
            }
            if (i6 == 0) {
                return z.f5710d;
            }
            throw a0.g();
        }

        public int H() {
            int i6 = this.f5508k;
            if (this.f5506i - i6 < 4) {
                throw a0.m();
            }
            byte[] bArr = this.f5504g;
            this.f5508k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long I() {
            int i6 = this.f5508k;
            if (this.f5506i - i6 < 8) {
                throw a0.m();
            }
            byte[] bArr = this.f5504g;
            this.f5508k = i6 + 8;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int J() {
            /*
                r5 = this;
                int r0 = r5.f5508k
                int r1 = r5.f5506i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f5504g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f5508k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.L()
                int r1 = (int) r0
                return r1
            L70:
                r5.f5508k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i.b.J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long K() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i.b.K():long");
        }

        long L() {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                j6 |= (r3 & Byte.MAX_VALUE) << i6;
                if ((F() & 128) == 0) {
                    return j6;
                }
            }
            throw a0.f();
        }

        public void N() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void O(int i6) {
            if (i6 >= 0) {
                int i7 = this.f5506i;
                int i8 = this.f5508k;
                if (i6 <= i7 - i8) {
                    this.f5508k = i8 + i6;
                    return;
                }
            }
            if (i6 >= 0) {
                throw a0.m();
            }
            throw a0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i6) {
            if (this.f5510m != i6) {
                throw a0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int d() {
            return this.f5508k - this.f5509l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean e() {
            return this.f5508k == this.f5506i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void k(int i6) {
            this.f5512o = i6;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int l(int i6) {
            if (i6 < 0) {
                throw a0.g();
            }
            int d6 = i6 + d();
            if (d6 < 0) {
                throw a0.h();
            }
            int i7 = this.f5512o;
            if (d6 > i7) {
                throw a0.m();
            }
            this.f5512o = d6;
            M();
            return i7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h n() {
            int J = J();
            if (J > 0) {
                int i6 = this.f5506i;
                int i7 = this.f5508k;
                if (J <= i6 - i7) {
                    h E = (this.f5505h && this.f5511n) ? h.E(this.f5504g, i7, J) : h.m(this.f5504g, i7, J);
                    this.f5508k += J;
                    return E;
                }
            }
            return J == 0 ? h.f5485b : h.D(G(J));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int x() {
            return i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long y() {
            return i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String z() {
            int J = J();
            if (J > 0) {
                int i6 = this.f5506i;
                int i7 = this.f5508k;
                if (J <= i6 - i7) {
                    String str = new String(this.f5504g, i7, J, z.f5708b);
                    this.f5508k += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw a0.g();
            }
            throw a0.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f5513g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f5514h;

        /* renamed from: i, reason: collision with root package name */
        private int f5515i;

        /* renamed from: j, reason: collision with root package name */
        private int f5516j;

        /* renamed from: k, reason: collision with root package name */
        private int f5517k;

        /* renamed from: l, reason: collision with root package name */
        private int f5518l;

        /* renamed from: m, reason: collision with root package name */
        private int f5519m;

        /* renamed from: n, reason: collision with root package name */
        private int f5520n;

        private c(InputStream inputStream, int i6) {
            super();
            this.f5520n = Integer.MAX_VALUE;
            z.b(inputStream, "input");
            this.f5513g = inputStream;
            this.f5514h = new byte[i6];
            this.f5515i = 0;
            this.f5517k = 0;
            this.f5519m = 0;
        }

        private static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (a0 e6) {
                e6.j();
                throw e6;
            }
        }

        private static int G(InputStream inputStream, byte[] bArr, int i6, int i7) {
            try {
                return inputStream.read(bArr, i6, i7);
            } catch (a0 e6) {
                e6.j();
                throw e6;
            }
        }

        private h H(int i6) {
            byte[] K = K(i6);
            if (K != null) {
                return h.l(K);
            }
            int i7 = this.f5517k;
            int i8 = this.f5515i;
            int i9 = i8 - i7;
            this.f5519m += i8;
            this.f5517k = 0;
            this.f5515i = 0;
            List<byte[]> L = L(i6 - i9);
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f5514h, i7, bArr, 0, i9);
            for (byte[] bArr2 : L) {
                System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                i9 += bArr2.length;
            }
            return h.D(bArr);
        }

        private byte[] J(int i6, boolean z5) {
            byte[] K = K(i6);
            if (K != null) {
                return z5 ? (byte[]) K.clone() : K;
            }
            int i7 = this.f5517k;
            int i8 = this.f5515i;
            int i9 = i8 - i7;
            this.f5519m += i8;
            this.f5517k = 0;
            this.f5515i = 0;
            List<byte[]> L = L(i6 - i9);
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f5514h, i7, bArr, 0, i9);
            for (byte[] bArr2 : L) {
                System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                i9 += bArr2.length;
            }
            return bArr;
        }

        private byte[] K(int i6) {
            if (i6 == 0) {
                return z.f5710d;
            }
            if (i6 < 0) {
                throw a0.g();
            }
            int i7 = this.f5519m;
            int i8 = this.f5517k;
            int i9 = i7 + i8 + i6;
            if (i9 - this.f5501c > 0) {
                throw a0.l();
            }
            int i10 = this.f5520n;
            if (i9 > i10) {
                V((i10 - i7) - i8);
                throw a0.m();
            }
            int i11 = this.f5515i - i8;
            int i12 = i6 - i11;
            if (i12 >= 4096 && i12 > F(this.f5513g)) {
                return null;
            }
            byte[] bArr = new byte[i6];
            System.arraycopy(this.f5514h, this.f5517k, bArr, 0, i11);
            this.f5519m += this.f5515i;
            this.f5517k = 0;
            this.f5515i = 0;
            while (i11 < i6) {
                int G = G(this.f5513g, bArr, i11, i6 - i11);
                if (G == -1) {
                    throw a0.m();
                }
                this.f5519m += G;
                i11 += G;
            }
            return bArr;
        }

        private List L(int i6) {
            ArrayList arrayList = new ArrayList();
            while (i6 > 0) {
                int min = Math.min(i6, 4096);
                byte[] bArr = new byte[min];
                int i7 = 0;
                while (i7 < min) {
                    int read = this.f5513g.read(bArr, i7, min - i7);
                    if (read == -1) {
                        throw a0.m();
                    }
                    this.f5519m += read;
                    i7 += read;
                }
                i6 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i6 = this.f5515i + this.f5516j;
            this.f5515i = i6;
            int i7 = this.f5519m + i6;
            int i8 = this.f5520n;
            if (i7 <= i8) {
                this.f5516j = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f5516j = i9;
            this.f5515i = i6 - i9;
        }

        private void S(int i6) {
            if (a0(i6)) {
                return;
            }
            if (i6 <= (this.f5501c - this.f5519m) - this.f5517k) {
                throw a0.m();
            }
            throw a0.l();
        }

        private static long T(InputStream inputStream, long j6) {
            try {
                return inputStream.skip(j6);
            } catch (a0 e6) {
                e6.j();
                throw e6;
            }
        }

        private void W(int i6) {
            if (i6 < 0) {
                throw a0.g();
            }
            int i7 = this.f5519m;
            int i8 = this.f5517k;
            int i9 = i7 + i8 + i6;
            int i10 = this.f5520n;
            if (i9 > i10) {
                V((i10 - i7) - i8);
                throw a0.m();
            }
            this.f5519m = i7 + i8;
            int i11 = this.f5515i - i8;
            this.f5515i = 0;
            this.f5517k = 0;
            while (i11 < i6) {
                try {
                    long j6 = i6 - i11;
                    long T = T(this.f5513g, j6);
                    if (T < 0 || T > j6) {
                        throw new IllegalStateException(this.f5513g.getClass() + "#skip returned invalid result: " + T + "\nThe InputStream implementation is buggy.");
                    }
                    if (T == 0) {
                        break;
                    } else {
                        i11 += (int) T;
                    }
                } finally {
                    this.f5519m += i11;
                    R();
                }
            }
            if (i11 >= i6) {
                return;
            }
            int i12 = this.f5515i;
            int i13 = i12 - this.f5517k;
            this.f5517k = i12;
            while (true) {
                S(1);
                int i14 = i6 - i13;
                int i15 = this.f5515i;
                if (i14 <= i15) {
                    this.f5517k = i14;
                    return;
                } else {
                    i13 += i15;
                    this.f5517k = i15;
                }
            }
        }

        private void X() {
            if (this.f5515i - this.f5517k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f5514h;
                int i7 = this.f5517k;
                this.f5517k = i7 + 1;
                if (bArr[i7] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void Z() {
            for (int i6 = 0; i6 < 10; i6++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private boolean a0(int i6) {
            int i7 = this.f5517k;
            int i8 = i7 + i6;
            int i9 = this.f5515i;
            if (i8 <= i9) {
                throw new IllegalStateException("refillBuffer() called when " + i6 + " bytes were already available in buffer");
            }
            int i10 = this.f5501c;
            int i11 = this.f5519m;
            if (i6 > (i10 - i11) - i7 || i11 + i7 + i6 > this.f5520n) {
                return false;
            }
            if (i7 > 0) {
                if (i9 > i7) {
                    byte[] bArr = this.f5514h;
                    System.arraycopy(bArr, i7, bArr, 0, i9 - i7);
                }
                this.f5519m += i7;
                this.f5515i -= i7;
                this.f5517k = 0;
            }
            InputStream inputStream = this.f5513g;
            byte[] bArr2 = this.f5514h;
            int i12 = this.f5515i;
            int G = G(inputStream, bArr2, i12, Math.min(bArr2.length - i12, (this.f5501c - this.f5519m) - i12));
            if (G == 0 || G < -1 || G > this.f5514h.length) {
                throw new IllegalStateException(this.f5513g.getClass() + "#read(byte[]) returned invalid result: " + G + "\nThe InputStream implementation is buggy.");
            }
            if (G <= 0) {
                return false;
            }
            this.f5515i += G;
            R();
            if (this.f5515i >= i6) {
                return true;
            }
            return a0(i6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() {
            byte[] J;
            int i6;
            int O = O();
            int i7 = this.f5517k;
            int i8 = this.f5515i;
            if (O <= i8 - i7 && O > 0) {
                J = this.f5514h;
                i6 = i7 + O;
            } else {
                if (O == 0) {
                    return "";
                }
                i7 = 0;
                if (O > i8) {
                    J = J(O, false);
                    return o1.e(J, i7, O);
                }
                S(O);
                J = this.f5514h;
                i6 = O + 0;
            }
            this.f5517k = i6;
            return o1.e(J, i7, O);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int B() {
            if (e()) {
                this.f5518l = 0;
                return 0;
            }
            int O = O();
            this.f5518l = O;
            if (p1.a(O) != 0) {
                return this.f5518l;
            }
            throw a0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean E(int i6) {
            int b6 = p1.b(i6);
            if (b6 == 0) {
                X();
                return true;
            }
            if (b6 == 1) {
                V(8);
                return true;
            }
            if (b6 == 2) {
                V(O());
                return true;
            }
            if (b6 == 3) {
                U();
                a(p1.c(p1.a(i6), 4));
                return true;
            }
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            V(4);
            return true;
        }

        public byte I() {
            if (this.f5517k == this.f5515i) {
                S(1);
            }
            byte[] bArr = this.f5514h;
            int i6 = this.f5517k;
            this.f5517k = i6 + 1;
            return bArr[i6];
        }

        public int M() {
            int i6 = this.f5517k;
            if (this.f5515i - i6 < 4) {
                S(4);
                i6 = this.f5517k;
            }
            byte[] bArr = this.f5514h;
            this.f5517k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long N() {
            int i6 = this.f5517k;
            if (this.f5515i - i6 < 8) {
                S(8);
                i6 = this.f5517k;
            }
            byte[] bArr = this.f5514h;
            this.f5517k = i6 + 8;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int O() {
            /*
                r5 = this;
                int r0 = r5.f5517k
                int r1 = r5.f5515i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f5514h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f5517k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.Q()
                int r1 = (int) r0
                return r1
            L70:
                r5.f5517k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i.c.O():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long P() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i.c.P():long");
        }

        long Q() {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                j6 |= (r3 & Byte.MAX_VALUE) << i6;
                if ((I() & 128) == 0) {
                    return j6;
                }
            }
            throw a0.f();
        }

        public void U() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void V(int i6) {
            int i7 = this.f5515i;
            int i8 = this.f5517k;
            if (i6 > i7 - i8 || i6 < 0) {
                W(i6);
            } else {
                this.f5517k = i8 + i6;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i6) {
            if (this.f5518l != i6) {
                throw a0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int d() {
            return this.f5519m + this.f5517k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean e() {
            return this.f5517k == this.f5515i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void k(int i6) {
            this.f5520n = i6;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int l(int i6) {
            if (i6 < 0) {
                throw a0.g();
            }
            int i7 = i6 + this.f5519m + this.f5517k;
            int i8 = this.f5520n;
            if (i7 > i8) {
                throw a0.m();
            }
            this.f5520n = i7;
            R();
            return i8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h n() {
            int O = O();
            int i6 = this.f5515i;
            int i7 = this.f5517k;
            if (O > i6 - i7 || O <= 0) {
                return O == 0 ? h.f5485b : H(O);
            }
            h m6 = h.m(this.f5514h, i7, O);
            this.f5517k += O;
            return m6;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int x() {
            return i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long y() {
            return i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String z() {
            int O = O();
            if (O > 0) {
                int i6 = this.f5515i;
                int i7 = this.f5517k;
                if (O <= i6 - i7) {
                    String str = new String(this.f5514h, i7, O, z.f5708b);
                    this.f5517k += O;
                    return str;
                }
            }
            if (O == 0) {
                return "";
            }
            if (O > this.f5515i) {
                return new String(J(O, false), z.f5708b);
            }
            S(O);
            String str2 = new String(this.f5514h, this.f5517k, O, z.f5708b);
            this.f5517k += O;
            return str2;
        }
    }

    private i() {
        this.f5500b = f5498f;
        this.f5501c = Integer.MAX_VALUE;
        this.f5503e = false;
    }

    public static int b(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long c(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static i g(InputStream inputStream, int i6) {
        if (i6 > 0) {
            return inputStream == null ? h(z.f5710d) : new c(inputStream, i6);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static i i(byte[] bArr, int i6, int i7) {
        return j(bArr, i6, i7, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i j(byte[] bArr, int i6, int i7, boolean z5) {
        b bVar = new b(bArr, i6, i7, z5);
        try {
            bVar.l(i7);
            return bVar;
        } catch (a0 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i6);

    public abstract void a(int i6);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i6);

    public abstract int l(int i6);

    public abstract boolean m();

    public abstract h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
