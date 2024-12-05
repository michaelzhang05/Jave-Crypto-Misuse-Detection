package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
class z1 extends c<kotlin.u> {
    public z1(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.r1
    protected boolean F(Throwable th) {
        e0.a(getContext(), th);
        return true;
    }
}
