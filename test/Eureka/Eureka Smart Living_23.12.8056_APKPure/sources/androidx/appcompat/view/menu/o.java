package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class o extends c implements Menu {

    /* renamed from: d, reason: collision with root package name */
    private final t.a f704d;

    public o(Context context, t.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f704d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i6) {
        return c(this.f704d.add(i6));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f704d.addIntentOptions(i6, i7, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = c(menuItemArr2[i10]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6) {
        return d(this.f704d.addSubMenu(i6));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f704d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f704d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i6) {
        return c(this.f704d.findItem(i6));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i6) {
        return c(this.f704d.getItem(i6));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f704d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return this.f704d.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i6, int i7) {
        return this.f704d.performIdentifierAction(i6, i7);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        return this.f704d.performShortcut(i6, keyEvent, i7);
    }

    @Override // android.view.Menu
    public void removeGroup(int i6) {
        f(i6);
        this.f704d.removeGroup(i6);
    }

    @Override // android.view.Menu
    public void removeItem(int i6) {
        g(i6);
        this.f704d.removeItem(i6);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i6, boolean z5, boolean z6) {
        this.f704d.setGroupCheckable(i6, z5, z6);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i6, boolean z5) {
        this.f704d.setGroupEnabled(i6, z5);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i6, boolean z5) {
        this.f704d.setGroupVisible(i6, z5);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f704d.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f704d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, int i9) {
        return c(this.f704d.add(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return d(this.f704d.addSubMenu(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return c(this.f704d.add(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        return d(this.f704d.addSubMenu(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f704d.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f704d.addSubMenu(charSequence));
    }
}
