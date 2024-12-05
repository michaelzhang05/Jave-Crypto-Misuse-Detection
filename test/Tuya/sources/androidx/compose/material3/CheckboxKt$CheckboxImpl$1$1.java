package androidx.compose.material3;

import L5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Color> $borderColor;
    final /* synthetic */ State<Color> $boxColor;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction;
    final /* synthetic */ State<Color> $checkColor;
    final /* synthetic */ State<Float> $checkDrawFraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5, CheckDrawingCache checkDrawingCache) {
        super(1);
        this.$boxColor = state;
        this.$borderColor = state2;
        this.$checkColor = state3;
        this.$checkDrawFraction = state4;
        this.$checkCenterGravitationShiftFraction = state5;
        this.$checkCache = checkDrawingCache;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        float f8;
        float f9;
        AbstractC3159y.i(Canvas, "$this$Canvas");
        f8 = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(Canvas.mo448toPx0680j_4(f8));
        long m2981unboximpl = this.$boxColor.getValue().m2981unboximpl();
        long m2981unboximpl2 = this.$borderColor.getValue().m2981unboximpl();
        f9 = CheckboxKt.RadiusSize;
        CheckboxKt.m1495drawBox1wkBAMs(Canvas, m2981unboximpl, m2981unboximpl2, Canvas.mo448toPx0680j_4(f9), floor);
        CheckboxKt.m1496drawCheck3IgeMak(Canvas, this.$checkColor.getValue().m2981unboximpl(), this.$checkDrawFraction.getValue().floatValue(), this.$checkCenterGravitationShiftFraction.getValue().floatValue(), floor, this.$checkCache);
    }
}
