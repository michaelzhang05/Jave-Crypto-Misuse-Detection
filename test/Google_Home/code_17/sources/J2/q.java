package J2;

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
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class q implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final CoordinatorLayout f4885b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f4886c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearProgressIndicator f4887d;

    /* renamed from: e, reason: collision with root package name */
    public final PaymentMethodsRecyclerView f4888e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f4889f;

    private q(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar) {
        this.f4884a = coordinatorLayout;
        this.f4885b = coordinatorLayout2;
        this.f4886c = frameLayout;
        this.f4887d = linearProgressIndicator;
        this.f4888e = paymentMethodsRecyclerView;
        this.f4889f = toolbar;
    }

    public static q a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i8 = AbstractC3403A.f34714B;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = AbstractC3403A.f34720H;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (linearProgressIndicator != null) {
                i8 = AbstractC3403A.f34721I;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) ViewBindings.findChildViewById(view, i8);
                if (paymentMethodsRecyclerView != null) {
                    i8 = AbstractC3403A.f34754h0;
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
        View inflate = layoutInflater.inflate(AbstractC3405C.f34796s, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f4884a;
    }
}
