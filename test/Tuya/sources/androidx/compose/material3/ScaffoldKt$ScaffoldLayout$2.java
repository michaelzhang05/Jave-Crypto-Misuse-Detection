package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $bottomBar;
    final /* synthetic */ o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ n $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ n $snackbar;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(int i8, n nVar, o oVar, n nVar2, n nVar3, WindowInsets windowInsets, n nVar4, int i9) {
        super(2);
        this.$fabPosition = i8;
        this.$topBar = nVar;
        this.$content = oVar;
        this.$snackbar = nVar2;
        this.$fab = nVar3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = nVar4;
        this.$$changed = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1754ScaffoldLayoutFMILGgc(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, composer, this.$$changed | 1);
    }
}
