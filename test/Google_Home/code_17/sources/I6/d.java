package I6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f4283n = new a().c().a();

    /* renamed from: o, reason: collision with root package name */
    public static final d f4284o = new a().e().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4285a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4287c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4288d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4289e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4290f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4291g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4292h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4293i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f4294j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4295k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4296l;

    /* renamed from: m, reason: collision with root package name */
    String f4297m;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f4298a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4299b;

        /* renamed from: c, reason: collision with root package name */
        int f4300c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f4301d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f4302e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f4303f;

        /* renamed from: g, reason: collision with root package name */
        boolean f4304g;

        /* renamed from: h, reason: collision with root package name */
        boolean f4305h;

        public d a() {
            return new d(this);
        }

        public a b(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.f4301d = i9;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public a c() {
            this.f4298a = true;
            return this;
        }

        public a d() {
            this.f4299b = true;
            return this;
        }

        public a e() {
            this.f4303f = true;
            return this;
        }
    }

    private d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f4285a = z8;
        this.f4286b = z9;
        this.f4287c = i8;
        this.f4288d = i9;
        this.f4289e = z10;
        this.f4290f = z11;
        this.f4291g = z12;
        this.f4292h = i10;
        this.f4293i = i11;
        this.f4294j = z13;
        this.f4295k = z14;
        this.f4296l = z15;
        this.f4297m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f4285a) {
            sb.append("no-cache, ");
        }
        if (this.f4286b) {
            sb.append("no-store, ");
        }
        if (this.f4287c != -1) {
            sb.append("max-age=");
            sb.append(this.f4287c);
            sb.append(", ");
        }
        if (this.f4288d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f4288d);
            sb.append(", ");
        }
        if (this.f4289e) {
            sb.append("private, ");
        }
        if (this.f4290f) {
            sb.append("public, ");
        }
        if (this.f4291g) {
            sb.append("must-revalidate, ");
        }
        if (this.f4292h != -1) {
            sb.append("max-stale=");
            sb.append(this.f4292h);
            sb.append(", ");
        }
        if (this.f4293i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f4293i);
            sb.append(", ");
        }
        if (this.f4294j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4295k) {
            sb.append("no-transform, ");
        }
        if (this.f4296l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I6.d l(I6.q r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.d.l(I6.q):I6.d");
    }

    public boolean b() {
        return this.f4296l;
    }

    public boolean c() {
        return this.f4289e;
    }

    public boolean d() {
        return this.f4290f;
    }

    public int e() {
        return this.f4287c;
    }

    public int f() {
        return this.f4292h;
    }

    public int g() {
        return this.f4293i;
    }

    public boolean h() {
        return this.f4291g;
    }

    public boolean i() {
        return this.f4285a;
    }

    public boolean j() {
        return this.f4286b;
    }

    public boolean k() {
        return this.f4294j;
    }

    public String toString() {
        String str = this.f4297m;
        if (str == null) {
            String a8 = a();
            this.f4297m = a8;
            return a8;
        }
        return str;
    }

    d(a aVar) {
        this.f4285a = aVar.f4298a;
        this.f4286b = aVar.f4299b;
        this.f4287c = aVar.f4300c;
        this.f4288d = -1;
        this.f4289e = false;
        this.f4290f = false;
        this.f4291g = false;
        this.f4292h = aVar.f4301d;
        this.f4293i = aVar.f4302e;
        this.f4294j = aVar.f4303f;
        this.f4295k = aVar.f4304g;
        this.f4296l = aVar.f4305h;
    }
}
