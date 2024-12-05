package n7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import a7.C1677a;

/* loaded from: classes5.dex */
public class h extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final C1453k f35710a;

    /* renamed from: b, reason: collision with root package name */
    private final C1677a f35711b;

    private h(AbstractC1462u abstractC1462u) {
        this.f35710a = C1453k.v(abstractC1462u.v(0));
        this.f35711b = C1677a.m(abstractC1462u.v(1));
    }

    public static final h l(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(this.f35710a);
        c1446e.a(this.f35711b);
        return new C1447e0(c1446e);
    }

    public C1677a m() {
        return this.f35711b;
    }

    public h(C1677a c1677a) {
        this.f35710a = new C1453k(0L);
        this.f35711b = c1677a;
    }
}
