package c1;

/* loaded from: classes.dex */
final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f3956a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j6) {
        this.f3956a = j6;
    }

    @Override // c1.n
    public long c() {
        return this.f3956a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f3956a == ((n) obj).c();
    }

    public int hashCode() {
        long j6 = this.f3956a;
        return 1000003 ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f3956a + "}";
    }
}
