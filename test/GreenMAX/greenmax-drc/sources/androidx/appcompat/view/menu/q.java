package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.f0;
import androidx.core.view.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    private static final int f316g = c.a.g.m;
    private boolean A;

    /* renamed from: h, reason: collision with root package name */
    private final Context f317h;

    /* renamed from: i, reason: collision with root package name */
    private final g f318i;

    /* renamed from: j, reason: collision with root package name */
    private final f f319j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f320k;
    private final int l;
    private final int m;
    private final int n;
    final f0 o;
    private PopupWindow.OnDismissListener r;
    private View s;
    View t;
    private m.a u;
    ViewTreeObserver v;
    private boolean w;
    private boolean x;
    private int y;
    final ViewTreeObserver.OnGlobalLayoutListener p = new a();
    private final View.OnAttachStateChangeListener q = new b();
    private int z = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.a() || q.this.o.A()) {
                return;
            }
            View view = q.this.t;
            if (view != null && view.isShown()) {
                q.this.o.show();
            } else {
                q.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.v = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.v.removeGlobalOnLayoutListener(qVar.p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f317h = context;
        this.f318i = gVar;
        this.f320k = z;
        this.f319j = new f(gVar, LayoutInflater.from(context), z, f316g);
        this.m = i2;
        this.n = i3;
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.d.f2188d));
        this.s = view;
        this.o = new f0(context, null, i2, i3);
        gVar.c(this, context);
    }

    private boolean A() {
        View view;
        if (a()) {
            return true;
        }
        if (this.w || (view = this.s) == null) {
            return false;
        }
        this.t = view;
        this.o.J(this);
        this.o.K(this);
        this.o.I(true);
        View view2 = this.t;
        boolean z = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        this.o.C(view2);
        this.o.F(this.z);
        if (!this.x) {
            this.y = k.p(this.f319j, null, this.f317h, this.l);
            this.x = true;
        }
        this.o.E(this.y);
        this.o.H(2);
        this.o.G(o());
        this.o.show();
        ListView j2 = this.o.j();
        j2.setOnKeyListener(this);
        if (this.A && this.f318i.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f317h).inflate(c.a.g.l, (ViewGroup) j2, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f318i.z());
            }
            frameLayout.setEnabled(false);
            j2.addHeaderView(frameLayout, null, false);
        }
        this.o.o(this.f319j);
        this.o.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return !this.w && this.o.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f318i) {
            return;
        }
        dismiss();
        m.a aVar = this.u;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(boolean z) {
        this.x = false;
        f fVar = this.f319j;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (a()) {
            this.o.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void g(m.a aVar) {
        this.u = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.o.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f317h, rVar, this.t, this.f320k, this.m, this.n);
            lVar.j(this.u);
            lVar.g(k.y(rVar));
            lVar.i(this.r);
            this.r = null;
            this.f318i.e(false);
            int c2 = this.o.c();
            int n = this.o.n();
            if ((Gravity.getAbsoluteGravity(this.z, u.y(this.s)) & 7) == 5) {
                c2 += this.s.getWidth();
            }
            if (lVar.n(c2, n)) {
                m.a aVar = this.u;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable l() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.k
    public void m(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.w = true;
        this.f318i.close();
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        PopupWindow.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void q(View view) {
        this.s = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(boolean z) {
        this.f319j.d(z);
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (!A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.z = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(int i2) {
        this.o.e(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(boolean z) {
        this.A = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(int i2) {
        this.o.k(i2);
    }
}
