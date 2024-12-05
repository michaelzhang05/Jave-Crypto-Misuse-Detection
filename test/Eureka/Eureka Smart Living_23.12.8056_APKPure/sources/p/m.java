package p;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f8736w0 = new ArrayList();

    public abstract void K0();

    public void L0(e eVar) {
        this.f8736w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f8736w0.clear();
    }

    @Override // p.e
    public void Y() {
        this.f8736w0.clear();
        super.Y();
    }

    @Override // p.e
    public void a0(o.c cVar) {
        super.a0(cVar);
        int size = this.f8736w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) this.f8736w0.get(i6)).a0(cVar);
        }
    }

    public void c(e eVar) {
        this.f8736w0.add(eVar);
        if (eVar.G() != null) {
            ((m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }
}
