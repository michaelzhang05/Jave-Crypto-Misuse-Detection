package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.c3;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements a2, androidx.core.view.t0, androidx.core.view.u0 {
    static final int[] F = {d.a.f6115b, R.attr.windowContentOverlay};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final androidx.core.view.v0 E;

    /* renamed from: a, reason: collision with root package name */
    private int f752a;

    /* renamed from: b, reason: collision with root package name */
    private int f753b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f754c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f755d;

    /* renamed from: e, reason: collision with root package name */
    private b2 f756e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f757f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f758g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f759h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f760i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f761j;

    /* renamed from: k, reason: collision with root package name */
    boolean f762k;

    /* renamed from: l, reason: collision with root package name */
    private int f763l;

    /* renamed from: m, reason: collision with root package name */
    private int f764m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f765n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f766o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f767p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f768q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f769r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f770s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f771t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.core.view.c3 f772u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.core.view.c3 f773v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.core.view.c3 f774w;

    /* renamed from: x, reason: collision with root package name */
    private androidx.core.view.c3 f775x;

    /* renamed from: y, reason: collision with root package name */
    private d f776y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f777z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f762k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f762k = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f755d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f755d.animate().translationY(-ActionBarOverlayLayout.this.f755d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z5);

        void b();

        void c();

        void d(int i6);

        void e();

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i6, int i7) {
            super(i6, i7);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f753b = 0;
        this.f765n = new Rect();
        this.f766o = new Rect();
        this.f767p = new Rect();
        this.f768q = new Rect();
        this.f769r = new Rect();
        this.f770s = new Rect();
        this.f771t = new Rect();
        androidx.core.view.c3 c3Var = androidx.core.view.c3.f2337b;
        this.f772u = c3Var;
        this.f773v = c3Var;
        this.f774w = c3Var;
        this.f775x = c3Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        v(context);
        this.E = new androidx.core.view.v0(this);
    }

    private void A() {
        u();
        this.C.run();
    }

    private boolean B(float f6) {
        this.f777z.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f777z.getFinalY() > this.f755d.getHeight();
    }

    private void p() {
        u();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b2 t(View view) {
        if (view instanceof b2) {
            return (b2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f752a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f757f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f758g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f777z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.D, 600L);
    }

    private void y() {
        u();
        postDelayed(this.C, 600L);
    }

    @Override // androidx.appcompat.widget.a2
    public void a(Menu menu, m.a aVar) {
        z();
        this.f756e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.a2
    public boolean b() {
        z();
        return this.f756e.b();
    }

    @Override // androidx.appcompat.widget.a2
    public boolean c() {
        z();
        return this.f756e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.a2
    public boolean d() {
        z();
        return this.f756e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f757f == null || this.f758g) {
            return;
        }
        int bottom = this.f755d.getVisibility() == 0 ? (int) (this.f755d.getBottom() + this.f755d.getTranslationY() + 0.5f) : 0;
        this.f757f.setBounds(0, bottom, getWidth(), this.f757f.getIntrinsicHeight() + bottom);
        this.f757f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.a2
    public boolean e() {
        z();
        return this.f756e.e();
    }

    @Override // androidx.appcompat.widget.a2
    public void f() {
        z();
        this.f756e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a2
    public boolean g() {
        z();
        return this.f756e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f755d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f756e.getTitle();
    }

    @Override // androidx.core.view.t0
    public void h(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // androidx.core.view.t0
    public void i(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.t0
    public void j(View view, int i6, int i7, int[] iArr, int i8) {
        if (i8 == 0) {
            onNestedPreScroll(view, i6, i7, iArr);
        }
    }

    @Override // androidx.appcompat.widget.a2
    public void k(int i6) {
        z();
        if (i6 == 2) {
            this.f756e.p();
        } else if (i6 == 5) {
            this.f756e.r();
        } else {
            if (i6 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.a2
    public void l() {
        z();
        this.f756e.h();
    }

    @Override // androidx.core.view.u0
    public void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        n(view, i6, i7, i8, i9, i10);
    }

    @Override // androidx.core.view.t0
    public void n(View view, int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i6, i7, i8, i9);
        }
    }

    @Override // androidx.core.view.t0
    public boolean o(View view, View view2, int i6, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.c3 w5 = androidx.core.view.c3.w(windowInsets, this);
        boolean q6 = q(this.f755d, new Rect(w5.i(), w5.k(), w5.j(), w5.h()), true, true, false, true);
        androidx.core.view.b1.h(this, w5, this.f765n);
        Rect rect = this.f765n;
        androidx.core.view.c3 l6 = w5.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f772u = l6;
        boolean z5 = true;
        if (!this.f773v.equals(l6)) {
            this.f773v = this.f772u;
            q6 = true;
        }
        if (this.f766o.equals(this.f765n)) {
            z5 = q6;
        } else {
            this.f766o.set(this.f765n);
        }
        if (z5) {
            requestLayout();
        }
        return w5.a().c().b().u();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.b1.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        int measuredHeight;
        androidx.core.view.c3 a6;
        z();
        measureChildWithMargins(this.f755d, i6, 0, i7, 0);
        e eVar = (e) this.f755d.getLayoutParams();
        int max = Math.max(0, this.f755d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f755d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f755d.getMeasuredState());
        boolean z5 = (androidx.core.view.b1.N(this) & 256) != 0;
        if (z5) {
            measuredHeight = this.f752a;
            if (this.f760i && this.f755d.getTabContainer() != null) {
                measuredHeight += this.f752a;
            }
        } else {
            measuredHeight = this.f755d.getVisibility() != 8 ? this.f755d.getMeasuredHeight() : 0;
        }
        this.f767p.set(this.f765n);
        androidx.core.view.c3 c3Var = this.f772u;
        this.f774w = c3Var;
        if (this.f759h || z5) {
            a6 = new c3.b(this.f774w).c(androidx.core.graphics.g.b(c3Var.i(), this.f774w.k() + measuredHeight, this.f774w.j(), this.f774w.h() + 0)).a();
        } else {
            Rect rect = this.f767p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a6 = c3Var.l(0, measuredHeight, 0, 0);
        }
        this.f774w = a6;
        q(this.f754c, this.f767p, true, true, true, true);
        if (!this.f775x.equals(this.f774w)) {
            androidx.core.view.c3 c3Var2 = this.f774w;
            this.f775x = c3Var2;
            androidx.core.view.b1.i(this.f754c, c3Var2);
        }
        measureChildWithMargins(this.f754c, i6, 0, i7, 0);
        e eVar2 = (e) this.f754c.getLayoutParams();
        int max3 = Math.max(max, this.f754c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f754c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f754c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i7, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (!this.f761j || !z5) {
            return false;
        }
        if (B(f7)) {
            p();
        } else {
            A();
        }
        this.f762k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        int i10 = this.f763l + i7;
        this.f763l = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        this.E.b(view, view2, i6);
        this.f763l = getActionBarHideOffset();
        u();
        d dVar = this.f776y;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f755d.getVisibility() != 0) {
            return false;
        }
        return this.f761j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f761j && !this.f762k) {
            if (this.f763l <= this.f755d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f776y;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i6) {
        super.onWindowSystemUiVisibilityChanged(i6);
        z();
        int i7 = this.f764m ^ i6;
        this.f764m = i6;
        boolean z5 = (i6 & 4) == 0;
        boolean z6 = (i6 & 256) != 0;
        d dVar = this.f776y;
        if (dVar != null) {
            dVar.a(!z6);
            if (z5 || !z6) {
                this.f776y.b();
            } else {
                this.f776y.e();
            }
        }
        if ((i7 & 256) == 0 || this.f776y == null) {
            return;
        }
        androidx.core.view.b1.n0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f753b = i6;
        d dVar = this.f776y;
        if (dVar != null) {
            dVar.d(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i6) {
        u();
        this.f755d.setTranslationY(-Math.max(0, Math.min(i6, this.f755d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f776y = dVar;
        if (getWindowToken() != null) {
            this.f776y.d(this.f753b);
            int i6 = this.f764m;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                androidx.core.view.b1.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f760i = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f761j) {
            this.f761j = z5;
            if (z5) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        z();
        this.f756e.setIcon(i6);
    }

    public void setLogo(int i6) {
        z();
        this.f756e.k(i6);
    }

    public void setOverlayMode(boolean z5) {
        this.f759h = z5;
        this.f758g = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i6) {
    }

    @Override // androidx.appcompat.widget.a2
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f756e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.a2
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f756e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f759h;
    }

    void z() {
        if (this.f754c == null) {
            this.f754c = (ContentFrameLayout) findViewById(d.f.f6189b);
            this.f755d = (ActionBarContainer) findViewById(d.f.f6190c);
            this.f756e = t(findViewById(d.f.f6188a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f756e.setIcon(drawable);
    }
}
