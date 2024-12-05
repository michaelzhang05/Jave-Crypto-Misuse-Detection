package L0;

import L0.F;

/* loaded from: classes3.dex */
final class i extends F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5568a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5569b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5570c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5571d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5572e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5573f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.a.AbstractC0083a {

        /* renamed from: a, reason: collision with root package name */
        private String f5574a;

        /* renamed from: b, reason: collision with root package name */
        private String f5575b;

        /* renamed from: c, reason: collision with root package name */
        private String f5576c;

        /* renamed from: d, reason: collision with root package name */
        private String f5577d;

        /* renamed from: e, reason: collision with root package name */
        private String f5578e;

        /* renamed from: f, reason: collision with root package name */
        private String f5579f;

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a a() {
            String str;
            String str2 = this.f5574a;
            if (str2 != null && (str = this.f5575b) != null) {
                return new i(str2, str, this.f5576c, null, this.f5577d, this.f5578e, this.f5579f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5574a == null) {
                sb.append(" identifier");
            }
            if (this.f5575b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a b(String str) {
            this.f5578e = str;
            return this;
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a c(String str) {
            this.f5579f = str;
            return this;
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a d(String str) {
            this.f5576c = str;
            return this;
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a e(String str) {
            if (str != null) {
                this.f5574a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a f(String str) {
            this.f5577d = str;
            return this;
        }

        @Override // L0.F.e.a.AbstractC0083a
        public F.e.a.AbstractC0083a g(String str) {
            if (str != null) {
                this.f5575b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // L0.F.e.a
    public String b() {
        return this.f5572e;
    }

    @Override // L0.F.e.a
    public String c() {
        return this.f5573f;
    }

    @Override // L0.F.e.a
    public String d() {
        return this.f5570c;
    }

    @Override // L0.F.e.a
    public String e() {
        return this.f5568a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f5568a.equals(aVar.e()) && this.f5569b.equals(aVar.h()) && ((str = this.f5570c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f5571d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f5572e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f5573f;
                    if (str4 == null) {
                        if (aVar.c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // L0.F.e.a
    public String f() {
        return this.f5571d;
    }

    @Override // L0.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // L0.F.e.a
    public String h() {
        return this.f5569b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f5568a.hashCode() ^ 1000003) * 1000003) ^ this.f5569b.hashCode()) * 1000003;
        String str = this.f5570c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f5571d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f5572e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        String str4 = this.f5573f;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i11 ^ i8;
    }

    public String toString() {
        return "Application{identifier=" + this.f5568a + ", version=" + this.f5569b + ", displayVersion=" + this.f5570c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f5571d + ", developmentPlatform=" + this.f5572e + ", developmentPlatformVersion=" + this.f5573f + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f5568a = str;
        this.f5569b = str2;
        this.f5570c = str3;
        this.f5571d = str4;
        this.f5572e = str5;
        this.f5573f = str6;
    }
}
