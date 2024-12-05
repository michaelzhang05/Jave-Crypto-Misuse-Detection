package J3;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.motion.widget.Key;
import j4.AbstractC3079e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4836c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f4837d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4838a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4839b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public J(Context context) {
        AbstractC3159y.i(context, "context");
        this.f4838a = context;
        this.f4839b = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 0.0f);
        ofFloat.setDuration(1500L);
        AbstractC3159y.f(ofFloat);
        ofFloat.addListener(new b(function0));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View view, int i8, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i8 / 2.0f)));
        ofFloat.setDuration(this.f4839b);
        AbstractC3159y.f(ofFloat);
        ofFloat.addListener(new e(view, function0));
        ofFloat.start();
    }

    public final void d(View view, int i8, Function0 onAnimationEnd) {
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4838a, AbstractC3079e.f33174a);
        loadAnimation.setAnimationListener(new c(view, this, i8, onAnimationEnd));
        view.startAnimation(loadAnimation);
    }

    public final void e(View view) {
        AbstractC3159y.i(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4838a, AbstractC3079e.f33175b);
        loadAnimation.setAnimationListener(new d(view));
        view.startAnimation(loadAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f4840a;

        public b(Function0 function0) {
            this.f4840a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4840a.invoke();
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
        final /* synthetic */ View f4841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f4842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4843c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4844d;

        c(View view, J j8, int i8, Function0 function0) {
            this.f4841a = view;
            this.f4842b = j8;
            this.f4843c = i8;
            this.f4844d = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4841a.setVisibility(0);
            this.f4842b.f(this.f4841a, this.f4843c, this.f4844d);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f4841a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4845a;

        d(View view) {
            this.f4845a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4845a.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f4845a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4848c;

        public e(View view, Function0 function0) {
            this.f4847b = view;
            this.f4848c = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            J.this.c(this.f4847b, this.f4848c);
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
