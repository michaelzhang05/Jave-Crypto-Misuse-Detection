package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$4 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ RowScope $this_NavigationBarItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$4(RowScope rowScope, boolean z8, Function0 function0, n nVar, Modifier modifier, boolean z9, n nVar2, boolean z10, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$this_NavigationBarItem = rowScope;
        this.$selected = z8;
        this.$onClick = function0;
        this.$icon = nVar;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$label = nVar2;
        this.$alwaysShowLabel = z10;
        this.$colors = navigationBarItemColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationBarKt.NavigationBarItem(this.$this_NavigationBarItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
