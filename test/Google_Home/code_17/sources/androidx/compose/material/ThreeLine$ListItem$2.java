package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ThreeLine$ListItem$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC1668n $overlineText;
    final /* synthetic */ InterfaceC1668n $secondaryText;
    final /* synthetic */ InterfaceC1668n $text;
    final /* synthetic */ ThreeLine $tmp0_rcvr;
    final /* synthetic */ InterfaceC1668n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$2(ThreeLine threeLine, Modifier modifier, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = threeLine;
        this.$modifier = modifier;
        this.$icon = interfaceC1668n;
        this.$text = interfaceC1668n2;
        this.$secondaryText = interfaceC1668n3;
        this.$overlineText = interfaceC1668n4;
        this.$trailing = interfaceC1668n5;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
