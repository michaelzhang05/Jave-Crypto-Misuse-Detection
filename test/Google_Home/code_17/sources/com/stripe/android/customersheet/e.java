package com.stripe.android.customersheet;

import M3.G;
import M3.H;
import M3.InterfaceC1324t;
import P5.AbstractC1378t;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import f4.InterfaceC2835a;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f24717a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24718b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24719c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24720d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24721e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2835a f24722f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24723g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24724h;

    /* loaded from: classes4.dex */
    public static final class a extends e {

        /* renamed from: A, reason: collision with root package name */
        private final com.stripe.android.payments.bankaccount.navigation.d f24725A;

        /* renamed from: B, reason: collision with root package name */
        private final InterfaceC2835a f24726B;

        /* renamed from: C, reason: collision with root package name */
        private final n3.i f24727C;

        /* renamed from: i, reason: collision with root package name */
        private final String f24728i;

        /* renamed from: j, reason: collision with root package name */
        private final List f24729j;

        /* renamed from: k, reason: collision with root package name */
        private final z3.c f24730k;

        /* renamed from: l, reason: collision with root package name */
        private final List f24731l;

        /* renamed from: m, reason: collision with root package name */
        private final D3.a f24732m;

        /* renamed from: n, reason: collision with root package name */
        private final E3.d f24733n;

        /* renamed from: o, reason: collision with root package name */
        private final B3.f f24734o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f24735p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f24736q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f24737r;

        /* renamed from: s, reason: collision with root package name */
        private final B2.b f24738s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f24739t;

        /* renamed from: u, reason: collision with root package name */
        private final B2.b f24740u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f24741v;

        /* renamed from: w, reason: collision with root package name */
        private final PrimaryButton.b f24742w;

        /* renamed from: x, reason: collision with root package name */
        private final B2.b f24743x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f24744y;

        /* renamed from: z, reason: collision with root package name */
        private final boolean f24745z;

        public /* synthetic */ a(String str, List list, z3.c cVar, List list2, D3.a aVar, E3.d dVar, B3.f fVar, boolean z8, boolean z9, boolean z10, B2.b bVar, boolean z11, B2.b bVar2, boolean z12, PrimaryButton.b bVar3, B2.b bVar4, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar2, InterfaceC2835a interfaceC2835a, n3.i iVar, int i8, AbstractC3247p abstractC3247p) {
            this(str, list, cVar, list2, aVar, dVar, fVar, z8, z9, z10, (i8 & 1024) != 0 ? null : bVar, z11, bVar2, z12, bVar3, (32768 & i8) != 0 ? null : bVar4, (65536 & i8) != 0 ? false : z13, (i8 & 131072) != 0 ? false : z14, dVar2, interfaceC2835a, iVar);
        }

        public final E3.d A() {
            return this.f24733n;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC2835a c() {
            return this.f24726B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f24728i, aVar.f24728i) && AbstractC3255y.d(this.f24729j, aVar.f24729j) && AbstractC3255y.d(this.f24730k, aVar.f24730k) && AbstractC3255y.d(this.f24731l, aVar.f24731l) && AbstractC3255y.d(this.f24732m, aVar.f24732m) && AbstractC3255y.d(this.f24733n, aVar.f24733n) && AbstractC3255y.d(this.f24734o, aVar.f24734o) && this.f24735p == aVar.f24735p && this.f24736q == aVar.f24736q && this.f24737r == aVar.f24737r && AbstractC3255y.d(this.f24738s, aVar.f24738s) && this.f24739t == aVar.f24739t && AbstractC3255y.d(this.f24740u, aVar.f24740u) && this.f24741v == aVar.f24741v && AbstractC3255y.d(this.f24742w, aVar.f24742w) && AbstractC3255y.d(this.f24743x, aVar.f24743x) && this.f24744y == aVar.f24744y && this.f24745z == aVar.f24745z && AbstractC3255y.d(this.f24725A, aVar.f24725A) && AbstractC3255y.d(this.f24726B, aVar.f24726B) && AbstractC3255y.d(this.f24727C, aVar.f24727C);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f24736q;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f24737r;
        }

        public int hashCode() {
            int hashCode = ((this.f24728i.hashCode() * 31) + this.f24729j.hashCode()) * 31;
            z3.c cVar = this.f24730k;
            int hashCode2 = (((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f24731l.hashCode()) * 31) + this.f24732m.hashCode()) * 31) + this.f24733n.hashCode()) * 31;
            B3.f fVar = this.f24734o;
            int hashCode3 = (((((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24735p)) * 31) + androidx.compose.foundation.a.a(this.f24736q)) * 31) + androidx.compose.foundation.a.a(this.f24737r)) * 31;
            B2.b bVar = this.f24738s;
            int hashCode4 = (((((((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24739t)) * 31) + this.f24740u.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24741v)) * 31;
            PrimaryButton.b bVar2 = this.f24742w;
            int hashCode5 = (hashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            B2.b bVar3 = this.f24743x;
            int hashCode6 = (((((hashCode5 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24744y)) * 31) + androidx.compose.foundation.a.a(this.f24745z)) * 31;
            com.stripe.android.payments.bankaccount.navigation.d dVar = this.f24725A;
            return ((((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f24726B.hashCode()) * 31) + this.f24727C.hashCode();
        }

        public final a j(String paymentMethodCode, List supportedPaymentMethods, z3.c cVar, List formElements, D3.a formArguments, E3.d usBankAccountFormArguments, B3.f fVar, boolean z8, boolean z9, boolean z10, B2.b bVar, boolean z11, B2.b primaryButtonLabel, boolean z12, PrimaryButton.b bVar2, B2.b bVar3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC2835a cbcEligibility, n3.i errorReporter) {
            AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3255y.i(formElements, "formElements");
            AbstractC3255y.i(formArguments, "formArguments");
            AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3255y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            AbstractC3255y.i(errorReporter, "errorReporter");
            return new a(paymentMethodCode, supportedPaymentMethods, cVar, formElements, formArguments, usBankAccountFormArguments, fVar, z8, z9, z10, bVar, z11, primaryButtonLabel, z12, bVar2, bVar3, z13, z14, dVar, cbcEligibility, errorReporter);
        }

        public final com.stripe.android.payments.bankaccount.navigation.d l() {
            return this.f24725A;
        }

        public final PrimaryButton.b m() {
            return this.f24742w;
        }

        public final boolean n() {
            return this.f24745z;
        }

        public final B3.f o() {
            return this.f24734o;
        }

        public final boolean p() {
            return this.f24735p;
        }

        public final B2.b q() {
            return this.f24738s;
        }

        public final D3.a r() {
            return this.f24732m;
        }

        public final List s() {
            return this.f24731l;
        }

        public final z3.c t() {
            return this.f24730k;
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.f24728i + ", supportedPaymentMethods=" + this.f24729j + ", formFieldValues=" + this.f24730k + ", formElements=" + this.f24731l + ", formArguments=" + this.f24732m + ", usBankAccountFormArguments=" + this.f24733n + ", draftPaymentSelection=" + this.f24734o + ", enabled=" + this.f24735p + ", isLiveMode=" + this.f24736q + ", isProcessing=" + this.f24737r + ", errorMessage=" + this.f24738s + ", isFirstPaymentMethod=" + this.f24739t + ", primaryButtonLabel=" + this.f24740u + ", primaryButtonEnabled=" + this.f24741v + ", customPrimaryButtonUiState=" + this.f24742w + ", mandateText=" + this.f24743x + ", showMandateAbovePrimaryButton=" + this.f24744y + ", displayDismissConfirmationModal=" + this.f24745z + ", bankAccountResult=" + this.f24725A + ", cbcEligibility=" + this.f24726B + ", errorReporter=" + this.f24727C + ")";
        }

        public final B2.b u() {
            return this.f24743x;
        }

        public final String v() {
            return this.f24728i;
        }

        public final boolean w() {
            return this.f24741v;
        }

        public final B2.b x() {
            return this.f24740u;
        }

        public final boolean y() {
            return this.f24744y;
        }

        public final List z() {
            return this.f24729j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String paymentMethodCode, List supportedPaymentMethods, z3.c cVar, List formElements, D3.a formArguments, E3.d usBankAccountFormArguments, B3.f fVar, boolean z8, boolean z9, boolean z10, B2.b bVar, boolean z11, B2.b primaryButtonLabel, boolean z12, PrimaryButton.b bVar2, B2.b bVar3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC2835a cbcEligibility, n3.i errorReporter) {
            super(AbstractC1378t.m(), z9, z10, false, !z11, cbcEligibility, true, false, null);
            AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3255y.i(formElements, "formElements");
            AbstractC3255y.i(formArguments, "formArguments");
            AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3255y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            AbstractC3255y.i(errorReporter, "errorReporter");
            this.f24728i = paymentMethodCode;
            this.f24729j = supportedPaymentMethods;
            this.f24730k = cVar;
            this.f24731l = formElements;
            this.f24732m = formArguments;
            this.f24733n = usBankAccountFormArguments;
            this.f24734o = fVar;
            this.f24735p = z8;
            this.f24736q = z9;
            this.f24737r = z10;
            this.f24738s = bVar;
            this.f24739t = z11;
            this.f24740u = primaryButtonLabel;
            this.f24741v = z12;
            this.f24742w = bVar2;
            this.f24743x = bVar3;
            this.f24744y = z13;
            this.f24745z = z14;
            this.f24725A = dVar;
            this.f24726B = cbcEligibility;
            this.f24727C = errorReporter;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends e {

        /* renamed from: i, reason: collision with root package name */
        private final InterfaceC1324t f24746i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f24747j;

        /* renamed from: k, reason: collision with root package name */
        private final InterfaceC2835a f24748k;

        /* renamed from: l, reason: collision with root package name */
        private final List f24749l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f24750m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f24751n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1324t editPaymentMethodInteractor, boolean z8, InterfaceC2835a cbcEligibility, List savedPaymentMethods, boolean z9, boolean z10) {
            super(savedPaymentMethods, z8, false, false, true, cbcEligibility, z9, z10, null);
            AbstractC3255y.i(editPaymentMethodInteractor, "editPaymentMethodInteractor");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            AbstractC3255y.i(savedPaymentMethods, "savedPaymentMethods");
            this.f24746i = editPaymentMethodInteractor;
            this.f24747j = z8;
            this.f24748k = cbcEligibility;
            this.f24749l = savedPaymentMethods;
            this.f24750m = z9;
            this.f24751n = z10;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f24750m;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC2835a c() {
            return this.f24748k;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f24749l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f24746i, bVar.f24746i) && this.f24747j == bVar.f24747j && AbstractC3255y.d(this.f24748k, bVar.f24748k) && AbstractC3255y.d(this.f24749l, bVar.f24749l) && this.f24750m == bVar.f24750m && this.f24751n == bVar.f24751n;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f24747j;
        }

        public int hashCode() {
            return (((((((((this.f24746i.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24747j)) * 31) + this.f24748k.hashCode()) * 31) + this.f24749l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24750m)) * 31) + androidx.compose.foundation.a.a(this.f24751n);
        }

        public final InterfaceC1324t j() {
            return this.f24746i;
        }

        public String toString() {
            return "EditPaymentMethod(editPaymentMethodInteractor=" + this.f24746i + ", isLiveMode=" + this.f24747j + ", cbcEligibility=" + this.f24748k + ", savedPaymentMethods=" + this.f24749l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f24750m + ", canRemovePaymentMethods=" + this.f24751n + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends e {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f24752i;

        public c(boolean z8) {
            super(AbstractC1378t.m(), z8, false, false, false, InterfaceC2835a.c.f31958a, true, false, null);
            this.f24752i = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f24752i == ((c) obj).f24752i;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f24752i;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f24752i);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.f24752i + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends e {

        /* renamed from: i, reason: collision with root package name */
        private final String f24753i;

        /* renamed from: j, reason: collision with root package name */
        private final List f24754j;

        /* renamed from: k, reason: collision with root package name */
        private final B3.f f24755k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f24756l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f24757m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f24758n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f24759o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f24760p;

        /* renamed from: q, reason: collision with root package name */
        private final String f24761q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f24762r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f24763s;

        /* renamed from: t, reason: collision with root package name */
        private final String f24764t;

        /* renamed from: u, reason: collision with root package name */
        private final o f24765u;

        /* renamed from: v, reason: collision with root package name */
        private final B2.b f24766v;

        /* renamed from: w, reason: collision with root package name */
        private final InterfaceC2835a f24767w;

        public /* synthetic */ d(String str, List list, B3.f fVar, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, B2.b bVar, InterfaceC2835a interfaceC2835a, int i8, AbstractC3247p abstractC3247p) {
            this(str, list, fVar, z8, z9, z10, z11, z12, str2, z13, z14, (i8 & 2048) != 0 ? null : str3, (i8 & 4096) != 0 ? null : oVar, (i8 & 8192) != 0 ? null : bVar, interfaceC2835a);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f24762r;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC2835a c() {
            return this.f24767w;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f24754j;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean e() {
            return this.f24758n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f24753i, dVar.f24753i) && AbstractC3255y.d(this.f24754j, dVar.f24754j) && AbstractC3255y.d(this.f24755k, dVar.f24755k) && this.f24756l == dVar.f24756l && this.f24757m == dVar.f24757m && this.f24758n == dVar.f24758n && this.f24759o == dVar.f24759o && this.f24760p == dVar.f24760p && AbstractC3255y.d(this.f24761q, dVar.f24761q) && this.f24762r == dVar.f24762r && this.f24763s == dVar.f24763s && AbstractC3255y.d(this.f24764t, dVar.f24764t) && AbstractC3255y.d(this.f24765u, dVar.f24765u) && AbstractC3255y.d(this.f24766v, dVar.f24766v) && AbstractC3255y.d(this.f24767w, dVar.f24767w);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f24756l;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f24757m;
        }

        public int hashCode() {
            String str = this.f24753i;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f24754j.hashCode()) * 31;
            B3.f fVar = this.f24755k;
            int hashCode2 = (((((((((((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24756l)) * 31) + androidx.compose.foundation.a.a(this.f24757m)) * 31) + androidx.compose.foundation.a.a(this.f24758n)) * 31) + androidx.compose.foundation.a.a(this.f24759o)) * 31) + androidx.compose.foundation.a.a(this.f24760p)) * 31;
            String str2 = this.f24761q;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24762r)) * 31) + androidx.compose.foundation.a.a(this.f24763s)) * 31;
            String str3 = this.f24764t;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o oVar = this.f24765u;
            int hashCode5 = (hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            B2.b bVar = this.f24766v;
            return ((hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f24767w.hashCode();
        }

        public final d j(String str, List savedPaymentMethods, B3.f fVar, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, B2.b bVar, InterfaceC2835a cbcEligibility) {
            AbstractC3255y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            return new d(str, savedPaymentMethods, fVar, z8, z9, z10, z11, z12, str2, z13, z14, str3, oVar, bVar, cbcEligibility);
        }

        public boolean l() {
            return this.f24763s;
        }

        public final String m() {
            return this.f24764t;
        }

        public final B2.b n() {
            return this.f24766v;
        }

        public final B3.f o() {
            return this.f24755k;
        }

        public final boolean p() {
            return !g();
        }

        public final String q() {
            return this.f24761q;
        }

        public final boolean r() {
            return this.f24760p;
        }

        public final String s() {
            return this.f24753i;
        }

        public final boolean t() {
            return this.f24759o;
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.f24753i + ", savedPaymentMethods=" + this.f24754j + ", paymentSelection=" + this.f24755k + ", isLiveMode=" + this.f24756l + ", isProcessing=" + this.f24757m + ", isEditing=" + this.f24758n + ", isGooglePayEnabled=" + this.f24759o + ", primaryButtonVisible=" + this.f24760p + ", primaryButtonLabel=" + this.f24761q + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f24762r + ", canRemovePaymentMethods=" + this.f24763s + ", errorMessage=" + this.f24764t + ", unconfirmedPaymentMethod=" + this.f24765u + ", mandateText=" + this.f24766v + ", cbcEligibility=" + this.f24767w + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List savedPaymentMethods, B3.f fVar, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, B2.b bVar, InterfaceC2835a cbcEligibility) {
            super(savedPaymentMethods, z8, z9, z10, false, cbcEligibility, z13, z14, null);
            AbstractC3255y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3255y.i(cbcEligibility, "cbcEligibility");
            this.f24753i = str;
            this.f24754j = savedPaymentMethods;
            this.f24755k = fVar;
            this.f24756l = z8;
            this.f24757m = z9;
            this.f24758n = z10;
            this.f24759o = z11;
            this.f24760p = z12;
            this.f24761q = str2;
            this.f24762r = z13;
            this.f24763s = z14;
            this.f24764t = str3;
            this.f24765u = oVar;
            this.f24766v = bVar;
            this.f24767w = cbcEligibility;
        }
    }

    public /* synthetic */ e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC2835a interfaceC2835a, boolean z12, boolean z13, AbstractC3247p abstractC3247p) {
        this(list, z8, z9, z10, z11, interfaceC2835a, z12, z13);
    }

    public boolean a() {
        return this.f24723g;
    }

    public boolean b() {
        return this.f24721e;
    }

    public InterfaceC2835a c() {
        return this.f24722f;
    }

    public List d() {
        return this.f24717a;
    }

    public boolean e() {
        return this.f24720d;
    }

    public abstract boolean f();

    public boolean g() {
        return this.f24719c;
    }

    public final boolean h(r3.d isFinancialConnectionsAvailable) {
        c.C0541c g8;
        FinancialConnectionsSession a8;
        AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        if (this instanceof a) {
            a aVar = (a) this;
            if (AbstractC3255y.d(aVar.v(), o.p.f25577O.f25605a) && isFinancialConnectionsAvailable.invoke() && (aVar.l() instanceof d.b) && (g8 = ((d.b) aVar.l()).a().g()) != null && (a8 = g8.a()) != null) {
                a8.getPaymentAccount();
                return false;
            }
            return false;
        }
        return false;
    }

    public final G i(Function0 onEditIconPressed) {
        AbstractC3255y.i(onEditIconPressed, "onEditIconPressed");
        return H.f6539a.a(b(), f(), new G.a.C0118a(e(), E2.f.a(a(), d(), c()), onEditIconPressed));
    }

    private e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC2835a interfaceC2835a, boolean z12, boolean z13) {
        this.f24717a = list;
        this.f24718b = z8;
        this.f24719c = z9;
        this.f24720d = z10;
        this.f24721e = z11;
        this.f24722f = interfaceC2835a;
        this.f24723g = z12;
        this.f24724h = z13;
    }
}
