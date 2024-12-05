package L0;

import L0.G;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B extends G {

    /* renamed from: a, reason: collision with root package name */
    private final G.a f5312a;

    /* renamed from: b, reason: collision with root package name */
    private final G.c f5313b;

    /* renamed from: c, reason: collision with root package name */
    private final G.b f5314c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar != null) {
            this.f5312a = aVar;
            if (cVar != null) {
                this.f5313b = cVar;
                if (bVar != null) {
                    this.f5314c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // L0.G
    public G.a a() {
        return this.f5312a;
    }

    @Override // L0.G
    public G.b c() {
        return this.f5314c;
    }

    @Override // L0.G
    public G.c d() {
        return this.f5313b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f5312a.equals(g8.a()) && this.f5313b.equals(g8.d()) && this.f5314c.equals(g8.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5312a.hashCode() ^ 1000003) * 1000003) ^ this.f5313b.hashCode()) * 1000003) ^ this.f5314c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f5312a + ", osData=" + this.f5313b + ", deviceData=" + this.f5314c + "}";
    }
}
