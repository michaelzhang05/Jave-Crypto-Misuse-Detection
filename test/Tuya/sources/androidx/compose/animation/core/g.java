package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static long a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        AbstractC3159y.i(initialValue, "initialValue");
        AbstractC3159y.i(targetValue, "targetValue");
        AbstractC3159y.i(initialVelocity, "initialVelocity");
        return (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
    }
}
