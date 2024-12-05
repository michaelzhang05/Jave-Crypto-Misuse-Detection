package e1;

import e1.g;

/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f6492a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6493b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar, long j6) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f6492a = aVar;
        this.f6493b = j6;
    }

    @Override // e1.g
    public long b() {
        return this.f6493b;
    }

    @Override // e1.g
    public g.a c() {
        return this.f6492a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6492a.equals(gVar.c()) && this.f6493b == gVar.b();
    }

    public int hashCode() {
        int hashCode = (this.f6492a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f6493b;
        return hashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f6492a + ", nextRequestWaitMillis=" + this.f6493b + "}";
    }
}
