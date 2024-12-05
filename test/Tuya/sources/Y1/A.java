package Y1;

import Y1.C1514c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class A extends z {

    /* renamed from: c, reason: collision with root package name */
    private final C f12757c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12758d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12759e;

    /* renamed from: f, reason: collision with root package name */
    private int f12760f;

    /* renamed from: g, reason: collision with root package name */
    private C1513b f12761g;

    /* renamed from: h, reason: collision with root package name */
    private C1513b f12762h;

    /* renamed from: i, reason: collision with root package name */
    private C1513b f12763i;

    /* renamed from: j, reason: collision with root package name */
    private C1513b f12764j;

    /* renamed from: k, reason: collision with root package name */
    private C1514c f12765k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(C c8, String str, String str2, String str3) {
        super(589824);
        this.f12757c = c8;
        this.f12758d = c8.D(str);
        this.f12759e = c8.D(str2);
        if (str3 != null) {
            this.f12760f = c8.D(str3);
        }
    }

    @Override // Y1.z
    public AbstractC1512a a(String str, boolean z8) {
        if (z8) {
            C1513b j8 = C1513b.j(this.f12757c, str, this.f12761g);
            this.f12761g = j8;
            return j8;
        }
        C1513b j9 = C1513b.j(this.f12757c, str, this.f12762h);
        this.f12762h = j9;
        return j9;
    }

    @Override // Y1.z
    public void b(C1514c c1514c) {
        c1514c.f12813c = this.f12765k;
        this.f12765k = c1514c;
    }

    @Override // Y1.z
    public AbstractC1512a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1513b i9 = C1513b.i(this.f12757c, i8, e8, str, this.f12763i);
            this.f12763i = i9;
            return i9;
        }
        C1513b i10 = C1513b.i(this.f12757c, i8, e8, str, this.f12764j);
        this.f12764j = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1514c.a aVar) {
        aVar.b(this.f12765k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int b8 = C1514c.b(this.f12757c, 0, this.f12760f) + 6 + C1513b.f(this.f12761g, this.f12762h, this.f12763i, this.f12764j);
        C1514c c1514c = this.f12765k;
        if (c1514c != null) {
            return b8 + c1514c.a(this.f12757c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1515d c1515d) {
        int i8;
        c1515d.k(this.f12758d).k(this.f12759e);
        if (this.f12760f != 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f12761g != null) {
            i8++;
        }
        if (this.f12762h != null) {
            i8++;
        }
        if (this.f12763i != null) {
            i8++;
        }
        if (this.f12764j != null) {
            i8++;
        }
        C1514c c1514c = this.f12765k;
        if (c1514c != null) {
            i8 += c1514c.d();
        }
        c1515d.k(i8);
        C1514c.f(this.f12757c, 0, this.f12760f, c1515d);
        C1513b.l(this.f12757c, this.f12761g, this.f12762h, this.f12763i, this.f12764j, c1515d);
        C1514c c1514c2 = this.f12765k;
        if (c1514c2 != null) {
            c1514c2.g(this.f12757c, c1515d);
        }
    }

    @Override // Y1.z
    public void c() {
    }
}
