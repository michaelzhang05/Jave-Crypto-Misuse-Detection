package x;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4156e {

    /* renamed from: c, reason: collision with root package name */
    private static final C4156e f40555c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40556a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40557b;

    /* renamed from: x.e$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40558a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f40559b = 0;

        a() {
        }

        public C4156e a() {
            return new C4156e(this.f40558a, this.f40559b);
        }

        public a b(long j8) {
            this.f40558a = j8;
            return this;
        }

        public a c(long j8) {
            this.f40559b = j8;
            return this;
        }
    }

    C4156e(long j8, long j9) {
        this.f40556a = j8;
        this.f40557b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40556a;
    }

    public long b() {
        return this.f40557b;
    }
}
