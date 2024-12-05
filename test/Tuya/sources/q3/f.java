package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f8231a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreeDS2TextView f8232b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioGroup f8233c;

    private f(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, RadioGroup radioGroup) {
        this.f8231a = linearLayout;
        this.f8232b = threeDS2TextView;
        this.f8233c = radioGroup;
    }

    public static f a(View view) {
        int i8 = P3.d.f7959t;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
        if (threeDS2TextView != null) {
            i8 = P3.d.f7962w;
            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i8);
            if (radioGroup != null) {
                return new f((LinearLayout) view, threeDS2TextView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(P3.e.f7971f, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f8231a;
    }
}
