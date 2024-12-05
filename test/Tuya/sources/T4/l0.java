package T4;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class l0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10742a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckBox f10743b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f10744c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f10745d;

    /* renamed from: e, reason: collision with root package name */
    public final EditText f10746e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10747f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10748g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10749h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10750i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10751j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10752k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10753l;

    private l0(LinearLayout linearLayout, CheckBox checkBox, EditText editText, EditText editText2, EditText editText3, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10742a = linearLayout;
        this.f10743b = checkBox;
        this.f10744c = editText;
        this.f10745d = editText2;
        this.f10746e = editText3;
        this.f10747f = imageView;
        this.f10748g = linearLayout2;
        this.f10749h = relativeLayout;
        this.f10750i = textView;
        this.f10751j = textView2;
        this.f10752k = textView3;
        this.f10753l = textView4;
    }

    public static l0 a(View view) {
        int i8 = R.id.cb_condiciones;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_condiciones);
        if (checkBox != null) {
            i8 = R.id.et_email_sign_up;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_sign_up);
            if (editText != null) {
                i8 = R.id.et_pass_sign_up;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_pass_sign_up);
                if (editText2 != null) {
                    i8 = R.id.et_user_sign_up;
                    EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.et_user_sign_up);
                    if (editText3 != null) {
                        i8 = R.id.iv_google;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_google);
                        if (imageView != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i8 = R.id.rl_google_login;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_google_login);
                            if (relativeLayout != null) {
                                i8 = R.id.tv_already_signed_up;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_already_signed_up);
                                if (textView != null) {
                                    i8 = R.id.tv_continue_with_login;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_continue_with_login);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_login_google;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_login_google);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_sign_up;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sign_up);
                                            if (textView4 != null) {
                                                return new l0(linearLayout, checkBox, editText, editText2, editText3, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
                                            }
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
        return this.f10742a;
    }
}
