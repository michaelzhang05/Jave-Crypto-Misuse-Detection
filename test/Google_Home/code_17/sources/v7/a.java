package v7;

import H7.f;
import U6.AbstractC1440b;
import U6.AbstractC1457o;
import U6.C1456n;
import g7.AbstractC2889b;
import java.io.IOException;
import n7.C3488a;
import n7.h;
import n7.i;
import n7.j;
import n7.k;
import n7.m;
import o7.C3719c;
import o7.C3724h;
import p7.C3785b;
import q7.C3883a;
import r7.C3977a;
import u7.C4070b;
import w7.A;
import w7.C4151a;
import w7.r;
import w7.s;
import w7.x;
import w7.y;

/* loaded from: classes5.dex */
public abstract class a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 != length; i8++) {
            sArr[i8] = f.h(bArr, i8 * 2);
        }
        return sArr;
    }

    public static AbstractC2889b b(Z6.b bVar) {
        C1456n l8 = bVar.n().l();
        if (l8.F(V6.a.f11290W)) {
            return new C3977a(e.e(bVar.n()), AbstractC1457o.v(bVar.q()).y());
        }
        if (l8.o(V6.a.f11320s)) {
            return new C4070b(AbstractC1457o.v(bVar.q()).y(), e.g(h.l(bVar.n().n())));
        }
        if (l8.o(V6.a.f11305f0)) {
            return new C3883a(a(AbstractC1457o.v(bVar.q()).y()));
        }
        if (l8.o(Z6.a.f13672I0)) {
            byte[] y8 = AbstractC1457o.v(bVar.q()).y();
            AbstractC1440b o8 = bVar.o();
            if (f.a(y8, 0) == 1) {
                if (o8 != null) {
                    byte[] y9 = o8.y();
                    return C3724h.f(H7.a.h(y8, 4, y8.length), H7.a.h(y9, 4, y9.length));
                }
                return C3724h.e(H7.a.h(y8, 4, y8.length));
            }
            if (o8 != null) {
                return C3719c.b(H7.a.h(y8, 4, y8.length), o8.y());
            }
            return C3719c.a(H7.a.h(y8, 4, y8.length));
        }
        if (l8.o(V6.a.f11324w)) {
            i m8 = i.m(bVar.n().n());
            C1456n l9 = m8.n().l();
            m n8 = m.n(bVar.q());
            try {
                y.b o9 = new y.b(new x(m8.l(), e.b(l9))).l(n8.m()).q(n8.t()).p(n8.r()).n(n8.p()).o(n8.q());
                if (n8.u() != 0) {
                    o9.m(n8.o());
                }
                if (n8.l() != null) {
                    o9.k(((C4151a) A.f(n8.l(), C4151a.class)).h(l9));
                }
                return o9.j();
            } catch (ClassNotFoundException e8) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e8.getMessage());
            }
        }
        if (l8.o(n7.e.f35650F)) {
            j m9 = j.m(bVar.n().n());
            C1456n l10 = m9.o().l();
            try {
                k n9 = k.n(bVar.q());
                s.b p8 = new s.b(new r(m9.l(), m9.n(), e.b(l10))).m(n9.m()).r(n9.t()).q(n9.r()).o(n9.p()).p(n9.q());
                if (n9.u() != 0) {
                    p8.n(n9.o());
                }
                if (n9.l() != null) {
                    p8.l(((w7.b) A.f(n9.l(), w7.b.class)).f(l10));
                }
                return p8.k();
            } catch (ClassNotFoundException e9) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e9.getMessage());
            }
        }
        if (l8.o(n7.e.f35683n)) {
            C3488a o10 = C3488a.o(bVar.q());
            return new C3785b(o10.q(), o10.p(), o10.m(), o10.n(), o10.r(), e.c(o10.l().l()));
        }
        throw new RuntimeException("algorithm identifier in private key not recognised");
    }
}
