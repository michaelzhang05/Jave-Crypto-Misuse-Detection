package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3133a extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private int f33633a;

    /* renamed from: b, reason: collision with root package name */
    private int f33634b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f33635c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f33636d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f33637e;

    /* renamed from: f, reason: collision with root package name */
    private X6.a f33638f;

    public C3133a(int i8, int i9, D7.b bVar, D7.i iVar, D7.h hVar, X6.a aVar) {
        this.f33633a = i8;
        this.f33634b = i9;
        this.f33635c = bVar.e();
        this.f33636d = iVar.h();
        this.f33637e = hVar.a();
        this.f33638f = aVar;
    }

    public static C3133a r(Object obj) {
        if (obj instanceof C3133a) {
            return (C3133a) obj;
        }
        if (obj != null) {
            return new C3133a(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33633a));
        c1337e.a(new C1344k(this.f33634b));
        c1337e.a(new C1330a0(this.f33635c));
        c1337e.a(new C1330a0(this.f33636d));
        c1337e.a(new C1330a0(this.f33637e));
        c1337e.a(this.f33638f);
        return new C1338e0(c1337e);
    }

    public X6.a m() {
        return this.f33638f;
    }

    public D7.b p() {
        return new D7.b(this.f33635c);
    }

    public D7.i q() {
        return new D7.i(p(), this.f33636d);
    }

    public int s() {
        return this.f33634b;
    }

    public int t() {
        return this.f33633a;
    }

    public D7.h u() {
        return new D7.h(this.f33637e);
    }

    private C3133a(AbstractC1353u abstractC1353u) {
        this.f33633a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33634b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33635c = ((AbstractC1348o) abstractC1353u.x(2)).y();
        this.f33636d = ((AbstractC1348o) abstractC1353u.x(3)).y();
        this.f33637e = ((AbstractC1348o) abstractC1353u.x(4)).y();
        this.f33638f = X6.a.p(abstractC1353u.x(5));
    }
}
