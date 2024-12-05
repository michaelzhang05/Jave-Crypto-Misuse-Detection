package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1495t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12548a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12549b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12550c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12551d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12552e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12553f;

    private C1495t(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f12548a = linearLayout;
        this.f12549b = textView;
        this.f12550c = textView2;
        this.f12551d = textView3;
        this.f12552e = textView4;
        this.f12553f = textView5;
    }

    public static C1495t a(View view) {
        int i8 = R.id.tv_open_app_details_positive;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_app_details_positive);
        if (textView != null) {
            i8 = R.id.tv_positive_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_positive_title);
            if (textView2 != null) {
                i8 = R.id.tv_rollback_positive;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rollback_positive);
                if (textView3 != null) {
                    i8 = R.id.tv_uninstall_positive;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_uninstall_positive);
                    if (textView4 != null) {
                        i8 = R.id.tv_virus_report_positive;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_virus_report_positive);
                        if (textView5 != null) {
                            return new C1495t((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1495t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1495t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_positive_selected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12548a;
    }
}
