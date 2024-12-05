package o5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3554k extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f36815a;

    /* renamed from: b, reason: collision with root package name */
    private final float f36816b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3554k(View itemView, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36815a = context;
        this.f36816b = 1.0f;
        this.f36817c = 0.6f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ImageView ivIcon, ValueAnimator valueAnimator) {
        AbstractC3159y.i(ivIcon, "$ivIcon");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ivIcon.setScaleX(floatValue);
        ivIcon.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        ivIcon.setPadding(i8, i8, i8, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ImageView ivIcon, ValueAnimator valueAnimator) {
        AbstractC3159y.i(ivIcon, "$ivIcon");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ivIcon.setScaleX(floatValue);
        ivIcon.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        ivIcon.setPadding(i8, i8, i8, i8);
    }

    public final void c(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3159y.i(pb, "pb");
        AbstractC3159y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 0) {
            ValueAnimator endDownloadAnimation$lambda$4 = ValueAnimator.ofFloat(this.f36817c, this.f36816b);
            endDownloadAnimation$lambda$4.setStartDelay(200L);
            endDownloadAnimation$lambda$4.setDuration(300L);
            endDownloadAnimation$lambda$4.setInterpolator(new AccelerateDecelerateInterpolator());
            endDownloadAnimation$lambda$4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3554k.d(ivIcon, valueAnimator);
                }
            });
            AbstractC3159y.h(endDownloadAnimation$lambda$4, "endDownloadAnimation$lambda$4");
            endDownloadAnimation$lambda$4.addListener(new a(pb));
            endDownloadAnimation$lambda$4.start();
        }
    }

    public final void e(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3159y.i(pb, "pb");
        AbstractC3159y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 8) {
            pb.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36816b, this.f36817c);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.i
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3554k.f(ivIcon, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: o5.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f36818a;

        public a(ProgressBar progressBar) {
            this.f36818a = progressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36818a.setVisibility(8);
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
