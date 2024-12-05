package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3490c extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private int f35635a;

    /* renamed from: b, reason: collision with root package name */
    private int f35636b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f35637c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f35638d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f35639e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f35640f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f35641g;

    public C3490c(int i8, int i9, G7.b bVar, G7.i iVar, G7.h hVar, G7.h hVar2, G7.a aVar) {
        this.f35635a = i8;
        this.f35636b = i9;
        this.f35637c = bVar.e();
        this.f35638d = iVar.h();
        this.f35639e = aVar.c();
        this.f35640f = hVar.a();
        this.f35641g = hVar2.a();
    }

    public static C3490c n(Object obj) {
        if (obj instanceof C3490c) {
            return (C3490c) obj;
        }
        if (obj != null) {
            return new C3490c(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(this.f35635a));
        c1446e.a(new C1453k(this.f35636b));
        c1446e.a(new C1439a0(this.f35637c));
        c1446e.a(new C1439a0(this.f35638d));
        c1446e.a(new C1439a0(this.f35640f));
        c1446e.a(new C1439a0(this.f35641g));
        c1446e.a(new C1439a0(this.f35639e));
        return new C1447e0(c1446e);
    }

    public G7.b l() {
        return new G7.b(this.f35637c);
    }

    public G7.i m() {
        return new G7.i(l(), this.f35638d);
    }

    public int o() {
        return this.f35636b;
    }

    public int p() {
        return this.f35635a;
    }

    public G7.h q() {
        return new G7.h(this.f35640f);
    }

    public G7.h r() {
        return new G7.h(this.f35641g);
    }

    public G7.a t() {
        return new G7.a(this.f35639e);
    }

    private C3490c(AbstractC1462u abstractC1462u) {
        this.f35635a = ((C1453k) abstractC1462u.v(0)).B();
        this.f35636b = ((C1453k) abstractC1462u.v(1)).B();
        this.f35637c = ((AbstractC1457o) abstractC1462u.v(2)).y();
        this.f35638d = ((AbstractC1457o) abstractC1462u.v(3)).y();
        this.f35640f = ((AbstractC1457o) abstractC1462u.v(4)).y();
        this.f35641g = ((AbstractC1457o) abstractC1462u.v(5)).y();
        this.f35639e = ((AbstractC1457o) abstractC1462u.v(6)).y();
    }
}
