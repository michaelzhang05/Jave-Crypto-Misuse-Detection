package s7;

import R6.AbstractC1348o;
import R6.C1347n;
import d7.AbstractC2565b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import k7.C3134b;
import k7.j;
import k7.n;
import l7.C3371d;
import l7.C3376i;
import m7.C3443c;
import o7.C3588b;
import r7.C3698c;
import t7.r;
import t7.t;
import t7.x;
import t7.z;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map f38034a;

    /* loaded from: classes5.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            byte[] y8 = AbstractC1348o.x(bVar.r()).y();
            if (E7.f.a(y8, 0) == 1) {
                return C3376i.a(E7.a.h(y8, 4, y8.length));
            }
            if (y8.length == 64) {
                y8 = E7.a.h(y8, 4, y8.length);
            }
            return C3371d.a(y8);
        }
    }

    /* renamed from: s7.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0878c extends g {
        private C0878c() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            C3134b q8 = C3134b.q(bVar.r());
            return new C3443c(q8.r(), q8.s(), q8.p(), s7.e.c(q8.m().m()));
        }
    }

    /* loaded from: classes5.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            return new n7.b(bVar.q().x());
        }
    }

    /* loaded from: classes5.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            return new C3588b(s7.e.e(bVar.m()), bVar.q().y());
        }
    }

    /* loaded from: classes5.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            return new C3698c(bVar.q().x(), s7.e.g(k7.h.m(bVar.m().q())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class g {
        private g() {
        }

        abstract AbstractC2565b a(X6.b bVar, Object obj);
    }

    /* loaded from: classes5.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            z.b f8;
            k7.i p8 = k7.i.p(bVar.m().q());
            if (p8 != null) {
                C1347n m8 = p8.q().m();
                n m9 = n.m(bVar.r());
                f8 = new z.b(new x(p8.m(), s7.e.b(m8))).g(m9.p()).h(m9.q());
            } else {
                byte[] y8 = AbstractC1348o.x(bVar.r()).y();
                f8 = new z.b(x.k(E7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    /* loaded from: classes5.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // s7.c.g
        AbstractC2565b a(X6.b bVar, Object obj) {
            t.b f8;
            j p8 = j.p(bVar.m().q());
            if (p8 != null) {
                C1347n m8 = p8.r().m();
                n m9 = n.m(bVar.r());
                f8 = new t.b(new r(p8.m(), p8.q(), s7.e.b(m8))).g(m9.p()).h(m9.q());
            } else {
                byte[] y8 = AbstractC1348o.x(bVar.r()).y();
                f8 = new t.b(r.i(E7.f.a(y8, 0))).f(y8);
            }
            return f8.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f38034a = hashMap;
        hashMap.put(k7.e.f33676X, new e());
        f38034a.put(k7.e.f33677Y, new e());
        f38034a.put(k7.e.f33695r, new f());
        f38034a.put(k7.e.f33699v, new d());
        f38034a.put(k7.e.f33700w, new h());
        f38034a.put(k7.e.f33658F, new i());
        f38034a.put(T6.a.f11047a, new h());
        f38034a.put(T6.a.f11048b, new i());
        f38034a.put(W6.a.f12034I0, new b());
        f38034a.put(k7.e.f33691n, new C0878c());
    }

    public static AbstractC2565b a(X6.b bVar) {
        return b(bVar, null);
    }

    public static AbstractC2565b b(X6.b bVar, Object obj) {
        X6.a m8 = bVar.m();
        g gVar = (g) f38034a.get(m8.m());
        if (gVar != null) {
            return gVar.a(bVar, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + m8.m());
    }
}
