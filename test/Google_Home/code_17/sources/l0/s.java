package L0;

import L0.F;

/* loaded from: classes3.dex */
final class s extends F.e.d.a.b.AbstractC0091e.AbstractC0093b {

    /* renamed from: a, reason: collision with root package name */
    private final long f5671a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5672b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5673c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5674d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5675e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a {

        /* renamed from: a, reason: collision with root package name */
        private long f5676a;

        /* renamed from: b, reason: collision with root package name */
        private String f5677b;

        /* renamed from: c, reason: collision with root package name */
        private String f5678c;

        /* renamed from: d, reason: collision with root package name */
        private long f5679d;

        /* renamed from: e, reason: collision with root package name */
        private int f5680e;

        /* renamed from: f, reason: collision with root package name */
        private byte f5681f;

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b a() {
            String str;
            if (this.f5681f == 7 && (str = this.f5677b) != null) {
                return new s(this.f5676a, str, this.f5678c, this.f5679d, this.f5680e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5681f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f5677b == null) {
                sb.append(" symbol");
            }
            if ((this.f5681f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f5681f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a b(String str) {
            this.f5678c = str;
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a c(int i8) {
            this.f5680e = i8;
            this.f5681f = (byte) (this.f5681f | 4);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a d(long j8) {
            this.f5679d = j8;
            this.f5681f = (byte) (this.f5681f | 2);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a e(long j8) {
            this.f5676a = j8;
            this.f5681f = (byte) (this.f5681f | 1);
            return this;
        }

        @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a
        public F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a f(String str) {
            if (str != null) {
                this.f5677b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b
    public String b() {
        return this.f5673c;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b
    public int c() {
        return this.f5675e;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b
    public long d() {
        return this.f5674d;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b
    public long e() {
        return this.f5671a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0091e.AbstractC0093b)) {
            return false;
        }
        F.e.d.a.b.AbstractC0091e.AbstractC0093b abstractC0093b = (F.e.d.a.b.AbstractC0091e.AbstractC0093b) obj;
        if (this.f5671a == abstractC0093b.e() && this.f5672b.equals(abstractC0093b.f()) && ((str = this.f5673c) != null ? str.equals(abstractC0093b.b()) : abstractC0093b.b() == null) && this.f5674d == abstractC0093b.d() && this.f5675e == abstractC0093b.c()) {
            return true;
        }
        return false;
    }

    @Override // L0.F.e.d.a.b.AbstractC0091e.AbstractC0093b
    public String f() {
        return this.f5672b;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5671a;
        int hashCode2 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f5672b.hashCode()) * 1000003;
        String str = this.f5673c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        long j9 = this.f5674d;
        return this.f5675e ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f5671a + ", symbol=" + this.f5672b + ", file=" + this.f5673c + ", offset=" + this.f5674d + ", importance=" + this.f5675e + "}";
    }

    private s(long j8, String str, String str2, long j9, int i8) {
        this.f5671a = j8;
        this.f5672b = str;
        this.f5673c = str2;
        this.f5674d = j9;
        this.f5675e = i8;
    }
}
