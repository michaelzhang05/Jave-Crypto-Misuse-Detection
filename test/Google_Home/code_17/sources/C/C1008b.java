package C;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1008b extends AbstractC1017k {

    /* renamed from: a, reason: collision with root package name */
    private final long f1137a;

    /* renamed from: b, reason: collision with root package name */
    private final u.p f1138b;

    /* renamed from: c, reason: collision with root package name */
    private final u.i f1139c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1008b(long j8, u.p pVar, u.i iVar) {
        this.f1137a = j8;
        if (pVar != null) {
            this.f1138b = pVar;
            if (iVar != null) {
                this.f1139c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // C.AbstractC1017k
    public u.i b() {
        return this.f1139c;
    }

    @Override // C.AbstractC1017k
    public long c() {
        return this.f1137a;
    }

    @Override // C.AbstractC1017k
    public u.p d() {
        return this.f1138b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1017k)) {
            return false;
        }
        AbstractC1017k abstractC1017k = (AbstractC1017k) obj;
        if (this.f1137a == abstractC1017k.c() && this.f1138b.equals(abstractC1017k.d()) && this.f1139c.equals(abstractC1017k.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f1137a;
        return this.f1139c.hashCode() ^ ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f1138b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f1137a + ", transportContext=" + this.f1138b + ", event=" + this.f1139c + "}";
    }
}
