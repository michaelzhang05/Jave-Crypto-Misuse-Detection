package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheetState$anchoredDraggableState$2 extends AbstractC3256z implements Function0 {
    final /* synthetic */ ModalBottomSheetState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$anchoredDraggableState$2(ModalBottomSheetState modalBottomSheetState) {
        super(0);
        this.this$0 = modalBottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Density requireDensity;
        float f8;
        requireDensity = this.this$0.requireDensity();
        f8 = ModalBottomSheetKt.ModalBottomSheetVelocityThreshold;
        return Float.valueOf(requireDensity.mo453toPx0680j_4(f8));
    }
}
