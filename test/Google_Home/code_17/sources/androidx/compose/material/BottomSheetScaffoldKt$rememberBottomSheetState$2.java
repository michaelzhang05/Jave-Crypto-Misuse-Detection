package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$rememberBottomSheetState$2 extends AbstractC3256z implements Function0 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomSheetValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$rememberBottomSheetState$2(BottomSheetValue bottomSheetValue, Density density, AnimationSpec<Float> animationSpec, Function1 function1) {
        super(0);
        this.$initialValue = bottomSheetValue;
        this.$density = density;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BottomSheetState invoke() {
        return BottomSheetScaffoldKt.BottomSheetState(this.$initialValue, this.$density, this.$animationSpec, this.$confirmStateChange);
    }
}
