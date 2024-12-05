package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class I implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11797a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f11798b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f11799c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f11800d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f11801e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f11802f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f11803g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f11804h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f11805i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f11806j;

    private I(RelativeLayout relativeLayout, LinearLayout linearLayout, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f11797a = relativeLayout;
        this.f11798b = linearLayout;
        this.f11799c = toolbar;
        this.f11800d = textView;
        this.f11801e = textView2;
        this.f11802f = textView3;
        this.f11803g = textView4;
        this.f11804h = textView5;
        this.f11805i = textView6;
        this.f11806j = textView7;
    }

    public static I a(View view) {
        int i8 = R.id.ll_dev_on_board_information_activity;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dev_on_board_information_activity);
        if (linearLayout != null) {
            i8 = R.id.tb_information_activity;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.tb_information_activity);
            if (toolbar != null) {
                i8 = R.id.tv_badge_information_activity;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_badge_information_activity);
                if (textView != null) {
                    i8 = R.id.tv_description_information_activity;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_information_activity);
                    if (textView2 != null) {
                        i8 = R.id.tv_first_information_activity;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_information_activity);
                        if (textView3 != null) {
                            i8 = R.id.tv_more_info_information_activity;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_more_info_information_activity);
                            if (textView4 != null) {
                                i8 = R.id.tv_second_information_activity;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_information_activity);
                                if (textView5 != null) {
                                    i8 = R.id.tv_third_information_activity;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_third_information_activity);
                                    if (textView6 != null) {
                                        i8 = R.id.tv_title_information_activity;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_information_activity);
                                        if (textView7 != null) {
                                            return new I((RelativeLayout) view, linearLayout, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static I c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static I d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.information_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f11797a;
    }
}
