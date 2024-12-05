package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1492p implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12449a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12450b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12451c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12452d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12453e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12454f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12455g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12456h;

    private C1492p(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f12449a = linearLayout;
        this.f12450b = textView;
        this.f12451c = textView2;
        this.f12452d = textView3;
        this.f12453e = textView4;
        this.f12454f = textView5;
        this.f12455g = textView6;
        this.f12456h = textView7;
    }

    public static C1492p a(View view) {
        int i8 = R.id.tv_app_details_ddo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_details_ddo);
        if (textView != null) {
            i8 = R.id.tv_delete_ddo;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delete_ddo);
            if (textView2 != null) {
                i8 = R.id.tv_open_containing_folder_ddo;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_containing_folder_ddo);
                if (textView3 != null) {
                    i8 = R.id.tv_open_ddo;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_ddo);
                    if (textView4 != null) {
                        i8 = R.id.tv_select_ddo;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_select_ddo);
                        if (textView5 != null) {
                            i8 = R.id.tv_share_ddo;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_share_ddo);
                            if (textView6 != null) {
                                i8 = R.id.tv_title_ddo;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_ddo);
                                if (textView7 != null) {
                                    return new C1492p((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1492p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1492p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_options, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12449a;
    }
}
