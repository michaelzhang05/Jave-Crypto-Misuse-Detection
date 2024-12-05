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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f8, boolean z8) {
        this.aspectRatio = f8;
        this.matchHeightConstraintsFirst = z8;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m528findSizeToXhtMw(long j8) {
        if (!this.matchHeightConstraintsFirst) {
            long m532tryMaxWidthJN0ABg$default = m532tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m5342equalsimpl0(m532tryMaxWidthJN0ABg$default, companion.m5349getZeroYbymL2g())) {
                return m532tryMaxWidthJN0ABg$default;
            }
            long m530tryMaxHeightJN0ABg$default = m530tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m530tryMaxHeightJN0ABg$default, companion.m5349getZeroYbymL2g())) {
                return m530tryMaxHeightJN0ABg$default;
            }
            long m536tryMinWidthJN0ABg$default = m536tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m536tryMinWidthJN0ABg$default, companion.m5349getZeroYbymL2g())) {
                return m536tryMinWidthJN0ABg$default;
            }
            long m534tryMinHeightJN0ABg$default = m534tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m534tryMinHeightJN0ABg$default, companion.m5349getZeroYbymL2g())) {
                return m534tryMinHeightJN0ABg$default;
            }
            long m531tryMaxWidthJN0ABg = m531tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m531tryMaxWidthJN0ABg, companion.m5349getZeroYbymL2g())) {
                return m531tryMaxWidthJN0ABg;
            }
            long m529tryMaxHeightJN0ABg = m529tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m529tryMaxHeightJN0ABg, companion.m5349getZeroYbymL2g())) {
                return m529tryMaxHeightJN0ABg;
            }
            long m535tryMinWidthJN0ABg = m535tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m535tryMinWidthJN0ABg, companion.m5349getZeroYbymL2g())) {
                return m535tryMinWidthJN0ABg;
            }
            long m533tryMinHeightJN0ABg = m533tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m533tryMinHeightJN0ABg, companion.m5349getZeroYbymL2g())) {
                return m533tryMinHeightJN0ABg;
            }
        } else {
            long m530tryMaxHeightJN0ABg$default2 = m530tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m5342equalsimpl0(m530tryMaxHeightJN0ABg$default2, companion2.m5349getZeroYbymL2g())) {
                return m530tryMaxHeightJN0ABg$default2;
            }
            long m532tryMaxWidthJN0ABg$default2 = m532tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m532tryMaxWidthJN0ABg$default2, companion2.m5349getZeroYbymL2g())) {
                return m532tryMaxWidthJN0ABg$default2;
            }
            long m534tryMinHeightJN0ABg$default2 = m534tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m534tryMinHeightJN0ABg$default2, companion2.m5349getZeroYbymL2g())) {
                return m534tryMinHeightJN0ABg$default2;
            }
            long m536tryMinWidthJN0ABg$default2 = m536tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5342equalsimpl0(m536tryMinWidthJN0ABg$default2, companion2.m5349getZeroYbymL2g())) {
                return m536tryMinWidthJN0ABg$default2;
            }
            long m529tryMaxHeightJN0ABg2 = m529tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m529tryMaxHeightJN0ABg2, companion2.m5349getZeroYbymL2g())) {
                return m529tryMaxHeightJN0ABg2;
            }
            long m531tryMaxWidthJN0ABg2 = m531tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m531tryMaxWidthJN0ABg2, companion2.m5349getZeroYbymL2g())) {
                return m531tryMaxWidthJN0ABg2;
            }
            long m533tryMinHeightJN0ABg2 = m533tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m533tryMinHeightJN0ABg2, companion2.m5349getZeroYbymL2g())) {
                return m533tryMinHeightJN0ABg2;
            }
            long m535tryMinWidthJN0ABg2 = m535tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5342equalsimpl0(m535tryMinWidthJN0ABg2, companion2.m5349getZeroYbymL2g())) {
                return m535tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m5349getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m529tryMaxHeightJN0ABg(long j8, boolean z8) {
        int d8;
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        if (m5145getMaxHeightimpl != Integer.MAX_VALUE && (d8 = Z5.a.d(m5145getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5145getMaxHeightimpl);
            if (!z8 || ConstraintsKt.m5161isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5349getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m530tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m529tryMaxHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m531tryMaxWidthJN0ABg(long j8, boolean z8) {
        int d8;
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        if (m5146getMaxWidthimpl != Integer.MAX_VALUE && (d8 = Z5.a.d(m5146getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m5146getMaxWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5161isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5349getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m532tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m531tryMaxWidthJN0ABg(j8, z8);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m533tryMinHeightJN0ABg(long j8, boolean z8) {
        int m5147getMinHeightimpl = Constraints.m5147getMinHeightimpl(j8);
        int d8 = Z5.a.d(m5147getMinHeightimpl * this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5147getMinHeightimpl);
            if (!z8 || ConstraintsKt.m5161isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5349getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m534tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m533tryMinHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m535tryMinWidthJN0ABg(long j8, boolean z8) {
        int m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
        int d8 = Z5.a.d(m5148getMinWidthimpl / this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(m5148getMinWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5161isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5349getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m536tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m535tryMinWidthJN0ABg(j8, z8);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return Z5.a.d(i8 / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return Z5.a.d(i8 * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        long m528findSizeToXhtMw = m528findSizeToXhtMw(j8);
        if (!IntSize.m5342equalsimpl0(m528findSizeToXhtMw, IntSize.Companion.m5349getZeroYbymL2g())) {
            j8 = Constraints.Companion.m5154fixedJhjzzOo(IntSize.m5344getWidthimpl(m528findSizeToXhtMw), IntSize.m5343getHeightimpl(m528findSizeToXhtMw));
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        return MeasureScope.CC.q(measure, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo4131measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return Z5.a.d(i8 / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return Z5.a.d(i8 * this.aspectRatio);
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
