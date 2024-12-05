package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class k0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12389a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12390b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12391c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12392d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12393e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12394f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12395g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12396h;

    private k0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12389a = relativeLayout;
        this.f12390b = imageView;
        this.f12391c = imageView2;
        this.f12392d = linearLayout;
        this.f12393e = textView;
        this.f12394f = textView2;
        this.f12395g = textView3;
        this.f12396h = textView4;
    }

    public static k0 a(View view) {
        int i8 = R.id.iv_background_sign_in_popup;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_background_sign_in_popup);
        if (imageView != null) {
            i8 = R.id.iv_close_sign_in_popup;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_sign_in_popup);
            if (imageView2 != null) {
                i8 = R.id.ll_content_sign_in_popup;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content_sign_in_popup);
                if (linearLayout != null) {
                    i8 = R.id.tv_continue_sign_in_popup;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_continue_sign_in_popup);
                    if (textView != null) {
                        i8 = R.id.tv_description_sign_in_popup;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_sign_in_popup);
                        if (textView2 != null) {
                            i8 = R.id.tv_footer_sign_in_popup;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_footer_sign_in_popup);
                            if (textView3 != null) {
                                i8 = R.id.tv_title_sign_in_popup;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_sign_in_popup);
                                if (textView4 != null) {
                                    return new k0((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static k0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static k0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.sign_in_popup, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12389a;
    }
}
