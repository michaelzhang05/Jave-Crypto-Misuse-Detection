package D2;

import k6.C3225a;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(d dVar, b bVar, boolean z8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    z8 = true;
                }
                dVar.b(bVar, z8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1780a = new b("Loading", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f1781b = new b("Checkout", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f1782c = new b("LinkSignup", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f1783d = new b("ConfirmButtonClicked", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f1784e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f1785f;

        static {
            b[] a8 = a();
            f1784e = a8;
            f1785f = U5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f1780a, f1781b, f1782c, f1783d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1784e.clone();
        }
    }

    C3225a a(b bVar);

    void b(b bVar, boolean z8);
}
