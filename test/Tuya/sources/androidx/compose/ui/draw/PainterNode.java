package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, AbstractC3151p abstractC3151p) {
        this(painter, z8, (i8 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i8 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i8 & 16) != 0 ? 1.0f : f8, (i8 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m2640calculateScaledSizeE7KxVPU(long j8) {
        float m2804getWidthimpl;
        float m2801getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m2642hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo3508getIntrinsicSizeNHjbRc())) {
                m2804getWidthimpl = Size.m2804getWidthimpl(j8);
            } else {
                m2804getWidthimpl = Size.m2804getWidthimpl(this.painter.mo3508getIntrinsicSizeNHjbRc());
            }
            if (!m2641hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo3508getIntrinsicSizeNHjbRc())) {
                m2801getHeightimpl = Size.m2801getHeightimpl(j8);
            } else {
                m2801getHeightimpl = Size.m2801getHeightimpl(this.painter.mo3508getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m2804getWidthimpl, m2801getHeightimpl);
            if (Size.m2804getWidthimpl(j8) == 0.0f || Size.m2801getHeightimpl(j8) == 0.0f) {
                return Size.Companion.m2813getZeroNHjbRc();
            }
            return ScaleFactorKt.m4203timesUQTWf7w(Size, this.contentScale.mo4122computeScaleFactorH7hwNQA(Size, j8));
        }
        return j8;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics && this.painter.mo3508getIntrinsicSizeNHjbRc() != Size.Companion.m2812getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m2641hasSpecifiedAndFiniteHeightuvyYCjk(long j8) {
        if (!Size.m2800equalsimpl0(j8, Size.Companion.m2812getUnspecifiedNHjbRc())) {
            float m2801getHeightimpl = Size.m2801getHeightimpl(j8);
            if (!Float.isInfinite(m2801getHeightimpl) && !Float.isNaN(m2801getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m2642hasSpecifiedAndFiniteWidthuvyYCjk(long j8) {
        if (!Size.m2800equalsimpl0(j8, Size.Companion.m2812getUnspecifiedNHjbRc())) {
            float m2804getWidthimpl = Size.m2804getWidthimpl(j8);
            if (!Float.isInfinite(m2804getWidthimpl) && !Float.isNaN(m2804getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m2643modifyConstraintsZezNO4M(long j8) {
        boolean z8;
        int m5148getMinWidthimpl;
        int m5147getMinHeightimpl;
        boolean z9 = false;
        if (Constraints.m5142getHasBoundedWidthimpl(j8) && Constraints.m5141getHasBoundedHeightimpl(j8)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Constraints.m5144getHasFixedWidthimpl(j8) && Constraints.m5143getHasFixedHeightimpl(j8)) {
            z9 = true;
        }
        if ((!getUseIntrinsicSize() && z8) || z9) {
            return Constraints.m5137copyZbe2FdA$default(j8, Constraints.m5146getMaxWidthimpl(j8), 0, Constraints.m5145getMaxHeightimpl(j8), 0, 10, null);
        }
        long mo3508getIntrinsicSizeNHjbRc = this.painter.mo3508getIntrinsicSizeNHjbRc();
        if (m2642hasSpecifiedAndFiniteWidthuvyYCjk(mo3508getIntrinsicSizeNHjbRc)) {
            m5148getMinWidthimpl = Z5.a.d(Size.m2804getWidthimpl(mo3508getIntrinsicSizeNHjbRc));
        } else {
            m5148getMinWidthimpl = Constraints.m5148getMinWidthimpl(j8);
        }
        if (m2641hasSpecifiedAndFiniteHeightuvyYCjk(mo3508getIntrinsicSizeNHjbRc)) {
            m5147getMinHeightimpl = Z5.a.d(Size.m2801getHeightimpl(mo3508getIntrinsicSizeNHjbRc));
        } else {
            m5147getMinHeightimpl = Constraints.m5147getMinHeightimpl(j8);
        }
        long m2640calculateScaledSizeE7KxVPU = m2640calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m5160constrainWidthK40F9xA(j8, m5148getMinWidthimpl), ConstraintsKt.m5159constrainHeightK40F9xA(j8, m5147getMinHeightimpl)));
        return Constraints.m5137copyZbe2FdA$default(j8, ConstraintsKt.m5160constrainWidthK40F9xA(j8, Z5.a.d(Size.m2804getWidthimpl(m2640calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5159constrainHeightK40F9xA(j8, Z5.a.d(Size.m2801getHeightimpl(m2640calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m2804getWidthimpl;
        float m2801getHeightimpl;
        long m2813getZeroNHjbRc;
        long mo3508getIntrinsicSizeNHjbRc = this.painter.mo3508getIntrinsicSizeNHjbRc();
        if (m2642hasSpecifiedAndFiniteWidthuvyYCjk(mo3508getIntrinsicSizeNHjbRc)) {
            m2804getWidthimpl = Size.m2804getWidthimpl(mo3508getIntrinsicSizeNHjbRc);
        } else {
            m2804getWidthimpl = Size.m2804getWidthimpl(contentDrawScope.mo3414getSizeNHjbRc());
        }
        if (m2641hasSpecifiedAndFiniteHeightuvyYCjk(mo3508getIntrinsicSizeNHjbRc)) {
            m2801getHeightimpl = Size.m2801getHeightimpl(mo3508getIntrinsicSizeNHjbRc);
        } else {
            m2801getHeightimpl = Size.m2801getHeightimpl(contentDrawScope.mo3414getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m2804getWidthimpl, m2801getHeightimpl);
        if (Size.m2804getWidthimpl(contentDrawScope.mo3414getSizeNHjbRc()) == 0.0f || Size.m2801getHeightimpl(contentDrawScope.mo3414getSizeNHjbRc()) == 0.0f) {
            m2813getZeroNHjbRc = Size.Companion.m2813getZeroNHjbRc();
        } else {
            m2813getZeroNHjbRc = ScaleFactorKt.m4203timesUQTWf7w(Size, this.contentScale.mo4122computeScaleFactorH7hwNQA(Size, contentDrawScope.mo3414getSizeNHjbRc()));
        }
        long j8 = m2813getZeroNHjbRc;
        long mo2608alignKFBX0sM = this.alignment.mo2608alignKFBX0sM(IntSizeKt.IntSize(Z5.a.d(Size.m2804getWidthimpl(j8)), Z5.a.d(Size.m2801getHeightimpl(j8))), IntSizeKt.IntSize(Z5.a.d(Size.m2804getWidthimpl(contentDrawScope.mo3414getSizeNHjbRc())), Z5.a.d(Size.m2801getHeightimpl(contentDrawScope.mo3414getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m5302getXimpl = IntOffset.m5302getXimpl(mo2608alignKFBX0sM);
        float m5303getYimpl = IntOffset.m5303getYimpl(mo2608alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m5302getXimpl, m5303getYimpl);
        this.painter.m3514drawx_KDEd0(contentDrawScope, j8, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m5302getXimpl, -m5303getYimpl);
        contentDrawScope.drawContent();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2643modifyConstraintsZezNO4M = m2643modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5147getMinHeightimpl(m2643modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2643modifyConstraintsZezNO4M = m2643modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5148getMinWidthimpl(m2643modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i8));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(m2643modifyConstraintsZezNO4M(j8));
        return MeasureScope.CC.q(measureScope, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo4131measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2643modifyConstraintsZezNO4M = m2643modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5147getMinHeightimpl(m2643modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2643modifyConstraintsZezNO4M = m2643modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5148getMinWidthimpl(m2643modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i8));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.b.a(this);
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f8) {
        this.alpha = f8;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z8) {
        this.sizeToIntrinsics = z8;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z8;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f8;
        this.colorFilter = colorFilter;
    }
}
