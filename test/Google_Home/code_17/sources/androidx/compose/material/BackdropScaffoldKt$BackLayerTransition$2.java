package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackLayerTransition$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1668n $appBar;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ BackdropValue $target;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackLayerTransition$2(BackdropValue backdropValue, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, int i8) {
        super(2);
        this.$target = backdropValue;
        this.$appBar = interfaceC1668n;
        this.$content = interfaceC1668n2;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        BackdropScaffoldKt.BackLayerTransition(this.$target, this.$appBar, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
