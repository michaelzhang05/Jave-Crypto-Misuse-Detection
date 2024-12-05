package androidx.compose.runtime;

import L5.I;
import L5.x;
import X5.r;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$4 extends AbstractC3160z implements r {
    final /* synthetic */ MovableContent<L5.r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$4(MovableContent<L5.r> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    @Override // X5.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        invoke((MovableContentKt$movableContentWithReceiverOf$4) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(R r8, P1 p12, P2 p22, P3 p32, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(r8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p12) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= composer.changed(p22) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= composer.changed(p32) ? 2048 : 1024;
        }
        if ((46811 & i9) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1468683306, i9, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(x.a(r8, p12), x.a(p22, p32)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
