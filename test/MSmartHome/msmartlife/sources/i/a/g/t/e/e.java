package i.a.g.t.e;

import cm.aptoide.pt.BuildConfig;
import i.a.g.f;
import i.a.g.h;
import i.a.g.l;
import i.a.g.q;
import i.a.g.s.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.HttpUrl;

/* compiled from: Renewer.java */
/* loaded from: classes2.dex */
public class e extends c {

    /* renamed from: k, reason: collision with root package name */
    static k.b.b f18441k = k.b.c.i(e.class.getName());

    public e(l lVar) {
        super(lVar, c.n());
        g gVar = g.f18416k;
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
        sb.append("Renewer(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // i.a.g.t.e.c
    protected void h() {
        t(q().d());
        if (q().f()) {
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
        return (e().Y0() || e().X0()) ? false : true;
    }

    @Override // i.a.g.t.e.c
    protected f m() {
        return new f(33792);
    }

    @Override // i.a.g.t.e.c
    public String p() {
        return "renewing";
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
        if (e().Y0() || e().X0()) {
            return;
        }
        timer.schedule(this, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
    }
}
