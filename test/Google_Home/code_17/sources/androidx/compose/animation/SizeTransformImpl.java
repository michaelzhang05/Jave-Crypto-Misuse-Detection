package androidx.compose.animation;

import a6.InterfaceC1668n;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final InterfaceC1668n sizeAnimationSpec;

    public SizeTransformImpl(boolean z8, InterfaceC1668n sizeAnimationSpec) {
        AbstractC3255y.i(sizeAnimationSpec, "sizeAnimationSpec");
        this.clip = z8;
        this.sizeAnimationSpec = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo199createAnimationSpecTemP2vQ(long j8, long j9) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m5341boximpl(j8), IntSize.m5341boximpl(j9));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final InterfaceC1668n getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z8, InterfaceC1668n interfaceC1668n, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? true : z8, interfaceC1668n);
    }
}
