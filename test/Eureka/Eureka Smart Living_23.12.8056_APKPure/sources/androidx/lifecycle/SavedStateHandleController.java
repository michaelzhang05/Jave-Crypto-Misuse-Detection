package androidx.lifecycle;

import androidx.lifecycle.h;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements k {

    /* renamed from: a, reason: collision with root package name */
    private final String f3046a;

    /* renamed from: b, reason: collision with root package name */
    private final y f3047b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3048c;

    public SavedStateHandleController(String str, y yVar) {
        f5.h.e(str, "key");
        f5.h.e(yVar, "handle");
        this.f3046a = str;
        this.f3047b = yVar;
    }

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        f5.h.e(mVar, "source");
        f5.h.e(aVar, "event");
        if (aVar == h.a.ON_DESTROY) {
            this.f3048c = false;
            mVar.r().c(this);
        }
    }

    public final void h(androidx.savedstate.a aVar, h hVar) {
        f5.h.e(aVar, "registry");
        f5.h.e(hVar, "lifecycle");
        if (!(!this.f3048c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f3048c = true;
        hVar.a(this);
        aVar.h(this.f3046a, this.f3047b.c());
    }

    public final y i() {
        return this.f3047b;
    }

    public final boolean j() {
        return this.f3048c;
    }
}
