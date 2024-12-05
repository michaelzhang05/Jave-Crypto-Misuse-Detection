package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f4824b;

    /* renamed from: c, reason: collision with root package name */
    public final ShippingInfoWidget f4825c;

    /* renamed from: d, reason: collision with root package name */
    public final CardMultilineWidget f4826d;

    private d(LinearLayout linearLayout, LinearLayout linearLayout2, ShippingInfoWidget shippingInfoWidget, CardMultilineWidget cardMultilineWidget) {
        this.f4823a = linearLayout;
        this.f4824b = linearLayout2;
        this.f4825c = shippingInfoWidget;
        this.f4826d = cardMultilineWidget;
    }

    public static d a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = AbstractC3403A.f34745d;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) ViewBindings.findChildViewById(view, i8);
        if (shippingInfoWidget != null) {
            i8 = AbstractC3403A.f34757j;
            CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) ViewBindings.findChildViewById(view, i8);
            if (cardMultilineWidget != null) {
                return new d(linearLayout, linearLayout, shippingInfoWidget, cardMultilineWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3405C.f34781d, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4823a;
    }
}
