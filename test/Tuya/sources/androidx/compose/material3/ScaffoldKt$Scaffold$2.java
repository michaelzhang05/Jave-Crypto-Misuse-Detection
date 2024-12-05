package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n $bottomBar;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ n $snackbarHost;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(Modifier modifier, n nVar, n nVar2, n nVar3, n nVar4, int i8, long j8, long j9, WindowInsets windowInsets, o oVar, int i9, int i10) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = nVar;
        this.$bottomBar = nVar2;
        this.$snackbarHost = nVar3;
        this.$floatingActionButton = nVar4;
        this.$floatingActionButtonPosition = i8;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$contentWindowInsets = windowInsets;
        this.$content = oVar;
        this.$$changed = i9;
        this.$$default = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1753ScaffoldTvnljyQ(this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$containerColor, this.$contentColor, this.$contentWindowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
