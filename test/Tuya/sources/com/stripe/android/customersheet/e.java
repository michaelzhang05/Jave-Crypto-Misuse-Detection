package com.stripe.android.customersheet;

import J3.G;
import J3.H;
import J3.InterfaceC1211t;
import M5.AbstractC1246t;
import c4.InterfaceC1925a;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f23662a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23663b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23664c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23665d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23666e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1925a f23667f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23668g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23669h;

    /* loaded from: classes4.dex */
    public static final class a extends e {

        /* renamed from: A, reason: collision with root package name */
        private final com.stripe.android.payments.bankaccount.navigation.d f23670A;

        /* renamed from: B, reason: collision with root package name */
        private final InterfaceC1925a f23671B;

        /* renamed from: C, reason: collision with root package name */
        private final k3.i f23672C;

        /* renamed from: i, reason: collision with root package name */
        private final String f23673i;

        /* renamed from: j, reason: collision with root package name */
        private final List f23674j;

        /* renamed from: k, reason: collision with root package name */
        private final w3.c f23675k;

        /* renamed from: l, reason: collision with root package name */
        private final List f23676l;

        /* renamed from: m, reason: collision with root package name */
        private final A3.a f23677m;

        /* renamed from: n, reason: collision with root package name */
        private final B3.d f23678n;

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC3991f f23679o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f23680p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f23681q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23682r;

        /* renamed from: s, reason: collision with root package name */
        private final InterfaceC3983b f23683s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f23684t;

        /* renamed from: u, reason: collision with root package name */
        private final InterfaceC3983b f23685u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f23686v;

        /* renamed from: w, reason: collision with root package name */
        private final PrimaryButton.b f23687w;

        /* renamed from: x, reason: collision with root package name */
        private final InterfaceC3983b f23688x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f23689y;

        /* renamed from: z, reason: collision with root package name */
        private final boolean f23690z;

        public /* synthetic */ a(String str, List list, w3.c cVar, List list2, A3.a aVar, B3.d dVar, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b interfaceC3983b2, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar2, InterfaceC1925a interfaceC1925a, k3.i iVar, int i8, AbstractC3151p abstractC3151p) {
            this(str, list, cVar, list2, aVar, dVar, abstractC3991f, z8, z9, z10, (i8 & 1024) != 0 ? null : interfaceC3983b, z11, interfaceC3983b2, z12, bVar, (32768 & i8) != 0 ? null : interfaceC3983b3, (65536 & i8) != 0 ? false : z13, (i8 & 131072) != 0 ? false : z14, dVar2, interfaceC1925a, iVar);
        }

        public final B3.d A() {
            return this.f23678n;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23671B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f23673i, aVar.f23673i) && AbstractC3159y.d(this.f23674j, aVar.f23674j) && AbstractC3159y.d(this.f23675k, aVar.f23675k) && AbstractC3159y.d(this.f23676l, aVar.f23676l) && AbstractC3159y.d(this.f23677m, aVar.f23677m) && AbstractC3159y.d(this.f23678n, aVar.f23678n) && AbstractC3159y.d(this.f23679o, aVar.f23679o) && this.f23680p == aVar.f23680p && this.f23681q == aVar.f23681q && this.f23682r == aVar.f23682r && AbstractC3159y.d(this.f23683s, aVar.f23683s) && this.f23684t == aVar.f23684t && AbstractC3159y.d(this.f23685u, aVar.f23685u) && this.f23686v == aVar.f23686v && AbstractC3159y.d(this.f23687w, aVar.f23687w) && AbstractC3159y.d(this.f23688x, aVar.f23688x) && this.f23689y == aVar.f23689y && this.f23690z == aVar.f23690z && AbstractC3159y.d(this.f23670A, aVar.f23670A) && AbstractC3159y.d(this.f23671B, aVar.f23671B) && AbstractC3159y.d(this.f23672C, aVar.f23672C);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23681q;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f23682r;
        }

        public int hashCode() {
            int hashCode = ((this.f23673i.hashCode() * 31) + this.f23674j.hashCode()) * 31;
            w3.c cVar = this.f23675k;
            int hashCode2 = (((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f23676l.hashCode()) * 31) + this.f23677m.hashCode()) * 31) + this.f23678n.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f23679o;
            int hashCode3 = (((((((hashCode2 + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23680p)) * 31) + androidx.compose.foundation.a.a(this.f23681q)) * 31) + androidx.compose.foundation.a.a(this.f23682r)) * 31;
            InterfaceC3983b interfaceC3983b = this.f23683s;
            int hashCode4 = (((((((hashCode3 + (interfaceC3983b == null ? 0 : interfaceC3983b.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23684t)) * 31) + this.f23685u.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23686v)) * 31;
            PrimaryButton.b bVar = this.f23687w;
            int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            InterfaceC3983b interfaceC3983b2 = this.f23688x;
            int hashCode6 = (((((hashCode5 + (interfaceC3983b2 == null ? 0 : interfaceC3983b2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23689y)) * 31) + androidx.compose.foundation.a.a(this.f23690z)) * 31;
            com.stripe.android.payments.bankaccount.navigation.d dVar = this.f23670A;
            return ((((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f23671B.hashCode()) * 31) + this.f23672C.hashCode();
        }

        public final a j(String paymentMethodCode, List supportedPaymentMethods, w3.c cVar, List formElements, A3.a formArguments, B3.d usBankAccountFormArguments, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b primaryButtonLabel, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b2, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC1925a cbcEligibility, k3.i errorReporter) {
            AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(errorReporter, "errorReporter");
            return new a(paymentMethodCode, supportedPaymentMethods, cVar, formElements, formArguments, usBankAccountFormArguments, abstractC3991f, z8, z9, z10, interfaceC3983b, z11, primaryButtonLabel, z12, bVar, interfaceC3983b2, z13, z14, dVar, cbcEligibility, errorReporter);
        }

        public final com.stripe.android.payments.bankaccount.navigation.d l() {
            return this.f23670A;
        }

        public final PrimaryButton.b m() {
            return this.f23687w;
        }

        public final boolean n() {
            return this.f23690z;
        }

        public final AbstractC3991f o() {
            return this.f23679o;
        }

        public final boolean p() {
            return this.f23680p;
        }

        public final InterfaceC3983b q() {
            return this.f23683s;
        }

        public final A3.a r() {
            return this.f23677m;
        }

        public final List s() {
            return this.f23676l;
        }

        public final w3.c t() {
            return this.f23675k;
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.f23673i + ", supportedPaymentMethods=" + this.f23674j + ", formFieldValues=" + this.f23675k + ", formElements=" + this.f23676l + ", formArguments=" + this.f23677m + ", usBankAccountFormArguments=" + this.f23678n + ", draftPaymentSelection=" + this.f23679o + ", enabled=" + this.f23680p + ", isLiveMode=" + this.f23681q + ", isProcessing=" + this.f23682r + ", errorMessage=" + this.f23683s + ", isFirstPaymentMethod=" + this.f23684t + ", primaryButtonLabel=" + this.f23685u + ", primaryButtonEnabled=" + this.f23686v + ", customPrimaryButtonUiState=" + this.f23687w + ", mandateText=" + this.f23688x + ", showMandateAbovePrimaryButton=" + this.f23689y + ", displayDismissConfirmationModal=" + this.f23690z + ", bankAccountResult=" + this.f23670A + ", cbcEligibility=" + this.f23671B + ", errorReporter=" + this.f23672C + ")";
        }

        public final InterfaceC3983b u() {
            return this.f23688x;
        }

        public final String v() {
            return this.f23673i;
        }

        public final boolean w() {
            return this.f23686v;
        }

        public final InterfaceC3983b x() {
            return this.f23685u;
        }

        public final boolean y() {
            return this.f23689y;
        }

        public final List z() {
            return this.f23674j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String paymentMethodCode, List supportedPaymentMethods, w3.c cVar, List formElements, A3.a formArguments, B3.d usBankAccountFormArguments, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b primaryButtonLabel, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b2, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC1925a cbcEligibility, k3.i errorReporter) {
            super(AbstractC1246t.m(), z9, z10, false, !z11, cbcEligibility, true, false, null);
            AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(errorReporter, "errorReporter");
            this.f23673i = paymentMethodCode;
            this.f23674j = supportedPaymentMethods;
            this.f23675k = cVar;
            this.f23676l = formElements;
            this.f23677m = formArguments;
            this.f23678n = usBankAccountFormArguments;
            this.f23679o = abstractC3991f;
            this.f23680p = z8;
            this.f23681q = z9;
            this.f23682r = z10;
            this.f23683s = interfaceC3983b;
            this.f23684t = z11;
            this.f23685u = primaryButtonLabel;
            this.f23686v = z12;
            this.f23687w = bVar;
            this.f23688x = interfaceC3983b2;
            this.f23689y = z13;
            this.f23690z = z14;
            this.f23670A = dVar;
            this.f23671B = cbcEligibility;
            this.f23672C = errorReporter;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends e {

        /* renamed from: i, reason: collision with root package name */
        private final InterfaceC1211t f23691i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f23692j;

        /* renamed from: k, reason: collision with root package name */
        private final InterfaceC1925a f23693k;

        /* renamed from: l, reason: collision with root package name */
        private final List f23694l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f23695m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f23696n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1211t editPaymentMethodInteractor, boolean z8, InterfaceC1925a cbcEligibility, List savedPaymentMethods, boolean z9, boolean z10) {
            super(savedPaymentMethods, z8, false, false, true, cbcEligibility, z9, z10, null);
            AbstractC3159y.i(editPaymentMethodInteractor, "editPaymentMethodInteractor");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            this.f23691i = editPaymentMethodInteractor;
            this.f23692j = z8;
            this.f23693k = cbcEligibility;
            this.f23694l = savedPaymentMethods;
            this.f23695m = z9;
            this.f23696n = z10;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f23695m;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23693k;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f23694l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f23691i, bVar.f23691i) && this.f23692j == bVar.f23692j && AbstractC3159y.d(this.f23693k, bVar.f23693k) && AbstractC3159y.d(this.f23694l, bVar.f23694l) && this.f23695m == bVar.f23695m && this.f23696n == bVar.f23696n;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23692j;
        }

        public int hashCode() {
            return (((((((((this.f23691i.hashCode() * 31) + androidx.compose.foundation.a.a(this.f23692j)) * 31) + this.f23693k.hashCode()) * 31) + this.f23694l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23695m)) * 31) + androidx.compose.foundation.a.a(this.f23696n);
        }

        public final InterfaceC1211t j() {
            return this.f23691i;
        }

        public String toString() {
            return "EditPaymentMethod(editPaymentMethodInteractor=" + this.f23691i + ", isLiveMode=" + this.f23692j + ", cbcEligibility=" + this.f23693k + ", savedPaymentMethods=" + this.f23694l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f23695m + ", canRemovePaymentMethods=" + this.f23696n + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends e {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f23697i;

        public c(boolean z8) {
            super(AbstractC1246t.m(), z8, false, false, false, InterfaceC1925a.c.f14983a, true, false, null);
            this.f23697i = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f23697i == ((c) obj).f23697i;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23697i;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f23697i);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.f23697i + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends e {

        /* renamed from: i, reason: collision with root package name */
        private final String f23698i;

        /* renamed from: j, reason: collision with root package name */
        private final List f23699j;

        /* renamed from: k, reason: collision with root package name */
        private final AbstractC3991f f23700k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f23701l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f23702m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f23703n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f23704o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f23705p;

        /* renamed from: q, reason: collision with root package name */
        private final String f23706q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23707r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f23708s;

        /* renamed from: t, reason: collision with root package name */
        private final String f23709t;

        /* renamed from: u, reason: collision with root package name */
        private final o f23710u;

        /* renamed from: v, reason: collision with root package name */
        private final InterfaceC3983b f23711v;

        /* renamed from: w, reason: collision with root package name */
        private final InterfaceC1925a f23712w;

        public /* synthetic */ d(String str, List list, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a interfaceC1925a, int i8, AbstractC3151p abstractC3151p) {
            this(str, list, abstractC3991f, z8, z9, z10, z11, z12, str2, z13, z14, (i8 & 2048) != 0 ? null : str3, (i8 & 4096) != 0 ? null : oVar, (i8 & 8192) != 0 ? null : interfaceC3983b, interfaceC1925a);
        }

        public static /* synthetic */ d k(d dVar, String str, List list, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a interfaceC1925a, int i8, Object obj) {
            String str4;
            List list2;
            AbstractC3991f abstractC3991f2;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            String str5;
            boolean z20;
            boolean z21;
            String str6;
            o oVar2;
            InterfaceC3983b interfaceC3983b2;
            InterfaceC1925a interfaceC1925a2;
            if ((i8 & 1) != 0) {
                str4 = dVar.f23698i;
            } else {
                str4 = str;
            }
            if ((i8 & 2) != 0) {
                list2 = dVar.f23699j;
            } else {
                list2 = list;
            }
            if ((i8 & 4) != 0) {
                abstractC3991f2 = dVar.f23700k;
            } else {
                abstractC3991f2 = abstractC3991f;
            }
            if ((i8 & 8) != 0) {
                z15 = dVar.f23701l;
            } else {
                z15 = z8;
            }
            if ((i8 & 16) != 0) {
                z16 = dVar.f23702m;
            } else {
                z16 = z9;
            }
            if ((i8 & 32) != 0) {
                z17 = dVar.f23703n;
            } else {
                z17 = z10;
            }
            if ((i8 & 64) != 0) {
                z18 = dVar.f23704o;
            } else {
                z18 = z11;
            }
            if ((i8 & 128) != 0) {
                z19 = dVar.f23705p;
            } else {
                z19 = z12;
            }
            if ((i8 & 256) != 0) {
                str5 = dVar.f23706q;
            } else {
                str5 = str2;
            }
            if ((i8 & 512) != 0) {
                z20 = dVar.f23707r;
            } else {
                z20 = z13;
            }
            if ((i8 & 1024) != 0) {
                z21 = dVar.f23708s;
            } else {
                z21 = z14;
            }
            if ((i8 & 2048) != 0) {
                str6 = dVar.f23709t;
            } else {
                str6 = str3;
            }
            if ((i8 & 4096) != 0) {
                oVar2 = dVar.f23710u;
            } else {
                oVar2 = oVar;
            }
            if ((i8 & 8192) != 0) {
                interfaceC3983b2 = dVar.f23711v;
            } else {
                interfaceC3983b2 = interfaceC3983b;
            }
            if ((i8 & 16384) != 0) {
                interfaceC1925a2 = dVar.f23712w;
            } else {
                interfaceC1925a2 = interfaceC1925a;
            }
            return dVar.j(str4, list2, abstractC3991f2, z15, z16, z17, z18, z19, str5, z20, z21, str6, oVar2, interfaceC3983b2, interfaceC1925a2);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f23707r;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23712w;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f23699j;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean e() {
            return this.f23703n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f23698i, dVar.f23698i) && AbstractC3159y.d(this.f23699j, dVar.f23699j) && AbstractC3159y.d(this.f23700k, dVar.f23700k) && this.f23701l == dVar.f23701l && this.f23702m == dVar.f23702m && this.f23703n == dVar.f23703n && this.f23704o == dVar.f23704o && this.f23705p == dVar.f23705p && AbstractC3159y.d(this.f23706q, dVar.f23706q) && this.f23707r == dVar.f23707r && this.f23708s == dVar.f23708s && AbstractC3159y.d(this.f23709t, dVar.f23709t) && AbstractC3159y.d(this.f23710u, dVar.f23710u) && AbstractC3159y.d(this.f23711v, dVar.f23711v) && AbstractC3159y.d(this.f23712w, dVar.f23712w);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23701l;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f23702m;
        }

        public int hashCode() {
            String str = this.f23698i;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f23699j.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f23700k;
            int hashCode2 = (((((((((((hashCode + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23701l)) * 31) + androidx.compose.foundation.a.a(this.f23702m)) * 31) + androidx.compose.foundation.a.a(this.f23703n)) * 31) + androidx.compose.foundation.a.a(this.f23704o)) * 31) + androidx.compose.foundation.a.a(this.f23705p)) * 31;
            String str2 = this.f23706q;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23707r)) * 31) + androidx.compose.foundation.a.a(this.f23708s)) * 31;
            String str3 = this.f23709t;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o oVar = this.f23710u;
            int hashCode5 = (hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            InterfaceC3983b interfaceC3983b = this.f23711v;
            return ((hashCode5 + (interfaceC3983b != null ? interfaceC3983b.hashCode() : 0)) * 31) + this.f23712w.hashCode();
        }

        public final d j(String str, List savedPaymentMethods, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a cbcEligibility) {
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            return new d(str, savedPaymentMethods, abstractC3991f, z8, z9, z10, z11, z12, str2, z13, z14, str3, oVar, interfaceC3983b, cbcEligibility);
        }

        public boolean l() {
            return this.f23708s;
        }

        public final String m() {
            return this.f23709t;
        }

        public final InterfaceC3983b n() {
            return this.f23711v;
        }

        public final AbstractC3991f o() {
            return this.f23700k;
        }

        public final boolean p() {
            return !g();
        }

        public final String q() {
            return this.f23706q;
        }

        public final boolean r() {
            return this.f23705p;
        }

        public final String s() {
            return this.f23698i;
        }

        public final boolean t() {
            return this.f23704o;
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.f23698i + ", savedPaymentMethods=" + this.f23699j + ", paymentSelection=" + this.f23700k + ", isLiveMode=" + this.f23701l + ", isProcessing=" + this.f23702m + ", isEditing=" + this.f23703n + ", isGooglePayEnabled=" + this.f23704o + ", primaryButtonVisible=" + this.f23705p + ", primaryButtonLabel=" + this.f23706q + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f23707r + ", canRemovePaymentMethods=" + this.f23708s + ", errorMessage=" + this.f23709t + ", unconfirmedPaymentMethod=" + this.f23710u + ", mandateText=" + this.f23711v + ", cbcEligibility=" + this.f23712w + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List savedPaymentMethods, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a cbcEligibility) {
            super(savedPaymentMethods, z8, z9, z10, false, cbcEligibility, z13, z14, null);
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            this.f23698i = str;
            this.f23699j = savedPaymentMethods;
            this.f23700k = abstractC3991f;
            this.f23701l = z8;
            this.f23702m = z9;
            this.f23703n = z10;
            this.f23704o = z11;
            this.f23705p = z12;
            this.f23706q = str2;
            this.f23707r = z13;
            this.f23708s = z14;
            this.f23709t = str3;
            this.f23710u = oVar;
            this.f23711v = interfaceC3983b;
            this.f23712w = cbcEligibility;
        }
    }

    public /* synthetic */ e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC1925a interfaceC1925a, boolean z12, boolean z13, AbstractC3151p abstractC3151p) {
        this(list, z8, z9, z10, z11, interfaceC1925a, z12, z13);
    }

    public boolean a() {
        return this.f23668g;
    }

    public boolean b() {
        return this.f23666e;
    }

    public InterfaceC1925a c() {
        return this.f23667f;
    }

    public List d() {
        return this.f23662a;
    }

    public boolean e() {
        return this.f23665d;
    }

    public abstract boolean f();

    public boolean g() {
        return this.f23664c;
    }

    public final boolean h(o3.d isFinancialConnectionsAvailable) {
        c.C0545c e8;
        FinancialConnectionsSession b8;
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        if (this instanceof a) {
            a aVar = (a) this;
            if (AbstractC3159y.d(aVar.v(), o.p.f24522O.f24550a) && isFinancialConnectionsAvailable.invoke() && (aVar.l() instanceof d.b) && (e8 = ((d.b) aVar.l()).b().e()) != null && (b8 = e8.b()) != null) {
                b8.getPaymentAccount();
                return false;
            }
            return false;
        }
        return false;
    }

    public final G i(Function0 onEditIconPressed) {
        AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
        return H.f4833a.a(b(), f(), new G.a.C0093a(e(), B2.f.a(a(), d(), c()), onEditIconPressed));
    }

    private e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC1925a interfaceC1925a, boolean z12, boolean z13) {
        this.f23662a = list;
        this.f23663b = z8;
        this.f23664c = z9;
        this.f23665d = z10;
        this.f23666e = z11;
        this.f23667f = interfaceC1925a;
        this.f23668g = z12;
        this.f23669h = z13;
    }
}
