package androidx.compose.foundation.lazy.grid;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d6.C2563g;
import d6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, Function1 function1, Function1 function12) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = list.get(i8).intValue();
            if (((Boolean) function12.invoke(Integer.valueOf(intValue))).booleanValue()) {
                LazyGridMeasuredItem m736getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m736getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, intValue, 0, ((Constraints) function1.invoke(Integer.valueOf(intValue))).m5152unboximpl(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m736getAndMeasure3p2s80s$default);
            }
        }
        if (arrayList == null) {
            return AbstractC1246t.m();
        }
        return arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i8, int i9, int i10, int i11, int i12, boolean z8, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z9, Density density) {
        int i13;
        boolean z10;
        if (z8) {
            i13 = i9;
        } else {
            i13 = i8;
        }
        if (i10 < Math.min(i13, i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && i12 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += list.get(i15).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i14);
        if (z10) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size2 = list.size();
                int[] iArr = new int[size2];
                for (int i16 = 0; i16 < size2; i16++) {
                    iArr[i16] = list.get(calculateItemsOffsets$reverseAware(i16, z9, size2)).getMainAxisSize();
                }
                int[] iArr2 = new int[size2];
                for (int i17 = 0; i17 < size2; i17++) {
                    iArr2[i17] = 0;
                }
                if (z8) {
                    if (vertical != null) {
                        vertical.arrange(density, i13, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (horizontal != null) {
                    horizontal.arrange(density, i13, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C2563g e02 = AbstractC1239l.e0(iArr2);
                if (z9) {
                    e02 = m.q(e02);
                }
                int g8 = e02.g();
                int h8 = e02.h();
                int i18 = e02.i();
                if ((i18 > 0 && g8 <= h8) || (i18 < 0 && h8 <= g8)) {
                    while (true) {
                        int i19 = iArr2[g8];
                        LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(g8, z9, size2));
                        if (z9) {
                            i19 = (i13 - i19) - lazyGridMeasuredLine.getMainAxisSize();
                        }
                        AbstractC1246t.E(arrayList, lazyGridMeasuredLine.position(i19, i8, i9));
                        if (g8 == h8) {
                            break;
                        }
                        g8 += i18;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size3 = list2.size();
            int i20 = i12;
            int i21 = 0;
            while (i21 < size3) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i21);
                int mainAxisSizeWithSpacings = i20 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                LazyGridMeasuredItem.position$default(lazyGridMeasuredItem, mainAxisSizeWithSpacings, 0, i8, i9, 0, 0, 48, null);
                arrayList.add(lazyGridMeasuredItem);
                i21++;
                i20 = mainAxisSizeWithSpacings;
            }
            int size4 = list.size();
            int i22 = i12;
            for (int i23 = 0; i23 < size4; i23++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i23);
                AbstractC1246t.E(arrayList, lazyGridMeasuredLine2.position(i22, i8, i9));
                i22 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int i24 = i22;
            int i25 = 0;
            for (int size5 = list3.size(); i25 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i25);
                LazyGridMeasuredItem.position$default(lazyGridMeasuredItem2, i24, 0, i8, i9, 0, 0, 48, null);
                arrayList.add(lazyGridMeasuredItem2);
                i24 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i25++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i8, boolean z8, int i9) {
        return !z8 ? i8 : (i9 - i8) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* renamed from: measureLazyGrid-ZRKPzZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m733measureLazyGridZRKPzZ8(int r34, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r35, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r36, int r37, int r38, int r39, int r40, int r41, int r42, float r43, long r44, boolean r46, androidx.compose.foundation.layout.Arrangement.Vertical r47, androidx.compose.foundation.layout.Arrangement.Horizontal r48, boolean r49, androidx.compose.ui.unit.Density r50, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r51, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r52, java.util.List<java.lang.Integer> r53, X5.o r54) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m733measureLazyGridZRKPzZ8(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, java.util.List, X5.o):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
