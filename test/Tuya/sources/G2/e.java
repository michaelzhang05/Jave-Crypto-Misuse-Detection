package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f3108a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f3109b;

    private e(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f3108a = linearLayout;
        this.f3109b = appCompatTextView;
    }

    public static e a(View view) {
        int i8 = AbstractC3049A.f32740D;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i8);
        if (appCompatTextView != null) {
            return new e((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32806e, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f3108a;
    }
}
