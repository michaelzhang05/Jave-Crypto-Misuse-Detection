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
import c6.AbstractC2055a;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f8) {
        AbstractC3255y.i(direction, "direction");
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
    public MeasureResult mo368measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int m5153getMinWidthimpl;
        int m5151getMaxWidthimpl;
        int m5150getMaxHeightimpl;
        int i8;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        if (Constraints.m5147getHasBoundedWidthimpl(j8) && this.direction != Direction.Vertical) {
            m5153getMinWidthimpl = g6.m.k(AbstractC2055a.d(Constraints.m5151getMaxWidthimpl(j8) * this.fraction), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8));
            m5151getMaxWidthimpl = m5153getMinWidthimpl;
        } else {
            m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
            m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        }
        if (Constraints.m5146getHasBoundedHeightimpl(j8) && this.direction != Direction.Horizontal) {
            i8 = g6.m.k(AbstractC2055a.d(Constraints.m5150getMaxHeightimpl(j8) * this.fraction), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8));
            m5150getMaxHeightimpl = i8;
        } else {
            int m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
            m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
            i8 = m5152getMinHeightimpl;
        }
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(ConstraintsKt.Constraints(m5153getMinWidthimpl, m5151getMaxWidthimpl, i8, m5150getMaxHeightimpl));
        return MeasureScope.CC.q(measure, mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight(), null, new FillNode$measure$1(mo4136measureBRTryo0), 4, null);
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
        AbstractC3255y.i(direction, "<set-?>");
        this.direction = direction;
    }

    public final void setFraction(float f8) {
        this.fraction = f8;
    }
}
