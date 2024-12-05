package y;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.i0;
import androidx.core.view.b1;
import java.util.ArrayList;
import java.util.List;
import l.h;
import y.b;

/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f9844n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f9845o = new C0149a();

    /* renamed from: p, reason: collision with root package name */
    private static final b.InterfaceC0150b f9846p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f9851h;

    /* renamed from: i, reason: collision with root package name */
    private final View f9852i;

    /* renamed from: j, reason: collision with root package name */
    private c f9853j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f9847d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f9848e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f9849f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f9850g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f9854k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f9855l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f9856m = Integer.MIN_VALUE;

    /* renamed from: y.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0149a implements b.a {
        C0149a() {
        }

        @Override // y.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g0 g0Var, Rect rect) {
            g0Var.l(rect);
        }
    }

    /* loaded from: classes.dex */
    class b implements b.InterfaceC0150b {
        b() {
        }

        @Override // y.b.InterfaceC0150b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0 b(h hVar, int i6) {
            return (g0) hVar.l(i6);
        }

        @Override // y.b.InterfaceC0150b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int a(h hVar) {
            return hVar.k();
        }
    }

    /* loaded from: classes.dex */
    private class c extends h0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.h0
        public g0 b(int i6) {
            return g0.N(a.this.H(i6));
        }

        @Override // androidx.core.view.accessibility.h0
        public g0 d(int i6) {
            int i7 = i6 == 2 ? a.this.f9854k : a.this.f9855l;
            if (i7 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i7);
        }

        @Override // androidx.core.view.accessibility.h0
        public boolean f(int i6, int i7, Bundle bundle) {
            return a.this.P(i6, i7, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f9852i = view;
        this.f9851h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (b1.C(view) == 0) {
            b1.A0(view, 1);
        }
    }

    private static Rect D(View view, int i6, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i6 == 17) {
            rect.set(width, 0, width, height);
        } else if (i6 == 33) {
            rect.set(0, height, width, height);
        } else if (i6 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f9852i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f9852i;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int F(int i6) {
        if (i6 == 19) {
            return 33;
        }
        if (i6 != 21) {
            return i6 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i6, Rect rect) {
        Object d6;
        h y5 = y();
        int i7 = this.f9855l;
        g0 g0Var = i7 == Integer.MIN_VALUE ? null : (g0) y5.e(i7);
        if (i6 == 1 || i6 == 2) {
            d6 = y.b.d(y5, f9846p, f9845o, g0Var, i6, b1.E(this.f9852i) == 1, false);
        } else {
            if (i6 != 17 && i6 != 33 && i6 != 66 && i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i8 = this.f9855l;
            if (i8 != Integer.MIN_VALUE) {
                z(i8, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f9852i, i6, rect2);
            }
            d6 = y.b.c(y5, f9846p, f9845o, g0Var, rect2, i6);
        }
        g0 g0Var2 = (g0) d6;
        return T(g0Var2 != null ? y5.i(y5.h(g0Var2)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i6, int i7, Bundle bundle) {
        return i7 != 1 ? i7 != 2 ? i7 != 64 ? i7 != 128 ? J(i6, i7, bundle) : n(i6) : S(i6) : o(i6) : T(i6);
    }

    private boolean R(int i6, Bundle bundle) {
        return b1.f0(this.f9852i, i6, bundle);
    }

    private boolean S(int i6) {
        int i7;
        if (!this.f9851h.isEnabled() || !this.f9851h.isTouchExplorationEnabled() || (i7 = this.f9854k) == i6) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            n(i7);
        }
        this.f9854k = i6;
        this.f9852i.invalidate();
        U(i6, 32768);
        return true;
    }

    private void V(int i6) {
        int i7 = this.f9856m;
        if (i7 == i6) {
            return;
        }
        this.f9856m = i6;
        U(i6, 128);
        U(i7, 256);
    }

    private boolean n(int i6) {
        if (this.f9854k != i6) {
            return false;
        }
        this.f9854k = Integer.MIN_VALUE;
        this.f9852i.invalidate();
        U(i6, 65536);
        return true;
    }

    private boolean p() {
        int i6 = this.f9855l;
        return i6 != Integer.MIN_VALUE && J(i6, 16, null);
    }

    private AccessibilityEvent q(int i6, int i7) {
        return i6 != -1 ? r(i6, i7) : s(i7);
    }

    private AccessibilityEvent r(int i6, int i7) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i7);
        g0 H = H(i6);
        obtain.getText().add(H.v());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.I());
        obtain.setPassword(H.H());
        obtain.setEnabled(H.D());
        obtain.setChecked(H.B());
        L(i6, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.o());
        i0.c(obtain, this.f9852i, i6);
        obtain.setPackageName(this.f9852i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i6) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i6);
        this.f9852i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private g0 t(int i6) {
        g0 L = g0.L();
        L.d0(true);
        L.f0(true);
        L.X("android.view.View");
        Rect rect = f9844n;
        L.T(rect);
        L.U(rect);
        L.n0(this.f9852i);
        N(i6, L);
        if (L.v() == null && L.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.l(this.f9848e);
        if (this.f9848e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j6 = L.j();
        if ((j6 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j6 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        L.l0(this.f9852i.getContext().getPackageName());
        L.s0(this.f9852i, i6);
        if (this.f9854k == i6) {
            L.R(true);
            L.a(128);
        } else {
            L.R(false);
            L.a(64);
        }
        boolean z5 = this.f9855l == i6;
        if (z5) {
            L.a(2);
        } else if (L.E()) {
            L.a(1);
        }
        L.g0(z5);
        this.f9852i.getLocationOnScreen(this.f9850g);
        L.m(this.f9847d);
        if (this.f9847d.equals(rect)) {
            L.l(this.f9847d);
            if (L.f2278b != -1) {
                g0 L2 = g0.L();
                for (int i7 = L.f2278b; i7 != -1; i7 = L2.f2278b) {
                    L2.o0(this.f9852i, -1);
                    L2.T(f9844n);
                    N(i7, L2);
                    L2.l(this.f9848e);
                    Rect rect2 = this.f9847d;
                    Rect rect3 = this.f9848e;
                    rect2.offset(rect3.left, rect3.top);
                }
                L2.P();
            }
            this.f9847d.offset(this.f9850g[0] - this.f9852i.getScrollX(), this.f9850g[1] - this.f9852i.getScrollY());
        }
        if (this.f9852i.getLocalVisibleRect(this.f9849f)) {
            this.f9849f.offset(this.f9850g[0] - this.f9852i.getScrollX(), this.f9850g[1] - this.f9852i.getScrollY());
            if (this.f9847d.intersect(this.f9849f)) {
                L.U(this.f9847d);
                if (E(this.f9847d)) {
                    L.w0(true);
                }
            }
        }
        return L;
    }

    private g0 u() {
        g0 M = g0.M(this.f9852i);
        b1.d0(this.f9852i, M);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (M.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            M.c(this.f9852i, ((Integer) arrayList.get(i6)).intValue());
        }
        return M;
    }

    private h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            hVar.j(((Integer) arrayList.get(i6)).intValue(), t(((Integer) arrayList.get(i6)).intValue()));
        }
        return hVar;
    }

    private void z(int i6, Rect rect) {
        H(i6).l(rect);
    }

    public final int A() {
        return this.f9855l;
    }

    protected abstract int B(float f6, float f7);

    protected abstract void C(List list);

    g0 H(int i6) {
        return i6 == -1 ? u() : t(i6);
    }

    public final void I(boolean z5, int i6, Rect rect) {
        int i7 = this.f9855l;
        if (i7 != Integer.MIN_VALUE) {
            o(i7);
        }
        if (z5) {
            G(i6, rect);
        }
    }

    protected abstract boolean J(int i6, int i7, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i6, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(g0 g0Var);

    protected abstract void N(int i6, g0 g0Var);

    protected abstract void O(int i6, boolean z5);

    boolean P(int i6, int i7, Bundle bundle) {
        return i6 != -1 ? Q(i6, i7, bundle) : R(i7, bundle);
    }

    public final boolean T(int i6) {
        int i7;
        if ((!this.f9852i.isFocused() && !this.f9852i.requestFocus()) || (i7 = this.f9855l) == i6) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            o(i7);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f9855l = i6;
        O(i6, true);
        U(i6, 8);
        return true;
    }

    public final boolean U(int i6, int i7) {
        ViewParent parent;
        if (i6 == Integer.MIN_VALUE || !this.f9851h.isEnabled() || (parent = this.f9852i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f9852i, q(i6, i7));
    }

    @Override // androidx.core.view.a
    public h0 b(View view) {
        if (this.f9853j == null) {
            this.f9853j = new c();
        }
        return this.f9853j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, g0 g0Var) {
        super.g(view, g0Var);
        M(g0Var);
    }

    public final boolean o(int i6) {
        if (this.f9855l != i6) {
            return false;
        }
        this.f9855l = Integer.MIN_VALUE;
        O(i6, false);
        U(i6, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f9851h.isEnabled() || !this.f9851h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f9856m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i6 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int F = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z5 = false;
                    while (i6 < repeatCount && G(F, null)) {
                        i6++;
                        z5 = true;
                    }
                    return z5;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f9854k;
    }
}
