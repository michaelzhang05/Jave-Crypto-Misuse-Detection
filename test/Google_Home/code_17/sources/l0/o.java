package L0;

import L0.F;

/* loaded from: classes3.dex */
final class o extends F.e.d.a.b.AbstractC0085a {

    /* renamed from: a, reason: collision with root package name */
    private final long f5637a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5638b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5639c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5640d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0085a.AbstractC0086a {

        /* renamed from: a, reason: collision with root package name */
        private long f5641a;

        /* renamed from: b, reason: collision with root package name */
        private long f5642b;

        /* renamed from: c, reason: collision with root package name */
        private String f5643c;

        /* renamed from: d, reason: collision with root package name */
        private String f5644d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5645e;

        @Override // L0.F.e.d.a.b.AbstractC0085a.AbstractC0086a
        public F.e.d.a.b.AbstractC0085a a() {
            String str;
            if (this.f5645e == 3 && (str = this.f5643c) != null) {
                return new o(this.f5641a, this.f5642b, str, this.f5644d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5645e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f5645e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f5643c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.AbstractC0085a.AbstractC0086a
        public F.e.d.a.b.AbstractC0085a.AbstractC0086a b(long j8) {
            this.f5641a = j8;
            this.f5645e = (byte) (this.f5645e | 1);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0085a.AbstractC0086a
        public F.e.d.a.b.AbstractC0085a.AbstractC0086a c(String str) {
            if (str != null) {
                this.f5643c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // L0.F.e.d.a.b.AbstractC0085a.AbstractC0086a
        public F.e.d.a.b.AbstractC0085a.AbstractC0086a d(long j8) {
            this.f5642b = j8;
            this.f5645e = (byte) (this.f5645e | 2);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0085a.AbstractC0086a
        public F.e.d.a.b.AbstractC0085a.AbstractC0086a e(String str) {
            this.f5644d = str;
            return this;
        }
    }

    @Override // L0.F.e.d.a.b.AbstractC0085a
    public long b() {
        return this.f5637a;
    }

    @Override // L0.F.e.d.a.b.AbstractC0085a
    public String c() {
        return this.f5639c;
    }

    @Override // L0.F.e.d.a.b.AbstractC0085a
    public long d() {
        return this.f5638b;
    }

    @Override // L0.F.e.d.a.b.AbstractC0085a
    public String e() {
        return this.f5640d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0085a)) {
            return false;
        }
        F.e.d.a.b.AbstractC0085a abstractC0085a = (F.e.d.a.b.AbstractC0085a) obj;
        if (this.f5637a == abstractC0085a.b() && this.f5638b == abstractC0085a.d() && this.f5639c.equals(abstractC0085a.c())) {
            String str = this.f5640d;
            if (str == null) {
                if (abstractC0085a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0085a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5637a;
        long j9 = this.f5638b;
        int hashCode2 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f5639c.hashCode()) * 1000003;
        String str = this.f5640d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f5637a + ", size=" + this.f5638b + ", name=" + this.f5639c + ", uuid=" + this.f5640d + "}";
    }

    private o(long j8, long j9, String str, String str2) {
        this.f5637a = j8;
        this.f5638b = j9;
        this.f5639c = str;
        this.f5640d = str2;
    }
}
