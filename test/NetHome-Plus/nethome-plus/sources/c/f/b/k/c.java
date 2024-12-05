package c.f.b.k;

import c.f.b.k.e;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {
    protected e a;

    /* renamed from: b, reason: collision with root package name */
    protected e f2506b;

    /* renamed from: c, reason: collision with root package name */
    protected e f2507c;

    /* renamed from: d, reason: collision with root package name */
    protected e f2508d;

    /* renamed from: e, reason: collision with root package name */
    protected e f2509e;

    /* renamed from: f, reason: collision with root package name */
    protected e f2510f;

    /* renamed from: g, reason: collision with root package name */
    protected e f2511g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f2512h;

    /* renamed from: i, reason: collision with root package name */
    protected int f2513i;

    /* renamed from: j, reason: collision with root package name */
    protected int f2514j;

    /* renamed from: k, reason: collision with root package name */
    protected float f2515k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(e eVar, int i2, boolean z) {
        this.q = false;
        this.a = eVar;
        this.p = i2;
        this.q = z;
    }

    private void b() {
        int i2 = this.p * 2;
        e eVar = this.a;
        this.o = true;
        e eVar2 = eVar;
        boolean z = false;
        while (!z) {
            this.f2513i++;
            e[] eVarArr = eVar.y0;
            int i3 = this.p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.x0[i3] = null;
            if (eVar.Q() != 8) {
                this.l++;
                e.b s = eVar.s(this.p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.m += eVar.C(this.p);
                }
                int e2 = this.m + eVar.Q[i2].e();
                this.m = e2;
                int i4 = i2 + 1;
                this.m = e2 + eVar.Q[i4].e();
                int e3 = this.n + eVar.Q[i2].e();
                this.n = e3;
                this.n = e3 + eVar.Q[i4].e();
                if (this.f2506b == null) {
                    this.f2506b = eVar;
                }
                this.f2508d = eVar;
                e.b[] bVarArr = eVar.T;
                int i5 = this.p;
                if (bVarArr[i5] == bVar) {
                    int[] iArr = eVar.s;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.f2514j++;
                        float[] fArr = eVar.w0;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.f2515k += fArr[i5];
                        }
                        if (c(eVar, i5)) {
                            if (f2 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.f2512h == null) {
                                this.f2512h = new ArrayList<>();
                            }
                            this.f2512h.add(eVar);
                        }
                        if (this.f2510f == null) {
                            this.f2510f = eVar;
                        }
                        e eVar4 = this.f2511g;
                        if (eVar4 != null) {
                            eVar4.x0[this.p] = eVar;
                        }
                        this.f2511g = eVar;
                    }
                    if (this.p == 0) {
                        if (eVar.q != 0) {
                            this.o = false;
                        } else if (eVar.t != 0 || eVar.u != 0) {
                            this.o = false;
                        }
                    } else if (eVar.r != 0) {
                        this.o = false;
                    } else if (eVar.w != 0 || eVar.x != 0) {
                        this.o = false;
                    }
                    if (eVar.X != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.y0[this.p] = eVar;
            }
            d dVar = eVar.Q[i2 + 1].f2520f;
            if (dVar != null) {
                e eVar5 = dVar.f2518d;
                d[] dVarArr = eVar5.Q;
                if (dVarArr[i2].f2520f != null && dVarArr[i2].f2520f.f2518d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f2506b;
        if (eVar6 != null) {
            this.m -= eVar6.Q[i2].e();
        }
        e eVar7 = this.f2508d;
        if (eVar7 != null) {
            this.m -= eVar7.Q[i2 + 1].e();
        }
        this.f2507c = eVar;
        if (this.p == 0 && this.q) {
            this.f2509e = eVar;
        } else {
            this.f2509e = this.a;
        }
        this.t = this.s && this.r;
    }

    private static boolean c(e eVar, int i2) {
        if (eVar.Q() != 8 && eVar.T[i2] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.s;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
