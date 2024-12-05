package t;

import java.util.Arrays;
import t.l;

/* loaded from: classes3.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f38111a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38112b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38113c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f38114d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38115e;

    /* renamed from: f, reason: collision with root package name */
    private final long f38116f;

    /* renamed from: g, reason: collision with root package name */
    private final o f38117g;

    /* loaded from: classes3.dex */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f38118a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f38119b;

        /* renamed from: c, reason: collision with root package name */
        private Long f38120c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38121d;

        /* renamed from: e, reason: collision with root package name */
        private String f38122e;

        /* renamed from: f, reason: collision with root package name */
        private Long f38123f;

        /* renamed from: g, reason: collision with root package name */
        private o f38124g;

        @Override // t.l.a
        public l a() {
            String str = "";
            if (this.f38118a == null) {
                str = " eventTimeMs";
            }
            if (this.f38120c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f38123f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f38118a.longValue(), this.f38119b, this.f38120c.longValue(), this.f38121d, this.f38122e, this.f38123f.longValue(), this.f38124g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.l.a
        public l.a b(Integer num) {
            this.f38119b = num;
            return this;
        }

        @Override // t.l.a
        public l.a c(long j8) {
            this.f38118a = Long.valueOf(j8);
            return this;
        }

        @Override // t.l.a
        public l.a d(long j8) {
            this.f38120c = Long.valueOf(j8);
            return this;
        }

        @Override // t.l.a
        public l.a e(o oVar) {
            this.f38124g = oVar;
            return this;
        }

        @Override // t.l.a
        l.a f(byte[] bArr) {
            this.f38121d = bArr;
            return this;
        }

        @Override // t.l.a
        l.a g(String str) {
            this.f38122e = str;
            return this;
        }

        @Override // t.l.a
        public l.a h(long j8) {
            this.f38123f = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.l
    public Integer b() {
        return this.f38112b;
    }

    @Override // t.l
    public long c() {
        return this.f38111a;
    }

    @Override // t.l
    public long d() {
        return this.f38113c;
    }

    @Override // t.l
    public o e() {
        return this.f38117g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f8;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f38111a == lVar.c() && ((num = this.f38112b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f38113c == lVar.d()) {
            byte[] bArr = this.f38114d;
            if (lVar instanceof f) {
                f8 = ((f) lVar).f38114d;
            } else {
                f8 = lVar.f();
            }
            if (Arrays.equals(bArr, f8) && ((str = this.f38115e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f38116f == lVar.h()) {
                o oVar = this.f38117g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t.l
    public byte[] f() {
        return this.f38114d;
    }

    @Override // t.l
    public String g() {
        return this.f38115e;
    }

    @Override // t.l
    public long h() {
        return this.f38116f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j8 = this.f38111a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f38112b;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j9 = this.f38113c;
        int hashCode3 = (((((i8 ^ hashCode) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f38114d)) * 1000003;
        String str = this.f38115e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j10 = this.f38116f;
        int i10 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        o oVar = this.f38117g;
        if (oVar != null) {
            i9 = oVar.hashCode();
        }
        return i10 ^ i9;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f38111a + ", eventCode=" + this.f38112b + ", eventUptimeMs=" + this.f38113c + ", sourceExtension=" + Arrays.toString(this.f38114d) + ", sourceExtensionJsonProto3=" + this.f38115e + ", timezoneOffsetSeconds=" + this.f38116f + ", networkConnectionInfo=" + this.f38117g + "}";
    }

    private f(long j8, Integer num, long j9, byte[] bArr, String str, long j10, o oVar) {
        this.f38111a = j8;
        this.f38112b = num;
        this.f38113c = j9;
        this.f38114d = bArr;
        this.f38115e = str;
        this.f38116f = j10;
        this.f38117g = oVar;
    }
}
