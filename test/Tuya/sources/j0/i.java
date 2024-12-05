package J0;

import J0.B;

/* loaded from: classes3.dex */
final class i extends B.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4545a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4546b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4547c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4548d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4549e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4550f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.a.AbstractC0074a {

        /* renamed from: a, reason: collision with root package name */
        private String f4551a;

        /* renamed from: b, reason: collision with root package name */
        private String f4552b;

        /* renamed from: c, reason: collision with root package name */
        private String f4553c;

        /* renamed from: d, reason: collision with root package name */
        private String f4554d;

        /* renamed from: e, reason: collision with root package name */
        private String f4555e;

        /* renamed from: f, reason: collision with root package name */
        private String f4556f;

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a a() {
            String str = "";
            if (this.f4551a == null) {
                str = " identifier";
            }
            if (this.f4552b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f4551a, this.f4552b, this.f4553c, null, this.f4554d, this.f4555e, this.f4556f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a b(String str) {
            this.f4555e = str;
            return this;
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a c(String str) {
            this.f4556f = str;
            return this;
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a d(String str) {
            this.f4553c = str;
            return this;
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a e(String str) {
            if (str != null) {
                this.f4551a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a f(String str) {
            this.f4554d = str;
            return this;
        }

        @Override // J0.B.e.a.AbstractC0074a
        public B.e.a.AbstractC0074a g(String str) {
            if (str != null) {
                this.f4552b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // J0.B.e.a
    public String b() {
        return this.f4549e;
    }

    @Override // J0.B.e.a
    public String c() {
        return this.f4550f;
    }

    @Override // J0.B.e.a
    public String d() {
        return this.f4547c;
    }

    @Override // J0.B.e.a
    public String e() {
        return this.f4545a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.a)) {
            return false;
        }
        B.e.a aVar = (B.e.a) obj;
        if (this.f4545a.equals(aVar.e()) && this.f4546b.equals(aVar.h()) && ((str = this.f4547c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f4548d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f4549e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f4550f;
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

    @Override // J0.B.e.a
    public String f() {
        return this.f4548d;
    }

    @Override // J0.B.e.a
    public B.e.a.b g() {
        return null;
    }

    @Override // J0.B.e.a
    public String h() {
        return this.f4546b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f4545a.hashCode() ^ 1000003) * 1000003) ^ this.f4546b.hashCode()) * 1000003;
        String str = this.f4547c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f4548d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f4549e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        String str4 = this.f4550f;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i11 ^ i8;
    }

    public String toString() {
        return "Application{identifier=" + this.f4545a + ", version=" + this.f4546b + ", displayVersion=" + this.f4547c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f4548d + ", developmentPlatform=" + this.f4549e + ", developmentPlatformVersion=" + this.f4550f + "}";
    }

    private i(String str, String str2, String str3, B.e.a.b bVar, String str4, String str5, String str6) {
        this.f4545a = str;
        this.f4546b = str2;
        this.f4547c = str3;
        this.f4548d = str4;
        this.f4549e = str5;
        this.f4550f = str6;
    }
}
