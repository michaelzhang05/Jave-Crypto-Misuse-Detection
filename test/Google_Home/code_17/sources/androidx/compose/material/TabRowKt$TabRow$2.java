package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TabRowKt$TabRow$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $divider;
    final /* synthetic */ InterfaceC1669o $indicator;
    final /* synthetic */ InterfaceC1668n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1669o interfaceC1669o, int i8) {
        super(2);
        this.$tabs = interfaceC1668n;
        this.$divider = interfaceC1668n2;
        this.$indicator = interfaceC1669o;
        this.$$dirty = i8;
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
            ComposerKt.traceEventStart(-1961746365, i8, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        InterfaceC1668n interfaceC1668n = this.$tabs;
        InterfaceC1668n interfaceC1668n2 = this.$divider;
        InterfaceC1669o interfaceC1669o = this.$indicator;
        int i9 = this.$$dirty;
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(interfaceC1668n) | composer.changed(interfaceC1668n2) | composer.changed(interfaceC1669o);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TabRowKt$TabRow$2$1$1(interfaceC1668n, interfaceC1668n2, interfaceC1669o, i9);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (InterfaceC1668n) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
