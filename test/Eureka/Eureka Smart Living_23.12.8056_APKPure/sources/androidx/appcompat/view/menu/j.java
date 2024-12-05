package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final t.b f679d;

    /* renamed from: e, reason: collision with root package name */
    private Method f680e;

    /* loaded from: classes.dex */
    private class a extends androidx.core.view.b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f681d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f681d = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f681d.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean d() {
            return this.f681d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void e(SubMenu subMenu) {
            this.f681d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private b.InterfaceC0037b f683f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f681d.isVisible();
        }

        @Override // androidx.core.view.b
        public View c(MenuItem menuItem) {
            return this.f681d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f681d.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i(b.InterfaceC0037b interfaceC0037b) {
            this.f683f = interfaceC0037b;
            this.f681d.setVisibilityListener(interfaceC0037b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z5) {
            b.InterfaceC0037b interfaceC0037b = this.f683f;
            if (interfaceC0037b != null) {
                interfaceC0037b.onActionProviderVisibilityChanged(z5);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f685a;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f685a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f685a;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f685a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f685a.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f686a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f686a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f686a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f686a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f688a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f688a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f688a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, t.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f679d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f679d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f679d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b6 = this.f679d.b();
        if (b6 instanceof a) {
            return ((a) b6).f681d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f679d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f679d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f679d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f679d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f679d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f679d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f679d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f679d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f679d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f679d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f679d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f679d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f679d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f679d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f679d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f679d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f679d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f679d.getTooltipText();
    }

    public void h(boolean z5) {
        try {
            if (this.f680e == null) {
                this.f680e = this.f679d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f680e.invoke(this.f679d, Boolean.valueOf(z5));
        } catch (Exception e6) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f679d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f679d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f679d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f679d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f679d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f679d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f567a, actionProvider);
        t.b bVar2 = this.f679d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i6) {
        this.f679d.setActionView(i6);
        View actionView = this.f679d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f679d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f679d.setAlphabeticShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.f679d.setCheckable(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.f679d.setChecked(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f679d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f679d.setEnabled(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i6) {
        this.f679d.setIcon(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f679d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f679d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f679d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f679d.setNumericShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f679d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f679d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f679d.setShortcut(c6, c7);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i6) {
        this.f679d.setShowAsAction(i6);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i6) {
        this.f679d.setShowAsActionFlags(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i6) {
        this.f679d.setTitle(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f679d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f679d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        return this.f679d.setVisible(z5);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f679d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f679d.setAlphabeticShortcut(c6, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f679d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i6) {
        this.f679d.setNumericShortcut(c6, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f679d.setShortcut(c6, c7, i6, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f679d.setTitle(charSequence);
        return this;
    }
}
