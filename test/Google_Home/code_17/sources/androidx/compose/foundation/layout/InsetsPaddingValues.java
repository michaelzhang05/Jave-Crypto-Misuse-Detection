package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets insets, Density density) {
        AbstractC3255y.i(insets, "insets");
        AbstractC3255y.i(density, "density");
        this.insets = insets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo555calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo450toDpu2uoSUM(this.insets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo556calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        Density density = this.density;
        return density.mo450toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo557calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        Density density = this.density;
        return density.mo450toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo558calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo450toDpu2uoSUM(this.insets.getTop(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        if (AbstractC3255y.d(this.insets, insetsPaddingValues.insets) && AbstractC3255y.d(this.density, insetsPaddingValues.density)) {
            return true;
        }
        return false;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
