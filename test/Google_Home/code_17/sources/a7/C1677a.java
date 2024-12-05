package a7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1446e;
import U6.C1447e0;
import U6.C1456n;
import U6.InterfaceC1444d;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1677a extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private C1456n f14369a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1444d f14370b;

    public C1677a(C1456n c1456n) {
        this.f14369a = c1456n;
    }

    public static C1677a m(Object obj) {
        if (obj instanceof C1677a) {
            return (C1677a) obj;
        }
        if (obj != null) {
            return new C1677a(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e(2);
        c1446e.a(this.f14369a);
        InterfaceC1444d interfaceC1444d = this.f14370b;
        if (interfaceC1444d != null) {
            c1446e.a(interfaceC1444d);
        }
        return new C1447e0(c1446e);
    }

    public C1456n l() {
        return this.f14369a;
    }

    public InterfaceC1444d n() {
        return this.f14370b;
    }

    public C1677a(C1456n c1456n, InterfaceC1444d interfaceC1444d) {
        this.f14369a = c1456n;
        this.f14370b = interfaceC1444d;
    }

    private C1677a(AbstractC1462u abstractC1462u) {
        if (abstractC1462u.size() >= 1 && abstractC1462u.size() <= 2) {
            this.f14369a = C1456n.B(abstractC1462u.v(0));
            this.f14370b = abstractC1462u.size() == 2 ? abstractC1462u.v(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1462u.size());
        }
    }
}
