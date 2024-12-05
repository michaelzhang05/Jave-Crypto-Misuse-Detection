package androidx.compose.foundation.lazy.layout;

import P5.AbstractC1378t;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import g6.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList pinnedItemList, LazyLayoutBeyondBoundsInfo beyondBoundsInfo) {
        i a8;
        AbstractC3255y.i(lazyLayoutItemProvider, "<this>");
        AbstractC3255y.i(pinnedItemList, "pinnedItemList");
        AbstractC3255y.i(beyondBoundsInfo, "beyondBoundsInfo");
        if (!beyondBoundsInfo.hasIntervals() && pinnedItemList.isEmpty()) {
            return AbstractC1378t.m();
        }
        ArrayList arrayList = new ArrayList();
        if (beyondBoundsInfo.hasIntervals()) {
            a8 = new i(beyondBoundsInfo.getStart(), Math.min(beyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            a8 = i.f32079e.a();
        }
        int size = pinnedItemList.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItemList.get(i8);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int e8 = a8.e();
            if ((findIndexByKey > a8.f() || e8 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int e9 = a8.e();
        int f8 = a8.f();
        if (e9 <= f8) {
            while (true) {
                arrayList.add(Integer.valueOf(e9));
                if (e9 == f8) {
                    break;
                }
                e9++;
            }
        }
        return arrayList;
    }
}
