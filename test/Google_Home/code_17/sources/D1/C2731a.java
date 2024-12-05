package d1;

import d1.AbstractC2734d;
import d1.C2733c;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2731a extends AbstractC2734d {

    /* renamed from: b, reason: collision with root package name */
    private final String f31130b;

    /* renamed from: c, reason: collision with root package name */
    private final C2733c.a f31131c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31132d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31133e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31134f;

    /* renamed from: g, reason: collision with root package name */
    private final long f31135g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31136h;

    /* renamed from: d1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC2734d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31137a;

        /* renamed from: b, reason: collision with root package name */
        private C2733c.a f31138b;

        /* renamed from: c, reason: collision with root package name */
        private String f31139c;

        /* renamed from: d, reason: collision with root package name */
        private String f31140d;

        /* renamed from: e, reason: collision with root package name */
        private Long f31141e;

        /* renamed from: f, reason: collision with root package name */
        private Long f31142f;

        /* renamed from: g, reason: collision with root package name */
        private String f31143g;

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d a() {
            String str = "";
            if (this.f31138b == null) {
                str = " registrationStatus";
            }
            if (this.f31141e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f31142f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2731a(this.f31137a, this.f31138b, this.f31139c, this.f31140d, this.f31141e.longValue(), this.f31142f.longValue(), this.f31143g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a b(String str) {
            this.f31139c = str;
            return this;
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a c(long j8) {
            this.f31141e = Long.valueOf(j8);
            return this;
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a d(String str) {
            this.f31137a = str;
            return this;
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a e(String str) {
            this.f31143g = str;
            return this;
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a f(String str) {
            this.f31140d = str;
            return this;
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a g(C2733c.a aVar) {
            if (aVar != null) {
                this.f31138b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // d1.AbstractC2734d.a
        public AbstractC2734d.a h(long j8) {
            this.f31142f = Long.valueOf(j8);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC2734d abstractC2734d) {
            this.f31137a = abstractC2734d.d();
            this.f31138b = abstractC2734d.g();
            this.f31139c = abstractC2734d.b();
            this.f31140d = abstractC2734d.f();
            this.f31141e = Long.valueOf(abstractC2734d.c());
            this.f31142f = Long.valueOf(abstractC2734d.h());
            this.f31143g = abstractC2734d.e();
        }
    }

    @Override // d1.AbstractC2734d
    public String b() {
        return this.f31132d;
    }

    @Override // d1.AbstractC2734d
    public long c() {
        return this.f31134f;
    }

    @Override // d1.AbstractC2734d
    public String d() {
        return this.f31130b;
    }

    @Override // d1.AbstractC2734d
    public String e() {
        return this.f31136h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2734d)) {
            return false;
        }
        AbstractC2734d abstractC2734d = (AbstractC2734d) obj;
        String str3 = this.f31130b;
        if (str3 != null ? str3.equals(abstractC2734d.d()) : abstractC2734d.d() == null) {
            if (this.f31131c.equals(abstractC2734d.g()) && ((str = this.f31132d) != null ? str.equals(abstractC2734d.b()) : abstractC2734d.b() == null) && ((str2 = this.f31133e) != null ? str2.equals(abstractC2734d.f()) : abstractC2734d.f() == null) && this.f31134f == abstractC2734d.c() && this.f31135g == abstractC2734d.h()) {
                String str4 = this.f31136h;
                if (str4 == null) {
                    if (abstractC2734d.e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC2734d.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d1.AbstractC2734d
    public String f() {
        return this.f31133e;
    }

    @Override // d1.AbstractC2734d
    public C2733c.a g() {
        return this.f31131c;
    }

    @Override // d1.AbstractC2734d
    public long h() {
        return this.f31135g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f31130b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f31131c.hashCode()) * 1000003;
        String str2 = this.f31132d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f31133e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        long j8 = this.f31134f;
        int i11 = (i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f31135g;
        int i12 = (i11 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f31136h;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i12 ^ i8;
    }

    @Override // d1.AbstractC2734d
    public AbstractC2734d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f31130b + ", registrationStatus=" + this.f31131c + ", authToken=" + this.f31132d + ", refreshToken=" + this.f31133e + ", expiresInSecs=" + this.f31134f + ", tokenCreationEpochInSecs=" + this.f31135g + ", fisError=" + this.f31136h + "}";
    }

    private C2731a(String str, C2733c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f31130b = str;
        this.f31131c = aVar;
        this.f31132d = str2;
        this.f31133e = str3;
        this.f31134f = j8;
        this.f31135g = j9;
        this.f31136h = str4;
    }
}
