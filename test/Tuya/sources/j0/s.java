package J0;

import J0.B;

/* loaded from: classes3.dex */
final class s extends B.e.d.a.b.AbstractC0082e.AbstractC0084b {

    /* renamed from: a, reason: collision with root package name */
    private final long f4635a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4636b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4637c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4638d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4639e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a {

        /* renamed from: a, reason: collision with root package name */
        private Long f4640a;

        /* renamed from: b, reason: collision with root package name */
        private String f4641b;

        /* renamed from: c, reason: collision with root package name */
        private String f4642c;

        /* renamed from: d, reason: collision with root package name */
        private Long f4643d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f4644e;

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b a() {
            String str = "";
            if (this.f4640a == null) {
                str = " pc";
            }
            if (this.f4641b == null) {
                str = str + " symbol";
            }
            if (this.f4643d == null) {
                str = str + " offset";
            }
            if (this.f4644e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f4640a.longValue(), this.f4641b, this.f4642c, this.f4643d.longValue(), this.f4644e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a b(String str) {
            this.f4642c = str;
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a c(int i8) {
            this.f4644e = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a d(long j8) {
            this.f4643d = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a e(long j8) {
            this.f4640a = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a
        public B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a f(String str) {
            if (str != null) {
                this.f4641b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b
    public String b() {
        return this.f4637c;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b
    public int c() {
        return this.f4639e;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b
    public long d() {
        return this.f4638d;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b
    public long e() {
        return this.f4635a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0082e.AbstractC0084b)) {
            return false;
        }
        B.e.d.a.b.AbstractC0082e.AbstractC0084b abstractC0084b = (B.e.d.a.b.AbstractC0082e.AbstractC0084b) obj;
        if (this.f4635a == abstractC0084b.e() && this.f4636b.equals(abstractC0084b.f()) && ((str = this.f4637c) != null ? str.equals(abstractC0084b.b()) : abstractC0084b.b() == null) && this.f4638d == abstractC0084b.d() && this.f4639e == abstractC0084b.c()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0084b
    public String f() {
        return this.f4636b;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f4635a;
        int hashCode2 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f4636b.hashCode()) * 1000003;
        String str = this.f4637c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        long j9 = this.f4638d;
        return this.f4639e ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f4635a + ", symbol=" + this.f4636b + ", file=" + this.f4637c + ", offset=" + this.f4638d + ", importance=" + this.f4639e + "}";
    }

    private s(long j8, String str, String str2, long j9, int i8) {
        this.f4635a = j8;
        this.f4636b = str;
        this.f4637c = str2;
        this.f4638d = j9;
        this.f4639e = i8;
    }
}
