package L0;

import L0.F;

/* loaded from: classes3.dex */
final class q extends F.e.d.a.b.AbstractC0089d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5657a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5658b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0089d.AbstractC0090a {

        /* renamed from: a, reason: collision with root package name */
        private String f5660a;

        /* renamed from: b, reason: collision with root package name */
        private String f5661b;

        /* renamed from: c, reason: collision with root package name */
        private long f5662c;

        /* renamed from: d, reason: collision with root package name */
        private byte f5663d;

        @Override // L0.F.e.d.a.b.AbstractC0089d.AbstractC0090a
        public F.e.d.a.b.AbstractC0089d a() {
            String str;
            String str2;
            if (this.f5663d == 1 && (str = this.f5660a) != null && (str2 = this.f5661b) != null) {
                return new q(str, str2, this.f5662c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5660a == null) {
                sb.append(" name");
            }
            if (this.f5661b == null) {
                sb.append(" code");
            }
            if ((1 & this.f5663d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.AbstractC0089d.AbstractC0090a
        public F.e.d.a.b.AbstractC0089d.AbstractC0090a b(long j8) {
            this.f5662c = j8;
            this.f5663d = (byte) (this.f5663d | 1);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0089d.AbstractC0090a
        public F.e.d.a.b.AbstractC0089d.AbstractC0090a c(String str) {
            if (str != null) {
                this.f5661b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // L0.F.e.d.a.b.AbstractC0089d.AbstractC0090a
        public F.e.d.a.b.AbstractC0089d.AbstractC0090a d(String str) {
            if (str != null) {
                this.f5660a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // L0.F.e.d.a.b.AbstractC0089d
    public long b() {
        return this.f5659c;
    }

    @Override // L0.F.e.d.a.b.AbstractC0089d
    public String c() {
        return this.f5658b;
    }

    @Override // L0.F.e.d.a.b.AbstractC0089d
    public String d() {
        return this.f5657a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0089d)) {
            return false;
        }
        F.e.d.a.b.AbstractC0089d abstractC0089d = (F.e.d.a.b.AbstractC0089d) obj;
        if (this.f5657a.equals(abstractC0089d.d()) && this.f5658b.equals(abstractC0089d.c()) && this.f5659c == abstractC0089d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f5657a.hashCode() ^ 1000003) * 1000003) ^ this.f5658b.hashCode()) * 1000003;
        long j8 = this.f5659c;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f5657a + ", code=" + this.f5658b + ", address=" + this.f5659c + "}";
    }

    private q(String str, String str2, long j8) {
        this.f5657a = str;
        this.f5658b = str2;
        this.f5659c = j8;
    }
}
