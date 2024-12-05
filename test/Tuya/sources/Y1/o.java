package Y1;

import Y1.C1514c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    private final C f12890c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12891d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12892e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12893f;

    /* renamed from: g, reason: collision with root package name */
    private int f12894g;

    /* renamed from: h, reason: collision with root package name */
    private int f12895h;

    /* renamed from: i, reason: collision with root package name */
    private C1513b f12896i;

    /* renamed from: j, reason: collision with root package name */
    private C1513b f12897j;

    /* renamed from: k, reason: collision with root package name */
    private C1513b f12898k;

    /* renamed from: l, reason: collision with root package name */
    private C1513b f12899l;

    /* renamed from: m, reason: collision with root package name */
    private C1514c f12900m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(C c8, int i8, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f12890c = c8;
        this.f12891d = i8;
        this.f12892e = c8.D(str);
        this.f12893f = c8.D(str2);
        if (str3 != null) {
            this.f12894g = c8.D(str3);
        }
        if (obj != null) {
            this.f12895h = c8.d(obj).f12766a;
        }
    }

    @Override // Y1.n
    public AbstractC1512a a(String str, boolean z8) {
        if (z8) {
            C1513b j8 = C1513b.j(this.f12890c, str, this.f12896i);
            this.f12896i = j8;
            return j8;
        }
        C1513b j9 = C1513b.j(this.f12890c, str, this.f12897j);
        this.f12897j = j9;
        return j9;
    }

    @Override // Y1.n
    public void b(C1514c c1514c) {
        c1514c.f12813c = this.f12900m;
        this.f12900m = c1514c;
    }

    @Override // Y1.n
    public AbstractC1512a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1513b i9 = C1513b.i(this.f12890c, i8, e8, str, this.f12898k);
            this.f12898k = i9;
            return i9;
        }
        C1513b i10 = C1513b.i(this.f12890c, i8, e8, str, this.f12899l);
        this.f12899l = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1514c.a aVar) {
        aVar.b(this.f12900m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int i8;
        if (this.f12895h != 0) {
            this.f12890c.D("ConstantValue");
            i8 = 16;
        } else {
            i8 = 8;
        }
        int b8 = i8 + C1514c.b(this.f12890c, this.f12891d, this.f12894g) + C1513b.f(this.f12896i, this.f12897j, this.f12898k, this.f12899l);
        C1514c c1514c = this.f12900m;
        if (c1514c != null) {
            return b8 + c1514c.a(this.f12890c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1515d c1515d) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (this.f12890c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c1515d.k((~i8) & this.f12891d).k(this.f12892e).k(this.f12893f);
        if (this.f12895h != 0) {
            i9 = 1;
        }
        int i10 = this.f12891d;
        if ((i10 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f12894g != 0) {
            i9++;
        }
        if ((131072 & i10) != 0) {
            i9++;
        }
        if (this.f12896i != null) {
            i9++;
        }
        if (this.f12897j != null) {
            i9++;
        }
        if (this.f12898k != null) {
            i9++;
        }
        if (this.f12899l != null) {
            i9++;
        }
        C1514c c1514c = this.f12900m;
        if (c1514c != null) {
            i9 += c1514c.d();
        }
        c1515d.k(i9);
        if (this.f12895h != 0) {
            c1515d.k(this.f12890c.D("ConstantValue")).i(2).k(this.f12895h);
        }
        C1514c.f(this.f12890c, this.f12891d, this.f12894g, c1515d);
        C1513b.l(this.f12890c, this.f12896i, this.f12897j, this.f12898k, this.f12899l, c1515d);
        C1514c c1514c2 = this.f12900m;
        if (c1514c2 != null) {
            c1514c2.g(this.f12890c, c1515d);
        }
    }

    @Override // Y1.n
    public void c() {
    }
}
