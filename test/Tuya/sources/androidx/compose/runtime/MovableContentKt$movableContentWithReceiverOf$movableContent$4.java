package androidx.compose.runtime;

import L5.I;
import X5.o;
import X5.r;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$4 extends AbstractC3160z implements o {
    final /* synthetic */ r $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$4(r rVar) {
        super(3);
        this.$content = rVar;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((L5.r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(L5.r rVar, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(838586922, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
        }
        this.$content.invoke(((L5.r) rVar.c()).c(), ((L5.r) rVar.c()).d(), ((L5.r) rVar.d()).c(), ((L5.r) rVar.d()).d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
