package T4;

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

/* loaded from: classes4.dex */
public final class m0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10761a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f10762b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f10763c;

    /* renamed from: d, reason: collision with root package name */
    public final K f10764d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f10765e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10766f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10767g;

    private m0(RelativeLayout relativeLayout, EditText editText, EditText editText2, K k8, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10761a = relativeLayout;
        this.f10762b = editText;
        this.f10763c = editText2;
        this.f10764d = k8;
        this.f10765e = toolbar;
        this.f10766f = textView;
        this.f10767g = textView2;
    }

    public static m0 a(View view) {
        int i8 = R.id.et_email_suggestions;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_suggestions);
        if (editText != null) {
            i8 = R.id.et_msg_suggestions;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_msg_suggestions);
            if (editText2 != null) {
                i8 = R.id.loading_view_suggestions;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_suggestions);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.toolbar_suggestions;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_suggestions);
                    if (toolbar != null) {
                        i8 = R.id.tv_send_suggestions;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_send_suggestions);
                        if (textView != null) {
                            i8 = R.id.tv_title_suggestions;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_suggestions);
                            if (textView2 != null) {
                                return new m0((RelativeLayout) view, editText, editText2, a8, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static m0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static m0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.suggestions, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10761a;
    }
}
