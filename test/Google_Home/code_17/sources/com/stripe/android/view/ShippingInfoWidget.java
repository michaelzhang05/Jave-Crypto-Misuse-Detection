package com.stripe.android.view;

import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import e3.C2779C;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m2.AbstractC3407E;
import m4.AbstractC3435g;
import u2.AbstractC4058e;
import y2.C4202a;
import y2.C4203b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ShippingInfoWidget extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f28641a;

    /* renamed from: b, reason: collision with root package name */
    private final G0 f28642b;

    /* renamed from: c, reason: collision with root package name */
    private List f28643c;

    /* renamed from: d, reason: collision with root package name */
    private List f28644d;

    /* renamed from: e, reason: collision with root package name */
    private final CountryTextInputLayout f28645e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout f28646f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout f28647g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f28648h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout f28649i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f28650j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f28651k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f28652l;

    /* renamed from: m, reason: collision with root package name */
    private final StripeEditText f28653m;

    /* renamed from: n, reason: collision with root package name */
    private final StripeEditText f28654n;

    /* renamed from: o, reason: collision with root package name */
    private final StripeEditText f28655o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeEditText f28656p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeEditText f28657q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeEditText f28658r;

    /* renamed from: s, reason: collision with root package name */
    private final StripeEditText f28659s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28660a = new a("Line1", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f28661b = new a("Line2", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f28662c = new a("City", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f28663d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f28664e = new a("State", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f28665f = new a("Phone", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f28666g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ U5.a f28667h;

        static {
            a[] a8 = a();
            f28666g = a8;
            f28667h = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28660a, f28661b, f28662c, f28663d, f28664e, f28665f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28666g.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3252v implements Function1 {
        b(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        public final void d(C4202a p02) {
            AbstractC3255y.i(p02, "p0");
            ((ShippingInfoWidget) this.receiver).o(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((C4202a) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShippingInfoWidget f28669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ShippingInfoWidget shippingInfoWidget) {
            super(0);
            this.f28668a = context;
            this.f28669b = shippingInfoWidget;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.f invoke() {
            J2.f b8 = J2.f.b(LayoutInflater.from(this.f28668a), this.f28669b);
            AbstractC3255y.h(b8, "inflate(...)");
            return b8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void b() {
        if (d(a.f28660a)) {
            this.f28646f.setVisibility(8);
        }
        if (d(a.f28661b)) {
            this.f28647g.setVisibility(8);
        }
        if (d(a.f28664e)) {
            this.f28651k.setVisibility(8);
        }
        if (d(a.f28662c)) {
            this.f28648h.setVisibility(8);
        }
        if (d(a.f28663d)) {
            this.f28650j.setVisibility(8);
        }
        if (d(a.f28665f)) {
            this.f28652l.setVisibility(8);
        }
    }

    private final void c() {
        this.f28645e.setCountryChangeCallback$payments_core_release(new b(this));
        this.f28659s.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        n();
        l();
        C4202a selectedCountry$payments_core_release = this.f28645e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    private final boolean d(a aVar) {
        return this.f28644d.contains(aVar);
    }

    private final boolean e(a aVar) {
        return this.f28643c.contains(aVar);
    }

    private final boolean f(a aVar) {
        if (!e(aVar) && !d(aVar)) {
            return true;
        }
        return false;
    }

    private final void g(com.stripe.android.model.a aVar) {
        this.f28655o.setText(aVar.a());
        String b8 = aVar.b();
        if (b8 != null && b8.length() > 0) {
            this.f28645e.setCountrySelected$payments_core_release(b8);
        }
        this.f28653m.setText(aVar.g());
        this.f28654n.setText(aVar.h());
        this.f28657q.setText(aVar.i());
        this.f28658r.setText(aVar.l());
    }

    private final C2779C getRawShippingInformation() {
        C4203b c4203b;
        a.C0494a b8 = new a.C0494a().b(this.f28655o.getFieldText$payments_core_release());
        C4202a selectedCountry$payments_core_release = this.f28645e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            c4203b = selectedCountry$payments_core_release.b();
        } else {
            c4203b = null;
        }
        return new C2779C(b8.d(c4203b).e(this.f28653m.getFieldText$payments_core_release()).f(this.f28654n.getFieldText$payments_core_release()).g(this.f28657q.getFieldText$payments_core_release()).h(this.f28658r.getFieldText$payments_core_release()).a(), this.f28656p.getFieldText$payments_core_release(), this.f28659s.getFieldText$payments_core_release());
    }

    private final J2.f getViewBinding() {
        return (J2.f) this.f28641a.getValue();
    }

    private final void i() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28646f;
        if (e(a.f28660a)) {
            string = getResources().getString(AbstractC3407E.f34866l);
        } else {
            string = getResources().getString(AbstractC3435g.f35164a);
        }
        textInputLayout.setHint(string);
        this.f28647g.setHint(getResources().getString(AbstractC3407E.f34868m));
        TextInputLayout textInputLayout2 = this.f28650j;
        if (e(a.f28663d)) {
            string2 = getResources().getString(AbstractC3407E.f34876q);
        } else {
            string2 = getResources().getString(AbstractC4058e.f39960g);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28651k;
        if (e(a.f28664e)) {
            string3 = getResources().getString(AbstractC3407E.f34882t);
        } else {
            string3 = getResources().getString(AbstractC4058e.f39961h);
        }
        textInputLayout3.setHint(string3);
        this.f28657q.setErrorMessage(getResources().getString(AbstractC3407E.f34808C));
        this.f28658r.setErrorMessage(getResources().getString(AbstractC3407E.f34812E));
    }

    private final void j() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28646f;
        if (e(a.f28660a)) {
            string = getResources().getString(AbstractC3407E.f34862j);
        } else {
            string = getResources().getString(AbstractC4058e.f39954a);
        }
        textInputLayout.setHint(string);
        this.f28647g.setHint(getResources().getString(AbstractC3407E.f34864k));
        TextInputLayout textInputLayout2 = this.f28650j;
        if (e(a.f28663d)) {
            string2 = getResources().getString(AbstractC3407E.f34880s);
        } else {
            string2 = getResources().getString(AbstractC3407E.f34878r);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28651k;
        if (e(a.f28664e)) {
            string3 = getResources().getString(AbstractC3407E.f34872o);
        } else {
            string3 = getResources().getString(AbstractC4058e.f39957d);
        }
        textInputLayout3.setHint(string3);
        this.f28657q.setErrorMessage(getResources().getString(AbstractC3407E.f34810D));
        this.f28658r.setErrorMessage(getResources().getString(AbstractC3407E.f34860i));
    }

    private final void k() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28646f;
        if (e(a.f28660a)) {
            string = getResources().getString(AbstractC3407E.f34862j);
        } else {
            string = getResources().getString(AbstractC4058e.f39954a);
        }
        textInputLayout.setHint(string);
        this.f28647g.setHint(getResources().getString(AbstractC3407E.f34864k));
        TextInputLayout textInputLayout2 = this.f28650j;
        if (e(a.f28663d)) {
            string2 = getResources().getString(AbstractC3407E.f34894z);
        } else {
            string2 = getResources().getString(AbstractC3407E.f34892y);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28651k;
        if (e(a.f28664e)) {
            string3 = getResources().getString(AbstractC3407E.f34886v);
        } else {
            string3 = getResources().getString(AbstractC3407E.f34884u);
        }
        textInputLayout3.setHint(string3);
        this.f28657q.setErrorMessage(getResources().getString(AbstractC3435g.f35186w));
        this.f28658r.setErrorMessage(getResources().getString(AbstractC3407E.f34814F));
    }

    private final void l() {
        String string;
        String string2;
        this.f28649i.setHint(getResources().getString(AbstractC4058e.f39958e));
        TextInputLayout textInputLayout = this.f28648h;
        if (e(a.f28662c)) {
            string = getResources().getString(AbstractC3407E.f34870n);
        } else {
            string = getResources().getString(AbstractC4058e.f39955b);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.f28652l;
        if (e(a.f28665f)) {
            string2 = getResources().getString(AbstractC3407E.f34874p);
        } else {
            string2 = getResources().getString(AbstractC4058e.f39959f);
        }
        textInputLayout2.setHint(string2);
        b();
    }

    private final void m() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f28646f;
        if (e(a.f28660a)) {
            string = getResources().getString(AbstractC3407E.f34866l);
        } else {
            string = getResources().getString(AbstractC3435g.f35164a);
        }
        textInputLayout.setHint(string);
        this.f28647g.setHint(getResources().getString(AbstractC3407E.f34868m));
        TextInputLayout textInputLayout2 = this.f28650j;
        if (e(a.f28663d)) {
            string2 = getResources().getString(AbstractC3407E.f34890x);
        } else {
            string2 = getResources().getString(AbstractC4058e.f39963j);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f28651k;
        if (e(a.f28664e)) {
            string3 = getResources().getString(AbstractC3407E.f34888w);
        } else {
            string3 = getResources().getString(AbstractC4058e.f39962i);
        }
        textInputLayout3.setHint(string3);
        this.f28657q.setErrorMessage(getResources().getString(AbstractC3435g.f35185v));
        this.f28658r.setErrorMessage(getResources().getString(AbstractC3407E.f34818H));
    }

    private final void n() {
        this.f28653m.setErrorMessageListener(new C2633c0(this.f28646f));
        this.f28655o.setErrorMessageListener(new C2633c0(this.f28648h));
        this.f28656p.setErrorMessageListener(new C2633c0(this.f28649i));
        this.f28657q.setErrorMessageListener(new C2633c0(this.f28650j));
        this.f28658r.setErrorMessageListener(new C2633c0(this.f28651k));
        this.f28659s.setErrorMessageListener(new C2633c0(this.f28652l));
        this.f28653m.setErrorMessage(getResources().getString(AbstractC3407E.f34816G));
        this.f28655o.setErrorMessage(getResources().getString(AbstractC3407E.f34856g));
        this.f28656p.setErrorMessage(getResources().getString(AbstractC3407E.f34804A));
        this.f28659s.setErrorMessage(getResources().getString(AbstractC3407E.f34806B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C4202a c4202a) {
        int i8;
        String b8 = c4202a.b().b();
        if (AbstractC3255y.d(b8, Locale.US.getCountry())) {
            m();
        } else if (AbstractC3255y.d(b8, Locale.UK.getCountry())) {
            j();
        } else if (AbstractC3255y.d(b8, Locale.CANADA.getCountry())) {
            i();
        } else {
            k();
        }
        p(c4202a);
        TextInputLayout textInputLayout = this.f28650j;
        if (y2.d.f40915a.b(c4202a.b()) && !d(a.f28663d)) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        textInputLayout.setVisibility(i8);
    }

    private final void p(C4202a c4202a) {
        InputFilter[] inputFilterArr;
        StripeEditText stripeEditText = this.f28657q;
        if (AbstractC3255y.d(c4202a.b().b(), Locale.CANADA.getCountry())) {
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps()};
        } else {
            inputFilterArr = new InputFilter[0];
        }
        stripeEditText.setFilters(inputFilterArr);
    }

    public final List<a> getHiddenFields() {
        return this.f28644d;
    }

    public final List<a> getOptionalFields() {
        return this.f28643c;
    }

    public final C2779C getShippingInformation() {
        if (!q()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void h(C2779C c2779c) {
        if (c2779c == null) {
            return;
        }
        com.stripe.android.model.a a8 = c2779c.a();
        if (a8 != null) {
            g(a8);
        }
        this.f28656p.setText(c2779c.b());
        this.f28659s.setText(c2779c.g());
    }

    public final boolean q() {
        String obj;
        Editable text;
        String obj2;
        Editable text2;
        String obj3;
        Editable text3;
        String obj4;
        Editable text4;
        String obj5;
        Editable text5;
        String obj6;
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C4203b b8;
        Editable text6 = this.f28653m.getText();
        if (text6 == null || (obj = text6.toString()) == null || (text = this.f28656p.getText()) == null || (obj2 = text.toString()) == null || (text2 = this.f28655o.getText()) == null || (obj3 = text2.toString()) == null || (text3 = this.f28658r.getText()) == null || (obj4 = text3.toString()) == null || (text4 = this.f28657q.getText()) == null || (obj5 = text4.toString()) == null || (text5 = this.f28659s.getText()) == null || (obj6 = text5.toString()) == null) {
            return false;
        }
        this.f28645e.p();
        C4202a selectedCountry$payments_core_release = this.f28645e.getSelectedCountry$payments_core_release();
        G0 g02 = this.f28642b;
        if (selectedCountry$payments_core_release != null && (b8 = selectedCountry$payments_core_release.b()) != null) {
            str = b8.b();
        } else {
            str = null;
        }
        boolean a8 = g02.a(obj5, str, this.f28643c, this.f28644d);
        this.f28657q.setShouldShowError(!a8);
        if (j6.n.u(obj) && f(a.f28660a)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f28653m.setShouldShowError(z8);
        if (j6.n.u(obj3) && f(a.f28662c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28655o.setShouldShowError(z9);
        boolean u8 = j6.n.u(obj2);
        this.f28656p.setShouldShowError(u8);
        if (j6.n.u(obj4) && f(a.f28664e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28658r.setShouldShowError(z10);
        if (j6.n.u(obj6) && f(a.f28665f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28659s.setShouldShowError(z11);
        if (!a8 || z8 || z9 || z10 || u8 || z11 || selectedCountry$payments_core_release == null) {
            return false;
        }
        return true;
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f28645e.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends a> value) {
        AbstractC3255y.i(value, "value");
        this.f28644d = value;
        l();
        C4202a selectedCountry$payments_core_release = this.f28645e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends a> value) {
        AbstractC3255y.i(value, "value");
        this.f28643c = value;
        l();
        C4202a selectedCountry$payments_core_release = this.f28645e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28641a = O5.l.b(new c(context, this));
        this.f28642b = new G0();
        this.f28643c = AbstractC1378t.m();
        this.f28644d = AbstractC1378t.m();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().f4830b;
        AbstractC3255y.h(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.f28645e = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().f4838j;
        AbstractC3255y.h(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.f28646f = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().f4839k;
        AbstractC3255y.h(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.f28647g = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().f4840l;
        AbstractC3255y.h(tlCityAaw, "tlCityAaw");
        this.f28648h = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().f4841m;
        AbstractC3255y.h(tlNameAaw, "tlNameAaw");
        this.f28649i = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().f4843o;
        AbstractC3255y.h(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.f28650j = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().f4844p;
        AbstractC3255y.h(tlStateAaw, "tlStateAaw");
        this.f28651k = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().f4842n;
        AbstractC3255y.h(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.f28652l = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().f4831c;
        AbstractC3255y.h(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.f28653m = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().f4832d;
        AbstractC3255y.h(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.f28654n = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().f4833e;
        AbstractC3255y.h(etCityAaw, "etCityAaw");
        this.f28655o = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().f4834f;
        AbstractC3255y.h(etNameAaw, "etNameAaw");
        this.f28656p = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().f4836h;
        AbstractC3255y.h(etPostalCodeAaw, "etPostalCodeAaw");
        this.f28657q = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().f4837i;
        AbstractC3255y.h(etStateAaw, "etStateAaw");
        this.f28658r = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().f4835g;
        AbstractC3255y.h(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.f28659s = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            I0.a(tlAddressLine1Aaw, new String[]{HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS});
            etPostalCodeAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
            etPhoneNumberAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_PHONE});
        }
        c();
    }
}
