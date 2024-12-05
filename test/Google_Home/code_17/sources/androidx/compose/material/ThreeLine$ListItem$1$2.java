package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ThreeLine$ListItem$1$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $overlineText;
    final /* synthetic */ InterfaceC1668n $secondaryText;
    final /* synthetic */ InterfaceC1668n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(InterfaceC1668n interfaceC1668n, int i8, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3) {
        super(2);
        this.$overlineText = interfaceC1668n;
        this.$$dirty = i8;
        this.$text = interfaceC1668n2;
        this.$secondaryText = interfaceC1668n3;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
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
        InterfaceC1668n interfaceC1668n = this.$overlineText;
        if (interfaceC1668n != null) {
            interfaceC1668n.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        }
        composer.endReplaceableGroup();
        this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        this.$secondaryText.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
