package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class o implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f4877a;

    /* renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f4878b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f4879c;

    /* renamed from: d, reason: collision with root package name */
    public final PaymentAuthWebView f4880d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f4881e;

    private o(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.f4877a = coordinatorLayout;
        this.f4878b = circularProgressIndicator;
        this.f4879c = toolbar;
        this.f4880d = paymentAuthWebView;
        this.f4881e = frameLayout;
    }

    public static o a(View view) {
        int i8 = AbstractC3403A.f34720H;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
        if (circularProgressIndicator != null) {
            i8 = AbstractC3403A.f34754h0;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
            if (toolbar != null) {
                i8 = AbstractC3403A.f34758j0;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(view, i8);
                if (paymentAuthWebView != null) {
                    i8 = AbstractC3403A.f34760k0;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
                    if (frameLayout != null) {
                        return new o((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3405C.f34794q, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f4877a;
    }
}
