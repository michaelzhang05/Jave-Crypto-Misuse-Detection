package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;

/* loaded from: classes5.dex */
public class d extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final int f35642a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35643b;

    /* renamed from: c, reason: collision with root package name */
    private final G7.a f35644c;

    public d(int i8, int i9, G7.a aVar) {
        this.f35642a = i8;
        this.f35643b = i9;
        this.f35644c = new G7.a(aVar);
    }

    public static d m(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(this.f35642a));
        c1446e.a(new C1453k(this.f35643b));
        c1446e.a(new C1439a0(this.f35644c.c()));
        return new C1447e0(c1446e);
    }

    public G7.a l() {
        return new G7.a(this.f35644c);
    }

    public int n() {
        return this.f35642a;
    }

    public int o() {
        return this.f35643b;
    }

    private d(AbstractC1462u abstractC1462u) {
        this.f35642a = ((C1453k) abstractC1462u.v(0)).B();
        this.f35643b = ((C1453k) abstractC1462u.v(1)).B();
        this.f35644c = new G7.a(((AbstractC1457o) abstractC1462u.v(2)).y());
    }
}
