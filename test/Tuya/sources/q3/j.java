package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f8250b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f8251c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreeDS2TextView f8252d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreeDS2TextView f8253e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f8254f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f8255g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreeDS2TextView f8256h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreeDS2TextView f8257i;

    private j(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, ThreeDS2TextView threeDS2TextView, ThreeDS2TextView threeDS2TextView2, AppCompatImageView appCompatImageView2, LinearLayout linearLayout3, ThreeDS2TextView threeDS2TextView3, ThreeDS2TextView threeDS2TextView4) {
        this.f8249a = linearLayout;
        this.f8250b = appCompatImageView;
        this.f8251c = linearLayout2;
        this.f8252d = threeDS2TextView;
        this.f8253e = threeDS2TextView2;
        this.f8254f = appCompatImageView2;
        this.f8255g = linearLayout3;
        this.f8256h = threeDS2TextView3;
        this.f8257i = threeDS2TextView4;
    }

    public static j a(View view) {
        int i8 = P3.d.f7953n;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
        if (appCompatImageView != null) {
            i8 = P3.d.f7954o;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
            if (linearLayout != null) {
                i8 = P3.d.f7955p;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                if (threeDS2TextView != null) {
                    i8 = P3.d.f7956q;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                    if (threeDS2TextView2 != null) {
                        i8 = P3.d.f7936A;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
                        if (appCompatImageView2 != null) {
                            i8 = P3.d.f7937B;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                            if (linearLayout2 != null) {
                                i8 = P3.d.f7938C;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                                if (threeDS2TextView3 != null) {
                                    i8 = P3.d.f7939D;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                                    if (threeDS2TextView4 != null) {
                                        return new j((LinearLayout) view, appCompatImageView, linearLayout, threeDS2TextView, threeDS2TextView2, appCompatImageView2, linearLayout2, threeDS2TextView3, threeDS2TextView4);
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

    public static j c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(P3.e.f7975j, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f8249a;
    }
}
