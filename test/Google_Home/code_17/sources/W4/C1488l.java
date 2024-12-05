package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1488l implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12397a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12398b;

    private C1488l(LinearLayout linearLayout, TextView textView) {
        this.f12397a = linearLayout;
        this.f12398b = textView;
    }

    public static C1488l a(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_checking_device);
        if (textView != null) {
            return new C1488l((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_checking_device)));
    }

    public static C1488l c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1488l d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.checking_compatibility, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12397a;
    }
}
