package v3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import q3.u;
import q3.v;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3827a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f38790a;

    /* renamed from: b, reason: collision with root package name */
    public final PrimaryButton f38791b;

    private C3827a(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.f38790a = frameLayout;
        this.f38791b = primaryButton;
    }

    public static C3827a a(View view) {
        int i8 = u.f37422e;
        PrimaryButton primaryButton = (PrimaryButton) ViewBindings.findChildViewById(view, i8);
        if (primaryButton != null) {
            return new C3827a((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C3827a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(v.f37423a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f38790a;
    }
}
