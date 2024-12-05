package androidx.compose.foundation.lazy.grid;

import O5.I;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import g6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z8, LazyGridSlots slots, int i8, int i9, LazyGridMeasuredItemProvider measuredItemProvider, LazyGridSpanLayoutProvider spanLayoutProvider) {
        AbstractC3255y.i(slots, "slots");
        AbstractC3255y.i(measuredItemProvider, "measuredItemProvider");
        AbstractC3255y.i(spanLayoutProvider, "spanLayoutProvider");
        this.isVertical = z8;
        this.slots = slots;
        this.gridItemsCount = i8;
        this.spaceBetweenLines = i9;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m743childConstraintsJhjzzOo$foundation_release(int i8, int i9) {
        int i10;
        if (i9 == 1) {
            i10 = this.slots.getSizes()[i8];
        } else {
            int i11 = (i9 + i8) - 1;
            i10 = (this.slots.getPositions()[i11] + this.slots.getSizes()[i11]) - this.slots.getPositions()[i8];
        }
        int d8 = m.d(i10, 0);
        if (this.isVertical) {
            return Constraints.Companion.m5161fixedWidthOenEA2s(d8);
        }
        return Constraints.Companion.m5160fixedHeightOenEA2s(d8);
    }

    public abstract LazyGridMeasuredLine createLine(int i8, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i9);

    public final LazyGridMeasuredLine getAndMeasure(int i8) {
        int i9;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i8);
        int size = lineConfiguration.getSpans().size();
        if (size != 0 && lineConfiguration.getFirstItemIndex() + size != this.gridItemsCount) {
            i9 = this.spaceBetweenLines;
        } else {
            i9 = 0;
        }
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int m722getCurrentLineSpanimpl = GridItemSpan.m722getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i11).m725unboximpl());
            LazyGridMeasuredItem m742getAndMeasure3p2s80s = this.measuredItemProvider.m742getAndMeasure3p2s80s(lineConfiguration.getFirstItemIndex() + i11, i9, m743childConstraintsJhjzzOo$foundation_release(i10, m722getCurrentLineSpanimpl));
            i10 += m722getCurrentLineSpanimpl;
            I i12 = I.f8278a;
            lazyGridMeasuredItemArr[i11] = m742getAndMeasure3p2s80s;
        }
        return createLine(i8, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i9);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    /* renamed from: itemConstraints-OenEA2s, reason: not valid java name */
    public final long m744itemConstraintsOenEA2s(int i8) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m743childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(i8, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
