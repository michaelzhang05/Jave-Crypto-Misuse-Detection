package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private State<Integer> heightState;
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float f8, State state, State state2, int i8, AbstractC3151p abstractC3151p) {
        this(f8, (i8 & 2) != 0 ? null : state, (i8 & 4) != 0 ? null : state2);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
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
        int i8;
        int i9;
        int m5148getMinWidthimpl;
        int m5147getMinHeightimpl;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        State<Integer> state = this.widthState;
        if (state != null && state.getValue().intValue() != Integer.MAX_VALUE) {
            i8 = Z5.a.d(state.getValue().floatValue() * this.fraction);
        } else {
            i8 = Integer.MAX_VALUE;
        }
        State<Integer> state2 = this.heightState;
        if (state2 != null && state2.getValue().intValue() != Integer.MAX_VALUE) {
            i9 = Z5.a.d(state2.getValue().floatValue() * this.fraction);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        if (i8 != Integer.MAX_VALUE) {
            m5148getMinWidthimpl = i8;
        } else {
            m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
        }
        if (i9 != Integer.MAX_VALUE) {
            m5147getMinHeightimpl = i9;
        } else {
            m5147getMinHeightimpl = Constraints.m5147getMinHeightimpl(j8);
        }
        if (i8 == Integer.MAX_VALUE) {
            i8 = Constraints.m5146getMaxWidthimpl(j8);
        }
        if (i9 == Integer.MAX_VALUE) {
            i9 = Constraints.m5145getMaxHeightimpl(j8);
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(ConstraintsKt.Constraints(m5148getMinWidthimpl, i8, m5147getMinHeightimpl, i9));
        return MeasureScope.CC.q(measure, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new ParentSizeNode$measure$1(mo4131measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setFraction(float f8) {
        this.fraction = f8;
    }

    public final void setHeightState(State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f8, State<Integer> state, State<Integer> state2) {
        this.fraction = f8;
        this.widthState = state;
        this.heightState = state2;
    }
}
