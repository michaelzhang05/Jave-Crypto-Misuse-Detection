package T4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1371g implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10585a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10586b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10587c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10588d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10589e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10590f;

    /* renamed from: g, reason: collision with root package name */
    public final ProgressBar f10591g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10592h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10593i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f10594j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10595k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10596l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10597m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10598n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10599o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10600p;

    /* renamed from: q, reason: collision with root package name */
    public final View f10601q;

    private C1371g(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.f10585a = relativeLayout;
        this.f10586b = imageView;
        this.f10587c = imageView2;
        this.f10588d = imageView3;
        this.f10589e = linearLayout;
        this.f10590f = relativeLayout2;
        this.f10591g = progressBar;
        this.f10592h = relativeLayout3;
        this.f10593i = relativeLayout4;
        this.f10594j = relativeLayout5;
        this.f10595k = textView;
        this.f10596l = textView2;
        this.f10597m = textView3;
        this.f10598n = textView4;
        this.f10599o = textView5;
        this.f10600p = textView6;
        this.f10601q = view;
    }

    public static C1371g a(View view) {
        int i8 = R.id.iv_logo_app_info_selected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app_info_selected);
        if (imageView != null) {
            i8 = R.id.iv_valoration_app_info_selected;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_valoration_app_info_selected);
            if (imageView2 != null) {
                i8 = R.id.iv_wishlist_action_app_info_selected;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_wishlist_action_app_info_selected);
                if (imageView3 != null) {
                    i8 = R.id.ll_download_app_info_selected;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_download_app_info_selected);
                    if (linearLayout != null) {
                        i8 = R.id.ll_valoration_app_info_selected;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_valoration_app_info_selected);
                        if (relativeLayout != null) {
                            i8 = R.id.pb_progress_app_info_selected;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_app_info_selected);
                            if (progressBar != null) {
                                i8 = R.id.rl_actions_app_info_selected;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_actions_app_info_selected);
                                if (relativeLayout2 != null) {
                                    i8 = R.id.rl_app_info_selected;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_app_info_selected);
                                    if (relativeLayout3 != null) {
                                        i8 = R.id.rl_logo_app_info_selected;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_app_info_selected);
                                        if (relativeLayout4 != null) {
                                            i8 = R.id.tv_action_app_info_selected;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_app_info_selected);
                                            if (textView != null) {
                                                i8 = R.id.tv_author_app_info_selected;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_app_info_selected);
                                                if (textView2 != null) {
                                                    i8 = R.id.tv_name_app_info_selected;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_app_info_selected);
                                                    if (textView3 != null) {
                                                        i8 = R.id.tv_progress_app_info_selected;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_app_info_selected);
                                                        if (textView4 != null) {
                                                            i8 = R.id.tv_valoration_app_info_selected;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_valoration_app_info_selected);
                                                            if (textView5 != null) {
                                                                i8 = R.id.tv_verified_app_info_selected;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_app_info_selected);
                                                                if (textView6 != null) {
                                                                    i8 = R.id.v_background_app_info_selected;
                                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_background_app_info_selected);
                                                                    if (findChildViewById != null) {
                                                                        return new C1371g((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, relativeLayout, progressBar, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5, textView6, findChildViewById);
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

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10585a;
    }
}
