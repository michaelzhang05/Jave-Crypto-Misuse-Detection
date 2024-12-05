package androidx.compose.foundation.lazy.grid;

import L5.I;
import M5.AbstractC1246t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(LazyGridState state) {
        AbstractC3159y.i(state, "state");
        this.state = state;
    }

    private final int calculateLineAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo, boolean z8) {
        int m5344getWidthimpl;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 = new LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(z8, visibleItemsInfo);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < visibleItemsInfo.size()) {
            int intValue = ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i8))).intValue();
            if (intValue == -1) {
                i8++;
            } else {
                int i11 = 0;
                while (i8 < visibleItemsInfo.size() && ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i8))).intValue() == intValue) {
                    if (z8) {
                        m5344getWidthimpl = IntSize.m5343getHeightimpl(visibleItemsInfo.get(i8).mo731getSizeYbymL2g());
                    } else {
                        m5344getWidthimpl = IntSize.m5344getWidthimpl(visibleItemsInfo.get(i8).mo731getSizeYbymL2g());
                    }
                    i11 = Math.max(i11, m5344getWidthimpl);
                    i8++;
                }
                i9 += i11;
                i10++;
            }
        }
        return (i9 / i10) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i8, int i9) {
        boolean z8;
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int calculateLineAverageMainAxisSize = calculateLineAverageMainAxisSize(this.state.getLayoutInfo(), this.state.isVertical$foundation_release());
        int i10 = 1;
        if (i8 < getFirstVisibleItemIndex()) {
            z8 = true;
        } else {
            z8 = false;
        }
        int firstVisibleItemIndex = i8 - getFirstVisibleItemIndex();
        int i11 = slotsPerLine$foundation_release - 1;
        if (z8) {
            i10 = -1;
        }
        int i12 = (firstVisibleItemIndex + (i11 * i10)) / slotsPerLine$foundation_release;
        int min = Math.min(Math.abs(i9), calculateLineAverageMainAxisSize);
        if (i9 < 0) {
            min *= -1;
        }
        return ((calculateLineAverageMainAxisSize * i12) + min) - getFirstVisibleItemScrollOffset();
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
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC1246t.z0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getSlotsPerLine$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int i8) {
        LazyGridItemInfo lazyGridItemInfo;
        int m5302getXimpl;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                lazyGridItemInfo = visibleItemsInfo.get(i9);
                if (lazyGridItemInfo.getIndex() == i8) {
                    break;
                }
                i9++;
            } else {
                lazyGridItemInfo = null;
                break;
            }
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 == null) {
            return null;
        }
        if (this.state.isVertical$foundation_release()) {
            m5302getXimpl = IntOffset.m5303getYimpl(lazyGridItemInfo2.mo730getOffsetnOccac());
        } else {
            m5302getXimpl = IntOffset.m5302getXimpl(lazyGridItemInfo2.mo730getOffsetnOccac());
        }
        return Integer.valueOf(m5302getXimpl);
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
        this.state.snapToItemIndexInternal$foundation_release(i8, i9);
    }
}
