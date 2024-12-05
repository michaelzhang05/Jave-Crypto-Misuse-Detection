package n4;

import n4.f;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f8006a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8007b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f8008c;

    /* renamed from: n4.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0124b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f8009a;

        /* renamed from: b, reason: collision with root package name */
        private Long f8010b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f8011c;

        @Override // n4.f.a
        public f a() {
            String str = "";
            if (this.f8010b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f8009a, this.f8010b.longValue(), this.f8011c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n4.f.a
        public f.a b(f.b bVar) {
            this.f8011c = bVar;
            return this;
        }

        @Override // n4.f.a
        public f.a c(String str) {
            this.f8009a = str;
            return this;
        }

        @Override // n4.f.a
        public f.a d(long j6) {
            this.f8010b = Long.valueOf(j6);
            return this;
        }
    }

    private b(String str, long j6, f.b bVar) {
        this.f8006a = str;
        this.f8007b = j6;
        this.f8008c = bVar;
    }

    @Override // n4.f
    public f.b b() {
        return this.f8008c;
    }

    @Override // n4.f
    public String c() {
        return this.f8006a;
    }

    @Override // n4.f
    public long d() {
        return this.f8007b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f8006a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f8007b == fVar.d()) {
                f.b bVar = this.f8008c;
                f.b b6 = fVar.b();
                if (bVar == null) {
                    if (b6 == null) {
                        return true;
                    }
                } else if (bVar.equals(b6)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8006a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f8007b;
        int i6 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        f.b bVar = this.f8008c;
        return i6 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f8006a + ", tokenExpirationTimestamp=" + this.f8007b + ", responseCode=" + this.f8008c + "}";
    }
}
