package h1;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2895a {

    /* renamed from: p, reason: collision with root package name */
    private static final C2895a f32098p = new C0753a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f32099a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32100b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32101c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32102d;

    /* renamed from: e, reason: collision with root package name */
    private final d f32103e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32104f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32105g;

    /* renamed from: h, reason: collision with root package name */
    private final int f32106h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32107i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32108j;

    /* renamed from: k, reason: collision with root package name */
    private final long f32109k;

    /* renamed from: l, reason: collision with root package name */
    private final b f32110l;

    /* renamed from: m, reason: collision with root package name */
    private final String f32111m;

    /* renamed from: n, reason: collision with root package name */
    private final long f32112n;

    /* renamed from: o, reason: collision with root package name */
    private final String f32113o;

    /* renamed from: h1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0753a {

        /* renamed from: a, reason: collision with root package name */
        private long f32114a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f32115b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f32116c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f32117d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f32118e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f32119f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f32120g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f32121h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f32122i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f32123j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f32124k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f32125l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f32126m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f32127n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f32128o = "";

        C0753a() {
        }

        public C2895a a() {
            return new C2895a(this.f32114a, this.f32115b, this.f32116c, this.f32117d, this.f32118e, this.f32119f, this.f32120g, this.f32121h, this.f32122i, this.f32123j, this.f32124k, this.f32125l, this.f32126m, this.f32127n, this.f32128o);
        }

        public C0753a b(String str) {
            this.f32126m = str;
            return this;
        }

        public C0753a c(String str) {
            this.f32120g = str;
            return this;
        }

        public C0753a d(String str) {
            this.f32128o = str;
            return this;
        }

        public C0753a e(b bVar) {
            this.f32125l = bVar;
            return this;
        }

        public C0753a f(String str) {
            this.f32116c = str;
            return this;
        }

        public C0753a g(String str) {
            this.f32115b = str;
            return this;
        }

        public C0753a h(c cVar) {
            this.f32117d = cVar;
            return this;
        }

        public C0753a i(String str) {
            this.f32119f = str;
            return this;
        }

        public C0753a j(long j8) {
            this.f32114a = j8;
            return this;
        }

        public C0753a k(d dVar) {
            this.f32118e = dVar;
            return this;
        }

        public C0753a l(String str) {
            this.f32123j = str;
            return this;
        }

        public C0753a m(int i8) {
            this.f32122i = i8;
            return this;
        }
    }

    /* renamed from: h1.a$b */
    /* loaded from: classes4.dex */
    public enum b implements X0.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f32133a;

        b(int i8) {
            this.f32133a = i8;
        }

        @Override // X0.c
        public int getNumber() {
            return this.f32133a;
        }
    }

    /* renamed from: h1.a$c */
    /* loaded from: classes4.dex */
    public enum c implements X0.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32139a;

        c(int i8) {
            this.f32139a = i8;
        }

        @Override // X0.c
        public int getNumber() {
            return this.f32139a;
        }
    }

    /* renamed from: h1.a$d */
    /* loaded from: classes4.dex */
    public enum d implements X0.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32145a;

        d(int i8) {
            this.f32145a = i8;
        }

        @Override // X0.c
        public int getNumber() {
            return this.f32145a;
        }
    }

    C2895a(long j8, String str, String str2, c cVar, d dVar, String str3, String str4, int i8, int i9, String str5, long j9, b bVar, String str6, long j10, String str7) {
        this.f32099a = j8;
        this.f32100b = str;
        this.f32101c = str2;
        this.f32102d = cVar;
        this.f32103e = dVar;
        this.f32104f = str3;
        this.f32105g = str4;
        this.f32106h = i8;
        this.f32107i = i9;
        this.f32108j = str5;
        this.f32109k = j9;
        this.f32110l = bVar;
        this.f32111m = str6;
        this.f32112n = j10;
        this.f32113o = str7;
    }

    public static C0753a p() {
        return new C0753a();
    }

    public String a() {
        return this.f32111m;
    }

    public long b() {
        return this.f32109k;
    }

    public long c() {
        return this.f32112n;
    }

    public String d() {
        return this.f32105g;
    }

    public String e() {
        return this.f32113o;
    }

    public b f() {
        return this.f32110l;
    }

    public String g() {
        return this.f32101c;
    }

    public String h() {
        return this.f32100b;
    }

    public c i() {
        return this.f32102d;
    }

    public String j() {
        return this.f32104f;
    }

    public int k() {
        return this.f32106h;
    }

    public long l() {
        return this.f32099a;
    }

    public d m() {
        return this.f32103e;
    }

    public String n() {
        return this.f32108j;
    }

    public int o() {
        return this.f32107i;
    }
}
