package androidx.compose.material3;

import L5.I;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ float $minBound;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2(Animatable<Float, AnimationVector1D> animatable, float f8) {
        super(0);
        this.$offset = animatable;
        this.$minBound = f8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1822invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1822invoke() {
        Animatable.updateBounds$default(this.$offset, Float.valueOf(this.$minBound), null, 2, null);
    }
}
