package b2;

import b2.C1963c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b2.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1957A extends z {

    /* renamed from: c, reason: collision with root package name */
    private final C1959C f15042c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15043d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15044e;

    /* renamed from: f, reason: collision with root package name */
    private int f15045f;

    /* renamed from: g, reason: collision with root package name */
    private C1962b f15046g;

    /* renamed from: h, reason: collision with root package name */
    private C1962b f15047h;

    /* renamed from: i, reason: collision with root package name */
    private C1962b f15048i;

    /* renamed from: j, reason: collision with root package name */
    private C1962b f15049j;

    /* renamed from: k, reason: collision with root package name */
    private C1963c f15050k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1957A(C1959C c1959c, String str, String str2, String str3) {
        super(589824);
        this.f15042c = c1959c;
        this.f15043d = c1959c.D(str);
        this.f15044e = c1959c.D(str2);
        if (str3 != null) {
            this.f15045f = c1959c.D(str3);
        }
    }

    @Override // b2.z
    public AbstractC1961a a(String str, boolean z8) {
        if (z8) {
            C1962b j8 = C1962b.j(this.f15042c, str, this.f15046g);
            this.f15046g = j8;
            return j8;
        }
        C1962b j9 = C1962b.j(this.f15042c, str, this.f15047h);
        this.f15047h = j9;
        return j9;
    }

    @Override // b2.z
    public void b(C1963c c1963c) {
        c1963c.f15098c = this.f15050k;
        this.f15050k = c1963c;
    }

    @Override // b2.z
    public AbstractC1961a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1962b i9 = C1962b.i(this.f15042c, i8, e8, str, this.f15048i);
            this.f15048i = i9;
            return i9;
        }
        C1962b i10 = C1962b.i(this.f15042c, i8, e8, str, this.f15049j);
        this.f15049j = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1963c.a aVar) {
        aVar.b(this.f15050k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int b8 = C1963c.b(this.f15042c, 0, this.f15045f) + 6 + C1962b.f(this.f15046g, this.f15047h, this.f15048i, this.f15049j);
        C1963c c1963c = this.f15050k;
        if (c1963c != null) {
            return b8 + c1963c.a(this.f15042c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1964d c1964d) {
        int i8;
        c1964d.k(this.f15043d).k(this.f15044e);
        if (this.f15045f != 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f15046g != null) {
            i8++;
        }
        if (this.f15047h != null) {
            i8++;
        }
        if (this.f15048i != null) {
            i8++;
        }
        if (this.f15049j != null) {
            i8++;
        }
        C1963c c1963c = this.f15050k;
        if (c1963c != null) {
            i8 += c1963c.d();
        }
        c1964d.k(i8);
        C1963c.f(this.f15042c, 0, this.f15045f, c1964d);
        C1962b.l(this.f15042c, this.f15046g, this.f15047h, this.f15048i, this.f15049j, c1964d);
        C1963c c1963c2 = this.f15050k;
        if (c1963c2 != null) {
            c1963c2.g(this.f15042c, c1964d);
        }
    }

    @Override // b2.z
    public void c() {
    }
}
