package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0.c;
import androidx.core.view.d0.f;
import androidx.core.view.u;
import androidx.customview.view.AbsSavedState;
import c.j.a.c;
import cm.aptoide.pt.file.CacheHelper;
import e.e.b.b.k;
import e.e.b.b.l;
import e.e.b.b.z.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int a = k.f17493i;
    private boolean A;
    private int B;
    private boolean C;
    int D;
    int E;
    WeakReference<V> F;
    WeakReference<View> G;
    private final ArrayList<e> H;
    private VelocityTracker I;
    int J;
    private int K;
    boolean L;
    private Map<View, Integer> M;
    private final c.AbstractC0065c N;

    /* renamed from: b, reason: collision with root package name */
    private int f16472b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16473c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16474d;

    /* renamed from: e, reason: collision with root package name */
    private float f16475e;

    /* renamed from: f, reason: collision with root package name */
    private int f16476f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16477g;

    /* renamed from: h, reason: collision with root package name */
    private int f16478h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16479i;

    /* renamed from: j, reason: collision with root package name */
    private g f16480j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16481k;
    private e.e.b.b.z.k l;
    private boolean m;
    private BottomSheetBehavior<V>.f n;
    private ValueAnimator o;
    int p;
    int q;
    int r;
    float s;
    int t;
    float u;
    boolean v;
    private boolean w;
    private boolean x;
    int y;
    c.j.a.c z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f16486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16487g;

        a(View view, int i2) {
            this.f16486f = view;
            this.f16487g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.o0(this.f16486f, this.f16487g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16480j != null) {
                BottomSheetBehavior.this.f16480j.Y(floatValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends c.AbstractC0065c {
        c() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.E + bottomSheetBehavior.U()) / 2;
        }

        @Override // c.j.a.c.AbstractC0065c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // c.j.a.c.AbstractC0065c
        public int b(View view, int i2, int i3) {
            int U = BottomSheetBehavior.this.U();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c.h.g.a.b(i2, U, bottomSheetBehavior.v ? bottomSheetBehavior.E : bottomSheetBehavior.t);
        }

        @Override // c.j.a.c.AbstractC0065c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.v) {
                return bottomSheetBehavior.E;
            }
            return bottomSheetBehavior.t;
        }

        @Override // c.j.a.c.AbstractC0065c
        public void j(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.x) {
                BottomSheetBehavior.this.m0(1);
            }
        }

        @Override // c.j.a.c.AbstractC0065c
        public void k(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.R(i3);
        }

        @Override // c.j.a.c.AbstractC0065c
        public void l(View view, float f2, float f3) {
            int i2;
            int i3 = 4;
            if (f3 < 0.0f) {
                if (BottomSheetBehavior.this.f16473c) {
                    i2 = BottomSheetBehavior.this.q;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i4 = bottomSheetBehavior.r;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = bottomSheetBehavior.p;
                    }
                }
                i3 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.v && bottomSheetBehavior2.q0(view, f3)) {
                    if ((Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f16473c) {
                            i2 = BottomSheetBehavior.this.q;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.p) < Math.abs(view.getTop() - BottomSheetBehavior.this.r)) {
                            i2 = BottomSheetBehavior.this.p;
                        } else {
                            i2 = BottomSheetBehavior.this.r;
                            i3 = 6;
                        }
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.E;
                        i3 = 5;
                    }
                } else if (f3 != 0.0f && Math.abs(f2) <= Math.abs(f3)) {
                    if (BottomSheetBehavior.this.f16473c) {
                        i2 = BottomSheetBehavior.this.t;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.r) < Math.abs(top2 - BottomSheetBehavior.this.t)) {
                            i2 = BottomSheetBehavior.this.r;
                            i3 = 6;
                        } else {
                            i2 = BottomSheetBehavior.this.t;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f16473c) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.q) < Math.abs(top3 - BottomSheetBehavior.this.t)) {
                            i2 = BottomSheetBehavior.this.q;
                            i3 = 3;
                        } else {
                            i2 = BottomSheetBehavior.this.t;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i5 = bottomSheetBehavior3.r;
                        if (top3 < i5) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.t)) {
                                i2 = BottomSheetBehavior.this.p;
                                i3 = 3;
                            } else {
                                i2 = BottomSheetBehavior.this.r;
                            }
                        } else if (Math.abs(top3 - i5) < Math.abs(top3 - BottomSheetBehavior.this.t)) {
                            i2 = BottomSheetBehavior.this.r;
                        } else {
                            i2 = BottomSheetBehavior.this.t;
                        }
                        i3 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.r0(view, i3, i2, true);
        }

        @Override // c.j.a.c.AbstractC0065c
        public boolean m(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.y;
            if (i3 == 1 || bottomSheetBehavior.L) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.J == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.G;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.F;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements androidx.core.view.d0.f {
        final /* synthetic */ int a;

        d(int i2) {
            this.a = i2;
        }

        @Override // androidx.core.view.d0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.l0(this.a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public abstract void onSlide(View view, float f2);

        public abstract void onStateChanged(View view, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final View f16490f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16491g;

        /* renamed from: h, reason: collision with root package name */
        int f16492h;

        f(View view, int i2) {
            this.f16490f = view;
            this.f16492h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.j.a.c cVar = BottomSheetBehavior.this.z;
            if (cVar != null && cVar.k(true)) {
                u.a0(this.f16490f, this);
            } else {
                BottomSheetBehavior.this.m0(this.f16492h);
            }
            this.f16491g = false;
        }
    }

    public BottomSheetBehavior() {
        this.f16472b = 0;
        this.f16473c = true;
        this.f16474d = false;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.H = new ArrayList<>();
        this.N = new c();
    }

    private void J(V v, c.a aVar, int i2) {
        u.e0(v, aVar, null, new d(i2));
    }

    private void L() {
        int N = N();
        if (this.f16473c) {
            this.t = Math.max(this.E - N, this.q);
        } else {
            this.t = this.E - N;
        }
    }

    private void M() {
        this.r = (int) (this.E * (1.0f - this.s));
    }

    private int N() {
        if (this.f16477g) {
            return Math.max(this.f16478h, this.E - ((this.D * 9) / 16));
        }
        return this.f16476f;
    }

    private void O(Context context, AttributeSet attributeSet, boolean z) {
        P(context, attributeSet, z, null);
    }

    private void P(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f16479i) {
            this.l = e.e.b.b.z.k.e(context, attributeSet, e.e.b.b.b.f17425f, a).m();
            g gVar = new g(this.l);
            this.f16480j = gVar;
            gVar.N(context);
            if (z && colorStateList != null) {
                this.f16480j.X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f16480j.setTint(typedValue.data);
        }
    }

    private void Q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o = ofFloat;
        ofFloat.setDuration(500L);
        this.o.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> T(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) layoutParams).f();
            if (f2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private float W() {
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f16475e);
        return this.I.getYVelocity(this.J);
    }

    private void Y() {
        this.J = -1;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private void Z(SavedState savedState) {
        int i2 = this.f16472b;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f16476f = savedState.f16483i;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f16473c = savedState.f16484j;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.v = savedState.f16485k;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.w = savedState.l;
        }
    }

    private void n0(CoordinatorLayout coordinatorLayout) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || X() || (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) == null) {
            return;
        }
        this.f16476f += rootWindowInsets.getSystemGestureInsets().bottom;
    }

    private void p0(int i2) {
        V v = this.F.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && u.N(v)) {
            v.post(new a(v, i2));
        } else {
            o0(v, i2);
        }
    }

    private void s0() {
        V v;
        WeakReference<V> weakReference = this.F;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        u.c0(v, 524288);
        u.c0(v, 262144);
        u.c0(v, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        if (this.v && this.y != 5) {
            J(v, c.a.u, 5);
        }
        int i2 = this.y;
        if (i2 == 3) {
            J(v, c.a.t, this.f16473c ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            J(v, c.a.s, this.f16473c ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            J(v, c.a.t, 4);
            J(v, c.a.s, 3);
        }
    }

    private void t0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.m != z) {
            this.m = z;
            if (this.f16480j == null || (valueAnimator = this.o) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.o.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.o.setFloatValues(1.0f - f2, f2);
            this.o.start();
        }
    }

    private void u0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.F;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.M != null) {
                    return;
                } else {
                    this.M = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.F.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.M.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f16474d) {
                            u.t0(childAt, 4);
                        }
                    } else if (this.f16474d && (map = this.M) != null && map.containsKey(childAt)) {
                        u.t0(childAt, this.M.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.M = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.B = 0;
        this.C = false;
        return (i2 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v.getTop() == U()) {
            m0(3);
            return;
        }
        WeakReference<View> weakReference = this.G;
        if (weakReference != null && view == weakReference.get() && this.C) {
            if (this.B > 0) {
                if (this.f16473c) {
                    i3 = this.q;
                } else {
                    int top = v.getTop();
                    int i5 = this.r;
                    if (top > i5) {
                        i3 = i5;
                        i4 = 6;
                    } else {
                        i3 = this.p;
                    }
                }
            } else if (this.v && q0(v, W())) {
                i3 = this.E;
                i4 = 5;
            } else if (this.B == 0) {
                int top2 = v.getTop();
                if (this.f16473c) {
                    if (Math.abs(top2 - this.q) < Math.abs(top2 - this.t)) {
                        i3 = this.q;
                    } else {
                        i3 = this.t;
                        i4 = 4;
                    }
                } else {
                    int i6 = this.r;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.t)) {
                            i3 = this.p;
                        } else {
                            i3 = this.r;
                        }
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.t)) {
                        i3 = this.r;
                    } else {
                        i3 = this.t;
                        i4 = 4;
                    }
                    i4 = 6;
                }
            } else {
                if (this.f16473c) {
                    i3 = this.t;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.r) < Math.abs(top3 - this.t)) {
                        i3 = this.r;
                        i4 = 6;
                    } else {
                        i3 = this.t;
                    }
                }
                i4 = 4;
            }
            r0(v, i4, i3, false);
            this.C = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        c.j.a.c cVar = this.z;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            Y();
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        if (actionMasked == 2 && !this.A && Math.abs(this.K - motionEvent.getY()) > this.z.u()) {
            this.z.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.A;
    }

    public void K(e eVar) {
        if (this.H.contains(eVar)) {
            return;
        }
        this.H.add(eVar);
    }

    void R(int i2) {
        float f2;
        float f3;
        V v = this.F.get();
        if (v == null || this.H.isEmpty()) {
            return;
        }
        int i3 = this.t;
        if (i2 <= i3 && i3 != U()) {
            int i4 = this.t;
            f2 = i4 - i2;
            f3 = i4 - U();
        } else {
            int i5 = this.t;
            f2 = i5 - i2;
            f3 = this.E - i5;
        }
        float f4 = f2 / f3;
        for (int i6 = 0; i6 < this.H.size(); i6++) {
            this.H.get(i6).onSlide(v, f4);
        }
    }

    View S(View view) {
        if (u.P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View S = S(viewGroup.getChildAt(i2));
            if (S != null) {
                return S;
            }
        }
        return null;
    }

    public int U() {
        return this.f16473c ? this.q : this.p;
    }

    public int V() {
        return this.y;
    }

    public boolean X() {
        return this.f16481k;
    }

    @Deprecated
    public void a0(e eVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.H.clear();
        if (eVar != null) {
            this.H.add(eVar);
        }
    }

    public void b0(boolean z) {
        this.x = z;
    }

    public void c0(int i2) {
        if (i2 >= 0) {
            this.p = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void d0(boolean z) {
        if (this.f16473c == z) {
            return;
        }
        this.f16473c = z;
        if (this.F != null) {
            L();
        }
        m0((this.f16473c && this.y == 6) ? 3 : this.y);
        s0();
    }

    public void e0(boolean z) {
        this.f16481k = z;
    }

    public void f0(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.s = f2;
            if (this.F != null) {
                M();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.F = null;
        this.z = null;
    }

    public void g0(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                l0(4);
            }
            s0();
        }
    }

    public void h0(int i2) {
        i0(i2, false);
    }

    public final void i0(int i2, boolean z) {
        V v;
        boolean z2 = true;
        if (i2 == -1) {
            if (!this.f16477g) {
                this.f16477g = true;
            }
            z2 = false;
        } else {
            if (this.f16477g || this.f16476f != i2) {
                this.f16477g = false;
                this.f16476f = Math.max(0, i2);
            }
            z2 = false;
        }
        if (!z2 || this.F == null) {
            return;
        }
        L();
        if (this.y != 4 || (v = this.F.get()) == null) {
            return;
        }
        if (z) {
            p0(this.y);
        } else {
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.F = null;
        this.z = null;
    }

    public void j0(int i2) {
        this.f16472b = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        c.j.a.c cVar;
        if (v.isShown() && this.x) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                Y();
            }
            if (this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            this.I.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.K = (int) motionEvent.getY();
                if (this.y != 2) {
                    WeakReference<View> weakReference = this.G;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.B(view, x, this.K)) {
                        this.J = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.L = true;
                    }
                }
                this.A = this.J == -1 && !coordinatorLayout.B(v, x, this.K);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.L = false;
                this.J = -1;
                if (this.A) {
                    this.A = false;
                    return false;
                }
            }
            if (!this.A && (cVar = this.z) != null && cVar.G(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.G;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.A || this.y == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.z == null || Math.abs(((float) this.K) - motionEvent.getY()) <= ((float) this.z.u())) ? false : true;
        }
        this.A = true;
        return false;
    }

    public void k0(boolean z) {
        this.w = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        g gVar;
        if (u.v(coordinatorLayout) && !u.v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.F == null) {
            this.f16478h = coordinatorLayout.getResources().getDimensionPixelSize(e.e.b.b.d.f17448j);
            n0(coordinatorLayout);
            this.F = new WeakReference<>(v);
            if (this.f16479i && (gVar = this.f16480j) != null) {
                u.m0(v, gVar);
            }
            g gVar2 = this.f16480j;
            if (gVar2 != null) {
                float f2 = this.u;
                if (f2 == -1.0f) {
                    f2 = u.t(v);
                }
                gVar2.W(f2);
                boolean z = this.y == 3;
                this.m = z;
                this.f16480j.Y(z ? 0.0f : 1.0f);
            }
            s0();
            if (u.w(v) == 0) {
                u.t0(v, 1);
            }
        }
        if (this.z == null) {
            this.z = c.j.a.c.m(coordinatorLayout, this.N);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i2);
        this.D = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.E = height;
        this.q = Math.max(0, height - v.getHeight());
        M();
        L();
        int i3 = this.y;
        if (i3 == 3) {
            u.U(v, U());
        } else if (i3 == 6) {
            u.U(v, this.r);
        } else if (this.v && i3 == 5) {
            u.U(v, this.E);
        } else if (i3 == 4) {
            u.U(v, this.t);
        } else if (i3 == 1 || i3 == 2) {
            u.U(v, top - v.getTop());
        }
        this.G = new WeakReference<>(S(v));
        return true;
    }

    public void l0(int i2) {
        if (i2 == this.y) {
            return;
        }
        if (this.F == null) {
            if (i2 == 4 || i2 == 3 || i2 == 6 || (this.v && i2 == 5)) {
                this.y = i2;
                return;
            }
            return;
        }
        p0(i2);
    }

    void m0(int i2) {
        V v;
        if (this.y == i2) {
            return;
        }
        this.y = i2;
        WeakReference<V> weakReference = this.F;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            u0(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            u0(false);
        }
        t0(i2);
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            this.H.get(i3).onStateChanged(v, i2);
        }
        s0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.G;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.y != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    void o0(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.t;
        } else if (i2 == 6) {
            int i5 = this.r;
            if (!this.f16473c || i5 > (i4 = this.q)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = U();
        } else if (this.v && i2 == 5) {
            i3 = this.E;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        }
        r0(view, i2, i3, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.G;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < U()) {
                iArr[1] = top - U();
                u.U(v, -iArr[1]);
                m0(3);
            } else {
                if (!this.x) {
                    return;
                }
                iArr[1] = i3;
                u.U(v, -i3);
                m0(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.t;
            if (i5 > i6 && !this.v) {
                iArr[1] = top - i6;
                u.U(v, -iArr[1]);
                m0(4);
            } else {
                if (!this.x) {
                    return;
                }
                iArr[1] = i3;
                u.U(v, -i3);
                m0(1);
            }
        }
        R(v.getTop());
        this.B = i3;
        this.C = true;
    }

    boolean q0(View view, float f2) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.t)) / ((float) N()) > 0.5f;
    }

    void r0(View view, int i2, int i3, boolean z) {
        boolean H;
        if (z) {
            H = this.z.F(view.getLeft(), i3);
        } else {
            H = this.z.H(view, view.getLeft(), i3);
        }
        if (H) {
            m0(2);
            t0(i2);
            if (this.n == null) {
                this.n = new f(view, i2);
            }
            if (!((f) this.n).f16491g) {
                BottomSheetBehavior<V>.f fVar = this.n;
                fVar.f16492h = i2;
                u.a0(view, fVar);
                ((f) this.n).f16491g = true;
                return;
            }
            this.n.f16492h = i2;
            return;
        }
        m0(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v, savedState.a());
        Z(savedState);
        int i2 = savedState.f16482h;
        if (i2 != 1 && i2 != 2) {
            this.y = i2;
        } else {
            this.y = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        final int f16482h;

        /* renamed from: i, reason: collision with root package name */
        int f16483i;

        /* renamed from: j, reason: collision with root package name */
        boolean f16484j;

        /* renamed from: k, reason: collision with root package name */
        boolean f16485k;
        boolean l;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16482h = parcel.readInt();
            this.f16483i = parcel.readInt();
            this.f16484j = parcel.readInt() == 1;
            this.f16485k = parcel.readInt() == 1;
            this.l = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f16482h);
            parcel.writeInt(this.f16483i);
            parcel.writeInt(this.f16484j ? 1 : 0);
            parcel.writeInt(this.f16485k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f16482h = bottomSheetBehavior.y;
            this.f16483i = ((BottomSheetBehavior) bottomSheetBehavior).f16476f;
            this.f16484j = ((BottomSheetBehavior) bottomSheetBehavior).f16473c;
            this.f16485k = bottomSheetBehavior.v;
            this.l = ((BottomSheetBehavior) bottomSheetBehavior).w;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.f16472b = 0;
        this.f16473c = true;
        this.f16474d = false;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.H = new ArrayList<>();
        this.N = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.R);
        this.f16479i = obtainStyledAttributes.hasValue(l.d0);
        int i3 = l.T;
        boolean hasValue = obtainStyledAttributes.hasValue(i3);
        if (hasValue) {
            P(context, attributeSet, hasValue, e.e.b.b.w.c.a(context, obtainStyledAttributes, i3));
        } else {
            O(context, attributeSet, hasValue);
        }
        Q();
        if (Build.VERSION.SDK_INT >= 21) {
            this.u = obtainStyledAttributes.getDimension(l.S, -1.0f);
        }
        int i4 = l.Z;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            h0(i2);
        } else {
            h0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        g0(obtainStyledAttributes.getBoolean(l.Y, false));
        e0(obtainStyledAttributes.getBoolean(l.c0, false));
        d0(obtainStyledAttributes.getBoolean(l.W, true));
        k0(obtainStyledAttributes.getBoolean(l.b0, false));
        b0(obtainStyledAttributes.getBoolean(l.U, true));
        j0(obtainStyledAttributes.getInt(l.a0, 0));
        f0(obtainStyledAttributes.getFloat(l.X, 0.5f));
        int i5 = l.V;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 != null && peekValue2.type == 16) {
            c0(peekValue2.data);
        } else {
            c0(obtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        }
        obtainStyledAttributes.recycle();
        this.f16475e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
