package c.f.b.k;

import c.f.b.k.d;
import c.f.b.k.m.n;
import c.f.b.k.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {
    public static float a = 0.5f;
    e A0;
    public int B0;
    public int C0;
    private boolean E;
    public d P;
    public d[] Q;
    protected ArrayList<d> R;
    private boolean[] S;
    public b[] T;
    public e U;
    int V;
    int W;
    public float X;
    protected int Y;
    protected int Z;
    protected int a0;
    int b0;
    int c0;

    /* renamed from: d, reason: collision with root package name */
    public c.f.b.k.m.c f2532d;
    protected int d0;

    /* renamed from: e, reason: collision with root package name */
    public c.f.b.k.m.c f2533e;
    protected int e0;
    int f0;
    protected int g0;
    protected int h0;
    float i0;
    float j0;
    private Object k0;
    private int l0;
    private int m0;
    private String n0;
    private String o0;
    boolean p0;
    boolean q0;
    boolean r0;
    int s0;
    int t0;
    boolean u0;
    boolean v0;
    public float[] w0;
    protected e[] x0;
    protected e[] y0;
    e z0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2530b = false;

    /* renamed from: c, reason: collision with root package name */
    public p[] f2531c = new p[2];

    /* renamed from: f, reason: collision with root package name */
    public c.f.b.k.m.l f2534f = null;

    /* renamed from: g, reason: collision with root package name */
    public n f2535g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f2536h = {true, true};

    /* renamed from: i, reason: collision with root package name */
    boolean f2537i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2538j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2539k = false;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = 0;
    public int[] s = new int[2];
    public int t = 0;
    public int u = 0;
    public float v = 1.0f;
    public int w = 0;
    public int x = 0;
    public float y = 1.0f;
    int z = -1;
    float A = 1.0f;
    private int[] B = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float C = 0.0f;
    private boolean D = false;
    private boolean F = false;
    private int G = 0;
    private int H = 0;
    public d I = new d(this, d.b.LEFT);
    public d J = new d(this, d.b.TOP);
    public d K = new d(this, d.b.RIGHT);
    public d L = new d(this, d.b.BOTTOM);
    public d M = new d(this, d.b.BASELINE);
    d N = new d(this, d.b.CENTER_X);
    d O = new d(this, d.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2540b;

        static {
            int[] iArr = new int[b.values().length];
            f2540b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2540b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2540b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2540b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.P = dVar;
        this.Q = new d[]{this.I, this.K, this.J, this.L, this.M, dVar};
        this.R = new ArrayList<>();
        this.S = new boolean[2];
        b bVar = b.FIXED;
        this.T = new b[]{bVar, bVar};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        float f2 = a;
        this.i0 = f2;
        this.j0 = f2;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = null;
        this.o0 = null;
        this.r0 = false;
        this.s0 = 0;
        this.t0 = 0;
        this.w0 = new float[]{-1.0f, -1.0f};
        this.x0 = new e[]{null, null};
        this.y0 = new e[]{null, null};
        this.z0 = null;
        this.A0 = null;
        this.B0 = -1;
        this.C0 = -1;
        d();
    }

    private boolean Y(int i2) {
        int i3 = i2 * 2;
        d[] dVarArr = this.Q;
        if (dVarArr[i3].f2520f != null && dVarArr[i3].f2520f.f2520f != dVarArr[i3]) {
            int i4 = i3 + 1;
            if (dVarArr[i4].f2520f != null && dVarArr[i4].f2520f.f2520f == dVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        this.R.add(this.I);
        this.R.add(this.J);
        this.R.add(this.K);
        this.R.add(this.L);
        this.R.add(this.N);
        this.R.add(this.O);
        this.R.add(this.P);
        this.R.add(this.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x051d, code lost:
    
        if (r1[r30] == r6) goto L348;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04b3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(c.f.b.d r32, boolean r33, boolean r34, boolean r35, boolean r36, c.f.b.i r37, c.f.b.i r38, c.f.b.k.e.b r39, boolean r40, c.f.b.k.d r41, c.f.b.k.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.e.i(c.f.b.d, boolean, boolean, boolean, boolean, c.f.b.i, c.f.b.i, c.f.b.k.e$b, boolean, c.f.b.k.d, c.f.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A() {
        return this.G;
    }

    public void A0(int i2, int i3, int i4, float f2) {
        this.q = i2;
        this.t = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.u = i4;
        this.v = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.q = 2;
    }

    public int B() {
        return this.H;
    }

    public void B0(float f2) {
        this.w0[0] = f2;
    }

    public int C(int i2) {
        if (i2 == 0) {
            return R();
        }
        if (i2 == 1) {
            return v();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C0(int i2, boolean z) {
        this.S[i2] = z;
    }

    public int D() {
        return this.B[1];
    }

    public void D0(boolean z) {
        this.E = z;
    }

    public int E() {
        return this.B[0];
    }

    public void E0(boolean z) {
        this.F = z;
    }

    public int F() {
        return this.h0;
    }

    public void F0(int i2, int i3) {
        this.G = i2;
        this.H = i3;
        I0(false);
    }

    public int G() {
        return this.g0;
    }

    public void G0(int i2) {
        this.B[1] = i2;
    }

    public e H(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.L).f2520f) != null && dVar2.f2520f == dVar) {
                return dVar2.f2518d;
            }
            return null;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f2520f;
        if (dVar4 == null || dVar4.f2520f != dVar3) {
            return null;
        }
        return dVar4.f2518d;
    }

    public void H0(int i2) {
        this.B[0] = i2;
    }

    public e I() {
        return this.U;
    }

    public void I0(boolean z) {
        this.f2538j = z;
    }

    public e J(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.J).f2520f) != null && dVar2.f2520f == dVar) {
                return dVar2.f2518d;
            }
            return null;
        }
        d dVar3 = this.I;
        d dVar4 = dVar3.f2520f;
        if (dVar4 == null || dVar4.f2520f != dVar3) {
            return null;
        }
        return dVar4.f2518d;
    }

    public void J0(int i2) {
        if (i2 < 0) {
            this.h0 = 0;
        } else {
            this.h0 = i2;
        }
    }

    public int K() {
        return S() + this.V;
    }

    public void K0(int i2) {
        if (i2 < 0) {
            this.g0 = 0;
        } else {
            this.g0 = i2;
        }
    }

    public p L(int i2) {
        if (i2 == 0) {
            return this.f2534f;
        }
        if (i2 == 1) {
            return this.f2535g;
        }
        return null;
    }

    public void L0(int i2, int i3) {
        this.Z = i2;
        this.a0 = i3;
    }

    public float M() {
        return this.j0;
    }

    public void M0(e eVar) {
        this.U = eVar;
    }

    public int N() {
        return this.t0;
    }

    public void N0(float f2) {
        this.j0 = f2;
    }

    public b O() {
        return this.T[1];
    }

    public void O0(int i2) {
        this.t0 = i2;
    }

    public int P() {
        int i2 = this.I != null ? 0 + this.J.f2521g : 0;
        return this.K != null ? i2 + this.L.f2521g : i2;
    }

    public void P0(int i2, int i3) {
        this.a0 = i2;
        int i4 = i3 - i2;
        this.W = i4;
        int i5 = this.h0;
        if (i4 < i5) {
            this.W = i5;
        }
    }

    public int Q() {
        return this.m0;
    }

    public void Q0(b bVar) {
        this.T[1] = bVar;
    }

    public int R() {
        if (this.m0 == 8) {
            return 0;
        }
        return this.V;
    }

    public void R0(int i2, int i3, int i4, float f2) {
        this.r = i2;
        this.w = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.x = i4;
        this.y = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.r = 2;
    }

    public int S() {
        e eVar = this.U;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).K0 + this.Z;
        }
        return this.Z;
    }

    public void S0(float f2) {
        this.w0[1] = f2;
    }

    public int T() {
        e eVar = this.U;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).L0 + this.a0;
        }
        return this.a0;
    }

    public void T0(int i2) {
        this.m0 = i2;
    }

    public boolean U() {
        return this.D;
    }

    public void U0(int i2) {
        this.V = i2;
        int i3 = this.g0;
        if (i2 < i3) {
            this.V = i3;
        }
    }

    public boolean V(int i2) {
        if (i2 == 0) {
            return (this.I.f2520f != null ? 1 : 0) + (this.K.f2520f != null ? 1 : 0) < 2;
        }
        return ((this.J.f2520f != null ? 1 : 0) + (this.L.f2520f != null ? 1 : 0)) + (this.M.f2520f != null ? 1 : 0) < 2;
    }

    public void V0(int i2) {
        this.Z = i2;
    }

    public boolean W() {
        int size = this.R.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.R.get(i2).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i2) {
        this.a0 = i2;
    }

    public void X(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        m(bVar).a(eVar.m(bVar2), i2, i3, true);
    }

    public void X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.z == -1) {
            if (z3 && !z4) {
                this.z = 0;
            } else if (!z3 && z4) {
                this.z = 1;
                if (this.Y == -1) {
                    this.A = 1.0f / this.A;
                }
            }
        }
        if (this.z == 0 && (!this.J.n() || !this.L.n())) {
            this.z = 1;
        } else if (this.z == 1 && (!this.I.n() || !this.K.n())) {
            this.z = 0;
        }
        if (this.z == -1 && (!this.J.n() || !this.L.n() || !this.I.n() || !this.K.n())) {
            if (this.J.n() && this.L.n()) {
                this.z = 0;
            } else if (this.I.n() && this.K.n()) {
                this.A = 1.0f / this.A;
                this.z = 1;
            }
        }
        if (this.z == -1) {
            int i2 = this.t;
            if (i2 > 0 && this.w == 0) {
                this.z = 0;
            } else {
                if (i2 != 0 || this.w <= 0) {
                    return;
                }
                this.A = 1.0f / this.A;
                this.z = 1;
            }
        }
    }

    public void Y0(boolean z, boolean z2) {
        int i2;
        int i3;
        boolean k2 = z & this.f2534f.k();
        boolean k3 = z2 & this.f2535g.k();
        c.f.b.k.m.l lVar = this.f2534f;
        int i4 = lVar.f2611h.f2572g;
        n nVar = this.f2535g;
        int i5 = nVar.f2611h.f2572g;
        int i6 = lVar.f2612i.f2572g;
        int i7 = nVar.f2612i.f2572g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (k2) {
            this.Z = i4;
        }
        if (k3) {
            this.a0 = i5;
        }
        if (this.m0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (k2) {
            if (this.T[0] == b.FIXED && i9 < (i3 = this.V)) {
                i9 = i3;
            }
            this.V = i9;
            int i11 = this.g0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
        if (k3) {
            if (this.T[1] == b.FIXED && i10 < (i2 = this.W)) {
                i10 = i2;
            }
            this.W = i10;
            int i12 = this.h0;
            if (i10 < i12) {
                this.W = i12;
            }
        }
    }

    public boolean Z() {
        d dVar = this.I;
        d dVar2 = dVar.f2520f;
        if (dVar2 != null && dVar2.f2520f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f2520f;
        return dVar4 != null && dVar4.f2520f == dVar3;
    }

    public void Z0(c.f.b.d dVar, boolean z) {
        n nVar;
        c.f.b.k.m.l lVar;
        int x = dVar.x(this.I);
        int x2 = dVar.x(this.J);
        int x3 = dVar.x(this.K);
        int x4 = dVar.x(this.L);
        if (z && (lVar = this.f2534f) != null) {
            c.f.b.k.m.f fVar = lVar.f2611h;
            if (fVar.f2575j) {
                c.f.b.k.m.f fVar2 = lVar.f2612i;
                if (fVar2.f2575j) {
                    x = fVar.f2572g;
                    x3 = fVar2.f2572g;
                }
            }
        }
        if (z && (nVar = this.f2535g) != null) {
            c.f.b.k.m.f fVar3 = nVar.f2611h;
            if (fVar3.f2575j) {
                c.f.b.k.m.f fVar4 = nVar.f2612i;
                if (fVar4.f2575j) {
                    x2 = fVar3.f2572g;
                    x4 = fVar4.f2572g;
                }
            }
        }
        int i2 = x4 - x2;
        if (x3 - x < 0 || i2 < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        t0(x, x2, x3, x4);
    }

    public boolean a0() {
        return this.E;
    }

    public boolean b0() {
        d dVar = this.J;
        d dVar2 = dVar.f2520f;
        if (dVar2 != null && dVar2.f2520f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f2520f;
        return dVar4 != null && dVar4.f2520f == dVar3;
    }

    public boolean c0() {
        return this.F;
    }

    public boolean d0() {
        return this.f2538j && this.m0 != 8;
    }

    public void e(f fVar, c.f.b.d dVar, HashSet<e> hashSet, int i2, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.B1(64));
        }
        if (i2 == 0) {
            HashSet<d> c2 = this.I.c();
            if (c2 != null) {
                Iterator<d> it = c2.iterator();
                while (it.hasNext()) {
                    it.next().f2518d.e(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<d> c3 = this.K.c();
            if (c3 != null) {
                Iterator<d> it2 = c3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2518d.e(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c4 = this.J.c();
        if (c4 != null) {
            Iterator<d> it3 = c4.iterator();
            while (it3.hasNext()) {
                it3.next().f2518d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> c5 = this.L.c();
        if (c5 != null) {
            Iterator<d> it4 = c5.iterator();
            while (it4.hasNext()) {
                it4.next().f2518d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> c6 = this.M.c();
        if (c6 != null) {
            Iterator<d> it5 = c6.iterator();
            while (it5.hasNext()) {
                it5.next().f2518d.e(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean e0() {
        return this.m || (this.I.m() && this.K.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        return this.n || (this.J.m() && this.L.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(c.f.b.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.e.g(c.f.b.d, boolean):void");
    }

    public boolean g0() {
        b[] bVarArr = this.T;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public boolean h() {
        return this.m0 != 8;
    }

    public void h0() {
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.P.p();
        this.U = null;
        this.C = 0.0f;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        float f2 = a;
        this.i0 = f2;
        this.j0 = f2;
        b[] bVarArr = this.T;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.o0 = null;
        this.p0 = false;
        this.q0 = false;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = false;
        this.v0 = false;
        float[] fArr = this.w0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.B;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.f2537i = false;
        this.z = -1;
        this.A = 1.0f;
        this.r0 = false;
        boolean[] zArr = this.f2536h;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2538j = true;
    }

    public void i0() {
        this.m = false;
        this.n = false;
        int size = this.R.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.R.get(i2).q();
        }
    }

    public void j(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        X(bVar, eVar, bVar, i2, 0);
        this.C = f2;
    }

    public void j0(c.f.b.c cVar) {
        this.I.r(cVar);
        this.J.r(cVar);
        this.K.r(cVar);
        this.L.r(cVar);
        this.M.r(cVar);
        this.P.r(cVar);
        this.N.r(cVar);
        this.O.r(cVar);
    }

    public void k(c.f.b.d dVar) {
        dVar.q(this.I);
        dVar.q(this.J);
        dVar.q(this.K);
        dVar.q(this.L);
        if (this.f0 > 0) {
            dVar.q(this.M);
        }
    }

    public void k0(int i2) {
        this.f0 = i2;
        this.D = i2 > 0;
    }

    public void l() {
        if (this.f2534f == null) {
            this.f2534f = new c.f.b.k.m.l(this);
        }
        if (this.f2535g == null) {
            this.f2535g = new n(this);
        }
    }

    public void l0(Object obj) {
        this.k0 = obj;
    }

    public d m(d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(String str) {
        this.n0 = str;
    }

    public int n() {
        return this.f0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:31:0x0085). Please report as a decompilation issue!!! */
    public void n0(String str) {
        float f2;
        int i2 = 0;
        if (str != null && str.length() != 0) {
            int i3 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i4 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i3 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i3 = 1;
                }
                i4 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i4, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f2 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f2 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f2 = 0.0f;
            } else {
                String substring4 = str.substring(i4);
                if (substring4.length() > 0) {
                    f2 = Float.parseFloat(substring4);
                }
                f2 = 0.0f;
            }
            i2 = (f2 > i2 ? 1 : (f2 == i2 ? 0 : -1));
            if (i2 > 0) {
                this.X = f2;
                this.Y = i3;
                return;
            }
            return;
        }
        this.X = 0.0f;
    }

    public float o(int i2) {
        if (i2 == 0) {
            return this.i0;
        }
        if (i2 == 1) {
            return this.j0;
        }
        return -1.0f;
    }

    public void o0(int i2) {
        if (this.D) {
            int i3 = i2 - this.f0;
            int i4 = this.W + i3;
            this.a0 = i3;
            this.J.s(i3);
            this.L.s(i4);
            this.M.s(i2);
            this.n = true;
        }
    }

    public int p() {
        return T() + this.W;
    }

    public void p0(int i2, int i3) {
        this.I.s(i2);
        this.K.s(i3);
        this.Z = i2;
        this.V = i3 - i2;
        this.m = true;
    }

    public Object q() {
        return this.k0;
    }

    public void q0(int i2) {
        this.I.s(i2);
        this.Z = i2;
    }

    public String r() {
        return this.n0;
    }

    public void r0(int i2) {
        this.J.s(i2);
        this.a0 = i2;
    }

    public b s(int i2) {
        if (i2 == 0) {
            return y();
        }
        if (i2 == 1) {
            return O();
        }
        return null;
    }

    public void s0(int i2, int i3) {
        this.J.s(i2);
        this.L.s(i3);
        this.a0 = i2;
        this.W = i3 - i2;
        if (this.D) {
            this.M.s(i2 + this.f0);
        }
        this.n = true;
    }

    public float t() {
        return this.X;
    }

    public void t0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.Z = i2;
        this.a0 = i3;
        if (this.m0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        b[] bVarArr = this.T;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.V)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.W)) {
            i9 = i6;
        }
        this.V = i8;
        this.W = i9;
        int i10 = this.h0;
        if (i9 < i10) {
            this.W = i10;
        }
        int i11 = this.g0;
        if (i8 < i11) {
            this.V = i11;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.o0;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 != null) {
            str = "type: " + this.o0 + " ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (this.n0 != null) {
            str3 = "id: " + this.n0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(this.a0);
        sb.append(") - (");
        sb.append(this.V);
        sb.append(" x ");
        sb.append(this.W);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.Y;
    }

    public void u0(boolean z) {
        this.D = z;
    }

    public int v() {
        if (this.m0 == 8) {
            return 0;
        }
        return this.W;
    }

    public void v0(int i2) {
        this.W = i2;
        int i3 = this.h0;
        if (i2 < i3) {
            this.W = i3;
        }
    }

    public float w() {
        return this.i0;
    }

    public void w0(float f2) {
        this.i0 = f2;
    }

    public int x() {
        return this.s0;
    }

    public void x0(int i2) {
        this.s0 = i2;
    }

    public b y() {
        return this.T[0];
    }

    public void y0(int i2, int i3) {
        this.Z = i2;
        int i4 = i3 - i2;
        this.V = i4;
        int i5 = this.g0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public int z() {
        d dVar = this.I;
        int i2 = dVar != null ? 0 + dVar.f2521g : 0;
        d dVar2 = this.K;
        return dVar2 != null ? i2 + dVar2.f2521g : i2;
    }

    public void z0(b bVar) {
        this.T[0] = bVar;
    }
}
