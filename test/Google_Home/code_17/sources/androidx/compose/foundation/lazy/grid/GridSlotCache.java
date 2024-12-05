package androidx.compose.foundation.lazy.grid;

import a6.InterfaceC1668n;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class GridSlotCache implements InterfaceC1668n {
    private long cachedConstraints;
    private float cachedDensity;
    private LazyGridSlots cachedSizes;
    private final InterfaceC1668n calculation;

    public GridSlotCache(InterfaceC1668n calculation) {
        AbstractC3255y.i(calculation, "calculation");
        this.calculation = calculation;
        this.cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m726invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5157unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyGridSlots m726invoke0kLqBqw(Density density, long j8) {
        AbstractC3255y.i(density, "density");
        if (this.cachedSizes != null && Constraints.m5144equalsimpl0(this.cachedConstraints, j8) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            AbstractC3255y.f(lazyGridSlots);
            return lazyGridSlots;
        }
        this.cachedConstraints = j8;
        this.cachedDensity = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.calculation.invoke(density, Constraints.m5139boximpl(j8));
        this.cachedSizes = lazyGridSlots2;
        return lazyGridSlots2;
    }
}
