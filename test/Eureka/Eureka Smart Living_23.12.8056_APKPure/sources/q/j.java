package q;

import java.util.List;
import p.d;
import p.e;
import q.f;
import q.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f8940k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8941a;

        static {
            int[] iArr = new int[m.b.values().length];
            f8941a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8941a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8941a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(p.e eVar) {
        super(eVar);
        this.f8960h.f8922e = f.a.LEFT;
        this.f8961i.f8922e = f.a.RIGHT;
        this.f8958f = 0;
    }

    private void q(int[] iArr, int i6, int i7, int i8, int i9, float f6, int i10) {
        int i11 = i7 - i6;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f6) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f6) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f6) + 0.5f);
        int i14 = (int) ((i11 / f6) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0295, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // q.m, q.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(q.d r17) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j.a(q.d):void");
    }

    @Override // q.m
    void d() {
        p.e G;
        f fVar;
        f fVar2;
        int Q;
        f fVar3;
        p.d dVar;
        List list;
        d dVar2;
        f fVar4;
        f fVar5;
        f fVar6;
        int Q2;
        f fVar7;
        f fVar8;
        int i6;
        p.e G2;
        p.e eVar = this.f8954b;
        if (eVar.f8641a) {
            this.f8957e.d(eVar.P());
        }
        if (this.f8957e.f8927j) {
            e.b bVar = this.f8956d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((G = this.f8954b.G()) != null && G.y() == e.b.FIXED) || G.y() == bVar2)) {
                b(this.f8960h, G.f8649e.f8960h, this.f8954b.B.c());
                b(this.f8961i, G.f8649e.f8961i, -this.f8954b.D.c());
                return;
            }
        } else {
            e.b y5 = this.f8954b.y();
            this.f8956d = y5;
            if (y5 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y5 == bVar3 && (((G2 = this.f8954b.G()) != null && G2.y() == e.b.FIXED) || G2.y() == bVar3)) {
                    int P = (G2.P() - this.f8954b.B.c()) - this.f8954b.D.c();
                    b(this.f8960h, G2.f8649e.f8960h, this.f8954b.B.c());
                    b(this.f8961i, G2.f8649e.f8961i, -this.f8954b.D.c());
                    this.f8957e.d(P);
                    return;
                }
                if (this.f8956d == e.b.FIXED) {
                    this.f8957e.d(this.f8954b.P());
                }
            }
        }
        g gVar = this.f8957e;
        if (gVar.f8927j) {
            p.e eVar2 = this.f8954b;
            if (eVar2.f8641a) {
                p.d[] dVarArr = eVar2.J;
                p.d dVar3 = dVarArr[0];
                p.d dVar4 = dVar3.f8625d;
                if (dVar4 != null && dVarArr[1].f8625d != null) {
                    if (eVar2.V()) {
                        this.f8960h.f8923f = this.f8954b.J[0].c();
                        fVar3 = this.f8961i;
                        dVar = this.f8954b.J[1];
                        fVar3.f8923f = -dVar.c();
                        return;
                    }
                    f h6 = h(this.f8954b.J[0]);
                    if (h6 != null) {
                        b(this.f8960h, h6, this.f8954b.J[0].c());
                    }
                    f h7 = h(this.f8954b.J[1]);
                    if (h7 != null) {
                        b(this.f8961i, h7, -this.f8954b.J[1].c());
                    }
                    this.f8960h.f8919b = true;
                    this.f8961i.f8919b = true;
                    return;
                }
                if (dVar4 != null) {
                    fVar5 = h(dVar3);
                    if (fVar5 == null) {
                        return;
                    }
                    fVar6 = this.f8960h;
                    Q2 = this.f8954b.J[0].c();
                } else {
                    p.d dVar5 = dVarArr[1];
                    if (dVar5.f8625d != null) {
                        f h8 = h(dVar5);
                        if (h8 != null) {
                            b(this.f8961i, h8, -this.f8954b.J[1].c());
                            fVar7 = this.f8960h;
                            fVar8 = this.f8961i;
                            i6 = -this.f8957e.f8924g;
                            b(fVar7, fVar8, i6);
                            return;
                        }
                        return;
                    }
                    if ((eVar2 instanceof p.i) || eVar2.G() == null || this.f8954b.m(d.b.CENTER).f8625d != null) {
                        return;
                    }
                    fVar5 = this.f8954b.G().f8649e.f8960h;
                    fVar6 = this.f8960h;
                    Q2 = this.f8954b.Q();
                }
                b(fVar6, fVar5, Q2);
                fVar7 = this.f8961i;
                fVar8 = this.f8960h;
                i6 = this.f8957e.f8924g;
                b(fVar7, fVar8, i6);
                return;
            }
        }
        if (this.f8956d == e.b.MATCH_CONSTRAINT) {
            p.e eVar3 = this.f8954b;
            int i7 = eVar3.f8663l;
            if (i7 == 2) {
                p.e G3 = eVar3.G();
                if (G3 != null) {
                    g gVar2 = G3.f8651f.f8957e;
                    this.f8957e.f8929l.add(gVar2);
                    gVar2.f8928k.add(this.f8957e);
                    g gVar3 = this.f8957e;
                    gVar3.f8919b = true;
                    gVar3.f8928k.add(this.f8960h);
                    list = this.f8957e.f8928k;
                    dVar2 = this.f8961i;
                    list.add(dVar2);
                }
            } else if (i7 == 3) {
                if (eVar3.f8665m == 3) {
                    this.f8960h.f8918a = this;
                    this.f8961i.f8918a = this;
                    l lVar = eVar3.f8651f;
                    lVar.f8960h.f8918a = this;
                    lVar.f8961i.f8918a = this;
                    gVar.f8918a = this;
                    if (eVar3.X()) {
                        this.f8957e.f8929l.add(this.f8954b.f8651f.f8957e);
                        this.f8954b.f8651f.f8957e.f8928k.add(this.f8957e);
                        l lVar2 = this.f8954b.f8651f;
                        lVar2.f8957e.f8918a = this;
                        this.f8957e.f8929l.add(lVar2.f8960h);
                        this.f8957e.f8929l.add(this.f8954b.f8651f.f8961i);
                        this.f8954b.f8651f.f8960h.f8928k.add(this.f8957e);
                        list = this.f8954b.f8651f.f8961i.f8928k;
                        dVar2 = this.f8957e;
                        list.add(dVar2);
                    } else if (this.f8954b.V()) {
                        this.f8954b.f8651f.f8957e.f8929l.add(this.f8957e);
                        list = this.f8957e.f8928k;
                        dVar2 = this.f8954b.f8651f.f8957e;
                        list.add(dVar2);
                    } else {
                        fVar4 = this.f8954b.f8651f.f8957e;
                    }
                } else {
                    g gVar4 = eVar3.f8651f.f8957e;
                    gVar.f8929l.add(gVar4);
                    gVar4.f8928k.add(this.f8957e);
                    this.f8954b.f8651f.f8960h.f8928k.add(this.f8957e);
                    this.f8954b.f8651f.f8961i.f8928k.add(this.f8957e);
                    g gVar5 = this.f8957e;
                    gVar5.f8919b = true;
                    gVar5.f8928k.add(this.f8960h);
                    this.f8957e.f8928k.add(this.f8961i);
                    this.f8960h.f8929l.add(this.f8957e);
                    fVar4 = this.f8961i;
                }
                list = fVar4.f8929l;
                dVar2 = this.f8957e;
                list.add(dVar2);
            }
            fVar3.f8923f = -dVar.c();
            return;
        }
        p.e eVar4 = this.f8954b;
        p.d[] dVarArr2 = eVar4.J;
        p.d dVar6 = dVarArr2[0];
        p.d dVar7 = dVar6.f8625d;
        if (dVar7 != null && dVarArr2[1].f8625d != null) {
            if (eVar4.V()) {
                this.f8960h.f8923f = this.f8954b.J[0].c();
                fVar3 = this.f8961i;
                dVar = this.f8954b.J[1];
                fVar3.f8923f = -dVar.c();
                return;
            }
            f h9 = h(this.f8954b.J[0]);
            f h10 = h(this.f8954b.J[1]);
            h9.b(this);
            h10.b(this);
            this.f8962j = m.b.CENTER;
            return;
        }
        if (dVar7 != null) {
            fVar = h(dVar6);
            if (fVar == null) {
                return;
            }
            fVar2 = this.f8960h;
            Q = this.f8954b.J[0].c();
        } else {
            p.d dVar8 = dVarArr2[1];
            if (dVar8.f8625d != null) {
                f h11 = h(dVar8);
                if (h11 != null) {
                    b(this.f8961i, h11, -this.f8954b.J[1].c());
                    c(this.f8960h, this.f8961i, -1, this.f8957e);
                    return;
                }
                return;
            }
            if ((eVar4 instanceof p.i) || eVar4.G() == null) {
                return;
            }
            fVar = this.f8954b.G().f8649e.f8960h;
            fVar2 = this.f8960h;
            Q = this.f8954b.Q();
        }
        b(fVar2, fVar, Q);
        c(this.f8961i, this.f8960h, 1, this.f8957e);
    }

    @Override // q.m
    public void e() {
        f fVar = this.f8960h;
        if (fVar.f8927j) {
            this.f8954b.F0(fVar.f8924g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void f() {
        this.f8955c = null;
        this.f8960h.c();
        this.f8961i.c();
        this.f8957e.c();
        this.f8959g = false;
    }

    @Override // q.m
    boolean m() {
        return this.f8956d != e.b.MATCH_CONSTRAINT || this.f8954b.f8663l == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f8959g = false;
        this.f8960h.c();
        this.f8960h.f8927j = false;
        this.f8961i.c();
        this.f8961i.f8927j = false;
        this.f8957e.f8927j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f8954b.r();
    }
}
