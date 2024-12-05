package T4;

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
import com.uptodown.util.views.UsernameTextView;

/* renamed from: T4.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1366d0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10487a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10488b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10489c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10490d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10491e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10492f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10493g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10494h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f10495i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f10496j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10497k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f10498l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10499m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10500n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10501o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10502p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10503q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10504r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10505s;

    /* renamed from: t, reason: collision with root package name */
    public final UsernameTextView f10506t;

    private C1366d0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, UsernameTextView usernameTextView) {
        this.f10487a = relativeLayout;
        this.f10488b = imageView;
        this.f10489c = imageView2;
        this.f10490d = imageView3;
        this.f10491e = imageView4;
        this.f10492f = imageView5;
        this.f10493g = imageView6;
        this.f10494h = imageView7;
        this.f10495i = imageView8;
        this.f10496j = imageView9;
        this.f10497k = linearLayout;
        this.f10498l = linearLayout2;
        this.f10499m = linearLayout3;
        this.f10500n = textView;
        this.f10501o = textView2;
        this.f10502p = textView3;
        this.f10503q = textView4;
        this.f10504r = textView5;
        this.f10505s = textView6;
        this.f10506t = usernameTextView;
    }

    public static C1366d0 a(View view) {
        int i8 = R.id.iv_author_verified_review;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_author_verified_review);
        if (imageView != null) {
            i8 = R.id.iv_avatar_review;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_review);
            if (imageView2 != null) {
                i8 = R.id.iv_likes_counter_review;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_likes_counter_review);
                if (imageView3 != null) {
                    i8 = R.id.iv_star1_review;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_review);
                    if (imageView4 != null) {
                        i8 = R.id.iv_star2_review;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_review);
                        if (imageView5 != null) {
                            i8 = R.id.iv_star3_review;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_review);
                            if (imageView6 != null) {
                                i8 = R.id.iv_star4_review;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_review);
                                if (imageView7 != null) {
                                    i8 = R.id.iv_star5_review;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_review);
                                    if (imageView8 != null) {
                                        i8 = R.id.iv_turbo_mark_review;
                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_review);
                                        if (imageView9 != null) {
                                            i8 = R.id.ll_likes_review;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_likes_review);
                                            if (linearLayout != null) {
                                                i8 = R.id.ll_reviews_counter_review;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_review);
                                                if (linearLayout2 != null) {
                                                    i8 = R.id.ll_stars_review;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stars_review);
                                                    if (linearLayout3 != null) {
                                                        i8 = R.id.tv_body_review;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_body_review);
                                                        if (textView != null) {
                                                            i8 = R.id.tv_date_review;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_review);
                                                            if (textView2 != null) {
                                                                i8 = R.id.tv_likes_counter_review;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_likes_counter_review);
                                                                if (textView3 != null) {
                                                                    i8 = R.id.tv_reply_review;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reply_review);
                                                                    if (textView4 != null) {
                                                                        i8 = R.id.tv_reviews_counter_review;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_review);
                                                                        if (textView5 != null) {
                                                                            i8 = R.id.tv_show_more_review;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_more_review);
                                                                            if (textView6 != null) {
                                                                                i8 = R.id.tv_username_review;
                                                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_review);
                                                                                if (usernameTextView != null) {
                                                                                    return new C1366d0((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, usernameTextView);
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

    public static C1366d0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1366d0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.review, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10487a;
    }
}
