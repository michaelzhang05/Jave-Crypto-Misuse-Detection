package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ListItemKt$ProvideTextStyleFromToken$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ProvideTextStyleFromToken$1(TextStyle textStyle, InterfaceC1668n interfaceC1668n, int i8) {
        super(2);
        this.$textStyle = textStyle;
        this.$content = interfaceC1668n;
        this.$$dirty = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-514310925, i8, -1, "androidx.compose.material3.ProvideTextStyleFromToken.<anonymous> (ListItem.kt:495)");
        }
        TextKt.ProvideTextStyle(this.$textStyle, this.$content, composer, (this.$$dirty >> 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
