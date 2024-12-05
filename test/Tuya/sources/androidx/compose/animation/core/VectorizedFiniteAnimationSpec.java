package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            AbstractC3159y.i(initialValue, "initialValue");
            AbstractC3159y.i(targetValue, "targetValue");
            AbstractC3159y.i(initialVelocity, "initialVelocity");
            return (V) h.b(vectorizedFiniteAnimationSpec, initialValue, targetValue, initialVelocity);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return h.c(vectorizedFiniteAnimationSpec);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    boolean isInfinite();
}
