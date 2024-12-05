package androidx.compose.material3;

import X5.n;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$1 extends AbstractC3160z implements n {
    public static final NavigationDrawerKt$ModalNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$ModalNavigationDrawer$1();

    NavigationDrawerKt$ModalNavigationDrawer$1() {
        super(2);
    }

    @Override // X5.n
    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
        AbstractC3159y.i(drawerValue, "<anonymous parameter 0>");
        AbstractC3159y.i(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}
