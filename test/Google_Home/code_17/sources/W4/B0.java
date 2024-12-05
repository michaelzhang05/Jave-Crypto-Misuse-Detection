package W4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class B0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f11695a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f11696b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f11697c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f11698d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f11699e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f11700f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f11701g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f11702h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f11703i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f11704j;

    private B0(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f11695a = linearLayout;
        this.f11696b = imageView;
        this.f11697c = imageView2;
        this.f11698d = imageView3;
        this.f11699e = imageView4;
        this.f11700f = imageView5;
        this.f11701g = imageView6;
        this.f11702h = linearLayout2;
        this.f11703i = textView;
        this.f11704j = textView2;
    }

    public static B0 a(View view) {
        int i8 = R.id.iv_star1_valoration;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_valoration);
        if (imageView != null) {
            i8 = R.id.iv_star2_valoration;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_valoration);
            if (imageView2 != null) {
                i8 = R.id.iv_star3_valoration;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_valoration);
                if (imageView3 != null) {
                    i8 = R.id.iv_star4_valoration;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_valoration);
                    if (imageView4 != null) {
                        i8 = R.id.iv_star5_valoration;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_valoration);
                        if (imageView5 != null) {
                            i8 = R.id.iv_user_valoration;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_valoration);
                            if (imageView6 != null) {
                                i8 = R.id.ll_your_valoration;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_your_valoration);
                                if (linearLayout != null) {
                                    i8 = R.id.tv_write_review_app_detail;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_write_review_app_detail);
                                    if (textView != null) {
                                        i8 = R.id.tv_your_valoration;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_your_valoration);
                                        if (textView2 != null) {
                                            return new B0((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f11695a;
    }
}
