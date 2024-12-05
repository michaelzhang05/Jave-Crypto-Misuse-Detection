package J0;

import J0.B;

/* loaded from: classes3.dex */
final class h extends B.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4521a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4522b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4523c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4524d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f4525e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4526f;

    /* renamed from: g, reason: collision with root package name */
    private final B.e.a f4527g;

    /* renamed from: h, reason: collision with root package name */
    private final B.e.f f4528h;

    /* renamed from: i, reason: collision with root package name */
    private final B.e.AbstractC0087e f4529i;

    /* renamed from: j, reason: collision with root package name */
    private final B.e.c f4530j;

    /* renamed from: k, reason: collision with root package name */
    private final C f4531k;

    /* renamed from: l, reason: collision with root package name */
    private final int f4532l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f4533a;

        /* renamed from: b, reason: collision with root package name */
        private String f4534b;

        /* renamed from: c, reason: collision with root package name */
        private String f4535c;

        /* renamed from: d, reason: collision with root package name */
        private Long f4536d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4537e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f4538f;

        /* renamed from: g, reason: collision with root package name */
        private B.e.a f4539g;

        /* renamed from: h, reason: collision with root package name */
        private B.e.f f4540h;

        /* renamed from: i, reason: collision with root package name */
        private B.e.AbstractC0087e f4541i;

        /* renamed from: j, reason: collision with root package name */
        private B.e.c f4542j;

        /* renamed from: k, reason: collision with root package name */
        private C f4543k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f4544l;

        @Override // J0.B.e.b
        public B.e a() {
            String str = "";
            if (this.f4533a == null) {
                str = " generator";
            }
            if (this.f4534b == null) {
                str = str + " identifier";
            }
            if (this.f4536d == null) {
                str = str + " startedAt";
            }
            if (this.f4538f == null) {
                str = str + " crashed";
            }
            if (this.f4539g == null) {
                str = str + " app";
            }
            if (this.f4544l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f4533a, this.f4534b, this.f4535c, this.f4536d.longValue(), this.f4537e, this.f4538f.booleanValue(), this.f4539g, this.f4540h, this.f4541i, this.f4542j, this.f4543k, this.f4544l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.b
        public B.e.b b(B.e.a aVar) {
            if (aVar != null) {
                this.f4539g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // J0.B.e.b
        public B.e.b c(String str) {
            this.f4535c = str;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b d(boolean z8) {
            this.f4538f = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b e(B.e.c cVar) {
            this.f4542j = cVar;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b f(Long l8) {
            this.f4537e = l8;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b g(C c8) {
            this.f4543k = c8;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b h(String str) {
            if (str != null) {
                this.f4533a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // J0.B.e.b
        public B.e.b i(int i8) {
            this.f4544l = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b j(String str) {
            if (str != null) {
                this.f4534b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // J0.B.e.b
        public B.e.b l(B.e.AbstractC0087e abstractC0087e) {
            this.f4541i = abstractC0087e;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b m(long j8) {
            this.f4536d = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b n(B.e.f fVar) {
            this.f4540h = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e eVar) {
            this.f4533a = eVar.g();
            this.f4534b = eVar.i();
            this.f4535c = eVar.c();
            this.f4536d = Long.valueOf(eVar.l());
            this.f4537e = eVar.e();
            this.f4538f = Boolean.valueOf(eVar.n());
            this.f4539g = eVar.b();
            this.f4540h = eVar.m();
            this.f4541i = eVar.k();
            this.f4542j = eVar.d();
            this.f4543k = eVar.f();
            this.f4544l = Integer.valueOf(eVar.h());
        }
    }

    @Override // J0.B.e
    public B.e.a b() {
        return this.f4527g;
    }

    @Override // J0.B.e
    public String c() {
        return this.f4523c;
    }

    @Override // J0.B.e
    public B.e.c d() {
        return this.f4530j;
    }

    @Override // J0.B.e
    public Long e() {
        return this.f4525e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l8;
        B.e.f fVar;
        B.e.AbstractC0087e abstractC0087e;
        B.e.c cVar;
        C c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e)) {
            return false;
        }
        B.e eVar = (B.e) obj;
        if (this.f4521a.equals(eVar.g()) && this.f4522b.equals(eVar.i()) && ((str = this.f4523c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f4524d == eVar.l() && ((l8 = this.f4525e) != null ? l8.equals(eVar.e()) : eVar.e() == null) && this.f4526f == eVar.n() && this.f4527g.equals(eVar.b()) && ((fVar = this.f4528h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0087e = this.f4529i) != null ? abstractC0087e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f4530j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((c8 = this.f4531k) != null ? c8.equals(eVar.f()) : eVar.f() == null) && this.f4532l == eVar.h()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e
    public C f() {
        return this.f4531k;
    }

    @Override // J0.B.e
    public String g() {
        return this.f4521a;
    }

    @Override // J0.B.e
    public int h() {
        return this.f4532l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i8;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f4521a.hashCode() ^ 1000003) * 1000003) ^ this.f4522b.hashCode()) * 1000003;
        String str = this.f4523c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f4524d;
        int i10 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l8 = this.f4525e;
        if (l8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l8.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        if (this.f4526f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int hashCode7 = (((i11 ^ i8) * 1000003) ^ this.f4527g.hashCode()) * 1000003;
        B.e.f fVar = this.f4528h;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode3) * 1000003;
        B.e.AbstractC0087e abstractC0087e = this.f4529i;
        if (abstractC0087e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0087e.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        B.e.c cVar = this.f4530j;
        if (cVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = cVar.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        C c8 = this.f4531k;
        if (c8 != null) {
            i9 = c8.hashCode();
        }
        return ((i14 ^ i9) * 1000003) ^ this.f4532l;
    }

    @Override // J0.B.e
    public String i() {
        return this.f4522b;
    }

    @Override // J0.B.e
    public B.e.AbstractC0087e k() {
        return this.f4529i;
    }

    @Override // J0.B.e
    public long l() {
        return this.f4524d;
    }

    @Override // J0.B.e
    public B.e.f m() {
        return this.f4528h;
    }

    @Override // J0.B.e
    public boolean n() {
        return this.f4526f;
    }

    @Override // J0.B.e
    public B.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f4521a + ", identifier=" + this.f4522b + ", appQualitySessionId=" + this.f4523c + ", startedAt=" + this.f4524d + ", endedAt=" + this.f4525e + ", crashed=" + this.f4526f + ", app=" + this.f4527g + ", user=" + this.f4528h + ", os=" + this.f4529i + ", device=" + this.f4530j + ", events=" + this.f4531k + ", generatorType=" + this.f4532l + "}";
    }

    private h(String str, String str2, String str3, long j8, Long l8, boolean z8, B.e.a aVar, B.e.f fVar, B.e.AbstractC0087e abstractC0087e, B.e.c cVar, C c8, int i8) {
        this.f4521a = str;
        this.f4522b = str2;
        this.f4523c = str3;
        this.f4524d = j8;
        this.f4525e = l8;
        this.f4526f = z8;
        this.f4527g = aVar;
        this.f4528h = fVar;
        this.f4529i = abstractC0087e;
        this.f4530j = cVar;
        this.f4531k = c8;
        this.f4532l = i8;
    }
}
