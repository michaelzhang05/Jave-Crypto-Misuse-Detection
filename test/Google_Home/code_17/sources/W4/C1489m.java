package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1489m implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12411a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f12412b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f12413c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12414d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12415e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12416f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12417g;

    private C1489m(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12411a = linearLayout;
        this.f12412b = linearLayout2;
        this.f12413c = linearLayout3;
        this.f12414d = textView;
        this.f12415e = textView2;
        this.f12416f = textView3;
        this.f12417g = textView4;
    }

    public static C1489m a(View view) {
        int i8 = R.id.ll_password_edit_change_dialog;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_password_edit_change_dialog);
        if (linearLayout != null) {
            i8 = R.id.ll_username_edit_change_dialog;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_username_edit_change_dialog);
            if (linearLayout2 != null) {
                i8 = R.id.tv_cancel_change_dialog;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel_change_dialog);
                if (textView != null) {
                    i8 = R.id.tv_password_edit_change_dialog;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_password_edit_change_dialog);
                    if (textView2 != null) {
                        i8 = R.id.tv_title_change_dialog;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_change_dialog);
                        if (textView3 != null) {
                            i8 = R.id.tv_username_edit_change_dialog;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_username_edit_change_dialog);
                            if (textView4 != null) {
                                return new C1489m((LinearLayout) view, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1489m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1489m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_change_credentials_options, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12411a;
    }
}
