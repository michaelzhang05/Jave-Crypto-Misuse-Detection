package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i8, AbstractC3151p abstractC3151p) {
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
        if (AbstractC3159y.d(this.insets, limitInsets.insets) && WindowInsetsSides.m680equalsimpl0(this.sides, limitInsets.sides)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3159y.i(density, "density");
        if (WindowInsetsSides.m681hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m691getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int m688getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m688getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m687getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m688getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m688getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m681hasAnybkgdKaI$foundation_layout_release(this.sides, m688getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int m690getAllowRightInRtlJoeWqyM$foundation_layout_release;
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m690getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m689getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m690getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m690getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m681hasAnybkgdKaI$foundation_layout_release(this.sides, m690getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m555getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3159y.i(density, "density");
        if (WindowInsetsSides.m681hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m697getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m682hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m684toStringimpl(this.sides)) + ')';
    }

    private LimitInsets(WindowInsets insets, int i8) {
        AbstractC3159y.i(insets, "insets");
        this.insets = insets;
        this.sides = i8;
    }
}
