package o3;

import g3.v;
import g3.w;
import java.util.concurrent.atomic.AtomicReference;
import o3.n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static h f8237b = new h();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f8238a = new AtomicReference(new n.b().c());

    h() {
    }

    public static h c() {
        return f8237b;
    }

    public Class a(Class cls) {
        return ((n) this.f8238a.get()).c(cls);
    }

    public Object b(g3.g gVar, Class cls) {
        return ((n) this.f8238a.get()).d(gVar, cls);
    }

    public synchronized void d(l lVar) {
        this.f8238a.set(new n.b((n) this.f8238a.get()).d(lVar).c());
    }

    public synchronized void e(w wVar) {
        this.f8238a.set(new n.b((n) this.f8238a.get()).e(wVar).c());
    }

    public Object f(v vVar, Class cls) {
        return ((n) this.f8238a.get()).e(vVar, cls);
    }
}
