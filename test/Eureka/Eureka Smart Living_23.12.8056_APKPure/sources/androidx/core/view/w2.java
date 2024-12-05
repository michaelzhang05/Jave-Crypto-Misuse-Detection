package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2403a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f2404b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f2405c = null;

    /* renamed from: d, reason: collision with root package name */
    int f2406d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x2 f2407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2408b;

        a(x2 x2Var, View view) {
            this.f2407a = x2Var;
            this.f2408b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2407a.c(this.f2408b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2407a.a(this.f2408b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2407a.b(this.f2408b);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(View view) {
        this.f2403a = new WeakReference(view);
    }

    private void i(View view, x2 x2Var) {
        if (x2Var != null) {
            view.animate().setListener(new a(x2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public w2 b(float f6) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f2403a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public w2 f(long j6) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
        return this;
    }

    public w2 g(Interpolator interpolator) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public w2 h(x2 x2Var) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            i(view, x2Var);
        }
        return this;
    }

    public w2 j(long j6) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().setStartDelay(j6);
        }
        return this;
    }

    public w2 k(final z2 z2Var) {
        final View view = (View) this.f2403a.get();
        if (view != null) {
            b.a(view.animate(), z2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.v2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    z2.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public w2 m(float f6) {
        View view = (View) this.f2403a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
        return this;
    }
}
