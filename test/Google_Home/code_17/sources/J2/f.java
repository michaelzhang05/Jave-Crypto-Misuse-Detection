package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f4829a;

    /* renamed from: b, reason: collision with root package name */
    public final CountryTextInputLayout f4830b;

    /* renamed from: c, reason: collision with root package name */
    public final StripeEditText f4831c;

    /* renamed from: d, reason: collision with root package name */
    public final StripeEditText f4832d;

    /* renamed from: e, reason: collision with root package name */
    public final StripeEditText f4833e;

    /* renamed from: f, reason: collision with root package name */
    public final StripeEditText f4834f;

    /* renamed from: g, reason: collision with root package name */
    public final StripeEditText f4835g;

    /* renamed from: h, reason: collision with root package name */
    public final StripeEditText f4836h;

    /* renamed from: i, reason: collision with root package name */
    public final StripeEditText f4837i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f4838j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f4839k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f4840l;

    /* renamed from: m, reason: collision with root package name */
    public final TextInputLayout f4841m;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f4842n;

    /* renamed from: o, reason: collision with root package name */
    public final TextInputLayout f4843o;

    /* renamed from: p, reason: collision with root package name */
    public final TextInputLayout f4844p;

    private f(View view, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, StripeEditText stripeEditText2, StripeEditText stripeEditText3, StripeEditText stripeEditText4, StripeEditText stripeEditText5, StripeEditText stripeEditText6, StripeEditText stripeEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7) {
        this.f4829a = view;
        this.f4830b = countryTextInputLayout;
        this.f4831c = stripeEditText;
        this.f4832d = stripeEditText2;
        this.f4833e = stripeEditText3;
        this.f4834f = stripeEditText4;
        this.f4835g = stripeEditText5;
        this.f4836h = stripeEditText6;
        this.f4837i = stripeEditText7;
        this.f4838j = textInputLayout;
        this.f4839k = textInputLayout2;
        this.f4840l = textInputLayout3;
        this.f4841m = textInputLayout4;
        this.f4842n = textInputLayout5;
        this.f4843o = textInputLayout6;
        this.f4844p = textInputLayout7;
    }

    public static f a(View view) {
        int i8 = AbstractC3403A.f34763n;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) ViewBindings.findChildViewById(view, i8);
        if (countryTextInputLayout != null) {
            i8 = AbstractC3403A.f34766q;
            StripeEditText stripeEditText = (StripeEditText) ViewBindings.findChildViewById(view, i8);
            if (stripeEditText != null) {
                i8 = AbstractC3403A.f34767r;
                StripeEditText stripeEditText2 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                if (stripeEditText2 != null) {
                    i8 = AbstractC3403A.f34769t;
                    StripeEditText stripeEditText3 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                    if (stripeEditText3 != null) {
                        i8 = AbstractC3403A.f34772w;
                        StripeEditText stripeEditText4 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                        if (stripeEditText4 != null) {
                            i8 = AbstractC3403A.f34773x;
                            StripeEditText stripeEditText5 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                            if (stripeEditText5 != null) {
                                i8 = AbstractC3403A.f34775z;
                                StripeEditText stripeEditText6 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                if (stripeEditText6 != null) {
                                    i8 = AbstractC3403A.f34713A;
                                    StripeEditText stripeEditText7 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                    if (stripeEditText7 != null) {
                                        i8 = AbstractC3403A.f34735W;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3403A.f34736X;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3403A.f34738Z;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    i8 = AbstractC3403A.f34744c0;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                    if (textInputLayout4 != null) {
                                                        i8 = AbstractC3403A.f34746d0;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                        if (textInputLayout5 != null) {
                                                            i8 = AbstractC3403A.f34750f0;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                            if (textInputLayout6 != null) {
                                                                i8 = AbstractC3403A.f34752g0;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                                if (textInputLayout7 != null) {
                                                                    return new f(view, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static f b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3405C.f34783f, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f4829a;
    }
}
