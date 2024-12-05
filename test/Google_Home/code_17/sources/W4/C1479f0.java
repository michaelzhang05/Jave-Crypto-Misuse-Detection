package W4;

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

/* renamed from: W4.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1479f0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12219a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12220b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12221c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12222d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12223e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f12224f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f12225g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f12226h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f12227i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f12228j;

    /* renamed from: k, reason: collision with root package name */
    public final K f12229k;

    /* renamed from: l, reason: collision with root package name */
    public final NestedScrollView f12230l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f12231m;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f12232n;

    /* renamed from: o, reason: collision with root package name */
    public final Toolbar f12233o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f12234p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f12235q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f12236r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f12237s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f12238t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f12239u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f12240v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f12241w;

    private C1479f0(RelativeLayout relativeLayout, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, K k8, NestedScrollView nestedScrollView, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f12219a = relativeLayout;
        this.f12220b = editText;
        this.f12221c = imageView;
        this.f12222d = imageView2;
        this.f12223e = imageView3;
        this.f12224f = imageView4;
        this.f12225g = imageView5;
        this.f12226h = imageView6;
        this.f12227i = linearLayout;
        this.f12228j = linearLayout2;
        this.f12229k = k8;
        this.f12230l = nestedScrollView;
        this.f12231m = relativeLayout2;
        this.f12232n = recyclerView;
        this.f12233o = toolbar;
        this.f12234p = textView;
        this.f12235q = textView2;
        this.f12236r = textView3;
        this.f12237s = textView4;
        this.f12238t = textView5;
        this.f12239u = textView6;
        this.f12240v = textView7;
        this.f12241w = textView8;
    }

    public static C1479f0 a(View view) {
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
                                                                                                return new C1479f0((RelativeLayout) view, editText, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, a8, nestedScrollView, relativeLayout, recyclerView, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static C1479f0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1479f0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.reviews_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12219a;
    }
}
