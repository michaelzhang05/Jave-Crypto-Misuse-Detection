package androidx.compose.material;

import O5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$Scrim$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$Scrim$1$1(long j8, State<Float> state) {
        super(1);
        this.$color = j8;
        this.$alpha$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(DrawScope Canvas) {
        float Scrim_3J_VO9M$lambda$4;
        AbstractC3255y.i(Canvas, "$this$Canvas");
        long j8 = this.$color;
        Scrim_3J_VO9M$lambda$4 = BackdropScaffoldKt.Scrim_3J_VO9M$lambda$4(this.$alpha$delegate);
        c.K(Canvas, j8, 0L, 0L, Scrim_3J_VO9M$lambda$4, null, null, 0, 118, null);
    }
}
