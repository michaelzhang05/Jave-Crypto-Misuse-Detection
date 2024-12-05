package androidx.compose.foundation.lazy.layout;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o $content;
    final /* synthetic */ LazySaveableStateHolder $holder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(LazySaveableStateHolder lazySaveableStateHolder, o oVar, int i8) {
        super(2);
        this.$holder = lazySaveableStateHolder;
        this.$content = oVar;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1863926504, i8, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
        }
        this.$holder.setWrappedHolder(SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0));
        this.$content.invoke(this.$holder, composer, Integer.valueOf(((this.$$dirty << 3) & 112) | 8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
