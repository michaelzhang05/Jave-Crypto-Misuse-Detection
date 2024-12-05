package androidx.compose.material;

import L5.I;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomDrawerState $drawerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1(BottomDrawerState bottomDrawerState, Density density) {
        super(0);
        this.$drawerState = bottomDrawerState;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1225invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1225invoke() {
        this.$drawerState.setDensity$material_release(this.$density);
    }
}
