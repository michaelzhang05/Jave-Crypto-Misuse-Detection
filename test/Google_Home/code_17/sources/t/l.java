package t;

/* loaded from: classes3.dex */
final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f39465a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(long j8) {
        this.f39465a = j8;
    }

    @Override // t.v
    public long c() {
        return this.f39465a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && this.f39465a == ((v) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f39465a;
        return 1000003 ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f39465a + "}";
    }
}
