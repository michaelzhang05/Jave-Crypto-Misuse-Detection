package L0;

import L0.F;

/* renamed from: L0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1294d extends F.a.AbstractC0081a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5525a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5526b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5527c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.a.AbstractC0081a.AbstractC0082a {

        /* renamed from: a, reason: collision with root package name */
        private String f5528a;

        /* renamed from: b, reason: collision with root package name */
        private String f5529b;

        /* renamed from: c, reason: collision with root package name */
        private String f5530c;

        @Override // L0.F.a.AbstractC0081a.AbstractC0082a
        public F.a.AbstractC0081a a() {
            String str;
            String str2;
            String str3 = this.f5528a;
            if (str3 != null && (str = this.f5529b) != null && (str2 = this.f5530c) != null) {
                return new C1294d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5528a == null) {
                sb.append(" arch");
            }
            if (this.f5529b == null) {
                sb.append(" libraryName");
            }
            if (this.f5530c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // L0.F.a.AbstractC0081a.AbstractC0082a
        public F.a.AbstractC0081a.AbstractC0082a b(String str) {
            if (str != null) {
                this.f5528a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // L0.F.a.AbstractC0081a.AbstractC0082a
        public F.a.AbstractC0081a.AbstractC0082a c(String str) {
            if (str != null) {
                this.f5530c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // L0.F.a.AbstractC0081a.AbstractC0082a
        public F.a.AbstractC0081a.AbstractC0082a d(String str) {
            if (str != null) {
                this.f5529b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // L0.F.a.AbstractC0081a
    public String b() {
        return this.f5525a;
    }

    @Override // L0.F.a.AbstractC0081a
    public String c() {
        return this.f5527c;
    }

    @Override // L0.F.a.AbstractC0081a
    public String d() {
        return this.f5526b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.AbstractC0081a)) {
            return false;
        }
        F.a.AbstractC0081a abstractC0081a = (F.a.AbstractC0081a) obj;
        if (this.f5525a.equals(abstractC0081a.b()) && this.f5526b.equals(abstractC0081a.d()) && this.f5527c.equals(abstractC0081a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5525a.hashCode() ^ 1000003) * 1000003) ^ this.f5526b.hashCode()) * 1000003) ^ this.f5527c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f5525a + ", libraryName=" + this.f5526b + ", buildId=" + this.f5527c + "}";
    }

    private C1294d(String str, String str2, String str3) {
        this.f5525a = str;
        this.f5526b = str2;
        this.f5527c = str3;
    }
}
