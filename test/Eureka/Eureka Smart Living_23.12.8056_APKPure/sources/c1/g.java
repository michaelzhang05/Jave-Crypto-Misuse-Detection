package c1;

import c1.m;
import java.util.List;

/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f3942a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3943b;

    /* renamed from: c, reason: collision with root package name */
    private final k f3944c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f3945d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3946e;

    /* renamed from: f, reason: collision with root package name */
    private final List f3947f;

    /* renamed from: g, reason: collision with root package name */
    private final p f3948g;

    /* loaded from: classes.dex */
    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f3949a;

        /* renamed from: b, reason: collision with root package name */
        private Long f3950b;

        /* renamed from: c, reason: collision with root package name */
        private k f3951c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f3952d;

        /* renamed from: e, reason: collision with root package name */
        private String f3953e;

        /* renamed from: f, reason: collision with root package name */
        private List f3954f;

        /* renamed from: g, reason: collision with root package name */
        private p f3955g;

        @Override // c1.m.a
        public m a() {
            String str = "";
            if (this.f3949a == null) {
                str = " requestTimeMs";
            }
            if (this.f3950b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f3949a.longValue(), this.f3950b.longValue(), this.f3951c, this.f3952d, this.f3953e, this.f3954f, this.f3955g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c1.m.a
        public m.a b(k kVar) {
            this.f3951c = kVar;
            return this;
        }

        @Override // c1.m.a
        public m.a c(List list) {
            this.f3954f = list;
            return this;
        }

        @Override // c1.m.a
        m.a d(Integer num) {
            this.f3952d = num;
            return this;
        }

        @Override // c1.m.a
        m.a e(String str) {
            this.f3953e = str;
            return this;
        }

        @Override // c1.m.a
        public m.a f(p pVar) {
            this.f3955g = pVar;
            return this;
        }

        @Override // c1.m.a
        public m.a g(long j6) {
            this.f3949a = Long.valueOf(j6);
            return this;
        }

        @Override // c1.m.a
        public m.a h(long j6) {
            this.f3950b = Long.valueOf(j6);
            return this;
        }
    }

    private g(long j6, long j7, k kVar, Integer num, String str, List list, p pVar) {
        this.f3942a = j6;
        this.f3943b = j7;
        this.f3944c = kVar;
        this.f3945d = num;
        this.f3946e = str;
        this.f3947f = list;
        this.f3948g = pVar;
    }

    @Override // c1.m
    public k b() {
        return this.f3944c;
    }

    @Override // c1.m
    public List c() {
        return this.f3947f;
    }

    @Override // c1.m
    public Integer d() {
        return this.f3945d;
    }

    @Override // c1.m
    public String e() {
        return this.f3946e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3942a == mVar.g() && this.f3943b == mVar.h() && ((kVar = this.f3944c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f3945d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f3946e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f3947f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f3948g;
            p f6 = mVar.f();
            if (pVar == null) {
                if (f6 == null) {
                    return true;
                }
            } else if (pVar.equals(f6)) {
                return true;
            }
        }
        return false;
    }

    @Override // c1.m
    public p f() {
        return this.f3948g;
    }

    @Override // c1.m
    public long g() {
        return this.f3942a;
    }

    @Override // c1.m
    public long h() {
        return this.f3943b;
    }

    public int hashCode() {
        long j6 = this.f3942a;
        long j7 = this.f3943b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        k kVar = this.f3944c;
        int hashCode = (i6 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f3945d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3946e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f3947f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f3948g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f3942a + ", requestUptimeMs=" + this.f3943b + ", clientInfo=" + this.f3944c + ", logSource=" + this.f3945d + ", logSourceName=" + this.f3946e + ", logEvents=" + this.f3947f + ", qosTier=" + this.f3948g + "}";
    }
}
