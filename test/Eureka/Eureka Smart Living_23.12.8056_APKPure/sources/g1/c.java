package g1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f6674c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f6675a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6676b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f6677a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f6678b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f6677a, this.f6678b);
        }

        public a b(long j6) {
            this.f6677a = j6;
            return this;
        }

        public a c(b bVar) {
            this.f6678b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements g4.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f6687a;

        b(int i6) {
            this.f6687a = i6;
        }

        @Override // g4.c
        public int a() {
            return this.f6687a;
        }
    }

    c(long j6, b bVar) {
        this.f6675a = j6;
        this.f6676b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f6675a;
    }

    public b b() {
        return this.f6676b;
    }
}
