package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$1(BottomDrawerState bottomDrawerState) {
        super(1);
        this.this$0 = bottomDrawerState;
    }

    public final Float invoke(float f8) {
        Density requireDensity;
        float f9;
        requireDensity = this.this$0.requireDensity();
        f9 = DrawerKt.DrawerPositionalThreshold;
        return Float.valueOf(requireDensity.mo448toPx0680j_4(f9));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
