package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import androidx.core.view.w;
import androidx.core.view.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements t0, u0 {

    /* renamed from: t, reason: collision with root package name */
    static final String f1863t;

    /* renamed from: u, reason: collision with root package name */
    static final Class[] f1864u;

    /* renamed from: v, reason: collision with root package name */
    static final ThreadLocal f1865v;

    /* renamed from: w, reason: collision with root package name */
    static final Comparator f1866w;

    /* renamed from: x, reason: collision with root package name */
    private static final androidx.core.util.e f1867x;

    /* renamed from: a, reason: collision with root package name */
    private final List f1868a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f1869b;

    /* renamed from: c, reason: collision with root package name */
    private final List f1870c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f1871d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f1872e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1873f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1874g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1875h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f1876i;

    /* renamed from: j, reason: collision with root package name */
    private View f1877j;

    /* renamed from: k, reason: collision with root package name */
    private View f1878k;

    /* renamed from: l, reason: collision with root package name */
    private f f1879l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1880m;

    /* renamed from: n, reason: collision with root package name */
    private c3 f1881n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1882o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f1883p;

    /* renamed from: q, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f1884q;

    /* renamed from: r, reason: collision with root package name */
    private w0 f1885r;

    /* renamed from: s, reason: collision with root package name */
    private final v0 f1886s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements w0 {
        a() {
        }

        @Override // androidx.core.view.w0
        public c3 a(View view, c3 c3Var) {
            return CoordinatorLayout.this.X(c3Var);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            if (i7 == 0) {
                return z(coordinatorLayout, view, view2, view3, i6);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            if (i6 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public c3 f(CoordinatorLayout coordinatorLayout, View view, c3 c3Var) {
            return c3Var;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f6, float f7, boolean z5) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f6, float f7) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
            if (i8 == 0) {
                p(coordinatorLayout, view, view2, i6, i7, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9, int i10) {
            if (i10 == 0) {
                r(coordinatorLayout, view, view2, i6, i7, i8, i9);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
            iArr[0] = iArr[0] + i8;
            iArr[1] = iArr[1] + i9;
            s(coordinatorLayout, view, view2, i6, i7, i8, i9, i10);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            if (i7 == 0) {
                u(coordinatorLayout, view, view2, view3, i6);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface c {
        Class value();
    }

    /* loaded from: classes.dex */
    private class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1884q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1884q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        b f1889a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1890b;

        /* renamed from: c, reason: collision with root package name */
        public int f1891c;

        /* renamed from: d, reason: collision with root package name */
        public int f1892d;

        /* renamed from: e, reason: collision with root package name */
        public int f1893e;

        /* renamed from: f, reason: collision with root package name */
        int f1894f;

        /* renamed from: g, reason: collision with root package name */
        public int f1895g;

        /* renamed from: h, reason: collision with root package name */
        public int f1896h;

        /* renamed from: i, reason: collision with root package name */
        int f1897i;

        /* renamed from: j, reason: collision with root package name */
        int f1898j;

        /* renamed from: k, reason: collision with root package name */
        View f1899k;

        /* renamed from: l, reason: collision with root package name */
        View f1900l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f1901m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f1902n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f1903o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f1904p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f1905q;

        /* renamed from: r, reason: collision with root package name */
        Object f1906r;

        public e(int i6, int i7) {
            super(i6, i7);
            this.f1890b = false;
            this.f1891c = 0;
            this.f1892d = 0;
            this.f1893e = -1;
            this.f1894f = -1;
            this.f1895g = 0;
            this.f1896h = 0;
            this.f1905q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1894f);
            this.f1899k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1900l = findViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1894f) + " to anchor view " + view);
            }
            this.f1900l = null;
            this.f1899k = null;
        }

        private boolean r(View view, int i6) {
            int b6 = w.b(((e) view.getLayoutParams()).f1895g, i6);
            return b6 != 0 && (w.b(this.f1896h, i6) & b6) == b6;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1899k.getId() != this.f1894f) {
                return false;
            }
            View view2 = this.f1899k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1900l = null;
                    this.f1899k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1900l = view2;
            return true;
        }

        boolean a() {
            return this.f1899k == null && this.f1894f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b bVar;
            return view2 == this.f1900l || r(view2, b1.E(coordinatorLayout)) || ((bVar = this.f1889a) != null && bVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f1889a == null) {
                this.f1901m = false;
            }
            return this.f1901m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1894f == -1) {
                this.f1900l = null;
                this.f1899k = null;
                return null;
            }
            if (this.f1899k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f1899k;
        }

        public b e() {
            return this.f1889a;
        }

        boolean f() {
            return this.f1904p;
        }

        Rect g() {
            return this.f1905q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z5 = this.f1901m;
            if (z5) {
                return true;
            }
            b bVar = this.f1889a;
            boolean a6 = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z5;
            this.f1901m = a6;
            return a6;
        }

        boolean i(int i6) {
            if (i6 == 0) {
                return this.f1902n;
            }
            if (i6 != 1) {
                return false;
            }
            return this.f1903o;
        }

        void j() {
            this.f1904p = false;
        }

        void k(int i6) {
            q(i6, false);
        }

        void l() {
            this.f1901m = false;
        }

        public void n(b bVar) {
            b bVar2 = this.f1889a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f1889a = bVar;
                this.f1906r = null;
                this.f1890b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        void o(boolean z5) {
            this.f1904p = z5;
        }

        void p(Rect rect) {
            this.f1905q.set(rect);
        }

        void q(int i6, boolean z5) {
            if (i6 == 0) {
                this.f1902n = z5;
            } else {
                if (i6 != 1) {
                    return;
                }
                this.f1903o = z5;
            }
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1890b = false;
            this.f1891c = 0;
            this.f1892d = 0;
            this.f1893e = -1;
            this.f1894f = -1;
            this.f1895g = 0;
            this.f1896h = 0;
            this.f1905q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.c.f9047d);
            this.f1891c = obtainStyledAttributes.getInteger(r.c.f9048e, 0);
            this.f1894f = obtainStyledAttributes.getResourceId(r.c.f9049f, -1);
            this.f1892d = obtainStyledAttributes.getInteger(r.c.f9050g, 0);
            this.f1893e = obtainStyledAttributes.getInteger(r.c.f9054k, -1);
            this.f1895g = obtainStyledAttributes.getInt(r.c.f9053j, 0);
            this.f1896h = obtainStyledAttributes.getInt(r.c.f9052i, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(r.c.f9051h);
            this.f1890b = hasValue;
            if (hasValue) {
                this.f1889a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(r.c.f9051h));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f1889a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1890b = false;
            this.f1891c = 0;
            this.f1892d = 0;
            this.f1893e = -1;
            this.f1894f = -1;
            this.f1895g = 0;
            this.f1896h = 0;
            this.f1905q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1890b = false;
            this.f1891c = 0;
            this.f1892d = 0;
            this.f1893e = -1;
            this.f1894f = -1;
            this.f1895g = 0;
            this.f1896h = 0;
            this.f1905q = new Rect();
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f1890b = false;
            this.f1891c = 0;
            this.f1892d = 0;
            this.f1893e = -1;
            this.f1894f = -1;
            this.f1895g = 0;
            this.f1896h = 0;
            this.f1905q = new Rect();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class g extends x.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        SparseArray f1908c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i6) {
                return new g[i6];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1908c = new SparseArray(readInt);
            for (int i6 = 0; i6 < readInt; i6++) {
                this.f1908c.append(iArr[i6], readParcelableArray[i6]);
            }
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            SparseArray sparseArray = this.f1908c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = this.f1908c.keyAt(i7);
                parcelableArr[i7] = (Parcelable) this.f1908c.valueAt(i7);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i6);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    static class h implements Comparator {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float O = b1.O(view);
            float O2 = b1.O(view2);
            if (O > O2) {
                return -1;
            }
            return O < O2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1863t = r02 != null ? r02.getName() : null;
        f1866w = new h();
        f1864u = new Class[]{Context.class, AttributeSet.class};
        f1865v = new ThreadLocal();
        f1867x = new androidx.core.util.g(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void B(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        Rect a6 = a();
        a6.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.f1881n != null && b1.B(this) && !b1.B(view)) {
            a6.left += this.f1881n.i();
            a6.top += this.f1881n.k();
            a6.right -= this.f1881n.j();
            a6.bottom -= this.f1881n.h();
        }
        Rect a7 = a();
        w.a(T(eVar.f1891c), view.getMeasuredWidth(), view.getMeasuredHeight(), a6, a7, i6);
        view.layout(a7.left, a7.top, a7.right, a7.bottom);
        P(a6);
        P(a7);
    }

    private void C(View view, View view2, int i6) {
        Rect a6 = a();
        Rect a7 = a();
        try {
            s(view2, a6);
            t(view, i6, a6, a7);
            view.layout(a7.left, a7.top, a7.right, a7.bottom);
        } finally {
            P(a6);
            P(a7);
        }
    }

    private void D(View view, int i6, int i7) {
        e eVar = (e) view.getLayoutParams();
        int b6 = w.b(U(eVar.f1891c), i7);
        int i8 = b6 & 7;
        int i9 = b6 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i7 == 1) {
            i6 = width - i6;
        }
        int v5 = v(i6) - measuredWidth;
        if (i8 == 1) {
            v5 += measuredWidth / 2;
        } else if (i8 == 5) {
            v5 += measuredWidth;
        }
        int i10 = 0;
        if (i9 == 16) {
            i10 = 0 + (measuredHeight / 2);
        } else if (i9 == 80) {
            i10 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(v5, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private MotionEvent E(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void F(View view, Rect rect, int i6) {
        boolean z5;
        boolean z6;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        if (b1.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b e6 = eVar.e();
            Rect a6 = a();
            Rect a7 = a();
            a7.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e6 == null || !e6.b(this, view, a6)) {
                a6.set(a7);
            } else if (!a7.contains(a6)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a6.toShortString() + " | Bounds:" + a7.toShortString());
            }
            P(a7);
            if (a6.isEmpty()) {
                P(a6);
                return;
            }
            int b6 = w.b(eVar.f1896h, i6);
            boolean z7 = true;
            if ((b6 & 48) != 48 || (i11 = (a6.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.f1898j) >= (i12 = rect.top)) {
                z5 = false;
            } else {
                W(view, i12 - i11);
                z5 = true;
            }
            if ((b6 & 80) == 80 && (height = ((getHeight() - a6.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.f1898j) < (i10 = rect.bottom)) {
                W(view, height - i10);
                z5 = true;
            }
            if (!z5) {
                W(view, 0);
            }
            if ((b6 & 3) != 3 || (i8 = (a6.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.f1897i) >= (i9 = rect.left)) {
                z6 = false;
            } else {
                V(view, i9 - i8);
                z6 = true;
            }
            if ((b6 & 5) != 5 || (width = ((getWidth() - a6.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.f1897i) >= (i7 = rect.right)) {
                z7 = z6;
            } else {
                V(view, width - i7);
            }
            if (!z7) {
                V(view, 0);
            }
            P(a6);
        }
    }

    static b K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1863t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f1865v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1864u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e6) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e6);
        }
    }

    private boolean L(b bVar, View view, MotionEvent motionEvent, int i6) {
        if (i6 == 0) {
            return bVar.k(this, view, motionEvent);
        }
        if (i6 == 1) {
            return bVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean M(MotionEvent motionEvent, int i6) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f1870c;
        y(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z5 = false;
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) list.get(i7);
            e eVar = (e) view.getLayoutParams();
            b e6 = eVar.e();
            if (!(z5 || z6) || actionMasked == 0) {
                if (!z6 && !z5 && e6 != null && (z5 = L(e6, view, motionEvent, i6))) {
                    this.f1877j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i8 = 0; i8 < i7; i8++) {
                            View view2 = (View) list.get(i8);
                            b e7 = ((e) view2.getLayoutParams()).e();
                            if (e7 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = E(motionEvent);
                                }
                                L(e7, view2, motionEvent2, i6);
                            }
                        }
                    }
                }
                boolean c6 = eVar.c();
                boolean h6 = eVar.h(this, view);
                z6 = h6 && !c6;
                if (h6 && !z6) {
                    break;
                }
            } else if (e6 != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = E(motionEvent);
                }
                L(e6, view, motionEvent2, i6);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z5;
    }

    private void N() {
        this.f1868a.clear();
        this.f1869b.c();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e x5 = x(childAt);
            x5.d(this, childAt);
            this.f1869b.b(childAt);
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i6) {
                    View childAt2 = getChildAt(i7);
                    if (x5.b(this, childAt, childAt2)) {
                        if (!this.f1869b.d(childAt2)) {
                            this.f1869b.b(childAt2);
                        }
                        this.f1869b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1868a.addAll(this.f1869b.h());
        Collections.reverse(this.f1868a);
    }

    private static void P(Rect rect) {
        rect.setEmpty();
        f1867x.a(rect);
    }

    private void R() {
        View view = this.f1877j;
        if (view != null) {
            b e6 = ((e) view.getLayoutParams()).e();
            if (e6 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                e6.D(this, this.f1877j, obtain);
                obtain.recycle();
            }
            this.f1877j = null;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((e) getChildAt(i6).getLayoutParams()).l();
        }
        this.f1874g = false;
    }

    private static int S(int i6) {
        if (i6 == 0) {
            return 17;
        }
        return i6;
    }

    private static int T(int i6) {
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        return (i6 & 112) == 0 ? i6 | 48 : i6;
    }

    private static int U(int i6) {
        if (i6 == 0) {
            return 8388661;
        }
        return i6;
    }

    private void V(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.f1897i;
        if (i7 != i6) {
            b1.a0(view, i6 - i7);
            eVar.f1897i = i6;
        }
    }

    private void W(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.f1898j;
        if (i7 != i6) {
            b1.b0(view, i6 - i7);
            eVar.f1898j = i6;
        }
    }

    private void Y() {
        if (!b1.B(this)) {
            b1.D0(this, null);
            return;
        }
        if (this.f1885r == null) {
            this.f1885r = new a();
        }
        b1.D0(this, this.f1885r);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f1867x.b();
        return rect == null ? new Rect() : rect;
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b e6 = ((e) childAt.getLayoutParams()).e();
            if (e6 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                e6.k(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int d(int i6, int i7, int i8) {
        return i6 < i7 ? i7 : i6 > i8 ? i8 : i6;
    }

    private void e(e eVar, Rect rect, int i6, int i7) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i7) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i6 + max, i7 + max2);
    }

    private c3 f(c3 c3Var) {
        b e6;
        if (c3Var.n()) {
            return c3Var;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (b1.B(childAt) && (e6 = ((e) childAt.getLayoutParams()).e()) != null) {
                c3Var = e6.f(this, childAt, c3Var);
                if (c3Var.n()) {
                    break;
                }
            }
        }
        return c3Var;
    }

    private void u(int i6, Rect rect, Rect rect2, e eVar, int i7, int i8) {
        int b6 = w.b(S(eVar.f1891c), i6);
        int b7 = w.b(T(eVar.f1892d), i6);
        int i9 = b6 & 7;
        int i10 = b6 & 112;
        int i11 = b7 & 7;
        int i12 = b7 & 112;
        int width = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            width -= i7 / 2;
        } else if (i9 != 5) {
            width -= i7;
        }
        if (i10 == 16) {
            height -= i8 / 2;
        } else if (i10 != 80) {
            height -= i8;
        }
        rect2.set(width, height, i7 + width, i8 + height);
    }

    private int v(int i6) {
        StringBuilder sb;
        int[] iArr = this.f1876i;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i6);
        } else {
            if (i6 >= 0 && i6 < iArr.length) {
                return iArr[i6];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i6);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    private void y(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i6) : i6));
        }
        Comparator comparator = f1866w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean z(View view) {
        return this.f1869b.i(view);
    }

    public boolean A(View view, int i6, int i7) {
        Rect a6 = a();
        s(view, a6);
        try {
            return a6.contains(i6, i7);
        } finally {
            P(a6);
        }
    }

    void G(View view, int i6) {
        b e6;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f1899k != null) {
            Rect a6 = a();
            Rect a7 = a();
            Rect a8 = a();
            s(eVar.f1899k, a6);
            q(view, false, a7);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(i6, a6, a8, eVar, measuredWidth, measuredHeight);
            boolean z5 = (a8.left == a7.left && a8.top == a7.top) ? false : true;
            e(eVar, a8, measuredWidth, measuredHeight);
            int i7 = a8.left - a7.left;
            int i8 = a8.top - a7.top;
            if (i7 != 0) {
                b1.a0(view, i7);
            }
            if (i8 != 0) {
                b1.b0(view, i8);
            }
            if (z5 && (e6 = eVar.e()) != null) {
                e6.h(this, view, eVar.f1899k);
            }
            P(a6);
            P(a7);
            P(a8);
        }
    }

    final void H(int i6) {
        boolean z5;
        int E = b1.E(this);
        int size = this.f1868a.size();
        Rect a6 = a();
        Rect a7 = a();
        Rect a8 = a();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) this.f1868a.get(i7);
            e eVar = (e) view.getLayoutParams();
            if (i6 != 0 || view.getVisibility() != 8) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (eVar.f1900l == ((View) this.f1868a.get(i8))) {
                        G(view, E);
                    }
                }
                q(view, true, a7);
                if (eVar.f1895g != 0 && !a7.isEmpty()) {
                    int b6 = w.b(eVar.f1895g, E);
                    int i9 = b6 & 112;
                    if (i9 == 48) {
                        a6.top = Math.max(a6.top, a7.bottom);
                    } else if (i9 == 80) {
                        a6.bottom = Math.max(a6.bottom, getHeight() - a7.top);
                    }
                    int i10 = b6 & 7;
                    if (i10 == 3) {
                        a6.left = Math.max(a6.left, a7.right);
                    } else if (i10 == 5) {
                        a6.right = Math.max(a6.right, getWidth() - a7.left);
                    }
                }
                if (eVar.f1896h != 0 && view.getVisibility() == 0) {
                    F(view, a6, E);
                }
                if (i6 != 2) {
                    w(view, a8);
                    if (!a8.equals(a7)) {
                        O(view, a7);
                    }
                }
                for (int i11 = i7 + 1; i11 < size; i11++) {
                    View view2 = (View) this.f1868a.get(i11);
                    e eVar2 = (e) view2.getLayoutParams();
                    b e6 = eVar2.e();
                    if (e6 != null && e6.e(this, view2, view)) {
                        if (i6 == 0 && eVar2.f()) {
                            eVar2.j();
                        } else {
                            if (i6 != 2) {
                                z5 = e6.h(this, view2, view);
                            } else {
                                e6.i(this, view2, view);
                                z5 = true;
                            }
                            if (i6 == 1) {
                                eVar2.o(z5);
                            }
                        }
                    }
                }
            }
        }
        P(a6);
        P(a7);
        P(a8);
    }

    public void I(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f1899k;
        if (view2 != null) {
            C(view, view2, i6);
            return;
        }
        int i7 = eVar.f1893e;
        if (i7 >= 0) {
            D(view, i7, i6);
        } else {
            B(view, i6);
        }
    }

    public void J(View view, int i6, int i7, int i8, int i9) {
        measureChildWithMargins(view, i6, i7, i8, i9);
    }

    void O(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    void Q() {
        if (this.f1875h && this.f1879l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1879l);
        }
        this.f1880m = false;
    }

    final c3 X(c3 c3Var) {
        if (androidx.core.util.c.a(this.f1881n, c3Var)) {
            return c3Var;
        }
        this.f1881n = c3Var;
        boolean z5 = c3Var != null && c3Var.k() > 0;
        this.f1882o = z5;
        setWillNotDraw(!z5 && getBackground() == null);
        c3 f6 = f(c3Var);
        requestLayout();
        return f6;
    }

    void b() {
        if (this.f1875h) {
            if (this.f1879l == null) {
                this.f1879l = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1879l);
        }
        this.f1880m = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j6) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f1889a;
        if (bVar != null) {
            float d6 = bVar.d(this, view);
            if (d6 > 0.0f) {
                if (this.f1871d == null) {
                    this.f1871d = new Paint();
                }
                this.f1871d.setColor(eVar.f1889a.c(this, view));
                this.f1871d.setAlpha(d(Math.round(d6 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1871d);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1883p;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            if (z(getChildAt(i6))) {
                z5 = true;
                break;
            }
            i6++;
        }
        if (z5 != this.f1880m) {
            if (z5) {
                b();
            } else {
                Q();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.f1868a);
    }

    public final c3 getLastWindowInsets() {
        return this.f1881n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1886s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1883p;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.t0
    public void h(View view, View view2, int i6, int i7) {
        b e6;
        this.f1886s.c(view, view2, i6, i7);
        this.f1878k = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i7) && (e6 = eVar.e()) != null) {
                e6.v(this, childAt, view, view2, i6, i7);
            }
        }
    }

    @Override // androidx.core.view.t0
    public void i(View view, int i6) {
        this.f1886s.d(view, i6);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i6)) {
                b e6 = eVar.e();
                if (e6 != null) {
                    e6.C(this, childAt, view, i6);
                }
                eVar.k(i6);
                eVar.j();
            }
        }
        this.f1878k = null;
    }

    @Override // androidx.core.view.t0
    public void j(View view, int i6, int i7, int[] iArr, int i8) {
        b e6;
        int childCount = getChildCount();
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i8) && (e6 = eVar.e()) != null) {
                    int[] iArr2 = this.f1872e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e6.q(this, childAt, view, i6, i7, iArr2, i8);
                    int[] iArr3 = this.f1872e;
                    i9 = i6 > 0 ? Math.max(i9, iArr3[0]) : Math.min(i9, iArr3[0]);
                    int[] iArr4 = this.f1872e;
                    i10 = i7 > 0 ? Math.max(i10, iArr4[1]) : Math.min(i10, iArr4[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
        if (z5) {
            H(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // androidx.core.view.u0
    public void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        b e6;
        int childCount = getChildCount();
        boolean z5 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i10) && (e6 = eVar.e()) != null) {
                    int[] iArr2 = this.f1872e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e6.t(this, childAt, view, i6, i7, i8, i9, i10, iArr2);
                    int[] iArr3 = this.f1872e;
                    i11 = i8 > 0 ? Math.max(i11, iArr3[0]) : Math.min(i11, iArr3[0]);
                    i12 = i9 > 0 ? Math.max(i12, this.f1872e[1]) : Math.min(i12, this.f1872e[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (z5) {
            H(1);
        }
    }

    @Override // androidx.core.view.t0
    public void n(View view, int i6, int i7, int i8, int i9, int i10) {
        m(view, i6, i7, i8, i9, 0, this.f1873f);
    }

    @Override // androidx.core.view.t0
    public boolean o(View view, View view2, int i6, int i7) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b e6 = eVar.e();
                if (e6 != null) {
                    boolean A = e6.A(this, childAt, view, view2, i6, i7);
                    z5 |= A;
                    eVar.q(i7, A);
                } else {
                    eVar.q(i7, false);
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
        if (this.f1880m) {
            if (this.f1879l == null) {
                this.f1879l = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1879l);
        }
        if (this.f1881n == null && b1.B(this)) {
            b1.n0(this);
        }
        this.f1875h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R();
        if (this.f1880m && this.f1879l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1879l);
        }
        View view = this.f1878k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1875h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1882o || this.f1883p == null) {
            return;
        }
        c3 c3Var = this.f1881n;
        int k6 = c3Var != null ? c3Var.k() : 0;
        if (k6 > 0) {
            this.f1883p.setBounds(0, 0, getWidth(), k6);
            this.f1883p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
        }
        boolean M = M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1877j = null;
            R();
        }
        return M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        b e6;
        int E = b1.E(this);
        int size = this.f1868a.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) this.f1868a.get(i10);
            if (view.getVisibility() != 8 && ((e6 = ((e) view.getLayoutParams()).e()) == null || !e6.l(this, view, E))) {
                I(view, E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        b e6;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e6 = eVar.e()) != null) {
                    z6 |= e6.n(this, childAt, view, f6, f7, z5);
                }
            }
        }
        if (z6) {
            H(1);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        b e6;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e6 = eVar.e()) != null) {
                    z5 |= e6.o(this, childAt, view, f6, f7);
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        j(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        n(view, i6, i7, i8, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        h(view, view2, i6, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.f1908c;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            b e6 = x(childAt).e();
            if (id != -1 && e6 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e6.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y5;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            b e6 = ((e) childAt.getLayoutParams()).e();
            if (id != -1 && e6 != null && (y5 = e6.y(this, childAt)) != null) {
                sparseArray.append(id, y5);
            }
        }
        gVar.f1908c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        return o(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean M;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f1877j;
        boolean z5 = false;
        if (view != null) {
            b e6 = ((e) view.getLayoutParams()).e();
            M = e6 != null ? e6.D(this, this.f1877j, motionEvent) : false;
        } else {
            M = M(motionEvent, 1);
            if (actionMasked != 0 && M) {
                z5 = true;
            }
        }
        if (this.f1877j == null || actionMasked == 3) {
            M |= super.onTouchEvent(motionEvent);
        } else if (z5) {
            MotionEvent E = E(motionEvent);
            super.onTouchEvent(E);
            E.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1877j = null;
            R();
        }
        return M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    void q(View view, boolean z5, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            s(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List g6 = this.f1869b.g(view);
        return g6 == null ? Collections.emptyList() : g6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        b e6 = ((e) view.getLayoutParams()).e();
        if (e6 == null || !e6.w(this, view, rect, z5)) {
            return super.requestChildRectangleOnScreen(view, rect, z5);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f1874g) {
            return;
        }
        if (this.f1877j == null) {
            c();
        }
        R();
        this.f1874g = true;
    }

    void s(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        Y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1884q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1883p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1883p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1883p.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f1883p, b1.E(this));
                this.f1883p.setVisible(getVisibility() == 0, false);
                this.f1883p.setCallback(this);
            }
            b1.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        setStatusBarBackground(i6 != 0 ? androidx.core.content.a.e(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f1883p;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.f1883p.setVisible(z5, false);
    }

    void t(View view, int i6, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        u(i6, rect, rect2, eVar, measuredWidth, measuredHeight);
        e(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1883p;
    }

    void w(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    e x(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1890b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            eVar.f1890b = true;
        }
        return eVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.f9042a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1868a = new ArrayList();
        this.f1869b = new androidx.coordinatorlayout.widget.a();
        this.f1870c = new ArrayList();
        this.f1872e = new int[2];
        this.f1873f = new int[2];
        this.f1886s = new v0(this);
        int[] iArr = r.c.f9044a;
        TypedArray obtainStyledAttributes = i6 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, r.b.f9043a) : context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        int[] iArr2 = r.c.f9044a;
        if (i6 == 0) {
            b1.o0(this, context, iArr2, attributeSet, obtainStyledAttributes, 0, r.b.f9043a);
        } else {
            b1.o0(this, context, iArr2, attributeSet, obtainStyledAttributes, i6, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(r.c.f9045b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1876i = resources.getIntArray(resourceId);
            float f6 = resources.getDisplayMetrics().density;
            int length = this.f1876i.length;
            for (int i7 = 0; i7 < length; i7++) {
                this.f1876i[i7] = (int) (r12[i7] * f6);
            }
        }
        this.f1883p = obtainStyledAttributes.getDrawable(r.c.f9046c);
        obtainStyledAttributes.recycle();
        Y();
        super.setOnHierarchyChangeListener(new d());
        if (b1.C(this) == 0) {
            b1.A0(this, 1);
        }
    }
}
