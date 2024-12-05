package com.stripe.android.view;

import L5.InterfaceC1227k;
import M5.AbstractC1246t;
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
import b3.C1858C;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import j2.AbstractC3053E;
import j4.AbstractC3081g;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import r2.AbstractC3685e;
import v2.C3825a;
import v2.C3826b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ShippingInfoWidget extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27586a;

    /* renamed from: b, reason: collision with root package name */
    private final G0 f27587b;

    /* renamed from: c, reason: collision with root package name */
    private List f27588c;

    /* renamed from: d, reason: collision with root package name */
    private List f27589d;

    /* renamed from: e, reason: collision with root package name */
    private final CountryTextInputLayout f27590e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout f27591f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout f27592g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f27593h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout f27594i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f27595j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f27596k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f27597l;

    /* renamed from: m, reason: collision with root package name */
    private final StripeEditText f27598m;

    /* renamed from: n, reason: collision with root package name */
    private final StripeEditText f27599n;

    /* renamed from: o, reason: collision with root package name */
    private final StripeEditText f27600o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeEditText f27601p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeEditText f27602q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeEditText f27603r;

    /* renamed from: s, reason: collision with root package name */
    private final StripeEditText f27604s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27605a = new a("Line1", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f27606b = new a("Line2", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f27607c = new a("City", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f27608d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f27609e = new a("State", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f27610f = new a("Phone", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f27611g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27612h;

        static {
            a[] a8 = a();
            f27611g = a8;
            f27612h = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27605a, f27606b, f27607c, f27608d, f27609e, f27610f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27611g.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3156v implements Function1 {
        b(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        public final void d(C3825a p02) {
            AbstractC3159y.i(p02, "p0");
            ((ShippingInfoWidget) this.receiver).o(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((C3825a) obj);
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShippingInfoWidget f27614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ShippingInfoWidget shippingInfoWidget) {
            super(0);
            this.f27613a = context;
            this.f27614b = shippingInfoWidget;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.f invoke() {
            G2.f b8 = G2.f.b(LayoutInflater.from(this.f27613a), this.f27614b);
            AbstractC3159y.h(b8, "inflate(...)");
            return b8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void b() {
        if (d(a.f27605a)) {
            this.f27591f.setVisibility(8);
        }
        if (d(a.f27606b)) {
            this.f27592g.setVisibility(8);
        }
        if (d(a.f27609e)) {
            this.f27596k.setVisibility(8);
        }
        if (d(a.f27607c)) {
            this.f27593h.setVisibility(8);
        }
        if (d(a.f27608d)) {
            this.f27595j.setVisibility(8);
        }
        if (d(a.f27610f)) {
            this.f27597l.setVisibility(8);
        }
    }

    private final void c() {
        this.f27590e.setCountryChangeCallback$payments_core_release(new b(this));
        this.f27604s.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        n();
        l();
        C3825a selectedCountry$payments_core_release = this.f27590e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    private final boolean d(a aVar) {
        return this.f27589d.contains(aVar);
    }

    private final boolean e(a aVar) {
        return this.f27588c.contains(aVar);
    }

    private final boolean f(a aVar) {
        if (!e(aVar) && !d(aVar)) {
            return true;
        }
        return false;
    }

    private final void g(com.stripe.android.model.a aVar) {
        this.f27600o.setText(aVar.b());
        String c8 = aVar.c();
        if (c8 != null && c8.length() > 0) {
            this.f27590e.setCountrySelected$payments_core_release(c8);
        }
        this.f27598m.setText(aVar.e());
        this.f27599n.setText(aVar.f());
        this.f27602q.setText(aVar.i());
        this.f27603r.setText(aVar.j());
    }

    private final C1858C getRawShippingInformation() {
        C3826b c3826b;
        a.C0498a b8 = new a.C0498a().b(this.f27600o.getFieldText$payments_core_release());
        C3825a selectedCountry$payments_core_release = this.f27590e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            c3826b = selectedCountry$payments_core_release.c();
        } else {
            c3826b = null;
        }
        return new C1858C(b8.d(c3826b).e(this.f27598m.getFieldText$payments_core_release()).f(this.f27599n.getFieldText$payments_core_release()).g(this.f27602q.getFieldText$payments_core_release()).h(this.f27603r.getFieldText$payments_core_release()).a(), this.f27601p.getFieldText$payments_core_release(), this.f27604s.getFieldText$payments_core_release());
    }

    private final G2.f getViewBinding() {
        return (G2.f) this.f27586a.getValue();
    }

    private final void i() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27591f;
        if (e(a.f27605a)) {
            string = getResources().getString(AbstractC3053E.f32890l);
        } else {
            string = getResources().getString(AbstractC3081g.f33188a);
        }
        textInputLayout.setHint(string);
        this.f27592g.setHint(getResources().getString(AbstractC3053E.f32892m));
        TextInputLayout textInputLayout2 = this.f27595j;
        if (e(a.f27608d)) {
            string2 = getResources().getString(AbstractC3053E.f32900q);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37580g);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27596k;
        if (e(a.f27609e)) {
            string3 = getResources().getString(AbstractC3053E.f32906t);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37581h);
        }
        textInputLayout3.setHint(string3);
        this.f27602q.setErrorMessage(getResources().getString(AbstractC3053E.f32832C));
        this.f27603r.setErrorMessage(getResources().getString(AbstractC3053E.f32836E));
    }

    private final void j() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27591f;
        if (e(a.f27605a)) {
            string = getResources().getString(AbstractC3053E.f32886j);
        } else {
            string = getResources().getString(AbstractC3685e.f37574a);
        }
        textInputLayout.setHint(string);
        this.f27592g.setHint(getResources().getString(AbstractC3053E.f32888k));
        TextInputLayout textInputLayout2 = this.f27595j;
        if (e(a.f27608d)) {
            string2 = getResources().getString(AbstractC3053E.f32904s);
        } else {
            string2 = getResources().getString(AbstractC3053E.f32902r);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27596k;
        if (e(a.f27609e)) {
            string3 = getResources().getString(AbstractC3053E.f32896o);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37577d);
        }
        textInputLayout3.setHint(string3);
        this.f27602q.setErrorMessage(getResources().getString(AbstractC3053E.f32834D));
        this.f27603r.setErrorMessage(getResources().getString(AbstractC3053E.f32884i));
    }

    private final void k() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27591f;
        if (e(a.f27605a)) {
            string = getResources().getString(AbstractC3053E.f32886j);
        } else {
            string = getResources().getString(AbstractC3685e.f37574a);
        }
        textInputLayout.setHint(string);
        this.f27592g.setHint(getResources().getString(AbstractC3053E.f32888k));
        TextInputLayout textInputLayout2 = this.f27595j;
        if (e(a.f27608d)) {
            string2 = getResources().getString(AbstractC3053E.f32918z);
        } else {
            string2 = getResources().getString(AbstractC3053E.f32916y);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27596k;
        if (e(a.f27609e)) {
            string3 = getResources().getString(AbstractC3053E.f32910v);
        } else {
            string3 = getResources().getString(AbstractC3053E.f32908u);
        }
        textInputLayout3.setHint(string3);
        this.f27602q.setErrorMessage(getResources().getString(AbstractC3081g.f33210w));
        this.f27603r.setErrorMessage(getResources().getString(AbstractC3053E.f32838F));
    }

    private final void l() {
        String string;
        String string2;
        this.f27594i.setHint(getResources().getString(AbstractC3685e.f37578e));
        TextInputLayout textInputLayout = this.f27593h;
        if (e(a.f27607c)) {
            string = getResources().getString(AbstractC3053E.f32894n);
        } else {
            string = getResources().getString(AbstractC3685e.f37575b);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.f27597l;
        if (e(a.f27610f)) {
            string2 = getResources().getString(AbstractC3053E.f32898p);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37579f);
        }
        textInputLayout2.setHint(string2);
        b();
    }

    private final void m() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27591f;
        if (e(a.f27605a)) {
            string = getResources().getString(AbstractC3053E.f32890l);
        } else {
            string = getResources().getString(AbstractC3081g.f33188a);
        }
        textInputLayout.setHint(string);
        this.f27592g.setHint(getResources().getString(AbstractC3053E.f32892m));
        TextInputLayout textInputLayout2 = this.f27595j;
        if (e(a.f27608d)) {
            string2 = getResources().getString(AbstractC3053E.f32914x);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37583j);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27596k;
        if (e(a.f27609e)) {
            string3 = getResources().getString(AbstractC3053E.f32912w);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37582i);
        }
        textInputLayout3.setHint(string3);
        this.f27602q.setErrorMessage(getResources().getString(AbstractC3081g.f33209v));
        this.f27603r.setErrorMessage(getResources().getString(AbstractC3053E.f32842H));
    }

    private final void n() {
        this.f27598m.setErrorMessageListener(new C2439c0(this.f27591f));
        this.f27600o.setErrorMessageListener(new C2439c0(this.f27593h));
        this.f27601p.setErrorMessageListener(new C2439c0(this.f27594i));
        this.f27602q.setErrorMessageListener(new C2439c0(this.f27595j));
        this.f27603r.setErrorMessageListener(new C2439c0(this.f27596k));
        this.f27604s.setErrorMessageListener(new C2439c0(this.f27597l));
        this.f27598m.setErrorMessage(getResources().getString(AbstractC3053E.f32840G));
        this.f27600o.setErrorMessage(getResources().getString(AbstractC3053E.f32880g));
        this.f27601p.setErrorMessage(getResources().getString(AbstractC3053E.f32828A));
        this.f27604s.setErrorMessage(getResources().getString(AbstractC3053E.f32830B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C3825a c3825a) {
        int i8;
        String c8 = c3825a.c().c();
        if (AbstractC3159y.d(c8, Locale.US.getCountry())) {
            m();
        } else if (AbstractC3159y.d(c8, Locale.UK.getCountry())) {
            j();
        } else if (AbstractC3159y.d(c8, Locale.CANADA.getCountry())) {
            i();
        } else {
            k();
        }
        p(c3825a);
        TextInputLayout textInputLayout = this.f27595j;
        if (v2.d.f38784a.b(c3825a.c()) && !d(a.f27608d)) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        textInputLayout.setVisibility(i8);
    }

    private final void p(C3825a c3825a) {
        InputFilter[] inputFilterArr;
        StripeEditText stripeEditText = this.f27602q;
        if (AbstractC3159y.d(c3825a.c().c(), Locale.CANADA.getCountry())) {
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps()};
        } else {
            inputFilterArr = new InputFilter[0];
        }
        stripeEditText.setFilters(inputFilterArr);
    }

    public final List<a> getHiddenFields() {
        return this.f27589d;
    }

    public final List<a> getOptionalFields() {
        return this.f27588c;
    }

    public final C1858C getShippingInformation() {
        if (!q()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void h(C1858C c1858c) {
        if (c1858c == null) {
            return;
        }
        com.stripe.android.model.a b8 = c1858c.b();
        if (b8 != null) {
            g(b8);
        }
        this.f27601p.setText(c1858c.c());
        this.f27604s.setText(c1858c.e());
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
        C3826b c8;
        Editable text6 = this.f27598m.getText();
        if (text6 == null || (obj = text6.toString()) == null || (text = this.f27601p.getText()) == null || (obj2 = text.toString()) == null || (text2 = this.f27600o.getText()) == null || (obj3 = text2.toString()) == null || (text3 = this.f27603r.getText()) == null || (obj4 = text3.toString()) == null || (text4 = this.f27602q.getText()) == null || (obj5 = text4.toString()) == null || (text5 = this.f27604s.getText()) == null || (obj6 = text5.toString()) == null) {
            return false;
        }
        this.f27590e.p();
        C3825a selectedCountry$payments_core_release = this.f27590e.getSelectedCountry$payments_core_release();
        G0 g02 = this.f27587b;
        if (selectedCountry$payments_core_release != null && (c8 = selectedCountry$payments_core_release.c()) != null) {
            str = c8.c();
        } else {
            str = null;
        }
        boolean a8 = g02.a(obj5, str, this.f27588c, this.f27589d);
        this.f27602q.setShouldShowError(!a8);
        if (g6.n.u(obj) && f(a.f27605a)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f27598m.setShouldShowError(z8);
        if (g6.n.u(obj3) && f(a.f27607c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27600o.setShouldShowError(z9);
        boolean u8 = g6.n.u(obj2);
        this.f27601p.setShouldShowError(u8);
        if (g6.n.u(obj4) && f(a.f27609e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27603r.setShouldShowError(z10);
        if (g6.n.u(obj6) && f(a.f27610f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27604s.setShouldShowError(z11);
        if (!a8 || z8 || z9 || z10 || u8 || z11 || selectedCountry$payments_core_release == null) {
            return false;
        }
        return true;
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f27590e.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends a> value) {
        AbstractC3159y.i(value, "value");
        this.f27589d = value;
        l();
        C3825a selectedCountry$payments_core_release = this.f27590e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends a> value) {
        AbstractC3159y.i(value, "value");
        this.f27588c = value;
        l();
        C3825a selectedCountry$payments_core_release = this.f27590e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27586a = L5.l.b(new c(context, this));
        this.f27587b = new G0();
        this.f27588c = AbstractC1246t.m();
        this.f27589d = AbstractC1246t.m();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().f3111b;
        AbstractC3159y.h(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.f27590e = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().f3119j;
        AbstractC3159y.h(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.f27591f = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().f3120k;
        AbstractC3159y.h(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.f27592g = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().f3121l;
        AbstractC3159y.h(tlCityAaw, "tlCityAaw");
        this.f27593h = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().f3122m;
        AbstractC3159y.h(tlNameAaw, "tlNameAaw");
        this.f27594i = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().f3124o;
        AbstractC3159y.h(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.f27595j = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().f3125p;
        AbstractC3159y.h(tlStateAaw, "tlStateAaw");
        this.f27596k = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().f3123n;
        AbstractC3159y.h(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.f27597l = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().f3112c;
        AbstractC3159y.h(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.f27598m = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().f3113d;
        AbstractC3159y.h(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.f27599n = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().f3114e;
        AbstractC3159y.h(etCityAaw, "etCityAaw");
        this.f27600o = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().f3115f;
        AbstractC3159y.h(etNameAaw, "etNameAaw");
        this.f27601p = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().f3117h;
        AbstractC3159y.h(etPostalCodeAaw, "etPostalCodeAaw");
        this.f27602q = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().f3118i;
        AbstractC3159y.h(etStateAaw, "etStateAaw");
        this.f27603r = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().f3116g;
        AbstractC3159y.h(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.f27604s = etPhoneNumberAaw;
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
