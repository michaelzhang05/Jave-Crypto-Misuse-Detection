package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i8, AbstractC3247p abstractC3247p) {
        this(windowInsets, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        if (AbstractC3255y.d(this.insets, limitInsets.insets) && WindowInsetsSides.m685equalsimpl0(this.sides, limitInsets.sides)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3255y.i(density, "density");
        if (WindowInsetsSides.m686hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m696getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m693getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m693getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m692getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m693getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m693getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m686hasAnybkgdKaI$foundation_layout_release(this.sides, m693getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m695getAllowRightInRtlJoeWqyM$foundation_layout_release;
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m695getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m694getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m695getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m695getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m686hasAnybkgdKaI$foundation_layout_release(this.sides, m695getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m560getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3255y.i(density, "density");
        if (WindowInsetsSides.m686hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m702getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m687hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m689toStringimpl(this.sides)) + ')';
    }

    private LimitInsets(WindowInsets insets, int i8) {
        AbstractC3255y.i(insets, "insets");
        this.insets = insets;
        this.sides = i8;
    }
}
