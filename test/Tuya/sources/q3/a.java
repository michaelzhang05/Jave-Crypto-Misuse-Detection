package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f8217a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8218b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f8219c;

    private a(View view, ImageView imageView, ImageView imageView2) {
        this.f8217a = view;
        this.f8218b = imageView;
        this.f8219c = imageView2;
    }

    public static a a(View view) {
        int i8 = P3.d.f7958s;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = P3.d.f7960u;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                return new a(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(P3.e.f7966a, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f8217a;
    }
}
