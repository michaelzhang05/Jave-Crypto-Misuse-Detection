package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: Unconfined.kt */
/* loaded from: classes2.dex */
public final class c2 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c2 f22142g = new c2();

    private c2() {
    }

    @Override // kotlinx.coroutines.c0
    public void s0(CoroutineContext coroutineContext, Runnable runnable) {
        f2 f2Var = (f2) coroutineContext.get(f2.f22153f);
        if (f2Var != null) {
            f2Var.f22154g = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.c0
    public boolean t0(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // kotlinx.coroutines.c0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
