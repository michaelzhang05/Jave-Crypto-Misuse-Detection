package T3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f10023a;

    /* renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f10024b;

    private d(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.f10023a = frameLayout;
        this.f10024b = circularProgressIndicator;
    }

    public static d a(View view) {
        int i8 = S3.d.f9792v;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
        if (circularProgressIndicator != null) {
            return new d((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(S3.e.f9800d, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f10023a;
    }
}
