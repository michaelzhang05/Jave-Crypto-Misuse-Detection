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
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f8) {
        AbstractC3159y.i(direction, "direction");
        this.direction = direction;
        this.fraction = f8;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
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
        int m5148getMinWidthimpl;
        int m5146getMaxWidthimpl;
        int m5145getMaxHeightimpl;
        int i8;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        if (Constraints.m5142getHasBoundedWidthimpl(j8) && this.direction != Direction.Vertical) {
            m5148getMinWidthimpl = d6.m.k(Z5.a.d(Constraints.m5146getMaxWidthimpl(j8) * this.fraction), Constraints.m5148getMinWidthimpl(j8), Constraints.m5146getMaxWidthimpl(j8));
            m5146getMaxWidthimpl = m5148getMinWidthimpl;
        } else {
            m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
            m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        }
        if (Constraints.m5141getHasBoundedHeightimpl(j8) && this.direction != Direction.Horizontal) {
            i8 = d6.m.k(Z5.a.d(Constraints.m5145getMaxHeightimpl(j8) * this.fraction), Constraints.m5147getMinHeightimpl(j8), Constraints.m5145getMaxHeightimpl(j8));
            m5145getMaxHeightimpl = i8;
        } else {
            int m5147getMinHeightimpl = Constraints.m5147getMinHeightimpl(j8);
            m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
            i8 = m5147getMinHeightimpl;
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(ConstraintsKt.Constraints(m5148getMinWidthimpl, m5146getMaxWidthimpl, i8, m5145getMaxHeightimpl));
        return MeasureScope.CC.q(measure, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new FillNode$measure$1(mo4131measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setDirection(Direction direction) {
        AbstractC3159y.i(direction, "<set-?>");
        this.direction = direction;
    }

    public final void setFraction(float f8) {
        this.fraction = f8;
    }
}
