package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1668n $bottomBar;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC1668n $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ InterfaceC1668n $snackbar;
    final /* synthetic */ InterfaceC1668n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(int i8, InterfaceC1668n interfaceC1668n, InterfaceC1669o interfaceC1669o, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, WindowInsets windowInsets, InterfaceC1668n interfaceC1668n4, int i9) {
        super(2);
        this.$fabPosition = i8;
        this.$topBar = interfaceC1668n;
        this.$content = interfaceC1669o;
        this.$snackbar = interfaceC1668n2;
        this.$fab = interfaceC1668n3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = interfaceC1668n4;
        this.$$changed = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1759ScaffoldLayoutFMILGgc(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, composer, this.$$changed | 1);
    }
}
