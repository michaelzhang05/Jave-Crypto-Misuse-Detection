package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.f0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.j0;
import androidx.core.view.b1;
import c3.g;
import c3.k;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m2.h;
import m2.i;
import m2.j;
import y.c;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: w, reason: collision with root package name */
    private static final int f5132w = h.f7683w;

    /* renamed from: x, reason: collision with root package name */
    private static final int f5133x = i.f7690g;

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.b f5134a;

    /* renamed from: b, reason: collision with root package name */
    private float f5135b;

    /* renamed from: c, reason: collision with root package name */
    private g f5136c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f5137d;

    /* renamed from: e, reason: collision with root package name */
    private k f5138e;

    /* renamed from: f, reason: collision with root package name */
    private final c f5139f;

    /* renamed from: g, reason: collision with root package name */
    private float f5140g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5141h;

    /* renamed from: i, reason: collision with root package name */
    private int f5142i;

    /* renamed from: j, reason: collision with root package name */
    private int f5143j;

    /* renamed from: k, reason: collision with root package name */
    private y.c f5144k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5145l;

    /* renamed from: m, reason: collision with root package name */
    private float f5146m;

    /* renamed from: n, reason: collision with root package name */
    private int f5147n;

    /* renamed from: o, reason: collision with root package name */
    private int f5148o;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference f5149p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference f5150q;

    /* renamed from: r, reason: collision with root package name */
    private int f5151r;

    /* renamed from: s, reason: collision with root package name */
    private VelocityTracker f5152s;

    /* renamed from: t, reason: collision with root package name */
    private int f5153t;

    /* renamed from: u, reason: collision with root package name */
    private final Set f5154u;

    /* renamed from: v, reason: collision with root package name */
    private final c.AbstractC0151c f5155v;

    /* loaded from: classes.dex */
    class a extends c.AbstractC0151c {
        a() {
        }

        @Override // y.c.AbstractC0151c
        public int a(View view, int i6, int i7) {
            return u.a.b(i6, SideSheetBehavior.this.Z(), SideSheetBehavior.this.f5148o);
        }

        @Override // y.c.AbstractC0151c
        public int b(View view, int i6, int i7) {
            return view.getTop();
        }

        @Override // y.c.AbstractC0151c
        public int d(View view) {
            return SideSheetBehavior.this.f5148o;
        }

        @Override // y.c.AbstractC0151c
        public void j(int i6) {
            if (i6 == 1 && SideSheetBehavior.this.f5141h) {
                SideSheetBehavior.this.s0(1);
            }
        }

        @Override // y.c.AbstractC0151c
        public void k(View view, int i6, int i7, int i8, int i9) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View X = SideSheetBehavior.this.X();
            if (X != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) X.getLayoutParams()) != null) {
                SideSheetBehavior.this.f5134a.h(marginLayoutParams, view.getLeft(), view.getRight());
                X.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.T(view, i6);
        }

        @Override // y.c.AbstractC0151c
        public void l(View view, float f6, float f7) {
            int b6 = SideSheetBehavior.this.f5134a.b(view, f6, f7);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.w0(view, b6, sideSheetBehavior.v0());
        }

        @Override // y.c.AbstractC0151c
        public boolean m(View view, int i6) {
            return (SideSheetBehavior.this.f5142i == 1 || SideSheetBehavior.this.f5149p == null || SideSheetBehavior.this.f5149p.get() != view) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b extends x.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f5157c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i6) {
                return new b[i6];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5157c = parcel.readInt();
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f5157c);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f5157c = sideSheetBehavior.f5142i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        private int f5158a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5159b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f5160c = new Runnable() { // from class: com.google.android.material.sidesheet.d
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.this.c();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f5159b = false;
            if (SideSheetBehavior.this.f5144k != null && SideSheetBehavior.this.f5144k.k(true)) {
                b(this.f5158a);
            } else if (SideSheetBehavior.this.f5142i == 2) {
                SideSheetBehavior.this.s0(this.f5158a);
            }
        }

        void b(int i6) {
            if (SideSheetBehavior.this.f5149p == null || SideSheetBehavior.this.f5149p.get() == null) {
                return;
            }
            this.f5158a = i6;
            if (this.f5159b) {
                return;
            }
            b1.i0((View) SideSheetBehavior.this.f5149p.get(), this.f5160c);
            this.f5159b = true;
        }
    }

    public SideSheetBehavior() {
        this.f5139f = new c();
        this.f5141h = true;
        this.f5142i = 5;
        this.f5143j = 5;
        this.f5146m = 0.1f;
        this.f5151r = -1;
        this.f5154u = new LinkedHashSet();
        this.f5155v = new a();
    }

    private int O(int i6, View view) {
        int i7 = this.f5142i;
        if (i7 == 1 || i7 == 2) {
            return i6 - this.f5134a.e(view);
        }
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 5) {
            return this.f5134a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f5142i);
    }

    private float P(float f6, float f7) {
        return Math.abs(f6 - f7);
    }

    private void Q() {
        WeakReference weakReference = this.f5150q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5150q = null;
    }

    private j0 R(final int i6) {
        return new j0() { // from class: d3.a
            @Override // androidx.core.view.accessibility.j0
            public final boolean a(View view, j0.a aVar) {
                boolean i02;
                i02 = SideSheetBehavior.this.i0(i6, view, aVar);
                return i02;
            }
        };
    }

    private void S(Context context) {
        if (this.f5138e == null) {
            return;
        }
        g gVar = new g(this.f5138e);
        this.f5136c = gVar;
        gVar.H(context);
        ColorStateList colorStateList = this.f5137d;
        if (colorStateList != null) {
            this.f5136c.R(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f5136c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(View view, int i6) {
        if (this.f5154u.isEmpty()) {
            return;
        }
        this.f5134a.a(i6);
        Iterator it = this.f5154u.iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
    }

    private void U(View view) {
        if (b1.r(view) == null) {
            b1.t0(view, view.getResources().getString(f5132w));
        }
    }

    private int V(int i6, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    private int Y() {
        return 0;
    }

    private boolean g0(MotionEvent motionEvent) {
        return t0() && P((float) this.f5153t, motionEvent.getX()) > ((float) this.f5144k.u());
    }

    private boolean h0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && b1.T(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i0(int i6, View view, j0.a aVar) {
        r0(i6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(int i6) {
        View view = (View) this.f5149p.get();
        if (view != null) {
            w0(view, i6, false);
        }
    }

    private void k0(CoordinatorLayout coordinatorLayout) {
        int i6;
        View findViewById;
        if (this.f5150q != null || (i6 = this.f5151r) == -1 || (findViewById = coordinatorLayout.findViewById(i6)) == null) {
            return;
        }
        this.f5150q = new WeakReference(findViewById);
    }

    private void l0(View view, g0.a aVar, int i6) {
        b1.m0(view, aVar, null, R(i6));
    }

    private void m0() {
        VelocityTracker velocityTracker = this.f5152s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5152s = null;
        }
    }

    private void n0(View view, Runnable runnable) {
        if (h0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void q0(int i6) {
        com.google.android.material.sidesheet.b bVar = this.f5134a;
        if (bVar == null || bVar.f() != i6) {
            if (i6 == 0) {
                this.f5134a = new com.google.android.material.sidesheet.a(this);
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0");
        }
    }

    private boolean t0() {
        return this.f5144k != null && (this.f5141h || this.f5142i == 1);
    }

    private boolean u0(View view) {
        return (view.isShown() || b1.r(view) != null) && this.f5141h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(View view, int i6, boolean z5) {
        if (!this.f5134a.g(view, i6, z5)) {
            s0(i6);
        } else {
            s0(2);
            this.f5139f.b(i6);
        }
    }

    private void x0() {
        View view;
        WeakReference weakReference = this.f5149p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        b1.k0(view, 262144);
        b1.k0(view, 1048576);
        if (this.f5142i != 5) {
            l0(view, g0.a.f2300y, 5);
        }
        if (this.f5142i != 3) {
            l0(view, g0.a.f2298w, 3);
        }
    }

    private void y0(View view) {
        int i6 = this.f5142i == 5 ? 4 : 0;
        if (view.getVisibility() != i6) {
            view.setVisibility(i6);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5142i == 1 && actionMasked == 0) {
            return true;
        }
        if (t0()) {
            this.f5144k.z(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.f5152s == null) {
            this.f5152s = VelocityTracker.obtain();
        }
        this.f5152s.addMovement(motionEvent);
        if (t0() && actionMasked == 2 && !this.f5145l && g0(motionEvent)) {
            this.f5144k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5145l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int W() {
        return this.f5147n;
    }

    public View X() {
        WeakReference weakReference = this.f5150q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int Z() {
        return this.f5134a.c();
    }

    public float a0() {
        return this.f5146m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b0() {
        return 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c0(int i6) {
        if (i6 == 3) {
            return Z();
        }
        if (i6 == 5) {
            return this.f5134a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outward edge offset: " + i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d0() {
        return this.f5148o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e0() {
        return 500;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y.c f0() {
        return this.f5144k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f5149p = null;
        this.f5144k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f5149p = null;
        this.f5144k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        y.c cVar;
        if (!u0(view)) {
            this.f5145l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.f5152s == null) {
            this.f5152s = VelocityTracker.obtain();
        }
        this.f5152s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f5153t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f5145l) {
            this.f5145l = false;
            return false;
        }
        return (this.f5145l || (cVar = this.f5144k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
        if (b1.B(coordinatorLayout) && !b1.B(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5149p == null) {
            this.f5149p = new WeakReference(view);
            g gVar = this.f5136c;
            if (gVar != null) {
                b1.u0(view, gVar);
                g gVar2 = this.f5136c;
                float f6 = this.f5140g;
                if (f6 == -1.0f) {
                    f6 = b1.y(view);
                }
                gVar2.Q(f6);
            } else {
                ColorStateList colorStateList = this.f5137d;
                if (colorStateList != null) {
                    b1.v0(view, colorStateList);
                }
            }
            y0(view);
            x0();
            if (b1.C(view) == 0) {
                b1.A0(view, 1);
            }
            U(view);
        }
        if (this.f5144k == null) {
            this.f5144k = y.c.m(coordinatorLayout, this.f5155v);
        }
        int e6 = this.f5134a.e(view);
        coordinatorLayout.I(view, i6);
        this.f5148o = coordinatorLayout.getWidth();
        this.f5147n = view.getWidth();
        b1.a0(view, O(e6, view));
        k0(coordinatorLayout);
        Iterator it = this.f5154u.iterator();
        while (it.hasNext()) {
            f0.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(V(i6, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, -1, marginLayoutParams.width), V(i8, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, -1, marginLayoutParams.height));
        return true;
    }

    public void o0(int i6) {
        this.f5151r = i6;
        Q();
        WeakReference weakReference = this.f5149p;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i6 == -1 || !b1.U(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void p0(boolean z5) {
        this.f5141h = z5;
    }

    public void r0(final int i6) {
        if (i6 == 1 || i6 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i6 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f5149p;
        if (weakReference == null || weakReference.get() == null) {
            s0(i6);
        } else {
            n0((View) this.f5149p.get(), new Runnable() { // from class: d3.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.this.j0(i6);
                }
            });
        }
    }

    void s0(int i6) {
        View view;
        if (this.f5142i == i6) {
            return;
        }
        this.f5142i = i6;
        if (i6 == 3 || i6 == 5) {
            this.f5143j = i6;
        }
        WeakReference weakReference = this.f5149p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        y0(view);
        Iterator it = this.f5154u.iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
        x0();
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i6 = bVar.f5157c;
        if (i6 == 1 || i6 == 2) {
            i6 = 5;
        }
        this.f5142i = i6;
        this.f5143j = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5139f = new c();
        this.f5141h = true;
        this.f5142i = 5;
        this.f5143j = 5;
        this.f5146m = 0.1f;
        this.f5151r = -1;
        this.f5154u = new LinkedHashSet();
        this.f5155v = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7817q4);
        if (obtainStyledAttributes.hasValue(j.f7830s4)) {
            this.f5137d = z2.c.a(context, obtainStyledAttributes, j.f7830s4);
        }
        if (obtainStyledAttributes.hasValue(j.f7848v4)) {
            this.f5138e = k.e(context, attributeSet, 0, f5133x).m();
        }
        if (obtainStyledAttributes.hasValue(j.f7842u4)) {
            o0(obtainStyledAttributes.getResourceId(j.f7842u4, -1));
        }
        S(context);
        this.f5140g = obtainStyledAttributes.getDimension(j.f7824r4, -1.0f);
        p0(obtainStyledAttributes.getBoolean(j.f7836t4, true));
        obtainStyledAttributes.recycle();
        q0(Y());
        this.f5135b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
