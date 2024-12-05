package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f8247a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreeDS2WebView f8248b;

    private i(View view, ThreeDS2WebView threeDS2WebView) {
        this.f8247a = view;
        this.f8248b = threeDS2WebView;
    }

    public static i a(View view) {
        int i8 = P3.d.f7965z;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) ViewBindings.findChildViewById(view, i8);
        if (threeDS2WebView != null) {
            return new i(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static i b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(P3.e.f7974i, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f8247a;
    }
}
