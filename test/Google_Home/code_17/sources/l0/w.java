package L0;

import L0.F;

/* loaded from: classes3.dex */
final class w extends F.e.d.AbstractC0097e {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0097e.b f5706a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5707b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5708c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5709d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0097e.a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0097e.b f5710a;

        /* renamed from: b, reason: collision with root package name */
        private String f5711b;

        /* renamed from: c, reason: collision with root package name */
        private String f5712c;

        /* renamed from: d, reason: collision with root package name */
        private long f5713d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5714e;

        @Override // L0.F.e.d.AbstractC0097e.a
        public F.e.d.AbstractC0097e a() {
            F.e.d.AbstractC0097e.b bVar;
            String str;
            String str2;
            if (this.f5714e == 1 && (bVar = this.f5710a) != null && (str = this.f5711b) != null && (str2 = this.f5712c) != null) {
                return new w(bVar, str, str2, this.f5713d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5710a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f5711b == null) {
                sb.append(" parameterKey");
            }
            if (this.f5712c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f5714e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.AbstractC0097e.a
        public F.e.d.AbstractC0097e.a b(String str) {
            if (str != null) {
                this.f5711b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // L0.F.e.d.AbstractC0097e.a
        public F.e.d.AbstractC0097e.a c(String str) {
            if (str != null) {
                this.f5712c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // L0.F.e.d.AbstractC0097e.a
        public F.e.d.AbstractC0097e.a d(F.e.d.AbstractC0097e.b bVar) {
            if (bVar != null) {
                this.f5710a = bVar;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // L0.F.e.d.AbstractC0097e.a
        public F.e.d.AbstractC0097e.a e(long j8) {
            this.f5713d = j8;
            this.f5714e = (byte) (this.f5714e | 1);
            return this;
        }
    }

    @Override // L0.F.e.d.AbstractC0097e
    public String b() {
        return this.f5707b;
    }

    @Override // L0.F.e.d.AbstractC0097e
    public String c() {
        return this.f5708c;
    }

    @Override // L0.F.e.d.AbstractC0097e
    public F.e.d.AbstractC0097e.b d() {
        return this.f5706a;
    }

    @Override // L0.F.e.d.AbstractC0097e
    public long e() {
        return this.f5709d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0097e)) {
            return false;
        }
        F.e.d.AbstractC0097e abstractC0097e = (F.e.d.AbstractC0097e) obj;
        if (this.f5706a.equals(abstractC0097e.d()) && this.f5707b.equals(abstractC0097e.b()) && this.f5708c.equals(abstractC0097e.c()) && this.f5709d == abstractC0097e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.f5706a.hashCode() ^ 1000003) * 1000003) ^ this.f5707b.hashCode()) * 1000003) ^ this.f5708c.hashCode()) * 1000003;
        long j8 = this.f5709d;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f5706a + ", parameterKey=" + this.f5707b + ", parameterValue=" + this.f5708c + ", templateVersion=" + this.f5709d + "}";
    }

    private w(F.e.d.AbstractC0097e.b bVar, String str, String str2, long j8) {
        this.f5706a = bVar;
        this.f5707b = str;
        this.f5708c = str2;
        this.f5709d = j8;
    }
}
