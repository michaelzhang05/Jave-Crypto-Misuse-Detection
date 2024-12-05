package L0;

import L0.F;

/* loaded from: classes3.dex */
final class u extends F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f5691a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5692b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5693c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5694d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5695e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5696f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f5697a;

        /* renamed from: b, reason: collision with root package name */
        private int f5698b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5699c;

        /* renamed from: d, reason: collision with root package name */
        private int f5700d;

        /* renamed from: e, reason: collision with root package name */
        private long f5701e;

        /* renamed from: f, reason: collision with root package name */
        private long f5702f;

        /* renamed from: g, reason: collision with root package name */
        private byte f5703g;

        @Override // L0.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f5703g != 31) {
                StringBuilder sb = new StringBuilder();
                if ((this.f5703g & 1) == 0) {
                    sb.append(" batteryVelocity");
                }
                if ((this.f5703g & 2) == 0) {
                    sb.append(" proximityOn");
                }
                if ((this.f5703g & 4) == 0) {
                    sb.append(" orientation");
                }
                if ((this.f5703g & 8) == 0) {
                    sb.append(" ramUsed");
                }
                if ((this.f5703g & 16) == 0) {
                    sb.append(" diskUsed");
                }
                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
            }
            return new u(this.f5697a, this.f5698b, this.f5699c, this.f5700d, this.f5701e, this.f5702f);
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a b(Double d8) {
            this.f5697a = d8;
            return this;
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a c(int i8) {
            this.f5698b = i8;
            this.f5703g = (byte) (this.f5703g | 1);
            return this;
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a d(long j8) {
            this.f5702f = j8;
            this.f5703g = (byte) (this.f5703g | 16);
            return this;
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a e(int i8) {
            this.f5700d = i8;
            this.f5703g = (byte) (this.f5703g | 4);
            return this;
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a f(boolean z8) {
            this.f5699c = z8;
            this.f5703g = (byte) (this.f5703g | 2);
            return this;
        }

        @Override // L0.F.e.d.c.a
        public F.e.d.c.a g(long j8) {
            this.f5701e = j8;
            this.f5703g = (byte) (this.f5703g | 8);
            return this;
        }
    }

    @Override // L0.F.e.d.c
    public Double b() {
        return this.f5691a;
    }

    @Override // L0.F.e.d.c
    public int c() {
        return this.f5692b;
    }

    @Override // L0.F.e.d.c
    public long d() {
        return this.f5696f;
    }

    @Override // L0.F.e.d.c
    public int e() {
        return this.f5694d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d8 = this.f5691a;
        if (d8 != null ? d8.equals(cVar.b()) : cVar.b() == null) {
            if (this.f5692b == cVar.c() && this.f5693c == cVar.g() && this.f5694d == cVar.e() && this.f5695e == cVar.f() && this.f5696f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // L0.F.e.d.c
    public long f() {
        return this.f5695e;
    }

    @Override // L0.F.e.d.c
    public boolean g() {
        return this.f5693c;
    }

    public int hashCode() {
        int hashCode;
        int i8;
        Double d8 = this.f5691a;
        if (d8 == null) {
            hashCode = 0;
        } else {
            hashCode = d8.hashCode();
        }
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ this.f5692b) * 1000003;
        if (this.f5693c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i10 = (((i9 ^ i8) * 1000003) ^ this.f5694d) * 1000003;
        long j8 = this.f5695e;
        long j9 = this.f5696f;
        return ((i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f5691a + ", batteryVelocity=" + this.f5692b + ", proximityOn=" + this.f5693c + ", orientation=" + this.f5694d + ", ramUsed=" + this.f5695e + ", diskUsed=" + this.f5696f + "}";
    }

    private u(Double d8, int i8, boolean z8, int i9, long j8, long j9) {
        this.f5691a = d8;
        this.f5692b = i8;
        this.f5693c = z8;
        this.f5694d = i9;
        this.f5695e = j8;
        this.f5696f = j9;
    }
}
