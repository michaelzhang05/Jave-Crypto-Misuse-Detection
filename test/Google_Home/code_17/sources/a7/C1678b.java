package a7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1446e;
import U6.C1447e0;
import U6.InterfaceC1444d;
import U6.Q;
import java.util.Enumeration;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1678b extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private C1677a f14371a;

    /* renamed from: b, reason: collision with root package name */
    private Q f14372b;

    public C1678b(AbstractC1462u abstractC1462u) {
        if (abstractC1462u.size() == 2) {
            Enumeration y8 = abstractC1462u.y();
            this.f14371a = C1677a.m(y8.nextElement());
            this.f14372b = Q.C(y8.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1462u.size());
        }
    }

    public static C1678b m(Object obj) {
        if (obj instanceof C1678b) {
            return (C1678b) obj;
        }
        if (obj != null) {
            return new C1678b(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e(2);
        c1446e.a(this.f14371a);
        c1446e.a(this.f14372b);
        return new C1447e0(c1446e);
    }

    public C1677a l() {
        return this.f14371a;
    }

    public Q n() {
        return this.f14372b;
    }

    public AbstractC1460s o() {
        return AbstractC1460s.p(this.f14372b.y());
    }

    public C1678b(C1677a c1677a, InterfaceC1444d interfaceC1444d) {
        this.f14372b = new Q(interfaceC1444d);
        this.f14371a = c1677a;
    }

    public C1678b(C1677a c1677a, byte[] bArr) {
        this.f14372b = new Q(bArr);
        this.f14371a = c1677a;
    }
}
