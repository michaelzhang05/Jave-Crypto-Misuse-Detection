package androidx.compose.foundation.lazy.staggeredgrid;

import X5.n;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements n {
    private long cachedConstraints;
    private float cachedDensity;
    private LazyStaggeredGridSlots cachedSizes;
    private final n calculation;

    public LazyStaggeredGridSlotCache(n calculation) {
        AbstractC3159y.i(calculation, "calculation");
        this.calculation = calculation;
        this.cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m789invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyStaggeredGridSlots m789invoke0kLqBqw(Density density, long j8) {
        AbstractC3159y.i(density, "density");
        if (this.cachedSizes != null && Constraints.m5139equalsimpl0(this.cachedConstraints, j8) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            AbstractC3159y.f(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j8;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.calculation.invoke(density, Constraints.m5134boximpl(j8));
        this.cachedSizes = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
