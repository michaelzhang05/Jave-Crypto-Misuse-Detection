package b2;

import b2.C1963c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    private final C1959C f15175c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15176d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15177e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15178f;

    /* renamed from: g, reason: collision with root package name */
    private int f15179g;

    /* renamed from: h, reason: collision with root package name */
    private int f15180h;

    /* renamed from: i, reason: collision with root package name */
    private C1962b f15181i;

    /* renamed from: j, reason: collision with root package name */
    private C1962b f15182j;

    /* renamed from: k, reason: collision with root package name */
    private C1962b f15183k;

    /* renamed from: l, reason: collision with root package name */
    private C1962b f15184l;

    /* renamed from: m, reason: collision with root package name */
    private C1963c f15185m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(C1959C c1959c, int i8, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f15175c = c1959c;
        this.f15176d = i8;
        this.f15177e = c1959c.D(str);
        this.f15178f = c1959c.D(str2);
        if (str3 != null) {
            this.f15179g = c1959c.D(str3);
        }
        if (obj != null) {
            this.f15180h = c1959c.d(obj).f15051a;
        }
    }

    @Override // b2.n
    public AbstractC1961a a(String str, boolean z8) {
        if (z8) {
            C1962b j8 = C1962b.j(this.f15175c, str, this.f15181i);
            this.f15181i = j8;
            return j8;
        }
        C1962b j9 = C1962b.j(this.f15175c, str, this.f15182j);
        this.f15182j = j9;
        return j9;
    }

    @Override // b2.n
    public void b(C1963c c1963c) {
        c1963c.f15098c = this.f15185m;
        this.f15185m = c1963c;
    }

    @Override // b2.n
    public AbstractC1961a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15175c, i8, e8, str, this.f15183k);
            this.f15183k = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15175c, i8, e8, str, this.f15184l);
        this.f15184l = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1963c.a aVar) {
        aVar.b(this.f15185m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int i8;
        if (this.f15180h != 0) {
            this.f15175c.D("ConstantValue");
            i8 = 16;
        } else {
            i8 = 8;
        }
        int b8 = i8 + C1963c.b(this.f15175c, this.f15176d, this.f15179g) + C1962b.f(this.f15181i, this.f15182j, this.f15183k, this.f15184l);
        C1963c c1963c = this.f15185m;
        if (c1963c != null) {
            return b8 + c1963c.a(this.f15175c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1964d c1964d) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (this.f15175c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c1964d.k((~i8) & this.f15176d).k(this.f15177e).k(this.f15178f);
        if (this.f15180h != 0) {
            i9 = 1;
        }
        int i10 = this.f15176d;
        if ((i10 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f15179g != 0) {
            i9++;
        }
        if ((131072 & i10) != 0) {
            i9++;
        }
        if (this.f15181i != null) {
            i9++;
        }
        if (this.f15182j != null) {
            i9++;
        }
        if (this.f15183k != null) {
            i9++;
        }
        if (this.f15184l != null) {
            i9++;
        }
        C1963c c1963c = this.f15185m;
        if (c1963c != null) {
            i9 += c1963c.d();
        }
        c1964d.k(i9);
        if (this.f15180h != 0) {
            c1964d.k(this.f15175c.D("ConstantValue")).i(2).k(this.f15180h);
        }
        C1963c.f(this.f15175c, this.f15176d, this.f15179g, c1964d);
        C1962b.l(this.f15175c, this.f15181i, this.f15182j, this.f15183k, this.f15184l, c1964d);
        C1963c c1963c2 = this.f15185m;
        if (c1963c2 != null) {
            c1963c2.g(this.f15175c, c1964d);
        }
    }

    @Override // b2.n
    public void c() {
    }
}
