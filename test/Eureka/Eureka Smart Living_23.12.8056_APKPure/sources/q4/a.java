package q4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f8990p = new C0133a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f8991a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8992b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8993c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8994d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8995e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8996f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8997g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8998h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8999i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9000j;

    /* renamed from: k, reason: collision with root package name */
    private final long f9001k;

    /* renamed from: l, reason: collision with root package name */
    private final b f9002l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9003m;

    /* renamed from: n, reason: collision with root package name */
    private final long f9004n;

    /* renamed from: o, reason: collision with root package name */
    private final String f9005o;

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0133a {

        /* renamed from: a, reason: collision with root package name */
        private long f9006a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f9007b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f9008c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f9009d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f9010e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f9011f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f9012g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f9013h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f9014i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f9015j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f9016k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f9017l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f9018m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f9019n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f9020o = "";

        C0133a() {
        }

        public a a() {
            return new a(this.f9006a, this.f9007b, this.f9008c, this.f9009d, this.f9010e, this.f9011f, this.f9012g, this.f9013h, this.f9014i, this.f9015j, this.f9016k, this.f9017l, this.f9018m, this.f9019n, this.f9020o);
        }

        public C0133a b(String str) {
            this.f9018m = str;
            return this;
        }

        public C0133a c(String str) {
            this.f9012g = str;
            return this;
        }

        public C0133a d(String str) {
            this.f9020o = str;
            return this;
        }

        public C0133a e(b bVar) {
            this.f9017l = bVar;
            return this;
        }

        public C0133a f(String str) {
            this.f9008c = str;
            return this;
        }

        public C0133a g(String str) {
            this.f9007b = str;
            return this;
        }

        public C0133a h(c cVar) {
            this.f9009d = cVar;
            return this;
        }

        public C0133a i(String str) {
            this.f9011f = str;
            return this;
        }

        public C0133a j(long j6) {
            this.f9006a = j6;
            return this;
        }

        public C0133a k(d dVar) {
            this.f9010e = dVar;
            return this;
        }

        public C0133a l(String str) {
            this.f9015j = str;
            return this;
        }

        public C0133a m(int i6) {
            this.f9014i = i6;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements g4.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f9025a;

        b(int i6) {
            this.f9025a = i6;
        }

        @Override // g4.c
        public int a() {
            return this.f9025a;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements g4.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f9031a;

        c(int i6) {
            this.f9031a = i6;
        }

        @Override // g4.c
        public int a() {
            return this.f9031a;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements g4.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f9037a;

        d(int i6) {
            this.f9037a = i6;
        }

        @Override // g4.c
        public int a() {
            return this.f9037a;
        }
    }

    a(long j6, String str, String str2, c cVar, d dVar, String str3, String str4, int i6, int i7, String str5, long j7, b bVar, String str6, long j8, String str7) {
        this.f8991a = j6;
        this.f8992b = str;
        this.f8993c = str2;
        this.f8994d = cVar;
        this.f8995e = dVar;
        this.f8996f = str3;
        this.f8997g = str4;
        this.f8998h = i6;
        this.f8999i = i7;
        this.f9000j = str5;
        this.f9001k = j7;
        this.f9002l = bVar;
        this.f9003m = str6;
        this.f9004n = j8;
        this.f9005o = str7;
    }

    public static C0133a p() {
        return new C0133a();
    }

    public String a() {
        return this.f9003m;
    }

    public long b() {
        return this.f9001k;
    }

    public long c() {
        return this.f9004n;
    }

    public String d() {
        return this.f8997g;
    }

    public String e() {
        return this.f9005o;
    }

    public b f() {
        return this.f9002l;
    }

    public String g() {
        return this.f8993c;
    }

    public String h() {
        return this.f8992b;
    }

    public c i() {
        return this.f8994d;
    }

    public String j() {
        return this.f8996f;
    }

    public int k() {
        return this.f8998h;
    }

    public long l() {
        return this.f8991a;
    }

    public d m() {
        return this.f8995e;
    }

    public String n() {
        return this.f9000j;
    }

    public int o() {
        return this.f8999i;
    }
}
