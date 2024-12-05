package v;

import v.g;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3810b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f38583a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3810b(g.a aVar, long j8) {
        if (aVar != null) {
            this.f38583a = aVar;
            this.f38584b = j8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // v.g
    public long b() {
        return this.f38584b;
    }

    @Override // v.g
    public g.a c() {
        return this.f38583a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f38583a.equals(gVar.c()) && this.f38584b == gVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f38583a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f38584b;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f38583a + ", nextRequestWaitMillis=" + this.f38584b + "}";
    }
}
