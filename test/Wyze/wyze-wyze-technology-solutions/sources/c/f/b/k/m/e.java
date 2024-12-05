package c.f.b.k.m;

import c.f.b.k.e;
import c.f.b.k.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {
    private c.f.b.k.f a;

    /* renamed from: d, reason: collision with root package name */
    private c.f.b.k.f f2561d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2559b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2560c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f2562e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f2563f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0055b f2564g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f2565h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f2566i = new ArrayList<>();

    public e(c.f.b.k.f fVar) {
        this.a = fVar;
        this.f2561d = fVar;
    }

    private void a(f fVar, int i2, int i3, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f2569d;
        if (pVar.f2606c == null) {
            c.f.b.k.f fVar3 = this.a;
            if (pVar == fVar3.f2534f || pVar == fVar3.f2535g) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i3);
                arrayList.add(mVar);
            }
            pVar.f2606c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f2611h.f2576k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f2612i.f2576k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, mVar);
                }
            }
            if (i2 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f2591k.f2576k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f2611h.l) {
                if (fVar4 == fVar2) {
                    mVar.f2585c = true;
                }
                a(fVar4, i2, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f2612i.l) {
                if (fVar5 == fVar2) {
                    mVar.f2585c = true;
                }
                a(fVar5, i2, 1, fVar2, arrayList, mVar);
            }
            if (i2 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f2591k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i2, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(c.f.b.k.f fVar) {
        int i2;
        e.b bVar;
        int i3;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<c.f.b.k.e> it = fVar.D0.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            e.b[] bVarArr = next.T;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.Q() == 8) {
                next.f2530b = true;
            } else {
                if (next.v < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.q = 2;
                }
                if (next.y < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.r = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.q = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.r = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.q == 0) {
                            next.q = 3;
                        }
                        if (next.r == 0) {
                            next.r = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.q == 1 && (next.I.f2520f == null || next.K.f2520f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.r == 1 && (next.J.f2520f == null || next.L.f2520f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f2534f;
                lVar.f2607d = bVar9;
                int i4 = next.q;
                lVar.a = i4;
                n nVar = next.f2535g;
                nVar.f2607d = bVar10;
                int i5 = next.r;
                nVar.a = i5;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int R = next.R();
                    if (bVar9 == bVar11) {
                        i2 = (fVar.R() - next.I.f2521g) - next.K.f2521g;
                        bVar = e.b.FIXED;
                    } else {
                        i2 = R;
                        bVar = bVar9;
                    }
                    int v = next.v();
                    if (bVar10 == bVar11) {
                        i3 = (fVar.v() - next.J.f2521g) - next.L.f2521g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i3 = v;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i2, bVar2, i3);
                    next.f2534f.f2608e.d(next.R());
                    next.f2535g.f2608e.d(next.v());
                    next.f2530b = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v2 = next.v();
                            int i6 = (int) ((v2 * next.X) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, i6, bVar12, v2);
                            next.f2534f.f2608e.d(next.R());
                            next.f2535g.f2608e.d(next.v());
                            next.f2530b = true;
                        } else if (i4 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f2534f.f2608e.m = next.R();
                        } else if (i4 == 2) {
                            e.b[] bVarArr2 = fVar.T;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.v * fVar.R()) + 0.5f), bVar10, next.v());
                                next.f2534f.f2608e.d(next.R());
                                next.f2535g.f2608e.d(next.v());
                                next.f2530b = true;
                            }
                        } else {
                            c.f.b.k.d[] dVarArr = next.Q;
                            if (dVarArr[0].f2520f == null || dVarArr[1].f2520f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f2534f.f2608e.d(next.R());
                                next.f2535g.f2608e.d(next.v());
                                next.f2530b = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i5 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int R2 = next.R();
                            float f2 = next.X;
                            if (next.u() == -1) {
                                f2 = 1.0f / f2;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, R2, bVar15, (int) ((R2 * f2) + 0.5f));
                            next.f2534f.f2608e.d(next.R());
                            next.f2535g.f2608e.d(next.v());
                            next.f2530b = true;
                        } else if (i5 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f2535g.f2608e.m = next.v();
                        } else if (i5 == 2) {
                            e.b[] bVarArr3 = fVar.T;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.R(), bVar17, (int) ((next.y * fVar.v()) + 0.5f));
                                next.f2534f.f2608e.d(next.R());
                                next.f2535g.f2608e.d(next.v());
                                next.f2530b = true;
                            }
                        } else {
                            c.f.b.k.d[] dVarArr2 = next.Q;
                            if (dVarArr2[2].f2520f == null || dVarArr2[3].f2520f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f2534f.f2608e.d(next.R());
                                next.f2535g.f2608e.d(next.v());
                                next.f2530b = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i4 == 1 || i5 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f2534f.f2608e.m = next.R();
                            next.f2535g.f2608e.m = next.v();
                        } else if (i5 == 2 && i4 == 2) {
                            e.b[] bVarArr4 = fVar.T;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    l(next, bVar20, (int) ((next.v * fVar.R()) + 0.5f), bVar20, (int) ((next.y * fVar.v()) + 0.5f));
                                    next.f2534f.f2608e.d(next.R());
                                    next.f2535g.f2608e.d(next.v());
                                    next.f2530b = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(c.f.b.k.f fVar, int i2) {
        int size = this.f2566i.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j2 = Math.max(j2, this.f2566i.get(i3).b(fVar, i2));
        }
        return (int) j2;
    }

    private void i(p pVar, int i2, ArrayList<m> arrayList) {
        for (d dVar : pVar.f2611h.f2576k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f2612i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f2611h, i2, 0, pVar.f2612i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f2612i.f2576k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f2611h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f2612i, i2, 1, pVar.f2611h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f2591k.f2576k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(c.f.b.k.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        b.a aVar = this.f2565h;
        aVar.f2550d = bVar;
        aVar.f2551e = bVar2;
        aVar.f2552f = i2;
        aVar.f2553g = i3;
        this.f2564g.b(eVar, aVar);
        eVar.U0(this.f2565h.f2554h);
        eVar.v0(this.f2565h.f2555i);
        eVar.u0(this.f2565h.f2557k);
        eVar.k0(this.f2565h.f2556j);
    }

    public void c() {
        d(this.f2562e);
        this.f2566i.clear();
        m.a = 0;
        i(this.a.f2534f, 0, this.f2566i);
        i(this.a.f2535g, 1, this.f2566i);
        this.f2559b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f2561d.f2534f.f();
        this.f2561d.f2535g.f();
        arrayList.add(this.f2561d.f2534f);
        arrayList.add(this.f2561d.f2535g);
        Iterator<c.f.b.k.e> it = this.f2561d.D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            if (next instanceof c.f.b.k.g) {
                arrayList.add(new j(next));
            } else {
                if (next.Z()) {
                    if (next.f2532d == null) {
                        next.f2532d = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2532d);
                } else {
                    arrayList.add(next.f2534f);
                }
                if (next.b0()) {
                    if (next.f2533e == null) {
                        next.f2533e = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2533e);
                } else {
                    arrayList.add(next.f2535g);
                }
                if (next instanceof c.f.b.k.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2605b != this.f2561d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f2559b || this.f2560c) {
            Iterator<c.f.b.k.e> it = this.a.D0.iterator();
            while (it.hasNext()) {
                c.f.b.k.e next = it.next();
                next.l();
                next.f2530b = false;
                next.f2534f.r();
                next.f2535g.q();
            }
            this.a.l();
            c.f.b.k.f fVar = this.a;
            fVar.f2530b = false;
            fVar.f2534f.r();
            this.a.f2535g.q();
            this.f2560c = false;
        }
        if (b(this.f2561d)) {
            return false;
        }
        this.a.V0(0);
        this.a.W0(0);
        e.b s = this.a.s(0);
        e.b s2 = this.a.s(1);
        if (this.f2559b) {
            c();
        }
        int S = this.a.S();
        int T = this.a.T();
        this.a.f2534f.f2611h.d(S);
        this.a.f2535g.f2611h.d(T);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<p> it2 = this.f2562e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && s == e.b.WRAP_CONTENT) {
                this.a.z0(e.b.FIXED);
                c.f.b.k.f fVar2 = this.a;
                fVar2.U0(e(fVar2, 0));
                c.f.b.k.f fVar3 = this.a;
                fVar3.f2534f.f2608e.d(fVar3.R());
            }
            if (z4 && s2 == e.b.WRAP_CONTENT) {
                this.a.Q0(e.b.FIXED);
                c.f.b.k.f fVar4 = this.a;
                fVar4.v0(e(fVar4, 1));
                c.f.b.k.f fVar5 = this.a;
                fVar5.f2535g.f2608e.d(fVar5.v());
            }
        }
        c.f.b.k.f fVar6 = this.a;
        e.b[] bVarArr = fVar6.T;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int R = fVar6.R() + S;
            this.a.f2534f.f2612i.d(R);
            this.a.f2534f.f2608e.d(R - S);
            m();
            c.f.b.k.f fVar7 = this.a;
            e.b[] bVarArr2 = fVar7.T;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v = fVar7.v() + T;
                this.a.f2535g.f2612i.d(v);
                this.a.f2535g.f2608e.d(v - T);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<p> it3 = this.f2562e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2605b != this.a || next2.f2610g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f2562e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z2 || next3.f2605b != this.a) {
                if (!next3.f2611h.f2575j || ((!next3.f2612i.f2575j && !(next3 instanceof j)) || (!next3.f2608e.f2575j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.z0(s);
        this.a.Q0(s2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f2559b) {
            Iterator<c.f.b.k.e> it = this.a.D0.iterator();
            while (it.hasNext()) {
                c.f.b.k.e next = it.next();
                next.l();
                next.f2530b = false;
                l lVar = next.f2534f;
                lVar.f2608e.f2575j = false;
                lVar.f2610g = false;
                lVar.r();
                n nVar = next.f2535g;
                nVar.f2608e.f2575j = false;
                nVar.f2610g = false;
                nVar.q();
            }
            this.a.l();
            c.f.b.k.f fVar = this.a;
            fVar.f2530b = false;
            l lVar2 = fVar.f2534f;
            lVar2.f2608e.f2575j = false;
            lVar2.f2610g = false;
            lVar2.r();
            n nVar2 = this.a.f2535g;
            nVar2.f2608e.f2575j = false;
            nVar2.f2610g = false;
            nVar2.q();
            c();
        }
        if (b(this.f2561d)) {
            return false;
        }
        this.a.V0(0);
        this.a.W0(0);
        this.a.f2534f.f2611h.d(0);
        this.a.f2535g.f2611h.d(0);
        return true;
    }

    public boolean h(boolean z, int i2) {
        boolean z2;
        e.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        e.b s = this.a.s(0);
        e.b s2 = this.a.s(1);
        int S = this.a.S();
        int T = this.a.T();
        if (z4 && (s == (bVar = e.b.WRAP_CONTENT) || s2 == bVar)) {
            Iterator<p> it = this.f2562e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f2609f == i2 && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && s == e.b.WRAP_CONTENT) {
                    this.a.z0(e.b.FIXED);
                    c.f.b.k.f fVar = this.a;
                    fVar.U0(e(fVar, 0));
                    c.f.b.k.f fVar2 = this.a;
                    fVar2.f2534f.f2608e.d(fVar2.R());
                }
            } else if (z4 && s2 == e.b.WRAP_CONTENT) {
                this.a.Q0(e.b.FIXED);
                c.f.b.k.f fVar3 = this.a;
                fVar3.v0(e(fVar3, 1));
                c.f.b.k.f fVar4 = this.a;
                fVar4.f2535g.f2608e.d(fVar4.v());
            }
        }
        if (i2 == 0) {
            c.f.b.k.f fVar5 = this.a;
            e.b[] bVarArr = fVar5.T;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int R = fVar5.R() + S;
                this.a.f2534f.f2612i.d(R);
                this.a.f2534f.f2608e.d(R - S);
                z2 = true;
            }
            z2 = false;
        } else {
            c.f.b.k.f fVar6 = this.a;
            e.b[] bVarArr2 = fVar6.T;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v = fVar6.v() + T;
                this.a.f2535g.f2612i.d(v);
                this.a.f2535g.f2608e.d(v - T);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<p> it2 = this.f2562e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f2609f == i2 && (next2.f2605b != this.a || next2.f2610g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f2562e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f2609f == i2 && (z2 || next3.f2605b != this.a)) {
                if (!next3.f2611h.f2575j || !next3.f2612i.f2575j || (!(next3 instanceof c) && !next3.f2608e.f2575j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.z0(s);
        this.a.Q0(s2);
        return z3;
    }

    public void j() {
        this.f2559b = true;
    }

    public void k() {
        this.f2560c = true;
    }

    public void m() {
        g gVar;
        Iterator<c.f.b.k.e> it = this.a.D0.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            if (!next.f2530b) {
                e.b[] bVarArr = next.T;
                boolean z = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = next.q;
                int i3 = next.r;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                g gVar2 = next.f2534f.f2608e;
                boolean z3 = gVar2.f2575j;
                g gVar3 = next.f2535g.f2608e;
                boolean z4 = gVar3.f2575j;
                if (z3 && z4) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f2572g, bVar4, gVar3.f2572g);
                    next.f2530b = true;
                } else if (z3 && z) {
                    l(next, e.b.FIXED, gVar2.f2572g, bVar3, gVar3.f2572g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f2535g.f2608e.m = next.v();
                    } else {
                        next.f2535g.f2608e.d(next.v());
                        next.f2530b = true;
                    }
                } else if (z4 && z2) {
                    l(next, bVar3, gVar2.f2572g, e.b.FIXED, gVar3.f2572g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f2534f.f2608e.m = next.R();
                    } else {
                        next.f2534f.f2608e.d(next.R());
                        next.f2530b = true;
                    }
                }
                if (next.f2530b && (gVar = next.f2535g.l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0055b interfaceC0055b) {
        this.f2564g = interfaceC0055b;
    }
}
