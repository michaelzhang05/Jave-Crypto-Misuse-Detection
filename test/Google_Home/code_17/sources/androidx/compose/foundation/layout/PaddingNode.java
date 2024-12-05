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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f8, float f9, float f10, float f11, boolean z8, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11, z8);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m610getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m611getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m612getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m613getTopD9Ej5fM() {
        return this.top;
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
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        int mo447roundToPx0680j_4 = measure.mo447roundToPx0680j_4(this.start) + measure.mo447roundToPx0680j_4(this.end);
        int mo447roundToPx0680j_42 = measure.mo447roundToPx0680j_4(this.top) + measure.mo447roundToPx0680j_4(this.bottom);
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(ConstraintsKt.m5167offsetNN6EwU(j8, -mo447roundToPx0680j_4, -mo447roundToPx0680j_42));
        return MeasureScope.CC.q(measure, ConstraintsKt.m5165constrainWidthK40F9xA(j8, mo4136measureBRTryo0.getWidth() + mo447roundToPx0680j_4), ConstraintsKt.m5164constrainHeightK40F9xA(j8, mo4136measureBRTryo0.getHeight() + mo447roundToPx0680j_42), null, new PaddingNode$measure$1(this, mo4136measureBRTryo0, measure), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m614setBottom0680j_4(float f8) {
        this.bottom = f8;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m615setEnd0680j_4(float f8) {
        this.end = f8;
    }

    public final void setRtlAware(boolean z8) {
        this.rtlAware = z8;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m616setStart0680j_4(float f8) {
        this.start = f8;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m617setTop0680j_4(float f8) {
        this.top = f8;
    }

    private PaddingNode(float f8, float f9, float f10, float f11, boolean z8) {
        this.start = f8;
        this.top = f9;
        this.end = f10;
        this.bottom = f11;
        this.rtlAware = z8;
    }

    public /* synthetic */ PaddingNode(float f8, float f9, float f10, float f11, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Dp.m5183constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5183constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5183constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5183constructorimpl(0) : f11, z8, null);
    }
}
