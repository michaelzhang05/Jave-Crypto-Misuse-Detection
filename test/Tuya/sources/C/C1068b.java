package C;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1068b extends AbstractC1077k {

    /* renamed from: a, reason: collision with root package name */
    private final long f1126a;

    /* renamed from: b, reason: collision with root package name */
    private final u.p f1127b;

    /* renamed from: c, reason: collision with root package name */
    private final u.i f1128c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1068b(long j8, u.p pVar, u.i iVar) {
        this.f1126a = j8;
        if (pVar != null) {
            this.f1127b = pVar;
            if (iVar != null) {
                this.f1128c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // C.AbstractC1077k
    public u.i b() {
        return this.f1128c;
    }

    @Override // C.AbstractC1077k
    public long c() {
        return this.f1126a;
    }

    @Override // C.AbstractC1077k
    public u.p d() {
        return this.f1127b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1077k)) {
            return false;
        }
        AbstractC1077k abstractC1077k = (AbstractC1077k) obj;
        if (this.f1126a == abstractC1077k.c() && this.f1127b.equals(abstractC1077k.d()) && this.f1128c.equals(abstractC1077k.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f1126a;
        return this.f1128c.hashCode() ^ ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f1127b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f1126a + ", transportContext=" + this.f1127b + ", event=" + this.f1128c + "}";
    }
}
