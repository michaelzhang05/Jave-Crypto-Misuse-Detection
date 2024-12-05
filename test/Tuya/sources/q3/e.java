package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f8228a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreeDS2TextView f8229b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f8230c;

    private e(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, LinearLayout linearLayout2) {
        this.f8228a = linearLayout;
        this.f8229b = threeDS2TextView;
        this.f8230c = linearLayout2;
    }

    public static e a(View view) {
        int i8 = P3.d.f7959t;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
        if (threeDS2TextView != null) {
            i8 = P3.d.f7962w;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
            if (linearLayout != null) {
                return new e((LinearLayout) view, threeDS2TextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(P3.e.f7970e, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f8228a;
    }
}
