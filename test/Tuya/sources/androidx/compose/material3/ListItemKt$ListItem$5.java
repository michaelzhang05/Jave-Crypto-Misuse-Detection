package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$5 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ n $headlineText;
    final /* synthetic */ n $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ n $overlineText;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ n $supportingText;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$5(n nVar, Modifier modifier, n nVar2, n nVar3, n nVar4, n nVar5, ListItemColors listItemColors, float f8, float f9, int i8, int i9) {
        super(2);
        this.$headlineText = nVar;
        this.$modifier = modifier;
        this.$overlineText = nVar2;
        this.$supportingText = nVar3;
        this.$leadingContent = nVar4;
        this.$trailingContent = nVar5;
        this.$colors = listItemColors;
        this.$tonalElevation = f8;
        this.$shadowElevation = f9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.m1680ListItemHXNGIdc(this.$headlineText, this.$modifier, this.$overlineText, this.$supportingText, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, this.$$changed | 1, this.$$default);
    }
}
