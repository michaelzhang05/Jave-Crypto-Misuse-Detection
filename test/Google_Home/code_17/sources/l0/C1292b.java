package L0;

import L0.F;

/* renamed from: L0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1292b extends F {

    /* renamed from: b, reason: collision with root package name */
    private final String f5481b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5482c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5483d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5484e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5485f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5486g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5487h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5488i;

    /* renamed from: j, reason: collision with root package name */
    private final String f5489j;

    /* renamed from: k, reason: collision with root package name */
    private final F.e f5490k;

    /* renamed from: l, reason: collision with root package name */
    private final F.d f5491l;

    /* renamed from: m, reason: collision with root package name */
    private final F.a f5492m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0100b extends F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f5493a;

        /* renamed from: b, reason: collision with root package name */
        private String f5494b;

        /* renamed from: c, reason: collision with root package name */
        private int f5495c;

        /* renamed from: d, reason: collision with root package name */
        private String f5496d;

        /* renamed from: e, reason: collision with root package name */
        private String f5497e;

        /* renamed from: f, reason: collision with root package name */
        private String f5498f;

        /* renamed from: g, reason: collision with root package name */
        private String f5499g;

        /* renamed from: h, reason: collision with root package name */
        private String f5500h;

        /* renamed from: i, reason: collision with root package name */
        private String f5501i;

        /* renamed from: j, reason: collision with root package name */
        private F.e f5502j;

        /* renamed from: k, reason: collision with root package name */
        private F.d f5503k;

        /* renamed from: l, reason: collision with root package name */
        private F.a f5504l;

        /* renamed from: m, reason: collision with root package name */
        private byte f5505m;

        @Override // L0.F.b
        public F a() {
            if (this.f5505m == 1 && this.f5493a != null && this.f5494b != null && this.f5496d != null && this.f5500h != null && this.f5501i != null) {
                return new C1292b(this.f5493a, this.f5494b, this.f5495c, this.f5496d, this.f5497e, this.f5498f, this.f5499g, this.f5500h, this.f5501i, this.f5502j, this.f5503k, this.f5504l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5493a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f5494b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f5505m) == 0) {
                sb.append(" platform");
            }
            if (this.f5496d == null) {
                sb.append(" installationUuid");
            }
            if (this.f5500h == null) {
                sb.append(" buildVersion");
            }
            if (this.f5501i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.b
        public F.b b(F.a aVar) {
            this.f5504l = aVar;
            return this;
        }

        @Override // L0.F.b
        public F.b c(String str) {
            this.f5499g = str;
            return this;
        }

        @Override // L0.F.b
        public F.b d(String str) {
            if (str != null) {
                this.f5500h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // L0.F.b
        public F.b e(String str) {
            if (str != null) {
                this.f5501i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // L0.F.b
        public F.b f(String str) {
            this.f5498f = str;
            return this;
        }

        @Override // L0.F.b
        public F.b g(String str) {
            this.f5497e = str;
            return this;
        }

        @Override // L0.F.b
        public F.b h(String str) {
            if (str != null) {
                this.f5494b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // L0.F.b
        public F.b i(String str) {
            if (str != null) {
                this.f5496d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // L0.F.b
        public F.b j(F.d dVar) {
            this.f5503k = dVar;
            return this;
        }

        @Override // L0.F.b
        public F.b k(int i8) {
            this.f5495c = i8;
            this.f5505m = (byte) (this.f5505m | 1);
            return this;
        }

        @Override // L0.F.b
        public F.b l(String str) {
            if (str != null) {
                this.f5493a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // L0.F.b
        public F.b m(F.e eVar) {
            this.f5502j = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0100b() {
        }

        private C0100b(F f8) {
            this.f5493a = f8.m();
            this.f5494b = f8.i();
            this.f5495c = f8.l();
            this.f5496d = f8.j();
            this.f5497e = f8.h();
            this.f5498f = f8.g();
            this.f5499g = f8.d();
            this.f5500h = f8.e();
            this.f5501i = f8.f();
            this.f5502j = f8.n();
            this.f5503k = f8.k();
            this.f5504l = f8.c();
            this.f5505m = (byte) 1;
        }
    }

    @Override // L0.F
    public F.a c() {
        return this.f5492m;
    }

    @Override // L0.F
    public String d() {
        return this.f5487h;
    }

    @Override // L0.F
    public String e() {
        return this.f5488i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        if (this.f5481b.equals(f8.m()) && this.f5482c.equals(f8.i()) && this.f5483d == f8.l() && this.f5484e.equals(f8.j()) && ((str = this.f5485f) != null ? str.equals(f8.h()) : f8.h() == null) && ((str2 = this.f5486g) != null ? str2.equals(f8.g()) : f8.g() == null) && ((str3 = this.f5487h) != null ? str3.equals(f8.d()) : f8.d() == null) && this.f5488i.equals(f8.e()) && this.f5489j.equals(f8.f()) && ((eVar = this.f5490k) != null ? eVar.equals(f8.n()) : f8.n() == null) && ((dVar = this.f5491l) != null ? dVar.equals(f8.k()) : f8.k() == null)) {
            F.a aVar = this.f5492m;
            if (aVar == null) {
                if (f8.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f8.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // L0.F
    public String f() {
        return this.f5489j;
    }

    @Override // L0.F
    public String g() {
        return this.f5486g;
    }

    @Override // L0.F
    public String h() {
        return this.f5485f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f5481b.hashCode() ^ 1000003) * 1000003) ^ this.f5482c.hashCode()) * 1000003) ^ this.f5483d) * 1000003) ^ this.f5484e.hashCode()) * 1000003;
        String str = this.f5485f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f5486g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f5487h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i10 ^ hashCode3) * 1000003) ^ this.f5488i.hashCode()) * 1000003) ^ this.f5489j.hashCode()) * 1000003;
        F.e eVar = this.f5490k;
        if (eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = eVar.hashCode();
        }
        int i11 = (hashCode7 ^ hashCode4) * 1000003;
        F.d dVar = this.f5491l;
        if (dVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = dVar.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        F.a aVar = this.f5492m;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i12 ^ i8;
    }

    @Override // L0.F
    public String i() {
        return this.f5482c;
    }

    @Override // L0.F
    public String j() {
        return this.f5484e;
    }

    @Override // L0.F
    public F.d k() {
        return this.f5491l;
    }

    @Override // L0.F
    public int l() {
        return this.f5483d;
    }

    @Override // L0.F
    public String m() {
        return this.f5481b;
    }

    @Override // L0.F
    public F.e n() {
        return this.f5490k;
    }

    @Override // L0.F
    protected F.b o() {
        return new C0100b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5481b + ", gmpAppId=" + this.f5482c + ", platform=" + this.f5483d + ", installationUuid=" + this.f5484e + ", firebaseInstallationId=" + this.f5485f + ", firebaseAuthenticationToken=" + this.f5486g + ", appQualitySessionId=" + this.f5487h + ", buildVersion=" + this.f5488i + ", displayVersion=" + this.f5489j + ", session=" + this.f5490k + ", ndkPayload=" + this.f5491l + ", appExitInfo=" + this.f5492m + "}";
    }

    private C1292b(String str, String str2, int i8, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f5481b = str;
        this.f5482c = str2;
        this.f5483d = i8;
        this.f5484e = str3;
        this.f5485f = str4;
        this.f5486g = str5;
        this.f5487h = str6;
        this.f5488i = str7;
        this.f5489j = str8;
        this.f5490k = eVar;
        this.f5491l = dVar;
        this.f5492m = aVar;
    }
}
