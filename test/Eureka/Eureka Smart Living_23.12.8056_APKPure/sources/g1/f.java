package g1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f6698c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f6699a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6700b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f6701a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f6702b = 0;

        a() {
        }

        public f a() {
            return new f(this.f6701a, this.f6702b);
        }

        public a b(long j6) {
            this.f6702b = j6;
            return this;
        }

        public a c(long j6) {
            this.f6701a = j6;
            return this;
        }
    }

    f(long j6, long j7) {
        this.f6699a = j6;
        this.f6700b = j7;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f6700b;
    }

    public long b() {
        return this.f6699a;
    }
}
