package v7;

import U6.AbstractC1457o;
import U6.C1456n;
import a7.C1677a;
import a7.C1678b;
import g7.AbstractC2889b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import n7.C3489b;
import n7.j;
import n7.n;
import o7.C3720d;
import o7.C3725i;
import p7.C3786c;
import r7.C3978b;
import u7.C4071c;
import w7.r;
import w7.t;
import w7.x;
import w7.z;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map f40307a;

    /* loaded from: classes5.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            byte[] y8 = AbstractC1457o.v(c1678b.o()).y();
            if (H7.f.a(y8, 0) == 1) {
                return C3725i.a(H7.a.h(y8, 4, y8.length));
            }
            if (y8.length == 64) {
                y8 = H7.a.h(y8, 4, y8.length);
            }
            return C3720d.a(y8);
        }
    }

    /* renamed from: v7.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0914c extends g {
        private C0914c() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            C3489b n8 = C3489b.n(c1678b.o());
            return new C3786c(n8.o(), n8.p(), n8.m(), v7.e.c(n8.l().l()));
        }
    }

    /* loaded from: classes5.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            return new q7.b(c1678b.n().v());
        }
    }

    /* loaded from: classes5.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            return new C3978b(v7.e.e(c1678b.l()), c1678b.n().y());
        }
    }

    /* loaded from: classes5.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            return new C4071c(c1678b.n().v(), v7.e.g(n7.h.l(c1678b.l().n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class g {
        private g() {
        }

        abstract AbstractC2889b a(C1678b c1678b, Object obj);
    }

    /* loaded from: classes5.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            z.b f8;
            n7.i m8 = n7.i.m(c1678b.l().n());
            if (m8 != null) {
                C1456n l8 = m8.n().l();
                n l9 = n.l(c1678b.o());
                f8 = new z.b(new x(m8.l(), v7.e.b(l8))).g(l9.m()).h(l9.n());
            } else {
                byte[] y8 = AbstractC1457o.v(c1678b.o()).y();
                f8 = new z.b(x.k(H7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    /* loaded from: classes5.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // v7.c.g
        AbstractC2889b a(C1678b c1678b, Object obj) {
            t.b f8;
            j m8 = j.m(c1678b.l().n());
            if (m8 != null) {
                C1456n l8 = m8.o().l();
                n l9 = n.l(c1678b.o());
                f8 = new t.b(new r(m8.l(), m8.n(), v7.e.b(l8))).g(l9.m()).h(l9.n());
            } else {
                byte[] y8 = AbstractC1457o.v(c1678b.o()).y();
                f8 = new t.b(r.i(H7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f40307a = hashMap;
        hashMap.put(n7.e.f35668X, new e());
        f40307a.put(n7.e.f35669Y, new e());
        f40307a.put(n7.e.f35687r, new f());
        f40307a.put(n7.e.f35691v, new d());
        f40307a.put(n7.e.f35692w, new h());
        f40307a.put(n7.e.f35650F, new i());
        f40307a.put(W6.a.f12704a, new h());
        f40307a.put(W6.a.f12705b, new i());
        f40307a.put(Z6.a.f13672I0, new b());
        f40307a.put(n7.e.f35683n, new C0914c());
    }

    public static AbstractC2889b a(C1678b c1678b) {
        return b(c1678b, null);
    }

    public static AbstractC2889b b(C1678b c1678b, Object obj) {
        C1677a l8 = c1678b.l();
        g gVar = (g) f40307a.get(l8.l());
        if (gVar != null) {
            return gVar.a(c1678b, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + l8.l());
    }
}
