package androidx.core.view;

import a6.InterfaceC1668n;
import android.view.Menu;
import android.view.MenuItem;
import i6.InterfaceC2998g;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (AbstractC3255y.d(menu.getItem(i8), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, Function1 function1) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            function1.invoke(menu.getItem(i8));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC1668n interfaceC1668n) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC1668n.invoke(Integer.valueOf(i8), menu.getItem(i8));
        }
    }

    public static final MenuItem get(Menu menu, int i8) {
        return menu.getItem(i8);
    }

    public static final InterfaceC2998g getChildren(final Menu menu) {
        return new InterfaceC2998g() { // from class: androidx.core.view.MenuKt$children$1
            @Override // i6.InterfaceC2998g
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(Menu menu) {
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i8) {
        O5.I i9;
        MenuItem item = menu.getItem(i8);
        if (item != null) {
            menu.removeItem(item.getItemId());
            i9 = O5.I.f8278a;
        } else {
            i9 = null;
        }
        if (i9 != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
