package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1469a0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12047a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12048b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f12049c;

    /* renamed from: d, reason: collision with root package name */
    public final K f12050d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f12051e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12052f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12053g;

    private C1469a0(RelativeLayout relativeLayout, EditText editText, EditText editText2, K k8, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f12047a = relativeLayout;
        this.f12048b = editText;
        this.f12049c = editText2;
        this.f12050d = k8;
        this.f12051e = toolbar;
        this.f12052f = textView;
        this.f12053g = textView2;
    }

    public static C1469a0 a(View view) {
        int i8 = R.id.et_email_confirm_pass_recovery;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_confirm_pass_recovery);
        if (editText != null) {
            i8 = R.id.et_email_pass_recovery;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_pass_recovery);
            if (editText2 != null) {
                i8 = R.id.loading_view_password_recovery;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_password_recovery);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.toolbar_password_recovery;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_password_recovery);
                    if (toolbar != null) {
                        i8 = R.id.tv_recover;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_recover);
                        if (textView != null) {
                            i8 = R.id.tv_title_toolbar_password_recovery;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_toolbar_password_recovery);
                            if (textView2 != null) {
                                return new C1469a0((RelativeLayout) view, editText, editText2, a8, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1469a0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1469a0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.password_recovery, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12047a;
    }
}
