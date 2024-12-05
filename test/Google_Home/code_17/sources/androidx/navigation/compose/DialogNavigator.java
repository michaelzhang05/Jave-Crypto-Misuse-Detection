package androidx.navigation.compose;

import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import o6.InterfaceC3698L;

@StabilityInferred(parameters = 0)
@Navigator.Name(DialogNavigator.NAME)
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "dialog";

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    public final InterfaceC3698L getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final InterfaceC3698L getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z8) {
        getState().popWithTransition(navBackStackEntry, z8);
        int q02 = AbstractC1378t.q0((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        int i8 = 0;
        for (Object obj : (Iterable) getState().getTransitionsInProgress().getValue()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i8 > q02) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry2);
            }
            i8 = i9;
        }
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    /* loaded from: classes3.dex */
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 0;
        private final InterfaceC1669o content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC1669o interfaceC1669o, int i8, AbstractC3247p abstractC3247p) {
            this(dialogNavigator, (i8 & 2) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (AbstractC3247p) null) : dialogProperties, interfaceC1669o);
        }

        public final InterfaceC1669o getContent$navigation_compose_release() {
            return this.content;
        }

        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC1669o interfaceC1669o) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = interfaceC1669o;
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m5472getLambda1$navigation_compose_release(), 2, null);
    }
}
