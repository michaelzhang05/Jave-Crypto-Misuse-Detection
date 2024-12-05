package androidx.lifecycle;

import androidx.lifecycle.h;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements k {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f3045a;

    public SavedStateHandleAttacher(a0 a0Var) {
        f5.h.e(a0Var, "provider");
        this.f3045a = a0Var;
    }

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        f5.h.e(mVar, "source");
        f5.h.e(aVar, "event");
        if (aVar == h.a.ON_CREATE) {
            mVar.r().c(this);
            this.f3045a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
