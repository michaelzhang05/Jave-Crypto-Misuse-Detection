package M3;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m4.AbstractC3433e;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6542c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f6543d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6544a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6545b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public J(Context context) {
        AbstractC3255y.i(context, "context");
        this.f6544a = context;
        this.f6545b = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 0.0f);
        ofFloat.setDuration(1500L);
        AbstractC3255y.f(ofFloat);
        ofFloat.addListener(new b(function0));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View view, int i8, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i8 / 2.0f)));
        ofFloat.setDuration(this.f6545b);
        AbstractC3255y.f(ofFloat);
        ofFloat.addListener(new e(view, function0));
        ofFloat.start();
    }

    public final void d(View view, int i8, Function0 onAnimationEnd) {
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f6544a, AbstractC3433e.f35150a);
        loadAnimation.setAnimationListener(new c(view, this, i8, onAnimationEnd));
        view.startAnimation(loadAnimation);
    }

    public final void e(View view) {
        AbstractC3255y.i(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f6544a, AbstractC3433e.f35151b);
        loadAnimation.setAnimationListener(new d(view));
        view.startAnimation(loadAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f6546a;

        public b(Function0 function0) {
            this.f6546a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6546a.invoke();
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

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f6548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6549c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6550d;

        c(View view, J j8, int i8, Function0 function0) {
            this.f6547a = view;
            this.f6548b = j8;
            this.f6549c = i8;
            this.f6550d = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f6547a.setVisibility(0);
            this.f6548b.f(this.f6547a, this.f6549c, this.f6550d);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f6547a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6551a;

        d(View view) {
            this.f6551a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f6551a.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f6551a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6554c;

        public e(View view, Function0 function0) {
            this.f6553b = view;
            this.f6554c = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            J.this.c(this.f6553b, this.f6554c);
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
