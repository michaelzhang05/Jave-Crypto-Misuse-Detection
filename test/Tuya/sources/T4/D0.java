package T4;

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

/* loaded from: classes4.dex */
public final class D0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f10058A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f10059B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f10060C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f10061D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f10062E;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10063a;

    /* renamed from: b, reason: collision with root package name */
    public final D f10064b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10065c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10066d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10067e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10068f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10069g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10070h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10071i;

    /* renamed from: j, reason: collision with root package name */
    public final K f10072j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f10073k;

    /* renamed from: l, reason: collision with root package name */
    public final RelativeLayout f10074l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f10075m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f10076n;

    /* renamed from: o, reason: collision with root package name */
    public final ScrollView f10077o;

    /* renamed from: p, reason: collision with root package name */
    public final Toolbar f10078p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10079q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10080r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10081s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10082t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10083u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10084v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10085w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f10086x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10087y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f10088z;

    private D0(RelativeLayout relativeLayout, D d8, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, K k8, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, ScrollView scrollView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f10063a = relativeLayout;
        this.f10064b = d8;
        this.f10065c = imageView;
        this.f10066d = imageView2;
        this.f10067e = imageView3;
        this.f10068f = imageView4;
        this.f10069g = imageView5;
        this.f10070h = imageView6;
        this.f10071i = linearLayout;
        this.f10072j = k8;
        this.f10073k = relativeLayout2;
        this.f10074l = relativeLayout3;
        this.f10075m = relativeLayout4;
        this.f10076n = relativeLayout5;
        this.f10077o = scrollView;
        this.f10078p = toolbar;
        this.f10079q = textView;
        this.f10080r = textView2;
        this.f10081s = textView3;
        this.f10082t = textView4;
        this.f10083u = textView5;
        this.f10084v = textView6;
        this.f10085w = textView7;
        this.f10086x = textView8;
        this.f10087y = textView9;
        this.f10088z = textView10;
        this.f10058A = textView11;
        this.f10059B = textView12;
        this.f10060C = textView13;
        this.f10061D = textView14;
        this.f10062E = textView15;
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
        return this.f10063a;
    }
}
