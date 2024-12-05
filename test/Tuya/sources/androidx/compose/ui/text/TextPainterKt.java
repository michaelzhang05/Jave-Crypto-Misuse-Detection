package androidx.compose.ui.text;

import M5.AbstractC1246t;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.d;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5124equalsimpl0(textLayoutResult.getLayoutInput().m4661getOverflowgIe3tQ8(), TextOverflow.Companion.m5133getVisiblegIe3tQ8())) {
            d.d(drawTransform, 0.0f, 0.0f, IntSize.m5344getWidthimpl(textLayoutResult.m4665getSizeYbymL2g()), IntSize.m5343getHeightimpl(textLayoutResult.m4665getSizeYbymL2g()), 0, 16, null);
        }
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m4671drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j8, TextStyle textStyle, int i8, boolean z8, int i9, List<AnnotatedString.Range<Placeholder>> list, long j9, int i10) {
        TextLayoutResult m4668measurexDpz5zY$default = TextMeasurer.m4668measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i8, z8, i9, list, m4679textLayoutConstraintsv_w8tDc(drawScope, j9, j8), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8));
        clip(transform, m4668measurexDpz5zY$default);
        MultiParagraph.m4568paintLG529CI$default(m4668measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i10, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: drawText-JFhB2K4$default, reason: not valid java name */
    public static /* synthetic */ void m4672drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j8, TextStyle textStyle, int i8, boolean z8, int i9, List list, long j9, int i10, int i11, Object obj) {
        long j10;
        TextStyle textStyle2;
        int i12;
        boolean z9;
        int i13;
        List list2;
        long j11;
        int i14;
        if ((i11 & 4) != 0) {
            j10 = Offset.Companion.m2751getZeroF1C5BW0();
        } else {
            j10 = j8;
        }
        if ((i11 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i11 & 16) != 0) {
            i12 = TextOverflow.Companion.m5131getClipgIe3tQ8();
        } else {
            i12 = i8;
        }
        if ((i11 & 32) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i11 & 64) != 0) {
            i13 = Integer.MAX_VALUE;
        } else {
            i13 = i9;
        }
        if ((i11 & 128) != 0) {
            list2 = AbstractC1246t.m();
        } else {
            list2 = list;
        }
        if ((i11 & 256) != 0) {
            j11 = Size.Companion.m2812getUnspecifiedNHjbRc();
        } else {
            j11 = j9;
        }
        if ((i11 & 512) != 0) {
            i14 = DrawScope.Companion.m3444getDefaultBlendMode0nO6VwU();
        } else {
            i14 = i10;
        }
        m4671drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, j10, textStyle2, i12, z9, i13, list2, j11, i14);
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m4673drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j8, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        float alpha;
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8));
        clip(transform, textLayoutResult);
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        if (!Float.isNaN(f8)) {
            alpha = f8;
        } else {
            alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
        }
        multiParagraph.m4576painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i8);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: drawText-LVfH_YU$default, reason: not valid java name */
    public static /* synthetic */ void m4674drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j8, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        long j9;
        float f9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i10;
        if ((i9 & 4) != 0) {
            j9 = Offset.Companion.m2751getZeroF1C5BW0();
        } else {
            j9 = j8;
        }
        if ((i9 & 8) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f8;
        }
        if ((i9 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i9 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i9 & 64) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i9 & 128) != 0) {
            i10 = DrawScope.Companion.m3444getDefaultBlendMode0nO6VwU();
        } else {
            i10 = i8;
        }
        m4673drawTextLVfH_YU(drawScope, textLayoutResult, brush, j9, f9, shadow2, textDecoration2, drawStyle2, i10);
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m4675drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j8, TextStyle textStyle, int i8, boolean z8, int i9, long j9, int i10) {
        TextLayoutResult m4668measurexDpz5zY$default = TextMeasurer.m4668measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i8, z8, i9, null, m4679textLayoutConstraintsv_w8tDc(drawScope, j9, j8), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8));
        clip(transform, m4668measurexDpz5zY$default);
        MultiParagraph.m4568paintLG529CI$default(m4668measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i10, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: drawText-TPWCCtM$default, reason: not valid java name */
    public static /* synthetic */ void m4676drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j8, TextStyle textStyle, int i8, boolean z8, int i9, long j9, int i10, int i11, Object obj) {
        long j10;
        TextStyle textStyle2;
        int i12;
        boolean z9;
        int i13;
        long j11;
        int i14;
        if ((i11 & 4) != 0) {
            j10 = Offset.Companion.m2751getZeroF1C5BW0();
        } else {
            j10 = j8;
        }
        if ((i11 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i11 & 16) != 0) {
            i12 = TextOverflow.Companion.m5131getClipgIe3tQ8();
        } else {
            i12 = i8;
        }
        if ((i11 & 32) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i11 & 64) != 0) {
            i13 = Integer.MAX_VALUE;
        } else {
            i13 = i9;
        }
        if ((i11 & 128) != 0) {
            j11 = Size.Companion.m2812getUnspecifiedNHjbRc();
        } else {
            j11 = j9;
        }
        if ((i11 & 256) != 0) {
            i14 = DrawScope.Companion.m3444getDefaultBlendMode0nO6VwU();
        } else {
            i14 = i10;
        }
        m4675drawTextTPWCCtM(drawScope, textMeasurer, str, j10, textStyle2, i12, z9, i13, j11, i14);
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m4677drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j8, long j9, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        long m4722getColor0d7_KjU;
        float alpha;
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2735getXimpl(j9), Offset.m2736getYimpl(j9));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null && j8 == Color.Companion.m3007getUnspecified0d7_KjU()) {
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            if (!Float.isNaN(f8)) {
                alpha = f8;
            } else {
                alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
            }
            multiParagraph.m4576painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i8);
        } else {
            MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
            Canvas canvas2 = drawScope.getDrawContext().getCanvas();
            if (j8 != Color.Companion.m3007getUnspecified0d7_KjU()) {
                m4722getColor0d7_KjU = j8;
            } else {
                m4722getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m4722getColor0d7_KjU();
            }
            multiParagraph2.m4574paintLG529CI(canvas2, TextDrawStyleKt.m5102modulateDxMtmZc(m4722getColor0d7_KjU, f8), shadow2, textDecoration2, drawStyle2, i8);
        }
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }

    /* renamed from: drawText-d8-rzKo$default, reason: not valid java name */
    public static /* synthetic */ void m4678drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j8, long j9, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        long j10;
        long j11;
        float f9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i10;
        if ((i9 & 2) != 0) {
            j10 = Color.Companion.m3007getUnspecified0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 4) != 0) {
            j11 = Offset.Companion.m2751getZeroF1C5BW0();
        } else {
            j11 = j9;
        }
        if ((i9 & 8) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f8;
        }
        DrawStyle drawStyle2 = null;
        if ((i9 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i9 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i9 & 64) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i9 & 128) != 0) {
            i10 = DrawScope.Companion.m3444getDefaultBlendMode0nO6VwU();
        } else {
            i10 = i8;
        }
        m4677drawTextd8rzKo(drawScope, textLayoutResult, j10, j11, f9, shadow2, textDecoration2, drawStyle2, i10);
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m4679textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j8, long j9) {
        int d8;
        int i8;
        int d9;
        Size.Companion companion = Size.Companion;
        int i9 = 0;
        if (j8 == companion.m2812getUnspecifiedNHjbRc() || Float.isNaN(Size.m2804getWidthimpl(j8))) {
            d8 = Z5.a.d((float) Math.ceil(Size.m2804getWidthimpl(drawScope.mo3414getSizeNHjbRc()) - Offset.m2735getXimpl(j9)));
            i8 = 0;
        } else {
            i8 = Z5.a.d((float) Math.ceil(Size.m2804getWidthimpl(j8)));
            d8 = i8;
        }
        if (j8 == companion.m2812getUnspecifiedNHjbRc() || Float.isNaN(Size.m2801getHeightimpl(j8))) {
            d9 = Z5.a.d((float) Math.ceil(Size.m2801getHeightimpl(drawScope.mo3414getSizeNHjbRc()) - Offset.m2736getYimpl(j9)));
        } else {
            i9 = Z5.a.d((float) Math.ceil(Size.m2801getHeightimpl(j8)));
            d9 = i9;
        }
        return ConstraintsKt.Constraints(i8, d8, i9, d9);
    }
}
