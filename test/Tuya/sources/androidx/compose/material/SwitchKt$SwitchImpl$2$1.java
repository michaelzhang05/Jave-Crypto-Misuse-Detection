package androidx.compose.material;

import L5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Color> $trackColor$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2$1(State<Color> state) {
        super(1);
        this.$trackColor$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        long SwitchImpl$lambda$16;
        AbstractC3159y.i(Canvas, "$this$Canvas");
        SwitchImpl$lambda$16 = SwitchKt.SwitchImpl$lambda$16(this.$trackColor$delegate);
        SwitchKt.m1367drawTrackRPmYEkk(Canvas, SwitchImpl$lambda$16, Canvas.mo448toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo448toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
    }
}
