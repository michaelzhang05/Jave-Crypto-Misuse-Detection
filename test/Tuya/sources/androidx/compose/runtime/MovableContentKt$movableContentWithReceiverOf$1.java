package androidx.compose.runtime;

import L5.I;
import X5.o;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$1 extends AbstractC3160z implements o {
    final /* synthetic */ MovableContent<R> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$1(MovableContent<R> movableContent) {
        super(3);
        this.$movableContent = movableContent;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((MovableContentKt$movableContentWithReceiverOf$1) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(R r8, Composer composer, int i8) {
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(r8) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(506997506, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
        }
        composer.insertMovableContent(this.$movableContent, r8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
