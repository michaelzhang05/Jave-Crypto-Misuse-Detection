package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public final class FlowExtKt {
    public static final <T> InterfaceC3358f flowWithLifecycle(InterfaceC3358f interfaceC3358f, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        AbstractC3159y.i(interfaceC3358f, "<this>");
        AbstractC3159y.i(lifecycle, "lifecycle");
        AbstractC3159y.i(minActiveState, "minActiveState");
        return AbstractC3360h.e(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, interfaceC3358f, null));
    }

    public static /* synthetic */ InterfaceC3358f flowWithLifecycle$default(InterfaceC3358f interfaceC3358f, Lifecycle lifecycle, Lifecycle.State state, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC3358f, lifecycle, state);
    }
}
