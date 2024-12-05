package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1498w implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12599a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12600b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12601c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12602d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12603e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f12604f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f12605g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f12606h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12607i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12608j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f12609k;

    private C1498w(LinearLayout linearLayout, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3) {
        this.f12599a = linearLayout;
        this.f12600b = editText;
        this.f12601c = imageView;
        this.f12602d = imageView2;
        this.f12603e = imageView3;
        this.f12604f = imageView4;
        this.f12605g = imageView5;
        this.f12606h = imageView6;
        this.f12607i = textView;
        this.f12608j = textView2;
        this.f12609k = textView3;
    }

    public static C1498w a(View view) {
        int i8 = R.id.et_review;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_review);
        if (editText != null) {
            i8 = R.id.iv_avatar_dialog_review;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_dialog_review);
            if (imageView != null) {
                i8 = R.id.iv_star1_dialog_review;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_dialog_review);
                if (imageView2 != null) {
                    i8 = R.id.iv_star2_dialog_review;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_dialog_review);
                    if (imageView3 != null) {
                        i8 = R.id.iv_star3_dialog_review;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_dialog_review);
                        if (imageView4 != null) {
                            i8 = R.id.iv_star4_dialog_review;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_dialog_review);
                            if (imageView5 != null) {
                                i8 = R.id.iv_star5_dialog_review;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_dialog_review);
                                if (imageView6 != null) {
                                    i8 = R.id.tv_app_name_dialog_review;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_dialog_review);
                                    if (textView != null) {
                                        i8 = R.id.tv_cancel;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_ok;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
                                            if (textView3 != null) {
                                                return new C1498w((LinearLayout) view, editText, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3);
                                            }
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

    public static C1498w c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1498w d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_review_stars, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12599a;
    }
}
