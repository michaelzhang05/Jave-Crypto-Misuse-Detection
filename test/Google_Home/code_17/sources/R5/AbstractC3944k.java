package r5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3944k extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f39023a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39024b;

    /* renamed from: c, reason: collision with root package name */
    private final float f39025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3944k(View itemView, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f39023a = context;
        this.f39024b = 1.0f;
        this.f39025c = 0.6f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ImageView ivIcon, ValueAnimator valueAnimator) {
        AbstractC3255y.i(ivIcon, "$ivIcon");
        AbstractC3255y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3255y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ivIcon.setScaleX(floatValue);
        ivIcon.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        ivIcon.setPadding(i8, i8, i8, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ImageView ivIcon, ValueAnimator valueAnimator) {
        AbstractC3255y.i(ivIcon, "$ivIcon");
        AbstractC3255y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3255y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ivIcon.setScaleX(floatValue);
        ivIcon.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        ivIcon.setPadding(i8, i8, i8, i8);
    }

    public final void c(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3255y.i(pb, "pb");
        AbstractC3255y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 0) {
            ValueAnimator endDownloadAnimation$lambda$4 = ValueAnimator.ofFloat(this.f39025c, this.f39024b);
            endDownloadAnimation$lambda$4.setStartDelay(200L);
            endDownloadAnimation$lambda$4.setDuration(300L);
            endDownloadAnimation$lambda$4.setInterpolator(new AccelerateDecelerateInterpolator());
            endDownloadAnimation$lambda$4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r5.j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3944k.d(ivIcon, valueAnimator);
                }
            });
            AbstractC3255y.h(endDownloadAnimation$lambda$4, "endDownloadAnimation$lambda$4");
            endDownloadAnimation$lambda$4.addListener(new a(pb));
            endDownloadAnimation$lambda$4.start();
        }
    }

    public final void e(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3255y.i(pb, "pb");
        AbstractC3255y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 8) {
            pb.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39024b, this.f39025c);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r5.i
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3944k.f(ivIcon, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: r5.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f39026a;

        public a(ProgressBar progressBar) {
            this.f39026a = progressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39026a.setVisibility(8);
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
