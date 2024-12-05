package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1491o implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f12436a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioButton f12437b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioButton f12438c;

    /* renamed from: d, reason: collision with root package name */
    public final RadioButton f12439d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12440e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12441f;

    private C1491o(CoordinatorLayout coordinatorLayout, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, TextView textView, TextView textView2) {
        this.f12436a = coordinatorLayout;
        this.f12437b = radioButton;
        this.f12438c = radioButton2;
        this.f12439d = radioButton3;
        this.f12440e = textView;
        this.f12441f = textView2;
    }

    public static C1491o a(View view) {
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
                            return new C1491o((CoordinatorLayout) view, radioButton, radioButton2, radioButton3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1491o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1491o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_dark_mode_options, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f12436a;
    }
}
