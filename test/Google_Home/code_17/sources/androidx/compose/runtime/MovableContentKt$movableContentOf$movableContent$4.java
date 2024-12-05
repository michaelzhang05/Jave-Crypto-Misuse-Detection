package androidx.compose.runtime;

import O5.I;
import O5.r;
import a6.InterfaceC1669o;
import a6.InterfaceC1672r;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$4 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ InterfaceC1672r $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$4(InterfaceC1672r interfaceC1672r) {
        super(3);
        this.$content = interfaceC1672r;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(r rVar, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1876318581, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
        }
        this.$content.invoke(((r) rVar.c()).c(), ((r) rVar.c()).d(), ((r) rVar.d()).c(), ((r) rVar.d()).d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
