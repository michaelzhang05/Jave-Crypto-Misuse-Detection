package W4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class H implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f11780a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f11781b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f11782c;

    private H(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.f11780a = linearLayout;
        this.f11781b = linearLayout2;
        this.f11782c = textView;
    }

    public static H a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_external_download_box);
        if (textView != null) {
            return new H(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_external_download_box)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f11780a;
    }
}
