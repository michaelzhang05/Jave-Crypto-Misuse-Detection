package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import g6.m;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private int column;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i8, Object obj, boolean z8, int i9, int i10, boolean z9, LayoutDirection layoutDirection, int i11, int i12, List list, long j8, Object obj2, AbstractC3247p abstractC3247p) {
        this(i8, obj, z8, i9, i10, z9, layoutDirection, i11, i12, list, j8, obj2);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m739copy4Tuh3kE(long j8, Function1 function1) {
        int intValue;
        if (this.isVertical) {
            intValue = IntOffset.m5307getXimpl(j8);
        } else {
            intValue = ((Number) function1.invoke(Integer.valueOf(IntOffset.m5307getXimpl(j8)))).intValue();
        }
        boolean z8 = this.isVertical;
        int m5308getYimpl = IntOffset.m5308getYimpl(j8);
        if (z8) {
            m5308getYimpl = ((Number) function1.invoke(Integer.valueOf(m5308getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(intValue, m5308getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m740getMainAxisgyyYBs(long j8) {
        if (this.isVertical) {
            return IntOffset.m5308getYimpl(j8);
        }
        return IntOffset.m5307getXimpl(j8);
    }

    public static /* synthetic */ void position$default(LazyGridMeasuredItem lazyGridMeasuredItem, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj) {
        int i15;
        int i16;
        if ((i14 & 16) != 0) {
            i15 = -1;
        } else {
            i15 = i12;
        }
        if ((i14 & 32) != 0) {
            i16 = -1;
        } else {
            i16 = i13;
        }
        lazyGridMeasuredItem.position(i8, i9, i10, i11, i15, i16);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        if (this.isVertical) {
            return IntOffset.m5307getXimpl(mo735getOffsetnOccac());
        }
        return IntOffset.m5308getYimpl(mo735getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo735getOffsetnOccac() {
        return this.offset;
    }

    public final Object getParentData(int i8) {
        return this.placeables.get(i8).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo736getSizeYbymL2g() {
        return this.size;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void place(Placeable.PlacementScope scope) {
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int m5307getXimpl;
        int m5308getYimpl;
        AbstractC3255y.i(scope, "scope");
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            int placeablesCount = getPlaceablesCount();
            for (int i8 = 0; i8 < placeablesCount; i8++) {
                Placeable placeable = this.placeables.get(i8);
                int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
                int i9 = this.maxMainAxisOffset;
                long mo735getOffsetnOccac = mo735getOffsetnOccac();
                Object parentData = getParentData(i8);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m748getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m748getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(mo735getOffsetnOccac) + IntOffset.m5307getXimpl(m748getPlacementDeltanOccac), IntOffset.m5308getYimpl(mo735getOffsetnOccac) + IntOffset.m5308getYimpl(m748getPlacementDeltanOccac));
                    if ((m740getMainAxisgyyYBs(mo735getOffsetnOccac) <= mainAxisSize && m740getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m740getMainAxisgyyYBs(mo735getOffsetnOccac) >= i9 && m740getMainAxisgyyYBs(IntOffset) >= i9)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    mo735getOffsetnOccac = IntOffset;
                }
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m5307getXimpl = IntOffset.m5307getXimpl(mo735getOffsetnOccac);
                    } else {
                        m5307getXimpl = (this.mainAxisLayoutSize - IntOffset.m5307getXimpl(mo735getOffsetnOccac)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m5308getYimpl = (this.mainAxisLayoutSize - IntOffset.m5308getYimpl(mo735getOffsetnOccac)) - getMainAxisSize(placeable);
                    } else {
                        m5308getYimpl = IntOffset.m5308getYimpl(mo735getOffsetnOccac);
                    }
                    mo735getOffsetnOccac = IntOffsetKt.IntOffset(m5307getXimpl, m5308getYimpl);
                }
                long j8 = this.visualOffset;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(mo735getOffsetnOccac) + IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(mo735getOffsetnOccac) + IntOffset.m5308getYimpl(j8));
                if (this.isVertical) {
                    Placeable.PlacementScope.m4177placeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m4176placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        long IntOffset;
        boolean z8 = this.isVertical;
        if (z8) {
            i14 = i11;
        } else {
            i14 = i10;
        }
        this.mainAxisLayoutSize = i14;
        if (!z8) {
            i10 = i11;
        }
        if (z8 && this.layoutDirection == LayoutDirection.Rtl) {
            i9 = (i10 - i9) - this.crossAxisSize;
        }
        if (z8) {
            IntOffset = IntOffsetKt.IntOffset(i9, i8);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i8, i9);
        }
        this.offset = IntOffset;
        this.row = i12;
        this.column = i13;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i8, Object key, boolean z8, int i9, int i10, boolean z9, LayoutDirection layoutDirection, int i11, int i12, List<? extends Placeable> placeables, long j8, Object obj) {
        long IntSize;
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        AbstractC3255y.i(placeables, "placeables");
        this.index = i8;
        this.key = key;
        this.isVertical = z8;
        this.crossAxisSize = i9;
        this.reverseLayout = z9;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.placeables = placeables;
        this.visualOffset = j8;
        this.contentType = obj;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = placeables.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) placeables.get(i14);
            i13 = Math.max(i13, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i13;
        this.mainAxisSizeWithSpacings = m.d(i10 + i13, 0);
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i13);
        } else {
            IntSize = IntSizeKt.IntSize(i13, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m5317getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
