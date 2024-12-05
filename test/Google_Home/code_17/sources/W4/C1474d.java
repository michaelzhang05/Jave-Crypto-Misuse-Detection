package W4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1474d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12142a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f12143b;

    private C1474d(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f12142a = relativeLayout;
        this.f12143b = relativeLayout2;
    }

    public static C1474d a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_iv_feature_app_detail);
        if (relativeLayout != null) {
            return new C1474d((RelativeLayout) view, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rl_iv_feature_app_detail)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12142a;
    }
}
