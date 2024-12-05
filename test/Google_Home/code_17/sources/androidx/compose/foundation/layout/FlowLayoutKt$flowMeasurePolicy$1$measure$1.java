package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$measure$1 extends AbstractC3256z implements Function1 {
    public static final FlowLayoutKt$flowMeasurePolicy$1$measure$1 INSTANCE = new FlowLayoutKt$flowMeasurePolicy$1$measure$1();

    FlowLayoutKt$flowMeasurePolicy$1$measure$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3255y.i(layout, "$this$layout");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8278a;
    }
}
