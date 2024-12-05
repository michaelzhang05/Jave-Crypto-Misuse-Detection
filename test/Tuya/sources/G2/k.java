package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f3148b;

    private k(View view, ProgressBar progressBar) {
        this.f3147a = view;
        this.f3148b = progressBar;
    }

    public static k a(View view) {
        int i8 = AbstractC3049A.f32779i;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
        if (progressBar != null) {
            return new k(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static k b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32813l, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3147a;
    }
}
