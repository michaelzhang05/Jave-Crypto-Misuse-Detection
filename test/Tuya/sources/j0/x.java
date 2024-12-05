package J0;

import J0.D;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x extends D {

    /* renamed from: a, reason: collision with root package name */
    private final D.a f4669a;

    /* renamed from: b, reason: collision with root package name */
    private final D.c f4670b;

    /* renamed from: c, reason: collision with root package name */
    private final D.b f4671c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(D.a aVar, D.c cVar, D.b bVar) {
        if (aVar != null) {
            this.f4669a = aVar;
            if (cVar != null) {
                this.f4670b = cVar;
                if (bVar != null) {
                    this.f4671c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // J0.D
    public D.a a() {
        return this.f4669a;
    }

    @Override // J0.D
    public D.b c() {
        return this.f4671c;
    }

    @Override // J0.D
    public D.c d() {
        return this.f4670b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        if (this.f4669a.equals(d8.a()) && this.f4670b.equals(d8.d()) && this.f4671c.equals(d8.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4669a.hashCode() ^ 1000003) * 1000003) ^ this.f4670b.hashCode()) * 1000003) ^ this.f4671c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f4669a + ", osData=" + this.f4670b + ", deviceData=" + this.f4671c + "}";
    }
}
