package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {
    private final FloatDecayAnimationSpec floatDecaySpec;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecaySpec) {
        AbstractC3159y.i(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(TwoWayConverter<T, V> typeConverter) {
        AbstractC3159y.i(typeConverter, "typeConverter");
        return new VectorizedFloatDecaySpec(this.floatDecaySpec);
    }
}
