package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f4854a;

    /* renamed from: b, reason: collision with root package name */
    public final CardBrandView f4855b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f4856c;

    /* renamed from: d, reason: collision with root package name */
    public final CardNumberEditText f4857d;

    /* renamed from: e, reason: collision with root package name */
    public final CvcEditText f4858e;

    /* renamed from: f, reason: collision with root package name */
    public final ExpiryDateEditText f4859f;

    /* renamed from: g, reason: collision with root package name */
    public final PostalCodeEditText f4860g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f4861h;

    /* renamed from: i, reason: collision with root package name */
    public final CardNumberTextInputLayout f4862i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f4863j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f4864k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f4865l;

    private j(View view, CardBrandView cardBrandView, FrameLayout frameLayout, CardNumberEditText cardNumberEditText, CvcEditText cvcEditText, ExpiryDateEditText expiryDateEditText, PostalCodeEditText postalCodeEditText, LinearLayout linearLayout, CardNumberTextInputLayout cardNumberTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.f4854a = view;
        this.f4855b = cardBrandView;
        this.f4856c = frameLayout;
        this.f4857d = cardNumberEditText;
        this.f4858e = cvcEditText;
        this.f4859f = expiryDateEditText;
        this.f4860g = postalCodeEditText;
        this.f4861h = linearLayout;
        this.f4862i = cardNumberTextInputLayout;
        this.f4863j = textInputLayout;
        this.f4864k = textInputLayout2;
        this.f4865l = textInputLayout3;
    }

    public static j a(View view) {
        int i8 = AbstractC3403A.f34753h;
        CardBrandView cardBrandView = (CardBrandView) ViewBindings.findChildViewById(view, i8);
        if (cardBrandView != null) {
            i8 = AbstractC3403A.f34759k;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
            if (frameLayout != null) {
                i8 = AbstractC3403A.f34768s;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) ViewBindings.findChildViewById(view, i8);
                if (cardNumberEditText != null) {
                    i8 = AbstractC3403A.f34770u;
                    CvcEditText cvcEditText = (CvcEditText) ViewBindings.findChildViewById(view, i8);
                    if (cvcEditText != null) {
                        i8 = AbstractC3403A.f34771v;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) ViewBindings.findChildViewById(view, i8);
                        if (expiryDateEditText != null) {
                            i8 = AbstractC3403A.f34774y;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i8);
                            if (postalCodeEditText != null) {
                                i8 = AbstractC3403A.f34723K;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                                if (linearLayout != null) {
                                    i8 = AbstractC3403A.f34737Y;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) ViewBindings.findChildViewById(view, i8);
                                    if (cardNumberTextInputLayout != null) {
                                        i8 = AbstractC3403A.f34740a0;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3403A.f34742b0;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3403A.f34748e0;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    return new j(view, cardBrandView, frameLayout, cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText, linearLayout, cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
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

    public static j b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3405C.f34788k, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f4854a;
    }
}
