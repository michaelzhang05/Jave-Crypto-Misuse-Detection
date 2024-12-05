package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.MaskedCardView;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class m implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f3152a;

    /* renamed from: b, reason: collision with root package name */
    public final MaskedCardView f3153b;

    private m(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.f3152a = frameLayout;
        this.f3153b = maskedCardView;
    }

    public static m a(View view) {
        int i8 = AbstractC3049A.f32741E;
        MaskedCardView maskedCardView = (MaskedCardView) ViewBindings.findChildViewById(view, i8);
        if (maskedCardView != null) {
            return new m((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32816o, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f3152a;
    }
}
