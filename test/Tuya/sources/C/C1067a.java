package C;

import C.AbstractC1071e;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1067a extends AbstractC1071e {

    /* renamed from: b, reason: collision with root package name */
    private final long f1116b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1117c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1118d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1119e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1120f;

    /* renamed from: C.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC1071e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f1121a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f1122b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1123c;

        /* renamed from: d, reason: collision with root package name */
        private Long f1124d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f1125e;

        @Override // C.AbstractC1071e.a
        AbstractC1071e a() {
            String str = "";
            if (this.f1121a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f1122b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f1123c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f1124d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f1125e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1067a(this.f1121a.longValue(), this.f1122b.intValue(), this.f1123c.intValue(), this.f1124d.longValue(), this.f1125e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C.AbstractC1071e.a
        AbstractC1071e.a b(int i8) {
            this.f1123c = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1071e.a
        AbstractC1071e.a c(long j8) {
            this.f1124d = Long.valueOf(j8);
            return this;
        }

        @Override // C.AbstractC1071e.a
        AbstractC1071e.a d(int i8) {
            this.f1122b = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1071e.a
        AbstractC1071e.a e(int i8) {
            this.f1125e = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1071e.a
        AbstractC1071e.a f(long j8) {
            this.f1121a = Long.valueOf(j8);
            return this;
        }
    }

    @Override // C.AbstractC1071e
    int b() {
        return this.f1118d;
    }

    @Override // C.AbstractC1071e
    long c() {
        return this.f1119e;
    }

    @Override // C.AbstractC1071e
    int d() {
        return this.f1117c;
    }

    @Override // C.AbstractC1071e
    int e() {
        return this.f1120f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1071e)) {
            return false;
        }
        AbstractC1071e abstractC1071e = (AbstractC1071e) obj;
        if (this.f1116b == abstractC1071e.f() && this.f1117c == abstractC1071e.d() && this.f1118d == abstractC1071e.b() && this.f1119e == abstractC1071e.c() && this.f1120f == abstractC1071e.e()) {
            return true;
        }
        return false;
    }

    @Override // C.AbstractC1071e
    long f() {
        return this.f1116b;
    }

    public int hashCode() {
        long j8 = this.f1116b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f1117c) * 1000003) ^ this.f1118d) * 1000003;
        long j9 = this.f1119e;
        return this.f1120f ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1116b + ", loadBatchSize=" + this.f1117c + ", criticalSectionEnterTimeoutMs=" + this.f1118d + ", eventCleanUpAge=" + this.f1119e + ", maxBlobByteSizePerRow=" + this.f1120f + "}";
    }

    private C1067a(long j8, int i8, int i9, long j9, int i10) {
        this.f1116b = j8;
        this.f1117c = i8;
        this.f1118d = i9;
        this.f1119e = j9;
        this.f1120f = i10;
    }
}
