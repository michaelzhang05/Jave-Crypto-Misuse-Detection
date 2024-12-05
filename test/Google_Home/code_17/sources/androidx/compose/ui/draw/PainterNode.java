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
import c6.AbstractC2055a;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, AbstractC3247p abstractC3247p) {
        this(painter, z8, (i8 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i8 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i8 & 16) != 0 ? 1.0f : f8, (i8 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m2645calculateScaledSizeE7KxVPU(long j8) {
        float m2809getWidthimpl;
        float m2806getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m2647hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo3513getIntrinsicSizeNHjbRc())) {
                m2809getWidthimpl = Size.m2809getWidthimpl(j8);
            } else {
                m2809getWidthimpl = Size.m2809getWidthimpl(this.painter.mo3513getIntrinsicSizeNHjbRc());
            }
            if (!m2646hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo3513getIntrinsicSizeNHjbRc())) {
                m2806getHeightimpl = Size.m2806getHeightimpl(j8);
            } else {
                m2806getHeightimpl = Size.m2806getHeightimpl(this.painter.mo3513getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m2809getWidthimpl, m2806getHeightimpl);
            if (Size.m2809getWidthimpl(j8) == 0.0f || Size.m2806getHeightimpl(j8) == 0.0f) {
                return Size.Companion.m2818getZeroNHjbRc();
            }
            return ScaleFactorKt.m4208timesUQTWf7w(Size, this.contentScale.mo4127computeScaleFactorH7hwNQA(Size, j8));
        }
        return j8;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics && this.painter.mo3513getIntrinsicSizeNHjbRc() != Size.Companion.m2817getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m2646hasSpecifiedAndFiniteHeightuvyYCjk(long j8) {
        if (!Size.m2805equalsimpl0(j8, Size.Companion.m2817getUnspecifiedNHjbRc())) {
            float m2806getHeightimpl = Size.m2806getHeightimpl(j8);
            if (!Float.isInfinite(m2806getHeightimpl) && !Float.isNaN(m2806getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m2647hasSpecifiedAndFiniteWidthuvyYCjk(long j8) {
        if (!Size.m2805equalsimpl0(j8, Size.Companion.m2817getUnspecifiedNHjbRc())) {
            float m2809getWidthimpl = Size.m2809getWidthimpl(j8);
            if (!Float.isInfinite(m2809getWidthimpl) && !Float.isNaN(m2809getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m2648modifyConstraintsZezNO4M(long j8) {
        boolean z8;
        int m5153getMinWidthimpl;
        int m5152getMinHeightimpl;
        boolean z9 = false;
        if (Constraints.m5147getHasBoundedWidthimpl(j8) && Constraints.m5146getHasBoundedHeightimpl(j8)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Constraints.m5149getHasFixedWidthimpl(j8) && Constraints.m5148getHasFixedHeightimpl(j8)) {
            z9 = true;
        }
        if ((!getUseIntrinsicSize() && z8) || z9) {
            return Constraints.m5142copyZbe2FdA$default(j8, Constraints.m5151getMaxWidthimpl(j8), 0, Constraints.m5150getMaxHeightimpl(j8), 0, 10, null);
        }
        long mo3513getIntrinsicSizeNHjbRc = this.painter.mo3513getIntrinsicSizeNHjbRc();
        if (m2647hasSpecifiedAndFiniteWidthuvyYCjk(mo3513getIntrinsicSizeNHjbRc)) {
            m5153getMinWidthimpl = AbstractC2055a.d(Size.m2809getWidthimpl(mo3513getIntrinsicSizeNHjbRc));
        } else {
            m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        }
        if (m2646hasSpecifiedAndFiniteHeightuvyYCjk(mo3513getIntrinsicSizeNHjbRc)) {
            m5152getMinHeightimpl = AbstractC2055a.d(Size.m2806getHeightimpl(mo3513getIntrinsicSizeNHjbRc));
        } else {
            m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
        }
        long m2645calculateScaledSizeE7KxVPU = m2645calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m5165constrainWidthK40F9xA(j8, m5153getMinWidthimpl), ConstraintsKt.m5164constrainHeightK40F9xA(j8, m5152getMinHeightimpl)));
        return Constraints.m5142copyZbe2FdA$default(j8, ConstraintsKt.m5165constrainWidthK40F9xA(j8, AbstractC2055a.d(Size.m2809getWidthimpl(m2645calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5164constrainHeightK40F9xA(j8, AbstractC2055a.d(Size.m2806getHeightimpl(m2645calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m2809getWidthimpl;
        float m2806getHeightimpl;
        long m2818getZeroNHjbRc;
        long mo3513getIntrinsicSizeNHjbRc = this.painter.mo3513getIntrinsicSizeNHjbRc();
        if (m2647hasSpecifiedAndFiniteWidthuvyYCjk(mo3513getIntrinsicSizeNHjbRc)) {
            m2809getWidthimpl = Size.m2809getWidthimpl(mo3513getIntrinsicSizeNHjbRc);
        } else {
            m2809getWidthimpl = Size.m2809getWidthimpl(contentDrawScope.mo3419getSizeNHjbRc());
        }
        if (m2646hasSpecifiedAndFiniteHeightuvyYCjk(mo3513getIntrinsicSizeNHjbRc)) {
            m2806getHeightimpl = Size.m2806getHeightimpl(mo3513getIntrinsicSizeNHjbRc);
        } else {
            m2806getHeightimpl = Size.m2806getHeightimpl(contentDrawScope.mo3419getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m2809getWidthimpl, m2806getHeightimpl);
        if (Size.m2809getWidthimpl(contentDrawScope.mo3419getSizeNHjbRc()) == 0.0f || Size.m2806getHeightimpl(contentDrawScope.mo3419getSizeNHjbRc()) == 0.0f) {
            m2818getZeroNHjbRc = Size.Companion.m2818getZeroNHjbRc();
        } else {
            m2818getZeroNHjbRc = ScaleFactorKt.m4208timesUQTWf7w(Size, this.contentScale.mo4127computeScaleFactorH7hwNQA(Size, contentDrawScope.mo3419getSizeNHjbRc()));
        }
        long j8 = m2818getZeroNHjbRc;
        long mo2613alignKFBX0sM = this.alignment.mo2613alignKFBX0sM(IntSizeKt.IntSize(AbstractC2055a.d(Size.m2809getWidthimpl(j8)), AbstractC2055a.d(Size.m2806getHeightimpl(j8))), IntSizeKt.IntSize(AbstractC2055a.d(Size.m2809getWidthimpl(contentDrawScope.mo3419getSizeNHjbRc())), AbstractC2055a.d(Size.m2806getHeightimpl(contentDrawScope.mo3419getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m5307getXimpl = IntOffset.m5307getXimpl(mo2613alignKFBX0sM);
        float m5308getYimpl = IntOffset.m5308getYimpl(mo2613alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m5307getXimpl, m5308getYimpl);
        this.painter.m3519drawx_KDEd0(contentDrawScope, j8, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m5307getXimpl, -m5308getYimpl);
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
            long m2648modifyConstraintsZezNO4M = m2648modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5152getMinHeightimpl(m2648modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2648modifyConstraintsZezNO4M = m2648modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5153getMinWidthimpl(m2648modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i8));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo368measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4136measureBRTryo0 = measurable.mo4136measureBRTryo0(m2648modifyConstraintsZezNO4M(j8));
        return MeasureScope.CC.q(measureScope, mo4136measureBRTryo0.getWidth(), mo4136measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo4136measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2648modifyConstraintsZezNO4M = m2648modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null));
            return Math.max(Constraints.m5152getMinHeightimpl(m2648modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i8));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        if (getUseIntrinsicSize()) {
            long m2648modifyConstraintsZezNO4M = m2648modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null));
            return Math.max(Constraints.m5153getMinWidthimpl(m2648modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i8));
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
