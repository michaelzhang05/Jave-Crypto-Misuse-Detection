package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3175a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3176b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3177c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3178d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f3179e;

    private t(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.f3175a = view;
        this.f3176b = textView;
        this.f3177c = textView2;
        this.f3178d = textView3;
        this.f3179e = appCompatImageView;
    }

    public static t a(View view) {
        int i8 = AbstractC3049A.f32788o;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = AbstractC3049A.f32742F;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView2 != null) {
                i8 = AbstractC3049A.f32743G;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView3 != null) {
                    i8 = AbstractC3049A.f32749M;
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
            layoutInflater.inflate(AbstractC3051C.f32824w, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3175a;
    }
}
