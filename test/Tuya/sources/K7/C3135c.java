package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3135c extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private int f33643a;

    /* renamed from: b, reason: collision with root package name */
    private int f33644b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f33645c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f33646d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f33647e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f33648f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f33649g;

    public C3135c(int i8, int i9, D7.b bVar, D7.i iVar, D7.h hVar, D7.h hVar2, D7.a aVar) {
        this.f33643a = i8;
        this.f33644b = i9;
        this.f33645c = bVar.e();
        this.f33646d = iVar.h();
        this.f33647e = aVar.c();
        this.f33648f = hVar.a();
        this.f33649g = hVar2.a();
    }

    public static C3135c q(Object obj) {
        if (obj instanceof C3135c) {
            return (C3135c) obj;
        }
        if (obj != null) {
            return new C3135c(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33643a));
        c1337e.a(new C1344k(this.f33644b));
        c1337e.a(new C1330a0(this.f33645c));
        c1337e.a(new C1330a0(this.f33646d));
        c1337e.a(new C1330a0(this.f33648f));
        c1337e.a(new C1330a0(this.f33649g));
        c1337e.a(new C1330a0(this.f33647e));
        return new C1338e0(c1337e);
    }

    public D7.b m() {
        return new D7.b(this.f33645c);
    }

    public D7.i p() {
        return new D7.i(m(), this.f33646d);
    }

    public int r() {
        return this.f33644b;
    }

    public int s() {
        return this.f33643a;
    }

    public D7.h t() {
        return new D7.h(this.f33648f);
    }

    public D7.h u() {
        return new D7.h(this.f33649g);
    }

    public D7.a v() {
        return new D7.a(this.f33647e);
    }

    private C3135c(AbstractC1353u abstractC1353u) {
        this.f33643a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33644b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33645c = ((AbstractC1348o) abstractC1353u.x(2)).y();
        this.f33646d = ((AbstractC1348o) abstractC1353u.x(3)).y();
        this.f33648f = ((AbstractC1348o) abstractC1353u.x(4)).y();
        this.f33649g = ((AbstractC1348o) abstractC1353u.x(5)).y();
        this.f33647e = ((AbstractC1348o) abstractC1353u.x(6)).y();
    }
}
