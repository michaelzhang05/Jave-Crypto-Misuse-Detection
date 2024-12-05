package androidx.navigation;

import L5.I;
import M5.AbstractC1246t;
import M5.a0;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.v;

/* loaded from: classes3.dex */
public abstract class NavigatorState {
    private final v _backStack;
    private final v _transitionsInProgress;
    private final InterfaceC3349K backStack;
    private final ReentrantLock backStackLock = new ReentrantLock(true);
    private boolean isNavigating;
    private final InterfaceC3349K transitionsInProgress;

    public NavigatorState() {
        v a8 = AbstractC3351M.a(AbstractC1246t.m());
        this._backStack = a8;
        v a9 = AbstractC3351M.a(a0.f());
        this._transitionsInProgress = a9;
        this.backStack = AbstractC3360h.b(a8);
        this.transitionsInProgress = AbstractC3360h.b(a9);
    }

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final InterfaceC3349K getBackStack() {
        return this.backStack;
    }

    public final InterfaceC3349K getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(NavBackStackEntry entry) {
        AbstractC3159y.i(entry, "entry");
        v vVar = this._transitionsInProgress;
        vVar.setValue(a0.l((Set) vVar.getValue(), entry));
    }

    @CallSuper
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        int i8;
        AbstractC3159y.i(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List Z02 = AbstractC1246t.Z0((Collection) this.backStack.getValue());
            ListIterator listIterator = Z02.listIterator(Z02.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (AbstractC3159y.d(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        i8 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            Z02.set(i8, backStackEntry);
            this._backStack.setValue(Z02);
            I i9 = I.f6487a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC3159y.i(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC3159y.d(navBackStackEntry.getId(), backStackEntry.getId())) {
                v vVar = this._transitionsInProgress;
                vVar.setValue(a0.n(a0.n((Set) vVar.getValue(), navBackStackEntry), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(NavBackStackEntry popUpTo, boolean z8) {
        AbstractC3159y.i(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            v vVar = this._backStack;
            Iterable iterable = (Iterable) vVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!AbstractC3159y.d((NavBackStackEntry) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            vVar.setValue(arrayList);
            I i8 = I.f6487a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void popWithTransition(NavBackStackEntry popUpTo, boolean z8) {
        Object obj;
        AbstractC3159y.i(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == popUpTo) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        v vVar = this._transitionsInProgress;
        vVar.setValue(a0.n((Set) vVar.getValue(), popUpTo));
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!AbstractC3159y.d(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            v vVar2 = this._transitionsInProgress;
            vVar2.setValue(a0.n((Set) vVar2.getValue(), navBackStackEntry2));
        }
        pop(popUpTo, z8);
    }

    @CallSuper
    public void prepareForTransition(NavBackStackEntry entry) {
        AbstractC3159y.i(entry, "entry");
        v vVar = this._transitionsInProgress;
        vVar.setValue(a0.n((Set) vVar.getValue(), entry));
    }

    public void push(NavBackStackEntry backStackEntry) {
        AbstractC3159y.i(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            v vVar = this._backStack;
            vVar.setValue(AbstractC1246t.H0((Collection) vVar.getValue(), backStackEntry));
            I i8 = I.f6487a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC3159y.i(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC1246t.z0((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            v vVar = this._transitionsInProgress;
            vVar.setValue(a0.n((Set) vVar.getValue(), navBackStackEntry));
        }
        v vVar2 = this._transitionsInProgress;
        vVar2.setValue(a0.n((Set) vVar2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z8) {
        this.isNavigating = z8;
    }
}
