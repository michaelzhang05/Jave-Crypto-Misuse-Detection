package C2;

import b3.EnumC1870e;

/* loaded from: classes4.dex */
public interface b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1221a = new a("Add", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f1222b = new a("Edit", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f1223c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f1224d;

        static {
            a[] a8 = a();
            f1223c = a8;
            f1224d = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f1221a, f1222b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1223c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: C2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0023b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0023b f1225b = new EnumC0023b("AddPaymentMethod", 0, "add_payment_method");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0023b f1226c = new EnumC0023b("SelectPaymentMethod", 1, "select_payment_method");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0023b f1227d = new EnumC0023b("EditPaymentMethod", 2, "edit_payment_method");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumC0023b[] f1228e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f1229f;

        /* renamed from: a, reason: collision with root package name */
        private final String f1230a;

        static {
            EnumC0023b[] a8 = a();
            f1228e = a8;
            f1229f = R5.b.a(a8);
        }

        private EnumC0023b(String str, int i8, String str2) {
            this.f1230a = str2;
        }

        private static final /* synthetic */ EnumC0023b[] a() {
            return new EnumC0023b[]{f1225b, f1226c, f1227d};
        }

        public static EnumC0023b valueOf(String str) {
            return (EnumC0023b) Enum.valueOf(EnumC0023b.class, str);
        }

        public static EnumC0023b[] values() {
            return (EnumC0023b[]) f1228e.clone();
        }
    }

    void a();

    void b(EnumC1870e enumC1870e, Throwable th);

    void c(EnumC1870e enumC1870e);

    void d(EnumC0023b enumC0023b);

    void e(String str);

    void f(B2.a aVar);

    void g(a aVar, EnumC1870e enumC1870e);

    void h(String str);

    void i(EnumC0023b enumC0023b);

    void j();

    void k(String str);

    void l();

    void m();

    void n();

    void o(a aVar, EnumC1870e enumC1870e);
}
