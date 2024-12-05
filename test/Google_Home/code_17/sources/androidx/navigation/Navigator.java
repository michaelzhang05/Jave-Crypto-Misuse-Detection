package androidx.navigation;

import P5.AbstractC1378t;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import i6.AbstractC3001j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public abstract class Navigator<D extends NavDestination> {
    private NavigatorState _state;
    private boolean isAttached;

    /* loaded from: classes3.dex */
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface Name {
        String value();
    }

    public abstract D createDestination();

    /* JADX INFO: Access modifiers changed from: protected */
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public NavDestination navigate(D destination, Bundle bundle, NavOptions navOptions, Extras extras) {
        AbstractC3255y.i(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(NavigatorState state) {
        AbstractC3255y.i(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        AbstractC3255y.i(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(Navigator$onLaunchSingleTop$1.INSTANCE), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(Bundle savedState) {
        AbstractC3255y.i(savedState, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Extras extras) {
        AbstractC3255y.i(entries, "entries");
        Iterator it = AbstractC3001j.q(AbstractC3001j.y(AbstractC1378t.c0(entries), new Navigator$navigate$1(this, navOptions, extras))).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void popBackStack(NavBackStackEntry popUpTo, boolean z8) {
        AbstractC3255y.i(popUpTo, "popUpTo");
        List list = (List) getState().getBackStack().getValue();
        if (list.contains(popUpTo)) {
            ListIterator listIterator = list.listIterator(list.size());
            NavBackStackEntry navBackStackEntry = null;
            while (popBackStack()) {
                navBackStackEntry = (NavBackStackEntry) listIterator.previous();
                if (AbstractC3255y.d(navBackStackEntry, popUpTo)) {
                    break;
                }
            }
            if (navBackStackEntry != null) {
                getState().pop(navBackStackEntry, z8);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
    }
}
