package m4;

import m4.c;
import m4.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f7882b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f7883c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7884d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7885e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7886f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7887g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7888h;

    /* loaded from: classes.dex */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f7889a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f7890b;

        /* renamed from: c, reason: collision with root package name */
        private String f7891c;

        /* renamed from: d, reason: collision with root package name */
        private String f7892d;

        /* renamed from: e, reason: collision with root package name */
        private Long f7893e;

        /* renamed from: f, reason: collision with root package name */
        private Long f7894f;

        /* renamed from: g, reason: collision with root package name */
        private String f7895g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f7889a = dVar.d();
            this.f7890b = dVar.g();
            this.f7891c = dVar.b();
            this.f7892d = dVar.f();
            this.f7893e = Long.valueOf(dVar.c());
            this.f7894f = Long.valueOf(dVar.h());
            this.f7895g = dVar.e();
        }

        @Override // m4.d.a
        public d a() {
            String str = "";
            if (this.f7890b == null) {
                str = " registrationStatus";
            }
            if (this.f7893e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f7894f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f7889a, this.f7890b, this.f7891c, this.f7892d, this.f7893e.longValue(), this.f7894f.longValue(), this.f7895g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m4.d.a
        public d.a b(String str) {
            this.f7891c = str;
            return this;
        }

        @Override // m4.d.a
        public d.a c(long j6) {
            this.f7893e = Long.valueOf(j6);
            return this;
        }

        @Override // m4.d.a
        public d.a d(String str) {
            this.f7889a = str;
            return this;
        }

        @Override // m4.d.a
        public d.a e(String str) {
            this.f7895g = str;
            return this;
        }

        @Override // m4.d.a
        public d.a f(String str) {
            this.f7892d = str;
            return this;
        }

        @Override // m4.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f7890b = aVar;
            return this;
        }

        @Override // m4.d.a
        public d.a h(long j6) {
            this.f7894f = Long.valueOf(j6);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j6, long j7, String str4) {
        this.f7882b = str;
        this.f7883c = aVar;
        this.f7884d = str2;
        this.f7885e = str3;
        this.f7886f = j6;
        this.f7887g = j7;
        this.f7888h = str4;
    }

    @Override // m4.d
    public String b() {
        return this.f7884d;
    }

    @Override // m4.d
    public long c() {
        return this.f7886f;
    }

    @Override // m4.d
    public String d() {
        return this.f7882b;
    }

    @Override // m4.d
    public String e() {
        return this.f7888h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f7882b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f7883c.equals(dVar.g()) && ((str = this.f7884d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f7885e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f7886f == dVar.c() && this.f7887g == dVar.h()) {
                String str4 = this.f7888h;
                String e6 = dVar.e();
                if (str4 == null) {
                    if (e6 == null) {
                        return true;
                    }
                } else if (str4.equals(e6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m4.d
    public String f() {
        return this.f7885e;
    }

    @Override // m4.d
    public c.a g() {
        return this.f7883c;
    }

    @Override // m4.d
    public long h() {
        return this.f7887g;
    }

    public int hashCode() {
        String str = this.f7882b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f7883c.hashCode()) * 1000003;
        String str2 = this.f7884d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7885e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f7886f;
        int i6 = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f7887g;
        int i7 = (i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.f7888h;
        return i7 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // m4.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f7882b + ", registrationStatus=" + this.f7883c + ", authToken=" + this.f7884d + ", refreshToken=" + this.f7885e + ", expiresInSecs=" + this.f7886f + ", tokenCreationEpochInSecs=" + this.f7887g + ", fisError=" + this.f7888h + "}";
    }
}
