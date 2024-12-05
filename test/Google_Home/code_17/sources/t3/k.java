package T3;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10055a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10056b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f10057c;

    private k(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.f10055a = linearLayout;
        this.f10056b = imageView;
        this.f10057c = circularProgressIndicator;
    }

    public static k a(View view) {
        int i8 = S3.d.f9771a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = S3.d.f9792v;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                return new k((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10055a;
    }
}
