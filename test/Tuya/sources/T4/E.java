package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class E implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10089a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10090b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10091c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10092d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f10093e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10094f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10095g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10096h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10097i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10098j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10099k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10100l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10101m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10102n;

    private E(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f10089a = relativeLayout;
        this.f10090b = imageView;
        this.f10091c = imageView2;
        this.f10092d = linearLayout;
        this.f10093e = progressBar;
        this.f10094f = relativeLayout2;
        this.f10095g = relativeLayout3;
        this.f10096h = textView;
        this.f10097i = textView2;
        this.f10098j = textView3;
        this.f10099k = textView4;
        this.f10100l = textView5;
        this.f10101m = textView6;
        this.f10102n = textView7;
    }

    public static E a(View view) {
        int i8 = R.id.iv_home_card_featured_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_home_card_featured_item);
        if (imageView != null) {
            i8 = R.id.iv_logo_home_card_featured_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_home_card_featured_item);
            if (imageView2 != null) {
                i8 = R.id.ll_progress_home_card_featured_item;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_progress_home_card_featured_item);
                if (linearLayout != null) {
                    i8 = R.id.pb_progress_home_card_featured_item;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_home_card_featured_item);
                    if (progressBar != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i8 = R.id.rl_logo_home_card_featured_item;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_home_card_featured_item);
                        if (relativeLayout2 != null) {
                            i8 = R.id.tv_desc_home_card_featured_item;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_home_card_featured_item);
                            if (textView != null) {
                                i8 = R.id.tv_desc_home_card_featured_item_holder;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_home_card_featured_item_holder);
                                if (textView2 != null) {
                                    i8 = R.id.tv_name_home_card_featured_item;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_home_card_featured_item);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_name_home_card_featured_item_holder;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_home_card_featured_item_holder);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_progress_home_card_featured_item;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_home_card_featured_item);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_status_home_card_featured_item;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_home_card_featured_item);
                                                if (textView6 != null) {
                                                    i8 = R.id.tv_verified_home_card_featured_item;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_home_card_featured_item);
                                                    if (textView7 != null) {
                                                        return new E(relativeLayout, imageView, imageView2, linearLayout, progressBar, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static E c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.home_card_featured_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10089a;
    }
}
