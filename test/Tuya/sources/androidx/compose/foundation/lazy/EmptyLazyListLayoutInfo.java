package androidx.compose.foundation.lazy;

import M5.AbstractC1246t;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* loaded from: classes.dex */
final class EmptyLazyListLayoutInfo implements LazyListLayoutInfo {
    private static final int afterContentPadding = 0;
    private static final int beforeContentPadding = 0;
    private static final int mainAxisItemSpacing = 0;
    private static final boolean reverseLayout = false;
    private static final int totalItemsCount = 0;
    private static final int viewportEndOffset = 0;
    private static final int viewportStartOffset = 0;
    public static final EmptyLazyListLayoutInfo INSTANCE = new EmptyLazyListLayoutInfo();
    private static final List<LazyListItemInfo> visibleItemsInfo = AbstractC1246t.m();
    private static final long viewportSize = IntSize.Companion.m5349getZeroYbymL2g();
    private static final Orientation orientation = Orientation.Vertical;

    private EmptyLazyListLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public long mo702getViewportSizeYbymL2g() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
