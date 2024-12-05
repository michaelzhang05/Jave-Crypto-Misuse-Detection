package androidx.compose.foundation.pager;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.C1238k;
import X5.o;
import Z5.a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d6.C2563g;
import d6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class PagerMeasureKt {
    private static final boolean DEBUG = false;

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i8, int i9, int i10, int i11, int i12, Orientation orientation, boolean z8, Density density, int i13, int i14) {
        int i15;
        int i16;
        boolean z9;
        int i17 = i14 + i13;
        if (orientation == Orientation.Vertical) {
            i15 = i11;
            i16 = i9;
        } else {
            i15 = i11;
            i16 = i8;
        }
        if (i10 < Math.min(i16, i15)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && i12 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z9) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i18 = 0; i18 < size; i18++) {
                    iArr[i18] = i14;
                }
                int[] iArr2 = new int[size];
                for (int i19 = 0; i19 < size; i19++) {
                    iArr2[i19] = 0;
                }
                Arrangement.HorizontalOrVertical m517spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m517spacedBy0680j_4(lazyLayoutMeasureScope.mo445toDpu2uoSUM(i14));
                if (orientation == Orientation.Vertical) {
                    m517spacedBy0680j_4.arrange(density, i16, iArr, iArr2);
                } else {
                    m517spacedBy0680j_4.arrange(density, i16, iArr, LayoutDirection.Ltr, iArr2);
                }
                C2563g e02 = AbstractC1239l.e0(iArr2);
                if (z8) {
                    e02 = m.q(e02);
                }
                int g8 = e02.g();
                int h8 = e02.h();
                int i20 = e02.i();
                if ((i20 > 0 && g8 <= h8) || (i20 < 0 && h8 <= g8)) {
                    while (true) {
                        int i21 = iArr2[g8];
                        MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(g8, z8, size));
                        if (z8) {
                            i21 = (i16 - i21) - measuredPage.getSize();
                        }
                        measuredPage.position(i21, i8, i9);
                        arrayList.add(measuredPage);
                        if (g8 == h8) {
                            break;
                        }
                        g8 += i20;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i22 = i12;
            for (int i23 = 0; i23 < size2; i23++) {
                MeasuredPage measuredPage2 = list2.get(i23);
                i22 -= i17;
                measuredPage2.position(i22, i8, i9);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            int i24 = i12;
            for (int i25 = 0; i25 < size3; i25++) {
                MeasuredPage measuredPage3 = list.get(i25);
                measuredPage3.position(i24, i8, i9);
                arrayList.add(measuredPage3);
                i24 += i17;
            }
            int size4 = list3.size();
            for (int i26 = 0; i26 < size4; i26++) {
                MeasuredPage measuredPage4 = list3.get(i26);
                measuredPage4.position(i24, i8, i9);
                arrayList.add(measuredPage4);
                i24 += i17;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i8, boolean z8, int i9) {
        return !z8 ? i8 : (i9 - i8) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i8, int i9, int i10, List<Integer> list, Function1 function1) {
        int min = Math.min(i10 + i8, i9 - 1);
        int i11 = i8 + 1;
        ArrayList arrayList = null;
        if (i11 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i11)));
                if (i11 == min) {
                    break;
                }
                i11++;
            }
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            int intValue = list.get(i12).intValue();
            if (min + 1 <= intValue && intValue < i9) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return AbstractC1246t.m();
        }
        return arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i8, int i9, List<Integer> list, Function1 function1) {
        int max = Math.max(0, i8 - i9);
        int i10 = i8 - 1;
        ArrayList arrayList = null;
        if (max <= i10) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i10)));
                if (i10 == max) {
                    break;
                }
                i10--;
            }
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = list.get(i11).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return AbstractC1246t.m();
        }
        return arrayList;
    }

    private static final void debugLog(Function0 function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m814getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i8, long j8, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j9, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z8, int i9) {
        return new MeasuredPage(i8, i9, lazyLayoutMeasureScope.mo756measure0kLqBqw(i8, j8), j9, pagerLazyLayoutItemProvider.getKey(i8), orientation, horizontal, vertical, layoutDirection, z8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measurePager-ntgEbfI, reason: not valid java name */
    public static final PagerMeasureResult m815measurePagerntgEbfI(LazyLayoutMeasureScope measurePager, int i8, PagerLazyLayoutItemProvider pagerItemProvider, int i9, int i10, int i11, int i12, int i13, int i14, float f8, long j8, Orientation orientation, Alignment.Vertical vertical, Alignment.Horizontal horizontal, boolean z8, long j9, int i15, int i16, List<Integer> pinnedPages, o layout) {
        int i17;
        int i18;
        int i19;
        C1238k c1238k;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        C1238k c1238k2;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        MeasuredPage measuredPage;
        int i33;
        int i34;
        long j10;
        List<MeasuredPage> list;
        MeasuredPage measuredPage2;
        C1238k c1238k3;
        int i35;
        AbstractC3159y.i(measurePager, "$this$measurePager");
        AbstractC3159y.i(pagerItemProvider, "pagerItemProvider");
        AbstractC3159y.i(orientation, "orientation");
        AbstractC3159y.i(pinnedPages, "pinnedPages");
        AbstractC3159y.i(layout, "layout");
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i11 >= 0) {
            int d8 = m.d(i15 + i12, 0);
            if (i8 <= 0) {
                return new PagerMeasureResult(AbstractC1246t.m(), 0, i15, i12, i11, orientation, -i10, i9 + i11, false, 0.0f, null, null, 0, false, (MeasureResult) layout.invoke(Integer.valueOf(Constraints.m5148getMinWidthimpl(j8)), Integer.valueOf(Constraints.m5147getMinHeightimpl(j8)), PagerMeasureKt$measurePager$2.INSTANCE));
            }
            Orientation orientation2 = Orientation.Vertical;
            long Constraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m5146getMaxWidthimpl(j8) : i15, 0, orientation != orientation2 ? Constraints.m5145getMaxHeightimpl(j8) : i15, 5, null);
            int i36 = i13;
            if (i36 >= i8) {
                i36 = i8 - 1;
                i17 = 0;
            } else {
                i17 = i14;
            }
            int d9 = a.d(f8);
            int i37 = i17 - d9;
            if (i36 != 0 || i37 >= 0) {
                i18 = d9;
            } else {
                i18 = d9 + i37;
                i37 = 0;
            }
            C1238k c1238k4 = new C1238k();
            int i38 = -i10;
            int i39 = (i12 < 0 ? i12 : 0) + i38;
            int i40 = i37 + i39;
            int i41 = 0;
            while (i40 < 0 && i36 > 0) {
                int i42 = i36 - 1;
                int i43 = d8;
                C1238k c1238k5 = c1238k4;
                MeasuredPage m814getAndMeasureSGf7dI0 = m814getAndMeasureSGf7dI0(measurePager, i42, Constraints$default, pagerItemProvider, j9, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z8, i15);
                c1238k5.add(0, m814getAndMeasureSGf7dI0);
                i41 = Math.max(i41, m814getAndMeasureSGf7dI0.getCrossAxisSize());
                i40 += i43;
                i39 = i39;
                c1238k4 = c1238k5;
                d8 = i43;
                i36 = i42;
            }
            int i44 = i40;
            int i45 = d8;
            C1238k c1238k6 = c1238k4;
            int i46 = i39;
            if (i44 < i46) {
                i18 += i44;
                i19 = i46;
            } else {
                i19 = i44;
            }
            int i47 = i19 - i46;
            C1238k c1238k7 = c1238k6;
            int i48 = i9;
            int i49 = i48 + i11;
            int d10 = m.d(i49, 0);
            int i50 = -i47;
            int size = c1238k7.size();
            int i51 = i36;
            for (int i52 = 0; i52 < size; i52++) {
                i51++;
                i50 += i45;
            }
            int i53 = i8;
            int i54 = i45;
            int i55 = i36;
            int i56 = i47;
            int i57 = i50;
            while (true) {
                if (i51 >= i53) {
                    c1238k = c1238k7;
                    i20 = i55;
                    i21 = i41;
                    i22 = i54;
                    i23 = i53;
                    i24 = i57;
                    i25 = i49;
                    i48 = i9;
                    i26 = i51;
                    break;
                }
                if (i57 >= d10 && i57 > 0 && !c1238k7.isEmpty()) {
                    c1238k = c1238k7;
                    i20 = i55;
                    i21 = i41;
                    i22 = i54;
                    i26 = i51;
                    i23 = i53;
                    i24 = i57;
                    i25 = i49;
                    break;
                }
                int i58 = i54;
                int i59 = i55;
                int i60 = i51;
                int i61 = i53;
                C1238k c1238k8 = c1238k7;
                int i62 = d10;
                int i63 = i49;
                int i64 = i41;
                int i65 = i46;
                MeasuredPage m814getAndMeasureSGf7dI02 = m814getAndMeasureSGf7dI0(measurePager, i51, Constraints$default, pagerItemProvider, j9, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z8, i15);
                i57 += i58;
                if (i57 > i65 || i60 == i61 - 1) {
                    int max = Math.max(i64, m814getAndMeasureSGf7dI02.getCrossAxisSize());
                    c1238k3 = c1238k8;
                    c1238k3.add(m814getAndMeasureSGf7dI02);
                    i35 = i59;
                    i64 = max;
                } else {
                    i35 = i60 + 1;
                    i56 -= i58;
                    c1238k3 = c1238k8;
                }
                i53 = i61;
                i54 = i58;
                i55 = i35;
                c1238k7 = c1238k3;
                d10 = i62;
                i49 = i63;
                i51 = i60 + 1;
                i46 = i65;
                i41 = i64;
                i48 = i9;
            }
            if (i24 < i48) {
                int i66 = i48 - i24;
                int i67 = i24 + i66;
                int i68 = i10;
                int i69 = i20;
                int i70 = i21;
                int i71 = i56 - i66;
                while (i71 < i68 && i69 > 0) {
                    int i72 = i69 - 1;
                    C1238k c1238k9 = c1238k;
                    MeasuredPage m814getAndMeasureSGf7dI03 = m814getAndMeasureSGf7dI0(measurePager, i72, Constraints$default, pagerItemProvider, j9, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z8, i15);
                    c1238k9.add(0, m814getAndMeasureSGf7dI03);
                    i70 = Math.max(i70, m814getAndMeasureSGf7dI03.getCrossAxisSize());
                    i71 += i22;
                    i68 = i10;
                    i26 = i26;
                    c1238k = c1238k9;
                    i69 = i72;
                }
                i27 = i26;
                int i73 = i71;
                i29 = i70;
                c1238k2 = c1238k;
                int i74 = i18 + i66;
                if (i73 < 0) {
                    int i75 = i67 + i73;
                    i32 = i69;
                    i28 = i75;
                    i30 = i74 + i73;
                    i31 = 0;
                } else {
                    i28 = i67;
                    i32 = i69;
                    i30 = i74;
                    i31 = i73;
                }
            } else {
                i27 = i26;
                c1238k2 = c1238k;
                i28 = i24;
                i29 = i21;
                i30 = i18;
                i31 = i56;
                i32 = i20;
            }
            float f9 = (a.a(a.d(f8)) != a.a(i30) || Math.abs(a.d(f8)) < Math.abs(i30)) ? f8 : i30;
            if (i31 >= 0) {
                int i76 = -i31;
                MeasuredPage measuredPage3 = (MeasuredPage) c1238k2.first();
                if (i10 > 0 || i12 < 0) {
                    int size2 = c1238k2.size();
                    int i77 = i31;
                    int i78 = 0;
                    while (i78 < size2 && i77 != 0 && i22 <= i77 && i78 != AbstractC1246t.o(c1238k2)) {
                        i77 -= i22;
                        i78++;
                        measuredPage3 = (MeasuredPage) c1238k2.get(i78);
                    }
                    measuredPage = measuredPage3;
                    i33 = i77;
                } else {
                    measuredPage = measuredPage3;
                    i33 = i31;
                }
                int i79 = i29;
                int i80 = i28;
                List<MeasuredPage> createPagesBeforeList = createPagesBeforeList(i32, i16, pinnedPages, new PagerMeasureKt$measurePager$extraPagesBefore$1(measurePager, Constraints$default, pagerItemProvider, j9, orientation, horizontal, vertical, z8, i15));
                int size3 = createPagesBeforeList.size();
                int i81 = i79;
                for (int i82 = 0; i82 < size3; i82++) {
                    i81 = Math.max(i81, createPagesBeforeList.get(i82).getCrossAxisSize());
                }
                MeasuredPage measuredPage4 = measuredPage;
                C1238k c1238k10 = c1238k2;
                List<MeasuredPage> createPagesAfterList = createPagesAfterList(((MeasuredPage) c1238k2.last()).getIndex(), i23, i16, pinnedPages, new PagerMeasureKt$measurePager$extraPagesAfter$1(measurePager, Constraints$default, pagerItemProvider, j9, orientation, horizontal, vertical, z8, i15));
                int size4 = createPagesAfterList.size();
                int i83 = i81;
                for (int i84 = 0; i84 < size4; i84++) {
                    i83 = Math.max(i83, createPagesAfterList.get(i84).getCrossAxisSize());
                }
                boolean z9 = AbstractC3159y.d(measuredPage4, c1238k10.first()) && createPagesBeforeList.isEmpty() && createPagesAfterList.isEmpty();
                Orientation orientation3 = Orientation.Vertical;
                if (orientation == orientation3) {
                    j10 = j8;
                    i34 = i83;
                } else {
                    i34 = i80;
                    j10 = j8;
                }
                int m5160constrainWidthK40F9xA = ConstraintsKt.m5160constrainWidthK40F9xA(j10, i34);
                if (orientation == orientation3) {
                    i83 = i80;
                }
                int m5159constrainHeightK40F9xA = ConstraintsKt.m5159constrainHeightK40F9xA(j10, i83);
                int i85 = i27;
                List<MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(measurePager, c1238k10, createPagesBeforeList, createPagesAfterList, m5160constrainWidthK40F9xA, m5159constrainHeightK40F9xA, i80, i9, i76, orientation, z8, measurePager, i12, i15);
                if (z9) {
                    list = calculatePagesOffsets;
                } else {
                    ArrayList arrayList = new ArrayList(calculatePagesOffsets.size());
                    int size5 = calculatePagesOffsets.size();
                    for (int i86 = 0; i86 < size5; i86++) {
                        MeasuredPage measuredPage5 = calculatePagesOffsets.get(i86);
                        MeasuredPage measuredPage6 = measuredPage5;
                        if (measuredPage6.getIndex() >= ((MeasuredPage) c1238k10.first()).getIndex() && measuredPage6.getIndex() <= ((MeasuredPage) c1238k10.last()).getIndex()) {
                            arrayList.add(measuredPage5);
                        }
                    }
                    list = arrayList;
                }
                int i87 = orientation == Orientation.Vertical ? m5159constrainHeightK40F9xA : m5160constrainWidthK40F9xA;
                if (list.isEmpty()) {
                    measuredPage2 = null;
                } else {
                    MeasuredPage measuredPage7 = list.get(0);
                    MeasuredPage measuredPage8 = measuredPage7;
                    float f10 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i87, i10, i11, i15, measuredPage8.getOffset(), measuredPage8.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                    int o8 = AbstractC1246t.o(list);
                    if (1 <= o8) {
                        MeasuredPage measuredPage9 = measuredPage7;
                        int i88 = 1;
                        float f11 = f10;
                        while (true) {
                            MeasuredPage measuredPage10 = list.get(i88);
                            MeasuredPage measuredPage11 = measuredPage10;
                            int i89 = i88;
                            float f12 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i87, i10, i11, i15, measuredPage11.getOffset(), measuredPage11.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                            if (Float.compare(f11, f12) < 0) {
                                f11 = f12;
                                measuredPage9 = measuredPage10;
                            }
                            if (i89 == o8) {
                                break;
                            }
                            i88 = i89 + 1;
                        }
                        measuredPage2 = measuredPage9;
                    } else {
                        measuredPage2 = measuredPage7;
                    }
                }
                return new PagerMeasureResult(list, i8, i15, i12, i11, orientation, i38, i25, z8, f9, measuredPage4, measuredPage2, i33, i85 < i23 || i80 > i9, (MeasureResult) layout.invoke(Integer.valueOf(m5160constrainWidthK40F9xA), Integer.valueOf(m5159constrainHeightK40F9xA), new PagerMeasureKt$measurePager$6(calculatePagesOffsets)));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
