package i.a.g.t.e;

import i.a.g.f;
import i.a.g.h;
import i.a.g.l;
import i.a.g.q;
import i.a.g.s.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.HttpUrl;

/* compiled from: Prober.java */
/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: k, reason: collision with root package name */
    static k.b.b f18440k = k.b.c.i(d.class.getName());

    public d(l lVar) {
        super(lVar, c.n());
        g gVar = g.f18411f;
        t(gVar);
        i(gVar);
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        s();
        return super.cancel();
    }

    @Override // i.a.g.t.a
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // i.a.g.t.e.c
    protected void h() {
        t(q().d());
        if (q().C()) {
            return;
        }
        cancel();
        e().L();
    }

    @Override // i.a.g.t.e.c
    protected f j(f fVar) throws IOException {
        fVar.A(i.a.g.g.C(e().H0().q(), i.a.g.s.e.TYPE_ANY, i.a.g.s.d.CLASS_IN, false));
        Iterator<h> it = e().H0().a(i.a.g.s.d.CLASS_ANY, false, o()).iterator();
        while (it.hasNext()) {
            fVar = c(fVar, it.next());
        }
        return fVar;
    }

    @Override // i.a.g.t.e.c
    protected f k(q qVar, f fVar) throws IOException {
        String n = qVar.n();
        i.a.g.s.e eVar = i.a.g.s.e.TYPE_ANY;
        i.a.g.s.d dVar = i.a.g.s.d.CLASS_IN;
        return c(d(fVar, i.a.g.g.C(n, eVar, dVar, false)), new h.f(qVar.n(), dVar, false, o(), qVar.l(), qVar.t(), qVar.k(), e().H0().q()));
    }

    @Override // i.a.g.t.e.c
    protected boolean l() {
        return (e().Y0() || e().X0()) ? false : true;
    }

    @Override // i.a.g.t.e.c
    protected f m() {
        return new f(0);
    }

    @Override // i.a.g.t.e.c
    public String p() {
        return "probing";
    }

    @Override // i.a.g.t.e.c
    protected void r(Throwable th) {
        e().d1();
    }

    @Override // i.a.g.t.a
    public String toString() {
        return super.toString() + " state: " + q();
    }

    public void u(Timer timer) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - e().G0() < 5000) {
            e().q1(e().O0() + 1);
        } else {
            e().q1(1);
        }
        e().p1(currentTimeMillis);
        if (e().V0() && e().O0() < 10) {
            timer.schedule(this, l.J0().nextInt(251), 250L);
        } else {
            if (e().Y0() || e().X0()) {
                return;
            }
            timer.schedule(this, 1000L, 1000L);
        }
    }
}
