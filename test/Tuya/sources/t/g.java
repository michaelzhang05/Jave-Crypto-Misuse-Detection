package t;

import java.util.List;
import t.m;

/* loaded from: classes3.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f38125a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38126b;

    /* renamed from: c, reason: collision with root package name */
    private final k f38127c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f38128d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38129e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38130f;

    /* renamed from: g, reason: collision with root package name */
    private final p f38131g;

    /* loaded from: classes3.dex */
    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f38132a;

        /* renamed from: b, reason: collision with root package name */
        private Long f38133b;

        /* renamed from: c, reason: collision with root package name */
        private k f38134c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f38135d;

        /* renamed from: e, reason: collision with root package name */
        private String f38136e;

        /* renamed from: f, reason: collision with root package name */
        private List f38137f;

        /* renamed from: g, reason: collision with root package name */
        private p f38138g;

        @Override // t.m.a
        public m a() {
            String str = "";
            if (this.f38132a == null) {
                str = " requestTimeMs";
            }
            if (this.f38133b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f38132a.longValue(), this.f38133b.longValue(), this.f38134c, this.f38135d, this.f38136e, this.f38137f, this.f38138g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.m.a
        public m.a b(k kVar) {
            this.f38134c = kVar;
            return this;
        }

        @Override // t.m.a
        public m.a c(List list) {
            this.f38137f = list;
            return this;
        }

        @Override // t.m.a
        m.a d(Integer num) {
            this.f38135d = num;
            return this;
        }

        @Override // t.m.a
        m.a e(String str) {
            this.f38136e = str;
            return this;
        }

        @Override // t.m.a
        public m.a f(p pVar) {
            this.f38138g = pVar;
            return this;
        }

        @Override // t.m.a
        public m.a g(long j8) {
            this.f38132a = Long.valueOf(j8);
            return this;
        }

        @Override // t.m.a
        public m.a h(long j8) {
            this.f38133b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.m
    public k b() {
        return this.f38127c;
    }

    @Override // t.m
    public List c() {
        return this.f38130f;
    }

    @Override // t.m
    public Integer d() {
        return this.f38128d;
    }

    @Override // t.m
    public String e() {
        return this.f38129e;
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
        if (this.f38125a == mVar.g() && this.f38126b == mVar.h() && ((kVar = this.f38127c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f38128d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f38129e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f38130f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f38131g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.m
    public p f() {
        return this.f38131g;
    }

    @Override // t.m
    public long g() {
        return this.f38125a;
    }

    @Override // t.m
    public long h() {
        return this.f38126b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f38125a;
        long j9 = this.f38126b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        k kVar = this.f38127c;
        int i9 = 0;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        Integer num = this.f38128d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str = this.f38129e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        List list = this.f38130f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        p pVar = this.f38131g;
        if (pVar != null) {
            i9 = pVar.hashCode();
        }
        return i13 ^ i9;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f38125a + ", requestUptimeMs=" + this.f38126b + ", clientInfo=" + this.f38127c + ", logSource=" + this.f38128d + ", logSourceName=" + this.f38129e + ", logEvents=" + this.f38130f + ", qosTier=" + this.f38131g + "}";
    }

    private g(long j8, long j9, k kVar, Integer num, String str, List list, p pVar) {
        this.f38125a = j8;
        this.f38126b = j9;
        this.f38127c = kVar;
        this.f38128d = num;
        this.f38129e = str;
        this.f38130f = list;
        this.f38131g = pVar;
    }
}
