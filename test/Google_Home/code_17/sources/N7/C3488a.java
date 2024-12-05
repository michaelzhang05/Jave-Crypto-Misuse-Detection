package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import a7.C1677a;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3488a extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private int f35625a;

    /* renamed from: b, reason: collision with root package name */
    private int f35626b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f35627c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f35628d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f35629e;

    /* renamed from: f, reason: collision with root package name */
    private C1677a f35630f;

    public C3488a(int i8, int i9, G7.b bVar, G7.i iVar, G7.h hVar, C1677a c1677a) {
        this.f35625a = i8;
        this.f35626b = i9;
        this.f35627c = bVar.e();
        this.f35628d = iVar.h();
        this.f35629e = hVar.a();
        this.f35630f = c1677a;
    }

    public static C3488a o(Object obj) {
        if (obj instanceof C3488a) {
            return (C3488a) obj;
        }
        if (obj != null) {
            return new C3488a(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(this.f35625a));
        c1446e.a(new C1453k(this.f35626b));
        c1446e.a(new C1439a0(this.f35627c));
        c1446e.a(new C1439a0(this.f35628d));
        c1446e.a(new C1439a0(this.f35629e));
        c1446e.a(this.f35630f);
        return new C1447e0(c1446e);
    }

    public C1677a l() {
        return this.f35630f;
    }

    public G7.b m() {
        return new G7.b(this.f35627c);
    }

    public G7.i n() {
        return new G7.i(m(), this.f35628d);
    }

    public int p() {
        return this.f35626b;
    }

    public int q() {
        return this.f35625a;
    }

    public G7.h r() {
        return new G7.h(this.f35629e);
    }

    private C3488a(AbstractC1462u abstractC1462u) {
        this.f35625a = ((C1453k) abstractC1462u.v(0)).B();
        this.f35626b = ((C1453k) abstractC1462u.v(1)).B();
        this.f35627c = ((AbstractC1457o) abstractC1462u.v(2)).y();
        this.f35628d = ((AbstractC1457o) abstractC1462u.v(3)).y();
        this.f35629e = ((AbstractC1457o) abstractC1462u.v(4)).y();
        this.f35630f = C1677a.m(abstractC1462u.v(5));
    }
}
