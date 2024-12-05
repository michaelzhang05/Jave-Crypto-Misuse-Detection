package androidx.compose.foundation.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2 extends AbstractC3256z implements InterfaceC1669o {
    public static final FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2 INSTANCE = new FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2();

    FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8, int i9) {
        AbstractC3255y.i(intrinsicMeasurable, "$this$null");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i9));
    }
}
