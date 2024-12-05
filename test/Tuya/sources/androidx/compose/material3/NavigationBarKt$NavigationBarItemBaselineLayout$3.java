package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItemBaselineLayout$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ n $icon;
    final /* synthetic */ n $indicator;
    final /* synthetic */ n $indicatorRipple;
    final /* synthetic */ n $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItemBaselineLayout$3(n nVar, n nVar2, n nVar3, n nVar4, boolean z8, float f8, int i8) {
        super(2);
        this.$indicatorRipple = nVar;
        this.$indicator = nVar2;
        this.$icon = nVar3;
        this.$label = nVar4;
        this.$alwaysShowLabel = z8;
        this.$animationProgress = f8;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationBarKt.NavigationBarItemBaselineLayout(this.$indicatorRipple, this.$indicator, this.$icon, this.$label, this.$alwaysShowLabel, this.$animationProgress, composer, this.$$changed | 1);
    }
}
