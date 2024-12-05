package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.LocaleListCompat;
import com.google.android.material.textfield.TextInputLayout;
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3405C;
import m2.AbstractC3407E;
import m2.AbstractC3409G;
import y2.C4202a;
import y2.C4203b;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CountryTextInputLayout extends TextInputLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f28381a;

    /* renamed from: b, reason: collision with root package name */
    private int f28382b;

    /* renamed from: c, reason: collision with root package name */
    private final AutoCompleteTextView f28383c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2760e f28384d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Function1 f28385e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Function1 f28386f;

    /* renamed from: g, reason: collision with root package name */
    private Q f28387g;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28378i = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};

    /* renamed from: h, reason: collision with root package name */
    private static final c f28377h = new c(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f28379j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f28380k = AbstractC3405C.f34790m;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f28389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.f28388a = context;
            this.f28389b = countryTextInputLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke(ViewGroup it) {
            AbstractC3255y.i(it, "it");
            View inflate = LayoutInflater.from(this.f28388a).inflate(this.f28389b.f28382b, it, false);
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) inflate;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f28391b = str;
        }

        public final void a(C4202a c4202a) {
            C4203b c4203b;
            CountryTextInputLayout countryTextInputLayout = CountryTextInputLayout.this;
            if (c4202a != null) {
                c4203b = c4202a.b();
            } else {
                c4203b = null;
            }
            countryTextInputLayout.setSelectedCountryCode$payments_core_release(c4203b);
            if (c4202a != null) {
                CountryTextInputLayout.this.j();
            } else {
                CountryTextInputLayout.this.setError(this.f28391b);
                CountryTextInputLayout.this.setErrorEnabled(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4202a) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final C4203b f28392a;

        /* renamed from: b, reason: collision with root package name */
        private final Parcelable f28393b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d((C4203b) parcel.readParcelable(d.class.getClassLoader()), parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(C4203b countryCode, Parcelable parcelable) {
            AbstractC3255y.i(countryCode, "countryCode");
            this.f28392a = countryCode;
            this.f28393b = parcelable;
        }

        public final C4203b a() {
            return this.f28392a;
        }

        public final Parcelable b() {
            return this.f28393b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f28392a, dVar.f28392a) && AbstractC3255y.d(this.f28393b, dVar.f28393b);
        }

        public int hashCode() {
            int hashCode = this.f28392a.hashCode() * 31;
            Parcelable parcelable = this.f28393b;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.f28392a + ", superState=" + this.f28393b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f28392a, i8);
            out.writeParcelable(this.f28393b, i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28394a = new e();

        e() {
            super(1);
        }

        public final void a(C4202a it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4202a) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28395a = new f();

        f() {
            super(1);
        }

        public final void a(C4203b it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4203b) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28397b;

        public g(boolean z8) {
            this.f28397b = z8;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(this.f28397b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f28398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, CountryTextInputLayout countryTextInputLayout) {
            super(obj);
            this.f28398b = countryTextInputLayout;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            C4203b c4203b = (C4203b) obj2;
            if (c4203b != null) {
                this.f28398b.getCountryCodeChangeCallback().invoke(c4203b);
                C4202a d8 = y2.d.f40915a.d(c4203b, this.f28398b.getLocale());
                if (d8 != null) {
                    this.f28398b.getCountryChangeCallback$payments_core_release().invoke(d8);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.o(this$0.f28387g.getItem(i8).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CountryTextInputLayout this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.f28383c.showDropDown();
            return;
        }
        String obj = this$0.f28383c.getText().toString();
        y2.d dVar = y2.d.f40915a;
        C4203b e8 = dVar.e(obj, this$0.getLocale());
        if (e8 != null) {
            this$0.n(e8);
            return;
        }
        C4203b.C0930b c0930b = C4203b.Companion;
        if (dVar.d(c0930b.a(obj), this$0.getLocale()) != null) {
            this$0.n(c0930b.a(obj));
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
        AbstractC3255y.f(locale);
        return locale;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        setError(null);
        setErrorEnabled(false);
    }

    private final AutoCompleteTextView k() {
        if (this.f28381a == 0) {
            return new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.f28381a);
    }

    private final void m() {
        C4202a b8 = this.f28387g.b();
        this.f28383c.setText(b8.g());
        setSelectedCountryCode$payments_core_release(b8.b());
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.f28383c;
    }

    public final Function1 getCountryChangeCallback$payments_core_release() {
        return this.f28385e;
    }

    public final Function1 getCountryCodeChangeCallback() {
        return this.f28386f;
    }

    public final C4202a getSelectedCountry$payments_core_release() {
        C4203b selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return y2.d.f40915a.d(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final C4203b getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final C4203b getSelectedCountryCode$payments_core_release() {
        return (C4203b) this.f28384d.getValue(this, f28378i[0]);
    }

    public final void l(d state) {
        AbstractC3255y.i(state, "state");
        super.onRestoreInstanceState(state.b());
        C4203b a8 = state.a();
        o(a8);
        n(a8);
        requestLayout();
    }

    public final void n(C4203b countryCode) {
        String str;
        AbstractC3255y.i(countryCode, "countryCode");
        y2.d dVar = y2.d.f40915a;
        C4202a d8 = dVar.d(countryCode, getLocale());
        if (d8 != null) {
            o(countryCode);
        } else {
            d8 = dVar.d(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        AutoCompleteTextView autoCompleteTextView = this.f28383c;
        if (d8 != null) {
            str = d8.g();
        } else {
            str = null;
        }
        autoCompleteTextView.setText(str);
    }

    public final void o(C4203b countryCode) {
        AbstractC3255y.i(countryCode, "countryCode");
        j();
        if (!AbstractC3255y.d(getSelectedCountryCode$payments_core_release(), countryCode)) {
            setSelectedCountryCode$payments_core_release(countryCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            l((d) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        C4202a selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new d(selectedCountry$payments_core_release.b(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void p() {
        this.f28383c.performValidation();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        if (this.f28387g.f(allowedCountryCodes)) {
            m();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(Function1 function1) {
        AbstractC3255y.i(function1, "<set-?>");
        this.f28385e = function1;
    }

    public final void setCountryCodeChangeCallback(Function1 function1) {
        AbstractC3255y.i(function1, "<set-?>");
        this.f28386f = function1;
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(C4203b countryCode) {
        AbstractC3255y.i(countryCode, "countryCode");
        n(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        addOnLayoutChangeListener(new g(z8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSelectedCountryCode(C4203b c4203b) {
        setSelectedCountryCode$payments_core_release(c4203b);
    }

    public final void setSelectedCountryCode$payments_core_release(C4203b c4203b) {
        this.f28384d.setValue(this, f28378i[0], c4203b);
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? com.google.android.material.R.attr.textInputStyle : i8);
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(String countryCode) {
        AbstractC3255y.i(countryCode, "countryCode");
        n(C4203b.Companion.a(countryCode));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        int i9 = f28380k;
        this.f28382b = i9;
        C2756a c2756a = C2756a.f31226a;
        this.f28384d = new h(null, this);
        this.f28385e = e.f28394a;
        this.f28386f = f.f28395a;
        int[] StripeCountryAutoCompleteTextInputLayout = AbstractC3409G.f34904h;
        AbstractC3255y.h(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.f28381a = obtainStyledAttributes.getResourceId(AbstractC3409G.f34905i, 0);
        this.f28382b = obtainStyledAttributes.getResourceId(AbstractC3409G.f34906j, i9);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView k8 = k();
        this.f28383c = k8;
        addView(k8, new LinearLayout.LayoutParams(-1, -2));
        this.f28387g = new Q(context, y2.d.f40915a.f(getLocale()), this.f28382b, new a(context, this));
        k8.setThreshold(0);
        k8.setAdapter(this.f28387g);
        k8.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.T
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j8) {
                CountryTextInputLayout.e(CountryTextInputLayout.this, adapterView, view, i10, j8);
            }
        });
        k8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.U
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CountryTextInputLayout.f(CountryTextInputLayout.this, view, z8);
            }
        });
        setSelectedCountryCode$payments_core_release(this.f28387g.b().b());
        m();
        String string = getResources().getString(AbstractC3407E.f34858h);
        AbstractC3255y.h(string, "getString(...)");
        k8.setValidator(new S(this.f28387g, new b(string)));
    }
}
