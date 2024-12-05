package G2;

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
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final CardBrandView f3136b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f3137c;

    /* renamed from: d, reason: collision with root package name */
    public final CardNumberEditText f3138d;

    /* renamed from: e, reason: collision with root package name */
    public final CvcEditText f3139e;

    /* renamed from: f, reason: collision with root package name */
    public final ExpiryDateEditText f3140f;

    /* renamed from: g, reason: collision with root package name */
    public final PostalCodeEditText f3141g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f3142h;

    /* renamed from: i, reason: collision with root package name */
    public final CardNumberTextInputLayout f3143i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f3144j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f3145k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f3146l;

    private j(View view, CardBrandView cardBrandView, FrameLayout frameLayout, CardNumberEditText cardNumberEditText, CvcEditText cvcEditText, ExpiryDateEditText expiryDateEditText, PostalCodeEditText postalCodeEditText, LinearLayout linearLayout, CardNumberTextInputLayout cardNumberTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.f3135a = view;
        this.f3136b = cardBrandView;
        this.f3137c = frameLayout;
        this.f3138d = cardNumberEditText;
        this.f3139e = cvcEditText;
        this.f3140f = expiryDateEditText;
        this.f3141g = postalCodeEditText;
        this.f3142h = linearLayout;
        this.f3143i = cardNumberTextInputLayout;
        this.f3144j = textInputLayout;
        this.f3145k = textInputLayout2;
        this.f3146l = textInputLayout3;
    }

    public static j a(View view) {
        int i8 = AbstractC3049A.f32777h;
        CardBrandView cardBrandView = (CardBrandView) ViewBindings.findChildViewById(view, i8);
        if (cardBrandView != null) {
            i8 = AbstractC3049A.f32783k;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
            if (frameLayout != null) {
                i8 = AbstractC3049A.f32792s;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) ViewBindings.findChildViewById(view, i8);
                if (cardNumberEditText != null) {
                    i8 = AbstractC3049A.f32794u;
                    CvcEditText cvcEditText = (CvcEditText) ViewBindings.findChildViewById(view, i8);
                    if (cvcEditText != null) {
                        i8 = AbstractC3049A.f32795v;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) ViewBindings.findChildViewById(view, i8);
                        if (expiryDateEditText != null) {
                            i8 = AbstractC3049A.f32798y;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i8);
                            if (postalCodeEditText != null) {
                                i8 = AbstractC3049A.f32747K;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                                if (linearLayout != null) {
                                    i8 = AbstractC3049A.f32761Y;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) ViewBindings.findChildViewById(view, i8);
                                    if (cardNumberTextInputLayout != null) {
                                        i8 = AbstractC3049A.f32764a0;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3049A.f32766b0;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3049A.f32772e0;
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
            layoutInflater.inflate(AbstractC3051C.f32812k, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3135a;
    }
}
