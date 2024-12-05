package androidx.compose.runtime;

import L5.I;
import L5.r;
import X5.o;
import X5.p;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$2 extends AbstractC3160z implements o {
    final /* synthetic */ p $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$2(p pVar) {
        super(3);
        this.$content = pVar;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
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
