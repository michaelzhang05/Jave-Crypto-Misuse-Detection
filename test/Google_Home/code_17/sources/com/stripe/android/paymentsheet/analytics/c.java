package com.stripe.android.paymentsheet.analytics;

import A2.InterfaceC0943a;
import B3.f;
import P5.AbstractC1378t;
import P5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.EnvironmentCompat;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k6.C3225a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p2.AbstractC3738a;
import t3.EnumC4032f;
import w3.AbstractC4146b;
import w3.AbstractC4147c;
import z4.AbstractC4229b;

/* loaded from: classes4.dex */
public abstract class c implements InterfaceC0943a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f26805a = new d(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26806b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26807c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26808d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26809e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26810f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String type, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(type, "type");
            this.f26806b = z8;
            this.f26807c = z9;
            this.f26808d = z10;
            this.f26809e = "autofill_" + h(type);
            this.f26810f = Q.h();
        }

        private final String h(String str) {
            String lowerCase = new j6.j("(?<=.)(?=\\p{Upper})").f(str, "_").toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26809e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26810f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26808d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26807c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26806b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26811b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26812c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26813d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26814e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26815f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventReporter.Mode mode) {
            super(null);
            AbstractC3255y.i(mode, "mode");
            this.f26814e = c.f26805a.d(mode, "cannot_return_from_link_and_lpms");
            this.f26815f = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26814e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26815f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26813d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26811b;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26812c;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.analytics.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0598c extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26816b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26817c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26818d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26819e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26820f;

        public C0598c(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f26816b = z8;
            this.f26817c = z9;
            this.f26818d = z10;
            this.f26819e = "mc_card_number_completed";
            this.f26820f = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26819e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26820f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26818d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26817c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26816b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(B3.f fVar) {
            boolean z8;
            if (AbstractC3255y.d(fVar, f.c.f820a)) {
                return "googlepay";
            }
            if (fVar instanceof f.C0009f) {
                return "savedpm";
            }
            if (AbstractC3255y.d(fVar, f.d.f821a)) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.e.c;
            }
            if (z8) {
                return "link";
            }
            if (fVar instanceof f.e) {
                return "newpm";
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(EventReporter.Mode mode, String str) {
            return "mc_" + mode + "_" + str;
        }

        public /* synthetic */ d(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26821b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26822c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26823d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26824e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26825f;

        public e(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f26821b = z8;
            this.f26822c = z9;
            this.f26823d = z10;
            this.f26824e = "mc_dismiss";
            this.f26825f = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26824e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26825f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26823d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26822c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26821b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26826b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26827c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26828d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26829e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26830f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(error, "error");
            this.f26826b = z8;
            this.f26827c = z9;
            this.f26828d = z10;
            this.f26829e = "mc_elements_session_load_failed";
            this.f26830f = Q.q(Q.e(O5.x.a("error_message", L3.k.a(error).a())), n3.i.f35386a.c(error));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26829e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26830f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26828d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26827c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26826b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26831b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26832c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26833d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26834e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26835f;

        public g(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f26831b = z8;
            this.f26832c = z9;
            this.f26833d = z10;
            this.f26834e = "mc_cancel_edit_screen";
            this.f26835f = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26834e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26835f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26833d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26832c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26831b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26836b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26837c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26838d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26839e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26840f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f26841b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f26842c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26843d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f26844e;

            /* renamed from: a, reason: collision with root package name */
            private final String f26845a;

            static {
                a[] a8 = a();
                f26843d = a8;
                f26844e = U5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f26845a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26841b, f26842c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26843d.clone();
            }

            public final String b() {
                return this.f26845a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(a source, EnumC2791e enumC2791e, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(source, "source");
            this.f26836b = z8;
            this.f26837c = z9;
            this.f26838d = z10;
            this.f26839e = "mc_close_cbc_dropdown";
            this.f26840f = Q.k(O5.x.a("cbc_event_source", source.b()), O5.x.a("selected_card_brand", enumC2791e != null ? enumC2791e.f() : null));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26839e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26840f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26838d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26837c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26836b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends c {

        /* renamed from: b, reason: collision with root package name */
        private final EventReporter.Mode f26846b;

        /* renamed from: c, reason: collision with root package name */
        private final u.g f26847c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26848d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26849e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f26850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventReporter.Mode mode, u.g configuration, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(mode, "mode");
            AbstractC3255y.i(configuration, "configuration");
            this.f26846b = mode;
            this.f26847c = configuration;
            this.f26848d = z8;
            this.f26849e = z9;
            this.f26850f = z10;
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            String str;
            String str2;
            String str3;
            List list = null;
            if (this.f26847c.l() != null) {
                str = "customer";
            } else {
                str = null;
            }
            if (this.f26847c.u() != null) {
                str2 = "googlepay";
            } else {
                str2 = null;
            }
            List r8 = AbstractC1378t.r(str, str2);
            if (!r8.isEmpty()) {
                list = r8;
            }
            if (list == null || (str3 = AbstractC1378t.w0(list, "_", null, null, 0, null, null, 62, null)) == null) {
                str3 = "default";
            }
            return c.f26805a.d(this.f26846b, "init_" + str3);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            boolean z8;
            String str;
            boolean z9;
            boolean z10;
            boolean z11;
            u.h a8;
            if (this.f26847c.l() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            O5.r a9 = O5.x.a("customer", Boolean.valueOf(z8));
            u.i l8 = this.f26847c.l();
            if (l8 != null && (a8 = l8.a()) != null) {
                str = a8.f();
            } else {
                str = null;
            }
            O5.r a10 = O5.x.a("customer_access_provider", str);
            if (this.f26847c.u() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            O5.r a11 = O5.x.a("googlepay", Boolean.valueOf(z9));
            if (this.f26847c.z() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            O5.r a12 = O5.x.a("primary_button_color", Boolean.valueOf(z10));
            u.c p8 = this.f26847c.p();
            if (p8 != null && p8.i()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Q.e(O5.x.a("mpe_config", Q.k(a9, a10, a11, a12, O5.x.a("default_billing_details", Boolean.valueOf(z11)), O5.x.a("allows_delayed_payment_methods", Boolean.valueOf(this.f26847c.a())), O5.x.a("appearance", AbstractC3738a.b(this.f26847c.h())), O5.x.a("payment_method_order", this.f26847c.x()), O5.x.a("allows_payment_methods_requiring_shipping_address", Boolean.valueOf(this.f26847c.b())), O5.x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f26847c.g())), O5.x.a("billing_details_collection_configuration", AbstractC3738a.c(this.f26847c.i())), O5.x.a("preferred_networks", AbstractC3738a.d(this.f26847c.y())), O5.x.a("external_payment_methods", AbstractC3738a.a(this.f26847c)))));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26850f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26849e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26848d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26851b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26852c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26853d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26854e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26855f;

        public /* synthetic */ j(C3225a c3225a, Throwable th, boolean z8, boolean z9, boolean z10, AbstractC3247p abstractC3247p) {
            this(c3225a, th, z8, z9, z10);
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26854e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26855f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26853d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26852c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26851b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private j(C3225a c3225a, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(error, "error");
            this.f26851b = z8;
            this.f26852c = z9;
            this.f26853d = z10;
            this.f26854e = "mc_load_failed";
            this.f26855f = Q.q(Q.k(O5.x.a(TypedValues.TransitionType.S_DURATION, c3225a != null ? Float.valueOf(AbstractC4147c.a(c3225a.P())) : null), O5.x.a("error_message", L3.k.a(error).a())), n3.i.f35386a.c(error));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26856b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26857c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26858d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26859e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26860f;

        public k(boolean z8, boolean z9, boolean z10, boolean z11) {
            super(null);
            this.f26856b = z8;
            this.f26857c = z9;
            this.f26858d = z10;
            this.f26859e = "mc_load_started";
            this.f26860f = Q.e(O5.x.a("compose", Boolean.valueOf(z11)));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26859e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26860f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26858d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26857c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26856b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26861b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26862c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26863d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26864e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26865f;

        public /* synthetic */ l(B3.f fVar, u.l lVar, List list, C3225a c3225a, e3.y yVar, boolean z8, boolean z9, AbstractC3247p abstractC3247p) {
            this(fVar, lVar, list, c3225a, yVar, z8, z9);
        }

        private final String h(B3.f fVar) {
            String str;
            if (fVar instanceof f.c) {
                return "google_pay";
            }
            if (fVar instanceof f.d) {
                return "link";
            }
            if (fVar instanceof f.C0009f) {
                o.p pVar = ((f.C0009f) fVar).r().f25467e;
                if (pVar == null || (str = pVar.f25605a) == null) {
                    return "saved";
                }
                return str;
            }
            return "none";
        }

        private final String i(u.l lVar) {
            if (lVar instanceof u.l.a) {
                u.m.d a8 = ((u.l.a) lVar).b().a();
                if (a8 instanceof u.m.d.a) {
                    return "deferred_payment_intent";
                }
                if (a8 instanceof u.m.d.b) {
                    return "deferred_setup_intent";
                }
                throw new O5.p();
            }
            if (lVar instanceof u.l.b) {
                return "payment_intent";
            }
            if (lVar instanceof u.l.c) {
                return "setup_intent";
            }
            throw new O5.p();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26863d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26865f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26862c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26864e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26861b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private l(B3.f fVar, u.l initializationMode, List orderedLpms, C3225a c3225a, e3.y yVar, boolean z8, boolean z9) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(initializationMode, "initializationMode");
            AbstractC3255y.i(orderedLpms, "orderedLpms");
            this.f26861b = z8;
            this.f26862c = z9;
            this.f26863d = "mc_load_succeeded";
            this.f26864e = yVar != null;
            Map k8 = Q.k(O5.x.a(TypedValues.TransitionType.S_DURATION, c3225a != null ? Float.valueOf(AbstractC4147c.a(c3225a.P())) : null), O5.x.a("selected_lpm", h(fVar)), O5.x.a("intent_type", i(initializationMode)), O5.x.a("ordered_lpms", AbstractC1378t.w0(orderedLpms, ",", null, null, 0, null, null, 62, null)));
            Map e8 = yVar != null ? Q.e(O5.x.a("link_mode", yVar.b())) : null;
            this.f26865f = Q.q(k8, e8 == null ? Q.h() : e8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26866b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26867c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26868d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26869e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26870f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f26871g;

        public m(boolean z8, boolean z9, boolean z10, String str) {
            super(null);
            this.f26866b = z8;
            this.f26867c = z9;
            this.f26868d = z10;
            this.f26869e = str;
            this.f26870f = "luxe_serialize_failure";
            this.f26871g = Q.e(O5.x.a("error_message", str));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26870f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26871g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26868d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26867c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26866b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends c {

        /* renamed from: b, reason: collision with root package name */
        private final a f26872b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26873c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26874d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26875e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC4032f f26876f;

        /* renamed from: g, reason: collision with root package name */
        private final String f26877g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f26878h;

        /* loaded from: classes4.dex */
        public interface a {

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0599a {
                public static String a(a aVar) {
                    if (aVar instanceof C0600c) {
                        return "success";
                    }
                    if (aVar instanceof b) {
                        return "failure";
                    }
                    throw new O5.p();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC4146b f26879a;

                public b(AbstractC4146b error) {
                    AbstractC3255y.i(error, "error");
                    this.f26879a = error;
                }

                public final AbstractC4146b a() {
                    return this.f26879a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC3255y.d(this.f26879a, ((b) obj).f26879a);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String f() {
                    return C0599a.a(this);
                }

                public int hashCode() {
                    return this.f26879a.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.f26879a + ")";
                }
            }

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0600c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0600c f26880a = new C0600c();

                private C0600c() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0600c);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String f() {
                    return C0599a.a(this);
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }
            }

            String f();
        }

        public /* synthetic */ n(EventReporter.Mode mode, a aVar, C3225a c3225a, B3.f fVar, String str, boolean z8, boolean z9, boolean z10, EnumC4032f enumC4032f, AbstractC3247p abstractC3247p) {
            this(mode, aVar, c3225a, fVar, str, z8, z9, z10, enumC4032f);
        }

        private final Map h() {
            Map map;
            EnumC4032f enumC4032f = this.f26876f;
            if (enumC4032f != null) {
                map = Q.e(O5.x.a("deferred_intent_confirmation_type", enumC4032f.b()));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        private final Map i() {
            a aVar = this.f26872b;
            if (aVar instanceof a.C0600c) {
                return Q.h();
            }
            if (aVar instanceof a.b) {
                return AbstractC4229b.a(Q.k(O5.x.a("error_message", ((a.b) aVar).a().a()), O5.x.a("error_code", ((a.b) this.f26872b).a().b())));
            }
            throw new O5.p();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26877g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26878h;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26875e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26874d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26873c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private n(EventReporter.Mode mode, a result, C3225a c3225a, B3.f fVar, String str, boolean z8, boolean z9, boolean z10, EnumC4032f enumC4032f) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(mode, "mode");
            AbstractC3255y.i(result, "result");
            this.f26872b = result;
            this.f26873c = z8;
            this.f26874d = z9;
            this.f26875e = z10;
            this.f26876f = enumC4032f;
            d dVar = c.f26805a;
            this.f26877g = dVar.d(mode, "payment_" + dVar.c(fVar) + "_" + result.f());
            this.f26878h = Q.q(Q.q(Q.q(Q.k(O5.x.a(TypedValues.TransitionType.S_DURATION, c3225a != null ? Float.valueOf(AbstractC4147c.a(c3225a.P())) : null), O5.x.a("currency", str)), h()), AbstractC4147c.b(fVar)), i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26881b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26882c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26883d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26884e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26885f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f26881b = z8;
            this.f26882c = z9;
            this.f26883d = z10;
            this.f26884e = "mc_form_interacted";
            this.f26885f = Q.e(O5.x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26884e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26885f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26883d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26882c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26881b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26886b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26887c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26888d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26889e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26890f;

        public /* synthetic */ p(String str, C3225a c3225a, String str2, String str3, boolean z8, boolean z9, boolean z10, AbstractC3247p abstractC3247p) {
            this(str, c3225a, str2, str3, z8, z9, z10);
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26889e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26890f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26888d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26887c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26886b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private p(String str, C3225a c3225a, String str2, String str3, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            this.f26886b = z8;
            this.f26887c = z9;
            this.f26888d = z10;
            this.f26889e = "mc_confirm_button_tapped";
            this.f26890f = AbstractC4229b.a(Q.k(O5.x.a(TypedValues.TransitionType.S_DURATION, c3225a != null ? Float.valueOf(AbstractC4147c.a(c3225a.P())) : null), O5.x.a("currency", str), O5.x.a("selected_lpm", str2), O5.x.a("link_context", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26891b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26892c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26893d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26894e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26895f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String code, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f26891b = z8;
            this.f26892c = z9;
            this.f26893d = z10;
            this.f26894e = "mc_carousel_payment_method_tapped";
            this.f26895f = Q.k(O5.x.a("currency", str), O5.x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26894e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26895f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26893d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26892c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26891b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26896b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26897c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26898d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26899e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EventReporter.Mode mode, B3.f fVar, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(mode, "mode");
            this.f26896b = z8;
            this.f26897c = z9;
            this.f26898d = z10;
            d dVar = c.f26805a;
            this.f26899e = dVar.d(mode, "paymentoption_" + dVar.c(fVar) + "_select");
            this.f26900f = Q.e(O5.x.a("currency", str));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26899e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26900f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26898d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26897c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26896b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26901b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26902c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26903d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26904e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26905f;

        public s(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f26901b = z8;
            this.f26902c = z9;
            this.f26903d = z10;
            this.f26904e = "mc_open_edit_screen";
            this.f26905f = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26904e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26905f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26903d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26902c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26901b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26906b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26907c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26908d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26909e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26910f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(mode, "mode");
            this.f26906b = z8;
            this.f26907c = z9;
            this.f26908d = z10;
            this.f26909e = c.f26805a.d(mode, "sheet_savedpm_show");
            this.f26910f = Q.e(O5.x.a("currency", str));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26909e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26910f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26908d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26907c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26906b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class u extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26911b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26912c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26913d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26914e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26915f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(mode, "mode");
            this.f26911b = z8;
            this.f26912c = z9;
            this.f26913d = z10;
            this.f26914e = c.f26805a.d(mode, "sheet_newpm_show");
            this.f26915f = Q.e(O5.x.a("currency", str));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26914e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26915f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26913d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26912c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26911b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class v extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26916b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26917c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26918d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26919e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26920f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f26921b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f26922c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26923d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f26924e;

            /* renamed from: a, reason: collision with root package name */
            private final String f26925a;

            static {
                a[] a8 = a();
                f26923d = a8;
                f26924e = U5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f26925a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26921b, f26922c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26923d.clone();
            }

            public final String b() {
                return this.f26925a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a source, EnumC2791e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(source, "source");
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            this.f26916b = z8;
            this.f26917c = z9;
            this.f26918d = z10;
            this.f26919e = "mc_open_cbc_dropdown";
            this.f26920f = Q.k(O5.x.a("cbc_event_source", source.b()), O5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26919e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26920f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26918d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26917c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26916b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26926b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26927c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26928d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26929e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26930f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f26926b = z8;
            this.f26927c = z9;
            this.f26928d = z10;
            this.f26929e = "mc_form_shown";
            this.f26930f = Q.e(O5.x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26929e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26930f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26928d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26927c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26926b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26931b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26932c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26933d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26934e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26935f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(EnumC2791e selectedBrand, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            AbstractC3255y.i(error, "error");
            this.f26931b = z8;
            this.f26932c = z9;
            this.f26933d = z10;
            this.f26934e = "mc_update_card_failed";
            this.f26935f = Q.q(Q.k(O5.x.a("selected_card_brand", selectedBrand.f()), O5.x.a("error_message", error.getMessage())), n3.i.f35386a.c(error));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26934e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26935f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26933d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26932c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26931b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class y extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26936b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26937c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26938d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26939e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f26940f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(EnumC2791e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            this.f26936b = z8;
            this.f26937c = z9;
            this.f26938d = z10;
            this.f26939e = "mc_update_card";
            this.f26940f = Q.e(O5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f26939e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f26940f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f26938d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f26937c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f26936b;
        }
    }

    private c() {
    }

    private final Map g(boolean z8, boolean z9, boolean z10) {
        return Q.k(O5.x.a("is_decoupled", Boolean.valueOf(z8)), O5.x.a("link_enabled", Boolean.valueOf(z9)), O5.x.a("google_pay_enabled", Boolean.valueOf(z10)));
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract boolean d();

    public final Map e() {
        return Q.q(g(f(), d(), c()), b());
    }

    protected abstract boolean f();

    public /* synthetic */ c(AbstractC3247p abstractC3247p) {
        this();
    }
}
