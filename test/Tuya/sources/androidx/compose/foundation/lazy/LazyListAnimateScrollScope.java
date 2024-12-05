package androidx.compose.foundation.lazy;

import L5.I;
import M5.AbstractC1246t;
import P5.d;
import X5.n;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyListAnimateScrollScope implements LazyAnimateScrollScope {
    private final int numOfItemsForTeleport;
    private final LazyListState state;

    public LazyListAnimateScrollScope(LazyListState state) {
        AbstractC3159y.i(state, "state");
        this.state = state;
        this.numOfItemsForTeleport = 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i8, int i9) {
        LazyListLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += visibleItemsInfo.get(i11).getSize();
        }
        int size2 = (i10 / visibleItemsInfo.size()) + layoutInfo.getMainAxisItemSpacing();
        int firstVisibleItemIndex = i8 - getFirstVisibleItemIndex();
        int min = Math.min(Math.abs(i9), size2);
        if (i9 < 0) {
            min *= -1;
        }
        return ((size2 * firstVisibleItemIndex) + min) - getFirstVisibleItemScrollOffset();
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
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) AbstractC1246t.z0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.numOfItemsForTeleport;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int i8) {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                lazyListItemInfo = visibleItemsInfo.get(i9);
                if (lazyListItemInfo.getIndex() == i8) {
                    break;
                }
                i9++;
            } else {
                lazyListItemInfo = null;
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 == null) {
            return null;
        }
        return Integer.valueOf(lazyListItemInfo2.getOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(n nVar, d dVar) {
        Object e8 = androidx.compose.foundation.gestures.c.e(this.state, null, nVar, dVar, 1, null);
        if (e8 == Q5.b.e()) {
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
