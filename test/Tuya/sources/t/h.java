package t;

/* loaded from: classes3.dex */
final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f38139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j8) {
        this.f38139a = j8;
    }

    @Override // t.n
    public long c() {
        return this.f38139a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && this.f38139a == ((n) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f38139a;
        return 1000003 ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f38139a + "}";
    }
}
