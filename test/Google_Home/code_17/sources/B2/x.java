package b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class x extends w {

    /* renamed from: c, reason: collision with root package name */
    private final C1959C f15281c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15282d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15283e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15284f;

    /* renamed from: g, reason: collision with root package name */
    private int f15285g;

    /* renamed from: h, reason: collision with root package name */
    private final C1964d f15286h;

    /* renamed from: i, reason: collision with root package name */
    private int f15287i;

    /* renamed from: j, reason: collision with root package name */
    private final C1964d f15288j;

    /* renamed from: k, reason: collision with root package name */
    private int f15289k;

    /* renamed from: l, reason: collision with root package name */
    private final C1964d f15290l;

    /* renamed from: m, reason: collision with root package name */
    private int f15291m;

    /* renamed from: n, reason: collision with root package name */
    private final C1964d f15292n;

    /* renamed from: o, reason: collision with root package name */
    private int f15293o;

    /* renamed from: p, reason: collision with root package name */
    private final C1964d f15294p;

    /* renamed from: q, reason: collision with root package name */
    private int f15295q;

    /* renamed from: r, reason: collision with root package name */
    private final C1964d f15296r;

    /* renamed from: s, reason: collision with root package name */
    private int f15297s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(C1959C c1959c, int i8, int i9, int i10) {
        super(589824);
        this.f15281c = c1959c;
        this.f15282d = i8;
        this.f15283e = i9;
        this.f15284f = i10;
        this.f15286h = new C1964d();
        this.f15288j = new C1964d();
        this.f15290l = new C1964d();
        this.f15292n = new C1964d();
        this.f15294p = new C1964d();
        this.f15296r = new C1964d();
    }

    @Override // b2.w
    public void b(String str, int i8, String... strArr) {
        this.f15288j.k(this.f15281c.B(str).f15051a).k(i8);
        if (strArr == null) {
            this.f15288j.k(0);
        } else {
            this.f15288j.k(strArr.length);
            for (String str2 : strArr) {
                this.f15288j.k(this.f15281c.y(str2).f15051a);
            }
        }
        this.f15287i++;
    }

    @Override // b2.w
    public void c(String str) {
        this.f15297s = this.f15281c.e(str).f15051a;
    }

    @Override // b2.w
    public void d(String str, int i8, String... strArr) {
        this.f15290l.k(this.f15281c.B(str).f15051a).k(i8);
        if (strArr == null) {
            this.f15290l.k(0);
        } else {
            this.f15290l.k(strArr.length);
            for (String str2 : strArr) {
                this.f15290l.k(this.f15281c.y(str2).f15051a);
            }
        }
        this.f15289k++;
    }

    @Override // b2.w
    public void e(String str) {
        this.f15296r.k(this.f15281c.B(str).f15051a);
        this.f15295q++;
    }

    @Override // b2.w
    public void f(String str, String... strArr) {
        this.f15294p.k(this.f15281c.e(str).f15051a);
        this.f15294p.k(strArr.length);
        for (String str2 : strArr) {
            this.f15294p.k(this.f15281c.e(str2).f15051a);
        }
        this.f15293o++;
    }

    @Override // b2.w
    public void g(String str, int i8, String str2) {
        int D8;
        C1964d k8 = this.f15286h.k(this.f15281c.y(str).f15051a).k(i8);
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f15281c.D(str2);
        }
        k8.k(D8);
        this.f15285g++;
    }

    @Override // b2.w
    public void h(String str) {
        this.f15292n.k(this.f15281c.e(str).f15051a);
        this.f15291m++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        this.f15281c.D("Module");
        int i8 = this.f15286h.f15102b + 22 + this.f15288j.f15102b + this.f15290l.f15102b + this.f15292n.f15102b + this.f15294p.f15102b;
        if (this.f15295q > 0) {
            this.f15281c.D("ModulePackages");
            i8 += this.f15296r.f15102b + 8;
        }
        if (this.f15297s > 0) {
            this.f15281c.D("ModuleMainClass");
            return i8 + 8;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        int i8;
        int i9 = 0;
        if (this.f15295q > 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i10 = i8 + 1;
        if (this.f15297s > 0) {
            i9 = 1;
        }
        return i10 + i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(C1964d c1964d) {
        C1964d k8 = c1964d.k(this.f15281c.D("Module")).i(this.f15286h.f15102b + 16 + this.f15288j.f15102b + this.f15290l.f15102b + this.f15292n.f15102b + this.f15294p.f15102b).k(this.f15282d).k(this.f15283e).k(this.f15284f).k(this.f15285g);
        C1964d c1964d2 = this.f15286h;
        C1964d k9 = k8.h(c1964d2.f15101a, 0, c1964d2.f15102b).k(this.f15287i);
        C1964d c1964d3 = this.f15288j;
        C1964d k10 = k9.h(c1964d3.f15101a, 0, c1964d3.f15102b).k(this.f15289k);
        C1964d c1964d4 = this.f15290l;
        C1964d k11 = k10.h(c1964d4.f15101a, 0, c1964d4.f15102b).k(this.f15291m);
        C1964d c1964d5 = this.f15292n;
        C1964d k12 = k11.h(c1964d5.f15101a, 0, c1964d5.f15102b).k(this.f15293o);
        C1964d c1964d6 = this.f15294p;
        k12.h(c1964d6.f15101a, 0, c1964d6.f15102b);
        if (this.f15295q > 0) {
            C1964d k13 = c1964d.k(this.f15281c.D("ModulePackages")).i(this.f15296r.f15102b + 2).k(this.f15295q);
            C1964d c1964d7 = this.f15296r;
            k13.h(c1964d7.f15101a, 0, c1964d7.f15102b);
        }
        if (this.f15297s > 0) {
            c1964d.k(this.f15281c.D("ModuleMainClass")).i(2).k(this.f15297s);
        }
    }

    @Override // b2.w
    public void a() {
    }
}
