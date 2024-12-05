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

/* renamed from: T4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1367e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10507a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10508b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10509c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10510d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10511e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f10512f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10513g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f10514h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10515i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f10516j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f10517k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10518l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10519m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10520n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10521o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10522p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10523q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10524r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10525s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10526t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10527u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10528v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10529w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f10530x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10531y;

    /* renamed from: z, reason: collision with root package name */
    public final View f10532z;

    private C1367e(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view) {
        this.f10507a = relativeLayout;
        this.f10508b = imageView;
        this.f10509c = linearLayout;
        this.f10510d = linearLayout2;
        this.f10511e = linearLayout3;
        this.f10512f = linearLayout4;
        this.f10513g = linearLayout5;
        this.f10514h = progressBar;
        this.f10515i = relativeLayout2;
        this.f10516j = relativeLayout3;
        this.f10517k = relativeLayout4;
        this.f10518l = textView;
        this.f10519m = textView2;
        this.f10520n = textView3;
        this.f10521o = textView4;
        this.f10522p = textView5;
        this.f10523q = textView6;
        this.f10524r = textView7;
        this.f10525s = textView8;
        this.f10526t = textView9;
        this.f10527u = textView10;
        this.f10528v = textView11;
        this.f10529w = textView12;
        this.f10530x = textView13;
        this.f10531y = textView14;
        this.f10532z = view;
    }

    public static C1367e a(View view) {
        int i8 = R.id.iv_logo_app_detail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app_detail);
        if (imageView != null) {
            i8 = R.id.ll_download_info_app_detail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_download_info_app_detail);
            if (linearLayout != null) {
                i8 = R.id.ll_downloads_counter_app_detail;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_downloads_counter_app_detail);
                if (linearLayout2 != null) {
                    i8 = R.id.ll_info_app_detail;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_app_detail);
                    if (linearLayout3 != null) {
                        i8 = R.id.ll_last_update_app_detail;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_last_update_app_detail);
                        if (linearLayout4 != null) {
                            i8 = R.id.ll_valoration_app_detail;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_valoration_app_detail);
                            if (linearLayout5 != null) {
                                i8 = R.id.pb_progress_app_detail;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_app_detail);
                                if (progressBar != null) {
                                    i8 = R.id.rl_head_main_info;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_head_main_info);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_logo_app_detail;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_app_detail);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_valoration_app_detail;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_valoration_app_detail);
                                            if (relativeLayout3 != null) {
                                                i8 = R.id.tv_author_app_detail;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_app_detail);
                                                if (textView != null) {
                                                    i8 = R.id.tv_author_onboard_badge;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_onboard_badge);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_downloads_counter_app_detail;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_counter_app_detail);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_downloads_label_app_detail;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_label_app_detail);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_iaps_badge_app_detail;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_iaps_badge_app_detail);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_last_update_app_detail;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_app_detail);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_last_update_label_app_detail;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_label_app_detail);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.tv_name_app_detail;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_app_detail);
                                                                            if (textView8 != null) {
                                                                                i8 = R.id.tv_phase_app_detail;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_phase_app_detail);
                                                                                if (textView9 != null) {
                                                                                    i8 = R.id.tv_progress_app_detail;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_app_detail);
                                                                                    if (textView10 != null) {
                                                                                        i8 = R.id.tv_reviews_counter_app_detail;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_app_detail);
                                                                                        if (textView11 != null) {
                                                                                            i8 = R.id.tv_valoration_app_detail;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_valoration_app_detail);
                                                                                            if (textView12 != null) {
                                                                                                i8 = R.id.tv_verified_app_detail;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_app_detail);
                                                                                                if (textView13 != null) {
                                                                                                    i8 = R.id.tv_version_app_detail;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_app_detail);
                                                                                                    if (textView14 != null) {
                                                                                                        i8 = R.id.v_separator_downloads_app_detail;
                                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_separator_downloads_app_detail);
                                                                                                        if (findChildViewById != null) {
                                                                                                            return new C1367e((RelativeLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, progressBar, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, findChildViewById);
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

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10507a;
    }
}
