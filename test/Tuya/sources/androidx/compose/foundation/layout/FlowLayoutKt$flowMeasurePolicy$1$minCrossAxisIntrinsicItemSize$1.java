package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1 extends AbstractC3160z implements X5.o {
    public static final FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1 INSTANCE = new FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1();

    FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1() {
        super(3);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8, int i9) {
        AbstractC3159y.i(intrinsicMeasurable, "$this$null");
        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i9));
    }
}
