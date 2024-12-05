package t;

import java.util.List;
import t.u;

/* loaded from: classes3.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f39451a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39452b;

    /* renamed from: c, reason: collision with root package name */
    private final o f39453c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f39454d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39455e;

    /* renamed from: f, reason: collision with root package name */
    private final List f39456f;

    /* renamed from: g, reason: collision with root package name */
    private final x f39457g;

    /* loaded from: classes3.dex */
    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f39458a;

        /* renamed from: b, reason: collision with root package name */
        private Long f39459b;

        /* renamed from: c, reason: collision with root package name */
        private o f39460c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f39461d;

        /* renamed from: e, reason: collision with root package name */
        private String f39462e;

        /* renamed from: f, reason: collision with root package name */
        private List f39463f;

        /* renamed from: g, reason: collision with root package name */
        private x f39464g;

        @Override // t.u.a
        public u a() {
            String str = "";
            if (this.f39458a == null) {
                str = " requestTimeMs";
            }
            if (this.f39459b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f39458a.longValue(), this.f39459b.longValue(), this.f39460c, this.f39461d, this.f39462e, this.f39463f, this.f39464g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.u.a
        public u.a b(o oVar) {
            this.f39460c = oVar;
            return this;
        }

        @Override // t.u.a
        public u.a c(List list) {
            this.f39463f = list;
            return this;
        }

        @Override // t.u.a
        u.a d(Integer num) {
            this.f39461d = num;
            return this;
        }

        @Override // t.u.a
        u.a e(String str) {
            this.f39462e = str;
            return this;
        }

        @Override // t.u.a
        public u.a f(x xVar) {
            this.f39464g = xVar;
            return this;
        }

        @Override // t.u.a
        public u.a g(long j8) {
            this.f39458a = Long.valueOf(j8);
            return this;
        }

        @Override // t.u.a
        public u.a h(long j8) {
            this.f39459b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.u
    public o b() {
        return this.f39453c;
    }

    @Override // t.u
    public List c() {
        return this.f39456f;
    }

    @Override // t.u
    public Integer d() {
        return this.f39454d;
    }

    @Override // t.u
    public String e() {
        return this.f39455e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f39451a == uVar.g() && this.f39452b == uVar.h() && ((oVar = this.f39453c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f39454d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f39455e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f39456f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f39457g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.u
    public x f() {
        return this.f39457g;
    }

    @Override // t.u
    public long g() {
        return this.f39451a;
    }

    @Override // t.u
    public long h() {
        return this.f39452b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f39451a;
        long j9 = this.f39452b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        o oVar = this.f39453c;
        int i9 = 0;
        if (oVar == null) {
            hashCode = 0;
        } else {
            hashCode = oVar.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        Integer num = this.f39454d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str = this.f39455e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        List list = this.f39456f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        x xVar = this.f39457g;
        if (xVar != null) {
            i9 = xVar.hashCode();
        }
        return i13 ^ i9;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f39451a + ", requestUptimeMs=" + this.f39452b + ", clientInfo=" + this.f39453c + ", logSource=" + this.f39454d + ", logSourceName=" + this.f39455e + ", logEvents=" + this.f39456f + ", qosTier=" + this.f39457g + "}";
    }

    private k(long j8, long j9, o oVar, Integer num, String str, List list, x xVar) {
        this.f39451a = j8;
        this.f39452b = j9;
        this.f39453c = oVar;
        this.f39454d = num;
        this.f39455e = str;
        this.f39456f = list;
        this.f39457g = xVar;
    }
}
