package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
class t0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private static t0 f605f;

    /* renamed from: g, reason: collision with root package name */
    private static t0 f606g;

    /* renamed from: h, reason: collision with root package name */
    private final View f607h;

    /* renamed from: i, reason: collision with root package name */
    private final CharSequence f608i;

    /* renamed from: j, reason: collision with root package name */
    private final int f609j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f610k = new a();
    private final Runnable l = new b();
    private int m;
    private int n;
    private u0 o;
    private boolean p;

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.this.c();
        }
    }

    private t0(View view, CharSequence charSequence) {
        this.f607h = view;
        this.f608i = charSequence;
        this.f609j = androidx.core.view.v.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f607h.removeCallbacks(this.f610k);
    }

    private void b() {
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    private void d() {
        this.f607h.postDelayed(this.f610k, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(t0 t0Var) {
        t0 t0Var2 = f605f;
        if (t0Var2 != null) {
            t0Var2.a();
        }
        f605f = t0Var;
        if (t0Var != null) {
            t0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        t0 t0Var = f605f;
        if (t0Var != null && t0Var.f607h == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            t0 t0Var2 = f606g;
            if (t0Var2 != null && t0Var2.f607h == view) {
                t0Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new t0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.m) <= this.f609j && Math.abs(y - this.n) <= this.f609j) {
            return false;
        }
        this.m = x;
        this.n = y;
        return true;
    }

    void c() {
        if (f606g == this) {
            f606g = null;
            u0 u0Var = this.o;
            if (u0Var != null) {
                u0Var.c();
                this.o = null;
                b();
                this.f607h.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f605f == this) {
            e(null);
        }
        this.f607h.removeCallbacks(this.l);
    }

    void g(boolean z) {
        long j2;
        int longPressTimeout;
        long j3;
        if (androidx.core.view.u.N(this.f607h)) {
            e(null);
            t0 t0Var = f606g;
            if (t0Var != null) {
                t0Var.c();
            }
            f606g = this;
            this.p = z;
            u0 u0Var = new u0(this.f607h.getContext());
            this.o = u0Var;
            u0Var.e(this.f607h, this.m, this.n, this.p, this.f608i);
            this.f607h.addOnAttachStateChangeListener(this);
            if (this.p) {
                j3 = 2500;
            } else {
                if ((androidx.core.view.u.H(this.f607h) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f607h.removeCallbacks(this.l);
            this.f607h.postDelayed(this.l, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.o != null && this.p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f607h.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f607h.isEnabled() && this.o == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.m = view.getWidth() / 2;
        this.n = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
