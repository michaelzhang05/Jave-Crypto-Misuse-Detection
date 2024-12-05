package x;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f39074c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39075a;

    /* renamed from: b, reason: collision with root package name */
    private final b f39076b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39077a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f39078b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f39077a, this.f39078b);
        }

        public a b(long j8) {
            this.f39077a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f39078b = bVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements V0.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f39087a;

        b(int i8) {
            this.f39087a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f39087a;
        }
    }

    c(long j8, b bVar) {
        this.f39075a = j8;
        this.f39076b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39075a;
    }

    public b b() {
        return this.f39076b;
    }
}
