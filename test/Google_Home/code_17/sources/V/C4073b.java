package v;

import v.AbstractC4078g;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4073b extends AbstractC4078g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4078g.a f40079a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4073b(AbstractC4078g.a aVar, long j8) {
        if (aVar != null) {
            this.f40079a = aVar;
            this.f40080b = j8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // v.AbstractC4078g
    public long b() {
        return this.f40080b;
    }

    @Override // v.AbstractC4078g
    public AbstractC4078g.a c() {
        return this.f40079a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4078g)) {
            return false;
        }
        AbstractC4078g abstractC4078g = (AbstractC4078g) obj;
        if (this.f40079a.equals(abstractC4078g.c()) && this.f40080b == abstractC4078g.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f40079a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f40080b;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f40079a + ", nextRequestWaitMillis=" + this.f40080b + "}";
    }
}
