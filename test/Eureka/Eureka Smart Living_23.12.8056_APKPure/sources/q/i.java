package q;

import java.util.Iterator;
import q.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends m {
    public i(p.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f8960h.f8928k.add(fVar);
        fVar.f8929l.add(this.f8960h);
    }

    @Override // q.m, q.d
    public void a(d dVar) {
        p.a aVar = (p.a) this.f8954b;
        int L0 = aVar.L0();
        Iterator it = this.f8960h.f8929l.iterator();
        int i6 = 0;
        int i7 = -1;
        while (it.hasNext()) {
            int i8 = ((f) it.next()).f8924g;
            if (i7 == -1 || i8 < i7) {
                i7 = i8;
            }
            if (i6 < i8) {
                i6 = i8;
            }
        }
        if (L0 == 0 || L0 == 2) {
            this.f8960h.d(i7 + aVar.M0());
        } else {
            this.f8960h.d(i6 + aVar.M0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void d() {
        m mVar;
        p.e eVar = this.f8954b;
        if (eVar instanceof p.a) {
            this.f8960h.f8919b = true;
            p.a aVar = (p.a) eVar;
            int L0 = aVar.L0();
            boolean K0 = aVar.K0();
            int i6 = 0;
            if (L0 == 0) {
                this.f8960h.f8922e = f.a.LEFT;
                while (i6 < aVar.f8732x0) {
                    p.e eVar2 = aVar.f8731w0[i6];
                    if (K0 || eVar2.O() != 8) {
                        f fVar = eVar2.f8649e.f8960h;
                        fVar.f8928k.add(this.f8960h);
                        this.f8960h.f8929l.add(fVar);
                    }
                    i6++;
                }
            } else {
                if (L0 != 1) {
                    if (L0 == 2) {
                        this.f8960h.f8922e = f.a.TOP;
                        while (i6 < aVar.f8732x0) {
                            p.e eVar3 = aVar.f8731w0[i6];
                            if (K0 || eVar3.O() != 8) {
                                f fVar2 = eVar3.f8651f.f8960h;
                                fVar2.f8928k.add(this.f8960h);
                                this.f8960h.f8929l.add(fVar2);
                            }
                            i6++;
                        }
                    } else {
                        if (L0 != 3) {
                            return;
                        }
                        this.f8960h.f8922e = f.a.BOTTOM;
                        while (i6 < aVar.f8732x0) {
                            p.e eVar4 = aVar.f8731w0[i6];
                            if (K0 || eVar4.O() != 8) {
                                f fVar3 = eVar4.f8651f.f8961i;
                                fVar3.f8928k.add(this.f8960h);
                                this.f8960h.f8929l.add(fVar3);
                            }
                            i6++;
                        }
                    }
                    q(this.f8954b.f8651f.f8960h);
                    mVar = this.f8954b.f8651f;
                    q(mVar.f8961i);
                }
                this.f8960h.f8922e = f.a.RIGHT;
                while (i6 < aVar.f8732x0) {
                    p.e eVar5 = aVar.f8731w0[i6];
                    if (K0 || eVar5.O() != 8) {
                        f fVar4 = eVar5.f8649e.f8961i;
                        fVar4.f8928k.add(this.f8960h);
                        this.f8960h.f8929l.add(fVar4);
                    }
                    i6++;
                }
            }
            q(this.f8954b.f8649e.f8960h);
            mVar = this.f8954b.f8649e;
            q(mVar.f8961i);
        }
    }

    @Override // q.m
    public void e() {
        p.e eVar = this.f8954b;
        if (eVar instanceof p.a) {
            int L0 = ((p.a) eVar).L0();
            if (L0 == 0 || L0 == 1) {
                this.f8954b.F0(this.f8960h.f8924g);
            } else {
                this.f8954b.G0(this.f8960h.f8924g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void f() {
        this.f8955c = null;
        this.f8960h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public boolean m() {
        return false;
    }
}
