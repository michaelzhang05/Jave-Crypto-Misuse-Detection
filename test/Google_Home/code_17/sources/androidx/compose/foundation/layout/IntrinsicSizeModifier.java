package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
interface IntrinsicSizeModifier extends LayoutModifier {

    /* renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static boolean a(IntrinsicSizeModifier intrinsicSizeModifier) {
            return true;
        }

        public static int b(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
            AbstractC3255y.i(intrinsicMeasureScope, "<this>");
            AbstractC3255y.i(measurable, "measurable");
            return measurable.maxIntrinsicHeight(i8);
        }

        public static int c(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
            AbstractC3255y.i(intrinsicMeasureScope, "<this>");
            AbstractC3255y.i(measurable, "measurable");
            return measurable.maxIntrinsicWidth(i8);
        }

        public static MeasureResult d(IntrinsicSizeModifier intrinsicSizeModifier, MeasureScope measure, Measurable measurable, long j8) {
            AbstractC3255y.i(measure, "$this$measure");
            AbstractC3255y.i(measurable, "measurable");
            long mo559calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo559calculateContentConstraintsl58MMJ0(measure, measurable, j8);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                mo559calculateContentConstraintsl58MMJ0 = ConstraintsKt.m5163constrainN9IONVI(j8, mo559calculateContentConstraintsl58MMJ0);
            }
            Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(mo559calculateContentConstraintsl58MMJ0);
            return MeasureScope.CC.q(measure, mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight(), null, new IntrinsicSizeModifier$measure$1(mo4136measureBRTryo0), 4, null);
        }

        public static int e(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
            AbstractC3255y.i(intrinsicMeasureScope, "<this>");
            AbstractC3255y.i(measurable, "measurable");
            return measurable.minIntrinsicHeight(i8);
        }

        public static int f(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
            AbstractC3255y.i(intrinsicMeasureScope, "<this>");
            AbstractC3255y.i(measurable, "measurable");
            return measurable.minIntrinsicWidth(i8);
        }
    }

    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    long mo559calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j8);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    MeasureResult mo161measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);
}
