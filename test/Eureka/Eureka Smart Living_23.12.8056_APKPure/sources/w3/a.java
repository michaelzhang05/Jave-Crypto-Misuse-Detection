package w3;

/* loaded from: classes.dex */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f9745a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9746b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9747c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j6, long j7, long j8) {
        this.f9745a = j6;
        this.f9746b = j7;
        this.f9747c = j8;
    }

    @Override // w3.m
    public long b() {
        return this.f9746b;
    }

    @Override // w3.m
    public long c() {
        return this.f9745a;
    }

    @Override // w3.m
    public long d() {
        return this.f9747c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f9745a == mVar.c() && this.f9746b == mVar.b() && this.f9747c == mVar.d();
    }

    public int hashCode() {
        long j6 = this.f9745a;
        long j7 = this.f9746b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f9747c;
        return ((int) ((j8 >>> 32) ^ j8)) ^ i6;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f9745a + ", elapsedRealtime=" + this.f9746b + ", uptimeMillis=" + this.f9747c + "}";
    }
}
