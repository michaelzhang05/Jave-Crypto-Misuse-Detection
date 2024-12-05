package p;

import java.util.ArrayList;
import p.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f8600a;

    /* renamed from: b, reason: collision with root package name */
    protected e f8601b;

    /* renamed from: c, reason: collision with root package name */
    protected e f8602c;

    /* renamed from: d, reason: collision with root package name */
    protected e f8603d;

    /* renamed from: e, reason: collision with root package name */
    protected e f8604e;

    /* renamed from: f, reason: collision with root package name */
    protected e f8605f;

    /* renamed from: g, reason: collision with root package name */
    protected e f8606g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f8607h;

    /* renamed from: i, reason: collision with root package name */
    protected int f8608i;

    /* renamed from: j, reason: collision with root package name */
    protected int f8609j;

    /* renamed from: k, reason: collision with root package name */
    protected float f8610k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f8611l;

    /* renamed from: m, reason: collision with root package name */
    int f8612m;

    /* renamed from: n, reason: collision with root package name */
    int f8613n;

    /* renamed from: o, reason: collision with root package name */
    boolean f8614o;

    /* renamed from: p, reason: collision with root package name */
    private int f8615p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8616q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f8617r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f8618s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f8619t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f8620u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8621v;

    public c(e eVar, int i6, boolean z5) {
        this.f8600a = eVar;
        this.f8615p = i6;
        this.f8616q = z5;
    }

    private void b() {
        int i6 = this.f8615p * 2;
        e eVar = this.f8600a;
        this.f8614o = true;
        e eVar2 = eVar;
        boolean z5 = false;
        while (!z5) {
            this.f8608i++;
            e[] eVarArr = eVar.f8678s0;
            int i7 = this.f8615p;
            e eVar3 = null;
            eVarArr[i7] = null;
            eVar.f8676r0[i7] = null;
            if (eVar.O() != 8) {
                this.f8611l++;
                e.b s5 = eVar.s(this.f8615p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s5 != bVar) {
                    this.f8612m += eVar.A(this.f8615p);
                }
                int c6 = this.f8612m + eVar.J[i6].c();
                this.f8612m = c6;
                int i8 = i6 + 1;
                this.f8612m = c6 + eVar.J[i8].c();
                int c7 = this.f8613n + eVar.J[i6].c();
                this.f8613n = c7;
                this.f8613n = c7 + eVar.J[i8].c();
                if (this.f8601b == null) {
                    this.f8601b = eVar;
                }
                this.f8603d = eVar;
                e.b[] bVarArr = eVar.M;
                int i9 = this.f8615p;
                if (bVarArr[i9] == bVar) {
                    int i10 = eVar.f8667n[i9];
                    if (i10 == 0 || i10 == 3 || i10 == 2) {
                        this.f8609j++;
                        float f6 = eVar.f8674q0[i9];
                        if (f6 > 0.0f) {
                            this.f8610k += f6;
                        }
                        if (c(eVar, i9)) {
                            if (f6 < 0.0f) {
                                this.f8617r = true;
                            } else {
                                this.f8618s = true;
                            }
                            if (this.f8607h == null) {
                                this.f8607h = new ArrayList();
                            }
                            this.f8607h.add(eVar);
                        }
                        if (this.f8605f == null) {
                            this.f8605f = eVar;
                        }
                        e eVar4 = this.f8606g;
                        if (eVar4 != null) {
                            eVar4.f8676r0[this.f8615p] = eVar;
                        }
                        this.f8606g = eVar;
                    }
                    if (this.f8615p != 0 ? !(eVar.f8665m == 0 && eVar.f8675r == 0 && eVar.f8677s == 0) : !(eVar.f8663l == 0 && eVar.f8669o == 0 && eVar.f8671p == 0)) {
                        this.f8614o = false;
                    }
                    if (eVar.Q != 0.0f) {
                        this.f8614o = false;
                        this.f8620u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f8678s0[this.f8615p] = eVar;
            }
            d dVar = eVar.J[i6 + 1].f8625d;
            if (dVar != null) {
                e eVar5 = dVar.f8623b;
                d dVar2 = eVar5.J[i6].f8625d;
                if (dVar2 != null && dVar2.f8623b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z5 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f8601b;
        if (eVar6 != null) {
            this.f8612m -= eVar6.J[i6].c();
        }
        e eVar7 = this.f8603d;
        if (eVar7 != null) {
            this.f8612m -= eVar7.J[i6 + 1].c();
        }
        this.f8602c = eVar;
        if (this.f8615p == 0 && this.f8616q) {
            this.f8604e = eVar;
        } else {
            this.f8604e = this.f8600a;
        }
        this.f8619t = this.f8618s && this.f8617r;
    }

    private static boolean c(e eVar, int i6) {
        int i7;
        return eVar.O() != 8 && eVar.M[i6] == e.b.MATCH_CONSTRAINT && ((i7 = eVar.f8667n[i6]) == 0 || i7 == 3);
    }

    public void a() {
        if (!this.f8621v) {
            b();
        }
        this.f8621v = true;
    }
}
