package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {
    static final String LOG_TAG = "MenuItemWrapper";
    private Method mSetExclusiveCheckableMethod;
    private final SupportMenuItem mWrappedObject;

    /* loaded from: classes.dex */
    private class ActionProviderWrapper extends ActionProvider implements ActionProvider.VisibilityListener {
        private final android.view.ActionProvider mInner;
        private ActionProvider.VisibilityListener mListener;

        ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.mInner = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
            return this.mInner.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z8) {
            ActionProvider.VisibilityListener visibilityListener = this.mListener;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z8);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.mInner.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
            return this.mInner.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.mInner.onPrepareSubMenu(MenuItemWrapperICS.this.getSubMenuWrapper(subMenu));
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            ActionProviderWrapper actionProviderWrapper;
            this.mListener = visibilityListener;
            android.view.ActionProvider actionProvider = this.mInner;
            if (visibilityListener != null) {
                actionProviderWrapper = this;
            } else {
                actionProviderWrapper = null;
            }
            actionProvider.setVisibilityListener(actionProviderWrapper);
        }

        @Override // androidx.core.view.ActionProvider
        @NonNull
        public View onCreateActionView() {
            return this.mInner.onCreateActionView();
        }
    }

    /* loaded from: classes.dex */
    static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {
        final android.view.CollapsibleActionView mWrappedView;

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.mWrappedView = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        View getWrappedView() {
            return (View) this.mWrappedView;
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            this.mWrappedView.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
            this.mWrappedView.onActionViewExpanded();
        }
    }

    /* loaded from: classes.dex */
    private class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener mObject;

        OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.mObject = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.mObject.onMenuItemActionCollapse(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.mObject.onMenuItemActionExpand(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    /* loaded from: classes.dex */
    private class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener mObject;

        OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.mObject = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.mObject.onMenuItemClick(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.mWrappedObject = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.mWrappedObject.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.mWrappedObject.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider supportActionProvider = this.mWrappedObject.getSupportActionProvider();
        if (supportActionProvider instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) supportActionProvider).mInner;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof CollapsibleActionViewWrapper) {
            return ((CollapsibleActionViewWrapper) actionView).getWrappedView();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mWrappedObject.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mWrappedObject.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.mWrappedObject.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mWrappedObject.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.mWrappedObject.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.mWrappedObject.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.mWrappedObject.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.mWrappedObject.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.mWrappedObject.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mWrappedObject.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.mWrappedObject.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.mWrappedObject.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.mWrappedObject.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return getSubMenuWrapper(this.mWrappedObject.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.mWrappedObject.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.mWrappedObject.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.mWrappedObject.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mWrappedObject.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.mWrappedObject.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.mWrappedObject.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.mWrappedObject.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.mWrappedObject.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapper actionProviderWrapper = new ActionProviderWrapper(this.mContext, actionProvider);
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (actionProvider == null) {
            actionProviderWrapper = null;
        }
        supportMenuItem.setSupportActionProvider(actionProviderWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.mWrappedObject.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.mWrappedObject.setAlphabeticShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        this.mWrappedObject.setCheckable(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        this.mWrappedObject.setChecked(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.mWrappedObject.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        this.mWrappedObject.setEnabled(z8);
        return this;
    }

    public void setExclusiveCheckable(boolean z8) {
        try {
            if (this.mSetExclusiveCheckableMethod == null) {
                this.mSetExclusiveCheckableMethod = this.mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.mSetExclusiveCheckableMethod.invoke(this.mWrappedObject, Boolean.valueOf(z8));
        } catch (Exception e8) {
            Log.w(LOG_TAG, "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.mWrappedObject.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.mWrappedObject.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.mWrappedObject.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.mWrappedObject.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.mWrappedObject.setNumericShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        OnActionExpandListenerWrapper onActionExpandListenerWrapper;
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (onActionExpandListener != null) {
            onActionExpandListenerWrapper = new OnActionExpandListenerWrapper(onActionExpandListener);
        } else {
            onActionExpandListenerWrapper = null;
        }
        supportMenuItem.setOnActionExpandListener(onActionExpandListenerWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        OnMenuItemClickListenerWrapper onMenuItemClickListenerWrapper;
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListenerWrapper = new OnMenuItemClickListenerWrapper(onMenuItemClickListener);
        } else {
            onMenuItemClickListenerWrapper = null;
        }
        supportMenuItem.setOnMenuItemClickListener(onMenuItemClickListenerWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.mWrappedObject.setShortcut(c8, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i8) {
        this.mWrappedObject.setShowAsAction(i8);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i8) {
        this.mWrappedObject.setShowAsActionFlags(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.mWrappedObject.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mWrappedObject.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.mWrappedObject.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        return this.mWrappedObject.setVisible(z8);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.mWrappedObject.setAlphabeticShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.mWrappedObject.setIcon(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.mWrappedObject.setNumericShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.mWrappedObject.setShortcut(c8, c9, i8, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.mWrappedObject.setTitle(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i8) {
        this.mWrappedObject.setActionView(i8);
        View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.mWrappedObject.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}