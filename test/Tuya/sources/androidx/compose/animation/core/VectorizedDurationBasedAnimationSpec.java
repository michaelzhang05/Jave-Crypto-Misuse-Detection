package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            long a8;
            AbstractC3159y.i(initialValue, "initialValue");
            AbstractC3159y.i(targetValue, "targetValue");
            AbstractC3159y.i(initialVelocity, "initialVelocity");
            a8 = g.a(vectorizedDurationBasedAnimationSpec, initialValue, targetValue, initialVelocity);
            return a8;
        }

        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            AnimationVector a8;
            AbstractC3159y.i(initialValue, "initialValue");
            AbstractC3159y.i(targetValue, "targetValue");
            AbstractC3159y.i(initialVelocity, "initialVelocity");
            a8 = f.a(vectorizedDurationBasedAnimationSpec, initialValue, targetValue, initialVelocity);
            return (V) a8;
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            boolean a8;
            a8 = h.a(vectorizedDurationBasedAnimationSpec);
            return a8;
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    long getDurationNanos(V v8, V v9, V v10);
}
