package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.f0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: j, reason: collision with root package name */
    private static final int f4686j = m2.a.f7571y;

    /* renamed from: k, reason: collision with root package name */
    private static final int f4687k = m2.a.f7572z;

    /* renamed from: l, reason: collision with root package name */
    private static final int f4688l = m2.a.E;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f4689a;

    /* renamed from: b, reason: collision with root package name */
    private int f4690b;

    /* renamed from: c, reason: collision with root package name */
    private int f4691c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f4692d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f4693e;

    /* renamed from: f, reason: collision with root package name */
    private int f4694f;

    /* renamed from: g, reason: collision with root package name */
    private int f4695g;

    /* renamed from: h, reason: collision with root package name */
    private int f4696h;

    /* renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f4697i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f4697i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4689a = new LinkedHashSet();
        this.f4694f = 0;
        this.f4695g = 2;
        this.f4696h = 0;
    }

    private void F(View view, int i6, long j6, TimeInterpolator timeInterpolator) {
        this.f4697i = view.animate().translationY(i6).setInterpolator(timeInterpolator).setDuration(j6).setListener(new a());
    }

    private void M(View view, int i6) {
        this.f4695g = i6;
        Iterator it = this.f4689a.iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
        return i6 == 2;
    }

    public boolean G() {
        return this.f4695g == 1;
    }

    public boolean H() {
        return this.f4695g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z5) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4697i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i6 = this.f4694f + this.f4696h;
        if (z5) {
            F(view, i6, this.f4691c, this.f4693e);
        } else {
            view.setTranslationY(i6);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z5) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4697i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z5) {
            F(view, 0, this.f4690b, this.f4692d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
        this.f4694f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f4690b = x2.a.f(view.getContext(), f4686j, 225);
        this.f4691c = x2.a.f(view.getContext(), f4687k, 175);
        Context context = view.getContext();
        int i7 = f4688l;
        this.f4692d = x2.a.g(context, i7, n2.a.f7964d);
        this.f4693e = x2.a.g(view.getContext(), i7, n2.a.f7963c);
        return super.l(coordinatorLayout, view, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i7 > 0) {
            I(view);
        } else if (i7 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4689a = new LinkedHashSet();
        this.f4694f = 0;
        this.f4695g = 2;
        this.f4696h = 0;
    }
}
