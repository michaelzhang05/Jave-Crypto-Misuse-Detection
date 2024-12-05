package T4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1365d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10485a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10486b;

    private C1365d(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.f10485a = relativeLayout;
        this.f10486b = relativeLayout2;
    }

    public static C1365d a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_iv_feature_app_detail);
        if (relativeLayout != null) {
            return new C1365d((RelativeLayout) view, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rl_iv_feature_app_detail)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10485a;
    }
}
