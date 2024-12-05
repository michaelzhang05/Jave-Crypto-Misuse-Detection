package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$Tab$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ InterfaceC1668n $styledText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$2(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, int i8) {
        super(3);
        this.$styledText = interfaceC1668n;
        this.$icon = interfaceC1668n2;
        this.$$dirty = i8;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(ColumnScope Tab, Composer composer, int i8) {
        AbstractC3255y.i(Tab, "$this$Tab");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1540996038, i8, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
        }
        TabKt.TabBaselineLayout(this.$styledText, this.$icon, composer, (this.$$dirty >> 12) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
