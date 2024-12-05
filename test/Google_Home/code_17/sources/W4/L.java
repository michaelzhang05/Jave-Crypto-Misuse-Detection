package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class L implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11843a;

    /* renamed from: b, reason: collision with root package name */
    public final K f11844b;

    /* renamed from: c, reason: collision with root package name */
    public final M f11845c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f11846d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f11847e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f11848f;

    private L(RelativeLayout relativeLayout, K k8, M m8, l0 l0Var, Toolbar toolbar, TextView textView) {
        this.f11843a = relativeLayout;
        this.f11844b = k8;
        this.f11845c = m8;
        this.f11846d = l0Var;
        this.f11847e = toolbar;
        this.f11848f = textView;
    }

    public static L a(View view) {
        int i8 = R.id.loading_view_login;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_login);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.login_form;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.login_form);
            if (findChildViewById2 != null) {
                M a9 = M.a(findChildViewById2);
                i8 = R.id.sign_up_form;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.sign_up_form);
                if (findChildViewById3 != null) {
                    l0 a10 = l0.a(findChildViewById3);
                    i8 = R.id.toolbar_login;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_login);
                    if (toolbar != null) {
                        i8 = R.id.tv_title_toolbar_login;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_toolbar_login);
                        if (textView != null) {
                            return new L((RelativeLayout) view, a8, a9, a10, toolbar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static L c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static L d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.login_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f11843a;
    }
}
