package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $bottomBar;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC1668n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ InterfaceC1668n $snackbarHost;
    final /* synthetic */ InterfaceC1668n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(int i8, InterfaceC1668n interfaceC1668n, InterfaceC1669o interfaceC1669o, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, WindowInsets windowInsets, InterfaceC1668n interfaceC1668n4, int i9) {
        super(2);
        this.$floatingActionButtonPosition = i8;
        this.$topBar = interfaceC1668n;
        this.$content = interfaceC1669o;
        this.$snackbarHost = interfaceC1668n2;
        this.$floatingActionButton = interfaceC1668n3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = interfaceC1668n4;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(-1979205334, i8, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
        }
        int i9 = this.$floatingActionButtonPosition;
        InterfaceC1668n interfaceC1668n = this.$topBar;
        InterfaceC1669o interfaceC1669o = this.$content;
        InterfaceC1668n interfaceC1668n2 = this.$snackbarHost;
        InterfaceC1668n interfaceC1668n3 = this.$floatingActionButton;
        WindowInsets windowInsets = this.$contentWindowInsets;
        InterfaceC1668n interfaceC1668n4 = this.$bottomBar;
        int i10 = this.$$dirty;
        ScaffoldKt.m1759ScaffoldLayoutFMILGgc(i9, interfaceC1668n, interfaceC1669o, interfaceC1668n2, interfaceC1668n3, windowInsets, interfaceC1668n4, composer, ((i10 >> 15) & 14) | (i10 & 112) | ((i10 >> 21) & 896) | (i10 & 7168) | (57344 & i10) | ((i10 >> 9) & 458752) | ((i10 << 12) & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
