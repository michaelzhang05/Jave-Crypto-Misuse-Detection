package androidx.compose.ui.graphics.drawscope;

import O5.p;
import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private final DrawTransform transform;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo3425getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m3423getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            CanvasDrawScope.this.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo3426setSizeuvyYCjk(long j8) {
            CanvasDrawScope.this.getDrawParams().m3424setSizeuvyYCjk(j8);
        }
    };

    /* loaded from: classes.dex */
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j8, AbstractC3247p abstractC3247p) {
            this(density, layoutDirection, canvas, j8);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m3420copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i8 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i8 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            Canvas canvas2 = canvas;
            if ((i8 & 8) != 0) {
                j8 = drawParams.size;
            }
            return drawParams.m3422copyUg5Nnss(density, layoutDirection2, canvas2, j8);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m3421component4NHjbRc() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m3422copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j8) {
            return new DrawParams(density, layoutDirection, canvas, j8, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return AbstractC3255y.d(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && AbstractC3255y.d(this.canvas, drawParams.canvas) && Size.m2805equalsimpl0(this.size, drawParams.size);
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m3423getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m2810hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m3424setSizeuvyYCjk(long j8) {
            this.size = j8;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m2813toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j8) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j8;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i8 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i8 & 4) != 0 ? new EmptyCanvas() : canvas, (i8 & 8) != 0 ? Size.Companion.m2818getZeroNHjbRc() : j8, null);
        }
    }

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m3389configurePaint2qPWKa0(long j8, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f8, ColorFilter colorFilter, int i8, int i9) {
        Paint selectPaint = selectPaint(drawStyle);
        long m3397modulate5vOe2sY = m3397modulate5vOe2sY(j8, f8);
        if (!Color.m2977equalsimpl0(selectPaint.mo2855getColor0d7_KjU(), m3397modulate5vOe2sY)) {
            selectPaint.mo2861setColor8_81llA(m3397modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!AbstractC3255y.d(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2893equalsimpl0(selectPaint.mo2854getBlendMode0nO6VwU(), i8)) {
            selectPaint.mo2860setBlendModes9anfk8(i8);
        }
        if (!FilterQuality.m3070equalsimpl0(selectPaint.mo2856getFilterQualityfv9h1I(), i9)) {
            selectPaint.mo2862setFilterQualityvDHp3xo(i9);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m3390configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j8, DrawStyle drawStyle, float f8, ColorFilter colorFilter, int i8, int i9, int i10, Object obj) {
        int i11;
        if ((i10 & 32) != 0) {
            i11 = DrawScope.Companion.m3450getDefaultFilterQualityfv9h1I();
        } else {
            i11 = i9;
        }
        return canvasDrawScope.m3389configurePaint2qPWKa0(j8, drawStyle, f8, colorFilter, i8, i11);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m3391configurePaintswdJneE(Brush brush, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f8, ColorFilter colorFilter, int i8, int i9) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo2929applyToPq9zytI(mo3419getSizeNHjbRc(), selectPaint, f8);
        } else {
            if (selectPaint.getShader() != null) {
                selectPaint.setShader(null);
            }
            long mo2855getColor0d7_KjU = selectPaint.mo2855getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m2977equalsimpl0(mo2855getColor0d7_KjU, companion.m3002getBlack0d7_KjU())) {
                selectPaint.mo2861setColor8_81llA(companion.m3002getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() != f8) {
                selectPaint.setAlpha(f8);
            }
        }
        if (!AbstractC3255y.d(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2893equalsimpl0(selectPaint.mo2854getBlendMode0nO6VwU(), i8)) {
            selectPaint.mo2860setBlendModes9anfk8(i8);
        }
        if (!FilterQuality.m3070equalsimpl0(selectPaint.mo2856getFilterQualityfv9h1I(), i9)) {
            selectPaint.mo2862setFilterQualityvDHp3xo(i9);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m3392configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f8, ColorFilter colorFilter, int i8, int i9, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            i9 = DrawScope.Companion.m3450getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m3391configurePaintswdJneE(brush, drawStyle, f8, colorFilter, i8, i9);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m3393configureStrokePaintQ_0CZUI(long j8, float f8, float f9, int i8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f10, ColorFilter colorFilter, int i10, int i11) {
        Paint obtainStrokePaint = obtainStrokePaint();
        long m3397modulate5vOe2sY = m3397modulate5vOe2sY(j8, f10);
        if (!Color.m2977equalsimpl0(obtainStrokePaint.mo2855getColor0d7_KjU(), m3397modulate5vOe2sY)) {
            obtainStrokePaint.mo2861setColor8_81llA(m3397modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!AbstractC3255y.d(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2893equalsimpl0(obtainStrokePaint.mo2854getBlendMode0nO6VwU(), i10)) {
            obtainStrokePaint.mo2860setBlendModes9anfk8(i10);
        }
        if (obtainStrokePaint.getStrokeWidth() != f8) {
            obtainStrokePaint.setStrokeWidth(f8);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f9) {
            obtainStrokePaint.setStrokeMiterLimit(f9);
        }
        if (!StrokeCap.m3302equalsimpl0(obtainStrokePaint.mo2857getStrokeCapKaPHkGw(), i8)) {
            obtainStrokePaint.mo2863setStrokeCapBeK7IIE(i8);
        }
        if (!StrokeJoin.m3312equalsimpl0(obtainStrokePaint.mo2858getStrokeJoinLxFBmk8(), i9)) {
            obtainStrokePaint.mo2864setStrokeJoinWw9F2mQ(i9);
        }
        if (!AbstractC3255y.d(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m3070equalsimpl0(obtainStrokePaint.mo2856getFilterQualityfv9h1I(), i11)) {
            obtainStrokePaint.mo2862setFilterQualityvDHp3xo(i11);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m3394configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j8, float f8, float f9, int i8, int i9, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 512) != 0) {
            i13 = DrawScope.Companion.m3450getDefaultFilterQualityfv9h1I();
        } else {
            i13 = i11;
        }
        return canvasDrawScope.m3393configureStrokePaintQ_0CZUI(j8, f8, f9, i8, i9, pathEffect, f10, colorFilter, i10, i13);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m3395configureStrokePaintho4zsrM(Brush brush, float f8, float f9, int i8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f10, ColorFilter colorFilter, int i10, int i11) {
        Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo2929applyToPq9zytI(mo3419getSizeNHjbRc(), obtainStrokePaint, f10);
        } else if (obtainStrokePaint.getAlpha() != f10) {
            obtainStrokePaint.setAlpha(f10);
        }
        if (!AbstractC3255y.d(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2893equalsimpl0(obtainStrokePaint.mo2854getBlendMode0nO6VwU(), i10)) {
            obtainStrokePaint.mo2860setBlendModes9anfk8(i10);
        }
        if (obtainStrokePaint.getStrokeWidth() != f8) {
            obtainStrokePaint.setStrokeWidth(f8);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f9) {
            obtainStrokePaint.setStrokeMiterLimit(f9);
        }
        if (!StrokeCap.m3302equalsimpl0(obtainStrokePaint.mo2857getStrokeCapKaPHkGw(), i8)) {
            obtainStrokePaint.mo2863setStrokeCapBeK7IIE(i8);
        }
        if (!StrokeJoin.m3312equalsimpl0(obtainStrokePaint.mo2858getStrokeJoinLxFBmk8(), i9)) {
            obtainStrokePaint.mo2864setStrokeJoinWw9F2mQ(i9);
        }
        if (!AbstractC3255y.d(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m3070equalsimpl0(obtainStrokePaint.mo2856getFilterQualityfv9h1I(), i11)) {
            obtainStrokePaint.mo2862setFilterQualityvDHp3xo(i11);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m3396configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f8, float f9, int i8, int i9, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 512) != 0) {
            i13 = DrawScope.Companion.m3450getDefaultFilterQualityfv9h1I();
        } else {
            i13 = i11;
        }
        return canvasDrawScope.m3395configureStrokePaintho4zsrM(brush, f8, f9, i8, i9, pathEffect, f10, colorFilter, i10, i13);
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m3397modulate5vOe2sY(long j8, float f8) {
        if (f8 != 1.0f) {
            return Color.m2975copywmQWz5c$default(j8, Color.m2978getAlphaimpl(j8) * f8, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j8;
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo2865setStylek9PVt8s(PaintingStyle.Companion.m3223getFillTiuSbCo());
            this.fillPaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo2865setStylek9PVt8s(PaintingStyle.Companion.m3224getStrokeTiuSbCo());
            this.strokePaint = Paint;
            return Paint;
        }
        return paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (AbstractC3255y.d(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof Stroke) {
            Paint obtainStrokePaint = obtainStrokePaint();
            Stroke stroke = (Stroke) drawStyle;
            if (obtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m3302equalsimpl0(obtainStrokePaint.mo2857getStrokeCapKaPHkGw(), stroke.m3507getCapKaPHkGw())) {
                obtainStrokePaint.mo2863setStrokeCapBeK7IIE(stroke.m3507getCapKaPHkGw());
            }
            if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m3312equalsimpl0(obtainStrokePaint.mo2858getStrokeJoinLxFBmk8(), stroke.m3508getJoinLxFBmk8())) {
                obtainStrokePaint.mo2864setStrokeJoinWw9F2mQ(stroke.m3508getJoinLxFBmk8());
            }
            if (!AbstractC3255y.d(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
            }
            return obtainStrokePaint;
        }
        throw new p();
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m3398drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j8, Function1 function1) {
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m3421component4NHjbRc = drawParams.m3421component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m3424setSizeuvyYCjk(j8);
        canvas.save();
        function1.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3424setSizeuvyYCjk(m3421component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo3399drawArcillE91I(Brush brush, float f8, float f9, boolean z8, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawArc(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8), Offset.m2740getXimpl(j8) + Size.m2809getWidthimpl(j9), Offset.m2741getYimpl(j8) + Size.m2806getHeightimpl(j9), f8, f9, z8, m3392configurePaintswdJneE$default(this, brush, drawStyle, f10, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo3400drawArcyD3GUKo(long j8, float f8, float f9, boolean z8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawArc(Offset.m2740getXimpl(j9), Offset.m2741getYimpl(j9), Offset.m2740getXimpl(j9) + Size.m2809getWidthimpl(j10), Offset.m2741getYimpl(j9) + Size.m2806getHeightimpl(j10), f8, f9, z8, m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f10, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo3401drawCircleV9BoPsw(Brush brush, float f8, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().mo2838drawCircle9KIMszo(j8, f8, m3392configurePaintswdJneE$default(this, brush, drawStyle, f9, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo3402drawCircleVaOC9Bg(long j8, float f8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().mo2838drawCircle9KIMszo(j9, f8, m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f9, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo3403drawImage9jGpkUE(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().mo2840drawImageRectHPBpro0(imageBitmap, j8, j9, j10, j11, m3392configurePaintswdJneE$default(this, null, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo3404drawImageAZ2fEMs(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9) {
        this.drawParams.getCanvas().mo2840drawImageRectHPBpro0(imageBitmap, j8, j9, j10, j11, m3391configurePaintswdJneE(null, drawStyle, f8, colorFilter, i8, i9));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo3405drawImagegbVJVH8(ImageBitmap imageBitmap, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().mo2839drawImaged4ec7I(imageBitmap, j8, m3392configurePaintswdJneE$default(this, null, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo3406drawLine1RTmtNc(Brush brush, long j8, long j9, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9) {
        this.drawParams.getCanvas().mo2841drawLineWko1d7g(j8, j9, m3396configureStrokePaintho4zsrM$default(this, brush, f8, 4.0f, i8, StrokeJoin.Companion.m3317getMiterLxFBmk8(), pathEffect, f9, colorFilter, i9, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo3407drawLineNGM6Ib0(long j8, long j9, long j10, float f8, int i8, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i9) {
        this.drawParams.getCanvas().mo2841drawLineWko1d7g(j9, j10, m3394configureStrokePaintQ_0CZUI$default(this, j8, f8, 4.0f, i8, StrokeJoin.Companion.m3317getMiterLxFBmk8(), pathEffect, f9, colorFilter, i9, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo3408drawOvalAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawOval(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8), Offset.m2740getXimpl(j8) + Size.m2809getWidthimpl(j9), Offset.m2741getYimpl(j8) + Size.m2806getHeightimpl(j9), m3392configurePaintswdJneE$default(this, brush, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo3409drawOvalnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawOval(Offset.m2740getXimpl(j9), Offset.m2741getYimpl(j9), Offset.m2740getXimpl(j9) + Size.m2809getWidthimpl(j10), Offset.m2741getYimpl(j9) + Size.m2806getHeightimpl(j10), m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo3410drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawPath(path, m3392configurePaintswdJneE$default(this, brush, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo3411drawPathLG529CI(Path path, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawPath(path, m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo3412drawPointsF8ZwMP8(List<Offset> list, int i8, long j8, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo2842drawPointsO7TthRY(i8, list, m3394configureStrokePaintQ_0CZUI$default(this, j8, f8, 4.0f, i9, StrokeJoin.Companion.m3317getMiterLxFBmk8(), pathEffect, f9, colorFilter, i10, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo3413drawPointsGsft0Ws(List<Offset> list, int i8, Brush brush, float f8, int i9, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f9, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo2842drawPointsO7TthRY(i8, list, m3396configureStrokePaintho4zsrM$default(this, brush, f8, 4.0f, i9, StrokeJoin.Companion.m3317getMiterLxFBmk8(), pathEffect, f9, colorFilter, i10, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo3414drawRectAsUm42w(Brush brush, long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawRect(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8), Offset.m2740getXimpl(j8) + Size.m2809getWidthimpl(j9), Offset.m2741getYimpl(j8) + Size.m2806getHeightimpl(j9), m3392configurePaintswdJneE$default(this, brush, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo3415drawRectnJ9OG0(long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawRect(Offset.m2740getXimpl(j9), Offset.m2741getYimpl(j9), Offset.m2740getXimpl(j9) + Size.m2809getWidthimpl(j10), Offset.m2741getYimpl(j9) + Size.m2806getHeightimpl(j10), m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo3416drawRoundRectZuiqVtQ(Brush brush, long j8, long j9, long j10, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8), Offset.m2740getXimpl(j8) + Size.m2809getWidthimpl(j9), Offset.m2741getYimpl(j8) + Size.m2806getHeightimpl(j9), CornerRadius.m2715getXimpl(j10), CornerRadius.m2716getYimpl(j10), m3392configurePaintswdJneE$default(this, brush, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo3417drawRoundRectuAw5IA(long j8, long j9, long j10, long j11, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f8, ColorFilter colorFilter, int i8) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m2740getXimpl(j9), Offset.m2741getYimpl(j9), Offset.m2740getXimpl(j9) + Size.m2809getWidthimpl(j10), Offset.m2741getYimpl(j9) + Size.m2806getHeightimpl(j10), CornerRadius.m2715getXimpl(j11), CornerRadius.m2716getYimpl(j11), m3390configurePaint2qPWKa0$default(this, j8, drawStyle, f8, colorFilter, i8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public /* synthetic */ long mo3418getCenterF1C5BW0() {
        return c.b(this);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public /* synthetic */ long mo3419getSizeNHjbRc() {
        return c.c(this);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo446roundToPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo447roundToPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo448toDpGaN1DYA(long j8) {
        return androidx.compose.ui.unit.b.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo449toDpu2uoSUM(float f8) {
        return androidx.compose.ui.unit.a.c(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo451toDpSizekrfVVM(long j8) {
        return androidx.compose.ui.unit.a.e(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo452toPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.f(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo453toPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.g(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.h(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo454toSizeXkaWNTQ(long j8) {
        return androidx.compose.ui.unit.a.i(this, j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo455toSp0xMU5do(float f8) {
        return androidx.compose.ui.unit.b.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo456toSpkPz2Gy4(float f8) {
        return androidx.compose.ui.unit.a.j(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo450toDpu2uoSUM(int i8) {
        return androidx.compose.ui.unit.a.d(this, i8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo457toSpkPz2Gy4(int i8) {
        return androidx.compose.ui.unit.a.k(this, i8);
    }
}
