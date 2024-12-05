package W4;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class M implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f11849a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f11850b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f11851c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f11852d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f11853e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f11854f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f11855g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f11856h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f11857i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f11858j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f11859k;

    private M(LinearLayout linearLayout, EditText editText, EditText editText2, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f11849a = linearLayout;
        this.f11850b = editText;
        this.f11851c = editText2;
        this.f11852d = imageView;
        this.f11853e = linearLayout2;
        this.f11854f = relativeLayout;
        this.f11855g = textView;
        this.f11856h = textView2;
        this.f11857i = textView3;
        this.f11858j = textView4;
        this.f11859k = textView5;
    }

    public static M a(View view) {
        int i8 = R.id.et_pass_login;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_pass_login);
        if (editText != null) {
            i8 = R.id.et_user_login;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_user_login);
            if (editText2 != null) {
                i8 = R.id.iv_google;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_google);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i8 = R.id.rl_google_login;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_google_login);
                    if (relativeLayout != null) {
                        i8 = R.id.tv_continue_with_login;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_continue_with_login);
                        if (textView != null) {
                            i8 = R.id.tv_login;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_login);
                            if (textView2 != null) {
                                i8 = R.id.tv_login_google;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_login_google);
                                if (textView3 != null) {
                                    i8 = R.id.tv_msg_sign_up;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_sign_up);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_pass_forget_login;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pass_forget_login);
                                        if (textView5 != null) {
                                            return new M(linearLayout, editText, editText2, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f11849a;
    }
}
