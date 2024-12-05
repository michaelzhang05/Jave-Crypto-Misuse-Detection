package J2;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import m2.AbstractC3403A;

/* loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f4821a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f4822b;

    private c(ScrollView scrollView, LinearLayout linearLayout) {
        this.f4821a = scrollView;
        this.f4822b = linearLayout;
    }

    public static c a(View view) {
        int i8 = AbstractC3403A.f34722J;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
        if (linearLayout != null) {
            return new c((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f4821a;
    }
}
