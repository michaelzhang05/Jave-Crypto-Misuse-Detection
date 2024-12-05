package x;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4154c {

    /* renamed from: c, reason: collision with root package name */
    private static final C4154c f40536c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40537a;

    /* renamed from: b, reason: collision with root package name */
    private final b f40538b;

    /* renamed from: x.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40539a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f40540b = b.REASON_UNKNOWN;

        a() {
        }

        public C4154c a() {
            return new C4154c(this.f40539a, this.f40540b);
        }

        public a b(long j8) {
            this.f40539a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f40540b = bVar;
            return this;
        }
    }

    /* renamed from: x.c$b */
    /* loaded from: classes3.dex */
    public enum b implements X0.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f40549a;

        b(int i8) {
            this.f40549a = i8;
        }

        @Override // X0.c
        public int getNumber() {
            return this.f40549a;
        }
    }

    C4154c(long j8, b bVar) {
        this.f40537a = j8;
        this.f40538b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40537a;
    }

    public b b() {
        return this.f40538b;
    }
}
