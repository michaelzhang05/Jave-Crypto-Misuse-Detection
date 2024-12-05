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
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public class h3 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1029a;

    /* renamed from: b, reason: collision with root package name */
    private int f1030b;

    /* renamed from: c, reason: collision with root package name */
    private View f1031c;

    /* renamed from: d, reason: collision with root package name */
    private View f1032d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1033e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1034f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1035g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1036h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f1037i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1038j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1039k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f1040l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1041m;

    /* renamed from: n, reason: collision with root package name */
    private c f1042n;

    /* renamed from: o, reason: collision with root package name */
    private int f1043o;

    /* renamed from: p, reason: collision with root package name */
    private int f1044p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1045q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1046a;

        a() {
            this.f1046a = new androidx.appcompat.view.menu.a(h3.this.f1029a.getContext(), 0, R.id.home, 0, 0, h3.this.f1037i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h3 h3Var = h3.this;
            Window.Callback callback = h3Var.f1040l;
            if (callback == null || !h3Var.f1041m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1046a);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.y2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1048a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1049b;

        b(int i6) {
            this.f1049b = i6;
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            if (this.f1048a) {
                return;
            }
            h3.this.f1029a.setVisibility(this.f1049b);
        }

        @Override // androidx.core.view.y2, androidx.core.view.x2
        public void b(View view) {
            h3.this.f1029a.setVisibility(0);
        }

        @Override // androidx.core.view.y2, androidx.core.view.x2
        public void c(View view) {
            this.f1048a = true;
        }
    }

    public h3(Toolbar toolbar, boolean z5) {
        this(toolbar, z5, d.h.f6234a, d.e.f6175n);
    }

    private void D(CharSequence charSequence) {
        this.f1037i = charSequence;
        if ((this.f1030b & 8) != 0) {
            this.f1029a.setTitle(charSequence);
            if (this.f1036h) {
                androidx.core.view.b1.t0(this.f1029a.getRootView(), charSequence);
            }
        }
    }

    private void E() {
        if ((this.f1030b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1039k)) {
                this.f1029a.setNavigationContentDescription(this.f1044p);
            } else {
                this.f1029a.setNavigationContentDescription(this.f1039k);
            }
        }
    }

    private void F() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1030b & 4) != 0) {
            toolbar = this.f1029a;
            drawable = this.f1035g;
            if (drawable == null) {
                drawable = this.f1045q;
            }
        } else {
            toolbar = this.f1029a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        Drawable drawable;
        int i6 = this.f1030b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) == 0 || (drawable = this.f1034f) == null) {
            drawable = this.f1033e;
        }
        this.f1029a.setLogo(drawable);
    }

    private int u() {
        if (this.f1029a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1045q = this.f1029a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f1035g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f1038j = charSequence;
        if ((this.f1030b & 8) != 0) {
            this.f1029a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f1036h = true;
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.b2
    public void a(Menu menu, m.a aVar) {
        if (this.f1042n == null) {
            c cVar = new c(this.f1029a.getContext());
            this.f1042n = cVar;
            cVar.p(d.f.f6194g);
        }
        this.f1042n.h(aVar);
        this.f1029a.M((androidx.appcompat.view.menu.g) menu, this.f1042n);
    }

    @Override // androidx.appcompat.widget.b2
    public boolean b() {
        return this.f1029a.C();
    }

    @Override // androidx.appcompat.widget.b2
    public boolean c() {
        return this.f1029a.D();
    }

    @Override // androidx.appcompat.widget.b2
    public void collapseActionView() {
        this.f1029a.e();
    }

    @Override // androidx.appcompat.widget.b2
    public boolean d() {
        return this.f1029a.y();
    }

    @Override // androidx.appcompat.widget.b2
    public boolean e() {
        return this.f1029a.R();
    }

    @Override // androidx.appcompat.widget.b2
    public void f() {
        this.f1041m = true;
    }

    @Override // androidx.appcompat.widget.b2
    public boolean g() {
        return this.f1029a.d();
    }

    @Override // androidx.appcompat.widget.b2
    public Context getContext() {
        return this.f1029a.getContext();
    }

    @Override // androidx.appcompat.widget.b2
    public CharSequence getTitle() {
        return this.f1029a.getTitle();
    }

    @Override // androidx.appcompat.widget.b2
    public void h() {
        this.f1029a.h();
    }

    @Override // androidx.appcompat.widget.b2
    public int i() {
        return this.f1030b;
    }

    @Override // androidx.appcompat.widget.b2
    public void j(int i6) {
        this.f1029a.setVisibility(i6);
    }

    @Override // androidx.appcompat.widget.b2
    public void k(int i6) {
        x(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    @Override // androidx.appcompat.widget.b2
    public void l(v2 v2Var) {
        View view = this.f1031c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1029a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1031c);
            }
        }
        this.f1031c = v2Var;
    }

    @Override // androidx.appcompat.widget.b2
    public void m(boolean z5) {
    }

    @Override // androidx.appcompat.widget.b2
    public int n() {
        return this.f1043o;
    }

    @Override // androidx.appcompat.widget.b2
    public androidx.core.view.w2 o(int i6, long j6) {
        return androidx.core.view.b1.e(this.f1029a).b(i6 == 0 ? 1.0f : 0.0f).f(j6).h(new b(i6));
    }

    @Override // androidx.appcompat.widget.b2
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b2
    public boolean q() {
        return this.f1029a.x();
    }

    @Override // androidx.appcompat.widget.b2
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b2
    public void s(boolean z5) {
        this.f1029a.setCollapsible(z5);
    }

    @Override // androidx.appcompat.widget.b2
    public void setIcon(int i6) {
        setIcon(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    @Override // androidx.appcompat.widget.b2
    public void setWindowCallback(Window.Callback callback) {
        this.f1040l = callback;
    }

    @Override // androidx.appcompat.widget.b2
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1036h) {
            return;
        }
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.b2
    public void t(int i6) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i7 = this.f1030b ^ i6;
        this.f1030b = i6;
        if (i7 != 0) {
            if ((i7 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i7 & 3) != 0) {
                G();
            }
            if ((i7 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    this.f1029a.setTitle(this.f1037i);
                    toolbar = this.f1029a;
                    charSequence = this.f1038j;
                } else {
                    charSequence = null;
                    this.f1029a.setTitle((CharSequence) null);
                    toolbar = this.f1029a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i7 & 16) == 0 || (view = this.f1032d) == null) {
                return;
            }
            if ((i6 & 16) != 0) {
                this.f1029a.addView(view);
            } else {
                this.f1029a.removeView(view);
            }
        }
    }

    public void v(View view) {
        View view2 = this.f1032d;
        if (view2 != null && (this.f1030b & 16) != 0) {
            this.f1029a.removeView(view2);
        }
        this.f1032d = view;
        if (view == null || (this.f1030b & 16) == 0) {
            return;
        }
        this.f1029a.addView(view);
    }

    public void w(int i6) {
        if (i6 == this.f1044p) {
            return;
        }
        this.f1044p = i6;
        if (TextUtils.isEmpty(this.f1029a.getNavigationContentDescription())) {
            y(this.f1044p);
        }
    }

    public void x(Drawable drawable) {
        this.f1034f = drawable;
        G();
    }

    public void y(int i6) {
        z(i6 == 0 ? null : getContext().getString(i6));
    }

    public void z(CharSequence charSequence) {
        this.f1039k = charSequence;
        E();
    }

    public h3(Toolbar toolbar, boolean z5, int i6, int i7) {
        Drawable drawable;
        this.f1043o = 0;
        this.f1044p = 0;
        this.f1029a = toolbar;
        this.f1037i = toolbar.getTitle();
        this.f1038j = toolbar.getSubtitle();
        this.f1036h = this.f1037i != null;
        this.f1035g = toolbar.getNavigationIcon();
        c3 v5 = c3.v(toolbar.getContext(), null, d.j.f6250a, d.a.f6116c, 0);
        this.f1045q = v5.g(d.j.f6305l);
        if (z5) {
            CharSequence p6 = v5.p(d.j.f6335r);
            if (!TextUtils.isEmpty(p6)) {
                C(p6);
            }
            CharSequence p7 = v5.p(d.j.f6325p);
            if (!TextUtils.isEmpty(p7)) {
                B(p7);
            }
            Drawable g6 = v5.g(d.j.f6315n);
            if (g6 != null) {
                x(g6);
            }
            Drawable g7 = v5.g(d.j.f6310m);
            if (g7 != null) {
                setIcon(g7);
            }
            if (this.f1035g == null && (drawable = this.f1045q) != null) {
                A(drawable);
            }
            t(v5.k(d.j.f6285h, 0));
            int n6 = v5.n(d.j.f6280g, 0);
            if (n6 != 0) {
                v(LayoutInflater.from(this.f1029a.getContext()).inflate(n6, (ViewGroup) this.f1029a, false));
                t(this.f1030b | 16);
            }
            int m6 = v5.m(d.j.f6295j, 0);
            if (m6 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1029a.getLayoutParams();
                layoutParams.height = m6;
                this.f1029a.setLayoutParams(layoutParams);
            }
            int e6 = v5.e(d.j.f6275f, -1);
            int e7 = v5.e(d.j.f6270e, -1);
            if (e6 >= 0 || e7 >= 0) {
                this.f1029a.L(Math.max(e6, 0), Math.max(e7, 0));
            }
            int n7 = v5.n(d.j.f6340s, 0);
            if (n7 != 0) {
                Toolbar toolbar2 = this.f1029a;
                toolbar2.O(toolbar2.getContext(), n7);
            }
            int n8 = v5.n(d.j.f6330q, 0);
            if (n8 != 0) {
                Toolbar toolbar3 = this.f1029a;
                toolbar3.N(toolbar3.getContext(), n8);
            }
            int n9 = v5.n(d.j.f6320o, 0);
            if (n9 != 0) {
                this.f1029a.setPopupTheme(n9);
            }
        } else {
            this.f1030b = u();
        }
        v5.w();
        w(i6);
        this.f1039k = this.f1029a.getNavigationContentDescription();
        this.f1029a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.b2
    public void setIcon(Drawable drawable) {
        this.f1033e = drawable;
        G();
    }
}
