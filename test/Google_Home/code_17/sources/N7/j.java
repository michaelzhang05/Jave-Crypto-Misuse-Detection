package n7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import a7.C1677a;

/* loaded from: classes5.dex */
public class j extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final C1453k f35715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35716b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35717c;

    /* renamed from: d, reason: collision with root package name */
    private final C1677a f35718d;

    public j(int i8, int i9, C1677a c1677a) {
        this.f35715a = new C1453k(0L);
        this.f35716b = i8;
        this.f35717c = i9;
        this.f35718d = c1677a;
    }

    public static j m(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(this.f35715a);
        c1446e.a(new C1453k(this.f35716b));
        c1446e.a(new C1453k(this.f35717c));
        c1446e.a(this.f35718d);
        return new C1447e0(c1446e);
    }

    public int l() {
        return this.f35716b;
    }

    public int n() {
        return this.f35717c;
    }

    public C1677a o() {
        return this.f35718d;
    }

    private j(AbstractC1462u abstractC1462u) {
        this.f35715a = C1453k.v(abstractC1462u.v(0));
        this.f35716b = C1453k.v(abstractC1462u.v(1)).B();
        this.f35717c = C1453k.v(abstractC1462u.v(2)).B();
        this.f35718d = C1677a.m(abstractC1462u.v(3));
    }
}
