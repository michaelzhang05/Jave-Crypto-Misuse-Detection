package c1;

import c1.f;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1903b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f14858a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14859b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f14860c;

    /* renamed from: c1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0365b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f14861a;

        /* renamed from: b, reason: collision with root package name */
        private Long f14862b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f14863c;

        @Override // c1.f.a
        public f a() {
            String str = "";
            if (this.f14862b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C1903b(this.f14861a, this.f14862b.longValue(), this.f14863c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c1.f.a
        public f.a b(f.b bVar) {
            this.f14863c = bVar;
            return this;
        }

        @Override // c1.f.a
        public f.a c(String str) {
            this.f14861a = str;
            return this;
        }

        @Override // c1.f.a
        public f.a d(long j8) {
            this.f14862b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // c1.f
    public f.b b() {
        return this.f14860c;
    }

    @Override // c1.f
    public String c() {
        return this.f14858a;
    }

    @Override // c1.f
    public long d() {
        return this.f14859b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f14858a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f14859b == fVar.d()) {
                f.b bVar = this.f14860c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f14858a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f14859b;
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        f.b bVar = this.f14860c;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "TokenResult{token=" + this.f14858a + ", tokenExpirationTimestamp=" + this.f14859b + ", responseCode=" + this.f14860c + "}";
    }

    private C1903b(String str, long j8, f.b bVar) {
        this.f14858a = str;
        this.f14859b = j8;
        this.f14860c = bVar;
    }
}
