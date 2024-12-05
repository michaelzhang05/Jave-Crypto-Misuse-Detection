package androidx.compose.foundation.gestures;

import L5.I;
import X5.n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends AbstractC3160z implements n {
    final /* synthetic */ S $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, S s8) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = s8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m426invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2745unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m426invokeUv8p0NA(PointerInputChange event, long j8) {
        AbstractC3159y.i(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        event.consume();
        this.$initialDelta.f33760a = j8;
    }
}
