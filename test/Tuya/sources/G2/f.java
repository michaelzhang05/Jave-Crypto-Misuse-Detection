package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3110a;

    /* renamed from: b, reason: collision with root package name */
    public final CountryTextInputLayout f3111b;

    /* renamed from: c, reason: collision with root package name */
    public final StripeEditText f3112c;

    /* renamed from: d, reason: collision with root package name */
    public final StripeEditText f3113d;

    /* renamed from: e, reason: collision with root package name */
    public final StripeEditText f3114e;

    /* renamed from: f, reason: collision with root package name */
    public final StripeEditText f3115f;

    /* renamed from: g, reason: collision with root package name */
    public final StripeEditText f3116g;

    /* renamed from: h, reason: collision with root package name */
    public final StripeEditText f3117h;

    /* renamed from: i, reason: collision with root package name */
    public final StripeEditText f3118i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f3119j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f3120k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f3121l;

    /* renamed from: m, reason: collision with root package name */
    public final TextInputLayout f3122m;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f3123n;

    /* renamed from: o, reason: collision with root package name */
    public final TextInputLayout f3124o;

    /* renamed from: p, reason: collision with root package name */
    public final TextInputLayout f3125p;

    private f(View view, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, StripeEditText stripeEditText2, StripeEditText stripeEditText3, StripeEditText stripeEditText4, StripeEditText stripeEditText5, StripeEditText stripeEditText6, StripeEditText stripeEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7) {
        this.f3110a = view;
        this.f3111b = countryTextInputLayout;
        this.f3112c = stripeEditText;
        this.f3113d = stripeEditText2;
        this.f3114e = stripeEditText3;
        this.f3115f = stripeEditText4;
        this.f3116g = stripeEditText5;
        this.f3117h = stripeEditText6;
        this.f3118i = stripeEditText7;
        this.f3119j = textInputLayout;
        this.f3120k = textInputLayout2;
        this.f3121l = textInputLayout3;
        this.f3122m = textInputLayout4;
        this.f3123n = textInputLayout5;
        this.f3124o = textInputLayout6;
        this.f3125p = textInputLayout7;
    }

    public static f a(View view) {
        int i8 = AbstractC3049A.f32787n;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) ViewBindings.findChildViewById(view, i8);
        if (countryTextInputLayout != null) {
            i8 = AbstractC3049A.f32790q;
            StripeEditText stripeEditText = (StripeEditText) ViewBindings.findChildViewById(view, i8);
            if (stripeEditText != null) {
                i8 = AbstractC3049A.f32791r;
                StripeEditText stripeEditText2 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                if (stripeEditText2 != null) {
                    i8 = AbstractC3049A.f32793t;
                    StripeEditText stripeEditText3 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                    if (stripeEditText3 != null) {
                        i8 = AbstractC3049A.f32796w;
                        StripeEditText stripeEditText4 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                        if (stripeEditText4 != null) {
                            i8 = AbstractC3049A.f32797x;
                            StripeEditText stripeEditText5 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                            if (stripeEditText5 != null) {
                                i8 = AbstractC3049A.f32799z;
                                StripeEditText stripeEditText6 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                if (stripeEditText6 != null) {
                                    i8 = AbstractC3049A.f32737A;
                                    StripeEditText stripeEditText7 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                    if (stripeEditText7 != null) {
                                        i8 = AbstractC3049A.f32759W;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3049A.f32760X;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3049A.f32762Z;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    i8 = AbstractC3049A.f32768c0;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                    if (textInputLayout4 != null) {
                                                        i8 = AbstractC3049A.f32770d0;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                        if (textInputLayout5 != null) {
                                                            i8 = AbstractC3049A.f32774f0;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                            if (textInputLayout6 != null) {
                                                                i8 = AbstractC3049A.f32776g0;
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
            layoutInflater.inflate(AbstractC3051C.f32807f, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3110a;
    }
}
