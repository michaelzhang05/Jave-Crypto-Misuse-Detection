package J0;

import J0.B;

/* renamed from: J0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1190b extends B {

    /* renamed from: b, reason: collision with root package name */
    private final String f4465b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4466c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4467d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4468e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4469f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4470g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4471h;

    /* renamed from: i, reason: collision with root package name */
    private final B.e f4472i;

    /* renamed from: j, reason: collision with root package name */
    private final B.d f4473j;

    /* renamed from: k, reason: collision with root package name */
    private final B.a f4474k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0089b extends B.b {

        /* renamed from: a, reason: collision with root package name */
        private String f4475a;

        /* renamed from: b, reason: collision with root package name */
        private String f4476b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4477c;

        /* renamed from: d, reason: collision with root package name */
        private String f4478d;

        /* renamed from: e, reason: collision with root package name */
        private String f4479e;

        /* renamed from: f, reason: collision with root package name */
        private String f4480f;

        /* renamed from: g, reason: collision with root package name */
        private String f4481g;

        /* renamed from: h, reason: collision with root package name */
        private B.e f4482h;

        /* renamed from: i, reason: collision with root package name */
        private B.d f4483i;

        /* renamed from: j, reason: collision with root package name */
        private B.a f4484j;

        @Override // J0.B.b
        public B a() {
            String str = "";
            if (this.f4475a == null) {
                str = " sdkVersion";
            }
            if (this.f4476b == null) {
                str = str + " gmpAppId";
            }
            if (this.f4477c == null) {
                str = str + " platform";
            }
            if (this.f4478d == null) {
                str = str + " installationUuid";
            }
            if (this.f4480f == null) {
                str = str + " buildVersion";
            }
            if (this.f4481g == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1190b(this.f4475a, this.f4476b, this.f4477c.intValue(), this.f4478d, this.f4479e, this.f4480f, this.f4481g, this.f4482h, this.f4483i, this.f4484j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.b
        public B.b b(B.a aVar) {
            this.f4484j = aVar;
            return this;
        }

        @Override // J0.B.b
        public B.b c(String str) {
            if (str != null) {
                this.f4480f = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // J0.B.b
        public B.b d(String str) {
            if (str != null) {
                this.f4481g = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // J0.B.b
        public B.b e(String str) {
            this.f4479e = str;
            return this;
        }

        @Override // J0.B.b
        public B.b f(String str) {
            if (str != null) {
                this.f4476b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // J0.B.b
        public B.b g(String str) {
            if (str != null) {
                this.f4478d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // J0.B.b
        public B.b h(B.d dVar) {
            this.f4483i = dVar;
            return this;
        }

        @Override // J0.B.b
        public B.b i(int i8) {
            this.f4477c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.b
        public B.b j(String str) {
            if (str != null) {
                this.f4475a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // J0.B.b
        public B.b k(B.e eVar) {
            this.f4482h = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0089b() {
        }

        private C0089b(B b8) {
            this.f4475a = b8.k();
            this.f4476b = b8.g();
            this.f4477c = Integer.valueOf(b8.j());
            this.f4478d = b8.h();
            this.f4479e = b8.f();
            this.f4480f = b8.d();
            this.f4481g = b8.e();
            this.f4482h = b8.l();
            this.f4483i = b8.i();
            this.f4484j = b8.c();
        }
    }

    @Override // J0.B
    public B.a c() {
        return this.f4474k;
    }

    @Override // J0.B
    public String d() {
        return this.f4470g;
    }

    @Override // J0.B
    public String e() {
        return this.f4471h;
    }

    public boolean equals(Object obj) {
        String str;
        B.e eVar;
        B.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        if (this.f4465b.equals(b8.k()) && this.f4466c.equals(b8.g()) && this.f4467d == b8.j() && this.f4468e.equals(b8.h()) && ((str = this.f4469f) != null ? str.equals(b8.f()) : b8.f() == null) && this.f4470g.equals(b8.d()) && this.f4471h.equals(b8.e()) && ((eVar = this.f4472i) != null ? eVar.equals(b8.l()) : b8.l() == null) && ((dVar = this.f4473j) != null ? dVar.equals(b8.i()) : b8.i() == null)) {
            B.a aVar = this.f4474k;
            if (aVar == null) {
                if (b8.c() == null) {
                    return true;
                }
            } else if (aVar.equals(b8.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B
    public String f() {
        return this.f4469f;
    }

    @Override // J0.B
    public String g() {
        return this.f4466c;
    }

    @Override // J0.B
    public String h() {
        return this.f4468e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((((((this.f4465b.hashCode() ^ 1000003) * 1000003) ^ this.f4466c.hashCode()) * 1000003) ^ this.f4467d) * 1000003) ^ this.f4468e.hashCode()) * 1000003;
        String str = this.f4469f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((((hashCode4 ^ hashCode) * 1000003) ^ this.f4470g.hashCode()) * 1000003) ^ this.f4471h.hashCode()) * 1000003;
        B.e eVar = this.f4472i;
        if (eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = eVar.hashCode();
        }
        int i9 = (hashCode5 ^ hashCode2) * 1000003;
        B.d dVar = this.f4473j;
        if (dVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dVar.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        B.a aVar = this.f4474k;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i10 ^ i8;
    }

    @Override // J0.B
    public B.d i() {
        return this.f4473j;
    }

    @Override // J0.B
    public int j() {
        return this.f4467d;
    }

    @Override // J0.B
    public String k() {
        return this.f4465b;
    }

    @Override // J0.B
    public B.e l() {
        return this.f4472i;
    }

    @Override // J0.B
    protected B.b m() {
        return new C0089b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4465b + ", gmpAppId=" + this.f4466c + ", platform=" + this.f4467d + ", installationUuid=" + this.f4468e + ", firebaseInstallationId=" + this.f4469f + ", buildVersion=" + this.f4470g + ", displayVersion=" + this.f4471h + ", session=" + this.f4472i + ", ndkPayload=" + this.f4473j + ", appExitInfo=" + this.f4474k + "}";
    }

    private C1190b(String str, String str2, int i8, String str3, String str4, String str5, String str6, B.e eVar, B.d dVar, B.a aVar) {
        this.f4465b = str;
        this.f4466c = str2;
        this.f4467d = i8;
        this.f4468e = str3;
        this.f4469f = str4;
        this.f4470g = str5;
        this.f4471h = str6;
        this.f4472i = eVar;
        this.f4473j = dVar;
        this.f4474k = aVar;
    }
}
