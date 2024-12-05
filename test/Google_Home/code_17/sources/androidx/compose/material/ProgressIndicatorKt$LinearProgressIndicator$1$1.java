package androidx.compose.material;

import O5.I;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j8, int i8, float f8, long j9) {
        super(1);
        this.$backgroundColor = j8;
        this.$strokeCap = i8;
        this.$coercedProgress = f8;
        this.$color = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3255y.i(Canvas, "$this$Canvas");
        float m2806getHeightimpl = Size.m2806getHeightimpl(Canvas.mo3419getSizeNHjbRc());
        ProgressIndicatorKt.m1323drawLinearIndicatorBackgroundAZGd3zU(Canvas, this.$backgroundColor, m2806getHeightimpl, this.$strokeCap);
        ProgressIndicatorKt.m1322drawLinearIndicatorqYKTg0g(Canvas, 0.0f, this.$coercedProgress, this.$color, m2806getHeightimpl, this.$strokeCap);
    }
}
