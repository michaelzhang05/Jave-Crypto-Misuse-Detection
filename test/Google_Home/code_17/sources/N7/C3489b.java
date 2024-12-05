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

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3489b extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final int f35631a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35632b;

    /* renamed from: c, reason: collision with root package name */
    private final G7.a f35633c;

    /* renamed from: d, reason: collision with root package name */
    private final C1677a f35634d;

    public C3489b(int i8, int i9, G7.a aVar, C1677a c1677a) {
        this.f35631a = i8;
        this.f35632b = i9;
        this.f35633c = new G7.a(aVar.c());
        this.f35634d = c1677a;
    }

    public static C3489b n(Object obj) {
        if (obj instanceof C3489b) {
            return (C3489b) obj;
        }
        if (obj != null) {
            return new C3489b(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(this.f35631a));
        c1446e.a(new C1453k(this.f35632b));
        c1446e.a(new C1439a0(this.f35633c.c()));
        c1446e.a(this.f35634d);
        return new C1447e0(c1446e);
    }

    public C1677a l() {
        return this.f35634d;
    }

    public G7.a m() {
        return this.f35633c;
    }

    public int o() {
        return this.f35631a;
    }

    public int p() {
        return this.f35632b;
    }

    private C3489b(AbstractC1462u abstractC1462u) {
        this.f35631a = ((C1453k) abstractC1462u.v(0)).B();
        this.f35632b = ((C1453k) abstractC1462u.v(1)).B();
        this.f35633c = new G7.a(((AbstractC1457o) abstractC1462u.v(2)).y());
        this.f35634d = C1677a.m(abstractC1462u.v(3));
    }
}
