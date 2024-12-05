package androidx.navigation;

import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        AbstractC3159y.i(navigatorProvider, "<this>");
        AbstractC3159y.i(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        AbstractC3159y.i(navigatorProvider, "<this>");
        AbstractC3159y.i(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        AbstractC3159y.i(navigatorProvider, "<this>");
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC2643c clazz) {
        AbstractC3159y.i(navigatorProvider, "<this>");
        AbstractC3159y.i(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(W5.a.a(clazz));
    }
}
