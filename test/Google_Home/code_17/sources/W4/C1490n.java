package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1490n implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12425a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12426b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12427c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12428d;

    private C1490n(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f12425a = linearLayout;
        this.f12426b = textView;
        this.f12427c = textView2;
        this.f12428d = textView3;
    }

    public static C1490n a(View view) {
        int i8 = R.id.tv_close_dialog_pre_register;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_close_dialog_pre_register);
        if (textView != null) {
            i8 = R.id.tv_description_dialog_pre_register;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_pre_register);
            if (textView2 != null) {
                i8 = R.id.tv_title_dialog_pre_register;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_pre_register);
                if (textView3 != null) {
                    return new C1490n((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1490n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1490n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_coming_soon, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12425a;
    }
}
