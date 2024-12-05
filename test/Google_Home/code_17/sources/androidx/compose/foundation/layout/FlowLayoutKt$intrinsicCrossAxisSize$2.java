package androidx.compose.foundation.layout;

import a6.InterfaceC1669o;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FlowLayoutKt$intrinsicCrossAxisSize$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int[] $crossAxisSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$intrinsicCrossAxisSize$2(int[] iArr) {
        super(3);
        this.$crossAxisSizes = iArr;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicCrossAxisSize, int i8, int i9) {
        AbstractC3255y.i(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.$crossAxisSizes[i8]);
    }
}
