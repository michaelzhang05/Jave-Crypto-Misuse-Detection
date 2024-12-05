package androidx.compose.foundation.gestures;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ S $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, S s8) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = s8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m431invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2750unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m431invokeUv8p0NA(PointerInputChange event, long j8) {
        AbstractC3255y.i(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        event.consume();
        this.$initialDelta.f34161a = j8;
    }
}
