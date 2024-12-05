package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class r0 implements x {
    Toolbar a;

    /* renamed from: b, reason: collision with root package name */
    private int f574b;

    /* renamed from: c, reason: collision with root package name */
    private View f575c;

    /* renamed from: d, reason: collision with root package name */
    private View f576d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f577e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f578f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f579g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f580h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f581i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f582j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f583k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f584f;

        a() {
            this.f584f = new androidx.appcompat.view.menu.a(r0.this.a.getContext(), 0, R.id.home, 0, 0, r0.this.f581i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r0 r0Var = r0.this;
            Window.Callback callback = r0Var.l;
            if (callback == null || !r0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f584f);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class b extends androidx.core.view.a0 {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f586b;

        b(int i2) {
            this.f586b = i2;
        }

        @Override // androidx.core.view.a0, androidx.core.view.z
        public void onAnimationCancel(View view) {
            this.a = true;
        }

        @Override // androidx.core.view.a0, androidx.core.view.z
        public void onAnimationEnd(View view) {
            if (this.a) {
                return;
            }
            r0.this.a.setVisibility(this.f586b);
        }

        @Override // androidx.core.view.a0, androidx.core.view.z
        public void onAnimationStart(View view) {
            r0.this.a.setVisibility(0);
        }
    }

    public r0(Toolbar toolbar, boolean z) {
        this(toolbar, z, c.a.h.a, c.a.e.n);
    }

    private void F(CharSequence charSequence) {
        this.f581i = charSequence;
        if ((this.f574b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f574b & 4) != 0) {
            if (TextUtils.isEmpty(this.f583k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.f583k);
            }
        }
    }

    private void H() {
        if ((this.f574b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.f579g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.f574b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f578f;
            if (drawable == null) {
                drawable = this.f577e;
            }
        } else {
            drawable = this.f577e;
        }
        this.a.setLogo(drawable);
    }

    private int x() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f578f = drawable;
        I();
    }

    public void B(int i2) {
        C(i2 == 0 ? null : getContext().getString(i2));
    }

    public void C(CharSequence charSequence) {
        this.f583k = charSequence;
        G();
    }

    public void D(Drawable drawable) {
        this.f579g = drawable;
        H();
    }

    public void E(CharSequence charSequence) {
        this.f582j = charSequence;
        if ((this.f574b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.x
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(c.a.f.f2211g);
        }
        this.n.g(aVar);
        this.a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.x
    public boolean b() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.x
    public void c() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.x
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.x
    public boolean d() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.x
    public boolean e() {
        return this.a.z();
    }

    @Override // androidx.appcompat.widget.x
    public boolean f() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.x
    public boolean g() {
        return this.a.O();
    }

    @Override // androidx.appcompat.widget.x
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.x
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.x
    public void h() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.x
    public void i(j0 j0Var) {
        View view = this.f575c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.f575c);
            }
        }
        this.f575c = j0Var;
        if (j0Var == null || this.o != 2) {
            return;
        }
        this.a.addView(j0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f575c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        j0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.x
    public boolean j() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.x
    public void k(int i2) {
        View view;
        int i3 = this.f574b ^ i2;
        this.f574b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f581i);
                    this.a.setSubtitle(this.f582j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f576d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.x
    public Menu l() {
        return this.a.getMenu();
    }

    @Override // androidx.appcompat.widget.x
    public void m(int i2) {
        A(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.x
    public int n() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.x
    public androidx.core.view.y o(int i2, long j2) {
        return androidx.core.view.u.c(this.a).a(i2 == 0 ? 1.0f : 0.0f).d(j2).f(new b(i2));
    }

    @Override // androidx.appcompat.widget.x
    public void p(m.a aVar, g.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.x
    public void q(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.x
    public ViewGroup r() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.x
    public void s(boolean z) {
    }

    @Override // androidx.appcompat.widget.x
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.x
    public void setTitle(CharSequence charSequence) {
        this.f580h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.x
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.x
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f580h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.x
    public int t() {
        return this.f574b;
    }

    @Override // androidx.appcompat.widget.x
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.x
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.x
    public void w(boolean z) {
        this.a.setCollapsible(z);
    }

    public void y(View view) {
        View view2 = this.f576d;
        if (view2 != null && (this.f574b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.f576d = view;
        if (view == null || (this.f574b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void z(int i2) {
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            B(this.p);
        }
    }

    public r0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f581i = toolbar.getTitle();
        this.f582j = toolbar.getSubtitle();
        this.f580h = this.f581i != null;
        this.f579g = toolbar.getNavigationIcon();
        q0 v = q0.v(toolbar.getContext(), null, c.a.j.a, c.a.a.f2170c, 0);
        this.q = v.g(c.a.j.l);
        if (z) {
            CharSequence p = v.p(c.a.j.r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(c.a.j.p);
            if (!TextUtils.isEmpty(p2)) {
                E(p2);
            }
            Drawable g2 = v.g(c.a.j.n);
            if (g2 != null) {
                A(g2);
            }
            Drawable g3 = v.g(c.a.j.m);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.f579g == null && (drawable = this.q) != null) {
                D(drawable);
            }
            k(v.k(c.a.j.f2246h, 0));
            int n = v.n(c.a.j.f2245g, 0);
            if (n != 0) {
                y(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                k(this.f574b | 16);
            }
            int m = v.m(c.a.j.f2248j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = v.e(c.a.j.f2244f, -1);
            int e3 = v.e(c.a.j.f2243e, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.a.H(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n2 = v.n(c.a.j.s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), n2);
            }
            int n3 = v.n(c.a.j.q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), n3);
            }
            int n4 = v.n(c.a.j.o, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.f574b = x();
        }
        v.w();
        z(i2);
        this.f583k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.x
    public void setIcon(Drawable drawable) {
        this.f577e = drawable;
        I();
    }
}
