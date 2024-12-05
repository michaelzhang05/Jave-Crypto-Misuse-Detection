package j$.time.temporal;

/* loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    private final transient String f32026a;

    /* renamed from: b, reason: collision with root package name */
    private final transient w f32027b;

    /* renamed from: c, reason: collision with root package name */
    private final transient long f32028c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j8) {
        this.f32026a = str;
        this.f32027b = w.j((-365243219162L) + j8, 365241780471L + j8);
        this.f32028c = j8;
    }

    @Override // j$.time.temporal.r
    public final w j() {
        return this.f32027b;
    }

    @Override // j$.time.temporal.r
    public final long l(o oVar) {
        return oVar.r(a.EPOCH_DAY) + this.f32028c;
    }

    @Override // j$.time.temporal.r
    public final boolean m(o oVar) {
        return oVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final m r(m mVar, long j8) {
        if (this.f32027b.i(j8)) {
            return mVar.d(j$.com.android.tools.r8.a.m(j8, this.f32028c), a.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.f32026a + " " + j8);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32026a;
    }

    @Override // j$.time.temporal.r
    public final w u(o oVar) {
        if (oVar.f(a.EPOCH_DAY)) {
            return this.f32027b;
        }
        throw new RuntimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }
}
