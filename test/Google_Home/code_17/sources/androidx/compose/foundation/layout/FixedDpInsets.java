package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f8, float f9, float f10, float f11, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        if (Dp.m5188equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m5188equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m5188equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m5188equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3255y.i(density, "density");
        return density.mo447roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return density.mo447roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return density.mo447roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3255y.i(density, "density");
        return density.mo447roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((Dp.m5189hashCodeimpl(this.leftDp) * 31) + Dp.m5189hashCodeimpl(this.topDp)) * 31) + Dp.m5189hashCodeimpl(this.rightDp)) * 31) + Dp.m5189hashCodeimpl(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) Dp.m5194toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m5194toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m5194toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m5194toStringimpl(this.bottomDp)) + ')';
    }

    private FixedDpInsets(float f8, float f9, float f10, float f11) {
        this.leftDp = f8;
        this.topDp = f9;
        this.rightDp = f10;
        this.bottomDp = f11;
    }
}
