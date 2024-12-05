package t;

import t.w;

/* loaded from: classes3.dex */
final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private final w.c f39466a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f39467b;

    /* loaded from: classes3.dex */
    static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        private w.c f39468a;

        /* renamed from: b, reason: collision with root package name */
        private w.b f39469b;

        @Override // t.w.a
        public w a() {
            return new m(this.f39468a, this.f39469b);
        }

        @Override // t.w.a
        public w.a b(w.b bVar) {
            this.f39469b = bVar;
            return this;
        }

        @Override // t.w.a
        public w.a c(w.c cVar) {
            this.f39468a = cVar;
            return this;
        }
    }

    @Override // t.w
    public w.b b() {
        return this.f39467b;
    }

    @Override // t.w
    public w.c c() {
        return this.f39466a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f39466a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f39467b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        w.c cVar = this.f39466a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        w.b bVar = this.f39467b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f39466a + ", mobileSubtype=" + this.f39467b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f39466a = cVar;
        this.f39467b = bVar;
    }
}
