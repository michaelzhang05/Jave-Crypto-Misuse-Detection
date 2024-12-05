package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static m3 f1157k;

    /* renamed from: l, reason: collision with root package name */
    private static m3 f1158l;

    /* renamed from: a, reason: collision with root package name */
    private final View f1159a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f1160b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1161c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f1162d = new Runnable() { // from class: androidx.appcompat.widget.k3
        @Override // java.lang.Runnable
        public final void run() {
            m3.this.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f1163e = new Runnable() { // from class: androidx.appcompat.widget.l3
        @Override // java.lang.Runnable
        public final void run() {
            m3.this.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f1164f;

    /* renamed from: g, reason: collision with root package name */
    private int f1165g;

    /* renamed from: h, reason: collision with root package name */
    private n3 f1166h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1167i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1168j;

    private m3(View view, CharSequence charSequence) {
        this.f1159a = view;
        this.f1160b = charSequence;
        this.f1161c = androidx.core.view.q2.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1159a.removeCallbacks(this.f1162d);
    }

    private void c() {
        this.f1168j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1159a.postDelayed(this.f1162d, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(m3 m3Var) {
        m3 m3Var2 = f1157k;
        if (m3Var2 != null) {
            m3Var2.b();
        }
        f1157k = m3Var;
        if (m3Var != null) {
            m3Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        m3 m3Var = f1157k;
        if (m3Var != null && m3Var.f1159a == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m3(view, charSequence);
            return;
        }
        m3 m3Var2 = f1158l;
        if (m3Var2 != null && m3Var2.f1159a == view) {
            m3Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (!this.f1168j && Math.abs(x5 - this.f1164f) <= this.f1161c && Math.abs(y5 - this.f1165g) <= this.f1161c) {
            return false;
        }
        this.f1164f = x5;
        this.f1165g = y5;
        this.f1168j = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (f1158l == this) {
            f1158l = null;
            n3 n3Var = this.f1166h;
            if (n3Var != null) {
                n3Var.c();
                this.f1166h = null;
                c();
                this.f1159a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1157k == this) {
            g(null);
        }
        this.f1159a.removeCallbacks(this.f1163e);
    }

    void i(boolean z5) {
        long longPressTimeout;
        long j6;
        long j7;
        if (androidx.core.view.b1.T(this.f1159a)) {
            g(null);
            m3 m3Var = f1158l;
            if (m3Var != null) {
                m3Var.d();
            }
            f1158l = this;
            this.f1167i = z5;
            n3 n3Var = new n3(this.f1159a.getContext());
            this.f1166h = n3Var;
            n3Var.e(this.f1159a, this.f1164f, this.f1165g, this.f1167i, this.f1160b);
            this.f1159a.addOnAttachStateChangeListener(this);
            if (this.f1167i) {
                j7 = 2500;
            } else {
                if ((androidx.core.view.b1.N(this.f1159a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j7 = j6 - longPressTimeout;
            }
            this.f1159a.removeCallbacks(this.f1163e);
            this.f1159a.postDelayed(this.f1163e, j7);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1166h != null && this.f1167i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1159a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1159a.isEnabled() && this.f1166h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1164f = view.getWidth() / 2;
        this.f1165g = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
