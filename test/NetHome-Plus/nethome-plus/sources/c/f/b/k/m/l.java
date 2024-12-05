package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import c.f.b.k.m.f;
import c.f.b.k.m.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f2583k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
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

    public l(c.f.b.k.e eVar) {
        super(eVar);
        this.f2611h.f2570e = f.a.LEFT;
        this.f2612i.f2570e = f.a.RIGHT;
        this.f2609f = 0;
    }

    private void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else {
            if (i7 > i7 || i10 > i8) {
                return;
            }
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bc, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c.f.b.k.m.d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.l.a(c.f.b.k.m.d):void");
    }

    @Override // c.f.b.k.m.p
    void d() {
        c.f.b.k.e I;
        c.f.b.k.e I2;
        c.f.b.k.e eVar = this.f2605b;
        if (eVar.f2530b) {
            this.f2608e.d(eVar.R());
        }
        if (!this.f2608e.f2575j) {
            e.b y = this.f2605b.y();
            this.f2607d = y;
            if (y != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y == bVar && (((I2 = this.f2605b.I()) != null && I2.y() == e.b.FIXED) || I2.y() == bVar)) {
                    int R = (I2.R() - this.f2605b.I.e()) - this.f2605b.K.e();
                    b(this.f2611h, I2.f2534f.f2611h, this.f2605b.I.e());
                    b(this.f2612i, I2.f2534f.f2612i, -this.f2605b.K.e());
                    this.f2608e.d(R);
                    return;
                }
                if (this.f2607d == e.b.FIXED) {
                    this.f2608e.d(this.f2605b.R());
                }
            }
        } else {
            e.b bVar2 = this.f2607d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((I = this.f2605b.I()) != null && I.y() == e.b.FIXED) || I.y() == bVar3)) {
                b(this.f2611h, I.f2534f.f2611h, this.f2605b.I.e());
                b(this.f2612i, I.f2534f.f2612i, -this.f2605b.K.e());
                return;
            }
        }
        g gVar = this.f2608e;
        if (gVar.f2575j) {
            c.f.b.k.e eVar2 = this.f2605b;
            if (eVar2.f2530b) {
                c.f.b.k.d[] dVarArr = eVar2.Q;
                if (dVarArr[0].f2520f != null && dVarArr[1].f2520f != null) {
                    if (eVar2.Z()) {
                        this.f2611h.f2571f = this.f2605b.Q[0].e();
                        this.f2612i.f2571f = -this.f2605b.Q[1].e();
                        return;
                    }
                    f h2 = h(this.f2605b.Q[0]);
                    if (h2 != null) {
                        b(this.f2611h, h2, this.f2605b.Q[0].e());
                    }
                    f h3 = h(this.f2605b.Q[1]);
                    if (h3 != null) {
                        b(this.f2612i, h3, -this.f2605b.Q[1].e());
                    }
                    this.f2611h.f2567b = true;
                    this.f2612i.f2567b = true;
                    return;
                }
                if (dVarArr[0].f2520f != null) {
                    f h4 = h(dVarArr[0]);
                    if (h4 != null) {
                        b(this.f2611h, h4, this.f2605b.Q[0].e());
                        b(this.f2612i, this.f2611h, this.f2608e.f2572g);
                        return;
                    }
                    return;
                }
                if (dVarArr[1].f2520f != null) {
                    f h5 = h(dVarArr[1]);
                    if (h5 != null) {
                        b(this.f2612i, h5, -this.f2605b.Q[1].e());
                        b(this.f2611h, this.f2612i, -this.f2608e.f2572g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c.f.b.k.h) || eVar2.I() == null || this.f2605b.m(d.b.CENTER).f2520f != null) {
                    return;
                }
                b(this.f2611h, this.f2605b.I().f2534f.f2611h, this.f2605b.S());
                b(this.f2612i, this.f2611h, this.f2608e.f2572g);
                return;
            }
        }
        if (this.f2607d == e.b.MATCH_CONSTRAINT) {
            c.f.b.k.e eVar3 = this.f2605b;
            int i2 = eVar3.q;
            if (i2 == 2) {
                c.f.b.k.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f2535g.f2608e;
                    this.f2608e.l.add(gVar2);
                    gVar2.f2576k.add(this.f2608e);
                    g gVar3 = this.f2608e;
                    gVar3.f2567b = true;
                    gVar3.f2576k.add(this.f2611h);
                    this.f2608e.f2576k.add(this.f2612i);
                }
            } else if (i2 == 3) {
                if (eVar3.r == 3) {
                    this.f2611h.a = this;
                    this.f2612i.a = this;
                    n nVar = eVar3.f2535g;
                    nVar.f2611h.a = this;
                    nVar.f2612i.a = this;
                    gVar.a = this;
                    if (eVar3.b0()) {
                        this.f2608e.l.add(this.f2605b.f2535g.f2608e);
                        this.f2605b.f2535g.f2608e.f2576k.add(this.f2608e);
                        n nVar2 = this.f2605b.f2535g;
                        nVar2.f2608e.a = this;
                        this.f2608e.l.add(nVar2.f2611h);
                        this.f2608e.l.add(this.f2605b.f2535g.f2612i);
                        this.f2605b.f2535g.f2611h.f2576k.add(this.f2608e);
                        this.f2605b.f2535g.f2612i.f2576k.add(this.f2608e);
                    } else if (this.f2605b.Z()) {
                        this.f2605b.f2535g.f2608e.l.add(this.f2608e);
                        this.f2608e.f2576k.add(this.f2605b.f2535g.f2608e);
                    } else {
                        this.f2605b.f2535g.f2608e.l.add(this.f2608e);
                    }
                } else {
                    g gVar4 = eVar3.f2535g.f2608e;
                    gVar.l.add(gVar4);
                    gVar4.f2576k.add(this.f2608e);
                    this.f2605b.f2535g.f2611h.f2576k.add(this.f2608e);
                    this.f2605b.f2535g.f2612i.f2576k.add(this.f2608e);
                    g gVar5 = this.f2608e;
                    gVar5.f2567b = true;
                    gVar5.f2576k.add(this.f2611h);
                    this.f2608e.f2576k.add(this.f2612i);
                    this.f2611h.l.add(this.f2608e);
                    this.f2612i.l.add(this.f2608e);
                }
            }
        }
        c.f.b.k.e eVar4 = this.f2605b;
        c.f.b.k.d[] dVarArr2 = eVar4.Q;
        if (dVarArr2[0].f2520f != null && dVarArr2[1].f2520f != null) {
            if (eVar4.Z()) {
                this.f2611h.f2571f = this.f2605b.Q[0].e();
                this.f2612i.f2571f = -this.f2605b.Q[1].e();
                return;
            }
            f h6 = h(this.f2605b.Q[0]);
            f h7 = h(this.f2605b.Q[1]);
            h6.b(this);
            h7.b(this);
            this.f2613j = p.b.CENTER;
            return;
        }
        if (dVarArr2[0].f2520f != null) {
            f h8 = h(dVarArr2[0]);
            if (h8 != null) {
                b(this.f2611h, h8, this.f2605b.Q[0].e());
                c(this.f2612i, this.f2611h, 1, this.f2608e);
                return;
            }
            return;
        }
        if (dVarArr2[1].f2520f != null) {
            f h9 = h(dVarArr2[1]);
            if (h9 != null) {
                b(this.f2612i, h9, -this.f2605b.Q[1].e());
                c(this.f2611h, this.f2612i, -1, this.f2608e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof c.f.b.k.h) || eVar4.I() == null) {
            return;
        }
        b(this.f2611h, this.f2605b.I().f2534f.f2611h, this.f2605b.S());
        c(this.f2612i, this.f2611h, 1, this.f2608e);
    }

    @Override // c.f.b.k.m.p
    public void e() {
        f fVar = this.f2611h;
        if (fVar.f2575j) {
            this.f2605b.V0(fVar.f2572g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void f() {
        this.f2606c = null;
        this.f2611h.c();
        this.f2612i.c();
        this.f2608e.c();
        this.f2610g = false;
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        return this.f2607d != e.b.MATCH_CONSTRAINT || this.f2605b.q == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f2610g = false;
        this.f2611h.c();
        this.f2611h.f2575j = false;
        this.f2612i.c();
        this.f2612i.f2575j = false;
        this.f2608e.f2575j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2605b.r();
    }
}
