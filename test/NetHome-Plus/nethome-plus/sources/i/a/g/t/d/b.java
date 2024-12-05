package i.a.g.t.d;

import i.a.g.f;
import i.a.g.g;
import i.a.g.h;
import i.a.g.l;
import i.a.g.q;
import i.a.g.s.d;
import i.a.g.s.e;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: ServiceInfoResolver.java */
/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: i, reason: collision with root package name */
    private final q f18432i;

    public b(l lVar, q qVar) {
        super(lVar);
        this.f18432i = qVar;
        qVar.e0(e());
        e().t0(qVar, g.C(qVar.n(), e.TYPE_ANY, d.CLASS_IN, false));
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean cancel = super.cancel();
        if (!this.f18432i.x()) {
            e().i1(this.f18432i);
        }
        return cancel;
    }

    @Override // i.a.g.t.a
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // i.a.g.t.d.a
    protected f g(f fVar) throws IOException {
        if (!this.f18432i.u()) {
            long currentTimeMillis = System.currentTimeMillis();
            i.a.g.a B0 = e().B0();
            String n = this.f18432i.n();
            e eVar = e.TYPE_SRV;
            d dVar = d.CLASS_IN;
            fVar = b(b(fVar, (h) B0.d(n, eVar, dVar), currentTimeMillis), (h) e().B0().d(this.f18432i.n(), e.TYPE_TXT, dVar), currentTimeMillis);
            if (this.f18432i.p().length() > 0) {
                Iterator<? extends i.a.g.b> it = e().B0().g(this.f18432i.p(), e.TYPE_A, dVar).iterator();
                while (it.hasNext()) {
                    fVar = b(fVar, (h) it.next(), currentTimeMillis);
                }
                Iterator<? extends i.a.g.b> it2 = e().B0().g(this.f18432i.p(), e.TYPE_AAAA, d.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    fVar = b(fVar, (h) it2.next(), currentTimeMillis);
                }
            }
        }
        return fVar;
    }

    @Override // i.a.g.t.d.a
    protected f h(f fVar) throws IOException {
        if (this.f18432i.u()) {
            return fVar;
        }
        String n = this.f18432i.n();
        e eVar = e.TYPE_SRV;
        d dVar = d.CLASS_IN;
        f d2 = d(d(fVar, g.C(n, eVar, dVar, false)), g.C(this.f18432i.n(), e.TYPE_TXT, dVar, false));
        return this.f18432i.p().length() > 0 ? d(d(d2, g.C(this.f18432i.p(), e.TYPE_A, dVar, false)), g.C(this.f18432i.p(), e.TYPE_AAAA, dVar, false)) : d2;
    }

    @Override // i.a.g.t.d.a
    protected String i() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        q qVar = this.f18432i;
        sb.append(qVar != null ? qVar.n() : "null");
        return sb.toString();
    }
}
