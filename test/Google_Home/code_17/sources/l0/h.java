package L0;

import L0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class h extends F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5543a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5544b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5545c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5546d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f5547e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5548f;

    /* renamed from: g, reason: collision with root package name */
    private final F.e.a f5549g;

    /* renamed from: h, reason: collision with root package name */
    private final F.e.f f5550h;

    /* renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0098e f5551i;

    /* renamed from: j, reason: collision with root package name */
    private final F.e.c f5552j;

    /* renamed from: k, reason: collision with root package name */
    private final List f5553k;

    /* renamed from: l, reason: collision with root package name */
    private final int f5554l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f5555a;

        /* renamed from: b, reason: collision with root package name */
        private String f5556b;

        /* renamed from: c, reason: collision with root package name */
        private String f5557c;

        /* renamed from: d, reason: collision with root package name */
        private long f5558d;

        /* renamed from: e, reason: collision with root package name */
        private Long f5559e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5560f;

        /* renamed from: g, reason: collision with root package name */
        private F.e.a f5561g;

        /* renamed from: h, reason: collision with root package name */
        private F.e.f f5562h;

        /* renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0098e f5563i;

        /* renamed from: j, reason: collision with root package name */
        private F.e.c f5564j;

        /* renamed from: k, reason: collision with root package name */
        private List f5565k;

        /* renamed from: l, reason: collision with root package name */
        private int f5566l;

        /* renamed from: m, reason: collision with root package name */
        private byte f5567m;

        @Override // L0.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f5567m == 7 && (str = this.f5555a) != null && (str2 = this.f5556b) != null && (aVar = this.f5561g) != null) {
                return new h(str, str2, this.f5557c, this.f5558d, this.f5559e, this.f5560f, aVar, this.f5562h, this.f5563i, this.f5564j, this.f5565k, this.f5566l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5555a == null) {
                sb.append(" generator");
            }
            if (this.f5556b == null) {
                sb.append(" identifier");
            }
            if ((this.f5567m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f5567m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f5561g == null) {
                sb.append(" app");
            }
            if ((this.f5567m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar != null) {
                this.f5561g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // L0.F.e.b
        public F.e.b c(String str) {
            this.f5557c = str;
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b d(boolean z8) {
            this.f5560f = z8;
            this.f5567m = (byte) (this.f5567m | 2);
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f5564j = cVar;
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b f(Long l8) {
            this.f5559e = l8;
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b g(List list) {
            this.f5565k = list;
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b h(String str) {
            if (str != null) {
                this.f5555a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // L0.F.e.b
        public F.e.b i(int i8) {
            this.f5566l = i8;
            this.f5567m = (byte) (this.f5567m | 4);
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b j(String str) {
            if (str != null) {
                this.f5556b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // L0.F.e.b
        public F.e.b l(F.e.AbstractC0098e abstractC0098e) {
            this.f5563i = abstractC0098e;
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b m(long j8) {
            this.f5558d = j8;
            this.f5567m = (byte) (this.f5567m | 1);
            return this;
        }

        @Override // L0.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f5562h = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e eVar) {
            this.f5555a = eVar.g();
            this.f5556b = eVar.i();
            this.f5557c = eVar.c();
            this.f5558d = eVar.l();
            this.f5559e = eVar.e();
            this.f5560f = eVar.n();
            this.f5561g = eVar.b();
            this.f5562h = eVar.m();
            this.f5563i = eVar.k();
            this.f5564j = eVar.d();
            this.f5565k = eVar.f();
            this.f5566l = eVar.h();
            this.f5567m = (byte) 7;
        }
    }

    @Override // L0.F.e
    public F.e.a b() {
        return this.f5549g;
    }

    @Override // L0.F.e
    public String c() {
        return this.f5545c;
    }

    @Override // L0.F.e
    public F.e.c d() {
        return this.f5552j;
    }

    @Override // L0.F.e
    public Long e() {
        return this.f5547e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l8;
        F.e.f fVar;
        F.e.AbstractC0098e abstractC0098e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar = (F.e) obj;
        if (this.f5543a.equals(eVar.g()) && this.f5544b.equals(eVar.i()) && ((str = this.f5545c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f5546d == eVar.l() && ((l8 = this.f5547e) != null ? l8.equals(eVar.e()) : eVar.e() == null) && this.f5548f == eVar.n() && this.f5549g.equals(eVar.b()) && ((fVar = this.f5550h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0098e = this.f5551i) != null ? abstractC0098e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f5552j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f5553k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f5554l == eVar.h()) {
            return true;
        }
        return false;
    }

    @Override // L0.F.e
    public List f() {
        return this.f5553k;
    }

    @Override // L0.F.e
    public String g() {
        return this.f5543a;
    }

    @Override // L0.F.e
    public int h() {
        return this.f5554l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i8;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f5543a.hashCode() ^ 1000003) * 1000003) ^ this.f5544b.hashCode()) * 1000003;
        String str = this.f5545c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f5546d;
        int i10 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l8 = this.f5547e;
        if (l8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l8.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        if (this.f5548f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int hashCode7 = (((i11 ^ i8) * 1000003) ^ this.f5549g.hashCode()) * 1000003;
        F.e.f fVar = this.f5550h;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode3) * 1000003;
        F.e.AbstractC0098e abstractC0098e = this.f5551i;
        if (abstractC0098e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0098e.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        F.e.c cVar = this.f5552j;
        if (cVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = cVar.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        List list = this.f5553k;
        if (list != null) {
            i9 = list.hashCode();
        }
        return ((i14 ^ i9) * 1000003) ^ this.f5554l;
    }

    @Override // L0.F.e
    public String i() {
        return this.f5544b;
    }

    @Override // L0.F.e
    public F.e.AbstractC0098e k() {
        return this.f5551i;
    }

    @Override // L0.F.e
    public long l() {
        return this.f5546d;
    }

    @Override // L0.F.e
    public F.e.f m() {
        return this.f5550h;
    }

    @Override // L0.F.e
    public boolean n() {
        return this.f5548f;
    }

    @Override // L0.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f5543a + ", identifier=" + this.f5544b + ", appQualitySessionId=" + this.f5545c + ", startedAt=" + this.f5546d + ", endedAt=" + this.f5547e + ", crashed=" + this.f5548f + ", app=" + this.f5549g + ", user=" + this.f5550h + ", os=" + this.f5551i + ", device=" + this.f5552j + ", events=" + this.f5553k + ", generatorType=" + this.f5554l + "}";
    }

    private h(String str, String str2, String str3, long j8, Long l8, boolean z8, F.e.a aVar, F.e.f fVar, F.e.AbstractC0098e abstractC0098e, F.e.c cVar, List list, int i8) {
        this.f5543a = str;
        this.f5544b = str2;
        this.f5545c = str3;
        this.f5546d = j8;
        this.f5547e = l8;
        this.f5548f = z8;
        this.f5549g = aVar;
        this.f5550h = fVar;
        this.f5551i = abstractC0098e;
        this.f5552j = cVar;
        this.f5553k = list;
        this.f5554l = i8;
    }
}
