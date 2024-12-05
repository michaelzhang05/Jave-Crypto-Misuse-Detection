package androidx.compose.foundation.lazy.staggeredgrid;

import L5.I;
import M5.AbstractC1246t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(LazyStaggeredGridState state) {
        AbstractC3159y.i(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i8, int i9) {
        int m5344getWidthimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i11);
            if (this.state.isVertical$foundation_release()) {
                m5344getWidthimpl = IntSize.m5343getHeightimpl(lazyStaggeredGridItemInfo.mo773getSizeYbymL2g());
            } else {
                m5344getWidthimpl = IntSize.m5344getWidthimpl(lazyStaggeredGridItemInfo.mo773getSizeYbymL2g());
            }
            i10 += m5344getWidthimpl;
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
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) AbstractC1246t.z0(this.state.getLayoutInfo().getVisibleItemsInfo());
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
        int m5302getXimpl;
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(this.state.getLayoutInfo(), i8);
        if (findVisibleItem != null) {
            long mo772getOffsetnOccac = findVisibleItem.mo772getOffsetnOccac();
            if (this.state.isVertical$foundation_release()) {
                m5302getXimpl = IntOffset.m5303getYimpl(mo772getOffsetnOccac);
            } else {
                m5302getXimpl = IntOffset.m5302getXimpl(mo772getOffsetnOccac);
            }
            return Integer.valueOf(m5302getXimpl);
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(n nVar, d dVar) {
        Object e8 = c.e(this.state, null, nVar, dVar, 1, null);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(ScrollScope scrollScope, int i8, int i9) {
        AbstractC3159y.i(scrollScope, "<this>");
        this.state.snapToItemInternal$foundation_release(scrollScope, i8, i9);
    }
}
