package t;

import t.o;

/* loaded from: classes3.dex */
final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f39417a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4021a f39418b;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f39419a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4021a f39420b;

        @Override // t.o.a
        public o a() {
            return new e(this.f39419a, this.f39420b);
        }

        @Override // t.o.a
        public o.a b(AbstractC4021a abstractC4021a) {
            this.f39420b = abstractC4021a;
            return this;
        }

        @Override // t.o.a
        public o.a c(o.b bVar) {
            this.f39419a = bVar;
            return this;
        }
    }

    @Override // t.o
    public AbstractC4021a b() {
        return this.f39418b;
    }

    @Override // t.o
    public o.b c() {
        return this.f39417a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f39417a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            AbstractC4021a abstractC4021a = this.f39418b;
            if (abstractC4021a == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (abstractC4021a.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        o.b bVar = this.f39417a;
        int i8 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        AbstractC4021a abstractC4021a = this.f39418b;
        if (abstractC4021a != null) {
            i8 = abstractC4021a.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f39417a + ", androidClientInfo=" + this.f39418b + "}";
    }

    private e(o.b bVar, AbstractC4021a abstractC4021a) {
        this.f39417a = bVar;
        this.f39418b = abstractC4021a;
    }
}
