package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static AnimationVector a(VectorizedAnimationSpec vectorizedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        AbstractC3255y.i(initialValue, "initialValue");
        AbstractC3255y.i(targetValue, "targetValue");
        AbstractC3255y.i(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }
}
