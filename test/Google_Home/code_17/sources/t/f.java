package t;

import t.p;

/* loaded from: classes3.dex */
final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f39421a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f39422b;

    /* loaded from: classes3.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f39423a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f39424b;

        @Override // t.p.a
        public p a() {
            return new f(this.f39423a, this.f39424b);
        }

        @Override // t.p.a
        public p.a b(s sVar) {
            this.f39423a = sVar;
            return this;
        }

        @Override // t.p.a
        public p.a c(p.b bVar) {
            this.f39424b = bVar;
            return this;
        }
    }

    @Override // t.p
    public s b() {
        return this.f39421a;
    }

    @Override // t.p
    public p.b c() {
        return this.f39422b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f39421a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f39422b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        s sVar = this.f39421a;
        int i8 = 0;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        p.b bVar = this.f39422b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f39421a + ", productIdOrigin=" + this.f39422b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f39421a = sVar;
        this.f39422b = bVar;
    }
}
