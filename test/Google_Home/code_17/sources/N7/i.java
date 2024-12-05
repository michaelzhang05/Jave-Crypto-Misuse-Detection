package n7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import a7.C1677a;

/* loaded from: classes5.dex */
public class i extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final C1453k f35712a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35713b;

    /* renamed from: c, reason: collision with root package name */
    private final C1677a f35714c;

    public i(int i8, C1677a c1677a) {
        this.f35712a = new C1453k(0L);
        this.f35713b = i8;
        this.f35714c = c1677a;
    }

    public static i m(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(this.f35712a);
        c1446e.a(new C1453k(this.f35713b));
        c1446e.a(this.f35714c);
        return new C1447e0(c1446e);
    }

    public int l() {
        return this.f35713b;
    }

    public C1677a n() {
        return this.f35714c;
    }

    private i(AbstractC1462u abstractC1462u) {
        this.f35712a = C1453k.v(abstractC1462u.v(0));
        this.f35713b = C1453k.v(abstractC1462u.v(1)).B();
        this.f35714c = C1677a.m(abstractC1462u.v(2));
    }
}
