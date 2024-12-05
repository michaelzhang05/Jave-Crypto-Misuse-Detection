package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1471b0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12061a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f12062b;

    private C1471b0(LinearLayout linearLayout, TextView textView) {
        this.f12061a = linearLayout;
        this.f12062b = textView;
    }

    public static C1471b0 a(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_permission_item);
        if (textView != null) {
            return new C1471b0((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_name_permission_item)));
    }

    public static C1471b0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1471b0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.permission_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12061a;
    }
}
