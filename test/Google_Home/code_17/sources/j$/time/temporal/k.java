package j$.time.temporal;

/* loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    private final transient String f33220a;

    /* renamed from: b, reason: collision with root package name */
    private final transient w f33221b;

    /* renamed from: c, reason: collision with root package name */
    private final transient long f33222c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j8) {
        this.f33220a = str;
        this.f33221b = w.j((-365243219162L) + j8, 365241780471L + j8);
        this.f33222c = j8;
    }

    @Override // j$.time.temporal.r
    public final w j() {
        return this.f33221b;
    }

    @Override // j$.time.temporal.r
    public final long l(o oVar) {
        return oVar.r(a.EPOCH_DAY) + this.f33222c;
    }

    @Override // j$.time.temporal.r
    public final boolean m(o oVar) {
        return oVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final m r(m mVar, long j8) {
        if (this.f33221b.i(j8)) {
            return mVar.d(j$.com.android.tools.r8.a.m(j8, this.f33222c), a.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.f33220a + " " + j8);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33220a;
    }

    @Override // j$.time.temporal.r
    public final w u(o oVar) {
        if (oVar.f(a.EPOCH_DAY)) {
            return this.f33221b;
        }
        throw new RuntimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }
}
