package androidx.compose.material3;

import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1 onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1 onLabelMeasured, boolean z8, float f8, PaddingValues paddingValues) {
        AbstractC3255y.i(onLabelMeasured, "onLabelMeasured");
        AbstractC3255y.i(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z8;
        this.animationProgress = f8;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8, InterfaceC1668n interfaceC1668n) {
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        int i13;
        int m1740calculateHeightO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj6 : list2) {
            if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), "TextField")) {
                int intValue = ((Number) interfaceC1668n.invoke(obj6, Integer.valueOf(i8))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i9 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
                } else {
                    i9 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i10 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable2, Integer.valueOf(i8))).intValue();
                } else {
                    i10 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i11 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable3, Integer.valueOf(i8))).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj5 = it4.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "Hint")) {
                            break;
                        }
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.SupportingId)) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable5 != null) {
                    i13 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable5, Integer.valueOf(i8))).intValue();
                } else {
                    i13 = 0;
                }
                m1740calculateHeightO3s9Psw = OutlinedTextFieldKt.m1740calculateHeightO3s9Psw(i11, i10, intValue, i9, i12, i13, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1740calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8, InterfaceC1668n interfaceC1668n) {
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        int i12;
        boolean z8;
        int m1741calculateWidthO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj5 : list2) {
            if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) interfaceC1668n.invoke(obj5, Integer.valueOf(i8))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i9 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
                } else {
                    i9 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i10 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable2, Integer.valueOf(i8))).intValue();
                } else {
                    i10 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i11 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable3, Integer.valueOf(i8))).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (AbstractC3255y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC1668n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                if (this.animationProgress < 1.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m1741calculateWidthO3s9Psw = OutlinedTextFieldKt.m1741calculateWidthO3s9Psw(i11, i10, intValue, i9, i12, z8, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1741calculateWidthO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo137measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        Object obj;
        Placeable placeable;
        Object obj2;
        Placeable placeable2;
        boolean z8;
        int i8;
        Object obj3;
        Placeable placeable3;
        Object obj4;
        Placeable placeable4;
        Object obj5;
        Placeable placeable5;
        int m1741calculateWidthO3s9Psw;
        int m1740calculateHeightO3s9Psw;
        int i9;
        int i10;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurables, "measurables");
        int mo447roundToPx0680j_4 = measure.mo447roundToPx0680j_4(this.paddingValues.mo555calculateBottomPaddingD9Ej5fM());
        long m5142copyZbe2FdA$default = Constraints.m5142copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        if (measurable != null) {
            placeable = measurable.mo4136measureBRTryo0(m5142copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable);
        int max = Math.max(0, TextFieldImplKt.heightOrZero(placeable));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (AbstractC3255y.d(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable2 = measurable2.mo4136measureBRTryo0(ConstraintsKt.m5168offsetNN6EwU$default(m5142copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(placeable2));
        if (this.animationProgress < 1.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        int mo447roundToPx0680j_42 = measure.mo447roundToPx0680j_4(this.paddingValues.mo556calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo447roundToPx0680j_4(this.paddingValues.mo557calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        if (z8) {
            i8 = (-widthOrZero2) - mo447roundToPx0680j_42;
        } else {
            i8 = -mo447roundToPx0680j_42;
        }
        int i11 = -mo447roundToPx0680j_4;
        long m5167offsetNN6EwU = ConstraintsKt.m5167offsetNN6EwU(m5142copyZbe2FdA$default, i8, i11);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (AbstractC3255y.d(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable3 = measurable3.mo4136measureBRTryo0(m5167offsetNN6EwU);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            this.onLabelMeasured.invoke(Size.m2797boximpl(SizeKt.Size(placeable3.getWidth(), placeable3.getHeight())));
        }
        int max3 = Math.max(TextFieldImplKt.heightOrZero(placeable3) / 2, measure.mo447roundToPx0680j_4(this.paddingValues.mo558calculateTopPaddingD9Ej5fM()));
        long m5142copyZbe2FdA$default2 = Constraints.m5142copyZbe2FdA$default(ConstraintsKt.m5167offsetNN6EwU(j8, -widthOrZero2, i11 - max3), 0, 0, 0, 0, 11, null);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Measurable measurable4 = (Measurable) it4.next();
            Iterator it5 = it4;
            if (AbstractC3255y.d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable mo4136measureBRTryo0 = measurable4.mo4136measureBRTryo0(m5142copyZbe2FdA$default2);
                long m5142copyZbe2FdA$default3 = Constraints.m5142copyZbe2FdA$default(m5142copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        Iterator it7 = it6;
                        if (AbstractC3255y.d(LayoutIdKt.getLayoutId((Measurable) next), "Hint")) {
                            obj4 = next;
                            break;
                        }
                        it6 = it7;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                if (measurable5 != null) {
                    placeable4 = measurable5.mo4136measureBRTryo0(m5142copyZbe2FdA$default3);
                } else {
                    placeable4 = null;
                }
                long m5142copyZbe2FdA$default4 = Constraints.m5142copyZbe2FdA$default(ConstraintsKt.m5168offsetNN6EwU$default(m5142copyZbe2FdA$default, 0, -Math.max(max2, Math.max(TextFieldImplKt.heightOrZero(mo4136measureBRTryo0), TextFieldImplKt.heightOrZero(placeable4)) + max3 + mo447roundToPx0680j_4), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj5 = it8.next();
                        if (AbstractC3255y.d(LayoutIdKt.getLayoutId((Measurable) obj5), TextFieldImplKt.SupportingId)) {
                            break;
                        }
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                Measurable measurable6 = (Measurable) obj5;
                if (measurable6 != null) {
                    placeable5 = measurable6.mo4136measureBRTryo0(m5142copyZbe2FdA$default4);
                } else {
                    placeable5 = null;
                }
                int heightOrZero = TextFieldImplKt.heightOrZero(placeable5);
                m1741calculateWidthO3s9Psw = OutlinedTextFieldKt.m1741calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo4136measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), z8, j8, measure.getDensity(), this.paddingValues);
                m1740calculateHeightO3s9Psw = OutlinedTextFieldKt.m1740calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), mo4136measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable5), j8, measure.getDensity(), this.paddingValues);
                int i12 = m1740calculateHeightO3s9Psw - heightOrZero;
                for (Measurable measurable7 : list) {
                    if (AbstractC3255y.d(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.ContainerId)) {
                        if (m1741calculateWidthO3s9Psw != Integer.MAX_VALUE) {
                            i9 = m1741calculateWidthO3s9Psw;
                        } else {
                            i9 = 0;
                        }
                        if (i12 != Integer.MAX_VALUE) {
                            i10 = i12;
                        } else {
                            i10 = 0;
                        }
                        return MeasureScope.CC.q(measure, m1741calculateWidthO3s9Psw, m1740calculateHeightO3s9Psw, null, new OutlinedTextFieldMeasurePolicy$measure$2(m1740calculateHeightO3s9Psw, m1741calculateWidthO3s9Psw, placeable, placeable2, mo4136measureBRTryo0, placeable3, placeable4, measurable7.mo4136measureBRTryo0(ConstraintsKt.Constraints(i9, m1741calculateWidthO3s9Psw, i10, i12)), placeable5, this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it4 = it5;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
