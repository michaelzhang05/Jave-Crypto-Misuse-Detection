package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class SpacerMeasurePolicy implements MeasurePolicy {
    public static final SpacerMeasurePolicy INSTANCE = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return androidx.compose.ui.layout.g.a(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return androidx.compose.ui.layout.g.b(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo137measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        int i8;
        int i9;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurables, "measurables");
        if (Constraints.m5149getHasFixedWidthimpl(j8)) {
            i8 = Constraints.m5151getMaxWidthimpl(j8);
        } else {
            i8 = 0;
        }
        if (Constraints.m5148getHasFixedHeightimpl(j8)) {
            i9 = Constraints.m5150getMaxHeightimpl(j8);
        } else {
            i9 = 0;
        }
        return MeasureScope.CC.q(measure, i8, i9, null, SpacerMeasurePolicy$measure$1$1.INSTANCE, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return androidx.compose.ui.layout.g.c(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return androidx.compose.ui.layout.g.d(this, intrinsicMeasureScope, list, i8);
    }
}
