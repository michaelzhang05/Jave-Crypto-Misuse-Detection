package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class DraggableKt$onDragOrUp$motionFromChange$2 extends AbstractC3160z implements Function1 {
    public static final DraggableKt$onDragOrUp$motionFromChange$2 INSTANCE = new DraggableKt$onDragOrUp$motionFromChange$2();

    DraggableKt$onDragOrUp$motionFromChange$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(PointerInputChange it) {
        AbstractC3159y.i(it, "it");
        return Float.valueOf(Offset.m2735getXimpl(PointerEventKt.positionChangeIgnoreConsumed(it)));
    }
}
