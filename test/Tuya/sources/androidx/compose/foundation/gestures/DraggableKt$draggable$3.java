package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class DraggableKt$draggable$3 extends AbstractC3160z implements Function1 {
    public static final DraggableKt$draggable$3 INSTANCE = new DraggableKt$draggable$3();

    DraggableKt$draggable$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange it) {
        AbstractC3159y.i(it, "it");
        return Boolean.TRUE;
    }
}
