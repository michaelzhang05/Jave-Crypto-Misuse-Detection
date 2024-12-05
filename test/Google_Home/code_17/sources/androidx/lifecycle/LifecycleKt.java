package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.U0;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC3255y.i(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, U0.b(null, 1, null).plus(C3347b0.c().G()));
        } while (!androidx.compose.animation.core.d.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final InterfaceC3706f getEventFlow(Lifecycle lifecycle) {
        AbstractC3255y.i(lifecycle, "<this>");
        return AbstractC3708h.C(AbstractC3708h.e(new LifecycleKt$eventFlow$1(lifecycle, null)), C3347b0.c().G());
    }
}
