package C;

import C.AbstractC1011e;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1007a extends AbstractC1011e {

    /* renamed from: b, reason: collision with root package name */
    private final long f1127b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1128c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1129d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1130e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1131f;

    /* renamed from: C.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC1011e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f1132a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f1133b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1134c;

        /* renamed from: d, reason: collision with root package name */
        private Long f1135d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f1136e;

        @Override // C.AbstractC1011e.a
        AbstractC1011e a() {
            String str = "";
            if (this.f1132a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f1133b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f1134c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f1135d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f1136e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1007a(this.f1132a.longValue(), this.f1133b.intValue(), this.f1134c.intValue(), this.f1135d.longValue(), this.f1136e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C.AbstractC1011e.a
        AbstractC1011e.a b(int i8) {
            this.f1134c = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1011e.a
        AbstractC1011e.a c(long j8) {
            this.f1135d = Long.valueOf(j8);
            return this;
        }

        @Override // C.AbstractC1011e.a
        AbstractC1011e.a d(int i8) {
            this.f1133b = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1011e.a
        AbstractC1011e.a e(int i8) {
            this.f1136e = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC1011e.a
        AbstractC1011e.a f(long j8) {
            this.f1132a = Long.valueOf(j8);
            return this;
        }
    }

    @Override // C.AbstractC1011e
    int b() {
        return this.f1129d;
    }

    @Override // C.AbstractC1011e
    long c() {
        return this.f1130e;
    }

    @Override // C.AbstractC1011e
    int d() {
        return this.f1128c;
    }

    @Override // C.AbstractC1011e
    int e() {
        return this.f1131f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1011e)) {
            return false;
        }
        AbstractC1011e abstractC1011e = (AbstractC1011e) obj;
        if (this.f1127b == abstractC1011e.f() && this.f1128c == abstractC1011e.d() && this.f1129d == abstractC1011e.b() && this.f1130e == abstractC1011e.c() && this.f1131f == abstractC1011e.e()) {
            return true;
        }
        return false;
    }

    @Override // C.AbstractC1011e
    long f() {
        return this.f1127b;
    }

    public int hashCode() {
        long j8 = this.f1127b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f1128c) * 1000003) ^ this.f1129d) * 1000003;
        long j9 = this.f1130e;
        return this.f1131f ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1127b + ", loadBatchSize=" + this.f1128c + ", criticalSectionEnterTimeoutMs=" + this.f1129d + ", eventCleanUpAge=" + this.f1130e + ", maxBlobByteSizePerRow=" + this.f1131f + "}";
    }

    private C1007a(long j8, int i8, int i9, long j9, int i10) {
        this.f1127b = j8;
        this.f1128c = i8;
        this.f1129d = i9;
        this.f1130e = j9;
        this.f1131f = i10;
    }
}
