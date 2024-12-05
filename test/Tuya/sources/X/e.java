package x;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f39093c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39094a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39095b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39096a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f39097b = 0;

        a() {
        }

        public e a() {
            return new e(this.f39096a, this.f39097b);
        }

        public a b(long j8) {
            this.f39096a = j8;
            return this;
        }

        public a c(long j8) {
            this.f39097b = j8;
            return this;
        }
    }

    e(long j8, long j9) {
        this.f39094a = j8;
        this.f39095b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39094a;
    }

    public long b() {
        return this.f39095b;
    }
}
