package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import c.f.b.k.m.f;
import c.f.b.k.m.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f2591k;
    g l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p.b.values().length];
            a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(c.f.b.k.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f2591k = fVar;
        this.l = null;
        this.f2611h.f2570e = f.a.TOP;
        this.f2612i.f2570e = f.a.BOTTOM;
        fVar.f2570e = f.a.BASELINE;
        this.f2609f = 1;
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        float f2;
        float t;
        float f3;
        int i2;
        int i3 = a.a[this.f2613j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            c.f.b.k.e eVar = this.f2605b;
            n(dVar, eVar.J, eVar.L, 1);
            return;
        }
        g gVar = this.f2608e;
        if (gVar.f2568c && !gVar.f2575j && this.f2607d == e.b.MATCH_CONSTRAINT) {
            c.f.b.k.e eVar2 = this.f2605b;
            int i4 = eVar2.r;
            if (i4 != 2) {
                if (i4 == 3 && eVar2.f2534f.f2608e.f2575j) {
                    int u = eVar2.u();
                    if (u == -1) {
                        c.f.b.k.e eVar3 = this.f2605b;
                        f2 = eVar3.f2534f.f2608e.f2572g;
                        t = eVar3.t();
                    } else if (u == 0) {
                        f3 = r7.f2534f.f2608e.f2572g * this.f2605b.t();
                        i2 = (int) (f3 + 0.5f);
                        this.f2608e.d(i2);
                    } else if (u == 1) {
                        c.f.b.k.e eVar4 = this.f2605b;
                        f2 = eVar4.f2534f.f2608e.f2572g;
                        t = eVar4.t();
                    } else {
                        i2 = 0;
                        this.f2608e.d(i2);
                    }
                    f3 = f2 / t;
                    i2 = (int) (f3 + 0.5f);
                    this.f2608e.d(i2);
                }
            } else {
                c.f.b.k.e I = eVar2.I();
                if (I != null) {
                    if (I.f2535g.f2608e.f2575j) {
                        this.f2608e.d((int) ((r7.f2572g * this.f2605b.y) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f2611h;
        if (fVar.f2568c) {
            f fVar2 = this.f2612i;
            if (fVar2.f2568c) {
                if (fVar.f2575j && fVar2.f2575j && this.f2608e.f2575j) {
                    return;
                }
                if (!this.f2608e.f2575j && this.f2607d == e.b.MATCH_CONSTRAINT) {
                    c.f.b.k.e eVar5 = this.f2605b;
                    if (eVar5.q == 0 && !eVar5.b0()) {
                        f fVar3 = this.f2611h.l.get(0);
                        f fVar4 = this.f2612i.l.get(0);
                        int i5 = fVar3.f2572g;
                        f fVar5 = this.f2611h;
                        int i6 = i5 + fVar5.f2571f;
                        int i7 = fVar4.f2572g + this.f2612i.f2571f;
                        fVar5.d(i6);
                        this.f2612i.d(i7);
                        this.f2608e.d(i7 - i6);
                        return;
                    }
                }
                if (!this.f2608e.f2575j && this.f2607d == e.b.MATCH_CONSTRAINT && this.a == 1 && this.f2611h.l.size() > 0 && this.f2612i.l.size() > 0) {
                    f fVar6 = this.f2611h.l.get(0);
                    int i8 = (this.f2612i.l.get(0).f2572g + this.f2612i.f2571f) - (fVar6.f2572g + this.f2611h.f2571f);
                    g gVar2 = this.f2608e;
                    int i9 = gVar2.m;
                    if (i8 < i9) {
                        gVar2.d(i8);
                    } else {
                        gVar2.d(i9);
                    }
                }
                if (this.f2608e.f2575j && this.f2611h.l.size() > 0 && this.f2612i.l.size() > 0) {
                    f fVar7 = this.f2611h.l.get(0);
                    f fVar8 = this.f2612i.l.get(0);
                    int i10 = fVar7.f2572g + this.f2611h.f2571f;
                    int i11 = fVar8.f2572g + this.f2612i.f2571f;
                    float M = this.f2605b.M();
                    if (fVar7 == fVar8) {
                        i10 = fVar7.f2572g;
                        i11 = fVar8.f2572g;
                        M = 0.5f;
                    }
                    this.f2611h.d((int) (i10 + 0.5f + (((i11 - i10) - this.f2608e.f2572g) * M)));
                    this.f2612i.d(this.f2611h.f2572g + this.f2608e.f2572g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void d() {
        c.f.b.k.e I;
        c.f.b.k.e I2;
        c.f.b.k.e eVar = this.f2605b;
        if (eVar.f2530b) {
            this.f2608e.d(eVar.v());
        }
        if (!this.f2608e.f2575j) {
            this.f2607d = this.f2605b.O();
            if (this.f2605b.U()) {
                this.l = new c.f.b.k.m.a(this);
            }
            e.b bVar = this.f2607d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f2605b.I()) != null && I2.O() == e.b.FIXED) {
                    int v = (I2.v() - this.f2605b.J.e()) - this.f2605b.L.e();
                    b(this.f2611h, I2.f2535g.f2611h, this.f2605b.J.e());
                    b(this.f2612i, I2.f2535g.f2612i, -this.f2605b.L.e());
                    this.f2608e.d(v);
                    return;
                }
                if (this.f2607d == e.b.FIXED) {
                    this.f2608e.d(this.f2605b.v());
                }
            }
        } else if (this.f2607d == e.b.MATCH_PARENT && (I = this.f2605b.I()) != null && I.O() == e.b.FIXED) {
            b(this.f2611h, I.f2535g.f2611h, this.f2605b.J.e());
            b(this.f2612i, I.f2535g.f2612i, -this.f2605b.L.e());
            return;
        }
        g gVar = this.f2608e;
        boolean z = gVar.f2575j;
        if (z) {
            c.f.b.k.e eVar2 = this.f2605b;
            if (eVar2.f2530b) {
                c.f.b.k.d[] dVarArr = eVar2.Q;
                if (dVarArr[2].f2520f != null && dVarArr[3].f2520f != null) {
                    if (eVar2.b0()) {
                        this.f2611h.f2571f = this.f2605b.Q[2].e();
                        this.f2612i.f2571f = -this.f2605b.Q[3].e();
                    } else {
                        f h2 = h(this.f2605b.Q[2]);
                        if (h2 != null) {
                            b(this.f2611h, h2, this.f2605b.Q[2].e());
                        }
                        f h3 = h(this.f2605b.Q[3]);
                        if (h3 != null) {
                            b(this.f2612i, h3, -this.f2605b.Q[3].e());
                        }
                        this.f2611h.f2567b = true;
                        this.f2612i.f2567b = true;
                    }
                    if (this.f2605b.U()) {
                        b(this.f2591k, this.f2611h, this.f2605b.n());
                        return;
                    }
                    return;
                }
                if (dVarArr[2].f2520f != null) {
                    f h4 = h(dVarArr[2]);
                    if (h4 != null) {
                        b(this.f2611h, h4, this.f2605b.Q[2].e());
                        b(this.f2612i, this.f2611h, this.f2608e.f2572g);
                        if (this.f2605b.U()) {
                            b(this.f2591k, this.f2611h, this.f2605b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (dVarArr[3].f2520f != null) {
                    f h5 = h(dVarArr[3]);
                    if (h5 != null) {
                        b(this.f2612i, h5, -this.f2605b.Q[3].e());
                        b(this.f2611h, this.f2612i, -this.f2608e.f2572g);
                    }
                    if (this.f2605b.U()) {
                        b(this.f2591k, this.f2611h, this.f2605b.n());
                        return;
                    }
                    return;
                }
                if (dVarArr[4].f2520f != null) {
                    f h6 = h(dVarArr[4]);
                    if (h6 != null) {
                        b(this.f2591k, h6, 0);
                        b(this.f2611h, this.f2591k, -this.f2605b.n());
                        b(this.f2612i, this.f2611h, this.f2608e.f2572g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c.f.b.k.h) || eVar2.I() == null || this.f2605b.m(d.b.CENTER).f2520f != null) {
                    return;
                }
                b(this.f2611h, this.f2605b.I().f2535g.f2611h, this.f2605b.T());
                b(this.f2612i, this.f2611h, this.f2608e.f2572g);
                if (this.f2605b.U()) {
                    b(this.f2591k, this.f2611h, this.f2605b.n());
                    return;
                }
                return;
            }
        }
        if (!z && this.f2607d == e.b.MATCH_CONSTRAINT) {
            c.f.b.k.e eVar3 = this.f2605b;
            int i2 = eVar3.r;
            if (i2 != 2) {
                if (i2 == 3 && !eVar3.b0()) {
                    c.f.b.k.e eVar4 = this.f2605b;
                    if (eVar4.q != 3) {
                        g gVar2 = eVar4.f2534f.f2608e;
                        this.f2608e.l.add(gVar2);
                        gVar2.f2576k.add(this.f2608e);
                        g gVar3 = this.f2608e;
                        gVar3.f2567b = true;
                        gVar3.f2576k.add(this.f2611h);
                        this.f2608e.f2576k.add(this.f2612i);
                    }
                }
            } else {
                c.f.b.k.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar4 = I3.f2535g.f2608e;
                    this.f2608e.l.add(gVar4);
                    gVar4.f2576k.add(this.f2608e);
                    g gVar5 = this.f2608e;
                    gVar5.f2567b = true;
                    gVar5.f2576k.add(this.f2611h);
                    this.f2608e.f2576k.add(this.f2612i);
                }
            }
        } else {
            gVar.b(this);
        }
        c.f.b.k.e eVar5 = this.f2605b;
        c.f.b.k.d[] dVarArr2 = eVar5.Q;
        if (dVarArr2[2].f2520f != null && dVarArr2[3].f2520f != null) {
            if (eVar5.b0()) {
                this.f2611h.f2571f = this.f2605b.Q[2].e();
                this.f2612i.f2571f = -this.f2605b.Q[3].e();
            } else {
                f h7 = h(this.f2605b.Q[2]);
                f h8 = h(this.f2605b.Q[3]);
                h7.b(this);
                h8.b(this);
                this.f2613j = p.b.CENTER;
            }
            if (this.f2605b.U()) {
                c(this.f2591k, this.f2611h, 1, this.l);
            }
        } else if (dVarArr2[2].f2520f != null) {
            f h9 = h(dVarArr2[2]);
            if (h9 != null) {
                b(this.f2611h, h9, this.f2605b.Q[2].e());
                c(this.f2612i, this.f2611h, 1, this.f2608e);
                if (this.f2605b.U()) {
                    c(this.f2591k, this.f2611h, 1, this.l);
                }
                e.b bVar2 = this.f2607d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f2605b.t() > 0.0f) {
                    l lVar = this.f2605b.f2534f;
                    if (lVar.f2607d == bVar3) {
                        lVar.f2608e.f2576k.add(this.f2608e);
                        this.f2608e.l.add(this.f2605b.f2534f.f2608e);
                        this.f2608e.a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f2520f != null) {
            f h10 = h(dVarArr2[3]);
            if (h10 != null) {
                b(this.f2612i, h10, -this.f2605b.Q[3].e());
                c(this.f2611h, this.f2612i, -1, this.f2608e);
                if (this.f2605b.U()) {
                    c(this.f2591k, this.f2611h, 1, this.l);
                }
            }
        } else if (dVarArr2[4].f2520f != null) {
            f h11 = h(dVarArr2[4]);
            if (h11 != null) {
                b(this.f2591k, h11, 0);
                c(this.f2611h, this.f2591k, -1, this.l);
                c(this.f2612i, this.f2611h, 1, this.f2608e);
            }
        } else if (!(eVar5 instanceof c.f.b.k.h) && eVar5.I() != null) {
            b(this.f2611h, this.f2605b.I().f2535g.f2611h, this.f2605b.T());
            c(this.f2612i, this.f2611h, 1, this.f2608e);
            if (this.f2605b.U()) {
                c(this.f2591k, this.f2611h, 1, this.l);
            }
            e.b bVar4 = this.f2607d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f2605b.t() > 0.0f) {
                l lVar2 = this.f2605b.f2534f;
                if (lVar2.f2607d == bVar5) {
                    lVar2.f2608e.f2576k.add(this.f2608e);
                    this.f2608e.l.add(this.f2605b.f2534f.f2608e);
                    this.f2608e.a = this;
                }
            }
        }
        if (this.f2608e.l.size() == 0) {
            this.f2608e.f2568c = true;
        }
    }

    @Override // c.f.b.k.m.p
    public void e() {
        f fVar = this.f2611h;
        if (fVar.f2575j) {
            this.f2605b.W0(fVar.f2572g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void f() {
        this.f2606c = null;
        this.f2611h.c();
        this.f2612i.c();
        this.f2591k.c();
        this.f2608e.c();
        this.f2610g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public boolean m() {
        return this.f2607d != e.b.MATCH_CONSTRAINT || this.f2605b.r == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f2610g = false;
        this.f2611h.c();
        this.f2611h.f2575j = false;
        this.f2612i.c();
        this.f2612i.f2575j = false;
        this.f2591k.c();
        this.f2591k.f2575j = false;
        this.f2608e.f2575j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2605b.r();
    }
}
