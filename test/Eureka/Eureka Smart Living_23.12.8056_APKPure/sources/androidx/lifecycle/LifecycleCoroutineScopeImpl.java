package androidx.lifecycle;

import androidx.lifecycle.h;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends i implements k {

    /* renamed from: a, reason: collision with root package name */
    private final h f3023a;

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        f5.h.e(mVar, "source");
        f5.h.e(aVar, "event");
        if (i().b().compareTo(h.b.DESTROYED) <= 0) {
            i().c(this);
            h();
            j5.c.b(null, null, 1, null);
        }
    }

    public b5.a h() {
        return null;
    }

    public h i() {
        return this.f3023a;
    }
}
