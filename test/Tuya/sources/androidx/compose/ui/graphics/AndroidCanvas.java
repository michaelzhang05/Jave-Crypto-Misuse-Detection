package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas;
    private Rect srcRect;

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
    }

    private final void drawLines(List<Offset> list, Paint paint, int i8) {
        if (list.size() >= 2) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i9 = 0;
            while (i9 < list.size() - 1) {
                long m2745unboximpl = list.get(i9).m2745unboximpl();
                long m2745unboximpl2 = list.get(i9 + 1).m2745unboximpl();
                this.internalCanvas.drawLine(Offset.m2735getXimpl(m2745unboximpl), Offset.m2736getYimpl(m2745unboximpl), Offset.m2735getXimpl(m2745unboximpl2), Offset.m2736getYimpl(m2745unboximpl2), asFrameworkPaint);
                i9 += i8;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            long m2745unboximpl = list.get(i8).m2745unboximpl();
            this.internalCanvas.drawPoint(Offset.m2735getXimpl(m2745unboximpl), Offset.m2736getYimpl(m2745unboximpl), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i8) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i9 = 0;
            while (i9 < fArr.length - 3) {
                this.internalCanvas.drawLine(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], asFrameworkPaint);
                i9 += i8 * 2;
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i8) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i9 = 0;
            while (i9 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i9], fArr[i9 + 1], asFrameworkPaint);
                i9 += i8;
            }
        }
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo2829clipPathmtrdDE(Path path, int i8) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m2840toRegionOp7u2Bmg(i8));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo2830clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8) {
        this.internalCanvas.clipRect(f8, f9, f10, f11, m2840toRegionOp7u2Bmg(i8));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public /* synthetic */ void mo2831clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int i8) {
        T.a(this, rect, i8);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo2832concat58bKbWc(float[] fArr) {
        if (!MatrixKt.m3206isIdentity58bKbWc(fArr)) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            AndroidMatrixConversions_androidKt.m2847setFromEL8BTi8(matrix, fArr);
            this.internalCanvas.concat(matrix);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArc(androidx.compose.ui.geometry.Rect rect, float f8, float f9, boolean z8, Paint paint) {
        T.b(this, rect, f8, f9, z8, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawArcRad(androidx.compose.ui.geometry.Rect rect, float f8, float f9, boolean z8, Paint paint) {
        T.c(this, rect, f8, f9, z8, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo2833drawCircle9KIMszo(long j8, float f8, Paint paint) {
        this.internalCanvas.drawCircle(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), f8, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo2834drawImaged4ec7I(ImageBitmap imageBitmap, long j8, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo2835drawImageRectHPBpro0(ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        AbstractC3159y.f(rect);
        rect.left = IntOffset.m5302getXimpl(j8);
        rect.top = IntOffset.m5303getYimpl(j8);
        rect.right = IntOffset.m5302getXimpl(j8) + IntSize.m5344getWidthimpl(j9);
        rect.bottom = IntOffset.m5303getYimpl(j8) + IntSize.m5343getHeightimpl(j9);
        L5.I i8 = L5.I.f6487a;
        Rect rect2 = this.dstRect;
        AbstractC3159y.f(rect2);
        rect2.left = IntOffset.m5302getXimpl(j10);
        rect2.top = IntOffset.m5303getYimpl(j10);
        rect2.right = IntOffset.m5302getXimpl(j10) + IntSize.m5344getWidthimpl(j11);
        rect2.bottom = IntOffset.m5303getYimpl(j10) + IntSize.m5343getHeightimpl(j11);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo2836drawLineWko1d7g(long j8, long j9, Paint paint) {
        this.internalCanvas.drawLine(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), Offset.m2735getXimpl(j9), Offset.m2736getYimpl(j9), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawOval(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        T.d(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo2837drawPointsO7TthRY(int i8, List<Offset> list, Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m3249equalsimpl0(i8, companion.m3253getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m3249equalsimpl0(i8, companion.m3255getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m3249equalsimpl0(i8, companion.m3254getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo2838drawRawPointsO7TthRY(int i8, float[] fArr, Paint paint) {
        if (fArr.length % 2 == 0) {
            PointMode.Companion companion = PointMode.Companion;
            if (PointMode.m3249equalsimpl0(i8, companion.m3253getLinesr_lszbg())) {
                drawRawLines(fArr, paint, 2);
                return;
            } else if (PointMode.m3249equalsimpl0(i8, companion.m3255getPolygonr_lszbg())) {
                drawRawLines(fArr, paint, 1);
                return;
            } else {
                if (PointMode.m3249equalsimpl0(i8, companion.m3254getPointsr_lszbg())) {
                    drawRawPoints(fArr, paint, 2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("points must have an even number of values");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void drawRect(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        T.e(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f8, float f9, float f10, float f11, float f12, float f13, Paint paint) {
        this.internalCanvas.drawRoundRect(f8, f9, f10, f11, f12, f13, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo2839drawVerticesTPEHhCM(Vertices vertices, int i8, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m2883toAndroidVertexModeJOOmi9M(vertices.m3350getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f8) {
        this.internalCanvas.rotate(f8);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f8, float f9) {
        this.internalCanvas.scale(f8, f9);
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f8, float f9) {
        this.internalCanvas.skew(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public /* synthetic */ void skewRad(float f8, float f9) {
        T.f(this, f8, f9);
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m2840toRegionOp7u2Bmg(int i8) {
        if (ClipOp.m2955equalsimpl0(i8, ClipOp.Companion.m2959getDifferencertfAjoo())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f8, float f9) {
        this.internalCanvas.translate(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, Paint paint) {
        this.internalCanvas.drawArc(f8, f9, f10, f11, f12, f13, z8, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f8, float f9, float f10, float f11, Paint paint) {
        this.internalCanvas.drawOval(f8, f9, f10, f11, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f8, float f9, float f10, float f11, Paint paint) {
        this.internalCanvas.drawRect(f8, f9, f10, f11, paint.asFrameworkPaint());
    }
}
