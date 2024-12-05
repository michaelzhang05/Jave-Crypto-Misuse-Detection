package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    private c.e.g<c.h.f.a.b, MenuItem> f239b;

    /* renamed from: c, reason: collision with root package name */
    private c.e.g<c.h.f.a.c, SubMenu> f240c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof c.h.f.a.b)) {
            return menuItem;
        }
        c.h.f.a.b bVar = (c.h.f.a.b) menuItem;
        if (this.f239b == null) {
            this.f239b = new c.e.g<>();
        }
        MenuItem menuItem2 = this.f239b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.f239b.put(bVar, jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c.h.f.a.c)) {
            return subMenu;
        }
        c.h.f.a.c cVar = (c.h.f.a.c) subMenu;
        if (this.f240c == null) {
            this.f240c = new c.e.g<>();
        }
        SubMenu subMenu2 = this.f240c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.f240c.put(cVar, sVar);
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        c.e.g<c.h.f.a.b, MenuItem> gVar = this.f239b;
        if (gVar != null) {
            gVar.clear();
        }
        c.e.g<c.h.f.a.c, SubMenu> gVar2 = this.f240c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i2) {
        if (this.f239b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f239b.size()) {
            if (this.f239b.i(i3).getGroupId() == i2) {
                this.f239b.k(i3);
                i3--;
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i2) {
        if (this.f239b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f239b.size(); i3++) {
            if (this.f239b.i(i3).getItemId() == i2) {
                this.f239b.k(i3);
                return;
            }
        }
    }
}
