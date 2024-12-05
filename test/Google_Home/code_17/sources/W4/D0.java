package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class D0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f11715A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f11716B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f11717C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f11718D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f11719E;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11720a;

    /* renamed from: b, reason: collision with root package name */
    public final D f11721b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f11722c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f11723d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f11724e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f11725f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f11726g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f11727h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f11728i;

    /* renamed from: j, reason: collision with root package name */
    public final K f11729j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f11730k;

    /* renamed from: l, reason: collision with root package name */
    public final RelativeLayout f11731l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f11732m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f11733n;

    /* renamed from: o, reason: collision with root package name */
    public final ScrollView f11734o;

    /* renamed from: p, reason: collision with root package name */
    public final Toolbar f11735p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f11736q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f11737r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f11738s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f11739t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f11740u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f11741v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f11742w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f11743x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f11744y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f11745z;

    private D0(RelativeLayout relativeLayout, D d8, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, K k8, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, ScrollView scrollView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f11720a = relativeLayout;
        this.f11721b = d8;
        this.f11722c = imageView;
        this.f11723d = imageView2;
        this.f11724e = imageView3;
        this.f11725f = imageView4;
        this.f11726g = imageView5;
        this.f11727h = imageView6;
        this.f11728i = linearLayout;
        this.f11729j = k8;
        this.f11730k = relativeLayout2;
        this.f11731l = relativeLayout3;
        this.f11732m = relativeLayout4;
        this.f11733n = relativeLayout5;
        this.f11734o = scrollView;
        this.f11735p = toolbar;
        this.f11736q = textView;
        this.f11737r = textView2;
        this.f11738s = textView3;
        this.f11739t = textView4;
        this.f11740u = textView5;
        this.f11741v = textView6;
        this.f11742w = textView7;
        this.f11743x = textView8;
        this.f11744y = textView9;
        this.f11745z = textView10;
        this.f11715A = textView11;
        this.f11716B = textView12;
        this.f11717C = textView13;
        this.f11718D = textView14;
        this.f11719E = textView15;
    }

    public static D0 a(View view) {
        int i8 = R.id.header_installed_app;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.header_installed_app);
        if (findChildViewById != null) {
            D a8 = D.a(findChildViewById);
            i8 = R.id.iv_correct_malware;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_malware);
            if (imageView != null) {
                i8 = R.id.iv_correct_spyware;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_spyware);
                if (imageView2 != null) {
                    i8 = R.id.iv_correct_virus;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_correct_virus);
                    if (imageView3 != null) {
                        i8 = R.id.iv_logo_uptodown_vtr;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_uptodown_vtr);
                        if (imageView4 != null) {
                            i8 = R.id.iv_sha256_vtr;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sha256_vtr);
                            if (imageView5 != null) {
                                i8 = R.id.iv_signature_vtr;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_signature_vtr);
                                if (imageView6 != null) {
                                    i8 = R.id.ll_container_scans_vtr;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_container_scans_vtr);
                                    if (linearLayout != null) {
                                        i8 = R.id.loading_view_virus_total_report;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_virus_total_report);
                                        if (findChildViewById2 != null) {
                                            K a9 = K.a(findChildViewById2);
                                            i8 = R.id.rl_container_result_clean;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_result_clean);
                                            if (relativeLayout != null) {
                                                i8 = R.id.rl_result_scan;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_result_scan);
                                                if (relativeLayout2 != null) {
                                                    i8 = R.id.rl_sha256_more_info;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_sha256_more_info);
                                                    if (relativeLayout3 != null) {
                                                        i8 = R.id.rl_signature_more_info;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_signature_more_info);
                                                        if (relativeLayout4 != null) {
                                                            i8 = R.id.sv_report_vtr;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_report_vtr);
                                                            if (scrollView != null) {
                                                                i8 = R.id.toolbar_vtr;
                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_vtr);
                                                                if (toolbar != null) {
                                                                    i8 = R.id.tv_full_report_vtr;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_full_report_vtr);
                                                                    if (textView != null) {
                                                                        i8 = R.id.tv_label_full_report_vtr;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_full_report_vtr);
                                                                        if (textView2 != null) {
                                                                            i8 = R.id.tv_last_scan_results;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_scan_results);
                                                                            if (textView3 != null) {
                                                                                i8 = R.id.tv_msg_results;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_results);
                                                                                if (textView4 != null) {
                                                                                    i8 = R.id.tv_no_data_vtr;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_vtr);
                                                                                    if (textView5 != null) {
                                                                                        i8 = R.id.tv_no_malware;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_malware);
                                                                                        if (textView6 != null) {
                                                                                            i8 = R.id.tv_no_spyware;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_spyware);
                                                                                            if (textView7 != null) {
                                                                                                i8 = R.id.tv_no_virus;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_virus);
                                                                                                if (textView8 != null) {
                                                                                                    i8 = R.id.tv_positives_results;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_positives_results);
                                                                                                    if (textView9 != null) {
                                                                                                        i8 = R.id.tv_sha256_label_vtr;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sha256_label_vtr);
                                                                                                        if (textView10 != null) {
                                                                                                            i8 = R.id.tv_sha256_value_vtr;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sha256_value_vtr);
                                                                                                            if (textView11 != null) {
                                                                                                                i8 = R.id.tv_signature_label_vtr;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_signature_label_vtr);
                                                                                                                if (textView12 != null) {
                                                                                                                    i8 = R.id.tv_signature_value_vtr;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_signature_value_vtr);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i8 = R.id.tv_toolbar_vtr;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_vtr);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i8 = R.id.vt_report_certified_by_uptodown;
                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.vt_report_certified_by_uptodown);
                                                                                                                            if (textView15 != null) {
                                                                                                                                return new D0((RelativeLayout) view, a8, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, a9, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, scrollView, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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

    public static D0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static D0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.virus_total_report, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f11720a;
    }
}
