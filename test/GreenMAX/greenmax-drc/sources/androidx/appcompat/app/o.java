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
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.x;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.u;
import androidx.core.view.y;
import androidx.core.view.z;
import c.a.o.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class o extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator a = new AccelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f198b = new DecelerateInterpolator();
    c.a.o.h A;
    private boolean B;
    boolean C;

    /* renamed from: c, reason: collision with root package name */
    Context f199c;

    /* renamed from: d, reason: collision with root package name */
    private Context f200d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f201e;

    /* renamed from: f, reason: collision with root package name */
    ActionBarOverlayLayout f202f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContainer f203g;

    /* renamed from: h, reason: collision with root package name */
    x f204h;

    /* renamed from: i, reason: collision with root package name */
    ActionBarContextView f205i;

    /* renamed from: j, reason: collision with root package name */
    View f206j;

    /* renamed from: k, reason: collision with root package name */
    j0 f207k;
    private boolean n;
    d o;
    c.a.o.b p;
    b.a q;
    private boolean r;
    private boolean t;
    boolean w;
    boolean x;
    private boolean y;
    private ArrayList<?> l = new ArrayList<>();
    private int m = -1;
    private ArrayList<a.b> s = new ArrayList<>();
    private int u = 0;
    boolean v = true;
    private boolean z = true;
    final z D = new a();
    final z E = new b();
    final b0 F = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class a extends a0 {
        a() {
        }

        @Override // androidx.core.view.a0, androidx.core.view.z
        public void onAnimationEnd(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.v && (view2 = oVar.f206j) != null) {
                view2.setTranslationY(0.0f);
                o.this.f203g.setTranslationY(0.0f);
            }
            o.this.f203g.setVisibility(8);
            o.this.f203g.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.A = null;
            oVar2.A();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f202f;
            if (actionBarOverlayLayout != null) {
                u.f0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class b extends a0 {
        b() {
        }

        @Override // androidx.core.view.a0, androidx.core.view.z
        public void onAnimationEnd(View view) {
            o oVar = o.this;
            oVar.A = null;
            oVar.f203g.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class c implements b0 {
        c() {
        }

        @Override // androidx.core.view.b0
        public void a(View view) {
            ((View) o.this.f203g.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends c.a.o.b implements g.a {

        /* renamed from: h, reason: collision with root package name */
        private final Context f208h;

        /* renamed from: i, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f209i;

        /* renamed from: j, reason: collision with root package name */
        private b.a f210j;

        /* renamed from: k, reason: collision with root package name */
        private WeakReference<View> f211k;

        public d(Context context, b.a aVar) {
            this.f208h = context;
            this.f210j = aVar;
            androidx.appcompat.view.menu.g W = new androidx.appcompat.view.menu.g(context).W(1);
            this.f209i = W;
            W.V(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f210j;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f210j == null) {
                return;
            }
            k();
            o.this.f205i.l();
        }

        @Override // c.a.o.b
        public void c() {
            o oVar = o.this;
            if (oVar.o != this) {
                return;
            }
            if (!o.z(oVar.w, oVar.x, false)) {
                o oVar2 = o.this;
                oVar2.p = this;
                oVar2.q = this.f210j;
            } else {
                this.f210j.a(this);
            }
            this.f210j = null;
            o.this.y(false);
            o.this.f205i.g();
            o.this.f204h.r().sendAccessibilityEvent(32);
            o oVar3 = o.this;
            oVar3.f202f.setHideOnContentScrollEnabled(oVar3.C);
            o.this.o = null;
        }

        @Override // c.a.o.b
        public View d() {
            WeakReference<View> weakReference = this.f211k;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // c.a.o.b
        public Menu e() {
            return this.f209i;
        }

        @Override // c.a.o.b
        public MenuInflater f() {
            return new c.a.o.g(this.f208h);
        }

        @Override // c.a.o.b
        public CharSequence g() {
            return o.this.f205i.getSubtitle();
        }

        @Override // c.a.o.b
        public CharSequence i() {
            return o.this.f205i.getTitle();
        }

        @Override // c.a.o.b
        public void k() {
            if (o.this.o != this) {
                return;
            }
            this.f209i.h0();
            try {
                this.f210j.c(this, this.f209i);
            } finally {
                this.f209i.g0();
            }
        }

        @Override // c.a.o.b
        public boolean l() {
            return o.this.f205i.j();
        }

        @Override // c.a.o.b
        public void m(View view) {
            o.this.f205i.setCustomView(view);
            this.f211k = new WeakReference<>(view);
        }

        @Override // c.a.o.b
        public void n(int i2) {
            o(o.this.f199c.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void o(CharSequence charSequence) {
            o.this.f205i.setSubtitle(charSequence);
        }

        @Override // c.a.o.b
        public void q(int i2) {
            r(o.this.f199c.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void r(CharSequence charSequence) {
            o.this.f205i.setTitle(charSequence);
        }

        @Override // c.a.o.b
        public void s(boolean z) {
            super.s(z);
            o.this.f205i.setTitleOptional(z);
        }

        public boolean t() {
            this.f209i.h0();
            try {
                return this.f210j.b(this, this.f209i);
            } finally {
                this.f209i.g0();
            }
        }
    }

    public o(Activity activity, boolean z) {
        this.f201e = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z) {
            return;
        }
        this.f206j = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private x D(View view) {
        if (view instanceof x) {
            return (x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void F() {
        if (this.y) {
            this.y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f202f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(c.a.f.p);
        this.f202f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f204h = D(view.findViewById(c.a.f.a));
        this.f205i = (ActionBarContextView) view.findViewById(c.a.f.f2210f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(c.a.f.f2207c);
        this.f203g = actionBarContainer;
        x xVar = this.f204h;
        if (xVar != null && this.f205i != null && actionBarContainer != null) {
            this.f199c = xVar.getContext();
            boolean z = (this.f204h.t() & 4) != 0;
            if (z) {
                this.n = true;
            }
            c.a.o.a b2 = c.a.o.a.b(this.f199c);
            t(b2.a() || z);
            J(b2.g());
            TypedArray obtainStyledAttributes = this.f199c.obtainStyledAttributes(null, c.a.j.a, c.a.a.f2170c, 0);
            if (obtainStyledAttributes.getBoolean(c.a.j.f2249k, false)) {
                K(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c.a.j.f2247i, 0);
            if (dimensionPixelSize != 0) {
                I(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(o.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void J(boolean z) {
        this.t = z;
        if (!z) {
            this.f204h.i(null);
            this.f203g.setTabContainer(this.f207k);
        } else {
            this.f203g.setTabContainer(null);
            this.f204h.i(this.f207k);
        }
        boolean z2 = E() == 2;
        j0 j0Var = this.f207k;
        if (j0Var != null) {
            if (z2) {
                j0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f202f;
                if (actionBarOverlayLayout != null) {
                    u.f0(actionBarOverlayLayout);
                }
            } else {
                j0Var.setVisibility(8);
            }
        }
        this.f204h.w(!this.t && z2);
        this.f202f.setHasNonEmbeddedTabs(!this.t && z2);
    }

    private boolean L() {
        return u.O(this.f203g);
    }

    private void M() {
        if (this.y) {
            return;
        }
        this.y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f202f;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        N(false);
    }

    private void N(boolean z) {
        if (z(this.w, this.x, this.y)) {
            if (this.z) {
                return;
            }
            this.z = true;
            C(z);
            return;
        }
        if (this.z) {
            this.z = false;
            B(z);
        }
    }

    static boolean z(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    void A() {
        b.a aVar = this.q;
        if (aVar != null) {
            aVar.a(this.p);
            this.p = null;
            this.q = null;
        }
    }

    public void B(boolean z) {
        View view;
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        if (this.u == 0 && (this.B || z)) {
            this.f203g.setAlpha(1.0f);
            this.f203g.setTransitioning(true);
            c.a.o.h hVar2 = new c.a.o.h();
            float f2 = -this.f203g.getHeight();
            if (z) {
                this.f203g.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            y k2 = u.c(this.f203g).k(f2);
            k2.i(this.F);
            hVar2.c(k2);
            if (this.v && (view = this.f206j) != null) {
                hVar2.c(u.c(view).k(f2));
            }
            hVar2.f(a);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.A = hVar2;
            hVar2.h();
            return;
        }
        this.D.onAnimationEnd(null);
    }

    public void C(boolean z) {
        View view;
        View view2;
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        this.f203g.setVisibility(0);
        if (this.u == 0 && (this.B || z)) {
            this.f203g.setTranslationY(0.0f);
            float f2 = -this.f203g.getHeight();
            if (z) {
                this.f203g.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f203g.setTranslationY(f2);
            c.a.o.h hVar2 = new c.a.o.h();
            y k2 = u.c(this.f203g).k(0.0f);
            k2.i(this.F);
            hVar2.c(k2);
            if (this.v && (view2 = this.f206j) != null) {
                view2.setTranslationY(f2);
                hVar2.c(u.c(this.f206j).k(0.0f));
            }
            hVar2.f(f198b);
            hVar2.e(250L);
            hVar2.g(this.E);
            this.A = hVar2;
            hVar2.h();
        } else {
            this.f203g.setAlpha(1.0f);
            this.f203g.setTranslationY(0.0f);
            if (this.v && (view = this.f206j) != null) {
                view.setTranslationY(0.0f);
            }
            this.E.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f202f;
        if (actionBarOverlayLayout != null) {
            u.f0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f204h.n();
    }

    public void H(int i2, int i3) {
        int t = this.f204h.t();
        if ((i3 & 4) != 0) {
            this.n = true;
        }
        this.f204h.k((i2 & i3) | ((i3 ^ (-1)) & t));
    }

    public void I(float f2) {
        u.q0(this.f203g, f2);
    }

    public void K(boolean z) {
        if (z && !this.f202f.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.C = z;
        this.f202f.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.x) {
            this.x = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.x) {
            return;
        }
        this.x = true;
        N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        c.a.o.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
            this.A = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        x xVar = this.f204h;
        if (xVar == null || !xVar.j()) {
            return false;
        }
        this.f204h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.get(i2).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f204h.t();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f200d == null) {
            TypedValue typedValue = new TypedValue();
            this.f199c.getTheme().resolveAttribute(c.a.a.f2174g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f200d = new ContextThemeWrapper(this.f199c, i2);
            } else {
                this.f200d = this.f199c;
            }
        }
        return this.f200d;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        J(c.a.o.a.b(this.f199c).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.o;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        e2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.u = i2;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
        if (this.n) {
            return;
        }
        r(z);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        H(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        H(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
        this.f204h.s(z);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z) {
        c.a.o.h hVar;
        this.B = z;
        if (z || (hVar = this.A) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f204h.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f204h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public c.a.o.b x(b.a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.c();
        }
        this.f202f.setHideOnContentScrollEnabled(false);
        this.f205i.k();
        d dVar2 = new d(this.f205i.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.o = dVar2;
        dVar2.k();
        this.f205i.h(dVar2);
        y(true);
        this.f205i.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void y(boolean z) {
        y o;
        y f2;
        if (z) {
            M();
        } else {
            F();
        }
        if (!L()) {
            if (z) {
                this.f204h.q(4);
                this.f205i.setVisibility(0);
                return;
            } else {
                this.f204h.q(0);
                this.f205i.setVisibility(8);
                return;
            }
        }
        if (z) {
            f2 = this.f204h.o(4, 100L);
            o = this.f205i.f(0, 200L);
        } else {
            o = this.f204h.o(0, 200L);
            f2 = this.f205i.f(8, 100L);
        }
        c.a.o.h hVar = new c.a.o.h();
        hVar.d(f2, o);
        hVar.h();
    }

    public o(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}
