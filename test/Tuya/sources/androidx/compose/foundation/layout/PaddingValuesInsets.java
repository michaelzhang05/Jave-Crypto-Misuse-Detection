package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        AbstractC3159y.i(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return AbstractC3159y.d(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3159y.i(density, "density");
        return density.mo442roundToPx0680j_4(this.paddingValues.mo550calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return density.mo442roundToPx0680j_4(this.paddingValues.mo551calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return density.mo442roundToPx0680j_4(this.paddingValues.mo552calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3159y.i(density, "density");
        return density.mo442roundToPx0680j_4(this.paddingValues.mo553calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) Dp.m5189toStringimpl(this.paddingValues.mo551calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m5189toStringimpl(this.paddingValues.mo553calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m5189toStringimpl(this.paddingValues.mo552calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m5189toStringimpl(this.paddingValues.mo550calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
