package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b2;
import androidx.core.view.b1;
import androidx.core.view.w2;
import androidx.core.view.x2;
import androidx.core.view.y2;
import androidx.core.view.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f309a;

    /* renamed from: b, reason: collision with root package name */
    private Context f310b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f311c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f312d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f313e;

    /* renamed from: f, reason: collision with root package name */
    b2 f314f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f315g;

    /* renamed from: h, reason: collision with root package name */
    View f316h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f319k;

    /* renamed from: l, reason: collision with root package name */
    d f320l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f321m;

    /* renamed from: n, reason: collision with root package name */
    b.a f322n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f323o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f325q;

    /* renamed from: t, reason: collision with root package name */
    boolean f328t;

    /* renamed from: u, reason: collision with root package name */
    boolean f329u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f330v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f332x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f333y;

    /* renamed from: z, reason: collision with root package name */
    boolean f334z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f317i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f318j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f324p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f326r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f327s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f331w = true;
    final x2 A = new a();
    final x2 B = new b();
    final z2 C = new c();

    /* loaded from: classes.dex */
    class a extends y2 {
        a() {
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            View view2;
            g0 g0Var = g0.this;
            if (g0Var.f327s && (view2 = g0Var.f316h) != null) {
                view2.setTranslationY(0.0f);
                g0.this.f313e.setTranslationY(0.0f);
            }
            g0.this.f313e.setVisibility(8);
            g0.this.f313e.setTransitioning(false);
            g0 g0Var2 = g0.this;
            g0Var2.f332x = null;
            g0Var2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = g0.this.f312d;
            if (actionBarOverlayLayout != null) {
                b1.n0(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends y2 {
        b() {
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            g0 g0Var = g0.this;
            g0Var.f332x = null;
            g0Var.f313e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements z2 {
        c() {
        }

        @Override // androidx.core.view.z2
        public void a(View view) {
            ((View) g0.this.f313e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f338c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f339d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f340e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f341f;

        public d(Context context, b.a aVar) {
            this.f338c = context;
            this.f340e = aVar;
            androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(context).S(1);
            this.f339d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f340e;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f340e == null) {
                return;
            }
            k();
            g0.this.f315g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            g0 g0Var = g0.this;
            if (g0Var.f320l != this) {
                return;
            }
            if (g0.w(g0Var.f328t, g0Var.f329u, false)) {
                this.f340e.d(this);
            } else {
                g0 g0Var2 = g0.this;
                g0Var2.f321m = this;
                g0Var2.f322n = this.f340e;
            }
            this.f340e = null;
            g0.this.v(false);
            g0.this.f315g.g();
            g0 g0Var3 = g0.this;
            g0Var3.f312d.setHideOnContentScrollEnabled(g0Var3.f334z);
            g0.this.f320l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f341f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f339d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f338c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return g0.this.f315g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return g0.this.f315g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (g0.this.f320l != this) {
                return;
            }
            this.f339d.d0();
            try {
                this.f340e.a(this, this.f339d);
            } finally {
                this.f339d.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return g0.this.f315g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            g0.this.f315g.setCustomView(view);
            this.f341f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i6) {
            o(g0.this.f309a.getResources().getString(i6));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            g0.this.f315g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i6) {
            r(g0.this.f309a.getResources().getString(i6));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            g0.this.f315g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z5) {
            super.s(z5);
            g0.this.f315g.setTitleOptional(z5);
        }

        public boolean t() {
            this.f339d.d0();
            try {
                return this.f340e.c(this, this.f339d);
            } finally {
                this.f339d.c0();
            }
        }
    }

    public g0(Activity activity, boolean z5) {
        this.f311c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z5) {
            return;
        }
        this.f316h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b2 A(View view) {
        if (view instanceof b2) {
            return (b2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f330v) {
            this.f330v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f312d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(d.f.f6203p);
        this.f312d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f314f = A(view.findViewById(d.f.f6188a));
        this.f315g = (ActionBarContextView) view.findViewById(d.f.f6193f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(d.f.f6190c);
        this.f313e = actionBarContainer;
        b2 b2Var = this.f314f;
        if (b2Var == null || this.f315g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f309a = b2Var.getContext();
        boolean z5 = (this.f314f.i() & 4) != 0;
        if (z5) {
            this.f319k = true;
        }
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(this.f309a);
        J(b6.a() || z5);
        H(b6.e());
        TypedArray obtainStyledAttributes = this.f309a.obtainStyledAttributes(null, d.j.f6250a, d.a.f6116c, 0);
        if (obtainStyledAttributes.getBoolean(d.j.f6300k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.j.f6290i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z5) {
        this.f325q = z5;
        if (z5) {
            this.f313e.setTabContainer(null);
            this.f314f.l(null);
        } else {
            this.f314f.l(null);
            this.f313e.setTabContainer(null);
        }
        boolean z6 = B() == 2;
        this.f314f.s(!this.f325q && z6);
        this.f312d.setHasNonEmbeddedTabs(!this.f325q && z6);
    }

    private boolean K() {
        return b1.U(this.f313e);
    }

    private void L() {
        if (this.f330v) {
            return;
        }
        this.f330v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f312d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z5) {
        if (w(this.f328t, this.f329u, this.f330v)) {
            if (this.f331w) {
                return;
            }
            this.f331w = true;
            z(z5);
            return;
        }
        if (this.f331w) {
            this.f331w = false;
            y(z5);
        }
    }

    static boolean w(boolean z5, boolean z6, boolean z7) {
        if (z7) {
            return true;
        }
        return (z5 || z6) ? false : true;
    }

    public int B() {
        return this.f314f.n();
    }

    public void E(boolean z5) {
        F(z5 ? 4 : 0, 4);
    }

    public void F(int i6, int i7) {
        int i8 = this.f314f.i();
        if ((i7 & 4) != 0) {
            this.f319k = true;
        }
        this.f314f.t((i6 & i7) | ((~i7) & i8));
    }

    public void G(float f6) {
        b1.y0(this.f313e, f6);
    }

    public void I(boolean z5) {
        if (z5 && !this.f312d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f334z = z5;
        this.f312d.setHideOnContentScrollEnabled(z5);
    }

    public void J(boolean z5) {
        this.f314f.m(z5);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z5) {
        this.f327s = z5;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.f329u) {
            this.f329u = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        androidx.appcompat.view.h hVar = this.f332x;
        if (hVar != null) {
            hVar.a();
            this.f332x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i6) {
        this.f326r = i6;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f329u) {
            return;
        }
        this.f329u = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        b2 b2Var = this.f314f;
        if (b2Var == null || !b2Var.q()) {
            return false;
        }
        this.f314f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z5) {
        if (z5 == this.f323o) {
            return;
        }
        this.f323o = z5;
        if (this.f324p.size() <= 0) {
            return;
        }
        f0.a(this.f324p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f314f.i();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f310b == null) {
            TypedValue typedValue = new TypedValue();
            this.f309a.getTheme().resolveAttribute(d.a.f6118e, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f310b = new ContextThemeWrapper(this.f309a, i6);
            } else {
                this.f310b = this.f309a;
            }
        }
        return this.f310b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(androidx.appcompat.view.a.b(this.f309a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i6, KeyEvent keyEvent) {
        Menu e6;
        d dVar = this.f320l;
        if (dVar == null || (e6 = dVar.e()) == null) {
            return false;
        }
        e6.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e6.performShortcut(i6, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z5) {
        if (this.f319k) {
            return;
        }
        E(z5);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z5) {
        androidx.appcompat.view.h hVar;
        this.f333y = z5;
        if (z5 || (hVar = this.f332x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.f314f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b u(b.a aVar) {
        d dVar = this.f320l;
        if (dVar != null) {
            dVar.c();
        }
        this.f312d.setHideOnContentScrollEnabled(false);
        this.f315g.k();
        d dVar2 = new d(this.f315g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f320l = dVar2;
        dVar2.k();
        this.f315g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z5) {
        w2 o6;
        w2 f6;
        if (z5) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z5) {
                this.f314f.j(4);
                this.f315g.setVisibility(0);
                return;
            } else {
                this.f314f.j(0);
                this.f315g.setVisibility(8);
                return;
            }
        }
        if (z5) {
            f6 = this.f314f.o(4, 100L);
            o6 = this.f315g.f(0, 200L);
        } else {
            o6 = this.f314f.o(0, 200L);
            f6 = this.f315g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f6, o6);
        hVar.h();
    }

    void x() {
        b.a aVar = this.f322n;
        if (aVar != null) {
            aVar.d(this.f321m);
            this.f321m = null;
            this.f322n = null;
        }
    }

    public void y(boolean z5) {
        View view;
        androidx.appcompat.view.h hVar = this.f332x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f326r != 0 || (!this.f333y && !z5)) {
            this.A.a(null);
            return;
        }
        this.f313e.setAlpha(1.0f);
        this.f313e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f6 = -this.f313e.getHeight();
        if (z5) {
            this.f313e.getLocationInWindow(new int[]{0, 0});
            f6 -= r5[1];
        }
        w2 m6 = b1.e(this.f313e).m(f6);
        m6.k(this.C);
        hVar2.c(m6);
        if (this.f327s && (view = this.f316h) != null) {
            hVar2.c(b1.e(view).m(f6));
        }
        hVar2.f(D);
        hVar2.e(250L);
        hVar2.g(this.A);
        this.f332x = hVar2;
        hVar2.h();
    }

    public void z(boolean z5) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f332x;
        if (hVar != null) {
            hVar.a();
        }
        this.f313e.setVisibility(0);
        if (this.f326r == 0 && (this.f333y || z5)) {
            this.f313e.setTranslationY(0.0f);
            float f6 = -this.f313e.getHeight();
            if (z5) {
                this.f313e.getLocationInWindow(new int[]{0, 0});
                f6 -= r5[1];
            }
            this.f313e.setTranslationY(f6);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            w2 m6 = b1.e(this.f313e).m(0.0f);
            m6.k(this.C);
            hVar2.c(m6);
            if (this.f327s && (view2 = this.f316h) != null) {
                view2.setTranslationY(f6);
                hVar2.c(b1.e(this.f316h).m(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f332x = hVar2;
            hVar2.h();
        } else {
            this.f313e.setAlpha(1.0f);
            this.f313e.setTranslationY(0.0f);
            if (this.f327s && (view = this.f316h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f312d;
        if (actionBarOverlayLayout != null) {
            b1.n0(actionBarOverlayLayout);
        }
    }

    public g0(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
