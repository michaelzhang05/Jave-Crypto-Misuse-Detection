package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;

/* loaded from: classes.dex */
public final class i implements t.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f653b;

    /* renamed from: c, reason: collision with root package name */
    private final int f654c;

    /* renamed from: d, reason: collision with root package name */
    private final int f655d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f656e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f657f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f658g;

    /* renamed from: h, reason: collision with root package name */
    private char f659h;

    /* renamed from: j, reason: collision with root package name */
    private char f661j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f663l;

    /* renamed from: n, reason: collision with root package name */
    g f665n;

    /* renamed from: o, reason: collision with root package name */
    private r f666o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f667p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f668q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f669r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f670s;

    /* renamed from: z, reason: collision with root package name */
    private int f677z;

    /* renamed from: i, reason: collision with root package name */
    private int f660i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f662k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f664m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f671t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f672u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f673v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f674w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f675x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f676y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0037b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0037b
        public void onActionProviderVisibilityChanged(boolean z5) {
            i iVar = i.this;
            iVar.f665n.J(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f665n = gVar;
        this.f652a = i7;
        this.f653b = i6;
        this.f654c = i8;
        this.f655d = i9;
        this.f656e = charSequence;
        this.f677z = i10;
    }

    private static void d(StringBuilder sb, int i6, int i7, String str) {
        if ((i6 & i7) == i7) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f675x && (this.f673v || this.f674w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f673v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f671t);
            }
            if (this.f674w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f672u);
            }
            this.f675x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f665n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f677z & 4) == 4;
    }

    @Override // t.b
    public t.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f665n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    @Override // t.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f665n.I(this);
    }

    @Override // t.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f677z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f665n.f(this);
        }
        return false;
    }

    @Override // t.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f665n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f655d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.f665n.G() ? this.f661j : this.f659h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // t.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View c6 = bVar.c(this);
        this.A = c6;
        return c6;
    }

    @Override // t.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f662k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f661j;
    }

    @Override // t.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f669r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f653b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f663l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f664m == 0) {
            return null;
        }
        Drawable b6 = e.a.b(this.f665n.u(), this.f664m);
        this.f664m = 0;
        this.f663l = b6;
        return e(b6);
    }

    @Override // t.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f671t;
    }

    @Override // t.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f672u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f658g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f652a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // t.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f660i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f659h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f654c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f666o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f656e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f657f;
        return charSequence != null ? charSequence : this.f656e;
    }

    @Override // t.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f670s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i6;
        char g6 = g();
        if (g6 == 0) {
            return "";
        }
        Resources resources = this.f665n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f665n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(d.h.f6244k));
        }
        int i7 = this.f665n.G() ? this.f662k : this.f660i;
        d(sb, i7, 65536, resources.getString(d.h.f6240g));
        d(sb, i7, 4096, resources.getString(d.h.f6236c));
        d(sb, i7, 2, resources.getString(d.h.f6235b));
        d(sb, i7, 1, resources.getString(d.h.f6241h));
        d(sb, i7, 4, resources.getString(d.h.f6243j));
        d(sb, i7, 8, resources.getString(d.h.f6239f));
        if (g6 == '\b') {
            i6 = d.h.f6237d;
        } else if (g6 == '\n') {
            i6 = d.h.f6238e;
        } else {
            if (g6 != ' ') {
                sb.append(g6);
                return sb.toString();
            }
            i6 = d.h.f6242i;
        }
        sb.append(resources.getString(i6));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f666o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // t.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f676y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f676y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f676y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.f()) ? (this.f676y & 8) == 0 : (this.f676y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f677z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.c(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f668q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f665n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f667p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f658g != null) {
            try {
                this.f665n.u().startActivity(this.f658g);
                return true;
            } catch (ActivityNotFoundException e6) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e6);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f676y & 32) == 32;
    }

    public boolean m() {
        return (this.f676y & 4) != 0;
    }

    public boolean n() {
        return (this.f677z & 1) == 1;
    }

    public boolean o() {
        return (this.f677z & 2) == 2;
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public t.b setActionView(int i6) {
        Context u5 = this.f665n.u();
        setActionView(LayoutInflater.from(u5).inflate(i6, (ViewGroup) new LinearLayout(u5), false));
        return this;
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public t.b setActionView(View view) {
        int i6;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i6 = this.f652a) > 0) {
            view.setId(i6);
        }
        this.f665n.I(this);
        return this;
    }

    public void r(boolean z5) {
        this.D = z5;
        this.f665n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z5) {
        int i6 = this.f676y;
        int i7 = (z5 ? 2 : 0) | (i6 & (-3));
        this.f676y = i7;
        if (i6 != i7) {
            this.f665n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        if (this.f661j == c6) {
            return this;
        }
        this.f661j = Character.toLowerCase(c6);
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        int i6 = this.f676y;
        int i7 = (z5 ? 1 : 0) | (i6 & (-2));
        this.f676y = i7;
        if (i6 != i7) {
            this.f665n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        if ((this.f676y & 4) != 0) {
            this.f665n.T(this);
        } else {
            s(z5);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f676y = z5 ? this.f676y | 16 : this.f676y & (-17);
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i6) {
        this.f663l = null;
        this.f664m = i6;
        this.f675x = true;
        this.f665n.K(false);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f671t = colorStateList;
        this.f673v = true;
        this.f675x = true;
        this.f665n.K(false);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f672u = mode;
        this.f674w = true;
        this.f675x = true;
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f658g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        if (this.f659h == c6) {
            return this;
        }
        this.f659h = c6;
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f668q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f659h = c6;
        this.f661j = Character.toLowerCase(c7);
        this.f665n.K(false);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public void setShowAsAction(int i6) {
        int i7 = i6 & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f677z = i6;
        this.f665n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i6) {
        return setTitle(this.f665n.u().getString(i6));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f657f = charSequence;
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        if (y(z5)) {
            this.f665n.J(this);
        }
        return this;
    }

    public void t(boolean z5) {
        this.f676y = (z5 ? 4 : 0) | (this.f676y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f656e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z5) {
        this.f676y = z5 ? this.f676y | 32 : this.f676y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // t.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public t.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    public void x(r rVar) {
        this.f666o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z5) {
        int i6 = this.f676y;
        int i7 = (z5 ? 0 : 8) | (i6 & (-9));
        this.f676y = i7;
        return i6 != i7;
    }

    public boolean z() {
        return this.f665n.A();
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i6) {
        if (this.f661j == c6 && this.f662k == i6) {
            return this;
        }
        this.f661j = Character.toLowerCase(c6);
        this.f662k = KeyEvent.normalizeMetaState(i6);
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public t.b setContentDescription(CharSequence charSequence) {
        this.f669r = charSequence;
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f664m = 0;
        this.f663l = drawable;
        this.f675x = true;
        this.f665n.K(false);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i6) {
        if (this.f659h == c6 && this.f660i == i6) {
            return this;
        }
        this.f659h = c6;
        this.f660i = KeyEvent.normalizeMetaState(i6);
        this.f665n.K(false);
        return this;
    }

    @Override // t.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f659h = c6;
        this.f660i = KeyEvent.normalizeMetaState(i6);
        this.f661j = Character.toLowerCase(c7);
        this.f662k = KeyEvent.normalizeMetaState(i7);
        this.f665n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f656e = charSequence;
        this.f665n.K(false);
        r rVar = this.f666o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public t.b setTooltipText(CharSequence charSequence) {
        this.f670s = charSequence;
        this.f665n.K(false);
        return this;
    }
}
