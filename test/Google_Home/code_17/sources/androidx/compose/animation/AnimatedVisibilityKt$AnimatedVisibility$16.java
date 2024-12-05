package androidx.compose.animation;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$16 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$16(InterfaceC1668n interfaceC1668n, int i8) {
        super(3);
        this.$content = interfaceC1668n;
        this.$$dirty = i8;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
        AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
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
