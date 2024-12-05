package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1391y implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10974a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10975b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10976c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10977d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10978e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10979f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10980g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10981h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10982i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10983j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10984k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10985l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10986m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10987n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10988o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10989p;

    private C1391y(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f10974a = linearLayout;
        this.f10975b = textView;
        this.f10976c = textView2;
        this.f10977d = textView3;
        this.f10978e = textView4;
        this.f10979f = textView5;
        this.f10980g = textView6;
        this.f10981h = textView7;
        this.f10982i = textView8;
        this.f10983j = textView9;
        this.f10984k = textView10;
        this.f10985l = textView11;
        this.f10986m = textView12;
        this.f10987n = textView13;
        this.f10988o = textView14;
        this.f10989p = textView15;
    }

    public static C1391y a(View view) {
        int i8 = R.id.tv_app_installed_details;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_installed_details);
        if (textView != null) {
            i8 = R.id.tv_backup;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_backup);
            if (textView2 != null) {
                i8 = R.id.tv_check_updates;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_check_updates);
                if (textView3 != null) {
                    i8 = R.id.tv_exclude;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exclude);
                    if (textView4 != null) {
                        i8 = R.id.tv_ignore_version;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ignore_version);
                        if (textView5 != null) {
                            i8 = R.id.tv_nsd_send;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nsd_send);
                            if (textView6 != null) {
                                i8 = R.id.tv_old_versions;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_old_versions);
                                if (textView7 != null) {
                                    i8 = R.id.tv_open;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open);
                                    if (textView8 != null) {
                                        i8 = R.id.tv_see_on_uptodown;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_see_on_uptodown);
                                        if (textView9 != null) {
                                            i8 = R.id.tv_share;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_share);
                                            if (textView10 != null) {
                                                i8 = R.id.tv_title_das;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_das);
                                                if (textView11 != null) {
                                                    i8 = R.id.tv_uninstall;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uninstall);
                                                    if (textView12 != null) {
                                                        i8 = R.id.tv_update;
                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_update);
                                                        if (textView13 != null) {
                                                            i8 = R.id.tv_version_details;
                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_details);
                                                            if (textView14 != null) {
                                                                i8 = R.id.tv_virustotal_report;
                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_virustotal_report);
                                                                if (textView15 != null) {
                                                                    return new C1391y((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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

    public static C1391y c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1391y d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialogo_app_selected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10974a;
    }
}
