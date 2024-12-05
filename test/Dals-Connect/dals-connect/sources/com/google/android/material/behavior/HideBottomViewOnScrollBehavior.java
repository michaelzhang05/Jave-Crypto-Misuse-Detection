package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f16412b;

    /* renamed from: c, reason: collision with root package name */
    private int f16413c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f16414d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16414d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.f16412b = 2;
        this.f16413c = 0;
    }

    private void F(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f16414d = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public void G(V v, int i2) {
        this.f16413c = i2;
        if (this.f16412b == 1) {
            v.setTranslationY(this.a + i2);
        }
    }

    public void H(V v) {
        if (this.f16412b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16414d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f16412b = 1;
        F(v, this.a + this.f16413c, 175L, e.e.b.b.m.a.f17507c);
    }

    public void I(V v) {
        if (this.f16412b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16414d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f16412b = 2;
        F(v, 0, 225L, e.e.b.b.m.a.f17508d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            H(v);
        } else if (i3 < 0) {
            I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.f16412b = 2;
        this.f16413c = 0;
    }
}
