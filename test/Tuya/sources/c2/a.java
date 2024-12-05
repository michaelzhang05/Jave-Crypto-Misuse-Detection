package C2;

import C2.b;
import L5.x;
import M5.Q;
import b3.EnumC1870e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m2.AbstractC3395a;
import x2.InterfaceC3871a;

/* loaded from: classes4.dex */
public abstract class a implements InterfaceC3871a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1178a = new b(null);

    /* renamed from: C2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0018a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1179b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1180c;

        public C0018a() {
            super(null);
            this.f1179b = "cs_card_number_completed";
            this.f1180c = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1179b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1180c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1181b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String type) {
            super(null);
            AbstractC3159y.i(type, "type");
            this.f1181b = Q.e(x.a("payment_method_type", type));
            this.f1182c = "cs_select_payment_method_screen_confirmed_savedpm_failure";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1182c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1181b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1183b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String type) {
            super(null);
            AbstractC3159y.i(type, "type");
            this.f1183b = Q.e(x.a("payment_method_type", type));
            this.f1184c = "cs_select_payment_method_screen_confirmed_savedpm_success";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1184c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1183b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1185b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1186c;

        public e() {
            super(null);
            this.f1185b = Q.h();
            this.f1186c = "cs_select_payment_method_screen_done_tapped";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1186c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1185b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1187b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1188c;

        public f() {
            super(null);
            this.f1187b = Q.h();
            this.f1188c = "cs_select_payment_method_screen_edit_tapped";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1188c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1187b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1189b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1190c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: C2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0019a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0019a f1191b = new EnumC0019a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0019a f1192c = new EnumC0019a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0019a[] f1193d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f1194e;

            /* renamed from: a, reason: collision with root package name */
            private final String f1195a;

            static {
                EnumC0019a[] a8 = a();
                f1193d = a8;
                f1194e = R5.b.a(a8);
            }

            private EnumC0019a(String str, int i8, String str2) {
                this.f1195a = str2;
            }

            private static final /* synthetic */ EnumC0019a[] a() {
                return new EnumC0019a[]{f1191b, f1192c};
            }

            public static EnumC0019a valueOf(String str) {
                return (EnumC0019a) Enum.valueOf(EnumC0019a.class, str);
            }

            public static EnumC0019a[] values() {
                return (EnumC0019a[]) f1193d.clone();
            }

            public final String b() {
                return this.f1195a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(EnumC0019a source, EnumC1870e enumC1870e) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(source, "source");
            this.f1189b = "cs_close_cbc_dropdown";
            this.f1190c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", enumC1870e != null ? enumC1870e.f() : null));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1189b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1190c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends a {

        /* renamed from: b, reason: collision with root package name */
        private final B2.a f1196b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(B2.a configuration) {
            super(null);
            AbstractC3159y.i(configuration, "configuration");
            this.f1196b = configuration;
            this.f1197c = "cs_init";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1197c;
        }

        @Override // C2.a
        public Map b() {
            return Q.e(x.a("cs_config", Q.k(x.a("google_pay_enabled", Boolean.valueOf(this.f1196b.i())), x.a("default_billing_details", Boolean.valueOf(this.f1196b.f().i())), x.a("appearance", AbstractC3395a.b(this.f1196b.c())), x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f1196b.b())), x.a("payment_method_order", this.f1196b.n()), x.a("billing_details_collection_configuration", AbstractC3395a.c(this.f1196b.e())), x.a("preferred_networks", AbstractC3395a.d(this.f1196b.o())))));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1198b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1199c;

        public i() {
            super(null);
            this.f1198b = Q.h();
            this.f1199c = "cs_select_payment_method_screen_removepm_failure";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1199c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1198b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1200b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1201c;

        public j() {
            super(null);
            this.f1200b = Q.h();
            this.f1201c = "cs_select_payment_method_screen_removepm_success";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1201c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1200b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1202b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1203c;

        /* renamed from: C2.a$k$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0020a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1204a;

            static {
                int[] iArr = new int[b.EnumC0023b.values().length];
                try {
                    iArr[b.EnumC0023b.f1227d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f1204a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b.EnumC0023b screen) {
            super(null);
            AbstractC3159y.i(screen, "screen");
            this.f1202b = Q.h();
            if (C0020a.f1204a[screen.ordinal()] == 1) {
                this.f1203c = "cs_cancel_edit_screen";
                return;
            }
            throw new IllegalArgumentException(screen.name() + " has no supported event for hiding screen!");
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1203c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1202b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f1205b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1206c;

        /* renamed from: C2.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0021a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1207a;

            static {
                int[] iArr = new int[b.EnumC0023b.values().length];
                try {
                    iArr[b.EnumC0023b.f1225b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.EnumC0023b.f1226c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EnumC0023b.f1227d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1207a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b.EnumC0023b screen) {
            super(null);
            String str;
            AbstractC3159y.i(screen, "screen");
            this.f1205b = Q.h();
            int i8 = C0021a.f1207a[screen.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        str = "cs_open_edit_screen";
                    } else {
                        throw new L5.p();
                    }
                } else {
                    str = "cs_select_payment_method_screen_presented";
                }
            } else {
                str = "cs_add_payment_method_screen_presented";
            }
            this.f1206c = str;
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1206c;
        }

        @Override // C2.a
        public Map b() {
            return this.f1205b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1208b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String code) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f1208b = "cs_carousel_payment_method_selected";
            this.f1209c = Q.e(x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1208b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1209c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1210b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1211c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: C2.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0022a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0022a f1212b = new EnumC0022a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0022a f1213c = new EnumC0022a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0022a[] f1214d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f1215e;

            /* renamed from: a, reason: collision with root package name */
            private final String f1216a;

            static {
                EnumC0022a[] a8 = a();
                f1214d = a8;
                f1215e = R5.b.a(a8);
            }

            private EnumC0022a(String str, int i8, String str2) {
                this.f1216a = str2;
            }

            private static final /* synthetic */ EnumC0022a[] a() {
                return new EnumC0022a[]{f1212b, f1213c};
            }

            public static EnumC0022a valueOf(String str) {
                return (EnumC0022a) Enum.valueOf(EnumC0022a.class, str);
            }

            public static EnumC0022a[] values() {
                return (EnumC0022a[]) f1214d.clone();
            }

            public final String b() {
                return this.f1216a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC0022a source, EnumC1870e selectedBrand) {
            super(null);
            AbstractC3159y.i(source, "source");
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f1210b = "cs_open_cbc_dropdown";
            this.f1211c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1210b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1211c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1217b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC1870e selectedBrand, Throwable error) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            AbstractC3159y.i(error, "error");
            this.f1217b = "cs_update_card_failed";
            this.f1218c = Q.k(x.a("selected_card_brand", selectedBrand.f()), x.a("error_message", error.getMessage()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1217b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1218c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f1219b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1220c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC1870e selectedBrand) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f1219b = "cs_update_card";
            this.f1220c = Q.e(x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f1219b;
        }

        @Override // C2.a
        public Map b() {
            return this.f1220c;
        }
    }

    private a() {
    }

    public abstract Map b();

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }
}
