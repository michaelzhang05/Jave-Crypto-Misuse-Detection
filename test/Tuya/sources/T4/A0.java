package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* loaded from: classes4.dex */
public final class A0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10015a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f10016b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10017c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10018d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10019e;

    /* renamed from: f, reason: collision with root package name */
    public final K f10020f;

    /* renamed from: g, reason: collision with root package name */
    public final RadioButton f10021g;

    /* renamed from: h, reason: collision with root package name */
    public final RadioButton f10022h;

    /* renamed from: i, reason: collision with root package name */
    public final RadioButton f10023i;

    /* renamed from: j, reason: collision with root package name */
    public final RadioButton f10024j;

    /* renamed from: k, reason: collision with root package name */
    public final Toolbar f10025k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10026l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10027m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10028n;

    /* renamed from: o, reason: collision with root package name */
    public final UsernameTextView f10029o;

    /* renamed from: p, reason: collision with root package name */
    public final UsernameTextView f10030p;

    /* renamed from: q, reason: collision with root package name */
    public final UsernameTextView f10031q;

    /* renamed from: r, reason: collision with root package name */
    public final UsernameTextView f10032r;

    private A0(RelativeLayout relativeLayout, EditText editText, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, K k8, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, UsernameTextView usernameTextView, UsernameTextView usernameTextView2, UsernameTextView usernameTextView3, UsernameTextView usernameTextView4) {
        this.f10015a = relativeLayout;
        this.f10016b = editText;
        this.f10017c = imageView;
        this.f10018d = linearLayout;
        this.f10019e = linearLayout2;
        this.f10020f = k8;
        this.f10021g = radioButton;
        this.f10022h = radioButton2;
        this.f10023i = radioButton3;
        this.f10024j = radioButton4;
        this.f10025k = toolbar;
        this.f10026l = textView;
        this.f10027m = textView2;
        this.f10028n = textView3;
        this.f10029o = usernameTextView;
        this.f10030p = usernameTextView2;
        this.f10031q = usernameTextView3;
        this.f10032r = usernameTextView4;
    }

    public static A0 a(View view) {
        int i8 = R.id.et_username_edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_username_edit);
        if (editText != null) {
            i8 = R.id.iv_turbo_avatar_title_user_edit;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_avatar_title_user_edit);
            if (imageView != null) {
                i8 = R.id.ll_turbo_separator_user_edit;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_turbo_separator_user_edit);
                if (linearLayout != null) {
                    i8 = R.id.ll_turbo_username_type_user_edit;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_turbo_username_type_user_edit);
                    if (linearLayout2 != null) {
                        i8 = R.id.loading_view_username_edit;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_username_edit);
                        if (findChildViewById != null) {
                            K a8 = K.a(findChildViewById);
                            i8 = R.id.rb_turbo_type_0;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_turbo_type_0);
                            if (radioButton != null) {
                                i8 = R.id.rb_turbo_type_1;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_turbo_type_1);
                                if (radioButton2 != null) {
                                    i8 = R.id.rb_turbo_type_2;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_turbo_type_2);
                                    if (radioButton3 != null) {
                                        i8 = R.id.rb_turbo_type_3;
                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_turbo_type_3);
                                        if (radioButton4 != null) {
                                            i8 = R.id.toolbar_username_edit;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_username_edit);
                                            if (toolbar != null) {
                                                i8 = R.id.tv_title_toolbar_username_edit;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_toolbar_username_edit);
                                                if (textView != null) {
                                                    i8 = R.id.tv_turbo_username_title_user_edit;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_turbo_username_title_user_edit);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_username_edit_change;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_username_edit_change);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_username_type_0;
                                                            UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_type_0);
                                                            if (usernameTextView != null) {
                                                                i8 = R.id.tv_username_type_1;
                                                                UsernameTextView usernameTextView2 = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_type_1);
                                                                if (usernameTextView2 != null) {
                                                                    i8 = R.id.tv_username_type_2;
                                                                    UsernameTextView usernameTextView3 = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_type_2);
                                                                    if (usernameTextView3 != null) {
                                                                        i8 = R.id.tv_username_type_3;
                                                                        UsernameTextView usernameTextView4 = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_type_3);
                                                                        if (usernameTextView4 != null) {
                                                                            return new A0((RelativeLayout) view, editText, imageView, linearLayout, linearLayout2, a8, radioButton, radioButton2, radioButton3, radioButton4, toolbar, textView, textView2, textView3, usernameTextView, usernameTextView2, usernameTextView3, usernameTextView4);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static A0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static A0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.username_edit, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10015a;
    }
}
