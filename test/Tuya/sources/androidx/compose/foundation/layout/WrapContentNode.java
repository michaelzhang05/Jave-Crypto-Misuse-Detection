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
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private X5.n alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(Direction direction, boolean z8, X5.n alignmentCallback) {
        AbstractC3159y.i(direction, "direction");
        AbstractC3159y.i(alignmentCallback, "alignmentCallback");
        this.direction = direction;
        this.unbounded = z8;
        this.alignmentCallback = alignmentCallback;
    }

    public final X5.n getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
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
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int i8 = 0;
        if (direction != direction2) {
            m5148getMinWidthimpl = 0;
        } else {
            m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
        }
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i8 = Constraints.m5147getMinHeightimpl(j8);
        }
        int i9 = Integer.MAX_VALUE;
        if (this.direction != direction2 && this.unbounded) {
            m5146getMaxWidthimpl = Integer.MAX_VALUE;
        } else {
            m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        }
        if (this.direction == direction4 || !this.unbounded) {
            i9 = Constraints.m5145getMaxHeightimpl(j8);
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(ConstraintsKt.Constraints(m5148getMinWidthimpl, m5146getMaxWidthimpl, i8, i9));
        int k8 = d6.m.k(mo4131measureBRTryo0.getWidth(), Constraints.m5148getMinWidthimpl(j8), Constraints.m5146getMaxWidthimpl(j8));
        int k9 = d6.m.k(mo4131measureBRTryo0.getHeight(), Constraints.m5147getMinHeightimpl(j8), Constraints.m5145getMaxHeightimpl(j8));
        return MeasureScope.CC.q(measure, k8, k9, null, new WrapContentNode$measure$1(this, k8, mo4131measureBRTryo0, k9, measure), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setAlignmentCallback(X5.n nVar) {
        AbstractC3159y.i(nVar, "<set-?>");
        this.alignmentCallback = nVar;
    }

    public final void setDirection(Direction direction) {
        AbstractC3159y.i(direction, "<set-?>");
        this.direction = direction;
    }

    public final void setUnbounded(boolean z8) {
        this.unbounded = z8;
    }
}
