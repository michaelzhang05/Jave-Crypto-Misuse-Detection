package y0;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3967a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f39648a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39649b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39650c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3967a(long j8, long j9, long j10) {
        this.f39648a = j8;
        this.f39649b = j9;
        this.f39650c = j10;
    }

    @Override // y0.n
    public long b() {
        return this.f39649b;
    }

    @Override // y0.n
    public long c() {
        return this.f39648a;
    }

    @Override // y0.n
    public long d() {
        return this.f39650c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f39648a == nVar.c() && this.f39649b == nVar.b() && this.f39650c == nVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f39648a;
        long j9 = this.f39649b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f39650c;
        return ((int) ((j10 >>> 32) ^ j10)) ^ i8;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f39648a + ", elapsedRealtime=" + this.f39649b + ", uptimeMillis=" + this.f39650c + "}";
    }
}
