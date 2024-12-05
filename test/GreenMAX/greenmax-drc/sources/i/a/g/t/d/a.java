package i.a.g.t.d;

import i.a.g.f;
import i.a.g.l;
import java.io.IOException;
import java.util.Timer;

/* compiled from: DNSResolverTask.java */
/* loaded from: classes2.dex */
public abstract class a extends i.a.g.t.a {

    /* renamed from: g, reason: collision with root package name */
    private static k.b.b f18430g = k.b.c.i(a.class.getName());

    /* renamed from: h, reason: collision with root package name */
    protected int f18431h;

    public a(l lVar) {
        super(lVar);
        this.f18431h = 0;
    }

    protected abstract f g(f fVar) throws IOException;

    protected abstract f h(f fVar) throws IOException;

    protected abstract String i();

    public void j(Timer timer) {
        if (e().Y0() || e().X0()) {
            return;
        }
        timer.schedule(this, 225L, 225L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (!e().Y0() && !e().X0()) {
                int i2 = this.f18431h;
                this.f18431h = i2 + 1;
                if (i2 < 3) {
                    if (f18430g.b()) {
                        f18430g.c(f() + ".run() JmDNS " + i());
                    }
                    f h2 = h(new f(0));
                    if (e().V0()) {
                        h2 = g(h2);
                    }
                    if (h2.n()) {
                        return;
                    }
                    e().o1(h2);
                    return;
                }
                cancel();
                return;
            }
            cancel();
        } catch (Throwable th) {
            f18430g.f(f() + ".run() exception ", th);
            e().d1();
        }
    }

    @Override // i.a.g.t.a
    public String toString() {
        return super.toString() + " count: " + this.f18431h;
    }
}
