package p;

import java.util.ArrayList;
import p.d;
import t3.b0;

/* loaded from: classes.dex */
public class e {

    /* renamed from: v0, reason: collision with root package name */
    public static float f8640v0 = 0.5f;
    d I;
    public d[] J;
    protected ArrayList K;
    private boolean[] L;
    public b[] M;
    public e N;
    int O;
    int P;
    public float Q;
    protected int R;
    protected int S;
    protected int T;
    int U;
    int V;
    protected int W;
    protected int X;
    int Y;
    protected int Z;

    /* renamed from: a0, reason: collision with root package name */
    protected int f8642a0;

    /* renamed from: b0, reason: collision with root package name */
    float f8644b0;

    /* renamed from: c, reason: collision with root package name */
    public q.c f8645c;

    /* renamed from: c0, reason: collision with root package name */
    float f8646c0;

    /* renamed from: d, reason: collision with root package name */
    public q.c f8647d;

    /* renamed from: d0, reason: collision with root package name */
    private Object f8648d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f8650e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f8652f0;

    /* renamed from: g0, reason: collision with root package name */
    private String f8654g0;

    /* renamed from: h0, reason: collision with root package name */
    private String f8656h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f8658i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f8660j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f8662k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f8664l0;

    /* renamed from: m0, reason: collision with root package name */
    int f8666m0;

    /* renamed from: n0, reason: collision with root package name */
    int f8668n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f8670o0;

    /* renamed from: p0, reason: collision with root package name */
    boolean f8672p0;

    /* renamed from: q0, reason: collision with root package name */
    public float[] f8674q0;

    /* renamed from: r0, reason: collision with root package name */
    protected e[] f8676r0;

    /* renamed from: s0, reason: collision with root package name */
    protected e[] f8678s0;

    /* renamed from: t0, reason: collision with root package name */
    e f8680t0;

    /* renamed from: u0, reason: collision with root package name */
    e f8682u0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8687z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8641a = false;

    /* renamed from: b, reason: collision with root package name */
    public q.m[] f8643b = new q.m[2];

    /* renamed from: e, reason: collision with root package name */
    public q.j f8649e = new q.j(this);

