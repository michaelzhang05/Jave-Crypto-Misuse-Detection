package F6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f2743n = new a().c().a();

    /* renamed from: o, reason: collision with root package name */
    public static final d f2744o = new a().e().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2745a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2746b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2747c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2748d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2749e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2750f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2751g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2752h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2753i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2754j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f2755k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f2756l;

    /* renamed from: m, reason: collision with root package name */
    String f2757m;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2758a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2759b;

        /* renamed from: c, reason: collision with root package name */
        int f2760c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f2761d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f2762e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f2763f;

        /* renamed from: g, reason: collision with root package name */
        boolean f2764g;

        /* renamed from: h, reason: collision with root package name */
        boolean f2765h;

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
                this.f2761d = i9;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public a c() {
            this.f2758a = true;
            return this;
        }

        public a d() {
            this.f2759b = true;
            return this;
        }

        public a e() {
            this.f2763f = true;
            return this;
        }
    }

    private d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f2745a = z8;
        this.f2746b = z9;
        this.f2747c = i8;
        this.f2748d = i9;
        this.f2749e = z10;
        this.f2750f = z11;
        this.f2751g = z12;
        this.f2752h = i10;
        this.f2753i = i11;
        this.f2754j = z13;
        this.f2755k = z14;
        this.f2756l = z15;
        this.f2757m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f2745a) {
            sb.append("no-cache, ");
        }
        if (this.f2746b) {
            sb.append("no-store, ");
        }
        if (this.f2747c != -1) {
            sb.append("max-age=");
            sb.append(this.f2747c);
            sb.append(", ");
        }
        if (this.f2748d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f2748d);
            sb.append(", ");
        }
        if (this.f2749e) {
            sb.append("private, ");
        }
        if (this.f2750f) {
            sb.append("public, ");
        }
        if (this.f2751g) {
            sb.append("must-revalidate, ");
        }
        if (this.f2752h != -1) {
            sb.append("max-stale=");
            sb.append(this.f2752h);
            sb.append(", ");
        }
        if (this.f2753i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f2753i);
            sb.append(", ");
        }
        if (this.f2754j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2755k) {
            sb.append("no-transform, ");
        }
        if (this.f2756l) {
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
    public static F6.d l(F6.q r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.d.l(F6.q):F6.d");
    }

    public boolean b() {
        return this.f2756l;
    }

    public boolean c() {
        return this.f2749e;
    }

    public boolean d() {
        return this.f2750f;
    }

    public int e() {
        return this.f2747c;
    }

    public int f() {
        return this.f2752h;
    }

    public int g() {
        return this.f2753i;
    }

    public boolean h() {
        return this.f2751g;
    }

    public boolean i() {
        return this.f2745a;
    }

    public boolean j() {
        return this.f2746b;
    }

    public boolean k() {
        return this.f2754j;
    }

    public String toString() {
        String str = this.f2757m;
        if (str == null) {
            String a8 = a();
            this.f2757m = a8;
            return a8;
        }
        return str;
    }

    d(a aVar) {
        this.f2745a = aVar.f2758a;
        this.f2746b = aVar.f2759b;
        this.f2747c = aVar.f2760c;
        this.f2748d = -1;
        this.f2749e = false;
        this.f2750f = false;
        this.f2751g = false;
        this.f2752h = aVar.f2761d;
        this.f2753i = aVar.f2762e;
        this.f2754j = aVar.f2763f;
        this.f2755k = aVar.f2764g;
        this.f2756l = aVar.f2765h;
    }
}
