package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropStack$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1668n $backLayer;
    final /* synthetic */ Function1 $calculateBackLayerConstraints;
    final /* synthetic */ InterfaceC1670p $frontLayer;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(Modifier modifier, InterfaceC1668n interfaceC1668n, Function1 function1, InterfaceC1670p interfaceC1670p, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = interfaceC1668n;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = interfaceC1670p;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        BackdropScaffoldKt.BackdropStack(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
