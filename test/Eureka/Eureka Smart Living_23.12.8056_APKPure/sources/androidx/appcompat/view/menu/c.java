package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final Context f567a;

    /* renamed from: b, reason: collision with root package name */
    private l.g f568b;

    /* renamed from: c, reason: collision with root package name */
    private l.g f569c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f567a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof t.b)) {
            return menuItem;
        }
        t.b bVar = (t.b) menuItem;
        if (this.f568b == null) {
            this.f568b = new l.g();
        }
        MenuItem menuItem2 = (MenuItem) this.f568b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f567a, bVar);
        this.f568b.put(bVar, jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        l.g gVar = this.f568b;
        if (gVar != null) {
            gVar.clear();
        }
        l.g gVar2 = this.f569c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i6) {
        if (this.f568b == null) {
            return;
        }
        int i7 = 0;
        while (i7 < this.f568b.size()) {
            if (((t.b) this.f568b.i(i7)).getGroupId() == i6) {
                this.f568b.k(i7);
                i7--;
            }
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i6) {
        if (this.f568b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f568b.size(); i7++) {
            if (((t.b) this.f568b.i(i7)).getItemId() == i6) {
                this.f568b.k(i7);
                return;
            }
        }
    }
}
