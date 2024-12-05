package Q3;

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
    private final View f8237a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f8238b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreeDS2HeaderTextView f8239c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreeDS2TextView f8240d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreeDS2Button f8241e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreeDS2Button f8242f;

    /* renamed from: g, reason: collision with root package name */
    public final RadioButton f8243g;

    /* renamed from: h, reason: collision with root package name */
    public final RadioGroup f8244h;

    /* renamed from: i, reason: collision with root package name */
    public final RadioButton f8245i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreeDS2TextView f8246j;

    private h(View view, FrameLayout frameLayout, ThreeDS2HeaderTextView threeDS2HeaderTextView, ThreeDS2TextView threeDS2TextView, ThreeDS2Button threeDS2Button, ThreeDS2Button threeDS2Button2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, ThreeDS2TextView threeDS2TextView2) {
        this.f8237a = view;
        this.f8238b = frameLayout;
        this.f8239c = threeDS2HeaderTextView;
        this.f8240d = threeDS2TextView;
        this.f8241e = threeDS2Button;
        this.f8242f = threeDS2Button2;
        this.f8243g = radioButton;
        this.f8244h = radioGroup;
        this.f8245i = radioButton2;
        this.f8246j = threeDS2TextView2;
    }

    public static h a(View view) {
        int i8 = P3.d.f7944e;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = P3.d.f7945f;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) ViewBindings.findChildViewById(view, i8);
            if (threeDS2HeaderTextView != null) {
                i8 = P3.d.f7946g;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                if (threeDS2TextView != null) {
                    i8 = P3.d.f7947h;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                    if (threeDS2Button != null) {
                        i8 = P3.d.f7948i;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                        if (threeDS2Button2 != null) {
                            i8 = P3.d.f7949j;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i8);
                            if (radioButton != null) {
                                i8 = P3.d.f7950k;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i8);
                                if (radioGroup != null) {
                                    i8 = P3.d.f7951l;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i8);
                                    if (radioButton2 != null) {
                                        i8 = P3.d.f7952m;
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
            layoutInflater.inflate(P3.e.f7973h, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f8237a;
    }
}
