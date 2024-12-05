package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    private final Paint.Cap m4962toAndroidCapBeK7IIE(int i8) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m3297equalsimpl0(i8, companion.m3301getButtKaPHkGw())) {
            return Paint.Cap.BUTT;
        }
        if (StrokeCap.m3297equalsimpl0(i8, companion.m3302getRoundKaPHkGw())) {
            return Paint.Cap.ROUND;
        }
        if (StrokeCap.m3297equalsimpl0(i8, companion.m3303getSquareKaPHkGw())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    private final Paint.Join m4963toAndroidJoinWw9F2mQ(int i8) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m3307equalsimpl0(i8, companion.m3312getMiterLxFBmk8())) {
            return Paint.Join.MITER;
        }
        if (StrokeJoin.m3307equalsimpl0(i8, companion.m3313getRoundLxFBmk8())) {
            return Paint.Join.ROUND;
        }
        if (StrokeJoin.m3307equalsimpl0(i8, companion.m3311getBevelLxFBmk8())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (AbstractC3159y.d(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(m4963toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m3503getJoinLxFBmk8()));
                textPaint.setStrokeCap(m4962toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m3502getCapKaPHkGw()));
                androidx.compose.ui.graphics.PathEffect pathEffect2 = ((Stroke) this.drawStyle).getPathEffect();
                if (pathEffect2 != null) {
                    pathEffect = AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect2);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
