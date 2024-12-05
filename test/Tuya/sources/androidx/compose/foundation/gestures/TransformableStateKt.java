package androidx.compose.foundation.gestures;

import L5.I;
import X5.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
public final class TransformableStateKt {
    public static final TransformableState TransformableState(o onTransformation) {
        AbstractC3159y.i(onTransformation, "onTransformation");
        return new DefaultTransformableState(onTransformation);
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m477animatePanByubNVwUQ(TransformableState transformableState, long j8, AnimationSpec<Offset> animationSpec, P5.d dVar) {
        S s8 = new S();
        s8.f33760a = Offset.Companion.m2751getZeroF1C5BW0();
        Object a8 = e.a(transformableState, null, new TransformableStateKt$animatePanBy$2(s8, j8, animationSpec, null), dVar, 1, null);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m478animatePanByubNVwUQ$default(TransformableState transformableState, long j8, AnimationSpec animationSpec, P5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m477animatePanByubNVwUQ(transformableState, j8, animationSpec, dVar);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f8, AnimationSpec<Float> animationSpec, P5.d dVar) {
        Object a8 = e.a(transformableState, null, new TransformableStateKt$animateRotateBy$2(new P(), f8, animationSpec, null), dVar, 1, null);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f8, AnimationSpec animationSpec, P5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f8, animationSpec, dVar);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f8, AnimationSpec<Float> animationSpec, P5.d dVar) {
        if (f8 > 0.0f) {
            P p8 = new P();
            p8.f33758a = 1.0f;
            Object a8 = e.a(transformableState, null, new TransformableStateKt$animateZoomBy$3(p8, f8, animationSpec, null), dVar, 1, null);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6487a;
        }
        throw new IllegalArgumentException("zoom value should be greater than 0".toString());
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f8, AnimationSpec animationSpec, P5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f8, animationSpec, dVar);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m479panByd4ec7I(TransformableState transformableState, long j8, P5.d dVar) {
        Object a8 = e.a(transformableState, null, new TransformableStateKt$panBy$2(j8, null), dVar, 1, null);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(o onTransformation, Composer composer, int i8) {
        AbstractC3159y.i(onTransformation, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i8, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTransformation, composer, i8 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new TransformableStateKt$rememberTransformableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f8, P5.d dVar) {
        Object a8 = e.a(transformableState, null, new TransformableStateKt$rotateBy$2(f8, null), dVar, 1, null);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, P5.d dVar) {
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2(null), dVar);
        if (transform == Q5.b.e()) {
            return transform;
        }
        return I.f6487a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, dVar);
    }

    public static final Object zoomBy(TransformableState transformableState, float f8, P5.d dVar) {
        Object a8 = e.a(transformableState, null, new TransformableStateKt$zoomBy$2(f8, null), dVar, 1, null);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }
}
