package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        AbstractC3255y.i(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return AbstractC3255y.d(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3255y.i(density, "density");
        return density.mo447roundToPx0680j_4(this.paddingValues.mo555calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return density.mo447roundToPx0680j_4(this.paddingValues.mo556calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return density.mo447roundToPx0680j_4(this.paddingValues.mo557calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3255y.i(density, "density");
        return density.mo447roundToPx0680j_4(this.paddingValues.mo558calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) Dp.m5194toStringimpl(this.paddingValues.mo556calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m5194toStringimpl(this.paddingValues.mo558calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m5194toStringimpl(this.paddingValues.mo557calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m5194toStringimpl(this.paddingValues.mo555calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
