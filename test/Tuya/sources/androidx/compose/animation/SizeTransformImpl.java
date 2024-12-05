package androidx.compose.animation;

import X5.n;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final n sizeAnimationSpec;

    public SizeTransformImpl(boolean z8, n sizeAnimationSpec) {
        AbstractC3159y.i(sizeAnimationSpec, "sizeAnimationSpec");
        this.clip = z8;
        this.sizeAnimationSpec = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo194createAnimationSpecTemP2vQ(long j8, long j9) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m5336boximpl(j8), IntSize.m5336boximpl(j9));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final n getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z8, n nVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? true : z8, nVar);
    }
}
