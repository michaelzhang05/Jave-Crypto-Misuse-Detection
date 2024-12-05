package androidx.compose.foundation.gestures;

import L5.I;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import k6.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DraggableKt$awaitDrag$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ v $channel;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDrag$2(VelocityTracker velocityTracker, v vVar, boolean z8) {
        super(1);
        this.$velocityTracker = velocityTracker;
        this.$channel = vVar;
        this.$reverseDirection = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return I.f6487a;
    }

    public final void invoke(PointerInputChange event) {
        AbstractC3159y.i(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        if (PointerEventKt.changedToUpIgnoreConsumed(event)) {
            return;
        }
        long positionChange = PointerEventKt.positionChange(event);
        event.consume();
        v vVar = this.$channel;
        if (this.$reverseDirection) {
            positionChange = Offset.m2742timestuRUvjQ(positionChange, -1.0f);
        }
        vVar.y(new DragEvent.DragDelta(positionChange, null));
    }
}
