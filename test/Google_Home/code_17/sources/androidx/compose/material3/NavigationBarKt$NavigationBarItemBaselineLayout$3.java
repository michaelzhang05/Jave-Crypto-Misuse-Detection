package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItemBaselineLayout$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ InterfaceC1668n $indicator;
    final /* synthetic */ InterfaceC1668n $indicatorRipple;
    final /* synthetic */ InterfaceC1668n $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItemBaselineLayout$3(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, boolean z8, float f8, int i8) {
        super(2);
        this.$indicatorRipple = interfaceC1668n;
        this.$indicator = interfaceC1668n2;
        this.$icon = interfaceC1668n3;
        this.$label = interfaceC1668n4;
        this.$alwaysShowLabel = z8;
        this.$animationProgress = f8;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationBarKt.NavigationBarItemBaselineLayout(this.$indicatorRipple, this.$indicator, this.$icon, this.$label, this.$alwaysShowLabel, this.$animationProgress, composer, this.$$changed | 1);
    }
}
