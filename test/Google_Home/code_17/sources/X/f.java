package x;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f40560c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40561a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40562b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40563a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f40564b = 0;

        a() {
        }

        public f a() {
            return new f(this.f40563a, this.f40564b);
        }

        public a b(long j8) {
            this.f40564b = j8;
            return this;
        }

        public a c(long j8) {
            this.f40563a = j8;
            return this;
        }
    }

    f(long j8, long j9) {
        this.f40561a = j8;
        this.f40562b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40562b;
    }

    public long b() {
        return this.f40561a;
    }
}
