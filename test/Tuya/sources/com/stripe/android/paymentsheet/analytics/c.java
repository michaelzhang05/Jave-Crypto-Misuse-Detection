package com.stripe.android.paymentsheet.analytics;

import M5.AbstractC1246t;
import M5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.EnvironmentCompat;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.u;
import h6.C2758a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m2.AbstractC3395a;
import q3.EnumC3653f;
import t3.AbstractC3792b;
import t3.AbstractC3793c;
import w4.AbstractC3849b;
import x2.InterfaceC3871a;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class c implements InterfaceC3871a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f25750a = new d(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25751b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25752c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25753d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25754e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25755f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String type, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(type, "type");
            this.f25751b = z8;
            this.f25752c = z9;
            this.f25753d = z10;
            this.f25754e = "autofill_" + h(type);
            this.f25755f = Q.h();
        }

        private final String h(String str) {
            String lowerCase = new g6.j("(?<=.)(?=\\p{Upper})").f(str, "_").toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25754e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25755f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25753d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25752c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25751b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25756b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25757c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25758d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25759e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25760f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventReporter.Mode mode) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25759e = c.f25750a.d(mode, "cannot_return_from_link_and_lpms");
            this.f25760f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25759e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25760f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25758d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25756b;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25757c;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.analytics.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0602c extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25761b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25762c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25763d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25764e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25765f;

        public C0602c(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25761b = z8;
            this.f25762c = z9;
            this.f25763d = z10;
            this.f25764e = "mc_card_number_completed";
            this.f25765f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25764e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25765f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25763d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25762c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25761b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(AbstractC3991f abstractC3991f) {
            boolean z8;
            if (AbstractC3159y.d(abstractC3991f, AbstractC3991f.c.f39776a)) {
                return "googlepay";
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                return "savedpm";
            }
            if (AbstractC3159y.d(abstractC3991f, AbstractC3991f.d.f39777a)) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.e.c;
            }
            if (z8) {
                return "link";
            }
            if (abstractC3991f instanceof AbstractC3991f.e) {
                return "newpm";
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(EventReporter.Mode mode, String str) {
            return "mc_" + mode + "_" + str;
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25766b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25767c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25768d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25769e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25770f;

        public e(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25766b = z8;
            this.f25767c = z9;
            this.f25768d = z10;
            this.f25769e = "mc_dismiss";
            this.f25770f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25769e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25770f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25768d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25767c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25766b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25771b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25772c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25773d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25774e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25775f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(error, "error");
            this.f25771b = z8;
            this.f25772c = z9;
            this.f25773d = z10;
            this.f25774e = "mc_elements_session_load_failed";
            this.f25775f = Q.q(Q.e(L5.x.a("error_message", I3.k.a(error).a())), k3.i.f33394a.c(error));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25774e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25775f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25773d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25772c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25771b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25776b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25777c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25778d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25779e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25780f;

        public g(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25776b = z8;
            this.f25777c = z9;
            this.f25778d = z10;
            this.f25779e = "mc_cancel_edit_screen";
            this.f25780f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25779e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25780f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25778d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25777c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25776b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25781b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25782c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25783d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25784e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25785f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25786b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f25787c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f25788d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f25789e;

            /* renamed from: a, reason: collision with root package name */
            private final String f25790a;

            static {
                a[] a8 = a();
                f25788d = a8;
                f25789e = R5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f25790a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f25786b, f25787c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f25788d.clone();
            }

            public final String b() {
                return this.f25790a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(a source, EnumC1870e enumC1870e, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(source, "source");
            this.f25781b = z8;
            this.f25782c = z9;
            this.f25783d = z10;
            this.f25784e = "mc_close_cbc_dropdown";
            this.f25785f = Q.k(L5.x.a("cbc_event_source", source.b()), L5.x.a("selected_card_brand", enumC1870e != null ? enumC1870e.f() : null));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25784e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25785f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25783d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25782c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25781b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends c {

        /* renamed from: b, reason: collision with root package name */
        private final EventReporter.Mode f25791b;

        /* renamed from: c, reason: collision with root package name */
        private final u.g f25792c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25793d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25794e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventReporter.Mode mode, u.g configuration, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(configuration, "configuration");
            this.f25791b = mode;
            this.f25792c = configuration;
            this.f25793d = z8;
            this.f25794e = z9;
            this.f25795f = z10;
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            String str;
            String str2;
            String str3;
            List list = null;
            if (this.f25792c.j() != null) {
                str = "customer";
            } else {
                str = null;
            }
            if (this.f25792c.o() != null) {
                str2 = "googlepay";
            } else {
                str2 = null;
            }
            List r8 = AbstractC1246t.r(str, str2);
            if (!r8.isEmpty()) {
                list = r8;
            }
            if (list == null || (str3 = AbstractC1246t.w0(list, "_", null, null, 0, null, null, 62, null)) == null) {
                str3 = "default";
            }
            return c.f25750a.d(this.f25791b, "init_" + str3);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            boolean z8;
            String str;
            boolean z9;
            boolean z10;
            boolean z11;
            u.h b8;
            if (this.f25792c.j() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            L5.r a8 = L5.x.a("customer", Boolean.valueOf(z8));
            u.i j8 = this.f25792c.j();
            if (j8 != null && (b8 = j8.b()) != null) {
                str = b8.h();
            } else {
                str = null;
            }
            L5.r a9 = L5.x.a("customer_access_provider", str);
            if (this.f25792c.o() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            L5.r a10 = L5.x.a("googlepay", Boolean.valueOf(z9));
            if (this.f25792c.I() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            L5.r a11 = L5.x.a("primary_button_color", Boolean.valueOf(z10));
            u.c k8 = this.f25792c.k();
            if (k8 != null && k8.i()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Q.e(L5.x.a("mpe_config", Q.k(a8, a9, a10, a11, L5.x.a("default_billing_details", Boolean.valueOf(z11)), L5.x.a("allows_delayed_payment_methods", Boolean.valueOf(this.f25792c.b())), L5.x.a("appearance", AbstractC3395a.b(this.f25792c.f())), L5.x.a("payment_method_order", this.f25792c.z()), L5.x.a("allows_payment_methods_requiring_shipping_address", Boolean.valueOf(this.f25792c.c())), L5.x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f25792c.e())), L5.x.a("billing_details_collection_configuration", AbstractC3395a.c(this.f25792c.i())), L5.x.a("preferred_networks", AbstractC3395a.d(this.f25792c.G())), L5.x.a("external_payment_methods", AbstractC3395a.a(this.f25792c)))));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25795f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25794e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25793d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25796b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25797c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25798d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25799e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25800f;

        public /* synthetic */ j(C2758a c2758a, Throwable th, boolean z8, boolean z9, boolean z10, AbstractC3151p abstractC3151p) {
            this(c2758a, th, z8, z9, z10);
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25799e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25800f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25798d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25797c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25796b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private j(C2758a c2758a, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(error, "error");
            this.f25796b = z8;
            this.f25797c = z9;
            this.f25798d = z10;
            this.f25799e = "mc_load_failed";
            this.f25800f = Q.q(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("error_message", I3.k.a(error).a())), k3.i.f33394a.c(error));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25801b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25802c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25803d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25804e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25805f;

        public k(boolean z8, boolean z9, boolean z10, boolean z11) {
            super(null);
            this.f25801b = z8;
            this.f25802c = z9;
            this.f25803d = z10;
            this.f25804e = "mc_load_started";
            this.f25805f = Q.e(L5.x.a("compose", Boolean.valueOf(z11)));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25804e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25805f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25803d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25802c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25801b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25806b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25807c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25808d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25809e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25810f;

        public /* synthetic */ l(AbstractC3991f abstractC3991f, u.l lVar, List list, C2758a c2758a, b3.y yVar, boolean z8, boolean z9, AbstractC3151p abstractC3151p) {
            this(abstractC3991f, lVar, list, c2758a, yVar, z8, z9);
        }

        private final String h(u.l lVar) {
            if (lVar instanceof u.l.a) {
                u.m.d b8 = ((u.l.a) lVar).c().b();
                if (b8 instanceof u.m.d.a) {
                    return "deferred_payment_intent";
                }
                if (b8 instanceof u.m.d.b) {
                    return "deferred_setup_intent";
                }
                throw new L5.p();
            }
            if (lVar instanceof u.l.b) {
                return "payment_intent";
            }
            if (lVar instanceof u.l.c) {
                return "setup_intent";
            }
            throw new L5.p();
        }

        private final String i(AbstractC3991f abstractC3991f) {
            String str;
            if (abstractC3991f instanceof AbstractC3991f.c) {
                return "google_pay";
            }
            if (abstractC3991f instanceof AbstractC3991f.d) {
                return "link";
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                o.p pVar = ((AbstractC3991f.C0916f) abstractC3991f).v().f24412e;
                if (pVar == null || (str = pVar.f24550a) == null) {
                    return "saved";
                }
                return str;
            }
            return "none";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25808d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25810f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25807c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25809e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25806b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private l(AbstractC3991f abstractC3991f, u.l initializationMode, List orderedLpms, C2758a c2758a, b3.y yVar, boolean z8, boolean z9) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(orderedLpms, "orderedLpms");
            this.f25806b = z8;
            this.f25807c = z9;
            this.f25808d = "mc_load_succeeded";
            this.f25809e = yVar != null;
            Map k8 = Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("selected_lpm", i(abstractC3991f)), L5.x.a("intent_type", h(initializationMode)), L5.x.a("ordered_lpms", AbstractC1246t.w0(orderedLpms, ",", null, null, 0, null, null, 62, null)));
            Map e8 = yVar != null ? Q.e(L5.x.a("link_mode", yVar.b())) : null;
            this.f25810f = Q.q(k8, e8 == null ? Q.h() : e8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25811b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25812c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25813d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25814e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25815f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f25816g;

        public m(boolean z8, boolean z9, boolean z10, String str) {
            super(null);
            this.f25811b = z8;
            this.f25812c = z9;
            this.f25813d = z10;
            this.f25814e = str;
            this.f25815f = "luxe_serialize_failure";
            this.f25816g = Q.e(L5.x.a("error_message", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25815f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25816g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25813d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25812c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25811b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends c {

        /* renamed from: b, reason: collision with root package name */
        private final a f25817b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25818c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25819d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25820e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC3653f f25821f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25822g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f25823h;

        /* loaded from: classes4.dex */
        public interface a {

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0603a {
                public static String a(a aVar) {
                    if (aVar instanceof C0604c) {
                        return "success";
                    }
                    if (aVar instanceof b) {
                        return "failure";
                    }
                    throw new L5.p();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC3792b f25824a;

                public b(AbstractC3792b error) {
                    AbstractC3159y.i(error, "error");
                    this.f25824a = error;
                }

                public final AbstractC3792b a() {
                    return this.f25824a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC3159y.d(this.f25824a, ((b) obj).f25824a);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String h() {
                    return C0603a.a(this);
                }

                public int hashCode() {
                    return this.f25824a.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.f25824a + ")";
                }
            }

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0604c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0604c f25825a = new C0604c();

                private C0604c() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0604c);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String h() {
                    return C0603a.a(this);
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }
            }

            String h();
        }

        public /* synthetic */ n(EventReporter.Mode mode, a aVar, C2758a c2758a, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10, EnumC3653f enumC3653f, AbstractC3151p abstractC3151p) {
            this(mode, aVar, c2758a, abstractC3991f, str, z8, z9, z10, enumC3653f);
        }

        private final Map h() {
            Map map;
            EnumC3653f enumC3653f = this.f25821f;
            if (enumC3653f != null) {
                map = Q.e(L5.x.a("deferred_intent_confirmation_type", enumC3653f.b()));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        private final Map i() {
            a aVar = this.f25817b;
            if (aVar instanceof a.C0604c) {
                return Q.h();
            }
            if (aVar instanceof a.b) {
                return AbstractC3849b.a(Q.k(L5.x.a("error_message", ((a.b) aVar).a().a()), L5.x.a("error_code", ((a.b) this.f25817b).a().b())));
            }
            throw new L5.p();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25822g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25823h;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25820e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25819d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25818c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private n(EventReporter.Mode mode, a result, C2758a c2758a, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10, EnumC3653f enumC3653f) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(result, "result");
            this.f25817b = result;
            this.f25818c = z8;
            this.f25819d = z9;
            this.f25820e = z10;
            this.f25821f = enumC3653f;
            d dVar = c.f25750a;
            this.f25822g = dVar.d(mode, "payment_" + dVar.c(abstractC3991f) + "_" + result.h());
            this.f25823h = Q.q(Q.q(Q.q(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("currency", str)), h()), AbstractC3793c.b(abstractC3991f)), i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25826b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25827c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25828d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25829e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25830f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25826b = z8;
            this.f25827c = z9;
            this.f25828d = z10;
            this.f25829e = "mc_form_interacted";
            this.f25830f = Q.e(L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25829e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25830f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25828d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25827c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25826b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25831b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25832c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25833d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25834e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25835f;

        public /* synthetic */ p(String str, C2758a c2758a, String str2, String str3, boolean z8, boolean z9, boolean z10, AbstractC3151p abstractC3151p) {
            this(str, c2758a, str2, str3, z8, z9, z10);
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25834e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25835f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25833d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25832c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25831b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private p(String str, C2758a c2758a, String str2, String str3, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            this.f25831b = z8;
            this.f25832c = z9;
            this.f25833d = z10;
            this.f25834e = "mc_confirm_button_tapped";
            this.f25835f = AbstractC3849b.a(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("currency", str), L5.x.a("selected_lpm", str2), L5.x.a("link_context", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25836b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25837c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25838d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25839e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25840f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String code, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25836b = z8;
            this.f25837c = z9;
            this.f25838d = z10;
            this.f25839e = "mc_carousel_payment_method_tapped";
            this.f25840f = Q.k(L5.x.a("currency", str), L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25839e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25840f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25838d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25837c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25836b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25841b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25842c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25843d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25844e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25845f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EventReporter.Mode mode, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25841b = z8;
            this.f25842c = z9;
            this.f25843d = z10;
            d dVar = c.f25750a;
            this.f25844e = dVar.d(mode, "paymentoption_" + dVar.c(abstractC3991f) + "_select");
            this.f25845f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25844e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25845f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25843d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25842c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25841b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25846b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25847c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25848d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25849e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25850f;

        public s(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25846b = z8;
            this.f25847c = z9;
            this.f25848d = z10;
            this.f25849e = "mc_open_edit_screen";
            this.f25850f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25849e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25850f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25848d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25847c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25846b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25851b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25852c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25853d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25854e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25855f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25851b = z8;
            this.f25852c = z9;
            this.f25853d = z10;
            this.f25854e = c.f25750a.d(mode, "sheet_savedpm_show");
            this.f25855f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25854e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25855f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25853d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25852c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25851b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class u extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25856b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25857c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25858d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25859e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25856b = z8;
            this.f25857c = z9;
            this.f25858d = z10;
            this.f25859e = c.f25750a.d(mode, "sheet_newpm_show");
            this.f25860f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25859e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25860f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25858d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25857c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25856b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class v extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25861b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25862c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25863d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25864e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25865f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25866b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f25867c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f25868d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f25869e;

            /* renamed from: a, reason: collision with root package name */
            private final String f25870a;

            static {
                a[] a8 = a();
                f25868d = a8;
                f25869e = R5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f25870a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f25866b, f25867c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f25868d.clone();
            }

            public final String b() {
                return this.f25870a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a source, EnumC1870e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(source, "source");
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f25861b = z8;
            this.f25862c = z9;
            this.f25863d = z10;
            this.f25864e = "mc_open_cbc_dropdown";
            this.f25865f = Q.k(L5.x.a("cbc_event_source", source.b()), L5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25864e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25865f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25863d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25862c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25861b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25871b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25872c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25873d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25874e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25875f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25871b = z8;
            this.f25872c = z9;
            this.f25873d = z10;
            this.f25874e = "mc_form_shown";
            this.f25875f = Q.e(L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25874e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25875f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25873d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25872c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25871b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25876b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25877c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25878d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25879e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25880f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(EnumC1870e selectedBrand, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            AbstractC3159y.i(error, "error");
            this.f25876b = z8;
            this.f25877c = z9;
            this.f25878d = z10;
            this.f25879e = "mc_update_card_failed";
            this.f25880f = Q.q(Q.k(L5.x.a("selected_card_brand", selectedBrand.f()), L5.x.a("error_message", error.getMessage())), k3.i.f33394a.c(error));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25879e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25880f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25878d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25877c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25876b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class y extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25881b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25882c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25883d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25884e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25885f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(EnumC1870e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f25881b = z8;
            this.f25882c = z9;
            this.f25883d = z10;
            this.f25884e = "mc_update_card";
            this.f25885f = Q.e(L5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25884e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25885f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25883d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25882c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25881b;
        }
    }

    private c() {
    }

    private final Map g(boolean z8, boolean z9, boolean z10) {
        return Q.k(L5.x.a("is_decoupled", Boolean.valueOf(z8)), L5.x.a("link_enabled", Boolean.valueOf(z9)), L5.x.a("google_pay_enabled", Boolean.valueOf(z10)));
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract boolean d();

    public final Map e() {
        return Q.q(g(f(), d(), c()), b());
    }

    protected abstract boolean f();

    public /* synthetic */ c(AbstractC3151p abstractC3151p) {
        this();
    }
}
