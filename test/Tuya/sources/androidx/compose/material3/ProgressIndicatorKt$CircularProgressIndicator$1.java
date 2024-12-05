package androidx.compose.material3;

import L5.I;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $color;
    final /* synthetic */ float $progress;
    final /* synthetic */ Stroke $stroke;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$1(float f8, long j8, Stroke stroke) {
        super(1);
        this.$progress = f8;
        this.$color = j8;
        this.$stroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3159y.i(Canvas, "$this$Canvas");
        ProgressIndicatorKt.m1748drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, this.$progress * 360.0f, this.$color, this.$stroke);
    }
}
