package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f4851a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f4852b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f4853c;

    private i(View view, ImageView imageView, ImageView imageView2) {
        this.f4851a = view;
        this.f4852b = imageView;
        this.f4853c = imageView2;
    }

    public static i a(View view) {
        int i8 = AbstractC3403A.f34762m;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = AbstractC3403A.f34715C;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                return new i(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static i b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3405C.f34787j, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f4851a;
    }
}
