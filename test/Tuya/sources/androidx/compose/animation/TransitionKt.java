package androidx.compose.animation;

import X5.o;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Color> animateColor(Transition<S> transition, o oVar, String str, o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3159y.i(transition, "<this>");
        AbstractC3159y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-1939694975);
        if ((i9 & 1) != 0) {
            oVar = TransitionKt$animateColor$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace m2975getColorSpaceimpl = Color.m2975getColorSpaceimpl(((Color) targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf((i8 >> 6) & 112))).m2981unboximpl());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2975getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m2975getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i10 = (i8 & 14) | 64;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Color> createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) oVar.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), (TwoWayConverter) rememberedValue, str2, composer, (i12 & 14) | 32768 | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m197animateColorDTcfvLk(InfiniteTransition animateColor, long j8, long j9, InfiniteRepeatableSpec<Color> animationSpec, String str, Composer composer, int i8, int i9) {
        String str2;
        AbstractC3159y.i(animateColor, "$this$animateColor");
        AbstractC3159y.i(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1901963533);
        if ((i9 & 8) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i8, -1, "androidx.compose.animation.animateColor (Transition.kt:96)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2975getColorSpaceimpl(j9));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i10 = i8 << 3;
        State<Color> animateValue = InfiniteTransitionKt.animateValue(animateColor, Color.m2961boximpl(j8), Color.m2961boximpl(j9), (TwoWayConverter) rememberedValue, animationSpec, str2, composer, InfiniteTransition.$stable | 4096 | (i8 & 14) | (i8 & 112) | (i8 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i10) | (i10 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @Composable
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m198animateColorRIQooxk(InfiniteTransition animateColor, long j8, long j9, InfiniteRepeatableSpec animationSpec, Composer composer, int i8) {
        AbstractC3159y.i(animateColor, "$this$animateColor");
        AbstractC3159y.i(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1400583834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i8, -1, "androidx.compose.animation.animateColor (Transition.kt:113)");
        }
        State<Color> m197animateColorDTcfvLk = m197animateColorDTcfvLk(animateColor, j8, j9, animationSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i8 & 14) | (i8 & 112) | (i8 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i8 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m197animateColorDTcfvLk;
    }
}
