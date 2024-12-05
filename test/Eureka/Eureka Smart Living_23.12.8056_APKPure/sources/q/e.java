package q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private p.f f8909a;

    /* renamed from: d, reason: collision with root package name */
    private p.f f8912d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8910b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8911c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f8913e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f8914f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0132b f8915g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f8916h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f8917i = new ArrayList();

    public e(p.f fVar) {
        this.f8909a = fVar;
        this.f8912d = fVar;
    }

    private void a(f fVar, int i6, int i7, f fVar2, ArrayList arrayList, k kVar) {
        m mVar = fVar.f8921d;
        if (mVar.f8955c == null) {
            p.f fVar3 = this.f8909a;
            if (mVar == fVar3.f8649e || mVar == fVar3.f8651f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i7);
                arrayList.add(kVar);
            }
            mVar.f8955c = kVar;
            kVar.a(mVar);
            for (d dVar : mVar.f8960h.f8928k) {
                if (dVar instanceof f) {
                    a((f) dVar, i6, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.f8961i.f8928k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i6, 1, fVar2, arrayList, kVar);
                }
            }
            if (i6 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f8950k.f8928k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i6, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (f fVar4 : mVar.f8960h.f8929l) {
                if (fVar4 == fVar2) {
                    kVar.f8944b = true;
                }
                a(fVar4, i6, 0, fVar2, arrayList, kVar);
            }
            for (f fVar5 : mVar.f8961i.f8929l) {
                if (fVar5 == fVar2) {
                    kVar.f8944b = true;
                }
                a(fVar5, i6, 1, fVar2, arrayList, kVar);
            }
            if (i6 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f8950k.f8929l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i6, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r2.f8665m == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(p.f r17) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.b(p.f):boolean");
    }

    private int e(p.f fVar, int i6) {
        int size = this.f8917i.size();
        long j6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j6 = Math.max(j6, ((k) this.f8917i.get(i7)).b(fVar, i6));
        }
        return (int) j6;
    }

    private void i(m mVar, int i6, ArrayList arrayList) {
        for (d dVar : mVar.f8960h.f8928k) {
            if (dVar instanceof f) {
                a((f) dVar, i6, 0, mVar.f8961i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f8960h, i6, 0, mVar.f8961i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f8961i.f8928k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i6, 1, mVar.f8960h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f8961i, i6, 1, mVar.f8960h, arrayList, null);
            }
        }
        if (i6 == 1) {
            for (d dVar3 : ((l) mVar).f8950k.f8928k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(p.e eVar, e.b bVar, int i6, e.b bVar2, int i7) {
        b.a aVar = this.f8916h;
        aVar.f8897a = bVar;
        aVar.f8898b = bVar2;
        aVar.f8899c = i6;
        aVar.f8900d = i7;
        this.f8915g.b(eVar, aVar);
        eVar.E0(this.f8916h.f8901e);
        eVar.h0(this.f8916h.f8902f);
        eVar.g0(this.f8916h.f8904h);
        eVar.b0(this.f8916h.f8903g);
    }

    public void c() {
        d(this.f8913e);
        this.f8917i.clear();
        k.f8942h = 0;
        i(this.f8909a.f8649e, 0, this.f8917i);
        i(this.f8909a.f8651f, 1, this.f8917i);
        this.f8910b = false;
    }

    public void d(ArrayList arrayList) {
        m hVar;
        arrayList.clear();
        this.f8912d.f8649e.f();
        this.f8912d.f8651f.f();
        arrayList.add(this.f8912d.f8649e);
        arrayList.add(this.f8912d.f8651f);
        Iterator it = this.f8912d.f8736w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            p.e eVar = (p.e) it.next();
            if (eVar instanceof p.h) {
                hVar = new h(eVar);
            } else {
                if (eVar.V()) {
                    if (eVar.f8645c == null) {
                        eVar.f8645c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f8645c);
                } else {
                    arrayList.add(eVar.f8649e);
                }
                if (eVar.X()) {
                    if (eVar.f8647d == null) {
                        eVar.f8647d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f8647d);
                } else {
                    arrayList.add(eVar.f8651f);
                }
                if (eVar instanceof p.j) {
                    hVar = new i(eVar);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f8954b != this.f8912d) {
                mVar.d();
            }
        }
    }

    public boolean f(boolean z5) {
        boolean z6;
        boolean z7 = true;
        boolean z8 = z5 & true;
        if (this.f8910b || this.f8911c) {
            Iterator it = this.f8909a.f8736w0.iterator();
            while (it.hasNext()) {
                p.e eVar = (p.e) it.next();
                eVar.f8641a = false;
                eVar.f8649e.r();
                eVar.f8651f.q();
            }
            p.f fVar = this.f8909a;
            fVar.f8641a = false;
            fVar.f8649e.r();
            this.f8909a.f8651f.q();
            this.f8911c = false;
        }
        if (b(this.f8912d)) {
            return false;
        }
        this.f8909a.F0(0);
        this.f8909a.G0(0);
        e.b s5 = this.f8909a.s(0);
        e.b s6 = this.f8909a.s(1);
        if (this.f8910b) {
            c();
        }
        int Q = this.f8909a.Q();
        int R = this.f8909a.R();
        this.f8909a.f8649e.f8960h.d(Q);
        this.f8909a.f8651f.f8960h.d(R);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s5 == bVar || s6 == bVar) {
            if (z8) {
                Iterator it2 = this.f8913e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((m) it2.next()).m()) {
                        z8 = false;
                        break;
                    }
                }
            }
            if (z8 && s5 == e.b.WRAP_CONTENT) {
                this.f8909a.l0(e.b.FIXED);
                p.f fVar2 = this.f8909a;
                fVar2.E0(e(fVar2, 0));
                p.f fVar3 = this.f8909a;
                fVar3.f8649e.f8957e.d(fVar3.P());
            }
            if (z8 && s6 == e.b.WRAP_CONTENT) {
                this.f8909a.A0(e.b.FIXED);
                p.f fVar4 = this.f8909a;
                fVar4.h0(e(fVar4, 1));
                p.f fVar5 = this.f8909a;
                fVar5.f8651f.f8957e.d(fVar5.v());
            }
        }
        p.f fVar6 = this.f8909a;
        e.b bVar2 = fVar6.M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int P = fVar6.P() + Q;
            this.f8909a.f8649e.f8961i.d(P);
            this.f8909a.f8649e.f8957e.d(P - Q);
            m();
            p.f fVar7 = this.f8909a;
            e.b bVar4 = fVar7.M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v5 = fVar7.v() + R;
                this.f8909a.f8651f.f8961i.d(v5);
                this.f8909a.f8651f.f8957e.d(v5 - R);
            }
            m();
            z6 = true;
        } else {
            z6 = false;
        }
        Iterator it3 = this.f8913e.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f8954b != this.f8909a || mVar.f8959g) {
                mVar.e();
            }
        }
        Iterator it4 = this.f8913e.iterator();
        while (it4.hasNext()) {
            m mVar2 = (m) it4.next();
            if (z6 || mVar2.f8954b != this.f8909a) {
                if (!mVar2.f8960h.f8927j || ((!mVar2.f8961i.f8927j && !(mVar2 instanceof h)) || (!mVar2.f8957e.f8927j && !(mVar2 instanceof c) && !(mVar2 instanceof h)))) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f8909a.l0(s5);
        this.f8909a.A0(s6);
        return z7;
    }

    public boolean g(boolean z5) {
        if (this.f8910b) {
            Iterator it = this.f8909a.f8736w0.iterator();
            while (it.hasNext()) {
                p.e eVar = (p.e) it.next();
                eVar.f8641a = false;
                j jVar = eVar.f8649e;
                jVar.f8957e.f8927j = false;
                jVar.f8959g = false;
                jVar.r();
                l lVar = eVar.f8651f;
                lVar.f8957e.f8927j = false;
                lVar.f8959g = false;
                lVar.q();
            }
            p.f fVar = this.f8909a;
            fVar.f8641a = false;
            j jVar2 = fVar.f8649e;
            jVar2.f8957e.f8927j = false;
            jVar2.f8959g = false;
            jVar2.r();
            l lVar2 = this.f8909a.f8651f;
            lVar2.f8957e.f8927j = false;
            lVar2.f8959g = false;
            lVar2.q();
            c();
        }
        if (b(this.f8912d)) {
            return false;
        }
        this.f8909a.F0(0);
        this.f8909a.G0(0);
        this.f8909a.f8649e.f8960h.d(0);
        this.f8909a.f8651f.f8960h.d(0);
        return true;
    }

    public boolean h(boolean z5, int i6) {
        boolean z6;
        e.b bVar;
        g gVar;
        int v5;
        boolean z7 = true;
        boolean z8 = z5 & true;
        e.b s5 = this.f8909a.s(0);
        e.b s6 = this.f8909a.s(1);
        int Q = this.f8909a.Q();
        int R = this.f8909a.R();
        if (z8 && (s5 == (bVar = e.b.WRAP_CONTENT) || s6 == bVar)) {
            Iterator it = this.f8913e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f8958f == i6 && !mVar.m()) {
                    z8 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z8 && s5 == e.b.WRAP_CONTENT) {
                    this.f8909a.l0(e.b.FIXED);
                    p.f fVar = this.f8909a;
                    fVar.E0(e(fVar, 0));
                    p.f fVar2 = this.f8909a;
                    gVar = fVar2.f8649e.f8957e;
                    v5 = fVar2.P();
                    gVar.d(v5);
                }
            } else if (z8 && s6 == e.b.WRAP_CONTENT) {
                this.f8909a.A0(e.b.FIXED);
                p.f fVar3 = this.f8909a;
                fVar3.h0(e(fVar3, 1));
                p.f fVar4 = this.f8909a;
                gVar = fVar4.f8651f.f8957e;
                v5 = fVar4.v();
                gVar.d(v5);
            }
        }
        p.f fVar5 = this.f8909a;
        if (i6 == 0) {
            e.b bVar2 = fVar5.M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int P = fVar5.P() + Q;
                this.f8909a.f8649e.f8961i.d(P);
                this.f8909a.f8649e.f8957e.d(P - Q);
                z6 = true;
            }
            z6 = false;
        } else {
            e.b bVar3 = fVar5.M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v6 = fVar5.v() + R;
                this.f8909a.f8651f.f8961i.d(v6);
                this.f8909a.f8651f.f8957e.d(v6 - R);
                z6 = true;
            }
            z6 = false;
        }
        m();
        Iterator it2 = this.f8913e.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f8958f == i6 && (mVar2.f8954b != this.f8909a || mVar2.f8959g)) {
                mVar2.e();
            }
        }
        Iterator it3 = this.f8913e.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f8958f == i6 && (z6 || mVar3.f8954b != this.f8909a)) {
                if (!mVar3.f8960h.f8927j || !mVar3.f8961i.f8927j || (!(mVar3 instanceof c) && !mVar3.f8957e.f8927j)) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f8909a.l0(s5);
        this.f8909a.A0(s6);
        return z7;
    }

    public void j() {
        this.f8910b = true;
    }

    public void k() {
        this.f8911c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r12 = this;
            p.f r0 = r12.f8909a
            java.util.ArrayList r0 = r0.f8736w0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            p.e r1 = (p.e) r1
            boolean r2 = r1.f8641a
            if (r2 == 0) goto L19
            goto L8
        L19:
            p.e$b[] r2 = r1.M
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f8663l
            int r4 = r1.f8665m
            p.e$b r6 = p.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            p.e$b r5 = p.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            p.e$b r5 = p.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            q.j r4 = r1.f8649e
            q.g r4 = r4.f8957e
            boolean r5 = r4.f8927j
            q.l r7 = r1.f8651f
            q.g r7 = r7.f8957e
            boolean r11 = r7.f8927j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            p.e$b r6 = p.e.b.FIXED
            int r5 = r4.f8924g
            int r7 = r7.f8924g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f8641a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            p.e$b r5 = p.e.b.FIXED
            int r8 = r4.f8924g
            int r7 = r7.f8924g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            p.e$b r2 = p.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            q.l r2 = r1.f8651f
            q.g r2 = r2.f8957e
            int r3 = r1.v()
        L78:
            r2.f8939m = r3
            goto Lae
        L7b:
            q.l r2 = r1.f8651f
            q.g r2 = r2.f8957e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f8924g
            p.e$b r10 = p.e.b.FIXED
            int r7 = r7.f8924g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            p.e$b r2 = p.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            q.j r2 = r1.f8649e
            q.g r2 = r2.f8957e
            int r3 = r1.P()
            goto L78
        La5:
            q.j r2 = r1.f8649e
            q.g r2 = r2.f8957e
            int r3 = r1.P()
            goto L83
        Lae:
            boolean r2 = r1.f8641a
            if (r2 == 0) goto L8
            q.l r2 = r1.f8651f
            q.g r2 = r2.f8951l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.m():void");
    }

    public void n(b.InterfaceC0132b interfaceC0132b) {
        this.f8915g = interfaceC0132b;
    }
}
