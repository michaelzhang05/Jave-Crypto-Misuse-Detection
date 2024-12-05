package L0;

import L0.F;

/* loaded from: classes3.dex */
final class l extends F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f5599a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5600b;

    /* renamed from: c, reason: collision with root package name */
    private final F.e.d.a f5601c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.c f5602d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0096d f5603e;

    /* renamed from: f, reason: collision with root package name */
    private final F.e.d.f f5604f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f5605a;

        /* renamed from: b, reason: collision with root package name */
        private String f5606b;

        /* renamed from: c, reason: collision with root package name */
        private F.e.d.a f5607c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.c f5608d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0096d f5609e;

        /* renamed from: f, reason: collision with root package name */
        private F.e.d.f f5610f;

        /* renamed from: g, reason: collision with root package name */
        private byte f5611g;

        @Override // L0.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f5611g == 1 && (str = this.f5606b) != null && (aVar = this.f5607c) != null && (cVar = this.f5608d) != null) {
                return new l(this.f5605a, str, aVar, cVar, this.f5609e, this.f5610f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f5611g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f5606b == null) {
                sb.append(" type");
            }
            if (this.f5607c == null) {
                sb.append(" app");
            }
            if (this.f5608d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar != null) {
                this.f5607c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // L0.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar != null) {
                this.f5608d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // L0.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0096d abstractC0096d) {
            this.f5609e = abstractC0096d;
            return this;
        }

        @Override // L0.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f5610f = fVar;
            return this;
        }

        @Override // L0.F.e.d.b
        public F.e.d.b f(long j8) {
            this.f5605a = j8;
            this.f5611g = (byte) (this.f5611g | 1);
            return this;
        }

        @Override // L0.F.e.d.b
        public F.e.d.b g(String str) {
            if (str != null) {
                this.f5606b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e.d dVar) {
            this.f5605a = dVar.f();
            this.f5606b = dVar.g();
            this.f5607c = dVar.b();
            this.f5608d = dVar.c();
            this.f5609e = dVar.d();
            this.f5610f = dVar.e();
            this.f5611g = (byte) 1;
        }
    }

    @Override // L0.F.e.d
    public F.e.d.a b() {
        return this.f5601c;
    }

    @Override // L0.F.e.d
    public F.e.d.c c() {
        return this.f5602d;
    }

    @Override // L0.F.e.d
    public F.e.d.AbstractC0096d d() {
        return this.f5603e;
    }

    @Override // L0.F.e.d
    public F.e.d.f e() {
        return this.f5604f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0096d abstractC0096d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar = (F.e.d) obj;
        if (this.f5599a == dVar.f() && this.f5600b.equals(dVar.g()) && this.f5601c.equals(dVar.b()) && this.f5602d.equals(dVar.c()) && ((abstractC0096d = this.f5603e) != null ? abstractC0096d.equals(dVar.d()) : dVar.d() == null)) {
            F.e.d.f fVar = this.f5604f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // L0.F.e.d
    public long f() {
        return this.f5599a;
    }

    @Override // L0.F.e.d
    public String g() {
        return this.f5600b;
    }

    @Override // L0.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5599a;
        int hashCode2 = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f5600b.hashCode()) * 1000003) ^ this.f5601c.hashCode()) * 1000003) ^ this.f5602d.hashCode()) * 1000003;
        F.e.d.AbstractC0096d abstractC0096d = this.f5603e;
        int i8 = 0;
        if (abstractC0096d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0096d.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        F.e.d.f fVar = this.f5604f;
        if (fVar != null) {
            i8 = fVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "Event{timestamp=" + this.f5599a + ", type=" + this.f5600b + ", app=" + this.f5601c + ", device=" + this.f5602d + ", log=" + this.f5603e + ", rollouts=" + this.f5604f + "}";
    }

    private l(long j8, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0096d abstractC0096d, F.e.d.f fVar) {
        this.f5599a = j8;
        this.f5600b = str;
        this.f5601c = aVar;
        this.f5602d = cVar;
        this.f5603e = abstractC0096d;
        this.f5604f = fVar;
    }
}
