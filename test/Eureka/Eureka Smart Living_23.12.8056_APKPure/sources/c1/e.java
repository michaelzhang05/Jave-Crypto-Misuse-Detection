package c1;

import c1.k;

/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f3924a;

    /* renamed from: b, reason: collision with root package name */
    private final c1.a f3925b;

    /* loaded from: classes.dex */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f3926a;

        /* renamed from: b, reason: collision with root package name */
        private c1.a f3927b;

        @Override // c1.k.a
        public k a() {
            return new e(this.f3926a, this.f3927b);
        }

        @Override // c1.k.a
        public k.a b(c1.a aVar) {
            this.f3927b = aVar;
            return this;
        }

        @Override // c1.k.a
        public k.a c(k.b bVar) {
            this.f3926a = bVar;
            return this;
        }
    }

    private e(k.b bVar, c1.a aVar) {
        this.f3924a = bVar;
        this.f3925b = aVar;
    }

    @Override // c1.k
    public c1.a b() {
        return this.f3925b;
    }

    @Override // c1.k
    public k.b c() {
        return this.f3924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f3924a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            c1.a aVar = this.f3925b;
            c1.a b6 = kVar.b();
            if (aVar == null) {
                if (b6 == null) {
                    return true;
                }
            } else if (aVar.equals(b6)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f3924a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        c1.a aVar = this.f3925b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f3924a + ", androidClientInfo=" + this.f3925b + "}";
    }
}
