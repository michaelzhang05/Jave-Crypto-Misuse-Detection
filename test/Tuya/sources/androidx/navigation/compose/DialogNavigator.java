package androidx.navigation.compose;

import M5.AbstractC1246t;
import X5.o;
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
import kotlin.jvm.internal.AbstractC3151p;
import l6.InterfaceC3349K;

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

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    public final InterfaceC3349K getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final InterfaceC3349K getTransitionInProgress$navigation_compose_release() {
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
        int q02 = AbstractC1246t.q0((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        int i8 = 0;
        for (Object obj : (Iterable) getState().getTransitionsInProgress().getValue()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
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
        private final o content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, o oVar, int i8, AbstractC3151p abstractC3151p) {
            this(dialogNavigator, (i8 & 2) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (AbstractC3151p) null) : dialogProperties, oVar);
        }

        public final o getContent$navigation_compose_release() {
            return this.content;
        }

        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, o oVar) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = oVar;
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m5467getLambda1$navigation_compose_release(), 2, null);
    }
}
