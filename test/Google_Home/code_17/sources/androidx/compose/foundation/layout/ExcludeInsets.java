package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {
    private final WindowInsets excluded;
    private final WindowInsets included;

    public ExcludeInsets(WindowInsets included, WindowInsets excluded) {
        AbstractC3255y.i(included, "included");
        AbstractC3255y.i(excluded, "excluded");
        this.included = included;
        this.excluded = excluded;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        if (AbstractC3255y.d(excludeInsets.included, this.included) && AbstractC3255y.d(excludeInsets.excluded, this.excluded)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3255y.i(density, "density");
        return g6.m.d(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return g6.m.d(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return g6.m.d(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3255y.i(density, "density");
        return g6.m.d(this.included.getTop(density) - this.excluded.getTop(density), 0);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
