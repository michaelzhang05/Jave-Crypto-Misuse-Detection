package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$1 extends AbstractC3256z implements Function1 {
    public static final ScrollableKt$pointerScrollable$1 INSTANCE = new ScrollableKt$pointerScrollable$1();

    ScrollableKt$pointerScrollable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange down) {
        AbstractC3255y.i(down, "down");
        return Boolean.valueOf(!PointerType.m4082equalsimpl0(down.m4024getTypeT8wyACA(), PointerType.Companion.m4087getMouseT8wyACA()));
    }
}
