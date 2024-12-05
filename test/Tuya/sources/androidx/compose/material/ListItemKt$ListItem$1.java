package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ n $overlineText;
    final /* synthetic */ n $secondaryText;
    final /* synthetic */ boolean $singleLineSecondaryText;
    final /* synthetic */ n $text;
    final /* synthetic */ n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$1(Modifier modifier, n nVar, n nVar2, boolean z8, n nVar3, n nVar4, n nVar5, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$icon = nVar;
        this.$secondaryText = nVar2;
        this.$singleLineSecondaryText = z8;
        this.$overlineText = nVar3;
        this.$trailing = nVar4;
        this.$text = nVar5;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.ListItem(this.$modifier, this.$icon, this.$secondaryText, this.$singleLineSecondaryText, this.$overlineText, this.$trailing, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
