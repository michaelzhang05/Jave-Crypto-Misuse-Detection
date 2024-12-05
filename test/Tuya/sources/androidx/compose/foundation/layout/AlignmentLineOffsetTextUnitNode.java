package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j8, long j9, AbstractC3151p abstractC3151p) {
        this(alignmentLine, j8, j9);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m500getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m501getBeforeXSAIIZE() {
        return this.before;
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
        float m5198getUnspecifiedD9Ej5fM;
        float m5198getUnspecifiedD9Ej5fM2;
        MeasureResult m483alignmentLineOffsetMeasuretjqqzMA;
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        AlignmentLine alignmentLine = this.alignmentLine;
        if (!TextUnitKt.m5383isUnspecifiedR2X_6o(this.before)) {
            m5198getUnspecifiedD9Ej5fM = measure.mo443toDpGaN1DYA(this.before);
        } else {
            m5198getUnspecifiedD9Ej5fM = Dp.Companion.m5198getUnspecifiedD9Ej5fM();
        }
        float f8 = m5198getUnspecifiedD9Ej5fM;
        if (!TextUnitKt.m5383isUnspecifiedR2X_6o(this.after)) {
            m5198getUnspecifiedD9Ej5fM2 = measure.mo443toDpGaN1DYA(this.after);
        } else {
            m5198getUnspecifiedD9Ej5fM2 = Dp.Companion.m5198getUnspecifiedD9Ej5fM();
        }
        m483alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m483alignmentLineOffsetMeasuretjqqzMA(measure, alignmentLine, f8, m5198getUnspecifiedD9Ej5fM2, measurable, j8);
        return m483alignmentLineOffsetMeasuretjqqzMA;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m502setAfterR2X_6o(long j8) {
        this.after = j8;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        AbstractC3159y.i(alignmentLine, "<set-?>");
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m503setBeforeR2X_6o(long j8) {
        this.before = j8;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j8, long j9) {
        AbstractC3159y.i(alignmentLine, "alignmentLine");
        this.alignmentLine = alignmentLine;
        this.before = j8;
        this.after = j9;
    }
}
