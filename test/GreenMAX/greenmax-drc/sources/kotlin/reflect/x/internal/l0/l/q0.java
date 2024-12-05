package kotlin.reflect.x.internal.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.t1.i;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class q0 {
    public static final a a(e0 e0Var) {
        l.f(e0Var, "<this>");
        q1 R0 = e0Var.R0();
        if (R0 instanceof a) {
            return (a) R0;
        }
        return null;
    }

    public static final m0 b(e0 e0Var) {
        l.f(e0Var, "<this>");
        a a = a(e0Var);
        if (a != null) {
            return a.a1();
        }
        return null;
    }

    public static final boolean c(e0 e0Var) {
        l.f(e0Var, "<this>");
        return e0Var.R0() instanceof p;
    }

    private static final d0 d(d0 d0Var) {
        int t;
        e0 e0Var;
        Collection<e0> a = d0Var.a();
        t = u.t(a, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = a.iterator();
        boolean z = false;
        while (true) {
            e0Var = null;
            if (!it.hasNext()) {
                break;
            }
            e0 e0Var2 = (e0) it.next();
            if (n1.l(e0Var2)) {
                e0Var2 = f(e0Var2.R0(), false, 1, null);
                z = true;
            }
            arrayList.add(e0Var2);
        }
        if (!z) {
            return null;
        }
        e0 i2 = d0Var.i();
        if (i2 != null) {
            if (n1.l(i2)) {
                i2 = f(i2.R0(), false, 1, null);
            }
            e0Var = i2;
        }
        return new d0(arrayList).m(e0Var);
    }

    public static final q1 e(q1 q1Var, boolean z) {
        l.f(q1Var, "<this>");
        p b2 = p.f21280g.b(q1Var, z);
        if (b2 != null) {
            return b2;
        }
        m0 g2 = g(q1Var);
        return g2 != null ? g2 : q1Var.S0(false);
    }

    public static /* synthetic */ q1 f(q1 q1Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return e(q1Var, z);
    }

    private static final m0 g(e0 e0Var) {
        d0 d2;
        e1 O0 = e0Var.O0();
        d0 d0Var = O0 instanceof d0 ? (d0) O0 : null;
        if (d0Var == null || (d2 = d(d0Var)) == null) {
            return null;
        }
        return d2.h();
    }

    public static final m0 h(m0 m0Var, boolean z) {
        l.f(m0Var, "<this>");
        p b2 = p.f21280g.b(m0Var, z);
        if (b2 != null) {
            return b2;
        }
        m0 g2 = g(m0Var);
        return g2 == null ? m0Var.S0(false) : g2;
    }

    public static /* synthetic */ m0 i(m0 m0Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return h(m0Var, z);
    }

    public static final m0 j(m0 m0Var, m0 m0Var2) {
        l.f(m0Var, "<this>");
        l.f(m0Var2, "abbreviatedType");
        return g0.a(m0Var) ? m0Var : new a(m0Var, m0Var2);
    }

    public static final i k(i iVar) {
        l.f(iVar, "<this>");
        return new i(iVar.X0(), iVar.O0(), iVar.Z0(), iVar.N0(), iVar.P0(), true);
    }
}
