package x;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4153b {

    /* renamed from: b, reason: collision with root package name */
    private static final C4153b f40533b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C4156e f40534a;

    /* renamed from: x.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C4156e f40535a = null;

        a() {
        }

        public C4153b a() {
            return new C4153b(this.f40535a);
        }

        public a b(C4156e c4156e) {
            this.f40535a = c4156e;
            return this;
        }
    }

    C4153b(C4156e c4156e) {
        this.f40534a = c4156e;
    }

    public static a b() {
        return new a();
    }

    public C4156e a() {
        return this.f40534a;
    }
}
