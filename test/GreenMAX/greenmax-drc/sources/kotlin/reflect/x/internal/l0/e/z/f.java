package kotlin.reflect.x.internal.l0.e.z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.r;
import kotlin.reflect.x.internal.l0.e.s;

/* compiled from: protoTypeTableUtil.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final q a(q qVar, g gVar) {
        l.f(qVar, "<this>");
        l.f(gVar, "typeTable");
        if (qVar.l0()) {
            return qVar.T();
        }
        if (qVar.m0()) {
            return gVar.a(qVar.U());
        }
        return null;
    }

    public static final q b(r rVar, g gVar) {
        l.f(rVar, "<this>");
        l.f(gVar, "typeTable");
        if (rVar.f0()) {
            q V = rVar.V();
            l.e(V, "expandedType");
            return V;
        }
        if (rVar.g0()) {
            return gVar.a(rVar.W());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final q c(q qVar, g gVar) {
        l.f(qVar, "<this>");
        l.f(gVar, "typeTable");
        if (qVar.q0()) {
            return qVar.d0();
        }
        if (qVar.r0()) {
            return gVar.a(qVar.e0());
        }
        return null;
    }

    public static final boolean d(i iVar) {
        l.f(iVar, "<this>");
        return iVar.x0() || iVar.y0();
    }

    public static final boolean e(n nVar) {
        l.f(nVar, "<this>");
        return nVar.u0() || nVar.v0();
    }

    public static final q f(c cVar, g gVar) {
        l.f(cVar, "<this>");
        l.f(gVar, "typeTable");
        if (cVar.q1()) {
            return cVar.L0();
        }
        if (cVar.r1()) {
            return gVar.a(cVar.M0());
        }
        return null;
    }

    public static final q g(q qVar, g gVar) {
        l.f(qVar, "<this>");
        l.f(gVar, "typeTable");
        if (qVar.t0()) {
            return qVar.g0();
        }
        if (qVar.u0()) {
            return gVar.a(qVar.h0());
        }
        return null;
    }

    public static final q h(i iVar, g gVar) {
        l.f(iVar, "<this>");
        l.f(gVar, "typeTable");
        if (iVar.x0()) {
            return iVar.h0();
        }
        if (iVar.y0()) {
            return gVar.a(iVar.i0());
        }
        return null;
    }

    public static final q i(n nVar, g gVar) {
        l.f(nVar, "<this>");
        l.f(gVar, "typeTable");
        if (nVar.u0()) {
            return nVar.g0();
        }
        if (nVar.v0()) {
            return gVar.a(nVar.h0());
        }
        return null;
    }

    public static final q j(i iVar, g gVar) {
        l.f(iVar, "<this>");
        l.f(gVar, "typeTable");
        if (iVar.z0()) {
            q j0 = iVar.j0();
            l.e(j0, "returnType");
            return j0;
        }
        if (iVar.A0()) {
            return gVar.a(iVar.k0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final q k(n nVar, g gVar) {
        l.f(nVar, "<this>");
        l.f(gVar, "typeTable");
        if (nVar.w0()) {
            q i0 = nVar.i0();
            l.e(i0, "returnType");
            return i0;
        }
        if (nVar.x0()) {
            return gVar.a(nVar.j0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final List<q> l(c cVar, g gVar) {
        int t;
        l.f(cVar, "<this>");
        l.f(gVar, "typeTable");
        List<q> c1 = cVar.c1();
        if (!(!c1.isEmpty())) {
            c1 = null;
        }
        if (c1 == null) {
            List<Integer> b1 = cVar.b1();
            l.e(b1, "supertypeIdList");
            t = u.t(b1, 10);
            c1 = new ArrayList<>(t);
            for (Integer num : b1) {
                l.e(num, "it");
                c1.add(gVar.a(num.intValue()));
            }
        }
        return c1;
    }

    public static final q m(q.b bVar, g gVar) {
        l.f(bVar, "<this>");
        l.f(gVar, "typeTable");
        if (bVar.D()) {
            return bVar.A();
        }
        if (bVar.E()) {
            return gVar.a(bVar.B());
        }
        return null;
    }

    public static final q n(kotlin.reflect.x.internal.l0.e.u uVar, g gVar) {
        l.f(uVar, "<this>");
        l.f(gVar, "typeTable");
        if (uVar.U()) {
            q O = uVar.O();
            l.e(O, "type");
            return O;
        }
        if (uVar.V()) {
            return gVar.a(uVar.P());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final q o(r rVar, g gVar) {
        l.f(rVar, "<this>");
        l.f(gVar, "typeTable");
        if (rVar.j0()) {
            q c0 = rVar.c0();
            l.e(c0, "underlyingType");
            return c0;
        }
        if (rVar.k0()) {
            return gVar.a(rVar.d0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final List<q> p(s sVar, g gVar) {
        int t;
        l.f(sVar, "<this>");
        l.f(gVar, "typeTable");
        List<q> U = sVar.U();
        if (!(!U.isEmpty())) {
            U = null;
        }
        if (U == null) {
            List<Integer> T = sVar.T();
            l.e(T, "upperBoundIdList");
            t = u.t(T, 10);
            U = new ArrayList<>(t);
            for (Integer num : T) {
                l.e(num, "it");
                U.add(gVar.a(num.intValue()));
            }
        }
        return U;
    }

    public static final q q(kotlin.reflect.x.internal.l0.e.u uVar, g gVar) {
        l.f(uVar, "<this>");
        l.f(gVar, "typeTable");
        if (uVar.W()) {
            return uVar.Q();
        }
        if (uVar.X()) {
            return gVar.a(uVar.R());
        }
        return null;
    }
}
