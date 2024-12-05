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

/* compiled from: Canceler.java */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: k, reason: collision with root package name */
    static k.b.b f18435k = k.b.c.i(b.class.getName());

    public b(l lVar) {
        super(lVar, 0);
        g gVar = g.l;
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
        sb.append("Canceler(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // i.a.g.t.e.c
    protected void h() {
        t(q().d());
        if (q().o()) {
            return;
        }
        cancel();
    }

    @Override // i.a.g.t.e.c
    protected f j(f fVar) throws IOException {
        Iterator<h> it = e().H0().a(i.a.g.s.d.CLASS_ANY, true, o()).iterator();
        while (it.hasNext()) {
            fVar = a(fVar, null, it.next());
        }
        return fVar;
    }

    @Override // i.a.g.t.e.c
    protected f k(q qVar, f fVar) throws IOException {
        Iterator<h> it = qVar.C(i.a.g.s.d.CLASS_ANY, true, o(), e().H0()).iterator();
        while (it.hasNext()) {
            fVar = a(fVar, null, it.next());
        }
        return fVar;
    }

    @Override // i.a.g.t.e.c
    protected boolean l() {
        return true;
    }

    @Override // i.a.g.t.e.c
    protected f m() {
        return new f(33792);
    }

    @Override // i.a.g.t.e.c
    public String p() {
        return "canceling";
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
        timer.schedule(this, 0L, 1000L);
    }
}
