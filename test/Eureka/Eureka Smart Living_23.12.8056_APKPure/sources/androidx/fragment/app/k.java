package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.z0;

/* loaded from: classes.dex */
abstract class k {

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f2905a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f2906b;

        a(Animator animator) {
            this.f2905a = null;
            this.f2906b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f2905a = animation;
            this.f2906b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f2907a;

        /* renamed from: b, reason: collision with root package name */
        private final View f2908b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2909c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2910d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2911e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2911e = true;
            this.f2907a = viewGroup;
            this.f2908b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j6, Transformation transformation) {
            this.f2911e = true;
            if (this.f2909c) {
                return !this.f2910d;
            }
            if (!super.getTransformation(j6, transformation)) {
                this.f2909c = true;
                z0.a(this.f2907a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2909c || !this.f2911e) {
                this.f2907a.endViewTransition(this.f2908b);
                this.f2910d = true;
            } else {
                this.f2911e = false;
                this.f2907a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j6, Transformation transformation, float f6) {
            this.f2911e = true;
            if (this.f2909c) {
                return !this.f2910d;
            }
            if (!super.getTransformation(j6, transformation, f6)) {
                this.f2909c = true;
                z0.a(this.f2907a, this);
            }
            return true;
        }
    }

    private static int a(Fragment fragment, boolean z5, boolean z6) {
        return z6 ? z5 ? fragment.K() : fragment.L() : z5 ? fragment.v() : fragment.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Context context, Fragment fragment, boolean z5, boolean z6) {
        int G = fragment.G();
        int a6 = a(fragment, z5, z6);
        boolean z7 = false;
        fragment.x1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null && viewGroup.getTag(b0.b.f3804c) != null) {
            fragment.H.setTag(b0.b.f3804c, null);
        }
        ViewGroup viewGroup2 = fragment.H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation q02 = fragment.q0(G, z5, a6);
        if (q02 != null) {
            return new a(q02);
        }
        Animator r02 = fragment.r0(G, z5, a6);
        if (r02 != null) {
            return new a(r02);
        }
        if (a6 == 0 && G != 0) {
            a6 = d(context, G, z5);
        }
        if (a6 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a6));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a6);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z7 = true;
                } catch (Resources.NotFoundException e6) {
                    throw e6;
                } catch (RuntimeException unused) {
                }
            }
            if (!z7) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a6);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e7) {
                    if (equals) {
                        throw e7;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a6);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i6});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i6, boolean z5) {
        int i7;
        if (i6 == 4097) {
            return z5 ? b0.a.f3800e : b0.a.f3801f;
        }
        if (i6 == 8194) {
            return z5 ? b0.a.f3796a : b0.a.f3797b;
        }
        if (i6 == 8197) {
            i7 = z5 ? R.attr.activityCloseEnterAnimation : R.attr.activityCloseExitAnimation;
        } else {
            if (i6 == 4099) {
                return z5 ? b0.a.f3798c : b0.a.f3799d;
            }
            if (i6 != 4100) {
                return -1;
            }
            i7 = z5 ? R.attr.activityOpenEnterAnimation : R.attr.activityOpenExitAnimation;
        }
        return c(context, i7);
    }
}
