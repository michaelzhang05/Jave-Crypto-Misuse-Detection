package y3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import t3.u;
import t3.v;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4204a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f40921a;

    /* renamed from: b, reason: collision with root package name */
    public final PrimaryButton f40922b;

    private C4204a(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.f40921a = frameLayout;
        this.f40922b = primaryButton;
    }

    public static C4204a a(View view) {
        int i8 = u.f39744e;
        PrimaryButton primaryButton = (PrimaryButton) ViewBindings.findChildViewById(view, i8);
        if (primaryButton != null) {
            return new C4204a((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C4204a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(v.f39745a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f40921a;
    }
}
