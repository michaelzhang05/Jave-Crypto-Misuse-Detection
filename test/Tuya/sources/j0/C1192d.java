package J0;

import J0.B;

/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1192d extends B.a.AbstractC0072a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4504b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends B.a.AbstractC0072a.AbstractC0073a {

        /* renamed from: a, reason: collision with root package name */
        private String f4506a;

        /* renamed from: b, reason: collision with root package name */
        private String f4507b;

        /* renamed from: c, reason: collision with root package name */
        private String f4508c;

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a a() {
            String str = "";
            if (this.f4506a == null) {
                str = " arch";
            }
            if (this.f4507b == null) {
                str = str + " libraryName";
            }
            if (this.f4508c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C1192d(this.f4506a, this.f4507b, this.f4508c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a b(String str) {
            if (str != null) {
                this.f4506a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a c(String str) {
            if (str != null) {
                this.f4508c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a d(String str) {
            if (str != null) {
                this.f4507b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // J0.B.a.AbstractC0072a
    public String b() {
        return this.f4503a;
    }

    @Override // J0.B.a.AbstractC0072a
    public String c() {
        return this.f4505c;
    }

    @Override // J0.B.a.AbstractC0072a
    public String d() {
        return this.f4504b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a.AbstractC0072a)) {
            return false;
        }
        B.a.AbstractC0072a abstractC0072a = (B.a.AbstractC0072a) obj;
        if (this.f4503a.equals(abstractC0072a.b()) && this.f4504b.equals(abstractC0072a.d()) && this.f4505c.equals(abstractC0072a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4503a.hashCode() ^ 1000003) * 1000003) ^ this.f4504b.hashCode()) * 1000003) ^ this.f4505c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f4503a + ", libraryName=" + this.f4504b + ", buildId=" + this.f4505c + "}";
    }

    private C1192d(String str, String str2, String str3) {
        this.f4503a = str;
        this.f4504b = str2;
        this.f4505c = str3;
    }
}
