package o3;

import g3.y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o3.r;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f8239b = new i();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f8240a = new AtomicReference(new r.b().e());

    public static i a() {
        return f8239b;
    }

    public boolean b(q qVar) {
        return ((r) this.f8240a.get()).e(qVar);
    }

    public g3.g c(q qVar, y yVar) {
        return ((r) this.f8240a.get()).f(qVar, yVar);
    }

    public g3.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e6) {
            throw new s("Creating a LegacyProtoKey failed", e6);
        }
    }

    public synchronized void e(b bVar) {
        this.f8240a.set(new r.b((r) this.f8240a.get()).f(bVar).e());
    }

    public synchronized void f(c cVar) {
        this.f8240a.set(new r.b((r) this.f8240a.get()).g(cVar).e());
    }

    public synchronized void g(j jVar) {
        this.f8240a.set(new r.b((r) this.f8240a.get()).h(jVar).e());
    }

    public synchronized void h(k kVar) {
        this.f8240a.set(new r.b((r) this.f8240a.get()).i(kVar).e());
    }
}
