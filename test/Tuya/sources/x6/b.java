package X6;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1337e;
import R6.C1338e0;
import R6.InterfaceC1335d;
import R6.Q;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class b extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private a f12750a;

    /* renamed from: b, reason: collision with root package name */
    private Q f12751b;

    public b(AbstractC1353u abstractC1353u) {
        if (abstractC1353u.size() == 2) {
            Enumeration y8 = abstractC1353u.y();
            this.f12750a = a.p(y8.nextElement());
            this.f12751b = Q.C(y8.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1353u.size());
        }
    }

    public static b p(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e(2);
        c1337e.a(this.f12750a);
        c1337e.a(this.f12751b);
        return new C1338e0(c1337e);
    }

    public a m() {
        return this.f12750a;
    }

    public Q q() {
        return this.f12751b;
    }

    public AbstractC1351s r() {
        return AbstractC1351s.s(this.f12751b.y());
    }

    public b(a aVar, InterfaceC1335d interfaceC1335d) {
        this.f12751b = new Q(interfaceC1335d);
        this.f12750a = aVar;
    }

    public b(a aVar, byte[] bArr) {
        this.f12751b = new Q(bArr);
        this.f12750a = aVar;
    }
}
