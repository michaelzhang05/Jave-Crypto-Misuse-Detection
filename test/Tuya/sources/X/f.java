package x;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f39098c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39099a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39100b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39101a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f39102b = 0;

        a() {
        }

        public f a() {
            return new f(this.f39101a, this.f39102b);
        }

        public a b(long j8) {
            this.f39102b = j8;
            return this;
        }

        public a c(long j8) {
            this.f39101a = j8;
            return this;
        }
    }

    f(long j8, long j9) {
        this.f39099a = j8;
        this.f39100b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39100b;
    }

    public long b() {
        return this.f39099a;
    }
}
