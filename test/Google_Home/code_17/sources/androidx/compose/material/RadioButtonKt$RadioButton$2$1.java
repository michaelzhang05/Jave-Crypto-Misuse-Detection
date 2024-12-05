package androidx.compose.material;

import O5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$2$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ State<Dp> $dotRadius;
    final /* synthetic */ State<Color> $radioColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(State<Color> state, State<Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(DrawScope Canvas) {
        float f8;
        float f9;
        AbstractC3255y.i(Canvas, "$this$Canvas");
        f8 = RadioButtonKt.RadioStrokeWidth;
        float mo453toPx0680j_4 = Canvas.mo453toPx0680j_4(f8);
        long m2986unboximpl = this.$radioColor.getValue().m2986unboximpl();
        f9 = RadioButtonKt.RadioRadius;
        float f10 = mo453toPx0680j_4 / 2;
        c.x(Canvas, m2986unboximpl, Canvas.mo453toPx0680j_4(f9) - f10, 0L, 0.0f, new Stroke(mo453toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m5182compareTo0680j_4(this.$dotRadius.getValue().m5197unboximpl(), Dp.m5183constructorimpl(0)) > 0) {
            c.x(Canvas, this.$radioColor.getValue().m2986unboximpl(), Canvas.mo453toPx0680j_4(this.$dotRadius.getValue().m5197unboximpl()) - f10, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
    }
}
