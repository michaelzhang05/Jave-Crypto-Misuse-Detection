package J0;

import J0.B;

/* loaded from: classes3.dex */
final class t extends B.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f4645a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4646b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4647c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4648d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4649e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4650f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f4651a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4652b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f4653c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4654d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4655e;

        /* renamed from: f, reason: collision with root package name */
        private Long f4656f;

        @Override // J0.B.e.d.c.a
        public B.e.d.c a() {
            String str = "";
            if (this.f4652b == null) {
                str = " batteryVelocity";
            }
            if (this.f4653c == null) {
                str = str + " proximityOn";
            }
            if (this.f4654d == null) {
                str = str + " orientation";
            }
            if (this.f4655e == null) {
                str = str + " ramUsed";
            }
            if (this.f4656f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f4651a, this.f4652b.intValue(), this.f4653c.booleanValue(), this.f4654d.intValue(), this.f4655e.longValue(), this.f4656f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a b(Double d8) {
            this.f4651a = d8;
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a c(int i8) {
            this.f4652b = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a d(long j8) {
            this.f4656f = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a e(int i8) {
            this.f4654d = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a f(boolean z8) {
            this.f4653c = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a g(long j8) {
            this.f4655e = Long.valueOf(j8);
            return this;
        }
    }

    @Override // J0.B.e.d.c
    public Double b() {
        return this.f4645a;
    }

    @Override // J0.B.e.d.c
    public int c() {
        return this.f4646b;
    }

    @Override // J0.B.e.d.c
    public long d() {
        return this.f4650f;
    }

    @Override // J0.B.e.d.c
    public int e() {
        return this.f4648d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.c)) {
            return false;
        }
        B.e.d.c cVar = (B.e.d.c) obj;
        Double d8 = this.f4645a;
        if (d8 != null ? d8.equals(cVar.b()) : cVar.b() == null) {
            if (this.f4646b == cVar.c() && this.f4647c == cVar.g() && this.f4648d == cVar.e() && this.f4649e == cVar.f() && this.f4650f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.e.d.c
    public long f() {
        return this.f4649e;
    }

    @Override // J0.B.e.d.c
    public boolean g() {
        return this.f4647c;
    }

    public int hashCode() {
        int hashCode;
        int i8;
        Double d8 = this.f4645a;
        if (d8 == null) {
            hashCode = 0;
        } else {
            hashCode = d8.hashCode();
        }
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ this.f4646b) * 1000003;
        if (this.f4647c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i10 = (((i9 ^ i8) * 1000003) ^ this.f4648d) * 1000003;
        long j8 = this.f4649e;
        long j9 = this.f4650f;
        return ((i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f4645a + ", batteryVelocity=" + this.f4646b + ", proximityOn=" + this.f4647c + ", orientation=" + this.f4648d + ", ramUsed=" + this.f4649e + ", diskUsed=" + this.f4650f + "}";
    }

    private t(Double d8, int i8, boolean z8, int i9, long j8, long j9) {
        this.f4645a = d8;
        this.f4646b = i8;
        this.f4647c = z8;
        this.f4648d = i9;
        this.f4649e = j8;
        this.f4650f = j9;
    }
}
