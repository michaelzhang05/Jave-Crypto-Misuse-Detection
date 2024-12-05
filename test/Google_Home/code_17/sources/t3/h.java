package T3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f10034a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10035b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreeDS2HeaderTextView f10036c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreeDS2TextView f10037d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreeDS2Button f10038e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreeDS2Button f10039f;

    /* renamed from: g, reason: collision with root package name */
    public final RadioButton f10040g;

    /* renamed from: h, reason: collision with root package name */
    public final RadioGroup f10041h;

    /* renamed from: i, reason: collision with root package name */
    public final RadioButton f10042i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreeDS2TextView f10043j;

    private h(View view, FrameLayout frameLayout, ThreeDS2HeaderTextView threeDS2HeaderTextView, ThreeDS2TextView threeDS2TextView, ThreeDS2Button threeDS2Button, ThreeDS2Button threeDS2Button2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, ThreeDS2TextView threeDS2TextView2) {
        this.f10034a = view;
        this.f10035b = frameLayout;
        this.f10036c = threeDS2HeaderTextView;
        this.f10037d = threeDS2TextView;
        this.f10038e = threeDS2Button;
        this.f10039f = threeDS2Button2;
        this.f10040g = radioButton;
        this.f10041h = radioGroup;
        this.f10042i = radioButton2;
        this.f10043j = threeDS2TextView2;
    }

    public static h a(View view) {
        int i8 = S3.d.f9775e;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = S3.d.f9776f;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) ViewBindings.findChildViewById(view, i8);
            if (threeDS2HeaderTextView != null) {
                i8 = S3.d.f9777g;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                if (threeDS2TextView != null) {
                    i8 = S3.d.f9778h;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                    if (threeDS2Button != null) {
                        i8 = S3.d.f9779i;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                        if (threeDS2Button2 != null) {
                            i8 = S3.d.f9780j;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i8);
                            if (radioButton != null) {
                                i8 = S3.d.f9781k;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i8);
                                if (radioGroup != null) {
                                    i8 = S3.d.f9782l;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i8);
                                    if (radioButton2 != null) {
                                        i8 = S3.d.f9783m;
                                        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                                        if (threeDS2TextView2 != null) {
                                            return new h(view, frameLayout, threeDS2HeaderTextView, threeDS2TextView, threeDS2Button, threeDS2Button2, radioButton, radioGroup, radioButton2, threeDS2TextView2);
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

    public static h b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(S3.e.f9804h, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f10034a;
    }
}
