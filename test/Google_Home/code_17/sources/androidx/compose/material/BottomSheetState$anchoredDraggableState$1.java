package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetState$anchoredDraggableState$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ BottomSheetState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState$anchoredDraggableState$1(BottomSheetState bottomSheetState) {
        super(1);
        this.this$0 = bottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f8) {
        Density requireDensity;
        float f9;
        requireDensity = this.this$0.requireDensity();
        f9 = BottomSheetScaffoldKt.BottomSheetScaffoldPositionalThreshold;
        return Float.valueOf(requireDensity.mo453toPx0680j_4(f9));
    }
}
