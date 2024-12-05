package F2;

import e3.EnumC2791e;

/* loaded from: classes4.dex */
public interface b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2731a = new a("Add", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f2732b = new a("Edit", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f2733c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f2734d;

        static {
            a[] a8 = a();
            f2733c = a8;
            f2734d = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f2731a, f2732b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2733c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: F2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0047b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0047b f2735b = new EnumC0047b("AddPaymentMethod", 0, "add_payment_method");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0047b f2736c = new EnumC0047b("SelectPaymentMethod", 1, "select_payment_method");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0047b f2737d = new EnumC0047b("EditPaymentMethod", 2, "edit_payment_method");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumC0047b[] f2738e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f2739f;

        /* renamed from: a, reason: collision with root package name */
        private final String f2740a;

        static {
            EnumC0047b[] a8 = a();
            f2738e = a8;
            f2739f = U5.b.a(a8);
        }

        private EnumC0047b(String str, int i8, String str2) {
            this.f2740a = str2;
        }

        private static final /* synthetic */ EnumC0047b[] a() {
            return new EnumC0047b[]{f2735b, f2736c, f2737d};
        }

        public static EnumC0047b valueOf(String str) {
            return (EnumC0047b) Enum.valueOf(EnumC0047b.class, str);
        }

        public static EnumC0047b[] values() {
            return (EnumC0047b[]) f2738e.clone();
        }
    }

    void a();

    void b(EnumC2791e enumC2791e);

    void c(EnumC2791e enumC2791e, Throwable th);

    void d(String str);

    void e(EnumC0047b enumC0047b);

    void f(String str);

    void g(a aVar, EnumC2791e enumC2791e);

    void h(E2.a aVar);

    void i();

    void j(a aVar, EnumC2791e enumC2791e);

    void k(String str);

    void l();

    void m();

    void n(EnumC0047b enumC0047b);

    void o();
}
