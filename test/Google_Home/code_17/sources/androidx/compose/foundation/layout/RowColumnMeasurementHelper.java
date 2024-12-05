package androidx.compose.foundation.layout;

import P5.N;
import a6.InterfaceC1671q;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import c6.AbstractC2055a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    private final InterfaceC1671q arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, InterfaceC1671q interfaceC1671q, float f8, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, AbstractC3247p abstractC3247p) {
        this(layoutOrientation, interfaceC1671q, f8, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i8, LayoutDirection layoutDirection, int i9) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int crossAxisSize = i8 - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisSize, layoutDirection, placeable, i9);
    }

    private final int[] mainAxisPositions(int i8, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(i8), iArr, measureScope.getLayoutDirection(), measureScope, iArr2);
        return iArr2;
    }

    public final int crossAxisSize(Placeable placeable) {
        AbstractC3255y.i(placeable, "<this>");
        if (this.orientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    public final InterfaceC1671q getArrangement() {
        return this.arrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name */
    public final float m631getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        AbstractC3255y.i(placeable, "<this>");
        if (this.orientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m632measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long j8, int i8, int i9) {
        int m5153getMinWidthimpl;
        float f8;
        int i10;
        int i11;
        int m8;
        int i12;
        float f9;
        int i13;
        boolean z8;
        int i14;
        int i15;
        int max;
        Integer num;
        int i16;
        int i17;
        int i18;
        long j9;
        int e8;
        int i19 = i9;
        AbstractC3255y.i(measureScope, "measureScope");
        long m574constructorimpl = OrientationIndependentConstraints.m574constructorimpl(j8, this.orientation);
        long mo447roundToPx0680j_4 = measureScope.mo447roundToPx0680j_4(this.arrangementSpacing);
        int i20 = i19 - i8;
        long j10 = 0;
        int i21 = i8;
        long j11 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        float f10 = 0.0f;
        boolean z9 = false;
        while (true) {
            boolean z10 = true;
            if (i21 >= i19) {
                break;
            }
            Measurable measurable = this.measurables.get(i21);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i21];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f10 += weight;
                i24++;
                i17 = i21;
                j9 = j10;
            } else {
                int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(m574constructorimpl);
                Placeable placeable = this.placeables[i21];
                if (placeable == null) {
                    if (m5151getMaxWidthimpl == Integer.MAX_VALUE) {
                        e8 = Integer.MAX_VALUE;
                    } else {
                        e8 = (int) g6.m.e(m5151getMaxWidthimpl - j11, j10);
                    }
                    i16 = i23;
                    int i25 = e8;
                    i17 = i21;
                    i18 = m5151getMaxWidthimpl;
                    placeable = measurable.mo4136measureBRTryo0(OrientationIndependentConstraints.m587toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m576copyyUG9Ft0$default(m574constructorimpl, 0, i25, 0, 0, 8, null), this.orientation));
                } else {
                    i16 = i23;
                    i17 = i21;
                    i18 = m5151getMaxWidthimpl;
                }
                j9 = 0;
                int min = Math.min((int) mo447roundToPx0680j_4, (int) g6.m.e((i18 - j11) - mainAxisSize(placeable), 0L));
                j11 += mainAxisSize(placeable) + min;
                int max2 = Math.max(i16, crossAxisSize(placeable));
                if (!z9 && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z10 = false;
                }
                this.placeables[i17] = placeable;
                i22 = min;
                i23 = max2;
                z9 = z10;
            }
            j10 = j9;
            i21 = i17 + 1;
        }
        long j12 = j10;
        if (i24 == 0) {
            j11 -= i22;
            i10 = i20;
            i11 = 0;
            m8 = 0;
        } else {
            if (f10 > 0.0f && Constraints.m5151getMaxWidthimpl(m574constructorimpl) != Integer.MAX_VALUE) {
                m5153getMinWidthimpl = Constraints.m5151getMaxWidthimpl(m574constructorimpl);
            } else {
                m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(m574constructorimpl);
            }
            long j13 = mo447roundToPx0680j_4 * (i24 - 1);
            long e9 = g6.m.e((m5153getMinWidthimpl - j11) - j13, j12);
            if (f10 > 0.0f) {
                f8 = ((float) e9) / f10;
            } else {
                f8 = 0.0f;
            }
            Iterator it = g6.m.s(i8, i9).iterator();
            int i26 = 0;
            while (it.hasNext()) {
                i26 += AbstractC2055a.d(RowColumnImplKt.getWeight(this.rowColumnParentData[((N) it).nextInt()]) * f8);
            }
            long j14 = e9 - i26;
            int i27 = i8;
            int i28 = 0;
            while (i27 < i19) {
                if (this.placeables[i27] == null) {
                    Measurable measurable2 = this.measurables.get(i27);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i27];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 > 0.0f) {
                        int b8 = AbstractC2055a.b(j14);
                        i12 = i20;
                        j14 -= b8;
                        int max3 = Math.max(0, AbstractC2055a.d(weight2 * f8) + b8);
                        if (RowColumnImplKt.getFill(rowColumnParentData2) && max3 != Integer.MAX_VALUE) {
                            i13 = max3;
                            f9 = f8;
                        } else {
                            f9 = f8;
                            i13 = 0;
                        }
                        Placeable mo4136measureBRTryo0 = measurable2.mo4136measureBRTryo0(OrientationIndependentConstraints.m587toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m572constructorimpl(i13, max3, 0, Constraints.m5150getMaxHeightimpl(m574constructorimpl)), this.orientation));
                        i28 += mainAxisSize(mo4136measureBRTryo0);
                        int max4 = Math.max(i23, crossAxisSize(mo4136measureBRTryo0));
                        if (!z9 && !RowColumnImplKt.isRelative(rowColumnParentData2)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        this.placeables[i27] = mo4136measureBRTryo0;
                        i23 = max4;
                        z9 = z8;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    i12 = i20;
                    f9 = f8;
                }
                i27++;
                i20 = i12;
                i19 = i9;
                f8 = f9;
            }
            i10 = i20;
            i11 = 0;
            m8 = (int) g6.m.m(i28 + j13, 0L, Constraints.m5151getMaxWidthimpl(m574constructorimpl) - j11);
        }
        if (z9) {
            int i29 = 0;
            i14 = 0;
            for (int i30 = i8; i30 < i9; i30++) {
                Placeable placeable2 = this.placeables[i30];
                AbstractC3255y.f(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i30]);
                if (crossAxisAlignment != null) {
                    num = crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i29 = Math.max(i29, intValue);
                    int crossAxisSize = crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i14 = Math.max(i14, crossAxisSize - intValue2);
                }
            }
            i15 = i29;
        } else {
            i14 = 0;
            i15 = 0;
        }
        int max5 = Math.max((int) g6.m.e(j11 + m8, 0L), Constraints.m5153getMinWidthimpl(m574constructorimpl));
        if (Constraints.m5150getMaxHeightimpl(m574constructorimpl) != Integer.MAX_VALUE && this.crossAxisSize == SizeMode.Expand) {
            max = Constraints.m5150getMaxHeightimpl(m574constructorimpl);
        } else {
            max = Math.max(i23, Math.max(Constraints.m5152getMinHeightimpl(m574constructorimpl), i14 + i15));
        }
        int i31 = i10;
        int[] iArr = new int[i31];
        for (int i32 = 0; i32 < i31; i32++) {
            iArr[i32] = i11;
        }
        int[] iArr2 = new int[i31];
        for (int i33 = 0; i33 < i31; i33++) {
            Placeable placeable3 = this.placeables[i33 + i8];
            AbstractC3255y.f(placeable3);
            iArr2[i33] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(max, max5, i8, i9, i15, mainAxisPositions(max5, iArr2, iArr, measureScope));
    }

    public final void placeHelper(Placeable.PlacementScope placeableScope, RowColumnMeasureHelperResult measureResult, int i8, LayoutDirection layoutDirection) {
        RowColumnParentData rowColumnParentData;
        AbstractC3255y.i(placeableScope, "placeableScope");
        AbstractC3255y.i(measureResult, "measureResult");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            AbstractC3255y.f(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            if (parentData instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) parentData;
            } else {
                rowColumnParentData = null;
            }
            int crossAxisPosition = getCrossAxisPosition(placeable, rowColumnParentData, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + i8;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation orientation, InterfaceC1671q arrangement, float f8, SizeMode crossAxisSize, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> measurables, Placeable[] placeables) {
        AbstractC3255y.i(orientation, "orientation");
        AbstractC3255y.i(arrangement, "arrangement");
        AbstractC3255y.i(crossAxisSize, "crossAxisSize");
        AbstractC3255y.i(crossAxisAlignment, "crossAxisAlignment");
        AbstractC3255y.i(measurables, "measurables");
        AbstractC3255y.i(placeables, "placeables");
        this.orientation = orientation;
        this.arrangement = arrangement;
        this.arrangementSpacing = f8;
        this.crossAxisSize = crossAxisSize;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = measurables;
        this.placeables = placeables;
        int size = measurables.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i8 = 0; i8 < size; i8++) {
            rowColumnParentDataArr[i8] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i8));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
