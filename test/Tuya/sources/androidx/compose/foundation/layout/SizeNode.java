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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f8, float f9, float f10, float f11, boolean z8, AbstractC3151p abstractC3151p) {
        this(f8, f9, f10, f11, z8);
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m655getTargetConstraintsOenEA2s(Density density) {
        int i8;
        int i9;
        int i10;
        int d8;
        float f8 = this.maxWidth;
        Dp.Companion companion = Dp.Companion;
        int i11 = 0;
        if (!Dp.m5183equalsimpl0(f8, companion.m5198getUnspecifiedD9Ej5fM())) {
            i8 = d6.m.d(density.mo442roundToPx0680j_4(this.maxWidth), 0);
        } else {
            i8 = Integer.MAX_VALUE;
        }
        if (!Dp.m5183equalsimpl0(this.maxHeight, companion.m5198getUnspecifiedD9Ej5fM())) {
            i9 = d6.m.d(density.mo442roundToPx0680j_4(this.maxHeight), 0);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        if (Dp.m5183equalsimpl0(this.minWidth, companion.m5198getUnspecifiedD9Ej5fM()) || (i10 = d6.m.d(d6.m.g(density.mo442roundToPx0680j_4(this.minWidth), i8), 0)) == Integer.MAX_VALUE) {
            i10 = 0;
        }
        if (!Dp.m5183equalsimpl0(this.minHeight, companion.m5198getUnspecifiedD9Ej5fM()) && (d8 = d6.m.d(d6.m.g(density.mo442roundToPx0680j_4(this.minHeight), i9), 0)) != Integer.MAX_VALUE) {
            i11 = d8;
        }
        return ConstraintsKt.Constraints(i10, i8, i11, i9);
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m656getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m657getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m658getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m659getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        long m655getTargetConstraintsOenEA2s = m655getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5143getHasFixedHeightimpl(m655getTargetConstraintsOenEA2s)) {
            return Constraints.m5145getMaxHeightimpl(m655getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m5159constrainHeightK40F9xA(m655getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i8));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        long m655getTargetConstraintsOenEA2s = m655getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5144getHasFixedWidthimpl(m655getTargetConstraintsOenEA2s)) {
            return Constraints.m5146getMaxWidthimpl(m655getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m5160constrainWidthK40F9xA(m655getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i8));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int g8;
        int d8;
        int g9;
        int d9;
        long Constraints;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        long m655getTargetConstraintsOenEA2s = m655getTargetConstraintsOenEA2s(measure);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m5158constrainN9IONVI(j8, m655getTargetConstraintsOenEA2s);
        } else {
            float f8 = this.minWidth;
            Dp.Companion companion = Dp.Companion;
            if (!Dp.m5183equalsimpl0(f8, companion.m5198getUnspecifiedD9Ej5fM())) {
                g8 = Constraints.m5148getMinWidthimpl(m655getTargetConstraintsOenEA2s);
            } else {
                g8 = d6.m.g(Constraints.m5148getMinWidthimpl(j8), Constraints.m5146getMaxWidthimpl(m655getTargetConstraintsOenEA2s));
            }
            if (!Dp.m5183equalsimpl0(this.maxWidth, companion.m5198getUnspecifiedD9Ej5fM())) {
                d8 = Constraints.m5146getMaxWidthimpl(m655getTargetConstraintsOenEA2s);
            } else {
                d8 = d6.m.d(Constraints.m5146getMaxWidthimpl(j8), Constraints.m5148getMinWidthimpl(m655getTargetConstraintsOenEA2s));
            }
            if (!Dp.m5183equalsimpl0(this.minHeight, companion.m5198getUnspecifiedD9Ej5fM())) {
                g9 = Constraints.m5147getMinHeightimpl(m655getTargetConstraintsOenEA2s);
            } else {
                g9 = d6.m.g(Constraints.m5147getMinHeightimpl(j8), Constraints.m5145getMaxHeightimpl(m655getTargetConstraintsOenEA2s));
            }
            if (!Dp.m5183equalsimpl0(this.maxHeight, companion.m5198getUnspecifiedD9Ej5fM())) {
                d9 = Constraints.m5145getMaxHeightimpl(m655getTargetConstraintsOenEA2s);
            } else {
                d9 = d6.m.d(Constraints.m5145getMaxHeightimpl(j8), Constraints.m5147getMinHeightimpl(m655getTargetConstraintsOenEA2s));
            }
            Constraints = ConstraintsKt.Constraints(g8, d8, g9, d9);
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(Constraints);
        return MeasureScope.CC.q(measure, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new SizeNode$measure$1(mo4131measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        long m655getTargetConstraintsOenEA2s = m655getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5143getHasFixedHeightimpl(m655getTargetConstraintsOenEA2s)) {
            return Constraints.m5145getMaxHeightimpl(m655getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m5159constrainHeightK40F9xA(m655getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i8));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        long m655getTargetConstraintsOenEA2s = m655getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5144getHasFixedWidthimpl(m655getTargetConstraintsOenEA2s)) {
            return Constraints.m5146getMaxWidthimpl(m655getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m5160constrainWidthK40F9xA(m655getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i8));
    }

    public final void setEnforceIncoming(boolean z8) {
        this.enforceIncoming = z8;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m660setMaxHeight0680j_4(float f8) {
        this.maxHeight = f8;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m661setMaxWidth0680j_4(float f8) {
        this.maxWidth = f8;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m662setMinHeight0680j_4(float f8) {
        this.minHeight = f8;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m663setMinWidth0680j_4(float f8) {
        this.minWidth = f8;
    }

    public /* synthetic */ SizeNode(float f8, float f9, float f10, float f11, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f9, (i8 & 4) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f10, (i8 & 8) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f11, z8, null);
    }

    private SizeNode(float f8, float f9, float f10, float f11, boolean z8) {
        this.minWidth = f8;
        this.minHeight = f9;
        this.maxWidth = f10;
        this.maxHeight = f11;
        this.enforceIncoming = z8;
    }
}
