package P2;

/* loaded from: classes4.dex */
public interface e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8735a = new a("RequiresSignUp", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f8736b = new a("RequiresVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f8737c = new a("Verified", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f8738d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f8739e;

        static {
            a[] a8 = a();
            f8738d = a8;
            f8739e = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f8735a, f8736b, f8737c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f8738d.clone();
        }
    }

    void a(boolean z8);

    void b(boolean z8);

    void c();

    void d();

    void e(Throwable th);

    void f();

    void g(boolean z8, Throwable th);

    void h(a aVar);

    void i(Throwable th);

    void j();

    void k();

    void l();
}
