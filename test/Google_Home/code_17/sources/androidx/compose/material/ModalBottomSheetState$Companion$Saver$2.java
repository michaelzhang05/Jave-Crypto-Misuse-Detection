package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$Companion$Saver$2(Density density, AnimationSpec<Float> animationSpec, Function1 function1, boolean z8) {
        super(1);
        this.$density = density;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ModalBottomSheetState invoke(ModalBottomSheetValue it) {
        AbstractC3255y.i(it, "it");
        return ModalBottomSheetKt.ModalBottomSheetState(it, this.$density, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
