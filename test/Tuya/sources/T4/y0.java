package T4;

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

/* loaded from: classes4.dex */
public final class y0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f10990A;

    /* renamed from: B, reason: collision with root package name */
    public final UsernameTextView f10991B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f10992C;

    /* renamed from: D, reason: collision with root package name */
    public final z0 f10993D;

    /* renamed from: E, reason: collision with root package name */
    public final z0 f10994E;

    /* renamed from: F, reason: collision with root package name */
    public final z0 f10995F;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10996a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f10997b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f10998c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10999d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f11000e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f11001f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f11002g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f11003h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f11004i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f11005j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f11006k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f11007l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f11008m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f11009n;

    /* renamed from: o, reason: collision with root package name */
    public final RelativeLayout f11010o;

    /* renamed from: p, reason: collision with root package name */
    public final RelativeLayout f11011p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f11012q;

    /* renamed from: r, reason: collision with root package name */
    public final ScrollView f11013r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f11014s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f11015t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f11016u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f11017v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f11018w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f11019x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f11020y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f11021z;

    private y0(RelativeLayout relativeLayout, z0 z0Var, GridLayout gridLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, z0 z0Var2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, z0 z0Var3, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, UsernameTextView usernameTextView, TextView textView10, z0 z0Var4, z0 z0Var5, z0 z0Var6) {
        this.f10996a = relativeLayout;
        this.f10997b = z0Var;
        this.f10998c = gridLayout;
        this.f10999d = imageView;
        this.f11000e = imageView2;
        this.f11001f = imageView3;
        this.f11002g = linearLayout;
        this.f11003h = linearLayout2;
        this.f11004i = linearLayout3;
        this.f11005j = linearLayout4;
        this.f11006k = linearLayout5;
        this.f11007l = linearLayout6;
        this.f11008m = z0Var2;
        this.f11009n = relativeLayout2;
        this.f11010o = relativeLayout3;
        this.f11011p = relativeLayout4;
        this.f11012q = z0Var3;
        this.f11013r = scrollView;
        this.f11014s = textView;
        this.f11015t = textView2;
        this.f11016u = textView3;
        this.f11017v = textView4;
        this.f11018w = textView5;
        this.f11019x = textView6;
        this.f11020y = textView7;
        this.f11021z = textView8;
        this.f10990A = textView9;
        this.f10991B = usernameTextView;
        this.f10992C = textView10;
        this.f10993D = z0Var4;
        this.f10994E = z0Var5;
        this.f10995F = z0Var6;
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
        return this.f10996a;
    }
}
