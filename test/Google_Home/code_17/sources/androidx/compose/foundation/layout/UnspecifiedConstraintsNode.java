package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f8, float f9, AbstractC3247p abstractC3247p) {
        this(f8, f9);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m671getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m672getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        int maxIntrinsicHeight = measurable.maxIntrinsicHeight(i8);
        if (!Dp.m5188equalsimpl0(this.minHeight, Dp.Companion.m5203getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo447roundToPx0680j_4(this.minHeight);
        } else {
            i9 = 0;
        }
        return g6.m.d(maxIntrinsicHeight, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        int maxIntrinsicWidth = measurable.maxIntrinsicWidth(i8);
        if (!Dp.m5188equalsimpl0(this.minWidth, Dp.Companion.m5203getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo447roundToPx0680j_4(this.minWidth);
        } else {
            i9 = 0;
        }
        return g6.m.d(maxIntrinsicWidth, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo368measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int m5153getMinWidthimpl;
        int m5152getMinHeightimpl;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        float f8 = this.minWidth;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m5188equalsimpl0(f8, companion.m5203getUnspecifiedD9Ej5fM()) && Constraints.m5153getMinWidthimpl(j8) == 0) {
            m5153getMinWidthimpl = g6.m.d(g6.m.g(measure.mo447roundToPx0680j_4(this.minWidth), Constraints.m5151getMaxWidthimpl(j8)), 0);
        } else {
            m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        }
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        if (!Dp.m5188equalsimpl0(this.minHeight, companion.m5203getUnspecifiedD9Ej5fM()) && Constraints.m5152getMinHeightimpl(j8) == 0) {
            m5152getMinHeightimpl = g6.m.d(g6.m.g(measure.mo447roundToPx0680j_4(this.minHeight), Constraints.m5150getMaxHeightimpl(j8)), 0);
        } else {
            m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
        }
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(ConstraintsKt.Constraints(m5153getMinWidthimpl, m5151getMaxWidthimpl, m5152getMinHeightimpl, Constraints.m5150getMaxHeightimpl(j8)));
        return MeasureScope.CC.q(measure, mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(mo4136measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        int minIntrinsicHeight = measurable.minIntrinsicHeight(i8);
        if (!Dp.m5188equalsimpl0(this.minHeight, Dp.Companion.m5203getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo447roundToPx0680j_4(this.minHeight);
        } else {
            i9 = 0;
        }
        return g6.m.d(minIntrinsicHeight, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        int minIntrinsicWidth = measurable.minIntrinsicWidth(i8);
        if (!Dp.m5188equalsimpl0(this.minWidth, Dp.Companion.m5203getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo447roundToPx0680j_4(this.minWidth);
        } else {
            i9 = 0;
        }
        return g6.m.d(minIntrinsicWidth, i9);
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m673setMinHeight0680j_4(float f8) {
        this.minHeight = f8;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m674setMinWidth0680j_4(float f8) {
        this.minWidth = f8;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f8, float f9, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f9, null);
    }

    private UnspecifiedConstraintsNode(float f8, float f9) {
        this.minWidth = f8;
        this.minHeight = f9;
    }
}
