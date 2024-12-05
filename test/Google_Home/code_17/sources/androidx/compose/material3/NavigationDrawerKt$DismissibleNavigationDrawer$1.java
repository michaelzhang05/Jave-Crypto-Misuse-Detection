package androidx.compose.material3;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final NavigationDrawerKt$DismissibleNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$DismissibleNavigationDrawer$1();

    NavigationDrawerKt$DismissibleNavigationDrawer$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
        AbstractC3255y.i(drawerValue, "<anonymous parameter 0>");
        AbstractC3255y.i(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}
