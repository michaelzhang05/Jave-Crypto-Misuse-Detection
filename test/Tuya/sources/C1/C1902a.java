package c1;

import c1.AbstractC1905d;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1902a extends AbstractC1905d {

    /* renamed from: a, reason: collision with root package name */
    private final String f14848a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14849b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14850c;

    /* renamed from: d, reason: collision with root package name */
    private final f f14851d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC1905d.b f14852e;

    /* renamed from: c1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC1905d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f14853a;

        /* renamed from: b, reason: collision with root package name */
        private String f14854b;

        /* renamed from: c, reason: collision with root package name */
        private String f14855c;

        /* renamed from: d, reason: collision with root package name */
        private f f14856d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC1905d.b f14857e;

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d a() {
            return new C1902a(this.f14853a, this.f14854b, this.f14855c, this.f14856d, this.f14857e);
        }

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d.a b(f fVar) {
            this.f14856d = fVar;
            return this;
        }

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d.a c(String str) {
            this.f14854b = str;
            return this;
        }

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d.a d(String str) {
            this.f14855c = str;
            return this;
        }

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d.a e(AbstractC1905d.b bVar) {
            this.f14857e = bVar;
            return this;
        }

        @Override // c1.AbstractC1905d.a
        public AbstractC1905d.a f(String str) {
            this.f14853a = str;
            return this;
        }
    }

    @Override // c1.AbstractC1905d
    public f b() {
        return this.f14851d;
    }

    @Override // c1.AbstractC1905d
    public String c() {
        return this.f14849b;
    }

    @Override // c1.AbstractC1905d
    public String d() {
        return this.f14850c;
    }

    @Override // c1.AbstractC1905d
    public AbstractC1905d.b e() {
        return this.f14852e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1905d)) {
            return false;
        }
        AbstractC1905d abstractC1905d = (AbstractC1905d) obj;
        String str = this.f14848a;
        if (str != null ? str.equals(abstractC1905d.f()) : abstractC1905d.f() == null) {
            String str2 = this.f14849b;
            if (str2 != null ? str2.equals(abstractC1905d.c()) : abstractC1905d.c() == null) {
                String str3 = this.f14850c;
                if (str3 != null ? str3.equals(abstractC1905d.d()) : abstractC1905d.d() == null) {
                    f fVar = this.f14851d;
                    if (fVar != null ? fVar.equals(abstractC1905d.b()) : abstractC1905d.b() == null) {
                        AbstractC1905d.b bVar = this.f14852e;
                        if (bVar == null) {
                            if (abstractC1905d.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC1905d.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // c1.AbstractC1905d
    public String f() {
        return this.f14848a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f14848a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f14849b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f14850c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        f fVar = this.f14851d;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        AbstractC1905d.b bVar = this.f14852e;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i12 ^ i8;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f14848a + ", fid=" + this.f14849b + ", refreshToken=" + this.f14850c + ", authToken=" + this.f14851d + ", responseCode=" + this.f14852e + "}";
    }

    private C1902a(String str, String str2, String str3, f fVar, AbstractC1905d.b bVar) {
        this.f14848a = str;
        this.f14849b = str2;
        this.f14850c = str3;
        this.f14851d = fVar;
        this.f14852e = bVar;
    }
}
