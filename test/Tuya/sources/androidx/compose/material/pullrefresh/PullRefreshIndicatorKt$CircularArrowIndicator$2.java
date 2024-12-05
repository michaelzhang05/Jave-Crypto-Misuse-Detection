package androidx.compose.material.pullrefresh;

import L5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import com.google.android.material.internal.ViewUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, State<Float> state, long j8, Path path) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = state;
        this.$color = j8;
        this.$path = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        ArrowValues ArrowValues;
        float f8;
        float f9;
        float f10;
        AbstractC3159y.i(Canvas, "$this$Canvas");
        ArrowValues = PullRefreshIndicatorKt.ArrowValues(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float rotation = ArrowValues.getRotation();
        long j8 = this.$color;
        Path path = this.$path;
        long mo3413getCenterF1C5BW0 = Canvas.mo3413getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3426rotateUv8p0NA(rotation, mo3413getCenterF1C5BW0);
        f8 = PullRefreshIndicatorKt.ArcRadius;
        float mo448toPx0680j_4 = Canvas.mo448toPx0680j_4(f8);
        f9 = PullRefreshIndicatorKt.StrokeWidth;
        float mo448toPx0680j_42 = mo448toPx0680j_4 + (Canvas.mo448toPx0680j_4(f9) / 2.0f);
        Rect rect = new Rect(Offset.m2735getXimpl(SizeKt.m2814getCenteruvyYCjk(Canvas.mo3414getSizeNHjbRc())) - mo448toPx0680j_42, Offset.m2736getYimpl(SizeKt.m2814getCenteruvyYCjk(Canvas.mo3414getSizeNHjbRc())) - mo448toPx0680j_42, Offset.m2735getXimpl(SizeKt.m2814getCenteruvyYCjk(Canvas.mo3414getSizeNHjbRc())) + mo448toPx0680j_42, Offset.m2736getYimpl(SizeKt.m2814getCenteruvyYCjk(Canvas.mo3414getSizeNHjbRc())) + mo448toPx0680j_42);
        float startAngle = ArrowValues.getStartAngle();
        float endAngle = ArrowValues.getEndAngle() - ArrowValues.getStartAngle();
        long m2770getTopLeftF1C5BW0 = rect.m2770getTopLeftF1C5BW0();
        long m2768getSizeNHjbRc = rect.m2768getSizeNHjbRc();
        f10 = PullRefreshIndicatorKt.StrokeWidth;
        c.v(Canvas, j8, startAngle, endAngle, false, m2770getTopLeftF1C5BW0, m2768getSizeNHjbRc, floatValue, new Stroke(Canvas.mo448toPx0680j_4(f10), 0.0f, StrokeCap.Companion.m3303getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        PullRefreshIndicatorKt.m1432drawArrowBx497Mc(Canvas, path, rect, j8, floatValue, ArrowValues);
        drawContext.getCanvas().restore();
        drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
    }
}
