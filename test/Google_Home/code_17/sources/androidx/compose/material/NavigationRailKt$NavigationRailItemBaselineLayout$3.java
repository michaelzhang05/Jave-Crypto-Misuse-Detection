package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItemBaselineLayout$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ InterfaceC1668n $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemBaselineLayout$3(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, float f8, int i8) {
        super(2);
        this.$icon = interfaceC1668n;
        this.$label = interfaceC1668n2;
        this.$iconPositionAnimationProgress = f8;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationRailKt.NavigationRailItemBaselineLayout(this.$icon, this.$label, this.$iconPositionAnimationProgress, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
