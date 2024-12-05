package androidx.compose.foundation.lazy.staggeredgrid;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i8) {
        AbstractC3255y.i(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) AbstractC1378t.m0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i8 > ((LazyStaggeredGridItemInfo) AbstractC1378t.y0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i8) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) AbstractC1378t.p0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), AbstractC1378t.k(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i8), 3, null));
    }
}
