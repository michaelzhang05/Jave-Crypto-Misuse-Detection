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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c6.AbstractC2055a;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f8, boolean z8) {
        this.aspectRatio = f8;
        this.matchHeightConstraintsFirst = z8;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m533findSizeToXhtMw(long j8) {
        if (!this.matchHeightConstraintsFirst) {
            long m537tryMaxWidthJN0ABg$default = m537tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m5347equalsimpl0(m537tryMaxWidthJN0ABg$default, companion.m5354getZeroYbymL2g())) {
                return m537tryMaxWidthJN0ABg$default;
            }
            long m535tryMaxHeightJN0ABg$default = m535tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m535tryMaxHeightJN0ABg$default, companion.m5354getZeroYbymL2g())) {
                return m535tryMaxHeightJN0ABg$default;
            }
            long m541tryMinWidthJN0ABg$default = m541tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m541tryMinWidthJN0ABg$default, companion.m5354getZeroYbymL2g())) {
                return m541tryMinWidthJN0ABg$default;
            }
            long m539tryMinHeightJN0ABg$default = m539tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m539tryMinHeightJN0ABg$default, companion.m5354getZeroYbymL2g())) {
                return m539tryMinHeightJN0ABg$default;
            }
            long m536tryMaxWidthJN0ABg = m536tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m536tryMaxWidthJN0ABg, companion.m5354getZeroYbymL2g())) {
                return m536tryMaxWidthJN0ABg;
            }
            long m534tryMaxHeightJN0ABg = m534tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m534tryMaxHeightJN0ABg, companion.m5354getZeroYbymL2g())) {
                return m534tryMaxHeightJN0ABg;
            }
            long m540tryMinWidthJN0ABg = m540tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m540tryMinWidthJN0ABg, companion.m5354getZeroYbymL2g())) {
                return m540tryMinWidthJN0ABg;
            }
            long m538tryMinHeightJN0ABg = m538tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m538tryMinHeightJN0ABg, companion.m5354getZeroYbymL2g())) {
                return m538tryMinHeightJN0ABg;
            }
        } else {
            long m535tryMaxHeightJN0ABg$default2 = m535tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m5347equalsimpl0(m535tryMaxHeightJN0ABg$default2, companion2.m5354getZeroYbymL2g())) {
                return m535tryMaxHeightJN0ABg$default2;
            }
            long m537tryMaxWidthJN0ABg$default2 = m537tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m537tryMaxWidthJN0ABg$default2, companion2.m5354getZeroYbymL2g())) {
                return m537tryMaxWidthJN0ABg$default2;
            }
            long m539tryMinHeightJN0ABg$default2 = m539tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m539tryMinHeightJN0ABg$default2, companion2.m5354getZeroYbymL2g())) {
                return m539tryMinHeightJN0ABg$default2;
            }
            long m541tryMinWidthJN0ABg$default2 = m541tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5347equalsimpl0(m541tryMinWidthJN0ABg$default2, companion2.m5354getZeroYbymL2g())) {
                return m541tryMinWidthJN0ABg$default2;
            }
            long m534tryMaxHeightJN0ABg2 = m534tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m534tryMaxHeightJN0ABg2, companion2.m5354getZeroYbymL2g())) {
                return m534tryMaxHeightJN0ABg2;
            }
            long m536tryMaxWidthJN0ABg2 = m536tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m536tryMaxWidthJN0ABg2, companion2.m5354getZeroYbymL2g())) {
                return m536tryMaxWidthJN0ABg2;
            }
            long m538tryMinHeightJN0ABg2 = m538tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m538tryMinHeightJN0ABg2, companion2.m5354getZeroYbymL2g())) {
                return m538tryMinHeightJN0ABg2;
            }
            long m540tryMinWidthJN0ABg2 = m540tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5347equalsimpl0(m540tryMinWidthJN0ABg2, companion2.m5354getZeroYbymL2g())) {
                return m540tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m5354getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m534tryMaxHeightJN0ABg(long j8, boolean z8) {
        int d8;
        int m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
        if (m5150getMaxHeightimpl != Integer.MAX_VALUE && (d8 = AbstractC2055a.d(m5150getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5150getMaxHeightimpl);
            if (!z8 || ConstraintsKt.m5166isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5354getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m535tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m534tryMaxHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m536tryMaxWidthJN0ABg(long j8, boolean z8) {
        int d8;
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        if (m5151getMaxWidthimpl != Integer.MAX_VALUE && (d8 = AbstractC2055a.d(m5151getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m5151getMaxWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5166isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5354getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m537tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m536tryMaxWidthJN0ABg(j8, z8);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m538tryMinHeightJN0ABg(long j8, boolean z8) {
        int m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
        int d8 = AbstractC2055a.d(m5152getMinHeightimpl * this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5152getMinHeightimpl);
            if (!z8 || ConstraintsKt.m5166isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5354getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m539tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m538tryMinHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m540tryMinWidthJN0ABg(long j8, boolean z8) {
        int m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        int d8 = AbstractC2055a.d(m5153getMinWidthimpl / this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(m5153getMinWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5166isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5354getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m541tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m540tryMinWidthJN0ABg(j8, z8);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2055a.d(i8 / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2055a.d(i8 * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo368measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3255y.i(measure, "$this$measure");
        AbstractC3255y.i(measurable, "measurable");
        long m533findSizeToXhtMw = m533findSizeToXhtMw(j8);
        if (!IntSize.m5347equalsimpl0(m533findSizeToXhtMw, IntSize.Companion.m5354getZeroYbymL2g())) {
            j8 = Constraints.Companion.m5159fixedJhjzzOo(IntSize.m5349getWidthimpl(m533findSizeToXhtMw), IntSize.m5348getHeightimpl(m533findSizeToXhtMw));
        }
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(j8);
        return MeasureScope.CC.q(measure, mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo4136measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2055a.d(i8 / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2055a.d(i8 * this.aspectRatio);
        }
        return measurable.minIntrinsicWidth(i8);
    }

    public final void setAspectRatio(float f8) {
        this.aspectRatio = f8;
    }

    public final void setMatchHeightConstraintsFirst(boolean z8) {
        this.matchHeightConstraintsFirst = z8;
    }
}
