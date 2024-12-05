package J0;

import J0.B;

/* loaded from: classes3.dex */
final class l extends B.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f4575a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4576b;

    /* renamed from: c, reason: collision with root package name */
    private final B.e.d.a f4577c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.c f4578d;

    /* renamed from: e, reason: collision with root package name */
    private final B.e.d.AbstractC0086d f4579e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Long f4580a;

        /* renamed from: b, reason: collision with root package name */
        private String f4581b;

        /* renamed from: c, reason: collision with root package name */
        private B.e.d.a f4582c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.c f4583d;

        /* renamed from: e, reason: collision with root package name */
        private B.e.d.AbstractC0086d f4584e;

        @Override // J0.B.e.d.b
        public B.e.d a() {
            String str = "";
            if (this.f4580a == null) {
                str = " timestamp";
            }
            if (this.f4581b == null) {
                str = str + " type";
            }
            if (this.f4582c == null) {
                str = str + " app";
            }
            if (this.f4583d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f4580a.longValue(), this.f4581b, this.f4582c, this.f4583d, this.f4584e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.b
        public B.e.d.b b(B.e.d.a aVar) {
            if (aVar != null) {
                this.f4582c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // J0.B.e.d.b
        public B.e.d.b c(B.e.d.c cVar) {
            if (cVar != null) {
                this.f4583d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // J0.B.e.d.b
        public B.e.d.b d(B.e.d.AbstractC0086d abstractC0086d) {
            this.f4584e = abstractC0086d;
            return this;
        }

        @Override // J0.B.e.d.b
        public B.e.d.b e(long j8) {
            this.f4580a = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.b
        public B.e.d.b f(String str) {
            if (str != null) {
                this.f4581b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e.d dVar) {
            this.f4580a = Long.valueOf(dVar.e());
            this.f4581b = dVar.f();
            this.f4582c = dVar.b();
            this.f4583d = dVar.c();
            this.f4584e = dVar.d();
        }
    }

    @Override // J0.B.e.d
    public B.e.d.a b() {
        return this.f4577c;
    }

    @Override // J0.B.e.d
    public B.e.d.c c() {
        return this.f4578d;
    }

    @Override // J0.B.e.d
    public B.e.d.AbstractC0086d d() {
        return this.f4579e;
    }

    @Override // J0.B.e.d
    public long e() {
        return this.f4575a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d)) {
            return false;
        }
        B.e.d dVar = (B.e.d) obj;
        if (this.f4575a == dVar.e() && this.f4576b.equals(dVar.f()) && this.f4577c.equals(dVar.b()) && this.f4578d.equals(dVar.c())) {
            B.e.d.AbstractC0086d abstractC0086d = this.f4579e;
            if (abstractC0086d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC0086d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.e.d
    public String f() {
        return this.f4576b;
    }

    @Override // J0.B.e.d
    public B.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f4575a;
        int hashCode2 = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f4576b.hashCode()) * 1000003) ^ this.f4577c.hashCode()) * 1000003) ^ this.f4578d.hashCode()) * 1000003;
        B.e.d.AbstractC0086d abstractC0086d = this.f4579e;
        if (abstractC0086d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0086d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f4575a + ", type=" + this.f4576b + ", app=" + this.f4577c + ", device=" + this.f4578d + ", log=" + this.f4579e + "}";
    }

    private l(long j8, String str, B.e.d.a aVar, B.e.d.c cVar, B.e.d.AbstractC0086d abstractC0086d) {
        this.f4575a = j8;
        this.f4576b = str;
        this.f4577c = aVar;
        this.f4578d = cVar;
        this.f4579e = abstractC0086d;
    }
}
