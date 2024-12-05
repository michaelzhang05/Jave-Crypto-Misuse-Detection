package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1370f0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10562a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f10563b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10564c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10565d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10566e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10567f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10568g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10569h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10570i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f10571j;

    /* renamed from: k, reason: collision with root package name */
    public final K f10572k;

    /* renamed from: l, reason: collision with root package name */
    public final NestedScrollView f10573l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f10574m;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f10575n;

    /* renamed from: o, reason: collision with root package name */
    public final Toolbar f10576o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10577p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10578q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10579r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10580s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10581t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10582u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10583v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10584w;

    private C1370f0(RelativeLayout relativeLayout, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, K k8, NestedScrollView nestedScrollView, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f10562a = relativeLayout;
        this.f10563b = editText;
        this.f10564c = imageView;
        this.f10565d = imageView2;
        this.f10566e = imageView3;
        this.f10567f = imageView4;
        this.f10568g = imageView5;
        this.f10569h = imageView6;
        this.f10570i = linearLayout;
        this.f10571j = linearLayout2;
        this.f10572k = k8;
        this.f10573l = nestedScrollView;
        this.f10574m = relativeLayout2;
        this.f10575n = recyclerView;
        this.f10576o = toolbar;
        this.f10577p = textView;
        this.f10578q = textView2;
        this.f10579r = textView3;
        this.f10580s = textView4;
        this.f10581t = textView5;
        this.f10582u = textView6;
        this.f10583v = textView7;
        this.f10584w = textView8;
    }

    public static C1370f0 a(View view) {
        int i8 = R.id.et_review;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_review);
        if (editText != null) {
            i8 = R.id.iv_app_icon_reviews;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_app_icon_reviews);
            if (imageView != null) {
                i8 = R.id.iv_star1_reviews;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_reviews);
                if (imageView2 != null) {
                    i8 = R.id.iv_star2_reviews;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_reviews);
                    if (imageView3 != null) {
                        i8 = R.id.iv_star3_reviews;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_reviews);
                        if (imageView4 != null) {
                            i8 = R.id.iv_star4_reviews;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_reviews);
                            if (imageView5 != null) {
                                i8 = R.id.iv_star5_reviews;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_reviews);
                                if (imageView6 != null) {
                                    i8 = R.id.ll_header_log_in_reviews;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_header_log_in_reviews);
                                    if (linearLayout != null) {
                                        i8 = R.id.ll_order_reviews;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_order_reviews);
                                        if (linearLayout2 != null) {
                                            i8 = R.id.loading_view_reviews;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_reviews);
                                            if (findChildViewById != null) {
                                                K a8 = K.a(findChildViewById);
                                                i8 = R.id.nsv_reviews;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_reviews);
                                                if (nestedScrollView != null) {
                                                    i8 = R.id.rl_header_reviews;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header_reviews);
                                                    if (relativeLayout != null) {
                                                        i8 = R.id.rv_reviews;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_reviews);
                                                        if (recyclerView != null) {
                                                            i8 = R.id.toolbar_reviews;
                                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_reviews);
                                                            if (toolbar != null) {
                                                                i8 = R.id.tv_app_author_reviews;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_author_reviews);
                                                                if (textView != null) {
                                                                    i8 = R.id.tv_app_name_reviews;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_reviews);
                                                                    if (textView2 != null) {
                                                                        i8 = R.id.tv_app_version_reviews;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_version_reviews);
                                                                        if (textView3 != null) {
                                                                            i8 = R.id.tv_order_by_best_reviews;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_order_by_best_reviews);
                                                                            if (textView4 != null) {
                                                                                i8 = R.id.tv_order_by_date_reviews;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_order_by_date_reviews);
                                                                                if (textView5 != null) {
                                                                                    i8 = R.id.tv_order_by_most_reviews;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_order_by_most_reviews);
                                                                                    if (textView6 != null) {
                                                                                        i8 = R.id.tv_send_reviews;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_send_reviews);
                                                                                        if (textView7 != null) {
                                                                                            i8 = R.id.tv_toolbar_reviews;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_reviews);
                                                                                            if (textView8 != null) {
                                                                                                return new C1370f0((RelativeLayout) view, editText, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, a8, nestedScrollView, relativeLayout, recyclerView, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static C1370f0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1370f0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.reviews_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10562a;
    }
}
