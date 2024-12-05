package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f4894a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4895b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f4896c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f4897d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f4898e;

    private t(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.f4894a = view;
        this.f4895b = textView;
        this.f4896c = textView2;
        this.f4897d = textView3;
        this.f4898e = appCompatImageView;
    }

    public static t a(View view) {
        int i8 = AbstractC3403A.f34764o;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = AbstractC3403A.f34718F;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView2 != null) {
                i8 = AbstractC3403A.f34719G;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView3 != null) {
                    i8 = AbstractC3403A.f34725M;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
                    if (appCompatImageView != null) {
                        return new t(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static t b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3405C.f34800w, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f4894a;
    }
}
