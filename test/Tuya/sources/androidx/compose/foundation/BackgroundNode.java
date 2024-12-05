package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private Size lastSize;
    private Shape shape;

    public /* synthetic */ BackgroundNode(long j8, Brush brush, float f8, Shape shape, AbstractC3151p abstractC3151p) {
        this(j8, brush, f8, shape);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline mo331createOutlinePq9zytI;
        if (Size.m2799equalsimpl(contentDrawScope.mo3414getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && AbstractC3159y.d(this.lastShape, this.shape)) {
            mo331createOutlinePq9zytI = this.lastOutline;
            AbstractC3159y.f(mo331createOutlinePq9zytI);
        } else {
            mo331createOutlinePq9zytI = this.shape.mo331createOutlinePq9zytI(contentDrawScope.mo3414getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        if (!Color.m2972equalsimpl0(this.color, Color.Companion.m3007getUnspecified0d7_KjU())) {
            OutlineKt.m3210drawOutlinewDX37Ww$default(contentDrawScope, mo331createOutlinePq9zytI, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m3208drawOutlinehn5TExg$default(contentDrawScope, mo331createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = mo331createOutlinePq9zytI;
        this.lastSize = Size.m2792boximpl(contentDrawScope.mo3414getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m2972equalsimpl0(this.color, Color.Companion.m3007getUnspecified0d7_KjU())) {
            androidx.compose.ui.graphics.drawscope.c.K(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            androidx.compose.ui.graphics.drawscope.c.J(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        AbstractC3159y.i(contentDrawScope, "<this>");
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m283getColor0d7_KjU() {
        return this.color;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.b.a(this);
    }

    public final void setAlpha(float f8) {
        this.alpha = f8;
    }

    public final void setBrush(Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m284setColor8_81llA(long j8) {
        this.color = j8;
    }

    public final void setShape(Shape shape) {
        AbstractC3159y.i(shape, "<set-?>");
        this.shape = shape;
    }

    private BackgroundNode(long j8, Brush brush, float f8, Shape shape) {
        AbstractC3159y.i(shape, "shape");
        this.color = j8;
        this.brush = brush;
        this.alpha = f8;
        this.shape = shape;
    }
}
