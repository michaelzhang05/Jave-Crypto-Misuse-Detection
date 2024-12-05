package c1;

import c1.l;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f3928a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f3929b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3930c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f3931d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3932e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3933f;

    /* renamed from: g, reason: collision with root package name */
    private final o f3934g;

    /* loaded from: classes.dex */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f3935a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f3936b;

        /* renamed from: c, reason: collision with root package name */
        private Long f3937c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f3938d;

        /* renamed from: e, reason: collision with root package name */
        private String f3939e;

        /* renamed from: f, reason: collision with root package name */
        private Long f3940f;

        /* renamed from: g, reason: collision with root package name */
        private o f3941g;

        @Override // c1.l.a
        public l a() {
            String str = "";
            if (this.f3935a == null) {
                str = " eventTimeMs";
            }
            if (this.f3937c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f3940f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f3935a.longValue(), this.f3936b, this.f3937c.longValue(), this.f3938d, this.f3939e, this.f3940f.longValue(), this.f3941g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c1.l.a
        public l.a b(Integer num) {
            this.f3936b = num;
            return this;
        }

        @Override // c1.l.a
        public l.a c(long j6) {
            this.f3935a = Long.valueOf(j6);
            return this;
        }

        @Override // c1.l.a
        public l.a d(long j6) {
            this.f3937c = Long.valueOf(j6);
            return this;
        }

        @Override // c1.l.a
        public l.a e(o oVar) {
            this.f3941g = oVar;
            return this;
        }

        @Override // c1.l.a
        l.a f(byte[] bArr) {
            this.f3938d = bArr;
            return this;
        }

        @Override // c1.l.a
        l.a g(String str) {
            this.f3939e = str;
            return this;
        }

        @Override // c1.l.a
        public l.a h(long j6) {
            this.f3940f = Long.valueOf(j6);
            return this;
        }
    }

    private f(long j6, Integer num, long j7, byte[] bArr, String str, long j8, o oVar) {
        this.f3928a = j6;
        this.f3929b = num;
        this.f3930c = j7;
        this.f3931d = bArr;
        this.f3932e = str;
        this.f3933f = j8;
        this.f3934g = oVar;
    }

    @Override // c1.l
    public Integer b() {
        return this.f3929b;
    }

    @Override // c1.l
    public long c() {
        return this.f3928a;
    }

    @Override // c1.l
    public long d() {
        return this.f3930c;
    }

    @Override // c1.l
    public o e() {
        return this.f3934g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3928a == lVar.c() && ((num = this.f3929b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f3930c == lVar.d()) {
            if (Arrays.equals(this.f3931d, lVar instanceof f ? ((f) lVar).f3931d : lVar.f()) && ((str = this.f3932e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f3933f == lVar.h()) {
                o oVar = this.f3934g;
                o e6 = lVar.e();
                if (oVar == null) {
                    if (e6 == null) {
                        return true;
                    }
                } else if (oVar.equals(e6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c1.l
    public byte[] f() {
        return this.f3931d;
    }

    @Override // c1.l
    public String g() {
        return this.f3932e;
    }

    @Override // c1.l
    public long h() {
        return this.f3933f;
    }

    public int hashCode() {
        long j6 = this.f3928a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f3929b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j7 = this.f3930c;
        int hashCode2 = (((((i6 ^ hashCode) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3931d)) * 1000003;
        String str = this.f3932e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j8 = this.f3933f;
        int i7 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        o oVar = this.f3934g;
        return i7 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f3928a + ", eventCode=" + this.f3929b + ", eventUptimeMs=" + this.f3930c + ", sourceExtension=" + Arrays.toString(this.f3931d) + ", sourceExtensionJsonProto3=" + this.f3932e + ", timezoneOffsetSeconds=" + this.f3933f + ", networkConnectionInfo=" + this.f3934g + "}";
    }
}
