package c.f.b.k.m;

import c.f.b.k.m.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f2570e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f2570e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // c.f.b.k.m.f
    public void d(int i2) {
        if (this.f2575j) {
            return;
        }
        this.f2575j = true;
        this.f2572g = i2;
        for (d dVar : this.f2576k) {
            dVar.a(dVar);
        }
    }
}
