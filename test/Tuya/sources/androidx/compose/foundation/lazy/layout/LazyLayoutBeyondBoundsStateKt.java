package androidx.compose.foundation.lazy.layout;

import M5.AbstractC1246t;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import d6.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList pinnedItemList, LazyLayoutBeyondBoundsInfo beyondBoundsInfo) {
        i a8;
        AbstractC3159y.i(lazyLayoutItemProvider, "<this>");
        AbstractC3159y.i(pinnedItemList, "pinnedItemList");
        AbstractC3159y.i(beyondBoundsInfo, "beyondBoundsInfo");
        if (!beyondBoundsInfo.hasIntervals() && pinnedItemList.isEmpty()) {
            return AbstractC1246t.m();
        }
        ArrayList arrayList = new ArrayList();
        if (beyondBoundsInfo.hasIntervals()) {
            a8 = new i(beyondBoundsInfo.getStart(), Math.min(beyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            a8 = i.f30199e.a();
        }
        int size = pinnedItemList.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItemList.get(i8);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int g8 = a8.g();
            if ((findIndexByKey > a8.h() || g8 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int g9 = a8.g();
        int h8 = a8.h();
        if (g9 <= h8) {
            while (true) {
                arrayList.add(Integer.valueOf(g9));
                if (g9 == h8) {
                    break;
                }
                g9++;
            }
        }
        return arrayList;
    }
}
