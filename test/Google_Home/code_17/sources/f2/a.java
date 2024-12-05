package F2;

import A2.InterfaceC0943a;
import F2.b;
import O5.x;
import P5.Q;
import e3.EnumC2791e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p2.AbstractC3738a;

/* loaded from: classes4.dex */
public abstract class a implements InterfaceC0943a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2688a = new b(null);

    /* renamed from: F2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0042a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2689b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2690c;

        public C0042a() {
            super(null);
            this.f2689b = "cs_card_number_completed";
            this.f2690c = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2689b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2690c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2691b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String type) {
            super(null);
            AbstractC3255y.i(type, "type");
            this.f2691b = Q.e(x.a("payment_method_type", type));
            this.f2692c = "cs_select_payment_method_screen_confirmed_savedpm_failure";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2692c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2691b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2693b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2694c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String type) {
            super(null);
            AbstractC3255y.i(type, "type");
            this.f2693b = Q.e(x.a("payment_method_type", type));
            this.f2694c = "cs_select_payment_method_screen_confirmed_savedpm_success";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2694c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2693b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2695b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2696c;

        public e() {
            super(null);
            this.f2695b = Q.h();
            this.f2696c = "cs_select_payment_method_screen_done_tapped";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2696c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2695b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2697b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2698c;

        public f() {
            super(null);
            this.f2697b = Q.h();
            this.f2698c = "cs_select_payment_method_screen_edit_tapped";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2698c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2697b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2699b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2700c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: F2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0043a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0043a f2701b = new EnumC0043a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0043a f2702c = new EnumC0043a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0043a[] f2703d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f2704e;

            /* renamed from: a, reason: collision with root package name */
            private final String f2705a;

            static {
                EnumC0043a[] a8 = a();
                f2703d = a8;
                f2704e = U5.b.a(a8);
            }

            private EnumC0043a(String str, int i8, String str2) {
                this.f2705a = str2;
            }

            private static final /* synthetic */ EnumC0043a[] a() {
                return new EnumC0043a[]{f2701b, f2702c};
            }

            public static EnumC0043a valueOf(String str) {
                return (EnumC0043a) Enum.valueOf(EnumC0043a.class, str);
            }

            public static EnumC0043a[] values() {
                return (EnumC0043a[]) f2703d.clone();
            }

            public final String b() {
                return this.f2705a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(EnumC0043a source, EnumC2791e enumC2791e) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(source, "source");
            this.f2699b = "cs_close_cbc_dropdown";
            this.f2700c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", enumC2791e != null ? enumC2791e.f() : null));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2699b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2700c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends a {

        /* renamed from: b, reason: collision with root package name */
        private final E2.a f2706b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(E2.a configuration) {
            super(null);
            AbstractC3255y.i(configuration, "configuration");
            this.f2706b = configuration;
            this.f2707c = "cs_init";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2707c;
        }

        @Override // F2.a
        public Map b() {
            return Q.e(x.a("cs_config", Q.k(x.a("google_pay_enabled", Boolean.valueOf(this.f2706b.i())), x.a("default_billing_details", Boolean.valueOf(this.f2706b.h().i())), x.a("appearance", AbstractC3738a.b(this.f2706b.b())), x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f2706b.a())), x.a("payment_method_order", this.f2706b.s()), x.a("billing_details_collection_configuration", AbstractC3738a.c(this.f2706b.g())), x.a("preferred_networks", AbstractC3738a.d(this.f2706b.u())))));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2708b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2709c;

        public i() {
            super(null);
            this.f2708b = Q.h();
            this.f2709c = "cs_select_payment_method_screen_removepm_failure";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2709c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2708b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2710b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2711c;

        public j() {
            super(null);
            this.f2710b = Q.h();
            this.f2711c = "cs_select_payment_method_screen_removepm_success";
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2711c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2710b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2712b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2713c;

        /* renamed from: F2.a$k$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0044a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2714a;

            static {
                int[] iArr = new int[b.EnumC0047b.values().length];
                try {
                    iArr[b.EnumC0047b.f2737d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f2714a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b.EnumC0047b screen) {
            super(null);
            AbstractC3255y.i(screen, "screen");
            this.f2712b = Q.h();
            if (C0044a.f2714a[screen.ordinal()] == 1) {
                this.f2713c = "cs_cancel_edit_screen";
                return;
            }
            throw new IllegalArgumentException(screen.name() + " has no supported event for hiding screen!");
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2713c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2712b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2715b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2716c;

        /* renamed from: F2.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0045a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2717a;

            static {
                int[] iArr = new int[b.EnumC0047b.values().length];
                try {
                    iArr[b.EnumC0047b.f2735b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.EnumC0047b.f2736c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EnumC0047b.f2737d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2717a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b.EnumC0047b screen) {
            super(null);
            String str;
            AbstractC3255y.i(screen, "screen");
            this.f2715b = Q.h();
            int i8 = C0045a.f2717a[screen.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        str = "cs_open_edit_screen";
                    } else {
                        throw new O5.p();
                    }
                } else {
                    str = "cs_select_payment_method_screen_presented";
                }
            } else {
                str = "cs_add_payment_method_screen_presented";
            }
            this.f2716c = str;
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2716c;
        }

        @Override // F2.a
        public Map b() {
            return this.f2715b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2718b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String code) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f2718b = "cs_carousel_payment_method_selected";
            this.f2719c = Q.e(x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2718b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2719c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2720b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2721c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: F2.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0046a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0046a f2722b = new EnumC0046a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0046a f2723c = new EnumC0046a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0046a[] f2724d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f2725e;

            /* renamed from: a, reason: collision with root package name */
            private final String f2726a;

            static {
                EnumC0046a[] a8 = a();
                f2724d = a8;
                f2725e = U5.b.a(a8);
            }

            private EnumC0046a(String str, int i8, String str2) {
                this.f2726a = str2;
            }

            private static final /* synthetic */ EnumC0046a[] a() {
                return new EnumC0046a[]{f2722b, f2723c};
            }

            public static EnumC0046a valueOf(String str) {
                return (EnumC0046a) Enum.valueOf(EnumC0046a.class, str);
            }

            public static EnumC0046a[] values() {
                return (EnumC0046a[]) f2724d.clone();
            }

            public final String b() {
                return this.f2726a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC0046a source, EnumC2791e selectedBrand) {
            super(null);
            AbstractC3255y.i(source, "source");
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            this.f2720b = "cs_open_cbc_dropdown";
            this.f2721c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2720b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2721c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2727b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC2791e selectedBrand, Throwable error) {
            super(null);
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            AbstractC3255y.i(error, "error");
            this.f2727b = "cs_update_card_failed";
            this.f2728c = Q.k(x.a("selected_card_brand", selectedBrand.f()), x.a("error_message", error.getMessage()));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2727b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2728c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2729b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC2791e selectedBrand) {
            super(null);
            AbstractC3255y.i(selectedBrand, "selectedBrand");
            this.f2729b = "cs_update_card";
            this.f2730c = Q.e(x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f2729b;
        }

        @Override // F2.a
        public Map b() {
            return this.f2730c;
        }
    }

    private a() {
    }

    public abstract Map b();

    public /* synthetic */ a(AbstractC3247p abstractC3247p) {
        this();
    }
}
