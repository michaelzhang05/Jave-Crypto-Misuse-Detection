package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.ShippingInfoWidget;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f3171a;

    /* renamed from: b, reason: collision with root package name */
    public final ShippingInfoWidget f3172b;

    private r(ScrollView scrollView, ShippingInfoWidget shippingInfoWidget) {
        this.f3171a = scrollView;
        this.f3172b = shippingInfoWidget;
    }

    public static r a(View view) {
        int i8 = AbstractC3049A.f32751O;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) ViewBindings.findChildViewById(view, i8);
        if (shippingInfoWidget != null) {
            return new r((ScrollView) view, shippingInfoWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static r c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32822u, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f3171a;
    }
}
