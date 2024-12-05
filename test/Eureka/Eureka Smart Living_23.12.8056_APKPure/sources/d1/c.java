package d1;

import d1.n;

/* loaded from: classes.dex */
final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    private final o f6419a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6420b;

    /* renamed from: c, reason: collision with root package name */
    private final b1.c f6421c;

    /* renamed from: d, reason: collision with root package name */
    private final b1.e f6422d;

    /* renamed from: e, reason: collision with root package name */
    private final b1.b f6423e;

    /* loaded from: classes.dex */
    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private o f6424a;

        /* renamed from: b, reason: collision with root package name */
        private String f6425b;

        /* renamed from: c, reason: collision with root package name */
        private b1.c f6426c;

        /* renamed from: d, reason: collision with root package name */
        private b1.e f6427d;

        /* renamed from: e, reason: collision with root package name */
        private b1.b f6428e;

        @Override // d1.n.a
        public n a() {
            String str = "";
            if (this.f6424a == null) {
                str = " transportContext";
            }
            if (this.f6425b == null) {
                str = str + " transportName";
            }
            if (this.f6426c == null) {
                str = str + " event";
            }
            if (this.f6427d == null) {
                str = str + " transformer";
            }
            if (this.f6428e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f6424a, this.f6425b, this.f6426c, this.f6427d, this.f6428e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d1.n.a
        n.a b(b1.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f6428e = bVar;
            return this;
        }

        @Override // d1.n.a
        n.a c(b1.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f6426c = cVar;
            return this;
        }

        @Override // d1.n.a
        n.a d(b1.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f6427d = eVar;
            return this;
        }

        @Override // d1.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f6424a = oVar;
            return this;
        }

        @Override // d1.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6425b = str;
            return this;
        }
    }

    private c(o oVar, String str, b1.c cVar, b1.e eVar, b1.b bVar) {
        this.f6419a = oVar;
        this.f6420b = str;
        this.f6421c = cVar;
        this.f6422d = eVar;
        this.f6423e = bVar;
    }

    @Override // d1.n
    public b1.b b() {
        return this.f6423e;
    }

    @Override // d1.n
    b1.c c() {
        return this.f6421c;
    }

    @Override // d1.n
    b1.e e() {
        return this.f6422d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f6419a.equals(nVar.f()) && this.f6420b.equals(nVar.g()) && this.f6421c.equals(nVar.c()) && this.f6422d.equals(nVar.e()) && this.f6423e.equals(nVar.b());
    }

    @Override // d1.n
    public o f() {
        return this.f6419a;
    }

    @Override // d1.n
    public String g() {
        return this.f6420b;
    }

    public int hashCode() {
        return ((((((((this.f6419a.hashCode() ^ 1000003) * 1000003) ^ this.f6420b.hashCode()) * 1000003) ^ this.f6421c.hashCode()) * 1000003) ^ this.f6422d.hashCode()) * 1000003) ^ this.f6423e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f6419a + ", transportName=" + this.f6420b + ", event=" + this.f6421c + ", transformer=" + this.f6422d + ", encoding=" + this.f6423e + "}";
    }
}
