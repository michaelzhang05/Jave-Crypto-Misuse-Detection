package l1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f7284a;

    /* renamed from: b, reason: collision with root package name */
    private final d1.o f7285b;

    /* renamed from: c, reason: collision with root package name */
    private final d1.i f7286c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j6, d1.o oVar, d1.i iVar) {
        this.f7284a = j6;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f7285b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f7286c = iVar;
    }

    @Override // l1.k
    public d1.i b() {
        return this.f7286c;
    }

    @Override // l1.k
    public long c() {
        return this.f7284a;
    }

    @Override // l1.k
    public d1.o d() {
        return this.f7285b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7284a == kVar.c() && this.f7285b.equals(kVar.d()) && this.f7286c.equals(kVar.b());
    }

    public int hashCode() {
        long j6 = this.f7284a;
        return this.f7286c.hashCode() ^ ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f7285b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f7284a + ", transportContext=" + this.f7285b + ", event=" + this.f7286c + "}";
    }
}
