package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$2(BottomDrawerState bottomDrawerState) {
        super(0);
        this.this$0 = bottomDrawerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Density requireDensity;
        float f8;
        requireDensity = this.this$0.requireDensity();
        f8 = DrawerKt.DrawerVelocityThreshold;
        return Float.valueOf(requireDensity.mo448toPx0680j_4(f8));
    }
}