package c1;

import c1.o;

/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f3957a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f3958b;

    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f3959a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f3960b;

        @Override // c1.o.a
        public o a() {
            return new i(this.f3959a, this.f3960b);
        }

        @Override // c1.o.a
        public o.a b(o.b bVar) {
            this.f3960b = bVar;
            return this;
        }

        @Override // c1.o.a
        public o.a c(o.c cVar) {
            this.f3959a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f3957a = cVar;
        this.f3958b = bVar;
    }

    @Override // c1.o
    public o.b b() {
        return this.f3958b;
    }

    @Override // c1.o
    public o.c c() {
        return this.f3957a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f3957a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f3958b;
            o.b b6 = oVar.b();
            if (bVar == null) {
                if (b6 == null) {
                    return true;
                }
            } else if (bVar.equals(b6)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f3957a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f3958b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3957a + ", mobileSubtype=" + this.f3958b + "}";
    }
}
