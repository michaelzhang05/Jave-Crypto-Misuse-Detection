package androidx.compose.runtime;

import O5.I;
import O5.r;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ InterfaceC1670p $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$2(InterfaceC1670p interfaceC1670p) {
        super(3);
        this.$content = interfaceC1670p;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(r rVar, Composer composer, int i8) {
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(rVar) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849814513, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
        }
        this.$content.invoke(rVar.c(), rVar.d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
