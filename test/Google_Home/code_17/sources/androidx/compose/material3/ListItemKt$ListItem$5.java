package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$5 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ InterfaceC1668n $headlineText;
    final /* synthetic */ InterfaceC1668n $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC1668n $overlineText;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ InterfaceC1668n $supportingText;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ InterfaceC1668n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$5(InterfaceC1668n interfaceC1668n, Modifier modifier, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, ListItemColors listItemColors, float f8, float f9, int i8, int i9) {
        super(2);
        this.$headlineText = interfaceC1668n;
        this.$modifier = modifier;
        this.$overlineText = interfaceC1668n2;
        this.$supportingText = interfaceC1668n3;
        this.$leadingContent = interfaceC1668n4;
        this.$trailingContent = interfaceC1668n5;
        this.$colors = listItemColors;
        this.$tonalElevation = f8;
        this.$shadowElevation = f9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.m1685ListItemHXNGIdc(this.$headlineText, this.$modifier, this.$overlineText, this.$supportingText, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, this.$$changed | 1, this.$$default);
    }
}
