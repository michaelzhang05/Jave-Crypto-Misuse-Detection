package Y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class x extends w {

    /* renamed from: c, reason: collision with root package name */
    private final C f12996c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12997d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12998e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12999f;

    /* renamed from: g, reason: collision with root package name */
    private int f13000g;

    /* renamed from: h, reason: collision with root package name */
    private final C1515d f13001h;

    /* renamed from: i, reason: collision with root package name */
    private int f13002i;

    /* renamed from: j, reason: collision with root package name */
    private final C1515d f13003j;

    /* renamed from: k, reason: collision with root package name */
    private int f13004k;

    /* renamed from: l, reason: collision with root package name */
    private final C1515d f13005l;

    /* renamed from: m, reason: collision with root package name */
    private int f13006m;

    /* renamed from: n, reason: collision with root package name */
    private final C1515d f13007n;

    /* renamed from: o, reason: collision with root package name */
    private int f13008o;

    /* renamed from: p, reason: collision with root package name */
    private final C1515d f13009p;

    /* renamed from: q, reason: collision with root package name */
    private int f13010q;

    /* renamed from: r, reason: collision with root package name */
    private final C1515d f13011r;

    /* renamed from: s, reason: collision with root package name */
    private int f13012s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(C c8, int i8, int i9, int i10) {
        super(589824);
        this.f12996c = c8;
        this.f12997d = i8;
        this.f12998e = i9;
        this.f12999f = i10;
        this.f13001h = new C1515d();
        this.f13003j = new C1515d();
        this.f13005l = new C1515d();
        this.f13007n = new C1515d();
        this.f13009p = new C1515d();
        this.f13011r = new C1515d();
    }

    @Override // Y1.w
    public void b(String str, int i8, String... strArr) {
        this.f13003j.k(this.f12996c.B(str).f12766a).k(i8);
        if (strArr == null) {
            this.f13003j.k(0);
        } else {
            this.f13003j.k(strArr.length);
            for (String str2 : strArr) {
                this.f13003j.k(this.f12996c.y(str2).f12766a);
            }
        }
        this.f13002i++;
    }

    @Override // Y1.w
    public void c(String str) {
        this.f13012s = this.f12996c.e(str).f12766a;
    }

    @Override // Y1.w
    public void d(String str, int i8, String... strArr) {
        this.f13005l.k(this.f12996c.B(str).f12766a).k(i8);
        if (strArr == null) {
            this.f13005l.k(0);
        } else {
            this.f13005l.k(strArr.length);
            for (String str2 : strArr) {
                this.f13005l.k(this.f12996c.y(str2).f12766a);
            }
        }
        this.f13004k++;
    }

    @Override // Y1.w
    public void e(String str) {
        this.f13011r.k(this.f12996c.B(str).f12766a);
        this.f13010q++;
    }

    @Override // Y1.w
    public void f(String str, String... strArr) {
        this.f13009p.k(this.f12996c.e(str).f12766a);
        this.f13009p.k(strArr.length);
        for (String str2 : strArr) {
            this.f13009p.k(this.f12996c.e(str2).f12766a);
        }
        this.f13008o++;
    }

    @Override // Y1.w
    public void g(String str, int i8, String str2) {
        int D8;
        C1515d k8 = this.f13001h.k(this.f12996c.y(str).f12766a).k(i8);
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f12996c.D(str2);
        }
        k8.k(D8);
        this.f13000g++;
    }

    @Override // Y1.w
    public void h(String str) {
        this.f13007n.k(this.f12996c.e(str).f12766a);
        this.f13006m++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        this.f12996c.D("Module");
        int i8 = this.f13001h.f12817b + 22 + this.f13003j.f12817b + this.f13005l.f12817b + this.f13007n.f12817b + this.f13009p.f12817b;
        if (this.f13010q > 0) {
            this.f12996c.D("ModulePackages");
            i8 += this.f13011r.f12817b + 8;
        }
        if (this.f13012s > 0) {
            this.f12996c.D("ModuleMainClass");
            return i8 + 8;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        int i8;
        int i9 = 0;
        if (this.f13010q > 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i10 = i8 + 1;
        if (this.f13012s > 0) {
            i9 = 1;
        }
        return i10 + i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(C1515d c1515d) {
        C1515d k8 = c1515d.k(this.f12996c.D("Module")).i(this.f13001h.f12817b + 16 + this.f13003j.f12817b + this.f13005l.f12817b + this.f13007n.f12817b + this.f13009p.f12817b).k(this.f12997d).k(this.f12998e).k(this.f12999f).k(this.f13000g);
        C1515d c1515d2 = this.f13001h;
        C1515d k9 = k8.h(c1515d2.f12816a, 0, c1515d2.f12817b).k(this.f13002i);
        C1515d c1515d3 = this.f13003j;
        C1515d k10 = k9.h(c1515d3.f12816a, 0, c1515d3.f12817b).k(this.f13004k);
        C1515d c1515d4 = this.f13005l;
        C1515d k11 = k10.h(c1515d4.f12816a, 0, c1515d4.f12817b).k(this.f13006m);
        C1515d c1515d5 = this.f13007n;
        C1515d k12 = k11.h(c1515d5.f12816a, 0, c1515d5.f12817b).k(this.f13008o);
        C1515d c1515d6 = this.f13009p;
        k12.h(c1515d6.f12816a, 0, c1515d6.f12817b);
        if (this.f13010q > 0) {
            C1515d k13 = c1515d.k(this.f12996c.D("ModulePackages")).i(this.f13011r.f12817b + 2).k(this.f13010q);
            C1515d c1515d7 = this.f13011r;
            k13.h(c1515d7.f12816a, 0, c1515d7.f12817b);
        }
        if (this.f13012s > 0) {
            c1515d.k(this.f12996c.D("ModuleMainClass")).i(2).k(this.f13012s);
        }
    }

    @Override // Y1.w
    public void a() {
    }
}
