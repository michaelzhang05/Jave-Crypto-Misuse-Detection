package androidx.navigation;

import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        AbstractC3255y.i(navigatorProvider, "<this>");
        AbstractC3255y.i(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        AbstractC3255y.i(navigatorProvider, "<this>");
        AbstractC3255y.i(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        AbstractC3255y.i(navigatorProvider, "<this>");
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC2963c clazz) {
        AbstractC3255y.i(navigatorProvider, "<this>");
        AbstractC3255y.i(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(Z5.a.a(clazz));
    }
}
