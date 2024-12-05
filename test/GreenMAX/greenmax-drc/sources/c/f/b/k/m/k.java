package c.f.b.k.m;

import c.f.b.k.m.f;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public class k extends p {
    public k(c.f.b.k.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f2611h.f2576k.add(fVar);
        fVar.l.add(this.f2611h);
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        c.f.b.k.a aVar = (c.f.b.k.a) this.f2605b;
        int e1 = aVar.e1();
        Iterator<f> it = this.f2611h.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f2572g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (e1 != 0 && e1 != 2) {
            this.f2611h.d(i2 + aVar.f1());
        } else {
            this.f2611h.d(i3 + aVar.f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void d() {
        c.f.b.k.e eVar = this.f2605b;
        if (eVar instanceof c.f.b.k.a) {
            this.f2611h.f2567b = true;
            c.f.b.k.a aVar = (c.f.b.k.a) eVar;
            int e1 = aVar.e1();
            boolean d1 = aVar.d1();
            int i2 = 0;
            if (e1 == 0) {
                this.f2611h.f2570e = f.a.LEFT;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar2 = aVar.D0[i2];
                    if (d1 || eVar2.Q() != 8) {
                        f fVar = eVar2.f2534f.f2611h;
                        fVar.f2576k.add(this.f2611h);
                        this.f2611h.l.add(fVar);
                    }
                    i2++;
                }
                q(this.f2605b.f2534f.f2611h);
                q(this.f2605b.f2534f.f2612i);
                return;
            }
            if (e1 == 1) {
                this.f2611h.f2570e = f.a.RIGHT;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar3 = aVar.D0[i2];
                    if (d1 || eVar3.Q() != 8) {
                        f fVar2 = eVar3.f2534f.f2612i;
                        fVar2.f2576k.add(this.f2611h);
                        this.f2611h.l.add(fVar2);
                    }
                    i2++;
                }
                q(this.f2605b.f2534f.f2611h);
                q(this.f2605b.f2534f.f2612i);
                return;
            }
            if (e1 == 2) {
                this.f2611h.f2570e = f.a.TOP;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar4 = aVar.D0[i2];
                    if (d1 || eVar4.Q() != 8) {
                        f fVar3 = eVar4.f2535g.f2611h;
                        fVar3.f2576k.add(this.f2611h);
                        this.f2611h.l.add(fVar3);
                    }
                    i2++;
                }
                q(this.f2605b.f2535g.f2611h);
                q(this.f2605b.f2535g.f2612i);
                return;
            }
            if (e1 != 3) {
                return;
            }
            this.f2611h.f2570e = f.a.BOTTOM;
            while (i2 < aVar.E0) {
                c.f.b.k.e eVar5 = aVar.D0[i2];
                if (d1 || eVar5.Q() != 8) {
                    f fVar4 = eVar5.f2535g.f2612i;
                    fVar4.f2576k.add(this.f2611h);
                    this.f2611h.l.add(fVar4);
                }
                i2++;
            }
            q(this.f2605b.f2535g.f2611h);
            q(this.f2605b.f2535g.f2612i);
        }
    }

    @Override // c.f.b.k.m.p
    public void e() {
        c.f.b.k.e eVar = this.f2605b;
        if (eVar instanceof c.f.b.k.a) {
            int e1 = ((c.f.b.k.a) eVar).e1();
            if (e1 != 0 && e1 != 1) {
                this.f2605b.W0(this.f2611h.f2572g);
            } else {
                this.f2605b.V0(this.f2611h.f2572g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void f() {
        this.f2606c = null;
        this.f2611h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public boolean m() {
        return false;
    }
}
