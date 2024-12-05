package androidx.compose.foundation.lazy;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(List<LazyListMeasuredItem> composedVisibleItems, LazyListMeasuredItemProvider itemProvider, List<Integer> headerIndexes, int i8, int i9, int i10) {
        int i11;
        Integer num;
        AbstractC3255y.i(composedVisibleItems, "composedVisibleItems");
        AbstractC3255y.i(itemProvider, "itemProvider");
        AbstractC3255y.i(headerIndexes, "headerIndexes");
        int index = ((LazyListMeasuredItem) AbstractC1378t.m0(composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (i12 < size && headerIndexes.get(i12).intValue() <= index) {
            i13 = headerIndexes.get(i12).intValue();
            i12++;
            if (i12 >= 0 && i12 <= AbstractC1378t.o(headerIndexes)) {
                num = headerIndexes.get(i12);
            } else {
                num = -1;
            }
            i14 = num.intValue();
        }
        int size2 = composedVisibleItems.size();
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MIN_VALUE;
        int i17 = -1;
        for (int i18 = 0; i18 < size2; i18++) {
            LazyListMeasuredItem lazyListMeasuredItem = composedVisibleItems.get(i18);
            if (lazyListMeasuredItem.getIndex() == i13) {
                i15 = lazyListMeasuredItem.getOffset();
                i17 = i18;
            } else if (lazyListMeasuredItem.getIndex() == i14) {
                i16 = lazyListMeasuredItem.getOffset();
            }
        }
        if (i13 == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = itemProvider.getAndMeasure(i13);
        if (i15 != Integer.MIN_VALUE) {
            i11 = Math.max(-i8, i15);
        } else {
            i11 = -i8;
        }
        if (i16 != Integer.MIN_VALUE) {
            i11 = Math.min(i11, i16 - andMeasure.getSize());
        }
        andMeasure.position(i11, i9, i10);
        if (i17 != -1) {
            composedVisibleItems.set(i17, andMeasure);
        } else {
            composedVisibleItems.add(0, andMeasure);
        }
        return andMeasure;
    }
}
