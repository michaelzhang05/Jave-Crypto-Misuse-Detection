package kotlin.reflect.x.internal.l0.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.l0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.j;
import kotlin.reflect.x.internal.l0.b.k;
import kotlin.reflect.x.internal.l0.b.p.c;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.r.m;
import kotlin.reflect.x.internal.l0.i.r.v;
import kotlin.reflect.x.internal.l0.l.b1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.x1.a;
import kotlin.s;

/* compiled from: functionTypes.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final int a(e0 e0Var) {
        l.f(e0Var, "<this>");
        c e2 = e0Var.getAnnotations().e(k.a.D);
        if (e2 == null) {
            return 0;
        }
        kotlin.reflect.x.internal.l0.i.r.g gVar = (kotlin.reflect.x.internal.l0.i.r.g) l0.j(e2.a(), k.f19707i);
        l.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((m) gVar).b().intValue();
    }

    public static final m0 b(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, e0 e0Var, List<? extends e0> list, List<? extends e0> list2, List<f> list3, e0 e0Var2, boolean z) {
        l.f(hVar, "builtIns");
        l.f(gVar, "annotations");
        l.f(list, "contextReceiverTypes");
        l.f(list2, "parameterTypes");
        l.f(e0Var2, "returnType");
        List<g1> g2 = g(e0Var, list, list2, list3, e0Var2, hVar);
        e f2 = f(hVar, list2.size() + list.size() + (e0Var == null ? 0 : 1), z);
        if (e0Var != null) {
            gVar = t(gVar, hVar);
        }
        if (!list.isEmpty()) {
            gVar = s(gVar, hVar, list.size());
        }
        return f0.g(b1.b(gVar), f2, g2);
    }

    public static final f d(e0 e0Var) {
        String b2;
        l.f(e0Var, "<this>");
        c e2 = e0Var.getAnnotations().e(k.a.E);
        if (e2 == null) {
            return null;
        }
        Object o0 = r.o0(e2.a().values());
        v vVar = o0 instanceof v ? (v) o0 : null;
        if (vVar != null && (b2 = vVar.b()) != null) {
            if (!f.B(b2)) {
                b2 = null;
            }
            if (b2 != null) {
                return f.r(b2);
            }
        }
        return null;
    }

    public static final List<e0> e(e0 e0Var) {
        int t;
        List<e0> i2;
        l.f(e0Var, "<this>");
        o(e0Var);
        int a = a(e0Var);
        if (a == 0) {
            i2 = t.i();
            return i2;
        }
        List<g1> subList = e0Var.M0().subList(0, a);
        t = u.t(subList, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            e0 type = ((g1) it.next()).getType();
            l.e(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final e f(h hVar, int i2, boolean z) {
        l.f(hVar, "builtIns");
        e X = z ? hVar.X(i2) : hVar.C(i2);
        l.e(X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return X;
    }

    public static final List<g1> g(e0 e0Var, List<? extends e0> list, List<? extends e0> list2, List<f> list3, e0 e0Var2, h hVar) {
        int t;
        f fVar;
        Map f2;
        List<? extends c> j0;
        l.f(list, "contextReceiverTypes");
        l.f(list2, "parameterTypes");
        l.f(e0Var2, "returnType");
        l.f(hVar, "builtIns");
        int i2 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (e0Var != null ? 1 : 0) + 1);
        t = u.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(a.a((e0) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, e0Var != null ? a.a(e0Var) : null);
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t.s();
            }
            e0 e0Var3 = (e0) obj;
            if (list3 == null || (fVar = list3.get(i2)) == null || fVar.x()) {
                fVar = null;
            }
            if (fVar != null) {
                kotlin.reflect.x.internal.l0.f.c cVar = k.a.E;
                f r = f.r("name");
                String f3 = fVar.f();
                l.e(f3, "name.asString()");
                f2 = n0.f(s.a(r, new v(f3)));
                j jVar = new j(hVar, cVar, f2);
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
                j0 = b0.j0(e0Var3.getAnnotations(), jVar);
                e0Var3 = a.u(e0Var3, aVar.a(j0));
            }
            arrayList.add(a.a(e0Var3));
            i2 = i3;
        }
        arrayList.add(a.a(e0Var2));
        return arrayList;
    }

    public static final kotlin.reflect.x.internal.l0.b.p.c h(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l.f(mVar, "<this>");
        if ((mVar instanceof e) && h.A0(mVar)) {
            return i(kotlin.reflect.x.internal.l0.i.t.a.i(mVar));
        }
        return null;
    }

    private static final kotlin.reflect.x.internal.l0.b.p.c i(d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        c.a aVar = kotlin.reflect.x.internal.l0.b.p.c.f19741f;
        String f2 = dVar.i().f();
        l.e(f2, "shortName().asString()");
        kotlin.reflect.x.internal.l0.f.c e2 = dVar.l().e();
        l.e(e2, "toSafe().parent()");
        return aVar.b(f2, e2);
    }

    public static final e0 j(e0 e0Var) {
        l.f(e0Var, "<this>");
        o(e0Var);
        if (!r(e0Var)) {
            return null;
        }
        return e0Var.M0().get(a(e0Var)).getType();
    }

    public static final e0 k(e0 e0Var) {
        l.f(e0Var, "<this>");
        o(e0Var);
        e0 type = ((g1) r.d0(e0Var.M0())).getType();
        l.e(type, "arguments.last().type");
        return type;
    }

    public static final List<g1> l(e0 e0Var) {
        l.f(e0Var, "<this>");
        o(e0Var);
        return e0Var.M0().subList(a(e0Var) + (m(e0Var) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean m(e0 e0Var) {
        l.f(e0Var, "<this>");
        return o(e0Var) && r(e0Var);
    }

    public static final boolean n(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l.f(mVar, "<this>");
        kotlin.reflect.x.internal.l0.b.p.c h2 = h(mVar);
        return h2 == kotlin.reflect.x.internal.l0.b.p.c.f19742g || h2 == kotlin.reflect.x.internal.l0.b.p.c.f19743h;
    }

    public static final boolean o(e0 e0Var) {
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        return w != null && n(w);
    }

    public static final boolean p(e0 e0Var) {
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        return (w != null ? h(w) : null) == kotlin.reflect.x.internal.l0.b.p.c.f19742g;
    }

    public static final boolean q(e0 e0Var) {
        l.f(e0Var, "<this>");
        h w = e0Var.O0().w();
        return (w != null ? h(w) : null) == kotlin.reflect.x.internal.l0.b.p.c.f19743h;
    }

    private static final boolean r(e0 e0Var) {
        return e0Var.getAnnotations().e(k.a.C) != null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.n1.g s(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, h hVar, int i2) {
        Map f2;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> j0;
        l.f(gVar, "<this>");
        l.f(hVar, "builtIns");
        kotlin.reflect.x.internal.l0.f.c cVar = k.a.D;
        if (gVar.A(cVar)) {
            return gVar;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
        f2 = n0.f(s.a(k.f19707i, new m(i2)));
        j0 = b0.j0(gVar, new j(hVar, cVar, f2));
        return aVar.a(j0);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.n1.g t(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, h hVar) {
        Map i2;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> j0;
        l.f(gVar, "<this>");
        l.f(hVar, "builtIns");
        kotlin.reflect.x.internal.l0.f.c cVar = k.a.C;
        if (gVar.A(cVar)) {
            return gVar;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
        i2 = o0.i();
        j0 = b0.j0(gVar, new j(hVar, cVar, i2));
        return aVar.a(j0);
    }
}
