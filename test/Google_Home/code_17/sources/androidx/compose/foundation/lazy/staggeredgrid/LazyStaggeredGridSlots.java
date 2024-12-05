package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridSlots {
    private final int[] positions;
    private final int[] sizes;

    public LazyStaggeredGridSlots(int[] positions, int[] sizes) {
        AbstractC3255y.i(positions, "positions");
        AbstractC3255y.i(sizes, "sizes");
        this.positions = positions;
        this.sizes = sizes;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
