package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.q2;
import androidx.core.view.b1;

/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f705v = d.g.f6226m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f706b;

    /* renamed from: c, reason: collision with root package name */
    private final g f707c;

    /* renamed from: d, reason: collision with root package name */
    private final f f708d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f709e;

    /* renamed from: f, reason: collision with root package name */
    private final int f710f;

    /* renamed from: g, reason: collision with root package name */
    private final int f711g;

    /* renamed from: h, reason: collision with root package name */
    private final int f712h;

    /* renamed from: i, reason: collision with root package name */
    final q2 f713i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f716l;

    /* renamed from: m, reason: collision with root package name */
    private View f717m;

    /* renamed from: n, reason: collision with root package name */
    View f718n;

    /* renamed from: o, reason: collision with root package name */
    private m.a f719o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f720p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f721q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f722r;

    /* renamed from: s, reason: collision with root package name */
    private int f723s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f725u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f714j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f715k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f724t = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.f713i.B()) {
                return;
            }
            View view = q.this.f718n;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f713i.f();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f720p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f720p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f720p.removeGlobalOnLayoutListener(qVar.f714j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i6, int i7, boolean z5) {
        this.f706b = context;
        this.f707c = gVar;
        this.f709e = z5;
        this.f708d = new f(gVar, LayoutInflater.from(context), z5, f705v);
        this.f711g = i6;
        this.f712h = i7;
        Resources resources = context.getResources();
        this.f710f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f6150b));
        this.f717m = view;
        this.f713i = new q2(context, null, i6, i7);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f721q || (view = this.f717m) == null) {
            return false;
        }
        this.f718n = view;
        this.f713i.K(this);
        this.f713i.L(this);
        this.f713i.J(true);
        View view2 = this.f718n;
        boolean z5 = this.f720p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f720p = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f714j);
        }
        view2.addOnAttachStateChangeListener(this.f715k);
        this.f713i.D(view2);
        this.f713i.G(this.f724t);
        if (!this.f722r) {
            this.f723s = k.o(this.f708d, null, this.f706b, this.f710f);
            this.f722r = true;
        }
        this.f713i.F(this.f723s);
        this.f713i.I(2);
        this.f713i.H(n());
        this.f713i.f();
        ListView k6 = this.f713i.k();
        k6.setOnKeyListener(this);
        if (this.f725u && this.f707c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f706b).inflate(d.g.f6225l, (ViewGroup) k6, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f707c.x());
            }
            frameLayout.setEnabled(false);
            k6.addHeaderView(frameLayout, null, false);
        }
        this.f713i.o(this.f708d);
        this.f713i.f();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z5) {
        if (gVar != this.f707c) {
            return;
        }
        dismiss();
        m.a aVar = this.f719o;
        if (aVar != null) {
            aVar.a(gVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.f721q && this.f713i.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f713i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void f() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f719o = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f706b, rVar, this.f718n, this.f709e, this.f711g, this.f712h);
            lVar.j(this.f719o);
            lVar.g(k.x(rVar));
            lVar.i(this.f716l);
            this.f716l = null;
            this.f707c.e(false);
            int c6 = this.f713i.c();
            int g6 = this.f713i.g();
            if ((Gravity.getAbsoluteGravity(this.f724t, b1.E(this.f717m)) & 7) == 5) {
                c6 += this.f717m.getWidth();
            }
            if (lVar.n(c6, g6)) {
                m.a aVar = this.f719o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z5) {
        this.f722r = false;
        f fVar = this.f708d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.f713i.k();
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f721q = true;
        this.f707c.close();
        ViewTreeObserver viewTreeObserver = this.f720p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f720p = this.f718n.getViewTreeObserver();
            }
            this.f720p.removeGlobalOnLayoutListener(this.f714j);
            this.f720p = null;
        }
        this.f718n.removeOnAttachStateChangeListener(this.f715k);
        PopupWindow.OnDismissListener onDismissListener = this.f716l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.f717m = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z5) {
        this.f708d.d(z5);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i6) {
        this.f724t = i6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i6) {
        this.f713i.a(i6);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f716l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z5) {
        this.f725u = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i6) {
        this.f713i.n(i6);
    }
}
