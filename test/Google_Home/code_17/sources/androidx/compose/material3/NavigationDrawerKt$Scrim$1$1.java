package androidx.compose.material3;

import O5.I;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$Scrim$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ long $color;
    final /* synthetic */ Function0 $fraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$1$1(long j8, Function0 function0) {
        super(1);
        this.$color = j8;
        this.$fraction = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8278a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3255y.i(Canvas, "$this$Canvas");
        c.K(Canvas, this.$color, 0L, 0L, ((Number) this.$fraction.invoke()).floatValue(), null, null, 0, 118, null);
    }
}
