package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$Tab$2 extends AbstractC3160z implements o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $icon;
    final /* synthetic */ n $styledText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$2(n nVar, n nVar2, int i8) {
        super(3);
        this.$styledText = nVar;
        this.$icon = nVar2;
        this.$$dirty = i8;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(ColumnScope Tab, Composer composer, int i8) {
        AbstractC3159y.i(Tab, "$this$Tab");
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
