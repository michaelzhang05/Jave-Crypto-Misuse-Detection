package p;

import java.util.ArrayList;
import p.e;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: i1, reason: collision with root package name */
    private e[] f8706i1;
    private int L0 = -1;
    private int M0 = -1;
    private int N0 = -1;
    private int O0 = -1;
    private int P0 = -1;
    private int Q0 = -1;
    private float R0 = 0.5f;
    private float S0 = 0.5f;
    private float T0 = 0.5f;
    private float U0 = 0.5f;
    private float V0 = 0.5f;
    private float W0 = 0.5f;
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 2;

    /* renamed from: a1, reason: collision with root package name */
    private int f8698a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    private int f8699b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    private int f8700c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f8701d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    private ArrayList f8702e1 = new ArrayList();

    /* renamed from: f1, reason: collision with root package name */
    private e[] f8703f1 = null;

    /* renamed from: g1, reason: collision with root package name */
    private e[] f8704g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    private int[] f8705h1 = null;

    /* renamed from: j1, reason: collision with root package name */
    private int f8707j1 = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8708a;

        /* renamed from: d, reason: collision with root package name */
        private d f8711d;

        /* renamed from: e, reason: collision with root package name */
        private d f8712e;

        /* renamed from: f, reason: collision with root package name */
        private d f8713f;

        /* renamed from: g, reason: collision with root package name */
        private d f8714g;

        /* renamed from: h, reason: collision with root package name */
        private int f8715h;

        /* renamed from: i, reason: collision with root package name */
        private int f8716i;

        /* renamed from: j, reason: collision with root package name */
        private int f8717j;

        /* renamed from: k, reason: collision with root package name */
        private int f8718k;

        /* renamed from: q, reason: collision with root package name */
        private int f8724q;

        /* renamed from: b, reason: collision with root package name */
        private e f8709b = null;

        /* renamed from: c, reason: collision with root package name */
        int f8710c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f8719l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f8720m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f8721n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f8722o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f8723p = 0;

        public a(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i7) {
            this.f8715h = 0;
            this.f8716i = 0;
            this.f8717j = 0;
            this.f8718k = 0;
            this.f8724q = 0;
            this.f8708a = i6;
            this.f8711d = dVar;
            this.f8712e = dVar2;
            this.f8713f = dVar3;
            this.f8714g = dVar4;
            this.f8715h = g.this.P0();
            this.f8716i = g.this.R0();
            this.f8717j = g.this.Q0();
            this.f8718k = g.this.O0();
            this.f8724q = i7;
        }

        private void h() {
            this.f8719l = 0;
            this.f8720m = 0;
            this.f8709b = null;
            this.f8710c = 0;
            int i6 = this.f8722o;
            for (int i7 = 0; i7 < i6 && this.f8721n + i7 < g.this.f8707j1; i7++) {
                e eVar = g.this.f8706i1[this.f8721n + i7];
                if (this.f8708a == 0) {
                    int P = eVar.P();
                    int i8 = g.this.X0;
                    if (eVar.O() == 8) {
                        i8 = 0;
                    }
                    this.f8719l += P + i8;
                    int A1 = g.this.A1(eVar, this.f8724q);
                    if (this.f8709b == null || this.f8710c < A1) {
                        this.f8709b = eVar;
                        this.f8710c = A1;
                        this.f8720m = A1;
                    }
                } else {
                    int B1 = g.this.B1(eVar, this.f8724q);
                    int A12 = g.this.A1(eVar, this.f8724q);
                    int i9 = g.this.Y0;
                    if (eVar.O() == 8) {
                        i9 = 0;
                    }
                    this.f8720m += A12 + i9;
                    if (this.f8709b == null || this.f8710c < B1) {
                        this.f8709b = eVar;
                        this.f8710c = B1;
                        this.f8719l = B1;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f8708a == 0) {
                int B1 = g.this.B1(eVar, this.f8724q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f8723p++;
                    B1 = 0;
                }
                this.f8719l += B1 + (eVar.O() != 8 ? g.this.X0 : 0);
                int A1 = g.this.A1(eVar, this.f8724q);
                if (this.f8709b == null || this.f8710c < A1) {
                    this.f8709b = eVar;
                    this.f8710c = A1;
                    this.f8720m = A1;
                }
            } else {
                int B12 = g.this.B1(eVar, this.f8724q);
                int A12 = g.this.A1(eVar, this.f8724q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f8723p++;
                    A12 = 0;
                }
                this.f8720m += A12 + (eVar.O() != 8 ? g.this.Y0 : 0);
                if (this.f8709b == null || this.f8710c < B12) {
                    this.f8709b = eVar;
                    this.f8710c = B12;
                    this.f8719l = B12;
                }
            }
            this.f8722o++;
        }

        public void c() {
            this.f8710c = 0;
            this.f8709b = null;
            this.f8719l = 0;
            this.f8720m = 0;
            this.f8721n = 0;
            this.f8722o = 0;
            this.f8723p = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:138:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x02d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 812
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p.g.a.d(boolean, int, boolean):void");
        }

        public int e() {
            return this.f8708a == 1 ? this.f8720m - g.this.Y0 : this.f8720m;
        }

        public int f() {
            return this.f8708a == 0 ? this.f8719l - g.this.X0 : this.f8719l;
        }

        public void g(int i6) {
            g gVar;
            e.b y5;
            int P;
            e.b bVar;
            int i7;
            int i8 = this.f8723p;
            if (i8 == 0) {
                return;
            }
            int i9 = this.f8722o;
            int i10 = i6 / i8;
            for (int i11 = 0; i11 < i9 && this.f8721n + i11 < g.this.f8707j1; i11++) {
                e eVar = g.this.f8706i1[this.f8721n + i11];
                if (this.f8708a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f8663l == 0) {
                        gVar = g.this;
                        y5 = e.b.FIXED;
                        bVar = eVar.M();
                        i7 = eVar.v();
                        P = i10;
                        gVar.T0(eVar, y5, P, bVar, i7);
                    }
                } else {
                    if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f8665m == 0) {
                        gVar = g.this;
                        y5 = eVar.y();
                        P = eVar.P();
                        bVar = e.b.FIXED;
                        i7 = i10;
                        gVar.T0(eVar, y5, P, bVar, i7);
                    }
                }
            }
            h();
        }

        public void i(int i6) {
            this.f8721n = i6;
        }

        public void j(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i7, int i8, int i9, int i10, int i11) {
            this.f8708a = i6;
            this.f8711d = dVar;
            this.f8712e = dVar2;
            this.f8713f = dVar3;
            this.f8714g = dVar4;
            this.f8715h = i7;
            this.f8716i = i8;
            this.f8717j = i9;
            this.f8718k = i10;
            this.f8724q = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i7 = eVar.f8665m;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (eVar.f8679t * i6);
                if (i8 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i8);
                }
                return i8;
            }
            if (i7 == 1) {
                return eVar.v();
            }
            if (i7 == 3) {
                return (int) ((eVar.P() * eVar.Q) + 0.5f);
            }
        }
        return eVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i7 = eVar.f8663l;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (eVar.f8673q * i6);
                if (i8 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i8, eVar.M(), eVar.v());
                }
                return i8;
            }
            if (i7 == 1) {
                return eVar.P();
            }
            if (i7 == 3) {
                return (int) ((eVar.v() * eVar.Q) + 0.5f);
            }
        }
        return eVar.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x010b -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0113 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C1(p.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.C1(p.e[], int, int, int, int[]):void");
    }

    private void D1(e[] eVarArr, int i6, int i7, int i8, int[] iArr) {
        int i9;
        int i10;
        d dVar;
        int Q0;
        d dVar2;
        int O0;
        int i11;
        if (i6 == 0) {
            return;
        }
        this.f8702e1.clear();
        a aVar = new a(i7, this.B, this.C, this.D, this.E, i8);
        this.f8702e1.add(aVar);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        if (i7 == 0) {
            while (i14 < i6) {
                e eVar = eVarArr[i14];
                int B1 = B1(eVar, i8);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i15 = i12;
                boolean z5 = (i13 == i8 || (this.X0 + i13) + B1 > i8) && aVar.f8709b != null;
                if (!z5 && i14 > 0 && (i11 = this.f8700c1) > 0 && i14 % i11 == 0) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i7, this.B, this.C, this.D, this.E, i8);
                    aVar.i(i14);
                    this.f8702e1.add(aVar);
                } else if (i14 > 0) {
                    i13 += this.X0 + B1;
                    aVar.b(eVar);
                    i14++;
                    i12 = i15;
                }
                i13 = B1;
                aVar.b(eVar);
                i14++;
                i12 = i15;
            }
        } else {
            while (i14 < i6) {
                e eVar2 = eVarArr[i14];
                int A1 = A1(eVar2, i8);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i16 = i12;
                boolean z6 = (i13 == i8 || (this.Y0 + i13) + A1 > i8) && aVar.f8709b != null;
                if (!z6 && i14 > 0 && (i9 = this.f8700c1) > 0 && i14 % i9 == 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i7, this.B, this.C, this.D, this.E, i8);
                    aVar.i(i14);
                    this.f8702e1.add(aVar);
                } else if (i14 > 0) {
                    i13 += this.Y0 + A1;
                    aVar.b(eVar2);
                    i14++;
                    i12 = i16;
                }
                i13 = A1;
                aVar.b(eVar2);
                i14++;
                i12 = i16;
            }
        }
        int size = this.f8702e1.size();
        d dVar3 = this.B;
        d dVar4 = this.C;
        d dVar5 = this.D;
        d dVar6 = this.E;
        int P0 = P0();
        int R0 = R0();
        int Q02 = Q0();
        int O02 = O0();
        e.b y5 = y();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z7 = y5 == bVar || M() == bVar;
        if (i12 > 0 && z7) {
            for (int i17 = 0; i17 < size; i17++) {
                a aVar2 = (a) this.f8702e1.get(i17);
                aVar2.g(i8 - (i7 == 0 ? aVar2.f() : aVar2.e()));
            }
        }
        int i18 = R0;
        int i19 = Q02;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = P0;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i24 = O02;
        while (i22 < size) {
            a aVar3 = (a) this.f8702e1.get(i22);
            if (i7 == 0) {
                if (i22 < size - 1) {
                    dVar2 = ((a) this.f8702e1.get(i22 + 1)).f8709b.C;
                    O0 = 0;
                } else {
                    dVar2 = this.E;
                    O0 = O0();
                }
                d dVar9 = aVar3.f8709b.E;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i25 = i20;
                d dVar12 = dVar7;
                int i26 = i21;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i10 = i22;
                aVar3.j(i7, dVar10, dVar12, dVar13, dVar2, i23, i18, i19, O0, i8);
                int max = Math.max(i26, aVar3.f());
                i20 = i25 + aVar3.e();
                if (i10 > 0) {
                    i20 += this.Y0;
                }
                dVar8 = dVar11;
                i21 = max;
                dVar7 = dVar9;
                i18 = 0;
                dVar = dVar14;
                int i27 = O0;
                dVar6 = dVar2;
                i24 = i27;
            } else {
                d dVar15 = dVar8;
                int i28 = i20;
                int i29 = i21;
                i10 = i22;
                if (i10 < size - 1) {
                    dVar = ((a) this.f8702e1.get(i10 + 1)).f8709b.B;
                    Q0 = 0;
                } else {
                    dVar = this.D;
                    Q0 = Q0();
                }
                d dVar16 = aVar3.f8709b.D;
                aVar3.j(i7, dVar15, dVar7, dVar, dVar6, i23, i18, Q0, i24, i8);
                i21 = i29 + aVar3.f();
                int max2 = Math.max(i28, aVar3.e());
                if (i10 > 0) {
                    i21 += this.X0;
                }
                i20 = max2;
                i19 = Q0;
                dVar8 = dVar16;
                i23 = 0;
            }
            i22 = i10 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i21;
        iArr[1] = i20;
    }

    private void E1(e[] eVarArr, int i6, int i7, int i8, int[] iArr) {
        a aVar;
        if (i6 == 0) {
            return;
        }
        if (this.f8702e1.size() == 0) {
            aVar = new a(i7, this.B, this.C, this.D, this.E, i8);
            this.f8702e1.add(aVar);
        } else {
            a aVar2 = (a) this.f8702e1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i7, this.B, this.C, this.D, this.E, P0(), R0(), Q0(), O0(), i8);
        }
        for (int i9 = 0; i9 < i6; i9++) {
            aVar.b(eVarArr[i9]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z5) {
        e eVar;
        if (this.f8705h1 == null || this.f8704g1 == null || this.f8703f1 == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f8707j1; i6++) {
            this.f8706i1[i6].Z();
        }
        int[] iArr = this.f8705h1;
        int i7 = iArr[0];
        int i8 = iArr[1];
        e eVar2 = null;
        for (int i9 = 0; i9 < i7; i9++) {
            e eVar3 = this.f8704g1[z5 ? (i7 - i9) - 1 : i9];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i9 == 0) {
                    eVar3.j(eVar3.B, this.B, P0());
                    eVar3.j0(this.L0);
                    eVar3.i0(this.R0);
                }
                if (i9 == i7 - 1) {
                    eVar3.j(eVar3.D, this.D, Q0());
                }
                if (i9 > 0) {
                    eVar3.j(eVar3.B, eVar2.D, this.X0);
                    eVar2.j(eVar2.D, eVar3.B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i10 = 0; i10 < i8; i10++) {
            e eVar4 = this.f8703f1[i10];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i10 == 0) {
                    eVar4.j(eVar4.C, this.C, R0());
                    eVar4.y0(this.M0);
                    eVar4.x0(this.S0);
                }
                if (i10 == i8 - 1) {
                    eVar4.j(eVar4.E, this.E, O0());
                }
                if (i10 > 0) {
                    eVar4.j(eVar4.C, eVar2.E, this.Y0);
                    eVar2.j(eVar2.E, eVar4.C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = (i12 * i7) + i11;
                if (this.f8701d1 == 1) {
                    i13 = (i11 * i8) + i12;
                }
                e[] eVarArr = this.f8706i1;
                if (i13 < eVarArr.length && (eVar = eVarArr[i13]) != null && eVar.O() != 8) {
                    e eVar5 = this.f8704g1[i11];
                    e eVar6 = this.f8703f1[i12];
                    if (eVar != eVar5) {
                        eVar.j(eVar.B, eVar5.B, 0);
                        eVar.j(eVar.D, eVar5.D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.C, eVar6.C, 0);
                        eVar.j(eVar.E, eVar6.E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f6) {
        this.T0 = f6;
    }

    public void G1(int i6) {
        this.N0 = i6;
    }

    public void H1(float f6) {
        this.U0 = f6;
    }

    public void I1(int i6) {
        this.O0 = i6;
    }

    public void J1(int i6) {
        this.Z0 = i6;
    }

    public void K1(float f6) {
        this.R0 = f6;
    }

    public void L1(int i6) {
        this.X0 = i6;
    }

    public void M1(int i6) {
        this.L0 = i6;
    }

    public void N1(float f6) {
        this.V0 = f6;
    }

    public void O1(int i6) {
        this.P0 = i6;
    }

    public void P1(float f6) {
        this.W0 = f6;
    }

    public void Q1(int i6) {
        this.Q0 = i6;
    }

    public void R1(int i6) {
        this.f8700c1 = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r18.M0 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0054, code lost:
    
        r18.M0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0052, code lost:
    
        if (r18.M0 == (-1)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    @Override // p.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.S0(int, int, int, int):void");
    }

    public void S1(int i6) {
        this.f8701d1 = i6;
    }

    public void T1(int i6) {
        this.f8698a1 = i6;
    }

    public void U1(float f6) {
        this.S0 = f6;
    }

    public void V1(int i6) {
        this.Y0 = i6;
    }

    public void W1(int i6) {
        this.M0 = i6;
    }

    public void X1(int i6) {
        this.f8699b1 = i6;
    }

    @Override // p.e
    public void f(o.d dVar) {
        super.f(dVar);
        boolean a12 = G() != null ? ((f) G()).a1() : false;
        int i6 = this.f8699b1;
        if (i6 != 0) {
            if (i6 == 1) {
                int size = this.f8702e1.size();
                int i7 = 0;
                while (i7 < size) {
                    ((a) this.f8702e1.get(i7)).d(a12, i7, i7 == size + (-1));
                    i7++;
                }
            } else if (i6 == 2) {
                z1(a12);
            }
        } else if (this.f8702e1.size() > 0) {
            ((a) this.f8702e1.get(0)).d(a12, 0, true);
        }
        W0(false);
    }
}
