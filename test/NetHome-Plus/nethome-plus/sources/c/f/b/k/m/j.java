package c.f.b.k.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class j extends p {
    public j(c.f.b.k.e eVar) {
        super(eVar);
        eVar.f2534f.f();
        eVar.f2535g.f();
        this.f2609f = ((c.f.b.k.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f2611h.f2576k.add(fVar);
        fVar.l.add(this.f2611h);
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        f fVar = this.f2611h;
        if (fVar.f2568c && !fVar.f2575j) {
            this.f2611h.d((int) ((fVar.l.get(0).f2572g * ((c.f.b.k.g) this.f2605b).e1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void d() {
        c.f.b.k.g gVar = (c.f.b.k.g) this.f2605b;
        int c1 = gVar.c1();
        int d1 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            if (c1 != -1) {
                this.f2611h.l.add(this.f2605b.U.f2534f.f2611h);
                this.f2605b.U.f2534f.f2611h.f2576k.add(this.f2611h);
                this.f2611h.f2571f = c1;
            } else if (d1 != -1) {
                this.f2611h.l.add(this.f2605b.U.f2534f.f2612i);
                this.f2605b.U.f2534f.f2612i.f2576k.add(this.f2611h);
                this.f2611h.f2571f = -d1;
            } else {
                f fVar = this.f2611h;
                fVar.f2567b = true;
                fVar.l.add(this.f2605b.U.f2534f.f2612i);
                this.f2605b.U.f2534f.f2612i.f2576k.add(this.f2611h);
            }
            q(this.f2605b.f2534f.f2611h);
            q(this.f2605b.f2534f.f2612i);
            return;
        }
        if (c1 != -1) {
            this.f2611h.l.add(this.f2605b.U.f2535g.f2611h);
            this.f2605b.U.f2535g.f2611h.f2576k.add(this.f2611h);
            this.f2611h.f2571f = c1;
        } else if (d1 != -1) {
            this.f2611h.l.add(this.f2605b.U.f2535g.f2612i);
            this.f2605b.U.f2535g.f2612i.f2576k.add(this.f2611h);
            this.f2611h.f2571f = -d1;
        } else {
            f fVar2 = this.f2611h;
            fVar2.f2567b = true;
            fVar2.l.add(this.f2605b.U.f2535g.f2612i);
            this.f2605b.U.f2535g.f2612i.f2576k.add(this.f2611h);
        }
        q(this.f2605b.f2535g.f2611h);
        q(this.f2605b.f2535g.f2612i);
    }

    @Override // c.f.b.k.m.p
    public void e() {
        if (((c.f.b.k.g) this.f2605b).b1() == 1) {
            this.f2605b.V0(this.f2611h.f2572g);
        } else {
            this.f2605b.W0(this.f2611h.f2572g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void f() {
        this.f2611h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public boolean m() {
        return false;
    }
}