    /* renamed from: f, reason: collision with root package name */
    public q.l f8651f = new q.l(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f8653g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    public int[] f8655h = {0, 0, 0, 0};

    /* renamed from: i, reason: collision with root package name */
    boolean f8657i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f8659j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f8661k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f8663l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8665m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int[] f8667n = new int[2];

    /* renamed from: o, reason: collision with root package name */
    public int f8669o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f8671p = 0;

    /* renamed from: q, reason: collision with root package name */
    public float f8673q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f8675r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f8677s = 0;

    /* renamed from: t, reason: collision with root package name */
    public float f8679t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    int f8681u = -1;

    /* renamed from: v, reason: collision with root package name */
    float f8683v = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    private int[] f8684w = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: x, reason: collision with root package name */
    private float f8685x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8686y = false;
    private boolean A = false;
    public d B = new d(this, d.b.LEFT);
    public d C = new d(this, d.b.TOP);
    public d D = new d(this, d.b.RIGHT);
    public d E = new d(this, d.b.BOTTOM);
    d F = new d(this, d.b.BASELINE);
    d G = new d(this, d.b.CENTER_X);
    d H = new d(this, d.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8688a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8689b;

        static {
            int[] iArr = new int[b.values().length];
            f8689b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8689b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8689b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8689b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f8688a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8688a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8688a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8688a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8688a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8688a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8688a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8688a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8688a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.I = dVar;
        this.J = new d[]{this.B, this.D, this.C, this.E, this.F, dVar};
        this.K = new ArrayList();
        this.L = new boolean[2];
        b bVar = b.FIXED;
        this.M = new b[]{bVar, bVar};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f6 = f8640v0;
        this.f8644b0 = f6;
        this.f8646c0 = f6;
        this.f8650e0 = 0;
        this.f8652f0 = 0;
        this.f8654g0 = null;
        this.f8656h0 = null;
        this.f8662k0 = false;
        this.f8664l0 = false;
        this.f8666m0 = 0;
        this.f8668n0 = 0;
        this.f8674q0 = new float[]{-1.0f, -1.0f};
        this.f8676r0 = new e[]{null, null};
        this.f8678s0 = new e[]{null, null};
        this.f8680t0 = null;
        this.f8682u0 = null;
        d();
    }

    private boolean U(int i6) {
        d dVar;
        d dVar2;
        int i7 = i6 * 2;
        d[] dVarArr = this.J;
        d dVar3 = dVarArr[i7];
        d dVar4 = dVar3.f8625d;
        return (dVar4 == null || dVar4.f8625d == dVar3 || (dVar2 = (dVar = dVarArr[i7 + 1]).f8625d) == null || dVar2.f8625d != dVar) ? false : true;
    }

    private void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0433, code lost:
    
        if (r1[r22] == r4) goto L297;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0313 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(o.d r32, boolean r33, boolean r34, boolean r35, boolean r36, o.i r37, o.i r38, p.e.b r39, boolean r40, p.d r41, p.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.h(o.d, boolean, boolean, boolean, boolean, o.i, o.i, p.e$b, boolean, p.d, p.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A(int i6) {
        if (i6 == 0) {
            return P();
        }
        if (i6 == 1) {
            return v();
        }
        return 0;
    }

    public void A0(b bVar) {
        this.M[1] = bVar;
    }

    public int B() {
        return this.f8684w[1];
    }

    public void B0(int i6, int i7, int i8, float f6) {
        this.f8665m = i6;
        this.f8675r = i7;
        if (i8 == Integer.MAX_VALUE) {
            i8 = 0;
        }
        this.f8677s = i8;
        this.f8679t = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i6 != 0) {
            return;
        }
        this.f8665m = 2;
    }

    public int C() {
        return this.f8684w[0];
    }

    public void C0(float f6) {
        this.f8674q0[1] = f6;
    }

    public int D() {
        return this.f8642a0;
    }

    public void D0(int i6) {
        this.f8652f0 = i6;
    }

    public int E() {
        return this.Z;
    }

    public void E0(int i6) {
        this.O = i6;
        int i7 = this.Z;
        if (i6 < i7) {
            this.O = i7;
        }
    }

    public e F(int i6) {
        d dVar;
        d dVar2;
        if (i6 != 0) {
            if (i6 == 1 && (dVar2 = (dVar = this.E).f8625d) != null && dVar2.f8625d == dVar) {
                return dVar2.f8623b;
            }
            return null;
        }
        d dVar3 = this.D;
        d dVar4 = dVar3.f8625d;
        if (dVar4 == null || dVar4.f8625d != dVar3) {
            return null;
        }
        return dVar4.f8623b;
    }

    public void F0(int i6) {
        this.S = i6;
    }

    public e G() {
        return this.N;
    }

    public void G0(int i6) {
        this.T = i6;
    }

    public e H(int i6) {
        d dVar;
        d dVar2;
        if (i6 != 0) {
            if (i6 == 1 && (dVar2 = (dVar = this.C).f8625d) != null && dVar2.f8625d == dVar) {
                return dVar2.f8623b;
            }
            return null;
        }
        d dVar3 = this.B;
        d dVar4 = dVar3.f8625d;
        if (dVar4 == null || dVar4.f8625d != dVar3) {
            return null;
        }
        return dVar4.f8623b;
    }

    public void H0(boolean z5, boolean z6, boolean z7, boolean z8) {
        if (this.f8681u == -1) {
            if (z7 && !z8) {
                this.f8681u = 0;
            } else if (!z7 && z8) {
                this.f8681u = 1;
                if (this.R == -1) {
                    this.f8683v = 1.0f / this.f8683v;
                }
            }
        }
        if (this.f8681u == 0 && (!this.C.j() || !this.E.j())) {
            this.f8681u = 1;
        } else if (this.f8681u == 1 && (!this.B.j() || !this.D.j())) {
            this.f8681u = 0;
        }
        if (this.f8681u == -1 && (!this.C.j() || !this.E.j() || !this.B.j() || !this.D.j())) {
            if (this.C.j() && this.E.j()) {
                this.f8681u = 0;
            } else if (this.B.j() && this.D.j()) {
                this.f8683v = 1.0f / this.f8683v;
                this.f8681u = 1;
            }
        }
        if (this.f8681u == -1) {
            int i6 = this.f8669o;
            if (i6 > 0 && this.f8675r == 0) {
                this.f8681u = 0;
            } else {
                if (i6 != 0 || this.f8675r <= 0) {
                    return;
                }
                this.f8683v = 1.0f / this.f8683v;
                this.f8681u = 1;
            }
        }
    }

    public int I() {
        return Q() + this.O;
    }

    public void I0(boolean z5, boolean z6) {
        int i6;
        int i7;
        boolean k6 = z5 & this.f8649e.k();
        boolean k7 = z6 & this.f8651f.k();
        q.j jVar = this.f8649e;
        int i8 = jVar.f8960h.f8924g;
        q.l lVar = this.f8651f;
        int i9 = lVar.f8960h.f8924g;
        int i10 = jVar.f8961i.f8924g;
        int i11 = lVar.f8961i.f8924g;
        int i12 = i11 - i9;
        if (i10 - i8 < 0 || i12 < 0 || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
            i10 = 0;
            i8 = 0;
            i11 = 0;
            i9 = 0;
        }
        int i13 = i10 - i8;
        int i14 = i11 - i9;
        if (k6) {
            this.S = i8;
        }
        if (k7) {
            this.T = i9;
        }
        if (this.f8652f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if (k6) {
            if (this.M[0] == b.FIXED && i13 < (i7 = this.O)) {
                i13 = i7;
            }
            this.O = i13;
            int i15 = this.Z;
            if (i13 < i15) {
                this.O = i15;
            }
        }
        if (k7) {
            if (this.M[1] == b.FIXED && i14 < (i6 = this.P)) {
                i14 = i6;
            }
            this.P = i14;
            int i16 = this.f8642a0;
            if (i14 < i16) {
                this.P = i16;
            }
        }
    }

    public q.m J(int i6) {
        if (i6 == 0) {
            return this.f8649e;
        }
        if (i6 == 1) {
            return this.f8651f;
        }
        return null;
    }

    public void J0(o.d dVar) {
        int x5 = dVar.x(this.B);
        int x6 = dVar.x(this.C);
        int x7 = dVar.x(this.D);
        int x8 = dVar.x(this.E);
        q.j jVar = this.f8649e;
        q.f fVar = jVar.f8960h;
        if (fVar.f8927j) {
            q.f fVar2 = jVar.f8961i;
            if (fVar2.f8927j) {
                x5 = fVar.f8924g;
                x7 = fVar2.f8924g;
            }
        }
        q.l lVar = this.f8651f;
        q.f fVar3 = lVar.f8960h;
        if (fVar3.f8927j) {
            q.f fVar4 = lVar.f8961i;
            if (fVar4.f8927j) {
                x6 = fVar3.f8924g;
                x8 = fVar4.f8924g;
            }
        }
        int i6 = x8 - x6;
        if (x7 - x5 < 0 || i6 < 0 || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE || x6 == Integer.MIN_VALUE || x6 == Integer.MAX_VALUE || x7 == Integer.MIN_VALUE || x7 == Integer.MAX_VALUE || x8 == Integer.MIN_VALUE || x8 == Integer.MAX_VALUE) {
            x5 = 0;
            x8 = 0;
            x6 = 0;
            x7 = 0;
        }
        f0(x5, x6, x7, x8);
    }

    public float K() {
        return this.f8646c0;
    }

    public int L() {
        return this.f8668n0;
    }

    public b M() {
        return this.M[1];
    }

    public int N() {
        int i6 = this.B != null ? 0 + this.C.f8626e : 0;
        return this.D != null ? i6 + this.E.f8626e : i6;
    }

    public int O() {
        return this.f8652f0;
    }

    public int P() {
        if (this.f8652f0 == 8) {
            return 0;
        }
        return this.O;
    }

    public int Q() {
        e eVar = this.N;
        return (eVar == null || !(eVar instanceof f)) ? this.S : ((f) eVar).C0 + this.S;
    }

    public int R() {
        e eVar = this.N;
        return (eVar == null || !(eVar instanceof f)) ? this.T : ((f) eVar).D0 + this.T;
    }

    public boolean S() {
        return this.f8686y;
    }

    public void T(d.b bVar, e eVar, d.b bVar2, int i6, int i7) {
        m(bVar).b(eVar.m(bVar2), i6, i7, true);
    }

    public boolean V() {
        d dVar = this.B;
        d dVar2 = dVar.f8625d;
        if (dVar2 != null && dVar2.f8625d == dVar) {
            return true;
        }
        d dVar3 = this.D;
        d dVar4 = dVar3.f8625d;
        return dVar4 != null && dVar4.f8625d == dVar3;
    }

    public boolean W() {
        return this.f8687z;
    }

    public boolean X() {
        d dVar = this.C;
        d dVar2 = dVar.f8625d;
        if (dVar2 != null && dVar2.f8625d == dVar) {
            return true;
        }
        d dVar3 = this.E;
        d dVar4 = dVar3.f8625d;
        return dVar4 != null && dVar4.f8625d == dVar3;
    }

    public void Y() {
        this.B.l();
        this.C.l();
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.N = null;
        this.f8685x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f8642a0 = 0;
        float f6 = f8640v0;
        this.f8644b0 = f6;
        this.f8646c0 = f6;
        b[] bVarArr = this.M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f8648d0 = null;
        this.f8650e0 = 0;
        this.f8652f0 = 0;
        this.f8656h0 = null;
        this.f8658i0 = false;
        this.f8660j0 = false;
        this.f8666m0 = 0;
        this.f8668n0 = 0;
        this.f8670o0 = false;
        this.f8672p0 = false;
        float[] fArr = this.f8674q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8659j = -1;
        this.f8661k = -1;
        int[] iArr = this.f8684w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f8663l = 0;
        this.f8665m = 0;
        this.f8673q = 1.0f;
        this.f8679t = 1.0f;
        this.f8671p = Integer.MAX_VALUE;
        this.f8677s = Integer.MAX_VALUE;
        this.f8669o = 0;
        this.f8675r = 0;
        this.f8657i = false;
        this.f8681u = -1;
        this.f8683v = 1.0f;
        this.f8662k0 = false;
        this.f8664l0 = false;
        boolean[] zArr = this.f8653g;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void Z() {
        e G = G();
        if (G != null && (G instanceof f) && ((f) G()).W0()) {
            return;
        }
        int size = this.K.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((d) this.K.get(i6)).l();
        }
    }

    public void a0(o.c cVar) {
        this.B.m(cVar);
        this.C.m(cVar);
        this.D.m(cVar);
        this.E.m(cVar);
        this.F.m(cVar);
        this.I.m(cVar);
        this.G.m(cVar);
        this.H.m(cVar);
    }

    public void b0(int i6) {
        this.Y = i6;
        this.f8686y = i6 > 0;
    }

    public void c0(Object obj) {
        this.f8648d0 = obj;
    }

    public void d0(String str) {
        this.f8654g0 = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return (this instanceof l) || (this instanceof h);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:31:0x0088). Please report as a decompilation issue!!! */
    public void e0(String str) {
        float f6;
        int i6 = 0;
        if (str == null || str.length() == 0) {
            this.Q = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i7 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i7 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f6 = Float.parseFloat(substring2);
            }
            f6 = 0.0f;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f6 = i7 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f6 = 0.0f;
        }
        i6 = (f6 > i6 ? 1 : (f6 == i6 ? 0 : -1));
        if (i6 > 0) {
            this.Q = f6;
            this.R = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(o.d r48) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.f(o.d):void");
    }

    public void f0(int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12 = i8 - i6;
        int i13 = i9 - i7;
        this.S = i6;
        this.T = i7;
        if (this.f8652f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] bVarArr = this.M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i12 < (i11 = this.O)) {
            i12 = i11;
        }
        if (bVarArr[1] == bVar2 && i13 < (i10 = this.P)) {
            i13 = i10;
        }
        this.O = i12;
        this.P = i13;
        int i14 = this.f8642a0;
        if (i13 < i14) {
            this.P = i14;
        }
        int i15 = this.Z;
        if (i12 < i15) {
            this.O = i15;
        }
    }

    public boolean g() {
        return this.f8652f0 != 8;
    }

    public void g0(boolean z5) {
        this.f8686y = z5;
    }

    public void h0(int i6) {
        this.P = i6;
        int i7 = this.f8642a0;
        if (i6 < i7) {
            this.P = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b7, code lost:
    
        if (r11.j() != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018e, code lost:
    
        if (r11.j() != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b9, code lost:
    
        r9.l();
        r11.l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(p.d.b r9, p.e r10, p.d.b r11, int r12) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.i(p.d$b, p.e, p.d$b, int):void");
    }

    public void i0(float f6) {
        this.f8644b0 = f6;
    }

    public void j(d dVar, d dVar2, int i6) {
        if (dVar.e() == this) {
            i(dVar.h(), dVar2.e(), dVar2.h(), i6);
        }
    }

    public void j0(int i6) {
        this.f8666m0 = i6;
    }

    public void k(e eVar, float f6, int i6) {
        d.b bVar = d.b.CENTER;
        T(bVar, eVar, bVar, i6, 0);
        this.f8685x = f6;
    }

    public void k0(int i6, int i7) {
        this.S = i6;
        int i8 = i7 - i6;
        this.O = i8;
        int i9 = this.Z;
        if (i8 < i9) {
            this.O = i9;
        }
    }

    public void l(o.d dVar) {
        dVar.q(this.B);
        dVar.q(this.C);
        dVar.q(this.D);
        dVar.q(this.E);
        if (this.Y > 0) {
            dVar.q(this.F);
        }
    }

    public void l0(b bVar) {
        this.M[0] = bVar;
    }

    public d m(d.b bVar) {
        switch (a.f8688a[bVar.ordinal()]) {
            case 1:
                return this.B;
            case 2:
                return this.C;
            case 3:
                return this.D;
            case 4:
                return this.E;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return this.F;
            case 6:
                return this.I;
            case 7:
                return this.G;
            case 8:
                return this.H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(int i6, int i7, int i8, float f6) {
        this.f8663l = i6;
        this.f8669o = i7;
        if (i8 == Integer.MAX_VALUE) {
            i8 = 0;
        }
        this.f8671p = i8;
        this.f8673q = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i6 != 0) {
            return;
        }
        this.f8663l = 2;
    }

    public int n() {
        return this.Y;
    }

    public void n0(float f6) {
        this.f8674q0[0] = f6;
    }

    public float o(int i6) {
        if (i6 == 0) {
            return this.f8644b0;
        }
        if (i6 == 1) {
            return this.f8646c0;
        }
        return -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o0(int i6, boolean z5) {
        this.L[i6] = z5;
    }

    public int p() {
        return R() + this.P;
    }

    public void p0(boolean z5) {
        this.f8687z = z5;
    }

    public Object q() {
        return this.f8648d0;
    }

    public void q0(boolean z5) {
        this.A = z5;
    }

    public String r() {
        return this.f8654g0;
    }

    public void r0(int i6) {
        this.f8684w[1] = i6;
    }

    public b s(int i6) {
        if (i6 == 0) {
            return y();
        }
        if (i6 == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i6) {
        this.f8684w[0] = i6;
    }

    public float t() {
        return this.Q;
    }

    public void t0(int i6) {
        if (i6 < 0) {
            i6 = 0;
        }
        this.f8642a0 = i6;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f8656h0 != null) {
            str = "type: " + this.f8656h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f8654g0 != null) {
            str2 = "id: " + this.f8654g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.S);
        sb.append(", ");
        sb.append(this.T);
        sb.append(") - (");
        sb.append(this.O);
        sb.append(" x ");
        sb.append(this.P);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.R;
    }

    public void u0(int i6) {
        if (i6 < 0) {
            i6 = 0;
        }
        this.Z = i6;
    }

    public int v() {
        if (this.f8652f0 == 8) {
            return 0;
        }
        return this.P;
    }

    public void v0(int i6, int i7) {
        this.S = i6;
        this.T = i7;
    }

    public float w() {
        return this.f8644b0;
    }

    public void w0(e eVar) {
        this.N = eVar;
    }

    public int x() {
        return this.f8666m0;
    }

    public void x0(float f6) {
        this.f8646c0 = f6;
    }

    public b y() {
        return this.M[0];
    }

    public void y0(int i6) {
        this.f8668n0 = i6;
    }

    public int z() {
        d dVar = this.B;
        int i6 = dVar != null ? 0 + dVar.f8626e : 0;
        d dVar2 = this.D;
        return dVar2 != null ? i6 + dVar2.f8626e : i6;
    }

    public void z0(int i6, int i7) {
        this.T = i6;
        int i8 = i7 - i6;
        this.P = i8;
        int i9 = this.f8642a0;
        if (i8 < i9) {
            this.P = i9;
        }
    }
}
