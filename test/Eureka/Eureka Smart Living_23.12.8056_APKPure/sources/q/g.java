package q;

import q.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f8939m;

    public g(m mVar) {
        super(mVar);
        this.f8922e = mVar instanceof j ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // q.f
    public void d(int i6) {
        if (this.f8927j) {
            return;
        }
        this.f8927j = true;
        this.f8924g = i6;
        for (d dVar : this.f8928k) {
            dVar.a(dVar);
        }
    }
}
