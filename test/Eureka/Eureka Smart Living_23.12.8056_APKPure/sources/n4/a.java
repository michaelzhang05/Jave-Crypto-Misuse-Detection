package n4;

import n4.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f7996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7997b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7998c;

    /* renamed from: d, reason: collision with root package name */
    private final f f7999d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f8000e;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f8001a;

        /* renamed from: b, reason: collision with root package name */
        private String f8002b;

        /* renamed from: c, reason: collision with root package name */
        private String f8003c;

        /* renamed from: d, reason: collision with root package name */
        private f f8004d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f8005e;

        @Override // n4.d.a
        public d a() {
            return new a(this.f8001a, this.f8002b, this.f8003c, this.f8004d, this.f8005e);
        }

        @Override // n4.d.a
        public d.a b(f fVar) {
            this.f8004d = fVar;
            return this;
        }

        @Override // n4.d.a
        public d.a c(String str) {
            this.f8002b = str;
            return this;
        }

        @Override // n4.d.a
        public d.a d(String str) {
            this.f8003c = str;
            return this;
        }

        @Override // n4.d.a
        public d.a e(d.b bVar) {
            this.f8005e = bVar;
            return this;
        }

        @Override // n4.d.a
        public d.a f(String str) {
            this.f8001a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f7996a = str;
        this.f7997b = str2;
        this.f7998c = str3;
        this.f7999d = fVar;
        this.f8000e = bVar;
    }

    @Override // n4.d
    public f b() {
        return this.f7999d;
    }

    @Override // n4.d
    public String c() {
        return this.f7997b;
    }

    @Override // n4.d
    public String d() {
        return this.f7998c;
    }

    @Override // n4.d
    public d.b e() {
        return this.f8000e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f7996a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f7997b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f7998c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f7999d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f8000e;
                        d.b e6 = dVar.e();
                        if (bVar == null) {
                            if (e6 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e6)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // n4.d
    public String f() {
        return this.f7996a;
    }

    public int hashCode() {
        String str = this.f7996a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f7997b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7998c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f7999d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f8000e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f7996a + ", fid=" + this.f7997b + ", refreshToken=" + this.f7998c + ", authToken=" + this.f7999d + ", responseCode=" + this.f8000e + "}";
    }
}
