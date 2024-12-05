package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ThreeLine$ListItem$1$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $overlineText;
    final /* synthetic */ n $secondaryText;
    final /* synthetic */ n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(n nVar, int i8, n nVar2, n nVar3) {
        super(2);
        this.$overlineText = nVar;
        this.$$dirty = i8;
        this.$text = nVar2;
        this.$secondaryText = nVar3;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318094245, i8, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
        }
        composer.startReplaceableGroup(-755940677);
        n nVar = this.$overlineText;
        if (nVar != null) {
            nVar.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        }
        composer.endReplaceableGroup();
        this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        this.$secondaryText.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
