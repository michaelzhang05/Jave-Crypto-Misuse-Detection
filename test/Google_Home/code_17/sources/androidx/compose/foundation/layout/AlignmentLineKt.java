package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m488alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f8, float f9, Measurable measurable, long j8) {
        long m5142copyZbe2FdA$default;
        int width;
        int m5151getMaxWidthimpl;
        int i8;
        int i9;
        int max;
        int height;
        if (getHorizontal(alignmentLine)) {
            m5142copyZbe2FdA$default = Constraints.m5142copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null);
        } else {
            m5142copyZbe2FdA$default = Constraints.m5142copyZbe2FdA$default(j8, 0, 0, 0, 0, 14, null);
        }
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(m5142copyZbe2FdA$default);
        int i10 = mo4136measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        if (getHorizontal(alignmentLine)) {
            width = mo4136measureBRTryo0.getHeight();
        } else {
            width = mo4136measureBRTryo0.getWidth();
        }
        if (getHorizontal(alignmentLine)) {
            m5151getMaxWidthimpl = Constraints.m5150getMaxHeightimpl(j8);
        } else {
            m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        }
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m5188equalsimpl0(f8, companion.m5203getUnspecifiedD9Ej5fM())) {
            i8 = measureScope.mo447roundToPx0680j_4(f8);
        } else {
            i8 = 0;
        }
        int i11 = m5151getMaxWidthimpl - width;
        int k8 = g6.m.k(i8 - i10, 0, i11);
        if (!Dp.m5188equalsimpl0(f9, companion.m5203getUnspecifiedD9Ej5fM())) {
            i9 = measureScope.mo447roundToPx0680j_4(f9);
        } else {
            i9 = 0;
        }
        int k9 = g6.m.k((i9 - width) + i10, 0, i11 - k8);
        if (getHorizontal(alignmentLine)) {
            max = mo4136measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo4136measureBRTryo0.getWidth() + k8 + k9, Constraints.m5153getMinWidthimpl(j8));
        }
        int i12 = max;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(mo4136measureBRTryo0.getHeight() + k8 + k9, Constraints.m5152getMinHeightimpl(j8));
        } else {
            height = mo4136measureBRTryo0.getHeight();
        }
        int i13 = height;
        return MeasureScope.CC.q(measureScope, i12, i13, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f8, k8, i12, k9, mo4136measureBRTryo0, i13), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m489paddingFrom4j6BHR0(Modifier paddingFrom, AlignmentLine alignmentLine, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(paddingFrom, "$this$paddingFrom");
        AbstractC3255y.i(alignmentLine, "alignmentLine");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return paddingFrom.then(new AlignmentLineOffsetDpElement(alignmentLine, f8, f9, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m490paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = Dp.Companion.m5203getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f9 = Dp.Companion.m5203getUnspecifiedD9Ej5fM();
        }
        return m489paddingFrom4j6BHR0(modifier, alignmentLine, f8, f9);
    }

    @Stable
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m491paddingFromY_r0B1c(Modifier paddingFrom, AlignmentLine alignmentLine, long j8, long j9) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(paddingFrom, "$this$paddingFrom");
        AbstractC3255y.i(alignmentLine, "alignmentLine");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j8, j9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return paddingFrom.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j8, j9, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m492paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j8, long j9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();
        }
        long j10 = j8;
        if ((i8 & 4) != 0) {
            j9 = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();
        }
        return m491paddingFromY_r0B1c(modifier, alignmentLine, j10, j9);
    }

    @Stable
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m493paddingFromBaselineVpY3zN4(Modifier paddingFromBaseline, float f8, float f9) {
        Modifier modifier;
        Modifier modifier2;
        AbstractC3255y.i(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m5188equalsimpl0(f8, companion.m5203getUnspecifiedD9Ej5fM())) {
            modifier = m490paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f8, 0.0f, 4, null);
        } else {
            modifier = Modifier.Companion;
        }
        Modifier then = paddingFromBaseline.then(modifier);
        if (!Dp.m5188equalsimpl0(f9, companion.m5203getUnspecifiedD9Ej5fM())) {
            modifier2 = m490paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f9, 2, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        return then.then(modifier2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m494paddingFromBaselineVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5203getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5203getUnspecifiedD9Ej5fM();
        }
        return m493paddingFromBaselineVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m495paddingFromBaselinewCyjxdI(Modifier paddingFromBaseline, long j8, long j9) {
        Modifier modifier;
        Modifier modifier2;
        AbstractC3255y.i(paddingFromBaseline, "$this$paddingFromBaseline");
        if (!TextUnitKt.m5388isUnspecifiedR2X_6o(j8)) {
            modifier = m492paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j8, 0L, 4, null);
        } else {
            modifier = Modifier.Companion;
        }
        Modifier then = paddingFromBaseline.then(modifier);
        if (!TextUnitKt.m5388isUnspecifiedR2X_6o(j9)) {
            modifier2 = m492paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j9, 2, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        return then.then(modifier2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m496paddingFromBaselinewCyjxdI$default(Modifier modifier, long j8, long j9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();
        }
        if ((i8 & 2) != 0) {
            j9 = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();
        }
        return m495paddingFromBaselinewCyjxdI(modifier, j8, j9);
    }
}
