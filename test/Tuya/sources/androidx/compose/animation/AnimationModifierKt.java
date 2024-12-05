package androidx.compose.animation;

import X5.n;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class AnimationModifierKt {
    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> animationSpec, n nVar) {
        Function1 noInspectorInfo;
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(animationSpec, "animationSpec");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(animationSpec, nVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new AnimationModifierKt$animateContentSize$2(nVar, animationSpec));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, n nVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i8 & 2) != 0) {
            nVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, nVar);
    }
}
