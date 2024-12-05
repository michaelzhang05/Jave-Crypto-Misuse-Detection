package b2;

import androidx.compose.runtime.ComposerKt;
import b2.C1963c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class v extends u {

    /* renamed from: c0, reason: collision with root package name */
    private static final int[] f15226c0 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* renamed from: A, reason: collision with root package name */
    private final int f15227A;

    /* renamed from: B, reason: collision with root package name */
    private C1962b f15228B;

    /* renamed from: C, reason: collision with root package name */
    private C1962b f15229C;

    /* renamed from: D, reason: collision with root package name */
    private int f15230D;

    /* renamed from: E, reason: collision with root package name */
    private C1962b[] f15231E;

    /* renamed from: F, reason: collision with root package name */
    private int f15232F;

    /* renamed from: G, reason: collision with root package name */
    private C1962b[] f15233G;

    /* renamed from: H, reason: collision with root package name */
    private C1962b f15234H;

    /* renamed from: I, reason: collision with root package name */
    private C1962b f15235I;

    /* renamed from: J, reason: collision with root package name */
    private C1964d f15236J;

    /* renamed from: K, reason: collision with root package name */
    private int f15237K;

    /* renamed from: L, reason: collision with root package name */
    private C1964d f15238L;

    /* renamed from: M, reason: collision with root package name */
    private C1963c f15239M;

    /* renamed from: N, reason: collision with root package name */
    private final int f15240N;

    /* renamed from: O, reason: collision with root package name */
    private s f15241O;

    /* renamed from: P, reason: collision with root package name */
    private s f15242P;

    /* renamed from: Q, reason: collision with root package name */
    private s f15243Q;

    /* renamed from: R, reason: collision with root package name */
    private int f15244R;

    /* renamed from: S, reason: collision with root package name */
    private int f15245S;

    /* renamed from: T, reason: collision with root package name */
    private int f15246T;

    /* renamed from: U, reason: collision with root package name */
    private int f15247U;

    /* renamed from: V, reason: collision with root package name */
    private int[] f15248V;

    /* renamed from: W, reason: collision with root package name */
    private int[] f15249W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f15250X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f15251Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f15252Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f15253a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f15254b0;

    /* renamed from: c, reason: collision with root package name */
    private final C1959C f15255c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15256d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15257e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15258f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15259g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15260h;

    /* renamed from: i, reason: collision with root package name */
    private int f15261i;

    /* renamed from: j, reason: collision with root package name */
    private int f15262j;

    /* renamed from: k, reason: collision with root package name */
    private final C1964d f15263k;

    /* renamed from: l, reason: collision with root package name */
    private r f15264l;

    /* renamed from: m, reason: collision with root package name */
    private r f15265m;

    /* renamed from: n, reason: collision with root package name */
    private int f15266n;

    /* renamed from: o, reason: collision with root package name */
    private C1964d f15267o;

    /* renamed from: p, reason: collision with root package name */
    private int f15268p;

    /* renamed from: q, reason: collision with root package name */
    private C1964d f15269q;

    /* renamed from: r, reason: collision with root package name */
    private int f15270r;

    /* renamed from: s, reason: collision with root package name */
    private C1964d f15271s;

    /* renamed from: t, reason: collision with root package name */
    private int f15272t;

    /* renamed from: u, reason: collision with root package name */
    private C1964d f15273u;

    /* renamed from: v, reason: collision with root package name */
    private C1962b f15274v;

    /* renamed from: w, reason: collision with root package name */
    private C1962b f15275w;

    /* renamed from: x, reason: collision with root package name */
    private C1963c f15276x;

    /* renamed from: y, reason: collision with root package name */
    private final int f15277y;

    /* renamed from: z, reason: collision with root package name */
    private final int[] f15278z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(C1959C c1959c, int i8, String str, String str2, String str3, String[] strArr, int i9) {
        super(589824);
        int i10;
        int D8;
        this.f15263k = new C1964d();
        this.f15255c = c1959c;
        if ("<init>".equals(str)) {
            i10 = 262144 | i8;
        } else {
            i10 = i8;
        }
        this.f15256d = i10;
        this.f15257e = c1959c.D(str);
        this.f15258f = str;
        this.f15259g = c1959c.D(str2);
        this.f15260h = str2;
        if (str3 == null) {
            D8 = 0;
        } else {
            D8 = c1959c.D(str3);
        }
        this.f15227A = D8;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f15277y = length;
            this.f15278z = new int[length];
            for (int i11 = 0; i11 < this.f15277y; i11++) {
                this.f15278z[i11] = c1959c.e(strArr[i11]).f15051a;
            }
        } else {
            this.f15277y = 0;
            this.f15278z = null;
        }
        this.f15240N = i9;
        if (i9 != 0) {
            int c8 = C1960D.c(str2) >> 2;
            c8 = (i8 & 8) != 0 ? c8 - 1 : c8;
            this.f15262j = c8;
            this.f15246T = c8;
            s sVar = new s();
            this.f15241O = sVar;
            o(sVar);
        }
    }

    private void F(int i8, s sVar) {
        s sVar2 = this.f15243Q;
        sVar2.f15218l = new m(i8, sVar, sVar2.f15218l);
    }

    private void I() {
        int i8;
        r rVar = this.f15264l;
        while (true) {
            String str = "java/lang/Throwable";
            if (rVar == null) {
                break;
            }
            String str2 = rVar.f15204e;
            if (str2 != null) {
                str = str2;
            }
            int g8 = p.g(this.f15255c, str);
            s e8 = rVar.f15202c.e();
            e8.f15207a = (short) (e8.f15207a | 2);
            s e9 = rVar.f15201b.e();
            for (s e10 = rVar.f15200a.e(); e10 != e9; e10 = e10.f15217k) {
                e10.f15218l = new m(g8, e8, e10.f15218l);
            }
            rVar = rVar.f15205f;
        }
        p pVar = this.f15241O.f15216j;
        pVar.u(this.f15255c, this.f15256d, this.f15260h, this.f15262j);
        pVar.a(this);
        s sVar = this.f15241O;
        sVar.f15219m = s.f15206n;
        int i9 = 0;
        while (sVar != s.f15206n) {
            s sVar2 = sVar.f15219m;
            sVar.f15219m = null;
            sVar.f15207a = (short) (sVar.f15207a | 8);
            int j8 = sVar.f15216j.j() + sVar.f15214h;
            if (j8 > i9) {
                i9 = j8;
            }
            for (m mVar = sVar.f15218l; mVar != null; mVar = mVar.f15172c) {
                s e11 = mVar.f15171b.e();
                if (sVar.f15216j.m(this.f15255c, e11.f15216j, mVar.f15170a) && e11.f15219m == null) {
                    e11.f15219m = sVar2;
                    sVar2 = e11;
                }
            }
            sVar = sVar2;
        }
        for (s sVar3 = this.f15241O; sVar3 != null; sVar3 = sVar3.f15217k) {
            if ((sVar3.f15207a & 10) == 10) {
                sVar3.f15216j.a(this);
            }
            if ((sVar3.f15207a & 8) == 0) {
                s sVar4 = sVar3.f15217k;
                int i10 = sVar3.f15210d;
                if (sVar4 == null) {
                    i8 = this.f15263k.f15102b;
                } else {
                    i8 = sVar4.f15210d;
                }
                int i11 = i8 - 1;
                if (i11 >= i10) {
                    for (int i12 = i10; i12 < i11; i12++) {
                        this.f15263k.f15101a[i12] = 0;
                    }
                    this.f15263k.f15101a[i11] = -65;
                    this.f15249W[V(i10, 0, 1)] = p.g(this.f15255c, "java/lang/Throwable");
                    U();
                    this.f15264l = r.d(this.f15264l, sVar3, sVar4);
                    i9 = Math.max(i9, 1);
                }
            }
        }
        this.f15261i = i9;
    }

    private void J() {
        int i8;
        for (r rVar = this.f15264l; rVar != null; rVar = rVar.f15205f) {
            s sVar = rVar.f15202c;
            s sVar2 = rVar.f15201b;
            for (s sVar3 = rVar.f15200a; sVar3 != sVar2; sVar3 = sVar3.f15217k) {
                if ((sVar3.f15207a & 16) == 0) {
                    sVar3.f15218l = new m(Integer.MAX_VALUE, sVar, sVar3.f15218l);
                } else {
                    m mVar = sVar3.f15218l.f15172c;
                    mVar.f15172c = new m(Integer.MAX_VALUE, sVar, mVar.f15172c);
                }
            }
        }
        if (this.f15250X) {
            this.f15241O.f((short) 1);
            short s8 = 1;
            for (short s9 = 1; s9 <= s8; s9 = (short) (s9 + 1)) {
                for (s sVar4 = this.f15241O; sVar4 != null; sVar4 = sVar4.f15217k) {
                    if ((sVar4.f15207a & 16) != 0 && sVar4.f15215i == s9) {
                        s sVar5 = sVar4.f15218l.f15172c.f15171b;
                        if (sVar5.f15215i == 0) {
                            s8 = (short) (s8 + 1);
                            sVar5.f(s8);
                        }
                    }
                }
            }
            for (s sVar6 = this.f15241O; sVar6 != null; sVar6 = sVar6.f15217k) {
                if ((sVar6.f15207a & 16) != 0) {
                    sVar6.f15218l.f15172c.f15171b.d(sVar6);
                }
            }
        }
        s sVar7 = this.f15241O;
        sVar7.f15219m = s.f15206n;
        int i9 = this.f15261i;
        while (sVar7 != s.f15206n) {
            s sVar8 = sVar7.f15219m;
            short s10 = sVar7.f15212f;
            int i10 = sVar7.f15214h + s10;
            if (i10 > i9) {
                i9 = i10;
            }
            m mVar2 = sVar7.f15218l;
            if ((sVar7.f15207a & 16) != 0) {
                mVar2 = mVar2.f15172c;
            }
            sVar7 = sVar8;
            while (mVar2 != null) {
                s sVar9 = mVar2.f15171b;
                if (sVar9.f15219m == null) {
                    int i11 = mVar2.f15170a;
                    if (i11 == Integer.MAX_VALUE) {
                        i8 = 1;
                    } else {
                        i8 = i11 + s10;
                    }
                    sVar9.f15212f = (short) i8;
                    sVar9.f15219m = sVar7;
                    sVar7 = sVar9;
                }
                mVar2 = mVar2.f15172c;
            }
        }
        this.f15261i = i9;
    }

    private void L() {
        int i8 = this.f15240N;
        if (i8 == 4) {
            s sVar = new s();
            sVar.f15216j = new p(sVar);
            C1964d c1964d = this.f15263k;
            sVar.i(c1964d.f15101a, c1964d.f15102b);
            this.f15242P.f15217k = sVar;
            this.f15242P = sVar;
            this.f15243Q = null;
            return;
        }
        if (i8 == 1) {
            this.f15243Q.f15214h = (short) this.f15245S;
            this.f15243Q = null;
        }
    }

    private void O(int i8, int i9) {
        while (i8 < i9) {
            p.s(this.f15255c, this.f15249W[i8], this.f15273u);
            i8++;
        }
    }

    private void P() {
        int i8;
        char c8;
        int[] iArr = this.f15249W;
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = 0;
        if (this.f15255c.R() < 50) {
            this.f15273u.k(this.f15249W[0]).k(i9);
            int i12 = i9 + 3;
            O(3, i12);
            this.f15273u.k(i10);
            O(i12, i10 + i12);
            return;
        }
        if (this.f15272t == 0) {
            i8 = this.f15249W[0];
        } else {
            i8 = (this.f15249W[0] - this.f15248V[0]) - 1;
        }
        int i13 = this.f15248V[1];
        int i14 = i9 - i13;
        if (i10 == 0) {
            switch (i14) {
                case -3:
                case -2:
                case -1:
                    c8 = 248;
                    break;
                case 0:
                    if (i8 < 64) {
                        c8 = 0;
                        break;
                    } else {
                        c8 = 251;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c8 = 252;
                    break;
                default:
                    c8 = 255;
                    break;
            }
        } else {
            if (i14 == 0 && i10 == 1) {
                if (i8 < 63) {
                    c8 = '@';
                } else {
                    c8 = 247;
                }
            }
            c8 = 255;
        }
        if (c8 != 255) {
            int i15 = 3;
            while (true) {
                if (i11 < i13 && i11 < i9) {
                    if (this.f15249W[i15] != this.f15248V[i15]) {
                        c8 = 255;
                    } else {
                        i15++;
                        i11++;
                    }
                }
            }
        }
        if (c8 != 0) {
            if (c8 != '@') {
                if (c8 != 247) {
                    if (c8 != 248) {
                        if (c8 != 251) {
                            if (c8 != 252) {
                                this.f15273u.g(255).k(i8).k(i9);
                                int i16 = i9 + 3;
                                O(3, i16);
                                this.f15273u.k(i10);
                                O(i16, i10 + i16);
                                return;
                            }
                            this.f15273u.g(i14 + 251).k(i8);
                            O(i13 + 3, i9 + 3);
                            return;
                        }
                        this.f15273u.g(251).k(i8);
                        return;
                    }
                    this.f15273u.g(i14 + 251).k(i8);
                    return;
                }
                this.f15273u.g(247).k(i8);
                O(i9 + 3, i9 + 4);
                return;
            }
            this.f15273u.g(i8 + 64);
            O(i9 + 3, i9 + 4);
            return;
        }
        this.f15273u.g(i8);
    }

    private void Q(Object obj) {
        if (obj instanceof Integer) {
            this.f15273u.g(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.f15273u.g(7).k(this.f15255c.e((String) obj).f15051a);
        } else {
            this.f15273u.g(8).k(((s) obj).f15210d);
        }
    }

    private void W(s sVar, s[] sVarArr) {
        s sVar2 = this.f15243Q;
        if (sVar2 != null) {
            int i8 = this.f15240N;
            if (i8 == 4) {
                sVar2.f15216j.d(171, 0, null, null);
                F(0, sVar);
                s e8 = sVar.e();
                e8.f15207a = (short) (e8.f15207a | 2);
                for (s sVar3 : sVarArr) {
                    F(0, sVar3);
                    s e9 = sVar3.e();
                    e9.f15207a = (short) (e9.f15207a | 2);
                }
            } else if (i8 == 1) {
                int i9 = this.f15244R - 1;
                this.f15244R = i9;
                F(i9, sVar);
                for (s sVar4 : sVarArr) {
                    F(this.f15244R, sVar4);
                }
            }
            L();
        }
    }

    @Override // b2.u
    public AbstractC1961a A(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15255c, i8, e8, str, this.f15274v);
            this.f15274v = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15255c, i8, e8, str, this.f15275w);
        this.f15275w = i10;
        return i10;
    }

    @Override // b2.u
    public void B(s sVar, s sVar2, s sVar3, String str) {
        int i8;
        if (str != null) {
            i8 = this.f15255c.e(str).f15051a;
        } else {
            i8 = 0;
        }
        r rVar = new r(sVar, sVar2, sVar3, i8, str);
        if (this.f15264l == null) {
            this.f15264l = rVar;
        } else {
            this.f15265m.f15205f = rVar;
        }
        this.f15265m = rVar;
    }

    @Override // b2.u
    public AbstractC1961a C(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15255c, i8, e8, str, this.f15234H);
            this.f15234H = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15255c, i8, e8, str, this.f15235I);
        this.f15235I = i10;
        return i10;
    }

    @Override // b2.u
    public void D(int i8, String str) {
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B e8 = this.f15255c.e(str);
        this.f15263k.e(i8, e8.f15051a);
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i9 = this.f15240N;
            if (i9 != 4 && i9 != 3) {
                if (i8 == 187) {
                    int i10 = this.f15244R + 1;
                    if (i10 > this.f15245S) {
                        this.f15245S = i10;
                    }
                    this.f15244R = i10;
                    return;
                }
                return;
            }
            sVar.f15216j.d(i8, this.f15252Z, e8, this.f15255c);
        }
    }

    @Override // b2.u
    public void E(int i8, int i9) {
        int i10;
        int i11;
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        if (i9 < 4 && i8 != 169) {
            if (i8 < 54) {
                i11 = ((i8 - 21) << 2) + 26;
            } else {
                i11 = ((i8 - 54) << 2) + 59;
            }
            c1964d.g(i11 + i9);
        } else if (i9 >= 256) {
            c1964d.g(196).e(i8, i9);
        } else {
            c1964d.c(i8, i9);
        }
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i12 = this.f15240N;
            if (i12 != 4 && i12 != 3) {
                if (i8 == 169) {
                    sVar.f15207a = (short) (sVar.f15207a | 64);
                    sVar.f15213g = (short) this.f15244R;
                    L();
                } else {
                    int i13 = this.f15244R + f15226c0[i8];
                    if (i13 > this.f15245S) {
                        this.f15245S = i13;
                    }
                    this.f15244R = i13;
                }
            } else {
                sVar.f15216j.d(i8, i9, null, null);
            }
        }
        int i14 = this.f15240N;
        if (i14 != 0) {
            if (i8 != 22 && i8 != 24 && i8 != 55 && i8 != 57) {
                i10 = i9 + 1;
            } else {
                i10 = i9 + 2;
            }
            if (i10 > this.f15262j) {
                this.f15262j = i10;
            }
        }
        if (i8 >= 54 && i14 == 4 && this.f15264l != null) {
            o(new s());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(C1965e c1965e, boolean z8, boolean z9, int i8, int i9, int i10) {
        boolean z10;
        boolean z11;
        if (c1965e == this.f15255c.S() && i8 == this.f15259g && i9 == this.f15227A) {
            if ((this.f15256d & 131072) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                if (this.f15255c.R() < 49 && (this.f15256d & 4096) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z8 != z11) {
                    return false;
                }
                if (i10 == 0) {
                    if (this.f15277y != 0) {
                        return false;
                    }
                } else if (c1965e.I(i10) == this.f15277y) {
                    int i11 = i10 + 2;
                    for (int i12 = 0; i12 < this.f15277y; i12++) {
                        if (c1965e.I(i11) != this.f15278z[i12]) {
                            return false;
                        }
                        i11 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(C1963c.a aVar) {
        aVar.b(this.f15239M);
        aVar.b(this.f15276x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K() {
        int i8;
        boolean z8;
        String str;
        if (this.f15253a0 != 0) {
            return this.f15254b0 + 6;
        }
        int i9 = this.f15263k.f15102b;
        if (i9 > 0) {
            if (i9 <= 65535) {
                this.f15255c.D("Code");
                i8 = this.f15263k.f15102b + 16 + r.b(this.f15264l) + 8;
                if (this.f15273u != null) {
                    if (this.f15255c.R() >= 50) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    C1959C c1959c = this.f15255c;
                    if (z8) {
                        str = "StackMapTable";
                    } else {
                        str = "StackMap";
                    }
                    c1959c.D(str);
                    i8 += this.f15273u.f15102b + 8;
                }
                if (this.f15267o != null) {
                    this.f15255c.D("LineNumberTable");
                    i8 += this.f15267o.f15102b + 8;
                }
                if (this.f15269q != null) {
                    this.f15255c.D("LocalVariableTable");
                    i8 += this.f15269q.f15102b + 8;
                }
                if (this.f15271s != null) {
                    this.f15255c.D("LocalVariableTypeTable");
                    i8 += this.f15271s.f15102b + 8;
                }
                C1962b c1962b = this.f15274v;
                if (c1962b != null) {
                    i8 += c1962b.g("RuntimeVisibleTypeAnnotations");
                }
                C1962b c1962b2 = this.f15275w;
                if (c1962b2 != null) {
                    i8 += c1962b2.g("RuntimeInvisibleTypeAnnotations");
                }
                C1963c c1963c = this.f15276x;
                if (c1963c != null) {
                    C1959C c1959c2 = this.f15255c;
                    C1964d c1964d = this.f15263k;
                    i8 += c1963c.c(c1959c2, c1964d.f15101a, c1964d.f15102b, this.f15261i, this.f15262j);
                }
            } else {
                throw new t(this.f15255c.O(), this.f15258f, this.f15260h, this.f15263k.f15102b);
            }
        } else {
            i8 = 8;
        }
        if (this.f15277y > 0) {
            this.f15255c.D("Exceptions");
            i8 += (this.f15277y * 2) + 8;
        }
        int b8 = i8 + C1963c.b(this.f15255c, this.f15256d, this.f15227A) + C1962b.f(this.f15228B, this.f15229C, this.f15234H, this.f15235I);
        C1962b[] c1962bArr = this.f15231E;
        if (c1962bArr != null) {
            int i10 = this.f15230D;
            if (i10 == 0) {
                i10 = c1962bArr.length;
            }
            b8 += C1962b.h("RuntimeVisibleParameterAnnotations", c1962bArr, i10);
        }
        C1962b[] c1962bArr2 = this.f15233G;
        if (c1962bArr2 != null) {
            int i11 = this.f15232F;
            if (i11 == 0) {
                i11 = c1962bArr2.length;
            }
            b8 += C1962b.h("RuntimeInvisibleParameterAnnotations", c1962bArr2, i11);
        }
        if (this.f15236J != null) {
            this.f15255c.D("AnnotationDefault");
            b8 += this.f15236J.f15102b + 6;
        }
        if (this.f15238L != null) {
            this.f15255c.D("MethodParameters");
            b8 += this.f15238L.f15102b + 7;
        }
        C1963c c1963c2 = this.f15239M;
        if (c1963c2 != null) {
            return b8 + c1963c2.a(this.f15255c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M() {
        return this.f15251Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        if (this.f15272t > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(C1964d c1964d) {
        boolean z8;
        int i8;
        int i9;
        int i10;
        boolean z9;
        String str;
        if (this.f15255c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c1964d.k((~i8) & this.f15256d).k(this.f15257e).k(this.f15259g);
        if (this.f15253a0 != 0) {
            c1964d.h(this.f15255c.S().f15105c, this.f15253a0, this.f15254b0);
            return;
        }
        if (this.f15263k.f15102b > 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.f15277y > 0) {
            i9++;
        }
        int i11 = this.f15256d;
        if ((i11 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f15227A != 0) {
            i9++;
        }
        if ((131072 & i11) != 0) {
            i9++;
        }
        if (this.f15228B != null) {
            i9++;
        }
        if (this.f15229C != null) {
            i9++;
        }
        if (this.f15231E != null) {
            i9++;
        }
        if (this.f15233G != null) {
            i9++;
        }
        if (this.f15234H != null) {
            i9++;
        }
        if (this.f15235I != null) {
            i9++;
        }
        if (this.f15236J != null) {
            i9++;
        }
        if (this.f15238L != null) {
            i9++;
        }
        C1963c c1963c = this.f15239M;
        if (c1963c != null) {
            i9 += c1963c.d();
        }
        c1964d.k(i9);
        int i12 = this.f15263k.f15102b;
        if (i12 > 0) {
            int b8 = i12 + 10 + r.b(this.f15264l);
            C1964d c1964d2 = this.f15273u;
            if (c1964d2 != null) {
                b8 += c1964d2.f15102b + 8;
                i10 = 1;
            } else {
                i10 = 0;
            }
            C1964d c1964d3 = this.f15267o;
            if (c1964d3 != null) {
                b8 += c1964d3.f15102b + 8;
                i10++;
            }
            C1964d c1964d4 = this.f15269q;
            if (c1964d4 != null) {
                b8 += c1964d4.f15102b + 8;
                i10++;
            }
            C1964d c1964d5 = this.f15271s;
            if (c1964d5 != null) {
                b8 += c1964d5.f15102b + 8;
                i10++;
            }
            C1962b c1962b = this.f15274v;
            if (c1962b != null) {
                b8 += c1962b.g("RuntimeVisibleTypeAnnotations");
                i10++;
            }
            C1962b c1962b2 = this.f15275w;
            if (c1962b2 != null) {
                b8 += c1962b2.g("RuntimeInvisibleTypeAnnotations");
                i10++;
            }
            C1963c c1963c2 = this.f15276x;
            if (c1963c2 != null) {
                C1959C c1959c = this.f15255c;
                C1964d c1964d6 = this.f15263k;
                b8 += c1963c2.c(c1959c, c1964d6.f15101a, c1964d6.f15102b, this.f15261i, this.f15262j);
                i10 += this.f15276x.d();
            }
            C1964d i13 = c1964d.k(this.f15255c.D("Code")).i(b8).k(this.f15261i).k(this.f15262j).i(this.f15263k.f15102b);
            C1964d c1964d7 = this.f15263k;
            i13.h(c1964d7.f15101a, 0, c1964d7.f15102b);
            r.c(this.f15264l, c1964d);
            c1964d.k(i10);
            if (this.f15273u != null) {
                if (this.f15255c.R() >= 50) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C1959C c1959c2 = this.f15255c;
                if (z9) {
                    str = "StackMapTable";
                } else {
                    str = "StackMap";
                }
                C1964d k8 = c1964d.k(c1959c2.D(str)).i(this.f15273u.f15102b + 2).k(this.f15272t);
                C1964d c1964d8 = this.f15273u;
                k8.h(c1964d8.f15101a, 0, c1964d8.f15102b);
            }
            if (this.f15267o != null) {
                C1964d k9 = c1964d.k(this.f15255c.D("LineNumberTable")).i(this.f15267o.f15102b + 2).k(this.f15266n);
                C1964d c1964d9 = this.f15267o;
                k9.h(c1964d9.f15101a, 0, c1964d9.f15102b);
            }
            if (this.f15269q != null) {
                C1964d k10 = c1964d.k(this.f15255c.D("LocalVariableTable")).i(this.f15269q.f15102b + 2).k(this.f15268p);
                C1964d c1964d10 = this.f15269q;
                k10.h(c1964d10.f15101a, 0, c1964d10.f15102b);
            }
            if (this.f15271s != null) {
                C1964d k11 = c1964d.k(this.f15255c.D("LocalVariableTypeTable")).i(this.f15271s.f15102b + 2).k(this.f15270r);
                C1964d c1964d11 = this.f15271s;
                k11.h(c1964d11.f15101a, 0, c1964d11.f15102b);
            }
            C1962b c1962b3 = this.f15274v;
            if (c1962b3 != null) {
                c1962b3.k(this.f15255c.D("RuntimeVisibleTypeAnnotations"), c1964d);
            }
            C1962b c1962b4 = this.f15275w;
            if (c1962b4 != null) {
                c1962b4.k(this.f15255c.D("RuntimeInvisibleTypeAnnotations"), c1964d);
            }
            C1963c c1963c3 = this.f15276x;
            if (c1963c3 != null) {
                C1959C c1959c3 = this.f15255c;
                C1964d c1964d12 = this.f15263k;
                c1963c3.h(c1959c3, c1964d12.f15101a, c1964d12.f15102b, this.f15261i, this.f15262j, c1964d);
            }
        }
        if (this.f15277y > 0) {
            c1964d.k(this.f15255c.D("Exceptions")).i((this.f15277y * 2) + 2).k(this.f15277y);
            for (int i14 : this.f15278z) {
                c1964d.k(i14);
            }
        }
        C1963c.f(this.f15255c, this.f15256d, this.f15227A, c1964d);
        C1962b.l(this.f15255c, this.f15228B, this.f15229C, this.f15234H, this.f15235I, c1964d);
        if (this.f15231E != null) {
            int D8 = this.f15255c.D("RuntimeVisibleParameterAnnotations");
            C1962b[] c1962bArr = this.f15231E;
            int i15 = this.f15230D;
            if (i15 == 0) {
                i15 = c1962bArr.length;
            }
            C1962b.m(D8, c1962bArr, i15, c1964d);
        }
        if (this.f15233G != null) {
            int D9 = this.f15255c.D("RuntimeInvisibleParameterAnnotations");
            C1962b[] c1962bArr2 = this.f15233G;
            int i16 = this.f15232F;
            if (i16 == 0) {
                i16 = c1962bArr2.length;
            }
            C1962b.m(D9, c1962bArr2, i16, c1964d);
        }
        if (this.f15236J != null) {
            C1964d i17 = c1964d.k(this.f15255c.D("AnnotationDefault")).i(this.f15236J.f15102b);
            C1964d c1964d13 = this.f15236J;
            i17.h(c1964d13.f15101a, 0, c1964d13.f15102b);
        }
        if (this.f15238L != null) {
            C1964d g8 = c1964d.k(this.f15255c.D("MethodParameters")).i(this.f15238L.f15102b + 1).g(this.f15237K);
            C1964d c1964d14 = this.f15238L;
            g8.h(c1964d14.f15101a, 0, c1964d14.f15102b);
        }
        C1963c c1963c4 = this.f15239M;
        if (c1963c4 != null) {
            c1963c4.g(this.f15255c, c1964d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i8, int i9) {
        this.f15253a0 = i8 + 6;
        this.f15254b0 = i9 - 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i8, int i9) {
        this.f15249W[i8] = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        if (this.f15248V != null) {
            if (this.f15273u == null) {
                this.f15273u = new C1964d();
            }
            P();
            this.f15272t++;
        }
        this.f15248V = this.f15249W;
        this.f15249W = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int V(int i8, int i9, int i10) {
        int i11 = i9 + 3 + i10;
        int[] iArr = this.f15249W;
        if (iArr == null || iArr.length < i11) {
            this.f15249W = new int[i11];
        }
        int[] iArr2 = this.f15249W;
        iArr2[0] = i8;
        iArr2[1] = i9;
        iArr2[2] = i10;
        return 3;
    }

    @Override // b2.u
    public void a(int i8, boolean z8) {
        if (z8) {
            this.f15230D = i8;
        } else {
            this.f15232F = i8;
        }
    }

    @Override // b2.u
    public AbstractC1961a b(String str, boolean z8) {
        if (z8) {
            C1962b j8 = C1962b.j(this.f15255c, str, this.f15228B);
            this.f15228B = j8;
            return j8;
        }
        C1962b j9 = C1962b.j(this.f15255c, str, this.f15229C);
        this.f15229C = j9;
        return j9;
    }

    @Override // b2.u
    public AbstractC1961a c() {
        C1964d c1964d = new C1964d();
        this.f15236J = c1964d;
        return new C1962b(this.f15255c, false, c1964d, null);
    }

    @Override // b2.u
    public void d(C1963c c1963c) {
        if (c1963c.e()) {
            c1963c.f15098c = this.f15276x;
            this.f15276x = c1963c;
        } else {
            c1963c.f15098c = this.f15239M;
            this.f15239M = c1963c;
        }
    }

    @Override // b2.u
    public void g(int i8, String str, String str2, String str3) {
        int i9;
        int i10;
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B j8 = this.f15255c.j(str, str2, str3);
        this.f15263k.e(i8, j8.f15051a);
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i11 = this.f15240N;
            int i12 = 0;
            if (i11 != 4 && i11 != 3) {
                char charAt = str3.charAt(0);
                int i13 = -2;
                int i14 = 1;
                switch (i8) {
                    case 178:
                        int i15 = this.f15244R;
                        if (charAt == 'D' || charAt == 'J') {
                            i14 = 2;
                        }
                        i9 = i15 + i14;
                        break;
                    case 179:
                        i10 = this.f15244R;
                        if (charAt != 'D' && charAt != 'J') {
                            i13 = -1;
                        }
                        i9 = i10 + i13;
                        break;
                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                        int i16 = this.f15244R;
                        if (charAt == 'D' || charAt == 'J') {
                            i12 = 1;
                        }
                        i9 = i16 + i12;
                        break;
                    default:
                        i10 = this.f15244R;
                        if (charAt == 'D' || charAt == 'J') {
                            i13 = -3;
                        }
                        i9 = i10 + i13;
                        break;
                }
                if (i9 > this.f15245S) {
                    this.f15245S = i9;
                }
                this.f15244R = i9;
                return;
            }
            sVar.f15216j.d(i8, 0, j8, this.f15255c);
        }
    }

    @Override // b2.u
    public void h(int i8, int i9, Object[] objArr, int i10, Object[] objArr2) {
        int i11;
        int i12 = this.f15240N;
        if (i12 == 4) {
            return;
        }
        if (i12 == 3) {
            s sVar = this.f15243Q;
            p pVar = sVar.f15216j;
            if (pVar == null) {
                sVar.f15216j = new l(sVar);
                this.f15243Q.f15216j.u(this.f15255c, this.f15256d, this.f15260h, i9);
                this.f15243Q.f15216j.a(this);
            } else {
                if (i8 == -1) {
                    pVar.t(this.f15255c, i9, objArr, i10, objArr2);
                }
                this.f15243Q.f15216j.a(this);
            }
        } else if (i8 == -1) {
            if (this.f15248V == null) {
                int c8 = C1960D.c(this.f15260h) >> 2;
                p pVar2 = new p(new s());
                pVar2.u(this.f15255c, this.f15256d, this.f15260h, c8);
                pVar2.a(this);
            }
            this.f15246T = i9;
            int V7 = V(this.f15263k.f15102b, i9, i10);
            int i13 = 0;
            while (i13 < i9) {
                this.f15249W[V7] = p.e(this.f15255c, objArr[i13]);
                i13++;
                V7++;
            }
            int i14 = 0;
            while (i14 < i10) {
                this.f15249W[V7] = p.e(this.f15255c, objArr2[i14]);
                i14++;
                V7++;
            }
            U();
        } else if (this.f15255c.R() >= 50) {
            if (this.f15273u == null) {
                this.f15273u = new C1964d();
                i11 = this.f15263k.f15102b;
            } else {
                i11 = (this.f15263k.f15102b - this.f15247U) - 1;
                if (i11 < 0) {
                    if (i8 == 3) {
                        return;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                if (i11 < 64) {
                                    this.f15273u.g(i11 + 64);
                                } else {
                                    this.f15273u.g(247).k(i11);
                                }
                                Q(objArr2[0]);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (i11 < 64) {
                            this.f15273u.g(i11);
                        } else {
                            this.f15273u.g(251).k(i11);
                        }
                    } else {
                        this.f15246T -= i9;
                        this.f15273u.g(251 - i9).k(i11);
                    }
                } else {
                    this.f15246T += i9;
                    this.f15273u.g(i9 + 251).k(i11);
                    for (int i15 = 0; i15 < i9; i15++) {
                        Q(objArr[i15]);
                    }
                }
            } else {
                this.f15246T = i9;
                this.f15273u.g(255).k(i11).k(i9);
                for (int i16 = 0; i16 < i9; i16++) {
                    Q(objArr[i16]);
                }
                this.f15273u.k(i10);
                for (int i17 = 0; i17 < i10; i17++) {
                    Q(objArr2[i17]);
                }
            }
            this.f15247U = this.f15263k.f15102b;
            this.f15272t++;
        } else {
            throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
        }
        if (this.f15240N == 2) {
            this.f15244R = i10;
            for (int i18 = 0; i18 < i10; i18++) {
                Object obj = objArr2[i18];
                if (obj == y.f15302e || obj == y.f15301d) {
                    this.f15244R++;
                }
            }
            int i19 = this.f15244R;
            if (i19 > this.f15245S) {
                this.f15245S = i19;
            }
        }
        this.f15261i = Math.max(this.f15261i, i10);
        this.f15262j = Math.max(this.f15262j, this.f15246T);
    }

    @Override // b2.u
    public void i(int i8, int i9) {
        int i10;
        int i11;
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        if (i8 <= 255 && i9 <= 127 && i9 >= -128) {
            c1964d.g(132).c(i8, i9);
        } else {
            c1964d.g(196).e(132, i8).k(i9);
        }
        s sVar = this.f15243Q;
        if (sVar != null && ((i11 = this.f15240N) == 4 || i11 == 3)) {
            sVar.f15216j.d(132, i8, null, null);
        }
        if (this.f15240N != 0 && (i10 = i8 + 1) > this.f15262j) {
            this.f15262j = i10;
        }
    }

    @Override // b2.u
    public void j(int i8) {
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        c1964d.g(i8);
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i9 = this.f15240N;
            if (i9 != 4 && i9 != 3) {
                int i10 = this.f15244R + f15226c0[i8];
                if (i10 > this.f15245S) {
                    this.f15245S = i10;
                }
                this.f15244R = i10;
            } else {
                sVar.f15216j.d(i8, 0, null, null);
            }
            if ((i8 >= 172 && i8 <= 177) || i8 == 191) {
                L();
            }
        }
    }

    @Override // b2.u
    public AbstractC1961a k(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15255c, (i8 & (-16776961)) | (this.f15252Z << 8), e8, str, this.f15274v);
            this.f15274v = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15255c, (i8 & (-16776961)) | (this.f15252Z << 8), e8, str, this.f15275w);
        this.f15275w = i10;
        return i10;
    }

    @Override // b2.u
    public void l(int i8, int i9) {
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        if (i8 == 17) {
            c1964d.e(i8, i9);
        } else {
            c1964d.c(i8, i9);
        }
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i10 = this.f15240N;
            if (i10 != 4 && i10 != 3) {
                if (i8 != 188) {
                    int i11 = this.f15244R + 1;
                    if (i11 > this.f15245S) {
                        this.f15245S = i11;
                    }
                    this.f15244R = i11;
                    return;
                }
                return;
            }
            sVar.f15216j.d(i8, i9, null, null);
        }
    }

    @Override // b2.u
    public void m(String str, String str2, q qVar, Object... objArr) {
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B o8 = this.f15255c.o(str, str2, qVar, objArr);
        this.f15263k.e(186, o8.f15051a);
        this.f15263k.k(0);
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i8 = this.f15240N;
            if (i8 != 4 && i8 != 3) {
                int a8 = o8.a();
                int i9 = this.f15244R + ((a8 & 3) - (a8 >> 2)) + 1;
                if (i9 > this.f15245S) {
                    this.f15245S = i9;
                }
                this.f15244R = i9;
                return;
            }
            sVar.f15216j.d(186, 0, o8, this.f15255c);
        }
    }

    @Override // b2.u
    public void n(int i8, s sVar) {
        int i9;
        boolean z8;
        int i10;
        C1964d c1964d = this.f15263k;
        int i11 = c1964d.f15102b;
        this.f15252Z = i11;
        if (i8 >= 200) {
            i9 = i8 - 33;
        } else {
            i9 = i8;
        }
        if ((sVar.f15207a & 4) != 0 && sVar.f15210d - i11 < -32768) {
            if (i9 == 167) {
                c1964d.g(200);
            } else if (i9 == 168) {
                c1964d.g(ComposerKt.providerKey);
            } else {
                if (i9 >= 198) {
                    i10 = i9 ^ 1;
                } else {
                    i10 = ((i9 + 1) ^ 1) - 1;
                }
                c1964d.g(i10);
                this.f15263k.k(8);
                this.f15263k.g(220);
                this.f15251Y = true;
                z8 = true;
                C1964d c1964d2 = this.f15263k;
                sVar.h(c1964d2, c1964d2.f15102b - 1, true);
            }
            z8 = false;
            C1964d c1964d22 = this.f15263k;
            sVar.h(c1964d22, c1964d22.f15102b - 1, true);
        } else {
            if (i9 != i8) {
                c1964d.g(i8);
                C1964d c1964d3 = this.f15263k;
                sVar.h(c1964d3, c1964d3.f15102b - 1, true);
            } else {
                c1964d.g(i9);
                C1964d c1964d4 = this.f15263k;
                sVar.h(c1964d4, c1964d4.f15102b - 1, false);
            }
            z8 = false;
        }
        s sVar2 = this.f15243Q;
        if (sVar2 != null) {
            int i12 = this.f15240N;
            s sVar3 = null;
            if (i12 == 4) {
                sVar2.f15216j.d(i9, 0, null, null);
                s e8 = sVar.e();
                e8.f15207a = (short) (e8.f15207a | 2);
                F(0, sVar);
                if (i9 != 167) {
                    sVar3 = new s();
                }
            } else if (i12 == 3) {
                sVar2.f15216j.d(i9, 0, null, null);
            } else if (i12 == 2) {
                this.f15244R += f15226c0[i9];
            } else if (i9 == 168) {
                short s8 = sVar.f15207a;
                if ((s8 & 32) == 0) {
                    sVar.f15207a = (short) (s8 | 32);
                    this.f15250X = true;
                }
                sVar2.f15207a = (short) (sVar2.f15207a | 16);
                F(this.f15244R + 1, sVar);
                sVar3 = new s();
            } else {
                int i13 = this.f15244R + f15226c0[i9];
                this.f15244R = i13;
                F(i13, sVar);
            }
            if (sVar3 != null) {
                if (z8) {
                    sVar3.f15207a = (short) (sVar3.f15207a | 2);
                }
                o(sVar3);
            }
            if (i9 == 167) {
                L();
            }
        }
    }

    @Override // b2.u
    public void o(s sVar) {
        boolean z8 = this.f15251Y;
        C1964d c1964d = this.f15263k;
        this.f15251Y = z8 | sVar.i(c1964d.f15101a, c1964d.f15102b);
        short s8 = sVar.f15207a;
        if ((s8 & 1) != 0) {
            return;
        }
        int i8 = this.f15240N;
        if (i8 == 4) {
            s sVar2 = this.f15243Q;
            if (sVar2 != null) {
                if (sVar.f15210d == sVar2.f15210d) {
                    sVar2.f15207a = (short) ((s8 & 2) | sVar2.f15207a);
                    sVar.f15216j = sVar2.f15216j;
                    return;
                }
                F(0, sVar);
            }
            s sVar3 = this.f15242P;
            if (sVar3 != null) {
                if (sVar.f15210d == sVar3.f15210d) {
                    sVar3.f15207a = (short) (sVar3.f15207a | (sVar.f15207a & 2));
                    sVar.f15216j = sVar3.f15216j;
                    this.f15243Q = sVar3;
                    return;
                }
                sVar3.f15217k = sVar;
            }
            this.f15242P = sVar;
            this.f15243Q = sVar;
            sVar.f15216j = new p(sVar);
            return;
        }
        if (i8 == 3) {
            s sVar4 = this.f15243Q;
            if (sVar4 == null) {
                this.f15243Q = sVar;
                return;
            } else {
                sVar4.f15216j.f15186a = sVar;
                return;
            }
        }
        if (i8 == 1) {
            s sVar5 = this.f15243Q;
            if (sVar5 != null) {
                sVar5.f15214h = (short) this.f15245S;
                F(this.f15244R, sVar);
            }
            this.f15243Q = sVar;
            this.f15244R = 0;
            this.f15245S = 0;
            s sVar6 = this.f15242P;
            if (sVar6 != null) {
                sVar6.f15217k = sVar;
            }
            this.f15242P = sVar;
            return;
        }
        if (i8 == 2 && this.f15243Q == null) {
            this.f15243Q = sVar;
        }
    }

    @Override // b2.u
    public void p(Object obj) {
        boolean z8;
        char charAt;
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B d8 = this.f15255c.d(obj);
        int i8 = d8.f15051a;
        int i9 = d8.f15052b;
        int i10 = 1;
        if (i9 != 5 && i9 != 6 && (i9 != 17 || ((charAt = d8.f15055e.charAt(0)) != 'J' && charAt != 'D'))) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            this.f15263k.e(20, i8);
        } else if (i8 >= 256) {
            this.f15263k.e(19, i8);
        } else {
            this.f15263k.c(18, i8);
        }
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i11 = this.f15240N;
            if (i11 != 4 && i11 != 3) {
                int i12 = this.f15244R;
                if (z8) {
                    i10 = 2;
                }
                int i13 = i12 + i10;
                if (i13 > this.f15245S) {
                    this.f15245S = i13;
                }
                this.f15244R = i13;
                return;
            }
            sVar.f15216j.d(18, 0, d8, this.f15255c);
        }
    }

    @Override // b2.u
    public void q(int i8, s sVar) {
        if (this.f15267o == null) {
            this.f15267o = new C1964d();
        }
        this.f15266n++;
        this.f15267o.k(sVar.f15210d);
        this.f15267o.k(i8);
    }

    @Override // b2.u
    public void r(String str, String str2, String str3, s sVar, s sVar2, int i8) {
        int i9 = 1;
        if (str3 != null) {
            if (this.f15271s == null) {
                this.f15271s = new C1964d();
            }
            this.f15270r++;
            this.f15271s.k(sVar.f15210d).k(sVar2.f15210d - sVar.f15210d).k(this.f15255c.D(str)).k(this.f15255c.D(str3)).k(i8);
        }
        if (this.f15269q == null) {
            this.f15269q = new C1964d();
        }
        this.f15268p++;
        this.f15269q.k(sVar.f15210d).k(sVar2.f15210d - sVar.f15210d).k(this.f15255c.D(str)).k(this.f15255c.D(str2)).k(i8);
        if (this.f15240N != 0) {
            char charAt = str2.charAt(0);
            if (charAt == 'J' || charAt == 'D') {
                i9 = 2;
            }
            int i10 = i8 + i9;
            if (i10 > this.f15262j) {
                this.f15262j = i10;
            }
        }
    }

    @Override // b2.u
    public AbstractC1961a s(int i8, E e8, s[] sVarArr, s[] sVarArr2, int[] iArr, String str, boolean z8) {
        C1964d c1964d = new C1964d();
        c1964d.g(i8 >>> 24).k(sVarArr.length);
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            c1964d.k(sVarArr[i9].f15210d).k(sVarArr2[i9].f15210d - sVarArr[i9].f15210d).k(iArr[i9]);
        }
        E.d(e8, c1964d);
        c1964d.k(this.f15255c.D(str)).k(0);
        if (z8) {
            C1962b c1962b = new C1962b(this.f15255c, true, c1964d, this.f15274v);
            this.f15274v = c1962b;
            return c1962b;
        }
        C1962b c1962b2 = new C1962b(this.f15255c, true, c1964d, this.f15275w);
        this.f15275w = c1962b2;
        return c1962b2;
    }

    @Override // b2.u
    public void t(s sVar, int[] iArr, s[] sVarArr) {
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        c1964d.g(171).h(null, 0, (4 - (this.f15263k.f15102b % 4)) % 4);
        sVar.h(this.f15263k, this.f15252Z, true);
        this.f15263k.i(sVarArr.length);
        for (int i8 = 0; i8 < sVarArr.length; i8++) {
            this.f15263k.i(iArr[i8]);
            sVarArr[i8].h(this.f15263k, this.f15252Z, true);
        }
        W(sVar, sVarArr);
    }

    @Override // b2.u
    public void u(int i8, int i9) {
        int i10 = this.f15240N;
        if (i10 == 4) {
            I();
            return;
        }
        if (i10 == 1) {
            J();
        } else if (i10 == 2) {
            this.f15261i = this.f15245S;
        } else {
            this.f15261i = i8;
            this.f15262j = i9;
        }
    }

    @Override // b2.u
    public void v(int i8, String str, String str2, String str3, boolean z8) {
        int i9;
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B x8 = this.f15255c.x(str, str2, str3, z8);
        if (i8 == 185) {
            this.f15263k.e(185, x8.f15051a).c(x8.a() >> 2, 0);
        } else {
            this.f15263k.e(i8, x8.f15051a);
        }
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i10 = this.f15240N;
            if (i10 != 4 && i10 != 3) {
                int a8 = x8.a();
                int i11 = (a8 & 3) - (a8 >> 2);
                if (i8 == 184) {
                    i9 = this.f15244R + i11 + 1;
                } else {
                    i9 = this.f15244R + i11;
                }
                if (i9 > this.f15245S) {
                    this.f15245S = i9;
                }
                this.f15244R = i9;
                return;
            }
            sVar.f15216j.d(i8, 0, x8, this.f15255c);
        }
    }

    @Override // b2.u
    public void w(String str, int i8) {
        this.f15252Z = this.f15263k.f15102b;
        AbstractC1958B e8 = this.f15255c.e(str);
        this.f15263k.e(197, e8.f15051a).g(i8);
        s sVar = this.f15243Q;
        if (sVar != null) {
            int i9 = this.f15240N;
            if (i9 != 4 && i9 != 3) {
                this.f15244R += 1 - i8;
            } else {
                sVar.f15216j.d(197, i8, e8, this.f15255c);
            }
        }
    }

    @Override // b2.u
    public void x(String str, int i8) {
        int D8;
        if (this.f15238L == null) {
            this.f15238L = new C1964d();
        }
        this.f15237K++;
        C1964d c1964d = this.f15238L;
        if (str == null) {
            D8 = 0;
        } else {
            D8 = this.f15255c.D(str);
        }
        c1964d.k(D8).k(i8);
    }

    @Override // b2.u
    public AbstractC1961a y(int i8, String str, boolean z8) {
        if (z8) {
            if (this.f15231E == null) {
                this.f15231E = new C1962b[C1960D.b(this.f15260h).length];
            }
            C1962b[] c1962bArr = this.f15231E;
            C1962b j8 = C1962b.j(this.f15255c, str, c1962bArr[i8]);
            c1962bArr[i8] = j8;
            return j8;
        }
        if (this.f15233G == null) {
            this.f15233G = new C1962b[C1960D.b(this.f15260h).length];
        }
        C1962b[] c1962bArr2 = this.f15233G;
        C1962b j9 = C1962b.j(this.f15255c, str, c1962bArr2[i8]);
        c1962bArr2[i8] = j9;
        return j9;
    }

    @Override // b2.u
    public void z(int i8, int i9, s sVar, s... sVarArr) {
        C1964d c1964d = this.f15263k;
        this.f15252Z = c1964d.f15102b;
        c1964d.g(170).h(null, 0, (4 - (this.f15263k.f15102b % 4)) % 4);
        sVar.h(this.f15263k, this.f15252Z, true);
        this.f15263k.i(i8).i(i9);
        for (s sVar2 : sVarArr) {
            sVar2.h(this.f15263k, this.f15252Z, true);
        }
        W(sVar, sVarArr);
    }

    @Override // b2.u
    public void e() {
    }

    @Override // b2.u
    public void f() {
    }
}
