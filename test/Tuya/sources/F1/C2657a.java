package f1;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2657a {

    /* renamed from: p, reason: collision with root package name */
    private static final C2657a f30953p = new C0737a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f30954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30955b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30956c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30957d;

    /* renamed from: e, reason: collision with root package name */
    private final d f30958e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30959f;

    /* renamed from: g, reason: collision with root package name */
    private final String f30960g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30961h;

    /* renamed from: i, reason: collision with root package name */
    private final int f30962i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30963j;

    /* renamed from: k, reason: collision with root package name */
    private final long f30964k;

    /* renamed from: l, reason: collision with root package name */
    private final b f30965l;

    /* renamed from: m, reason: collision with root package name */
    private final String f30966m;

    /* renamed from: n, reason: collision with root package name */
    private final long f30967n;

    /* renamed from: o, reason: collision with root package name */
    private final String f30968o;

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0737a {

        /* renamed from: a, reason: collision with root package name */
        private long f30969a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f30970b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f30971c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f30972d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f30973e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f30974f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f30975g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f30976h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f30977i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f30978j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f30979k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f30980l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f30981m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f30982n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f30983o = "";

        C0737a() {
        }

        public C2657a a() {
            return new C2657a(this.f30969a, this.f30970b, this.f30971c, this.f30972d, this.f30973e, this.f30974f, this.f30975g, this.f30976h, this.f30977i, this.f30978j, this.f30979k, this.f30980l, this.f30981m, this.f30982n, this.f30983o);
        }

        public C0737a b(String str) {
            this.f30981m = str;
            return this;
        }

        public C0737a c(String str) {
            this.f30975g = str;
            return this;
        }

        public C0737a d(String str) {
            this.f30983o = str;
            return this;
        }

        public C0737a e(b bVar) {
            this.f30980l = bVar;
            return this;
        }

        public C0737a f(String str) {
            this.f30971c = str;
            return this;
        }

        public C0737a g(String str) {
            this.f30970b = str;
            return this;
        }

        public C0737a h(c cVar) {
            this.f30972d = cVar;
            return this;
        }

        public C0737a i(String str) {
            this.f30974f = str;
            return this;
        }

        public C0737a j(long j8) {
            this.f30969a = j8;
            return this;
        }

        public C0737a k(d dVar) {
            this.f30973e = dVar;
            return this;
        }

        public C0737a l(String str) {
            this.f30978j = str;
            return this;
        }

        public C0737a m(int i8) {
            this.f30977i = i8;
            return this;
        }
    }

    /* renamed from: f1.a$b */
    /* loaded from: classes3.dex */
    public enum b implements V0.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f30988a;

        b(int i8) {
            this.f30988a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f30988a;
        }
    }

    /* renamed from: f1.a$c */
    /* loaded from: classes3.dex */
    public enum c implements V0.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f30994a;

        c(int i8) {
            this.f30994a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f30994a;
        }
    }

    /* renamed from: f1.a$d */
    /* loaded from: classes3.dex */
    public enum d implements V0.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f31000a;

        d(int i8) {
            this.f31000a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f31000a;
        }
    }

    C2657a(long j8, String str, String str2, c cVar, d dVar, String str3, String str4, int i8, int i9, String str5, long j9, b bVar, String str6, long j10, String str7) {
        this.f30954a = j8;
        this.f30955b = str;
        this.f30956c = str2;
        this.f30957d = cVar;
        this.f30958e = dVar;
        this.f30959f = str3;
        this.f30960g = str4;
        this.f30961h = i8;
        this.f30962i = i9;
        this.f30963j = str5;
        this.f30964k = j9;
        this.f30965l = bVar;
        this.f30966m = str6;
        this.f30967n = j10;
        this.f30968o = str7;
    }

    public static C0737a p() {
        return new C0737a();
    }

    public String a() {
        return this.f30966m;
    }

    public long b() {
        return this.f30964k;
    }

    public long c() {
        return this.f30967n;
    }

    public String d() {
        return this.f30960g;
    }

    public String e() {
        return this.f30968o;
    }

    public b f() {
        return this.f30965l;
    }

    public String g() {
        return this.f30956c;
    }

    public String h() {
        return this.f30955b;
    }

    public c i() {
        return this.f30957d;
    }

    public String j() {
        return this.f30959f;
    }

    public int k() {
        return this.f30961h;
    }

    public long l() {
        return this.f30954a;
    }

    public d m() {
        return this.f30958e;
    }

    public String n() {
        return this.f30963j;
    }

    public int o() {
        return this.f30962i;
    }
}
