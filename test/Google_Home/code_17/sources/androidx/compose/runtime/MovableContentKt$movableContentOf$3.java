package androidx.compose.runtime;

import O5.I;
import O5.r;
import O5.x;
import a6.InterfaceC1670p;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$3 extends AbstractC3256z implements InterfaceC1670p {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$3(MovableContent<r> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    @Override // a6.InterfaceC1670p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((MovableContentKt$movableContentOf$3) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(P1 p12, P2 p22, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(p12) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p22) ? 32 : 16;
        }
        if ((i9 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1200019734, i9, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(p12, p22));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
