package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* loaded from: classes5.dex */
public final class y0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f12647A;

    /* renamed from: B, reason: collision with root package name */
    public final UsernameTextView f12648B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f12649C;

    /* renamed from: D, reason: collision with root package name */
    public final z0 f12650D;

    /* renamed from: E, reason: collision with root package name */
    public final z0 f12651E;

    /* renamed from: F, reason: collision with root package name */
    public final z0 f12652F;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12653a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f12654b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f12655c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12656d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12657e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f12658f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f12659g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f12660h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f12661i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f12662j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f12663k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f12664l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f12665m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f12666n;

    /* renamed from: o, reason: collision with root package name */
    public final RelativeLayout f12667o;

    /* renamed from: p, reason: collision with root package name */
    public final RelativeLayout f12668p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f12669q;

    /* renamed from: r, reason: collision with root package name */
    public final ScrollView f12670r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f12671s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f12672t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f12673u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f12674v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f12675w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f12676x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f12677y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f12678z;

    private y0(RelativeLayout relativeLayout, z0 z0Var, GridLayout gridLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, z0 z0Var2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, z0 z0Var3, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, UsernameTextView usernameTextView, TextView textView10, z0 z0Var4, z0 z0Var5, z0 z0Var6) {
        this.f12653a = relativeLayout;
        this.f12654b = z0Var;
        this.f12655c = gridLayout;
        this.f12656d = imageView;
        this.f12657e = imageView2;
        this.f12658f = imageView3;
        this.f12659g = linearLayout;
        this.f12660h = linearLayout2;
        this.f12661i = linearLayout3;
        this.f12662j = linearLayout4;
        this.f12663k = linearLayout5;
        this.f12664l = linearLayout6;
        this.f12665m = z0Var2;
        this.f12666n = relativeLayout2;
        this.f12667o = relativeLayout3;
        this.f12668p = relativeLayout4;
        this.f12669q = z0Var3;
        this.f12670r = scrollView;
        this.f12671s = textView;
        this.f12672t = textView2;
        this.f12673u = textView3;
        this.f12674v = textView4;
        this.f12675w = textView5;
        this.f12676x = textView6;
        this.f12677y = textView7;
        this.f12678z = textView8;
        this.f12647A = textView9;
        this.f12648B = usernameTextView;
        this.f12649C = textView10;
        this.f12650D = z0Var4;
        this.f12651E = z0Var5;
        this.f12652F = z0Var6;
    }

    public static y0 a(View view) {
        int i8 = R.id.downloads_user_fragment;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.downloads_user_fragment);
        if (findChildViewById != null) {
            z0 a8 = z0.a(findChildViewById);
            i8 = R.id.gl_user_fragment;
            GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.gl_user_fragment);
            if (gridLayout != null) {
                i8 = R.id.iv_dark_mode_user_fragment;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dark_mode_user_fragment);
                if (imageView != null) {
                    i8 = R.id.iv_support_user_fragment;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_support_user_fragment);
                    if (imageView2 != null) {
                        i8 = R.id.iv_user_avatar_user_fragment;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar_user_fragment);
                        if (imageView3 != null) {
                            i8 = R.id.ll_manage_subscription_user_fragment;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_manage_subscription_user_fragment);
                            if (linearLayout != null) {
                                i8 = R.id.ll_notifications_user_fragment;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_notifications_user_fragment);
                                if (linearLayout2 != null) {
                                    i8 = R.id.ll_security_user_fragment;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_security_user_fragment);
                                    if (linearLayout3 != null) {
                                        i8 = R.id.ll_settings_user_fragment;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_settings_user_fragment);
                                        if (linearLayout4 != null) {
                                            i8 = R.id.ll_support_user_fragment;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_support_user_fragment);
                                            if (linearLayout5 != null) {
                                                i8 = R.id.ll_user_fragment;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_user_fragment);
                                                if (linearLayout6 != null) {
                                                    i8 = R.id.myapps_user_fragment;
                                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.myapps_user_fragment);
                                                    if (findChildViewById2 != null) {
                                                        z0 a9 = z0.a(findChildViewById2);
                                                        i8 = R.id.rl_toolbar_user_fragment;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_toolbar_user_fragment);
                                                        if (relativeLayout != null) {
                                                            i8 = R.id.rl_user_avatar_user_fragment;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_avatar_user_fragment);
                                                            if (relativeLayout2 != null) {
                                                                i8 = R.id.rl_user_info_user_fragment;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_info_user_fragment);
                                                                if (relativeLayout3 != null) {
                                                                    i8 = R.id.rollback_user_fragment;
                                                                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.rollback_user_fragment);
                                                                    if (findChildViewById3 != null) {
                                                                        z0 a10 = z0.a(findChildViewById3);
                                                                        i8 = R.id.sv_user_fragment;
                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_user_fragment);
                                                                        if (scrollView != null) {
                                                                            i8 = R.id.tv_edit_profile_user_fragment;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_profile_user_fragment);
                                                                            if (textView != null) {
                                                                                i8 = R.id.tv_log_out_user_fragment;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_log_out_user_fragment);
                                                                                if (textView2 != null) {
                                                                                    i8 = R.id.tv_manage_subscription_user_fragment;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_manage_subscription_user_fragment);
                                                                                    if (textView3 != null) {
                                                                                        i8 = R.id.tv_notifications_user_fragment;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_notifications_user_fragment);
                                                                                        if (textView4 != null) {
                                                                                            i8 = R.id.tv_registered_ago_user_fragment;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_registered_ago_user_fragment);
                                                                                            if (textView5 != null) {
                                                                                                i8 = R.id.tv_reviews_counter_user_fragment;
                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_user_fragment);
                                                                                                if (textView6 != null) {
                                                                                                    i8 = R.id.tv_security_user_fragment;
                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_security_user_fragment);
                                                                                                    if (textView7 != null) {
                                                                                                        i8 = R.id.tv_settings_user_fragment;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_settings_user_fragment);
                                                                                                        if (textView8 != null) {
                                                                                                            i8 = R.id.tv_support_user_fragment;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_support_user_fragment);
                                                                                                            if (textView9 != null) {
                                                                                                                i8 = R.id.tv_username_user_fragment;
                                                                                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_user_fragment);
                                                                                                                if (usernameTextView != null) {
                                                                                                                    i8 = R.id.tv_web_user_fragment;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_web_user_fragment);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i8 = R.id.upcoming_releases_user_fragment;
                                                                                                                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.upcoming_releases_user_fragment);
                                                                                                                        if (findChildViewById4 != null) {
                                                                                                                            z0 a11 = z0.a(findChildViewById4);
                                                                                                                            i8 = R.id.updates_user_fragment;
                                                                                                                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.updates_user_fragment);
                                                                                                                            if (findChildViewById5 != null) {
                                                                                                                                z0 a12 = z0.a(findChildViewById5);
                                                                                                                                i8 = R.id.wishlist_user_fragment;
                                                                                                                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.wishlist_user_fragment);
                                                                                                                                if (findChildViewById6 != null) {
                                                                                                                                    return new y0((RelativeLayout) view, a8, gridLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, a9, relativeLayout, relativeLayout2, relativeLayout3, a10, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, usernameTextView, textView10, a11, a12, z0.a(findChildViewById6));
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

    public static y0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_fragment, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12653a;
    }
}
