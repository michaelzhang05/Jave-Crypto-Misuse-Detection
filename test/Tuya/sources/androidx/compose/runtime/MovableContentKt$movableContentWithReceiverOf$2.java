package androidx.compose.runtime;

import L5.I;
import L5.r;
import L5.x;
import X5.p;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$2 extends AbstractC3160z implements p {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$2(MovableContent<r> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    @Override // X5.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((MovableContentKt$movableContentWithReceiverOf$2) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(R r8, P p8, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(r8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p8) ? 32 : 16;
        }
        if ((i9 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627354118, i9, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(r8, p8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
