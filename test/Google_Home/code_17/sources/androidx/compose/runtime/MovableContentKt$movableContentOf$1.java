package androidx.compose.runtime;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ MovableContent<I> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$1(MovableContent<I> movableContent) {
        super(2);
        this.$movableContent = movableContent;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-642339857, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
        }
        composer.insertMovableContent(this.$movableContent, I.f8278a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}