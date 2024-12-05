package androidx.compose.foundation.lazy.grid;

import L5.I;
import X5.o;
import X5.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyGridIntervalContent$item$4 extends AbstractC3160z implements p {
    final /* synthetic */ o $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridIntervalContent$item$4(o oVar) {
        super(4);
        this.$content = oVar;
    }

    @Override // X5.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(LazyGridItemScope $receiver, int i8, Composer composer, int i9) {
        AbstractC3159y.i($receiver, "$this$$receiver");
        if ((i9 & 14) == 0) {
            i9 |= composer.changed($receiver) ? 4 : 2;
        }
        if ((i9 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-34608120, i9, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
        }
        this.$content.invoke($receiver, composer, Integer.valueOf(i9 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
