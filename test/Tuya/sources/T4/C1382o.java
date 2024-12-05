package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1382o implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f10779a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioButton f10780b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioButton f10781c;

    /* renamed from: d, reason: collision with root package name */
    public final RadioButton f10782d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10783e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10784f;

    private C1382o(CoordinatorLayout coordinatorLayout, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, TextView textView, TextView textView2) {
        this.f10779a = coordinatorLayout;
        this.f10780b = radioButton;
        this.f10781c = radioButton2;
        this.f10782d = radioButton3;
        this.f10783e = textView;
        this.f10784f = textView2;
    }

    public static C1382o a(View view) {
        int i8 = R.id.rb_disabled;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_disabled);
        if (radioButton != null) {
            i8 = R.id.rb_enabled;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_enabled);
            if (radioButton2 != null) {
                i8 = R.id.rb_follow_system;
                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_follow_system);
                if (radioButton3 != null) {
                    i8 = R.id.tv_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                    if (textView != null) {
                        i8 = R.id.tv_title_dark_mode_options;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dark_mode_options);
                        if (textView2 != null) {
                            return new C1382o((CoordinatorLayout) view, radioButton, radioButton2, radioButton3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1382o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1382o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_dark_mode_options, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f10779a;
    }
}
