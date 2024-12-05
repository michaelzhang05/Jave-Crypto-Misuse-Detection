package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.MaskedCardView;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class m implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f4871a;

    /* renamed from: b, reason: collision with root package name */
    public final MaskedCardView f4872b;

    private m(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.f4871a = frameLayout;
        this.f4872b = maskedCardView;
    }

    public static m a(View view) {
        int i8 = AbstractC3403A.f34717E;
        MaskedCardView maskedCardView = (MaskedCardView) ViewBindings.findChildViewById(view, i8);
        if (maskedCardView != null) {
            return new m((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3405C.f34792o, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4871a;
    }
}
