package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.c0;
import androidx.core.view.p;
import androidx.core.view.u;
import com.google.android.material.appbar.AppBarLayout;
import e.e.b.b.f;
import e.e.b.b.k;
import e.e.b.b.l;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int f16371f = k.f17494j;
    private AppBarLayout.e A;
    int B;
    c0 C;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16372g;

    /* renamed from: h, reason: collision with root package name */
    private int f16373h;

    /* renamed from: i, reason: collision with root package name */
    private Toolbar f16374i;

    /* renamed from: j, reason: collision with root package name */
    private View f16375j;

    /* renamed from: k, reason: collision with root package name */
    private View f16376k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final Rect p;
    final com.google.android.material.internal.a q;
    private boolean r;
    private boolean s;
    private Drawable t;
    Drawable u;
    private int v;
    private boolean w;
    private ValueAnimator x;
    private long y;
    private int z;

    /* loaded from: classes2.dex */
    class a implements p {
        a() {
        }

        @Override // androidx.core.view.p
        public c0 a(View view, c0 c0Var) {
            return CollapsingToolbarLayout.this.j(c0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes2.dex */
    private class d implements AppBarLayout.e {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.B = i2;
            c0 c0Var = collapsingToolbarLayout.C;
            int k2 = c0Var != null ? c0Var.k() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                com.google.android.material.appbar.d h2 = CollapsingToolbarLayout.h(childAt);
                int i4 = cVar.a;
                if (i4 == 1) {
                    h2.f(c.h.g.a.b(-i2, 0, CollapsingToolbarLayout.this.g(childAt)));
                } else if (i4 == 2) {
                    h2.f(Math.round((-i2) * cVar.f16377b));
                }
            }
            CollapsingToolbarLayout.this.n();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.u != null && k2 > 0) {
                u.Z(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.q.d0(Math.abs(i2) / ((CollapsingToolbarLayout.this.getHeight() - u.z(CollapsingToolbarLayout.this)) - k2));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.x = valueAnimator2;
            valueAnimator2.setDuration(this.y);
            this.x.setInterpolator(i2 > this.v ? e.e.b.b.m.a.f17507c : e.e.b.b.m.a.f17508d);
            this.x.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.x.cancel();
        }
        this.x.setIntValues(this.v, i2);
        this.x.start();
    }

    private void b() {
        if (this.f16372g) {
            Toolbar toolbar = null;
            this.f16374i = null;
            this.f16375j = null;
            int i2 = this.f16373h;
            if (i2 != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i2);
                this.f16374i = toolbar2;
                if (toolbar2 != null) {
                    this.f16375j = c(toolbar2);
                }
            }
            if (this.f16374i == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.f16374i = toolbar;
            }
            m();
            this.f16372g = false;
        }
    }

    private View c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getHeight();
    }

    static com.google.android.material.appbar.d h(View view) {
        int i2 = f.F;
        com.google.android.material.appbar.d dVar = (com.google.android.material.appbar.d) view.getTag(i2);
        if (dVar != null) {
            return dVar;
        }
        com.google.android.material.appbar.d dVar2 = new com.google.android.material.appbar.d(view);
        view.setTag(i2, dVar2);
        return dVar2;
    }

    private boolean i(View view) {
        View view2 = this.f16375j;
        if (view2 == null || view2 == this) {
            if (view == this.f16374i) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void l() {
        setContentDescription(getTitle());
    }

    private void m() {
        View view;
        if (!this.r && (view = this.f16376k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16376k);
            }
        }
        if (!this.r || this.f16374i == null) {
            return;
        }
        if (this.f16376k == null) {
            this.f16376k = new View(getContext());
        }
        if (this.f16376k.getParent() == null) {
            this.f16374i.addView(this.f16376k, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f16374i == null && (drawable = this.t) != null && this.v > 0) {
            drawable.mutate().setAlpha(this.v);
            this.t.draw(canvas);
        }
        if (this.r && this.s) {
            this.q.j(canvas);
        }
        if (this.u == null || this.v <= 0) {
            return;
        }
        c0 c0Var = this.C;
        int k2 = c0Var != null ? c0Var.k() : 0;
        if (k2 > 0) {
            this.u.setBounds(0, -this.B, getWidth(), k2 - this.B);
            this.u.mutate().setAlpha(this.v);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.t == null || this.v <= 0 || !i(view)) {
            z = false;
        } else {
            this.t.mutate().setAlpha(this.v);
            this.t.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.q;
        if (aVar != null) {
            z |= aVar.h0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    final int g(View view) {
        return ((getHeight() - h(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.q.o();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.q.s();
    }

    public Drawable getContentScrim() {
        return this.t;
    }

    public int getExpandedTitleGravity() {
        return this.q.w();
    }

    public int getExpandedTitleMarginBottom() {
        return this.o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.n;
    }

    public int getExpandedTitleMarginStart() {
        return this.l;
    }

    public int getExpandedTitleMarginTop() {
        return this.m;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.q.y();
    }

    public int getMaxLines() {
        return this.q.A();
    }

    int getScrimAlpha() {
        return this.v;
    }

    public long getScrimAnimationDuration() {
        return this.y;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.z;
        if (i2 >= 0) {
            return i2;
        }
        c0 c0Var = this.C;
        int k2 = c0Var != null ? c0Var.k() : 0;
        int z = u.z(this);
        if (z > 0) {
            return Math.min((z * 2) + k2, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.u;
    }

    public CharSequence getTitle() {
        if (this.r) {
            return this.q.B();
        }
        return null;
    }

    c0 j(c0 c0Var) {
        c0 c0Var2 = u.v(this) ? c0Var : null;
        if (!c.h.j.e.a(this.C, c0Var2)) {
            this.C = c0Var2;
            requestLayout();
        }
        return c0Var.c();
    }

    public void k(boolean z, boolean z2) {
        if (this.w != z) {
            if (z2) {
                a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.w = z;
        }
    }

    final void n() {
        if (this.t == null && this.u == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            u.r0(this, u.v((View) parent));
            if (this.A == null) {
                this.A = new d();
            }
            ((AppBarLayout) parent).b(this.A);
            u.f0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.A;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).p(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        c0 c0Var = this.C;
        if (c0Var != null) {
            int k2 = c0Var.k();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!u.v(childAt) && childAt.getTop() < k2) {
                    u.U(childAt, k2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            h(getChildAt(i7)).d();
        }
        if (this.r && (view = this.f16376k) != null) {
            boolean z2 = u.N(view) && this.f16376k.getVisibility() == 0;
            this.s = z2;
            if (z2) {
                boolean z3 = u.y(this) == 1;
                View view2 = this.f16375j;
                if (view2 == null) {
                    view2 = this.f16374i;
                }
                int g2 = g(view2);
                com.google.android.material.internal.b.a(this, this.f16376k, this.p);
                this.q.M(this.p.left + (z3 ? this.f16374i.getTitleMarginEnd() : this.f16374i.getTitleMarginStart()), this.p.top + g2 + this.f16374i.getTitleMarginTop(), this.p.right + (z3 ? this.f16374i.getTitleMarginStart() : this.f16374i.getTitleMarginEnd()), (this.p.bottom + g2) - this.f16374i.getTitleMarginBottom());
                this.q.U(z3 ? this.n : this.l, this.p.top + this.m, (i4 - i2) - (z3 ? this.l : this.n), (i5 - i3) - this.o);
                this.q.K();
            }
        }
        if (this.f16374i != null) {
            if (this.r && TextUtils.isEmpty(this.q.B())) {
                setTitle(this.f16374i.getTitle());
            }
            View view3 = this.f16375j;
            if (view3 != null && view3 != this) {
                setMinimumHeight(f(view3));
            } else {
                setMinimumHeight(f(this.f16374i));
            }
        }
        n();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            h(getChildAt(i8)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        c0 c0Var = this.C;
        int k2 = c0Var != null ? c0Var.k() : 0;
        if (mode != 0 || k2 <= 0) {
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + k2, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.q.R(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.q.O(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.q.S(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.t = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.t.setCallback(this);
                this.t.setAlpha(this.v);
            }
            u.Z(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.a.e(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.q.Z(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.o = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.n = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.m = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.q.W(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.q.Y(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.q.b0(typeface);
    }

    public void setMaxLines(int i2) {
        this.q.f0(i2);
    }

    void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.v) {
            if (this.t != null && (toolbar = this.f16374i) != null) {
                u.Z(toolbar);
            }
            this.v = i2;
            u.Z(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.y = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.z != i2) {
            this.z = i2;
            n();
        }
    }

    public void setScrimsShown(boolean z) {
        k(z, u.O(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.u, u.y(this));
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
                this.u.setAlpha(this.v);
            }
            u.Z(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.a.e(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.q.i0(charSequence);
        l();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.r) {
            this.r = z;
            l();
            m();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
        Drawable drawable2 = this.t;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.t.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t || drawable == this.u;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.q.Q(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class c extends FrameLayout.LayoutParams {
        int a;

        /* renamed from: b, reason: collision with root package name */
        float f16377b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.f16377b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.w1);
            this.a = obtainStyledAttributes.getInt(l.x1, 0);
            a(obtainStyledAttributes.getFloat(l.y1, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f2) {
            this.f16377b = f2;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.f16377b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.f16377b = 0.5f;
        }
    }
}
