package s7;

import E7.f;
import R6.AbstractC1331b;
import R6.AbstractC1348o;
import R6.C1347n;
import d7.AbstractC2565b;
import java.io.IOException;
import k7.C3133a;
import k7.h;
import k7.i;
import k7.j;
import k7.k;
import k7.m;
import l7.C3370c;
import l7.C3375h;
import m7.C3442b;
import n7.C3504a;
import o7.C3587a;
import r7.C3697b;
import t7.A;
import t7.C3797a;
import t7.r;
import t7.s;
import t7.x;
import t7.y;

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

    public static AbstractC2565b b(W6.b bVar) {
        C1347n m8 = bVar.q().m();
        if (m8.F(S6.a.f9647W)) {
            return new C3587a(e.e(bVar.q()), AbstractC1348o.x(bVar.t()).y());
        }
        if (m8.r(S6.a.f9677s)) {
            return new C3697b(AbstractC1348o.x(bVar.t()).y(), e.g(h.m(bVar.q().q())));
        }
        if (m8.r(S6.a.f9662f0)) {
            return new C3504a(a(AbstractC1348o.x(bVar.t()).y()));
        }
        if (m8.r(W6.a.f12034I0)) {
            byte[] y8 = AbstractC1348o.x(bVar.t()).y();
            AbstractC1331b r8 = bVar.r();
            if (f.a(y8, 0) == 1) {
                if (r8 != null) {
                    byte[] y9 = r8.y();
                    return C3375h.f(E7.a.h(y8, 4, y8.length), E7.a.h(y9, 4, y9.length));
                }
                return C3375h.e(E7.a.h(y8, 4, y8.length));
            }
            if (r8 != null) {
                return C3370c.b(E7.a.h(y8, 4, y8.length), r8.y());
            }
            return C3370c.a(E7.a.h(y8, 4, y8.length));
        }
        if (m8.r(S6.a.f9681w)) {
            i p8 = i.p(bVar.q().q());
            C1347n m9 = p8.q().m();
            m q8 = m.q(bVar.t());
            try {
                y.b o8 = new y.b(new x(p8.m(), e.b(m9))).l(q8.p()).q(q8.v()).p(q8.u()).n(q8.s()).o(q8.t());
                if (q8.w() != 0) {
                    o8.m(q8.r());
                }
                if (q8.m() != null) {
                    o8.k(((C3797a) A.f(q8.m(), C3797a.class)).h(m9));
                }
                return o8.j();
            } catch (ClassNotFoundException e8) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e8.getMessage());
            }
        }
        if (m8.r(k7.e.f33658F)) {
            j p9 = j.p(bVar.q().q());
            C1347n m10 = p9.r().m();
            try {
                k q9 = k.q(bVar.t());
                s.b p10 = new s.b(new r(p9.m(), p9.q(), e.b(m10))).m(q9.p()).r(q9.v()).q(q9.u()).o(q9.s()).p(q9.t());
                if (q9.w() != 0) {
                    p10.n(q9.r());
                }
                if (q9.m() != null) {
                    p10.l(((t7.b) A.f(q9.m(), t7.b.class)).f(m10));
                }
                return p10.k();
            } catch (ClassNotFoundException e9) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e9.getMessage());
            }
        }
        if (m8.r(k7.e.f33691n)) {
            C3133a r9 = C3133a.r(bVar.t());
            return new C3442b(r9.t(), r9.s(), r9.p(), r9.q(), r9.u(), e.c(r9.m().m()));
        }
        throw new RuntimeException("algorithm identifier in private key not recognised");
    }
}
