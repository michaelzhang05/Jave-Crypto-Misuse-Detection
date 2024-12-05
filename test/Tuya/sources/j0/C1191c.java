package J0;

import J0.B;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1191c extends B.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f4485a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4486b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4487c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4488d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4489e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4490f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4491g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4492h;

    /* renamed from: i, reason: collision with root package name */
    private final C f4493i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends B.a.b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4494a;

        /* renamed from: b, reason: collision with root package name */
        private String f4495b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4496c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4497d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4498e;

        /* renamed from: f, reason: collision with root package name */
        private Long f4499f;

        /* renamed from: g, reason: collision with root package name */
        private Long f4500g;

        /* renamed from: h, reason: collision with root package name */
        private String f4501h;

        /* renamed from: i, reason: collision with root package name */
        private C f4502i;

        @Override // J0.B.a.b
        public B.a a() {
            String str = "";
            if (this.f4494a == null) {
                str = " pid";
            }
            if (this.f4495b == null) {
                str = str + " processName";
            }
            if (this.f4496c == null) {
                str = str + " reasonCode";
            }
            if (this.f4497d == null) {
                str = str + " importance";
            }
            if (this.f4498e == null) {
                str = str + " pss";
            }
            if (this.f4499f == null) {
                str = str + " rss";
            }
            if (this.f4500g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C1191c(this.f4494a.intValue(), this.f4495b, this.f4496c.intValue(), this.f4497d.intValue(), this.f4498e.longValue(), this.f4499f.longValue(), this.f4500g.longValue(), this.f4501h, this.f4502i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.a.b
        public B.a.b b(C c8) {
            this.f4502i = c8;
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b c(int i8) {
            this.f4497d = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b d(int i8) {
            this.f4494a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b e(String str) {
            if (str != null) {
                this.f4495b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // J0.B.a.b
        public B.a.b f(long j8) {
            this.f4498e = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b g(int i8) {
            this.f4496c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b h(long j8) {
            this.f4499f = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b i(long j8) {
            this.f4500g = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b j(String str) {
            this.f4501h = str;
            return this;
        }
    }

    @Override // J0.B.a
    public C b() {
        return this.f4493i;
    }

    @Override // J0.B.a
    public int c() {
        return this.f4488d;
    }

    @Override // J0.B.a
    public int d() {
        return this.f4485a;
    }

    @Override // J0.B.a
    public String e() {
        return this.f4486b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a)) {
            return false;
        }
        B.a aVar = (B.a) obj;
        if (this.f4485a == aVar.d() && this.f4486b.equals(aVar.e()) && this.f4487c == aVar.g() && this.f4488d == aVar.c() && this.f4489e == aVar.f() && this.f4490f == aVar.h() && this.f4491g == aVar.i() && ((str = this.f4492h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            C c8 = this.f4493i;
            if (c8 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (c8.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.a
    public long f() {
        return this.f4489e;
    }

    @Override // J0.B.a
    public int g() {
        return this.f4487c;
    }

    @Override // J0.B.a
    public long h() {
        return this.f4490f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f4485a ^ 1000003) * 1000003) ^ this.f4486b.hashCode()) * 1000003) ^ this.f4487c) * 1000003) ^ this.f4488d) * 1000003;
        long j8 = this.f4489e;
        int i8 = (hashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4490f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f4491g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f4492h;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        C c8 = this.f4493i;
        if (c8 != null) {
            i11 = c8.hashCode();
        }
        return i12 ^ i11;
    }

    @Override // J0.B.a
    public long i() {
        return this.f4491g;
    }

    @Override // J0.B.a
    public String j() {
        return this.f4492h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f4485a + ", processName=" + this.f4486b + ", reasonCode=" + this.f4487c + ", importance=" + this.f4488d + ", pss=" + this.f4489e + ", rss=" + this.f4490f + ", timestamp=" + this.f4491g + ", traceFile=" + this.f4492h + ", buildIdMappingForArch=" + this.f4493i + "}";
    }

    private C1191c(int i8, String str, int i9, int i10, long j8, long j9, long j10, String str2, C c8) {
        this.f4485a = i8;
        this.f4486b = str;
        this.f4487c = i9;
        this.f4488d = i10;
        this.f4489e = j8;
        this.f4490f = j9;
        this.f4491g = j10;
        this.f4492h = str2;
        this.f4493i = c8;
    }
}
