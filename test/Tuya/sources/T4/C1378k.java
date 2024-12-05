package T4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1378k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10715a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10716b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10717c;

    /* renamed from: d, reason: collision with root package name */
    public final View f10718d;

    /* renamed from: e, reason: collision with root package name */
    public final View f10719e;

    /* renamed from: f, reason: collision with root package name */
    public final View f10720f;

    /* renamed from: g, reason: collision with root package name */
    public final View f10721g;

    /* renamed from: h, reason: collision with root package name */
    public final View f10722h;

    /* renamed from: i, reason: collision with root package name */
    public final View f10723i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10724j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10725k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10726l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10727m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10728n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10729o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10730p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10731q;

    private C1378k(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, View view, View view2, View view3, View view4, View view5, View view6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f10715a = linearLayout;
        this.f10716b = linearLayout2;
        this.f10717c = linearLayout3;
        this.f10718d = view;
        this.f10719e = view2;
        this.f10720f = view3;
        this.f10721g = view4;
        this.f10722h = view5;
        this.f10723i = view6;
        this.f10724j = textView;
        this.f10725k = textView2;
        this.f10726l = textView3;
        this.f10727m = textView4;
        this.f10728n = textView5;
        this.f10729o = textView6;
        this.f10730p = textView7;
        this.f10731q = textView8;
    }

    public static C1378k a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.ll_reviews_counter_chart;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_chart);
        if (linearLayout2 != null) {
            i8 = R.id.star1_graphical_value_app_detail;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.star1_graphical_value_app_detail);
            if (findChildViewById != null) {
                i8 = R.id.star2_graphical_value_app_detail;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.star2_graphical_value_app_detail);
                if (findChildViewById2 != null) {
                    i8 = R.id.star3_graphical_value_app_detail;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.star3_graphical_value_app_detail);
                    if (findChildViewById3 != null) {
                        i8 = R.id.star4_graphical_value_app_detail;
                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.star4_graphical_value_app_detail);
                        if (findChildViewById4 != null) {
                            i8 = R.id.star5_graphical_value_app_detail;
                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.star5_graphical_value_app_detail);
                            if (findChildViewById5 != null) {
                                i8 = R.id.star5_graphical_value_app_detail_background;
                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.star5_graphical_value_app_detail_background);
                                if (findChildViewById6 != null) {
                                    i8 = R.id.tv_chart_1_value;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_1_value);
                                    if (textView != null) {
                                        i8 = R.id.tv_chart_2_value;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_2_value);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_chart_3_value;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_3_value);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_chart_4_value;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_4_value);
                                                if (textView4 != null) {
                                                    i8 = R.id.tv_chart_5_value;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_5_value);
                                                    if (textView5 != null) {
                                                        i8 = R.id.tv_review_rating_app_detail;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_review_rating_app_detail);
                                                        if (textView6 != null) {
                                                            i8 = R.id.tv_reviews_count_app_detail;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_count_app_detail);
                                                            if (textView7 != null) {
                                                                i8 = R.id.tv_reviews_title_app_detail;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_title_app_detail);
                                                                if (textView8 != null) {
                                                                    return new C1378k(linearLayout, linearLayout, linearLayout2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public LinearLayout getRoot() {
        return this.f10715a;
    }
}
