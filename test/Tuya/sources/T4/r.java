package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10818a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckBox f10819b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10820c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10821d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10822e;

    private r(LinearLayout linearLayout, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3) {
        this.f10818a = linearLayout;
        this.f10819b = checkBox;
        this.f10820c = textView;
        this.f10821d = textView2;
        this.f10822e = textView3;
    }

    public static r a(View view) {
        int i8 = R.id.cb_dont_show_again;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_dont_show_again);
        if (checkBox != null) {
            i8 = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
            if (textView != null) {
                i8 = R.id.tv_msg;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg);
                if (textView2 != null) {
                    i8 = R.id.tv_ok;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
                    if (textView3 != null) {
                        return new r((LinearLayout) view, checkBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static r c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_generic_accept_cancel, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10818a;
    }
}
