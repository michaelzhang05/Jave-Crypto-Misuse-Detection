package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItem$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ RowScope $this_BottomNavigationItem;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$3(RowScope rowScope, boolean z8, Function0 function0, n nVar, Modifier modifier, boolean z9, n nVar2, boolean z10, MutableInteractionSource mutableInteractionSource, long j8, long j9, int i8, int i9, int i10) {
        super(2);
        this.$this_BottomNavigationItem = rowScope;
        this.$selected = z8;
        this.$onClick = function0;
        this.$icon = nVar;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$label = nVar2;
        this.$alwaysShowLabel = z10;
        this.$interactionSource = mutableInteractionSource;
        this.$selectedContentColor = j8;
        this.$unselectedContentColor = j9;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomNavigationKt.m1124BottomNavigationItemjY6E1Zs(this.$this_BottomNavigationItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$interactionSource, this.$selectedContentColor, this.$unselectedContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
