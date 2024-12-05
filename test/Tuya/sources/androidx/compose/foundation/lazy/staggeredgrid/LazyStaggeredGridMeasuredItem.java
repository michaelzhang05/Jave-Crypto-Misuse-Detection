package androidx.compose.foundation.lazy.staggeredgrid;

import M5.AbstractC1246t;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import d6.m;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int sizeWithSpacings;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i8, Object key, List<? extends Placeable> placeables, boolean z8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        int width;
        Integer valueOf;
        int width2;
        int i14;
        long IntSize;
        int height;
        int height2;
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(placeables, "placeables");
        this.index = i8;
        this.key = key;
        this.placeables = placeables;
        this.isVertical = z8;
        this.lane = i10;
        this.span = i11;
        this.beforeContentPadding = i12;
        this.afterContentPadding = i13;
        this.contentType = obj;
        int i15 = 1;
        this.isVisible = true;
        Integer num = null;
        if (placeables.isEmpty()) {
            valueOf = null;
        } else {
            Placeable placeable = (Placeable) placeables.get(0);
            if (z8) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            valueOf = Integer.valueOf(width);
            int o8 = AbstractC1246t.o(placeables);
            if (1 <= o8) {
                int i16 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) placeables.get(i16);
                    if (this.isVertical) {
                        width2 = placeable2.getHeight();
                    } else {
                        width2 = placeable2.getWidth();
                    }
                    Integer valueOf2 = Integer.valueOf(width2);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i16 == o8) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        }
        if (valueOf != null) {
            i14 = valueOf.intValue();
        } else {
            i14 = 0;
        }
        this.mainAxisSize = i14;
        this.sizeWithSpacings = m.d(i14 + i9, 0);
        List<Placeable> list = this.placeables;
        if (!list.isEmpty()) {
            Placeable placeable3 = list.get(0);
            if (this.isVertical) {
                height = placeable3.getWidth();
            } else {
                height = placeable3.getHeight();
            }
            Integer valueOf3 = Integer.valueOf(height);
            int o9 = AbstractC1246t.o(list);
            if (1 <= o9) {
                while (true) {
                    Placeable placeable4 = list.get(i15);
                    if (this.isVertical) {
                        height2 = placeable4.getWidth();
                    } else {
                        height2 = placeable4.getHeight();
                    }
                    Integer valueOf4 = Integer.valueOf(height2);
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i15 == o9) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            num = valueOf3;
        }
        int intValue = num != null ? num.intValue() : 0;
        this.crossAxisSize = intValue;
        this.mainAxisLayoutSize = -1;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(intValue, this.mainAxisSize);
        } else {
            IntSize = IntSizeKt.IntSize(this.mainAxisSize, intValue);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m5312getZeronOccac();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m787copy4Tuh3kE(long j8, Function1 function1) {
        int intValue;
        if (this.isVertical) {
            intValue = IntOffset.m5302getXimpl(j8);
        } else {
            intValue = ((Number) function1.invoke(Integer.valueOf(IntOffset.m5302getXimpl(j8)))).intValue();
        }
        boolean z8 = this.isVertical;
        int m5303getYimpl = IntOffset.m5303getYimpl(j8);
        if (z8) {
            m5303getYimpl = ((Number) function1.invoke(Integer.valueOf(m5303getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(intValue, m5303getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m788getMainAxisgyyYBs(long j8) {
        if (this.isVertical) {
            return IntOffset.m5303getYimpl(j8);
        }
        return IntOffset.m5302getXimpl(j8);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        if (this.isVertical) {
            return IntOffset.m5302getXimpl(mo772getOffsetnOccac());
        }
        return IntOffset.m5303getYimpl(mo772getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo772getOffsetnOccac() {
        return this.offset;
    }

    public final Object getParentData(int i8) {
        return this.placeables.get(i8).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo773getSizeYbymL2g() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpan() {
        return this.span;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void place(Placeable.PlacementScope scope, LazyStaggeredGridMeasureContext context) {
        int width;
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int width2;
        int i8;
        int m5303getYimpl;
        int width3;
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(context, "context");
        if (this.mainAxisLayoutSize != -1) {
            List<Placeable> list = this.placeables;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Placeable placeable = list.get(i9);
                int i10 = this.minMainAxisOffset;
                if (this.isVertical) {
                    width = placeable.getHeight();
                } else {
                    width = placeable.getWidth();
                }
                int i11 = i10 - width;
                int i12 = this.maxMainAxisOffset;
                long mo772getOffsetnOccac = mo772getOffsetnOccac();
                Object parentData = getParentData(i9);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m743getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m743getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5302getXimpl(mo772getOffsetnOccac) + IntOffset.m5302getXimpl(m743getPlacementDeltanOccac), IntOffset.m5303getYimpl(mo772getOffsetnOccac) + IntOffset.m5303getYimpl(m743getPlacementDeltanOccac));
                    if ((m788getMainAxisgyyYBs(mo772getOffsetnOccac) <= i11 && m788getMainAxisgyyYBs(IntOffset) <= i11) || (m788getMainAxisgyyYBs(mo772getOffsetnOccac) >= i12 && m788getMainAxisgyyYBs(IntOffset) >= i12)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    mo772getOffsetnOccac = IntOffset;
                }
                if (context.getReverseLayout()) {
                    if (this.isVertical) {
                        i8 = IntOffset.m5302getXimpl(mo772getOffsetnOccac);
                    } else {
                        int m5302getXimpl = this.mainAxisLayoutSize - IntOffset.m5302getXimpl(mo772getOffsetnOccac);
                        if (this.isVertical) {
                            width2 = placeable.getHeight();
                        } else {
                            width2 = placeable.getWidth();
                        }
                        i8 = m5302getXimpl - width2;
                    }
                    if (this.isVertical) {
                        int m5303getYimpl2 = this.mainAxisLayoutSize - IntOffset.m5303getYimpl(mo772getOffsetnOccac);
                        if (this.isVertical) {
                            width3 = placeable.getHeight();
                        } else {
                            width3 = placeable.getWidth();
                        }
                        m5303getYimpl = m5303getYimpl2 - width3;
                    } else {
                        m5303getYimpl = IntOffset.m5303getYimpl(mo772getOffsetnOccac);
                    }
                    mo772getOffsetnOccac = IntOffsetKt.IntOffset(i8, m5303getYimpl);
                }
                long m776getContentOffsetnOccac = context.m776getContentOffsetnOccac();
                Placeable.PlacementScope.m4171placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m5302getXimpl(mo772getOffsetnOccac) + IntOffset.m5302getXimpl(m776getContentOffsetnOccac), IntOffset.m5303getYimpl(mo772getOffsetnOccac) + IntOffset.m5303getYimpl(m776getContentOffsetnOccac)), 0.0f, null, 6, null);
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i8, int i9, int i10) {
        long IntOffset;
        this.mainAxisLayoutSize = i10;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i10 + this.afterContentPadding;
        if (this.isVertical) {
            IntOffset = IntOffsetKt.IntOffset(i9, i8);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i8, i9);
        }
        this.offset = IntOffset;
    }

    public final void setVisible(boolean z8) {
        this.isVisible = z8;
    }

    public String toString() {
        return super.toString();
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
