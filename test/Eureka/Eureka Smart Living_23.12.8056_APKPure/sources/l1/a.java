package l1;

import l1.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private final long f7271b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7272c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7273d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7274e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7275f;

    /* loaded from: classes.dex */
    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f7276a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f7277b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7278c;

        /* renamed from: d, reason: collision with root package name */
        private Long f7279d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f7280e;

        @Override // l1.e.a
        e a() {
            String str = "";
            if (this.f7276a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f7277b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f7278c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f7279d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f7280e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f7276a.longValue(), this.f7277b.intValue(), this.f7278c.intValue(), this.f7279d.longValue(), this.f7280e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l1.e.a
        e.a b(int i6) {
            this.f7278c = Integer.valueOf(i6);
            return this;
        }

        @Override // l1.e.a
        e.a c(long j6) {
            this.f7279d = Long.valueOf(j6);
            return this;
        }

        @Override // l1.e.a
        e.a d(int i6) {
            this.f7277b = Integer.valueOf(i6);
            return this;
        }

        @Override // l1.e.a
        e.a e(int i6) {
            this.f7280e = Integer.valueOf(i6);
            return this;
        }

        @Override // l1.e.a
        e.a f(long j6) {
            this.f7276a = Long.valueOf(j6);
            return this;
        }
    }

    private a(long j6, int i6, int i7, long j7, int i8) {
        this.f7271b = j6;
        this.f7272c = i6;
        this.f7273d = i7;
        this.f7274e = j7;
        this.f7275f = i8;
    }

    @Override // l1.e
    int b() {
        return this.f7273d;
    }

    @Override // l1.e
    long c() {
        return this.f7274e;
    }

    @Override // l1.e
    int d() {
        return this.f7272c;
    }

    @Override // l1.e
    int e() {
        return this.f7275f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7271b == eVar.f() && this.f7272c == eVar.d() && this.f7273d == eVar.b() && this.f7274e == eVar.c() && this.f7275f == eVar.e();
    }

    @Override // l1.e
    long f() {
        return this.f7271b;
    }

    public int hashCode() {
        long j6 = this.f7271b;
        int i6 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f7272c) * 1000003) ^ this.f7273d) * 1000003;
        long j7 = this.f7274e;
        return this.f7275f ^ ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f7271b + ", loadBatchSize=" + this.f7272c + ", criticalSectionEnterTimeoutMs=" + this.f7273d + ", eventCleanUpAge=" + this.f7274e + ", maxBlobByteSizePerRow=" + this.f7275f + "}";
    }
}
