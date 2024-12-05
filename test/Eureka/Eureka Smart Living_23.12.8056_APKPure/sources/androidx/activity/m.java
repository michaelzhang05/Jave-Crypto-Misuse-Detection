package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private boolean f155a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f156b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private e5.a f157c;

    public m(boolean z5) {
        this.f155a = z5;
    }

    public final void a(a aVar) {
        f5.h.e(aVar, "cancellable");
        this.f156b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f155a;
    }

    public final void d() {
        Iterator it = this.f156b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public final void e(a aVar) {
        f5.h.e(aVar, "cancellable");
        this.f156b.remove(aVar);
    }

    public final void f(boolean z5) {
        this.f155a = z5;
        e5.a aVar = this.f157c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void g(e5.a aVar) {
        this.f157c = aVar;
    }
}
