package B1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final n f720a;

    private a(n nVar) {
        this.f720a = nVar;
    }

    public static a a(b bVar) {
        n nVar = (n) bVar;
        H1.g.d(bVar, "AdSession is null");
        H1.g.l(nVar);
        H1.g.g(nVar);
        a aVar = new a(nVar);
        nVar.w().c(aVar);
        return aVar;
    }

    public void b() {
        H1.g.g(this.f720a);
        H1.g.j(this.f720a);
        if (!this.f720a.t()) {
            try {
                this.f720a.g();
            } catch (Exception unused) {
            }
        }
        if (this.f720a.t()) {
            this.f720a.A();
        }
    }

    public void c(C1.d dVar) {
        H1.g.d(dVar, "VastProperties is null");
        H1.g.c(this.f720a);
        H1.g.j(this.f720a);
        this.f720a.l(dVar.a());
    }
}
