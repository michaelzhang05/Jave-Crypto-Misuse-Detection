package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ RepeatableSpec(int i8, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, AbstractC3247p abstractC3247p) {
        this(i8, durationBasedAnimationSpec, repeatMode, j8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
        if (repeatableSpec.iterations != this.iterations || !AbstractC3255y.d(repeatableSpec.animation, this.animation) || repeatableSpec.repeatMode != this.repeatMode || !StartOffset.m239equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset)) {
            return false;
        }
        return true;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m232getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final int getIterations() {
        return this.iterations;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m242hashCodeimpl(this.initialStartOffset);
    }

    private RepeatableSpec(int i8, DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j8) {
        AbstractC3255y.i(animation, "animation");
        AbstractC3255y.i(repeatMode, "repeatMode");
        this.iterations = i8;
        this.animation = animation;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j8;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AbstractC3255y.i(converter, "converter");
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((TwoWayConverter) converter), this.repeatMode, this.initialStartOffset, (AbstractC3247p) null);
    }

    public /* synthetic */ RepeatableSpec(int i8, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, int i9, AbstractC3247p abstractC3247p) {
        this(i8, durationBasedAnimationSpec, (i9 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i9 & 8) != 0 ? StartOffset.m237constructorimpl$default(0, 0, 2, null) : j8, (AbstractC3247p) null);
    }

    public /* synthetic */ RepeatableSpec(int i8, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i9, AbstractC3247p abstractC3247p) {
        this(i8, durationBasedAnimationSpec, (i9 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatableSpec(int i8, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(i8, animation, repeatMode, StartOffset.m237constructorimpl$default(0, 0, 2, null), (AbstractC3247p) null);
        AbstractC3255y.i(animation, "animation");
        AbstractC3255y.i(repeatMode, "repeatMode");
    }
}
