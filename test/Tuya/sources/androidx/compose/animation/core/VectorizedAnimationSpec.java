package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            AnimationVector a8;
            AbstractC3159y.i(initialValue, "initialValue");
            AbstractC3159y.i(targetValue, "targetValue");
            AbstractC3159y.i(initialVelocity, "initialVelocity");
            a8 = f.a(vectorizedAnimationSpec, initialValue, targetValue, initialVelocity);
            return (V) a8;
        }
    }

    long getDurationNanos(V v8, V v9, V v10);

    V getEndVelocity(V v8, V v9, V v10);

    V getValueFromNanos(long j8, V v8, V v9, V v10);

    V getVelocityFromNanos(long j8, V v8, V v9, V v10);

    boolean isInfinite();
}
