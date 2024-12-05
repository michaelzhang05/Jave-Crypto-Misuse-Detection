package W4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class D implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11711a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f11712b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f11713c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f11714d;

    private D(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f11711a = relativeLayout;
        this.f11712b = imageView;
        this.f11713c = textView;
        this.f11714d = textView2;
    }

    public static D a(View view) {
        int i8 = R.id.iv_logo_app;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app);
        if (imageView != null) {
            i8 = R.id.tv_app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
            if (textView != null) {
                i8 = R.id.tv_app_version;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_version);
                if (textView2 != null) {
                    return new D((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f11711a;
    }
}
