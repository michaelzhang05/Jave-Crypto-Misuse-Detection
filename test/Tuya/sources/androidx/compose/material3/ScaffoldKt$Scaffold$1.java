package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $bottomBar;
    final /* synthetic */ o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ n $snackbarHost;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(int i8, n nVar, o oVar, n nVar2, n nVar3, WindowInsets windowInsets, n nVar4, int i9) {
        super(2);
        this.$floatingActionButtonPosition = i8;
        this.$topBar = nVar;
        this.$content = oVar;
        this.$snackbarHost = nVar2;
        this.$floatingActionButton = nVar3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = nVar4;
        this.$$dirty = i9;
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
            ComposerKt.traceEventStart(-1979205334, i8, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
        }
        int i9 = this.$floatingActionButtonPosition;
        n nVar = this.$topBar;
        o oVar = this.$content;
        n nVar2 = this.$snackbarHost;
        n nVar3 = this.$floatingActionButton;
        WindowInsets windowInsets = this.$contentWindowInsets;
        n nVar4 = this.$bottomBar;
        int i10 = this.$$dirty;
        ScaffoldKt.m1754ScaffoldLayoutFMILGgc(i9, nVar, oVar, nVar2, nVar3, windowInsets, nVar4, composer, ((i10 >> 15) & 14) | (i10 & 112) | ((i10 >> 21) & 896) | (i10 & 7168) | (57344 & i10) | ((i10 >> 9) & 458752) | ((i10 << 12) & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
