package e1;

import e1.AbstractC2773d;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2770a extends AbstractC2773d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31241a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31242b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31243c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2775f f31244d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC2773d.b f31245e;

    /* renamed from: e1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC2773d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31246a;

        /* renamed from: b, reason: collision with root package name */
        private String f31247b;

        /* renamed from: c, reason: collision with root package name */
        private String f31248c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC2775f f31249d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC2773d.b f31250e;

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d a() {
            return new C2770a(this.f31246a, this.f31247b, this.f31248c, this.f31249d, this.f31250e);
        }

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d.a b(AbstractC2775f abstractC2775f) {
            this.f31249d = abstractC2775f;
            return this;
        }

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d.a c(String str) {
            this.f31247b = str;
            return this;
        }

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d.a d(String str) {
            this.f31248c = str;
            return this;
        }

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d.a e(AbstractC2773d.b bVar) {
            this.f31250e = bVar;
            return this;
        }

        @Override // e1.AbstractC2773d.a
        public AbstractC2773d.a f(String str) {
            this.f31246a = str;
            return this;
        }
    }

    @Override // e1.AbstractC2773d
    public AbstractC2775f b() {
        return this.f31244d;
    }

    @Override // e1.AbstractC2773d
    public String c() {
        return this.f31242b;
    }

    @Override // e1.AbstractC2773d
    public String d() {
        return this.f31243c;
    }

    @Override // e1.AbstractC2773d
    public AbstractC2773d.b e() {
        return this.f31245e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2773d)) {
            return false;
        }
        AbstractC2773d abstractC2773d = (AbstractC2773d) obj;
        String str = this.f31241a;
        if (str != null ? str.equals(abstractC2773d.f()) : abstractC2773d.f() == null) {
            String str2 = this.f31242b;
            if (str2 != null ? str2.equals(abstractC2773d.c()) : abstractC2773d.c() == null) {
                String str3 = this.f31243c;
                if (str3 != null ? str3.equals(abstractC2773d.d()) : abstractC2773d.d() == null) {
                    AbstractC2775f abstractC2775f = this.f31244d;
                    if (abstractC2775f != null ? abstractC2775f.equals(abstractC2773d.b()) : abstractC2773d.b() == null) {
                        AbstractC2773d.b bVar = this.f31245e;
                        if (bVar == null) {
                            if (abstractC2773d.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC2773d.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e1.AbstractC2773d
    public String f() {
        return this.f31241a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f31241a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f31242b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f31243c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        AbstractC2775f abstractC2775f = this.f31244d;
        if (abstractC2775f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC2775f.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        AbstractC2773d.b bVar = this.f31245e;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i12 ^ i8;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31241a + ", fid=" + this.f31242b + ", refreshToken=" + this.f31243c + ", authToken=" + this.f31244d + ", responseCode=" + this.f31245e + "}";
    }

    private C2770a(String str, String str2, String str3, AbstractC2775f abstractC2775f, AbstractC2773d.b bVar) {
        this.f31241a = str;
        this.f31242b = str2;
        this.f31243c = str3;
        this.f31244d = abstractC2775f;
        this.f31245e = bVar;
    }
}
