package i.a.g.t;

import i.a.g.f;
import i.a.g.g;
import i.a.g.h;
import i.a.g.l;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import okhttp3.HttpUrl;

/* compiled from: Responder.java */
/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    static k.b.b f18425g = k.b.c.i(c.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private final i.a.g.c f18426h;

    /* renamed from: i, reason: collision with root package name */
    private final InetAddress f18427i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18428j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f18429k;

    public c(l lVar, i.a.g.c cVar, InetAddress inetAddress, int i2) {
        super(lVar);
        this.f18426h = cVar;
        this.f18427i = inetAddress;
        this.f18428j = i2;
        this.f18429k = i2 != i.a.g.s.a.a;
    }

    @Override // i.a.g.t.a
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    public void g(Timer timer) {
        boolean z = true;
        for (g gVar : this.f18426h.l()) {
            if (f18425g.d()) {
                f18425g.i(f() + "start() question=" + gVar);
            }
            z = gVar.B(e());
            if (!z) {
                break;
            }
        }
        int nextInt = (!z || this.f18426h.r()) ? (l.J0().nextInt(96) + 20) - this.f18426h.A() : 0;
        int i2 = nextInt >= 0 ? nextInt : 0;
        if (f18425g.d()) {
            f18425g.i(f() + "start() Responder chosen delay=" + i2);
        }
        if (e().Y0() || e().X0()) {
            return;
        }
        timer.schedule(this, i2);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        e().m1(this.f18426h);
        HashSet<g> hashSet = new HashSet();
        Set<h> hashSet2 = new HashSet<>();
        if (e().V0()) {
            try {
                for (g gVar : this.f18426h.l()) {
                    if (f18425g.b()) {
                        f18425g.c(f() + "run() JmDNS responding to: " + gVar);
                    }
                    if (this.f18429k) {
                        hashSet.add(gVar);
                    }
                    gVar.y(e(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (h hVar : this.f18426h.c()) {
                    if (hVar.J(currentTimeMillis)) {
                        hashSet2.remove(hVar);
                        if (f18425g.b()) {
                            f18425g.c(f() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                if (f18425g.b()) {
                    f18425g.c(f() + "run() JmDNS responding");
                }
                f fVar = new f(33792, !this.f18429k, this.f18426h.B());
                if (this.f18429k) {
                    fVar.F(new InetSocketAddress(this.f18427i, this.f18428j));
                }
                fVar.w(this.f18426h.f());
                for (g gVar2 : hashSet) {
                    if (gVar2 != null) {
                        fVar = d(fVar, gVar2);
                    }
                }
                for (h hVar2 : hashSet2) {
                    if (hVar2 != null) {
                        fVar = a(fVar, this.f18426h, hVar2);
                    }
                }
                if (fVar.n()) {
                    return;
                }
                e().o1(fVar);
            } catch (Throwable th) {
                f18425g.f(f() + "run() exception ", th);
                e().close();
            }
        }
    }

    @Override // i.a.g.t.a
    public String toString() {
        return super.toString() + " incomming: " + this.f18426h;
    }
}
