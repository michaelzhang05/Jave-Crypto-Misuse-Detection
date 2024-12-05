package androidx.compose.ui.node;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m4269drawx_KDEd0$ui_release(Canvas canvas, long j8, NodeCoordinator nodeCoordinator, Modifier.Node node) {
        int m4348constructorimpl = NodeKind.m4348constructorimpl(4);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof DrawModifierNode) {
                m4270drawDirectx_KDEd0$ui_release(canvas, j8, nodeCoordinator, node);
            } else if ((node.getKindSet$ui_release() & m4348constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                int i8 = 0;
                node = node;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4348constructorimpl) != 0) {
                        i8++;
                        if (i8 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    node = node;
                }
                if (i8 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo3399drawArcillE91I(Brush brush, float f8, float f9, boolean z8, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3399drawArcillE91I(brush, f8, f9, z8, j8, j9, f10, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo3400drawArcyD3GUKo(long j8, float f8, float f9, boolean z8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3400drawArcyD3GUKo(j8, f8, f9, z8, j9, j10, f10, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo3401drawCircleV9BoPsw(Brush brush, float f8, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3401drawCircleV9BoPsw(brush, f8, j8, f9, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo3402drawCircleVaOC9Bg(long j8, float f8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3402drawCircleVaOC9Bg(j8, f8, j9, f9, drawStyle, colorFilter, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        DelegatingNode nextDrawNode;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        AbstractC3255y.f(drawModifierNode);
        nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (nextDrawNode != 0) {
            int m4348constructorimpl = NodeKind.m4348constructorimpl(4);
            MutableVector mutableVector = null;
            while (nextDrawNode != 0) {
                if (nextDrawNode instanceof DrawModifierNode) {
                    performDraw((DrawModifierNode) nextDrawNode, canvas);
                } else if ((nextDrawNode.getKindSet$ui_release() & m4348constructorimpl) != 0 && (nextDrawNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = nextDrawNode.getDelegate$ui_release();
                    int i8 = 0;
                    nextDrawNode = nextDrawNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4348constructorimpl) != 0) {
                            i8++;
                            if (i8 == 1) {
                                nextDrawNode = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (nextDrawNode != 0) {
                                    mutableVector.add(nextDrawNode);
                                    nextDrawNode = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        nextDrawNode = nextDrawNode;
                    }
                    if (i8 == 1) {
                    }
                }
                nextDrawNode = DelegatableNodeKt.pop(mutableVector);
            }
            return;
        }
        NodeCoordinator m4231requireCoordinator64DMado = DelegatableNodeKt.m4231requireCoordinator64DMado(drawModifierNode, NodeKind.m4348constructorimpl(4));
        if (m4231requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
            m4231requireCoordinator64DMado = m4231requireCoordinator64DMado.getWrapped$ui_release();
            AbstractC3255y.f(m4231requireCoordinator64DMado);
        }
        m4231requireCoordinator64DMado.performDraw(canvas);
    }

    /* renamed from: drawDirect-x_KDEd0$ui_release, reason: not valid java name */
    public final void m4270drawDirectx_KDEd0$ui_release(Canvas canvas, long j8, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m3421component4NHjbRc = drawParams.m3421component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(nodeCoordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m3424setSizeuvyYCjk(j8);
        canvas.save();
        drawModifierNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3424setSizeuvyYCjk(m3421component4NHjbRc);
        this.drawNode = drawModifierNode2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo3403drawImage9jGpkUE(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3403drawImage9jGpkUE(imageBitmap, j8, j9, j10, j11, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo3404drawImageAZ2fEMs(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9) {
        this.canvasDrawScope.mo3404drawImageAZ2fEMs(imageBitmap, j8, j9, j10, j11, f8, drawStyle, colorFilter, i8, i9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo3405drawImagegbVJVH8(ImageBitmap imageBitmap, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3405drawImagegbVJVH8(imageBitmap, j8, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo3406drawLine1RTmtNc(Brush brush, long j8, long j9, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9) {
        this.canvasDrawScope.mo3406drawLine1RTmtNc(brush, j8, j9, f8, i8, pathEffect, f9, colorFilter, i9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo3407drawLineNGM6Ib0(long j8, long j9, long j10, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9) {
        this.canvasDrawScope.mo3407drawLineNGM6Ib0(j8, j9, j10, f8, i8, pathEffect, f9, colorFilter, i9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo3408drawOvalAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3408drawOvalAsUm42w(brush, j8, j9, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo3409drawOvalnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3409drawOvalnJ9OG0(j8, j9, j10, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo3410drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3410drawPathGBMwjPU(path, brush, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo3411drawPathLG529CI(Path path, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3411drawPathLG529CI(path, j8, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo3412drawPointsF8ZwMP8(List<Offset> list, int i8, long j8, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo3412drawPointsF8ZwMP8(list, i8, j8, f8, i9, pathEffect, f9, colorFilter, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo3413drawPointsGsft0Ws(List<Offset> list, int i8, Brush brush, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo3413drawPointsGsft0Ws(list, i8, brush, f8, i9, pathEffect, f9, colorFilter, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo3414drawRectAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3414drawRectAsUm42w(brush, j8, j9, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo3415drawRectnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3415drawRectnJ9OG0(j8, j9, j10, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo3416drawRoundRectZuiqVtQ(Brush brush, long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3416drawRoundRectZuiqVtQ(brush, j8, j9, j10, f8, drawStyle, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo3417drawRoundRectuAw5IA(long j8, long j9, long j10, long j11, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f8, ColorFilter colorFilter, int i8) {
        this.canvasDrawScope.mo3417drawRoundRectuAw5IA(j8, j9, j10, j11, drawStyle, f8, colorFilter, i8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo3418getCenterF1C5BW0() {
        return this.canvasDrawScope.mo3418getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo3419getSizeNHjbRc() {
        return this.canvasDrawScope.mo3419getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas) {
        NodeCoordinator m4231requireCoordinator64DMado = DelegatableNodeKt.m4231requireCoordinator64DMado(drawModifierNode, NodeKind.m4348constructorimpl(4));
        m4231requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m4270drawDirectx_KDEd0$ui_release(canvas, IntSizeKt.m5359toSizeozmzZPI(m4231requireCoordinator64DMado.mo4143getSizeYbymL2g()), m4231requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo446roundToPxR2X_6o(long j8) {
        return this.canvasDrawScope.mo446roundToPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo447roundToPx0680j_4(float f8) {
        return this.canvasDrawScope.mo447roundToPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo448toDpGaN1DYA(long j8) {
        return this.canvasDrawScope.mo448toDpGaN1DYA(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo449toDpu2uoSUM(float f8) {
        return this.canvasDrawScope.mo449toDpu2uoSUM(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo451toDpSizekrfVVM(long j8) {
        return this.canvasDrawScope.mo451toDpSizekrfVVM(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo452toPxR2X_6o(long j8) {
        return this.canvasDrawScope.mo452toPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo453toPx0680j_4(float f8) {
        return this.canvasDrawScope.mo453toPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo454toSizeXkaWNTQ(long j8) {
        return this.canvasDrawScope.mo454toSizeXkaWNTQ(j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo455toSp0xMU5do(float f8) {
        return this.canvasDrawScope.mo455toSp0xMU5do(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo456toSpkPz2Gy4(float f8) {
        return this.canvasDrawScope.mo456toSpkPz2Gy4(f8);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo450toDpu2uoSUM(int i8) {
        return this.canvasDrawScope.mo450toDpu2uoSUM(i8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo457toSpkPz2Gy4(int i8) {
        return this.canvasDrawScope.mo457toSpkPz2Gy4(i8);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
