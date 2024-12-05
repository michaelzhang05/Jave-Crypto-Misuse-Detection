package kotlin.reflect.x.internal.l0.l.x1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.l.b1;
import kotlin.reflect.x.internal.l0.l.e;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.k1;
import kotlin.reflect.x.internal.l0.l.l1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.p;
import kotlin.reflect.x.internal.l0.l.p1;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.s0;
import kotlin.reflect.x.internal.l0.l.u0;
import kotlin.reflect.x.internal.l0.l.y;

/* compiled from: TypeUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.f0.x.e.l0.l.x1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0358a extends Lambda implements Function1<q1, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0358a f21385f = new C0358a();

        C0358a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q1 q1Var) {
            l.f(q1Var, "it");
            h w = q1Var.O0().w();
            return Boolean.valueOf(w != null ? a.p(w) : false);
        }
    }

    /* compiled from: TypeUtils.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<q1, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21386f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q1 q1Var) {
            l.f(q1Var, "it");
            h w = q1Var.O0().w();
            boolean z = false;
            if (w != null && ((w instanceof d1) || (w instanceof e1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final g1 a(e0 e0Var) {
        l.f(e0Var, "<this>");
        return new i1(e0Var);
    }

    public static final boolean b(e0 e0Var, Function1<? super q1, Boolean> function1) {
        l.f(e0Var, "<this>");
        l.f(function1, "predicate");
        return n1.c(e0Var, function1);
    }

    private static final boolean c(e0 e0Var, kotlin.reflect.x.internal.l0.l.e1 e1Var, Set<? extends e1> set) {
        Iterable<IndexedValue> E0;
        boolean z;
        if (l.a(e0Var.O0(), e1Var)) {
            return true;
        }
        h w = e0Var.O0().w();
        i iVar = w instanceof i ? (i) w : null;
        List<e1> w2 = iVar != null ? iVar.w() : null;
        E0 = b0.E0(e0Var.M0());
        if (!(E0 instanceof Collection) || !((Collection) E0).isEmpty()) {
            for (IndexedValue indexedValue : E0) {
                int index = indexedValue.getIndex();
                g1 g1Var = (g1) indexedValue.b();
                e1 e1Var2 = w2 != null ? (e1) r.U(w2, index) : null;
                if (((e1Var2 == null || set == null || !set.contains(e1Var2)) ? false : true) || g1Var.c()) {
                    z = false;
                } else {
                    e0 type = g1Var.getType();
                    l.e(type, "argument.type");
                    z = c(type, e1Var, set);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(e0 e0Var) {
        l.f(e0Var, "<this>");
        return b(e0Var, C0358a.f21385f);
    }

    public static final g1 e(e0 e0Var, r1 r1Var, e1 e1Var) {
        l.f(e0Var, "type");
        l.f(r1Var, "projectionKind");
        if ((e1Var != null ? e1Var.n() : null) == r1Var) {
            r1Var = r1.INVARIANT;
        }
        return new i1(r1Var, e0Var);
    }

    public static final Set<e1> f(e0 e0Var, Set<? extends e1> set) {
        l.f(e0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g(e0Var, e0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void g(e0 e0Var, e0 e0Var2, Set<e1> set, Set<? extends e1> set2) {
        boolean J;
        h w = e0Var.O0().w();
        if (w instanceof e1) {
            if (!l.a(e0Var.O0(), e0Var2.O0())) {
                set.add(w);
                return;
            }
            for (e0 e0Var3 : ((e1) w).getUpperBounds()) {
                l.e(e0Var3, "upperBound");
                g(e0Var3, e0Var2, set, set2);
            }
            return;
        }
        h w2 = e0Var.O0().w();
        i iVar = w2 instanceof i ? (i) w2 : null;
        List<e1> w3 = iVar != null ? iVar.w() : null;
        int i2 = 0;
        for (g1 g1Var : e0Var.M0()) {
            int i3 = i2 + 1;
            e1 e1Var = w3 != null ? (e1) r.U(w3, i2) : null;
            if (!((e1Var == null || set2 == null || !set2.contains(e1Var)) ? false : true) && !g1Var.c()) {
                J = b0.J(set, g1Var.getType().O0().w());
                if (!J && !l.a(g1Var.getType().O0(), e0Var2.O0())) {
                    e0 type = g1Var.getType();
                    l.e(type, "argument.type");
                    g(type, e0Var2, set, set2);
                }
            }
            i2 = i3;
        }
    }

    public static final kotlin.reflect.x.internal.l0.b.h h(e0 e0Var) {
        l.f(e0Var, "<this>");
        kotlin.reflect.x.internal.l0.b.h o = e0Var.O0().o();
        l.e(o, "constructor.builtIns");
        return o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.x.internal.l0.l.e0 i(kotlin.reflect.jvm.internal.impl.descriptors.e1 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.jvm.internal.l.e(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.l.e(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            kotlin.f0.x.e.l0.l.e0 r4 = (kotlin.reflect.x.internal.l0.l.e0) r4
            kotlin.f0.x.e.l0.l.e1 r4 = r4.O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.w()
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e
            if (r5 == 0) goto L39
            r3 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE
            if (r5 == r6) goto L4e
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            kotlin.f0.x.e.l0.l.e0 r3 = (kotlin.reflect.x.internal.l0.l.e0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.l.e(r7, r1)
            java.lang.Object r7 = kotlin.collections.r.R(r7)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.l.e(r7, r0)
            r3 = r7
            kotlin.f0.x.e.l0.l.e0 r3 = (kotlin.reflect.x.internal.l0.l.e0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.x1.a.i(kotlin.reflect.jvm.internal.impl.descriptors.e1):kotlin.f0.x.e.l0.l.e0");
    }

    public static final boolean j(e1 e1Var) {
        l.f(e1Var, "typeParameter");
        return l(e1Var, null, null, 6, null);
    }

    public static final boolean k(e1 e1Var, kotlin.reflect.x.internal.l0.l.e1 e1Var2, Set<? extends e1> set) {
        l.f(e1Var, "typeParameter");
        List<e0> upperBounds = e1Var.getUpperBounds();
        l.e(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (e0 e0Var : upperBounds) {
                l.e(e0Var, "upperBound");
                if (c(e0Var, e1Var.s().O0(), set) && (e1Var2 == null || l.a(e0Var.O0(), e1Var2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean l(e1 e1Var, kotlin.reflect.x.internal.l0.l.e1 e1Var2, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            e1Var2 = null;
        }
        if ((i2 & 4) != 0) {
            set = null;
        }
        return k(e1Var, e1Var2, set);
    }

    public static final boolean m(e0 e0Var) {
        l.f(e0Var, "<this>");
        if (!(e0Var instanceof e)) {
            if (!((e0Var instanceof p) && (((p) e0Var).a1() instanceof e))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(e0 e0Var) {
        l.f(e0Var, "<this>");
        if (!(e0Var instanceof u0)) {
            if (!((e0Var instanceof p) && (((p) e0Var).a1() instanceof u0))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(e0 e0Var, e0 e0Var2) {
        l.f(e0Var, "<this>");
        l.f(e0Var2, "superType");
        return kotlin.reflect.x.internal.l0.l.t1.e.a.d(e0Var, e0Var2);
    }

    public static final boolean p(h hVar) {
        l.f(hVar, "<this>");
        return (hVar instanceof e1) && (((e1) hVar).b() instanceof d1);
    }

    public static final boolean q(e0 e0Var) {
        l.f(e0Var, "<this>");
        return n1.m(e0Var);
    }

    public static final boolean r(e0 e0Var) {
        l.f(e0Var, "type");
        return (e0Var instanceof kotlin.reflect.x.internal.l0.l.u1.h) && ((kotlin.reflect.x.internal.l0.l.u1.h) e0Var).Y0().i();
    }

    public static final e0 s(e0 e0Var) {
        l.f(e0Var, "<this>");
        e0 n = n1.n(e0Var);
        l.e(n, "makeNotNullable(this)");
        return n;
    }

    public static final e0 t(e0 e0Var) {
        l.f(e0Var, "<this>");
        e0 o = n1.o(e0Var);
        l.e(o, "makeNullable(this)");
        return o;
    }

    public static final e0 u(e0 e0Var, g gVar) {
        l.f(e0Var, "<this>");
        l.f(gVar, "newAnnotations");
        return (e0Var.getAnnotations().isEmpty() && gVar.isEmpty()) ? e0Var : e0Var.R0().U0(b1.a(e0Var.N0(), gVar));
    }

    public static final e0 v(e0 e0Var, l1 l1Var, Map<kotlin.reflect.x.internal.l0.l.e1, ? extends g1> map, r1 r1Var, Set<? extends e1> set) {
        q1 q1Var;
        int t;
        int t2;
        int t3;
        l.f(e0Var, "<this>");
        l.f(l1Var, "substitutor");
        l.f(map, "substitutionMap");
        l.f(r1Var, "variance");
        q1 R0 = e0Var.R0();
        if (R0 instanceof y) {
            y yVar = (y) R0;
            m0 W0 = yVar.W0();
            if (!W0.O0().getParameters().isEmpty() && W0.O0().w() != null) {
                List<e1> parameters = W0.O0().getParameters();
                l.e(parameters, "constructor.parameters");
                t3 = u.t(parameters, 10);
                ArrayList arrayList = new ArrayList(t3);
                for (e1 e1Var : parameters) {
                    g1 g1Var = (g1) r.U(e0Var.M0(), e1Var.f());
                    if ((set != null && set.contains(e1Var)) || g1Var == null || !map.containsKey(g1Var.getType().O0())) {
                        g1Var = new s0(e1Var);
                    }
                    arrayList.add(g1Var);
                }
                W0 = k1.f(W0, arrayList, null, 2, null);
            }
            m0 X0 = yVar.X0();
            if (!X0.O0().getParameters().isEmpty() && X0.O0().w() != null) {
                List<e1> parameters2 = X0.O0().getParameters();
                l.e(parameters2, "constructor.parameters");
                t2 = u.t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                for (e1 e1Var2 : parameters2) {
                    g1 g1Var2 = (g1) r.U(e0Var.M0(), e1Var2.f());
                    if ((set != null && set.contains(e1Var2)) || g1Var2 == null || !map.containsKey(g1Var2.getType().O0())) {
                        g1Var2 = new s0(e1Var2);
                    }
                    arrayList2.add(g1Var2);
                }
                X0 = k1.f(X0, arrayList2, null, 2, null);
            }
            q1Var = f0.d(W0, X0);
        } else if (R0 instanceof m0) {
            m0 m0Var = (m0) R0;
            if (m0Var.O0().getParameters().isEmpty() || m0Var.O0().w() == null) {
                q1Var = m0Var;
            } else {
                List<e1> parameters3 = m0Var.O0().getParameters();
                l.e(parameters3, "constructor.parameters");
                t = u.t(parameters3, 10);
                ArrayList arrayList3 = new ArrayList(t);
                for (e1 e1Var3 : parameters3) {
                    g1 g1Var3 = (g1) r.U(e0Var.M0(), e1Var3.f());
                    if ((set != null && set.contains(e1Var3)) || g1Var3 == null || !map.containsKey(g1Var3.getType().O0())) {
                        g1Var3 = new s0(e1Var3);
                    }
                    arrayList3.add(g1Var3);
                }
                q1Var = k1.f(m0Var, arrayList3, null, 2, null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        e0 n = l1Var.n(p1.b(q1Var, R0), r1Var);
        l.e(n, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.f0.x.e.l0.l.q1] */
    public static final e0 w(e0 e0Var) {
        int t;
        m0 m0Var;
        int t2;
        int t3;
        l.f(e0Var, "<this>");
        q1 R0 = e0Var.R0();
        if (R0 instanceof y) {
            y yVar = (y) R0;
            m0 W0 = yVar.W0();
            if (!W0.O0().getParameters().isEmpty() && W0.O0().w() != null) {
                List<e1> parameters = W0.O0().getParameters();
                l.e(parameters, "constructor.parameters");
                t3 = u.t(parameters, 10);
                ArrayList arrayList = new ArrayList(t3);
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s0((e1) it.next()));
                }
                W0 = k1.f(W0, arrayList, null, 2, null);
            }
            m0 X0 = yVar.X0();
            if (!X0.O0().getParameters().isEmpty() && X0.O0().w() != null) {
                List<e1> parameters2 = X0.O0().getParameters();
                l.e(parameters2, "constructor.parameters");
                t2 = u.t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new s0((e1) it2.next()));
                }
                X0 = k1.f(X0, arrayList2, null, 2, null);
            }
            m0Var = f0.d(W0, X0);
        } else if (R0 instanceof m0) {
            m0 m0Var2 = (m0) R0;
            boolean isEmpty = m0Var2.O0().getParameters().isEmpty();
            m0Var = m0Var2;
            if (!isEmpty) {
                h w = m0Var2.O0().w();
                m0Var = m0Var2;
                if (w != null) {
                    List<e1> parameters3 = m0Var2.O0().getParameters();
                    l.e(parameters3, "constructor.parameters");
                    t = u.t(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(t);
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new s0((e1) it3.next()));
                    }
                    m0Var = k1.f(m0Var2, arrayList3, null, 2, null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return p1.b(m0Var, R0);
    }

    public static final boolean x(e0 e0Var) {
        l.f(e0Var, "<this>");
        return b(e0Var, b.f21386f);
    }
}
