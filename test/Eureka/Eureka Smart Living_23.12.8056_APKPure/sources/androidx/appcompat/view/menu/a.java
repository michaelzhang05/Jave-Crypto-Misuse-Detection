package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements t.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f537a;

    /* renamed from: b, reason: collision with root package name */
    private final int f538b;

    /* renamed from: c, reason: collision with root package name */
    private final int f539c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f540d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f541e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f542f;

    /* renamed from: g, reason: collision with root package name */
    private char f543g;

    /* renamed from: i, reason: collision with root package name */
    private char f545i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f547k;

    /* renamed from: l, reason: collision with root package name */
    private Context f548l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f549m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f550n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f551o;

    /* renamed from: h, reason: collision with root package name */
    private int f544h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f546j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f552p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f553q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f554r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f555s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f556t = 16;

    public a(Context context, int i6, int i7, int i8, int i9, CharSequence charSequence) {
        this.f548l = context;
        this.f537a = i7;
        this.f538b = i6;
        this.f539c = i9;
        this.f540d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f547k;
        if (drawable != null) {
            if (this.f554r || this.f555s) {
                Drawable r5 = androidx.core.graphics.drawable.a.r(drawable);
                this.f547k = r5;
                Drawable mutate = r5.mutate();
                this.f547k = mutate;
                if (this.f554r) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f552p);
                }
                if (this.f555s) {
                    androidx.core.graphics.drawable.a.p(this.f547k, this.f553q);
                }
            }
        }
    }

    @Override // t.b
    public t.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // t.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // t.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public t.b setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public t.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // t.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // t.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // t.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f546j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f545i;
    }

    @Override // t.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f550n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f538b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f547k;
    }

    @Override // t.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f552p;
    }

    @Override // t.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f553q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f542f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f537a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f544h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f543g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f539c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f540d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f541e;
        return charSequence != null ? charSequence : this.f540d;
    }

    @Override // t.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f551o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // t.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f556t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f556t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f556t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f556t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f545i = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.f556t = (z5 ? 1 : 0) | (this.f556t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.f556t = (z5 ? 2 : 0) | (this.f556t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f556t = (z5 ? 16 : 0) | (this.f556t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i6) {
        this.f547k = androidx.core.content.a.e(this.f548l, i6);
        c();
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f552p = colorStateList;
        this.f554r = true;
        c();
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f553q = mode;
        this.f555s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f542f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f543g = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f549m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f543g = c6;
        this.f545i = Character.toLowerCase(c7);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i6) {
        this.f540d = this.f548l.getResources().getString(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f541e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        this.f556t = (this.f556t & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f545i = Character.toLowerCase(c6);
        this.f546j = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public t.b setContentDescription(CharSequence charSequence) {
        this.f550n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f547k = drawable;
        c();
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i6) {
        this.f543g = c6;
        this.f544h = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f543g = c6;
        this.f544h = KeyEvent.normalizeMetaState(i6);
        this.f545i = Character.toLowerCase(c7);
        this.f546j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f540d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public t.b setTooltipText(CharSequence charSequence) {
        this.f551o = charSequence;
        return this;
    }
}
