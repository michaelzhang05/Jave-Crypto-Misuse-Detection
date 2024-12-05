package kotlin.reflect.x.internal.l0.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.y;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.x1.a;

/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes2.dex */
public final class l {
    private static final y a;

    static {
        List<e1> e2;
        m mVar = new m(k.a.i(), k.f19708j);
        f fVar = f.INTERFACE;
        kotlin.reflect.x.internal.l0.f.f g2 = k.m.g();
        z0 z0Var = z0.a;
        n nVar = kotlin.reflect.x.internal.l0.k.f.f21159b;
        y yVar = new y(mVar, fVar, false, false, g2, z0Var, nVar);
        yVar.N0(d0.ABSTRACT);
        yVar.P0(t.f21863e);
        e2 = s.e(k0.S0(yVar, g.f21674c.b(), false, r1.IN_VARIANCE, kotlin.reflect.x.internal.l0.f.f.r("T"), 0, nVar));
        yVar.O0(e2);
        yVar.L0();
        a = yVar;
    }

    public static final m0 a(e0 e0Var) {
        int t;
        List e2;
        List l0;
        m0 b2;
        kotlin.jvm.internal.l.f(e0Var, "suspendFunType");
        g.q(e0Var);
        h h2 = a.h(e0Var);
        g annotations = e0Var.getAnnotations();
        e0 j2 = g.j(e0Var);
        List<e0> e3 = g.e(e0Var);
        List<g1> l = g.l(e0Var);
        t = u.t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((g1) it.next()).getType());
        }
        a1 h3 = a1.f21185g.h();
        kotlin.reflect.x.internal.l0.l.e1 g2 = a.g();
        kotlin.jvm.internal.l.e(g2, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        e2 = s.e(a.a(g.k(e0Var)));
        l0 = b0.l0(arrayList, f0.i(h3, g2, e2, false, null, 16, null));
        m0 I = a.h(e0Var).I();
        kotlin.jvm.internal.l.e(I, "suspendFunType.builtIns.nullableAnyType");
        b2 = g.b(h2, annotations, j2, e3, l0, null, I, (r17 & 128) != 0 ? false : false);
        return b2.S0(e0Var.P0());
    }
}
