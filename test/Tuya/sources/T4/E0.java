package T4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes4.dex */
public final class E0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10103a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10104b;

    private E0(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f10103a = linearLayout;
        this.f10104b = linearLayout2;
    }

    public static E0 a(View view) {
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new E0(linearLayout, linearLayout);
        }
        throw new NullPointerException("rootView");
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10103a;
    }
}
