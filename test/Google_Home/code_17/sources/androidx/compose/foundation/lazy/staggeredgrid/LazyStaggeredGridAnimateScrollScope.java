package androidx.compose.foundation.lazy.staggeredgrid;

import O5.I;
import P5.AbstractC1378t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(LazyStaggeredGridState state) {
        AbstractC3255y.i(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i8, int i9) {
        int m5349getWidthimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i11);
            if (this.state.isVertical$foundation_release()) {
                m5349getWidthimpl = IntSize.m5348getHeightimpl(lazyStaggeredGridItemInfo.mo778getSizeYbymL2g());
            } else {
                m5349getWidthimpl = IntSize.m5349getWidthimpl(lazyStaggeredGridItemInfo.mo778getSizeYbymL2g());
            }
            i10 += m5349getWidthimpl;
        }
        int size2 = (i10 / visibleItemsInfo.size()) + layoutInfo.getMainAxisItemSpacing();
        int laneCount$foundation_release = (i8 / this.state.getLaneCount$foundation_release()) - (getFirstVisibleItemIndex() / this.state.getLaneCount$foundation_release());
        int min = Math.min(Math.abs(i9), size2);
        if (i9 < 0) {
            min *= -1;
        }
        return ((size2 * laneCount$foundation_release) + min) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) AbstractC1378t.z0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getLaneCount$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int i8) {
        int m5307getXimpl;
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(this.state.getLayoutInfo(), i8);
        if (findVisibleItem != null) {
            long mo777getOffsetnOccac = findVisibleItem.mo777getOffsetnOccac();
            if (this.state.isVertical$foundation_release()) {
                m5307getXimpl = IntOffset.m5308getYimpl(mo777getOffsetnOccac);
            } else {
                m5307getXimpl = IntOffset.m5307getXimpl(mo777getOffsetnOccac);
            }
            return Integer.valueOf(m5307getXimpl);
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(InterfaceC1668n interfaceC1668n, d dVar) {
        Object e8 = c.e(this.state, null, interfaceC1668n, dVar, 1, null);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(ScrollScope scrollScope, int i8, int i9) {
        AbstractC3255y.i(scrollScope, "<this>");
        this.state.snapToItemInternal$foundation_release(scrollScope, i8, i9);
    }
}
