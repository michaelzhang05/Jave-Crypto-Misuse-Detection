package androidx.compose.material;

import a6.InterfaceC1669o;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class CheckboxKt$CheckboxImpl$checkDrawFraction$2 extends AbstractC3256z implements InterfaceC1669o {
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$2 INSTANCE = new CheckboxKt$CheckboxImpl$checkDrawFraction$2();

    CheckboxKt$CheckboxImpl$checkDrawFraction$2() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> animateFloat, Composer composer, int i8) {
        FiniteAnimationSpec<Float> snap;
        AbstractC3255y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-1707702900);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1707702900, i8, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
        }
        ToggleableState initialState = animateFloat.getInitialState();
        ToggleableState toggleableState = ToggleableState.Off;
        if (initialState == toggleableState) {
            snap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
        } else {
            snap = animateFloat.getTargetState() == toggleableState ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snap;
    }
}
