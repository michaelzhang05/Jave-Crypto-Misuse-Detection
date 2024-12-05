package q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends m {
    public h(p.e eVar) {
        super(eVar);
        eVar.f8649e.f();
        eVar.f8651f.f();
        this.f8958f = ((p.h) eVar).K0();
    }

    private void q(f fVar) {
        this.f8960h.f8928k.add(fVar);
        fVar.f8929l.add(this.f8960h);
    }

    @Override // q.m, q.d
    public void a(d dVar) {
        f fVar = this.f8960h;
        if (fVar.f8920c && !fVar.f8927j) {
            this.f8960h.d((int) ((((f) fVar.f8929l.get(0)).f8924g * ((p.h) this.f8954b).N0()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void d() {
        f fVar;
        m mVar;
        f fVar2;
        p.h hVar = (p.h) this.f8954b;
        int L0 = hVar.L0();
        int M0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            f fVar3 = this.f8960h;
            if (L0 != -1) {
                fVar3.f8929l.add(this.f8954b.N.f8649e.f8960h);
                this.f8954b.N.f8649e.f8960h.f8928k.add(this.f8960h);
                fVar2 = this.f8960h;
            } else if (M0 != -1) {
                fVar3.f8929l.add(this.f8954b.N.f8649e.f8961i);
                this.f8954b.N.f8649e.f8961i.f8928k.add(this.f8960h);
                fVar2 = this.f8960h;
                L0 = -M0;
            } else {
                fVar3.f8919b = true;
                fVar3.f8929l.add(this.f8954b.N.f8649e.f8961i);
                this.f8954b.N.f8649e.f8961i.f8928k.add(this.f8960h);
                q(this.f8954b.f8649e.f8960h);
                mVar = this.f8954b.f8649e;
            }
            fVar2.f8923f = L0;
            q(this.f8954b.f8649e.f8960h);
            mVar = this.f8954b.f8649e;
        } else {
            f fVar4 = this.f8960h;
            if (L0 != -1) {
                fVar4.f8929l.add(this.f8954b.N.f8651f.f8960h);
                this.f8954b.N.f8651f.f8960h.f8928k.add(this.f8960h);
                fVar = this.f8960h;
            } else if (M0 != -1) {
                fVar4.f8929l.add(this.f8954b.N.f8651f.f8961i);
                this.f8954b.N.f8651f.f8961i.f8928k.add(this.f8960h);
                fVar = this.f8960h;
                L0 = -M0;
            } else {
                fVar4.f8919b = true;
                fVar4.f8929l.add(this.f8954b.N.f8651f.f8961i);
                this.f8954b.N.f8651f.f8961i.f8928k.add(this.f8960h);
                q(this.f8954b.f8651f.f8960h);
                mVar = this.f8954b.f8651f;
            }
            fVar.f8923f = L0;
            q(this.f8954b.f8651f.f8960h);
            mVar = this.f8954b.f8651f;
        }
        q(mVar.f8961i);
    }

    @Override // q.m
    public void e() {
        if (((p.h) this.f8954b).K0() == 1) {
            this.f8954b.F0(this.f8960h.f8924g);
        } else {
            this.f8954b.G0(this.f8960h.f8924g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void f() {
        this.f8960h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public boolean m() {
        return false;
    }
}
