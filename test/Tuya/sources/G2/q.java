package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.PaymentMethodsRecyclerView;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class q implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final CoordinatorLayout f3166b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f3167c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearProgressIndicator f3168d;

    /* renamed from: e, reason: collision with root package name */
    public final PaymentMethodsRecyclerView f3169e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f3170f;

    private q(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar) {
        this.f3165a = coordinatorLayout;
        this.f3166b = coordinatorLayout2;
        this.f3167c = frameLayout;
        this.f3168d = linearProgressIndicator;
        this.f3169e = paymentMethodsRecyclerView;
        this.f3170f = toolbar;
    }

    public static q a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i8 = AbstractC3049A.f32738B;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = AbstractC3049A.f32744H;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (linearProgressIndicator != null) {
                i8 = AbstractC3049A.f32745I;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) ViewBindings.findChildViewById(view, i8);
                if (paymentMethodsRecyclerView != null) {
                    i8 = AbstractC3049A.f32778h0;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
                    if (toolbar != null) {
                        return new q(coordinatorLayout, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32820s, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3165a;
    }
}
