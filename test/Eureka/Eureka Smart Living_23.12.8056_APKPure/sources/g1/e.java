package g1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f6693c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f6694a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6695b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f6696a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f6697b = 0;

        a() {
        }

        public e a() {
            return new e(this.f6696a, this.f6697b);
        }

        public a b(long j6) {
            this.f6696a = j6;
            return this;
        }

        public a c(long j6) {
            this.f6697b = j6;
            return this;
        }
    }

    e(long j6, long j7) {
        this.f6694a = j6;
        this.f6695b = j7;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f6694a;
    }

    public long b() {
        return this.f6695b;
    }
}
