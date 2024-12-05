package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$PermanentNavigationDrawer$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n $content;
    final /* synthetic */ n $drawerContent;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$PermanentNavigationDrawer$2(n nVar, Modifier modifier, n nVar2, int i8, int i9) {
        super(2);
        this.$drawerContent = nVar;
        this.$modifier = modifier;
        this.$content = nVar2;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationDrawerKt.PermanentNavigationDrawer(this.$drawerContent, this.$modifier, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
