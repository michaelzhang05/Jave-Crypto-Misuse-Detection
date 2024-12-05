package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class FlowExtKt {
    public static final <T> InterfaceC3706f flowWithLifecycle(InterfaceC3706f interfaceC3706f, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        AbstractC3255y.i(interfaceC3706f, "<this>");
        AbstractC3255y.i(lifecycle, "lifecycle");
        AbstractC3255y.i(minActiveState, "minActiveState");
        return AbstractC3708h.e(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, interfaceC3706f, null));
    }

    public static /* synthetic */ InterfaceC3706f flowWithLifecycle$default(InterfaceC3706f interfaceC3706f, Lifecycle lifecycle, Lifecycle.State state, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC3706f, lifecycle, state);
    }
}
