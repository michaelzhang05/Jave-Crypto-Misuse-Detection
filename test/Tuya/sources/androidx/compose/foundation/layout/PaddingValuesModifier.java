package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        AbstractC3159y.i(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        float f8 = 0;
        if (Dp.m5177compareTo0680j_4(this.paddingValues.mo551calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m5178constructorimpl(f8)) >= 0 && Dp.m5177compareTo0680j_4(this.paddingValues.mo553calculateTopPaddingD9Ej5fM(), Dp.m5178constructorimpl(f8)) >= 0 && Dp.m5177compareTo0680j_4(this.paddingValues.mo552calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m5178constructorimpl(f8)) >= 0 && Dp.m5177compareTo0680j_4(this.paddingValues.mo550calculateBottomPaddingD9Ej5fM(), Dp.m5178constructorimpl(f8)) >= 0) {
            int mo442roundToPx0680j_4 = measure.mo442roundToPx0680j_4(this.paddingValues.mo551calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo442roundToPx0680j_4(this.paddingValues.mo552calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
            int mo442roundToPx0680j_42 = measure.mo442roundToPx0680j_4(this.paddingValues.mo553calculateTopPaddingD9Ej5fM()) + measure.mo442roundToPx0680j_4(this.paddingValues.mo550calculateBottomPaddingD9Ej5fM());
            Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(ConstraintsKt.m5162offsetNN6EwU(j8, -mo442roundToPx0680j_4, -mo442roundToPx0680j_42));
            return MeasureScope.CC.q(measure, ConstraintsKt.m5160constrainWidthK40F9xA(j8, mo4131measureBRTryo0.getWidth() + mo442roundToPx0680j_4), ConstraintsKt.m5159constrainHeightK40F9xA(j8, mo4131measureBRTryo0.getHeight() + mo442roundToPx0680j_42), null, new PaddingValuesModifier$measure$2(mo4131measureBRTryo0, measure, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        AbstractC3159y.i(paddingValues, "<set-?>");
        this.paddingValues = paddingValues;
    }
}
