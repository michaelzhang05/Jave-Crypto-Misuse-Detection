package androidx.compose.foundation.layout;

import a6.InterfaceC1668n;
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
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC1668n alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(Direction direction, boolean z8, InterfaceC1668n alignmentCallback) {
        AbstractC3255y.i(direction, "direction");
        AbstractC3255y.i(alignmentCallback, "alignmentCallback");
        this.direction = direction;
        this.unbounded = z8;
        this.alignmentCallback = alignmentCallback;
    }

    public final InterfaceC1668n getAlignmentCallback() {
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
    public MeasureResult mo368measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int m5153getMinWidthimpl;
        int m5151getMaxWidthimpl;
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int i8 = 0;
        if (direction != direction2) {
            m5153getMinWidthimpl = 0;
        } else {
            m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        }
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i8 = Constraints.m5152getMinHeightimpl(j8);
        }
        int i9 = Integer.MAX_VALUE;
        if (this.direction != direction2 && this.unbounded) {
            m5151getMaxWidthimpl = Integer.MAX_VALUE;
        } else {
            m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        }
        if (this.direction == direction4 || !this.unbounded) {
            i9 = Constraints.m5150getMaxHeightimpl(j8);
        }
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(ConstraintsKt.Constraints(m5153getMinWidthimpl, m5151getMaxWidthimpl, i8, i9));
        int k8 = g6.m.k(mo4136measureBRTryo0.getWidth(), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8));
        int k9 = g6.m.k(mo4136measureBRTryo0.getHeight(), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8));
        return MeasureScope.CC.q(measure, k8, k9, null, new WrapContentNode$measure$1(this, k8, mo4136measureBRTryo0, k9, measure), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setAlignmentCallback(InterfaceC1668n interfaceC1668n) {
        AbstractC3255y.i(interfaceC1668n, "<set-?>");
        this.alignmentCallback = interfaceC1668n;
    }

    public final void setDirection(Direction direction) {
        AbstractC3255y.i(direction, "<set-?>");
        this.direction = direction;
    }

    public final void setUnbounded(boolean z8) {
        this.unbounded = z8;
    }
}
