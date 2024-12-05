package e.h.a;

import e.h.a.a;
import e.h.a.h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LostServiceConnectedHandler.java */
/* loaded from: classes2.dex */
public class z extends e implements v {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a.b> f17914b = new ArrayList<>();

    @Override // e.h.a.v
    public boolean a(a.b bVar) {
        return !this.f17914b.isEmpty() && this.f17914b.contains(bVar);
    }

    @Override // e.h.a.v
    public boolean b(a.b bVar) {
        if (!q.e().i()) {
            synchronized (this.f17914b) {
                if (!q.e().i()) {
                    if (e.h.a.k0.d.a) {
                        e.h.a.k0.d.a(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.v().getId()));
                    }
                    m.b().Y(e.h.a.k0.c.a());
                    if (!this.f17914b.contains(bVar)) {
                        bVar.b();
                        this.f17914b.add(bVar);
                    }
                    return true;
                }
            }
        }
        c(bVar);
        return false;
    }

    @Override // e.h.a.v
    public void c(a.b bVar) {
        if (this.f17914b.isEmpty()) {
            return;
        }
        synchronized (this.f17914b) {
            this.f17914b.remove(bVar);
        }
    }

    @Override // e.h.a.e
    public void e() {
        w g2 = q.e().g();
        if (e.h.a.k0.d.a) {
            e.h.a.k0.d.a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f17914b) {
            List<a.b> list = (List) this.f17914b.clone();
            this.f17914b.clear();
            ArrayList arrayList = new ArrayList(g2.a());
            for (a.b bVar : list) {
                int x = bVar.x();
                if (g2.f(x)) {
                    bVar.v().l().a();
                    if (!arrayList.contains(Integer.valueOf(x))) {
                        arrayList.add(Integer.valueOf(x));
                    }
                } else {
                    bVar.w();
                }
            }
            g2.d(arrayList);
        }
    }

    @Override // e.h.a.e
    public void f() {
        if (g() == b.a.lost) {
            w g2 = q.e().g();
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(h.i().m()));
            }
            if (h.i().m() > 0) {
                synchronized (this.f17914b) {
                    h.i().f(this.f17914b);
                    Iterator<a.b> it = this.f17914b.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                    g2.b();
                }
                try {
                    q.e().b();
                    return;
                } catch (IllegalStateException unused) {
                    e.h.a.k0.d.i(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
                    return;
                }
            }
            return;
        }
        if (h.i().m() > 0) {
            e.h.a.k0.d.i(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(h.i().m()));
        }
    }
}
