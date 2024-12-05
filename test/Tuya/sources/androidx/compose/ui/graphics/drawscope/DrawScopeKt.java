package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m3480clipPathKD09W0M(DrawScope drawScope, Path path, int i8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3422clipPathmtrdDE(path, i8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m3481clipPathKD09W0M$default(DrawScope drawScope, Path path, int i8, Function1 function1, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = ClipOp.Companion.m2960getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3422clipPathmtrdDE(path, i8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m3482clipRectrOu3jXo(DrawScope drawScope, float f8, float f9, float f10, float f11, int i8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3423clipRectN_I0leg(f8, f9, f10, f11, i8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m3483clipRectrOu3jXo$default(DrawScope drawScope, float f8, float f9, float f10, float f11, int i8, Function1 function1, int i9, Object obj) {
        float f12;
        float f13;
        if ((i9 & 1) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f8;
        }
        if ((i9 & 2) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f9;
        }
        if ((i9 & 4) != 0) {
            f10 = Size.m2804getWidthimpl(drawScope.mo3414getSizeNHjbRc());
        }
        float f14 = f10;
        if ((i9 & 8) != 0) {
            f11 = Size.m2801getHeightimpl(drawScope.mo3414getSizeNHjbRc());
        }
        float f15 = f11;
        if ((i9 & 16) != 0) {
            i8 = ClipOp.Companion.m2960getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3423clipRectN_I0leg(f12, f13, f14, f15, i8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final void m3484drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j8, Function1 function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo3420getSizeNHjbRc = drawScope.getDrawContext().mo3420getSizeNHjbRc();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo3421setSizeuvyYCjk(j8);
        canvas.save();
        function1.invoke(drawScope);
        canvas.restore();
        DrawContext drawContext2 = drawScope.getDrawContext();
        drawContext2.setDensity(density2);
        drawContext2.setLayoutDirection(layoutDirection2);
        drawContext2.setCanvas(canvas2);
        drawContext2.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(DrawScope drawScope, Function1 function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f8, float f9, float f10, float f11, Function1 function1) {
        drawScope.getDrawContext().getTransform().inset(f8, f9, f10, f11);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f8, -f9, -f10, -f11);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f8, float f9, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f8, f9, f8, f9);
        function1.invoke(drawScope);
        float f10 = -f8;
        float f11 = -f9;
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m3485rotateRg1IO4c(DrawScope drawScope, float f8, long j8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3426rotateUv8p0NA(f8, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3486rotateRg1IO4c$default(DrawScope drawScope, float f8, long j8, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = drawScope.mo3413getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3426rotateUv8p0NA(f8, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m3487rotateRadRg1IO4c(DrawScope drawScope, float f8, long j8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3426rotateUv8p0NA(DegreesKt.degrees(f8), j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3488rotateRadRg1IO4c$default(DrawScope drawScope, float f8, long j8, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = drawScope.mo3413getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3426rotateUv8p0NA(DegreesKt.degrees(f8), j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m3489scaleFgt4K4Q(DrawScope drawScope, float f8, float f9, long j8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3427scale0AR0LA0(f8, f9, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m3490scaleFgt4K4Q$default(DrawScope drawScope, float f8, float f9, long j8, Function1 function1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = drawScope.mo3413getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3427scale0AR0LA0(f8, f9, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m3491scaleRg1IO4c(DrawScope drawScope, float f8, long j8, Function1 function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3427scale0AR0LA0(f8, f8, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3492scaleRg1IO4c$default(DrawScope drawScope, float f8, long j8, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = drawScope.mo3413getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3427scale0AR0LA0(f8, f8, j8);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    public static final void translate(DrawScope drawScope, float f8, float f9, Function1 function1) {
        drawScope.getDrawContext().getTransform().translate(f8, f9);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f8, -f9);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f8, float f9, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f8, f9);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f8, -f9);
    }

    public static final void withTransform(DrawScope drawScope, Function1 function1, Function1 function12) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        function1.invoke(drawContext.getTransform());
        function12.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    public static final void inset(DrawScope drawScope, float f8, Function1 function1) {
        drawScope.getDrawContext().getTransform().inset(f8, f8, f8, f8);
        function1.invoke(drawScope);
        float f9 = -f8;
        drawScope.getDrawContext().getTransform().inset(f9, f9, f9, f9);
    }

    public static final void inset(DrawScope drawScope, float f8, float f9, Function1 function1) {
        drawScope.getDrawContext().getTransform().inset(f8, f9, f8, f9);
        function1.invoke(drawScope);
        float f10 = -f8;
        float f11 = -f9;
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
    }
}
