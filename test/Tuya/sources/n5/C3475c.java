package n5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3475c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3475c f36198a = new C3475c();

    private C3475c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ImageView imageView, ValueAnimator valueAnimator) {
        AbstractC3159y.i(imageView, "$imageView");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        imageView.setPadding(i8, i8, i8, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ImageView imageView, ValueAnimator valueAnimator) {
        AbstractC3159y.i(imageView, "$imageView");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        imageView.setPadding(i8, i8, i8, i8);
    }

    public final void c(ProgressBar progressBar, final ImageView imageView) {
        AbstractC3159y.i(progressBar, "progressBar");
        AbstractC3159y.i(imageView, "imageView");
        if (progressBar.getVisibility() == 0) {
            progressBar.setVisibility(8);
            ValueAnimator endDownloadAnimation$lambda$4 = ValueAnimator.ofFloat(0.4f, 1.0f);
            endDownloadAnimation$lambda$4.setStartDelay(200L);
            endDownloadAnimation$lambda$4.setDuration(300L);
            endDownloadAnimation$lambda$4.setInterpolator(new AccelerateDecelerateInterpolator());
            endDownloadAnimation$lambda$4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n5.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3475c.d(imageView, valueAnimator);
                }
            });
            AbstractC3159y.h(endDownloadAnimation$lambda$4, "endDownloadAnimation$lambda$4");
            endDownloadAnimation$lambda$4.addListener(new a(progressBar));
            endDownloadAnimation$lambda$4.start();
        }
    }

    public final void e(ProgressBar progressBar, final ImageView imageView) {
        AbstractC3159y.i(progressBar, "progressBar");
        AbstractC3159y.i(imageView, "imageView");
        if (progressBar.getVisibility() == 8) {
            progressBar.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n5.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3475c.f(imageView, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: n5.c$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f36199a;

        public a(ProgressBar progressBar) {
            this.f36199a = progressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36199a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
