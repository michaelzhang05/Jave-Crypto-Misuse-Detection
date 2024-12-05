package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.i0;
import androidx.core.view.b1;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements u0 {
    private static final float B = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a C = new a();
    private static final int[] D = {R.attr.fillViewport};
    private c A;

    /* renamed from: a, reason: collision with root package name */
    private final float f2417a;

    /* renamed from: b, reason: collision with root package name */
    private long f2418b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f2419c;

    /* renamed from: d, reason: collision with root package name */
    private OverScroller f2420d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f2421e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f2422f;

    /* renamed from: g, reason: collision with root package name */
    private int f2423g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2424h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2425i;

    /* renamed from: j, reason: collision with root package name */
    private View f2426j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2427k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f2428l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2429m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2430n;

    /* renamed from: o, reason: collision with root package name */
    private int f2431o;

    /* renamed from: p, reason: collision with root package name */
    private int f2432p;

    /* renamed from: q, reason: collision with root package name */
    private int f2433q;

    /* renamed from: r, reason: collision with root package name */
    private int f2434r;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f2435s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f2436t;

    /* renamed from: u, reason: collision with root package name */
    private int f2437u;

    /* renamed from: v, reason: collision with root package name */
    private int f2438v;

    /* renamed from: w, reason: collision with root package name */
    private d f2439w;

    /* renamed from: x, reason: collision with root package name */
    private final v0 f2440x;

    /* renamed from: y, reason: collision with root package name */
    private final s0 f2441y;

    /* renamed from: z, reason: collision with root package name */
    private float f2442z;

    /* loaded from: classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            i0.a(accessibilityEvent, nestedScrollView.getScrollX());
            i0.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.g0 g0Var) {
            int scrollRange;
            super.g(view, g0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            g0Var.X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            g0Var.q0(true);
            if (nestedScrollView.getScrollY() > 0) {
                g0Var.b(g0.a.f2293r);
                g0Var.b(g0.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                g0Var.b(g0.a.f2292q);
                g0Var.b(g0.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i6, Bundle bundle) {
            if (super.j(view, i6, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i6 != 4096) {
                if (i6 == 8192 || i6 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                }
                if (i6 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i6, int i7, int i8, int i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2443a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i6) {
                return new d[i6];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f2443a = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2443a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f2443a);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.f9132c);
    }

    private void A() {
        this.f2420d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2431o = viewConfiguration.getScaledTouchSlop();
        this.f2432p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2433q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2428l == null) {
            this.f2428l = VelocityTracker.obtain();
        }
    }

    private void C(int i6, int i7) {
        this.f2423g = i6;
        this.f2434r = i7;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i6, int i7) {
        view.getDrawingRect(this.f2419c);
        offsetDescendantRectToMyCoords(view, this.f2419c);
        return this.f2419c.bottom + i6 >= getScrollY() && this.f2419c.top - i6 <= getScrollY() + i7;
    }

    private void G(int i6, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2441y.e(0, scrollY2, 0, i6 - scrollY2, null, i7, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2434r) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f2423g = (int) motionEvent.getY(i6);
            this.f2434r = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.f2428l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f2428l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2428l = null;
        }
    }

    private int L(int i6, float f6) {
        float d6;
        EdgeEffect edgeEffect;
        float width = f6 / getWidth();
        float height = i6 / getHeight();
        float f7 = 0.0f;
        if (e.b(this.f2421e) != 0.0f) {
            d6 = -e.d(this.f2421e, -height, width);
            if (e.b(this.f2421e) == 0.0f) {
                edgeEffect = this.f2421e;
                edgeEffect.onRelease();
            }
            f7 = d6;
        } else if (e.b(this.f2422f) != 0.0f) {
            d6 = e.d(this.f2422f, height, 1.0f - width);
            if (e.b(this.f2422f) == 0.0f) {
                edgeEffect = this.f2422f;
                edgeEffect.onRelease();
            }
            f7 = d6;
        }
        int round = Math.round(f7 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    private void M(boolean z5) {
        if (z5) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f2438v = getScrollY();
        b1.h0(this);
    }

    private boolean N(int i6, int i7, int i8) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        boolean z5 = false;
        boolean z6 = i6 == 33;
        View t5 = t(z6, i7, i8);
        if (t5 == null) {
            t5 = this;
        }
        if (i7 < scrollY || i8 > i9) {
            O(z6 ? i7 - scrollY : i8 - i9, 0, 1, true);
            z5 = true;
        }
        if (t5 != findFocus()) {
            t5.requestFocus(i6);
        }
        return z5;
    }

    private int O(int i6, int i7, int i8, boolean z5) {
        int i9;
        int i10;
        EdgeEffect edgeEffect;
        if (i8 == 1) {
            W(2, i8);
        }
        boolean z6 = false;
        if (k(0, i6, this.f2436t, this.f2435s, i8)) {
            i9 = i6 - this.f2436t[1];
            i10 = this.f2435s[1] + 0;
        } else {
            i9 = i6;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z7 = c() && !z5;
        boolean z8 = I(0, i9, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i8);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f2436t;
        iArr[1] = 0;
        l(0, scrollY2, 0, i9 - scrollY2, this.f2435s, i8, iArr);
        int i11 = i10 + this.f2435s[1];
        int i12 = i9 - this.f2436t[1];
        int i13 = scrollY + i12;
        if (i13 < 0) {
            if (z7) {
                e.d(this.f2421e, (-i12) / getHeight(), i7 / getWidth());
                if (!this.f2422f.isFinished()) {
                    edgeEffect = this.f2422f;
                    edgeEffect.onRelease();
                }
            }
        } else if (i13 > scrollRange && z7) {
            e.d(this.f2422f, i12 / getHeight(), 1.0f - (i7 / getWidth()));
            if (!this.f2421e.isFinished()) {
                edgeEffect = this.f2421e;
                edgeEffect.onRelease();
            }
        }
        if (this.f2421e.isFinished() && this.f2422f.isFinished()) {
            z6 = z8;
        } else {
            b1.h0(this);
        }
        if (z6 && i8 == 0) {
            this.f2428l.clear();
        }
        if (i8 == 1) {
            Y(i8);
            this.f2421e.onRelease();
            this.f2422f.onRelease();
        }
        return i11;
    }

    private void P(View view) {
        view.getDrawingRect(this.f2419c);
        offsetDescendantRectToMyCoords(view, this.f2419c);
        int f6 = f(this.f2419c);
        if (f6 != 0) {
            scrollBy(0, f6);
        }
    }

    private boolean Q(Rect rect, boolean z5) {
        int f6 = f(rect);
        boolean z6 = f6 != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, f6);
            } else {
                S(0, f6);
            }
        }
        return z6;
    }

    private boolean R(EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        return w(-i6) < e.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i6, int i7, int i8, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2418b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2420d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY, i8);
            M(z5);
        } else {
            if (!this.f2420d.isFinished()) {
                a();
            }
            scrollBy(i6, i7);
        }
        this.f2418b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z5;
        if (e.b(this.f2421e) != 0.0f) {
            e.d(this.f2421e, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        if (e.b(this.f2422f) == 0.0f) {
            return z5;
        }
        e.d(this.f2422f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f2420d.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i6, int i7, int i8) {
        if (i7 >= i8 || i6 < 0) {
            return 0;
        }
        return i7 + i6 > i8 ? i8 - i7 : i6;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2442z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2442z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2442z;
    }

    private void p(int i6) {
        if (i6 != 0) {
            if (this.f2430n) {
                S(0, i6);
            } else {
                scrollBy(0, i6);
            }
        }
    }

    private boolean q(int i6) {
        EdgeEffect edgeEffect;
        if (e.b(this.f2421e) != 0.0f) {
            if (R(this.f2421e, i6)) {
                edgeEffect = this.f2421e;
                edgeEffect.onAbsorb(i6);
            } else {
                i6 = -i6;
                u(i6);
            }
        } else {
            if (e.b(this.f2422f) == 0.0f) {
                return false;
            }
            i6 = -i6;
            if (R(this.f2422f, i6)) {
                edgeEffect = this.f2422f;
                edgeEffect.onAbsorb(i6);
            }
            u(i6);
        }
        return true;
    }

    private void r() {
        this.f2434r = -1;
        this.f2427k = false;
        K();
        Y(0);
        this.f2421e.onRelease();
        this.f2422f.onRelease();
    }

    private View t(boolean z5, int i6, int i7) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z7 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float w(int i6) {
        double log = Math.log((Math.abs(i6) * 0.35f) / (this.f2417a * 0.015f));
        float f6 = B;
        return (float) (this.f2417a * 0.015f * Math.exp((f6 / (f6 - 1.0d)) * log));
    }

    private boolean y(int i6, int i7) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i7 >= childAt.getTop() - scrollY && i7 < childAt.getBottom() - scrollY && i6 >= childAt.getLeft() && i6 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2428l;
        if (velocityTracker == null) {
            this.f2428l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean I(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.x(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2420d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean J(int i6) {
        boolean z5 = i6 == 130;
        int height = getHeight();
        if (z5) {
            this.f2419c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2419c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2419c.top = getScrollY() - height;
            Rect rect2 = this.f2419c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2419c;
        int i7 = rect3.top;
        int i8 = height + i7;
        rect3.bottom = i8;
        return N(i6, i7, i8);
    }

    public final void S(int i6, int i7) {
        T(i6, i7, 250, false);
    }

    void U(int i6, int i7, int i8, boolean z5) {
        T(i6 - getScrollX(), i7 - getScrollY(), i8, z5);
    }

    void V(int i6, int i7, boolean z5) {
        U(i6, i7, 250, z5);
    }

    public boolean W(int i6, int i7) {
        return this.f2441y.p(i6, i7);
    }

    public void Y(int i6) {
        this.f2441y.r(i6);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean b(int i6) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f2419c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2419c);
            O(f(this.f2419c), 0, 1, true);
            findNextFocus.requestFocus(i6);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2420d.isFinished()) {
            return;
        }
        this.f2420d.computeScrollOffset();
        int currY = this.f2420d.getCurrY();
        int g6 = g(currY - this.f2438v);
        this.f2438v = currY;
        int[] iArr = this.f2436t;
        boolean z5 = false;
        iArr[1] = 0;
        k(0, g6, iArr, null, 1);
        int i6 = g6 - this.f2436t[1];
        int scrollRange = getScrollRange();
        if (i6 != 0) {
            int scrollY = getScrollY();
            I(0, i6, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i7 = i6 - scrollY2;
            int[] iArr2 = this.f2436t;
            iArr2[1] = 0;
            l(0, scrollY2, 0, i7, this.f2435s, 1, iArr2);
            i6 = i7 - this.f2436t[1];
        }
        if (i6 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z5 = true;
            }
            if (z5) {
                if (i6 < 0) {
                    if (this.f2421e.isFinished()) {
                        edgeEffect = this.f2421e;
                        edgeEffect.onAbsorb((int) this.f2420d.getCurrVelocity());
                    }
                } else if (this.f2422f.isFinished()) {
                    edgeEffect = this.f2422f;
                    edgeEffect.onAbsorb((int) this.f2420d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f2420d.isFinished()) {
            Y(1);
        } else {
            b1.h0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.f2441y.a(f6, f7, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f2441y.b(f6, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return k(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f2441y.f(i6, i7, i8, i9, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i7 = 0;
        if (!this.f2421e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i6 = getPaddingLeft() + 0;
            } else {
                i6 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i6, min);
            this.f2421e.setSize(width, height);
            if (this.f2421e.draw(canvas)) {
                b1.h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f2422f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i7 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i7 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2422f.setSize(width2, height2);
        if (this.f2422f.draw(canvas)) {
            b1.h0(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i7) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i6) {
        int height = getHeight();
        if (i6 > 0 && e.b(this.f2421e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * e.d(this.f2421e, ((-i6) * 4.0f) / height, 0.5f));
            if (round != i6) {
                this.f2421e.finish();
            }
            return i6 - round;
        }
        if (i6 >= 0 || e.b(this.f2422f) == 0.0f) {
            return i6;
        }
        float f6 = height;
        int round2 = Math.round((f6 / 4.0f) * e.d(this.f2422f, (i6 * 4.0f) / f6, 0.5f));
        if (round2 != i6) {
            this.f2422f.finish();
        }
        return i6 - round2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2440x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.t0
    public void h(View view, View view2, int i6, int i7) {
        this.f2440x.c(view, view2, i6, i7);
        W(2, i7);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    @Override // androidx.core.view.t0
    public void i(View view, int i6) {
        this.f2440x.d(view, i6);
        Y(i6);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f2441y.l();
    }

    @Override // androidx.core.view.t0
    public void j(View view, int i6, int i7, int[] iArr, int i8) {
        k(i6, i7, iArr, null, i8);
    }

    public boolean k(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return this.f2441y.d(i6, i7, iArr, iArr2, i8);
    }

    public void l(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        this.f2441y.e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    @Override // androidx.core.view.u0
    public void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        G(i9, i10, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i6, int i7) {
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.t0
    public void n(View view, int i6, int i7, int i8, int i9, int i10) {
        G(i9, i10, null);
    }

    @Override // androidx.core.view.t0
    public boolean o(View view, View view2, int i6, int i7) {
        return (i6 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2425i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        int i6;
        if (motionEvent.getAction() != 8 || this.f2427k) {
            return false;
        }
        if (r0.a(motionEvent, 2)) {
            f6 = motionEvent.getAxisValue(9);
            i6 = (int) motionEvent.getX();
        } else if (r0.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i6 = getWidth() / 2;
            f6 = axisValue;
        } else {
            f6 = 0.0f;
            i6 = 0;
        }
        if (f6 == 0.0f) {
            return false;
        }
        O(-((int) (f6 * getVerticalScrollFactorCompat())), i6, 1, r0.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action == 2 && this.f2427k) {
            return true;
        }
        int i6 = action & 255;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = this.f2434r;
                    if (i7 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i7 + " in onInterceptTouchEvent");
                        } else {
                            int y5 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y5 - this.f2423g) > this.f2431o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2427k = true;
                                this.f2423g = y5;
                                B();
                                this.f2428l.addMovement(motionEvent);
                                this.f2437u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f2427k = false;
            this.f2434r = -1;
            K();
            if (this.f2420d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                b1.h0(this);
            }
            Y(0);
        } else {
            int y6 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y6)) {
                this.f2423g = y6;
                this.f2434r = motionEvent.getPointerId(0);
                z();
                this.f2428l.addMovement(motionEvent);
                this.f2420d.computeScrollOffset();
                if (!X(motionEvent) && this.f2420d.isFinished()) {
                    z5 = false;
                }
                this.f2427k = z5;
                W(2, 0);
            } else {
                if (!X(motionEvent) && this.f2420d.isFinished()) {
                    z5 = false;
                }
                this.f2427k = z5;
                K();
            }
        }
        return this.f2427k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        int i10 = 0;
        this.f2424h = false;
        View view = this.f2426j;
        if (view != null && E(view, this)) {
            P(this.f2426j);
        }
        this.f2426j = null;
        if (!this.f2425i) {
            if (this.f2439w != null) {
                scrollTo(getScrollX(), this.f2439w.f2443a);
                this.f2439w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i10 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e6 = e(scrollY, paddingTop, i10);
            if (e6 != scrollY) {
                scrollTo(getScrollX(), e6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2425i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f2429m && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        u((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        j(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        G(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        h(view, view2, i6, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i6, int i7, boolean z5, boolean z6) {
        super.scrollTo(i6, i7);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i6) : focusFinder.findNextFocusFromRect(this, rect, i6);
        if (findNextFocus == null || D(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i6, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2439w = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2443a = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(this, i6, i7, i8, i9);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i9)) {
            return;
        }
        findFocus.getDrawingRect(this.f2419c);
        offsetDescendantRectToMyCoords(findFocus, this.f2419c);
        p(f(this.f2419c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        return o(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12.f2420d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        androidx.core.view.b1.h0(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r12.f2420d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2424h) {
            this.f2426j = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        if (z5) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2424h = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2419c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        J(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int e6 = e(i6, width, width2);
            int e7 = e(i7, height, height2);
            if (e6 == getScrollX() && e7 == getScrollY()) {
                return;
            }
            super.scrollTo(e6, e7);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f2429m) {
            this.f2429m = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        this.f2441y.m(z5);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.A = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f2430n = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return W(i6, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i6) {
        if (getChildCount() > 0) {
            this.f2420d.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i6) {
        int childCount;
        boolean z5 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f2419c;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2419c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2419c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2419c;
        return N(i6, rect3.top, rect3.bottom);
    }

    public boolean x(int i6) {
        return this.f2441y.k(i6);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f2419c = new Rect();
        this.f2424h = true;
        this.f2425i = false;
        this.f2426j = null;
        this.f2427k = false;
        this.f2430n = true;
        this.f2434r = -1;
        this.f2435s = new int[2];
        this.f2436t = new int[2];
        this.f2421e = e.a(context, attributeSet);
        this.f2422f = e.a(context, attributeSet);
        this.f2417a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, i6, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2440x = new v0(this);
        this.f2441y = new s0(this);
        setNestedScrollingEnabled(true);
        b1.q0(this, C);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
