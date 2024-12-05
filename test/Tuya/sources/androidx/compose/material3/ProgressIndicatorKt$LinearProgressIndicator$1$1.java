package androidx.compose.material3;

import L5.I;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $color;
    final /* synthetic */ float $progress;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j8, float f8, long j9) {
        super(1);
        this.$trackColor = j8;
        this.$progress = f8;
        this.$color = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3159y.i(Canvas, "$this$Canvas");
        float m2801getHeightimpl = Size.m2801getHeightimpl(Canvas.mo3414getSizeNHjbRc());
        ProgressIndicatorKt.m1751drawLinearIndicatorTrackbw27NRU(Canvas, this.$trackColor, m2801getHeightimpl);
        ProgressIndicatorKt.m1750drawLinearIndicator42QJj7c(Canvas, 0.0f, this.$progress, this.$color, m2801getHeightimpl);
    }
}
