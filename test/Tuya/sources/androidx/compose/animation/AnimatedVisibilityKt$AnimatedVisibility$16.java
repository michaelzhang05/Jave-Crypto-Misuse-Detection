package androidx.compose.animation;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$16 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$16(n nVar, int i8) {
        super(3);
        this.$content = nVar;
        this.$$dirty = i8;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
        AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1996320812, i8, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
        }
        this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
