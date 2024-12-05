package kotlin.reflect.x.internal.l0.d.a.l0.m;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.x.internal.l0.b.q.d;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.l0.k;
import kotlin.reflect.x.internal.l0.d.a.n0.a0;
import kotlin.reflect.x.internal.l0.d.a.n0.c0;
import kotlin.reflect.x.internal.l0.d.a.n0.f;
import kotlin.reflect.x.internal.l0.d.a.n0.i;
import kotlin.reflect.x.internal.l0.d.a.n0.j;
import kotlin.reflect.x.internal.l0.d.a.n0.v;
import kotlin.reflect.x.internal.l0.d.a.n0.x;
import kotlin.reflect.x.internal.l0.d.a.n0.y;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.b1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.h0;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes2.dex */
public final class c {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final k f20080b;

    /* renamed from: c, reason: collision with root package name */
    private final g f20081c;

    /* renamed from: d, reason: collision with root package name */
    private final e f20082d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JavaTypeResolver.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<e0> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e1 f20084g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ j f20085h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.m.a f20086i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.l.e1 f20087j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e1 e1Var, j jVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, kotlin.reflect.x.internal.l0.l.e1 e1Var2) {
            super(0);
            this.f20084g = e1Var;
            this.f20085h = jVar;
            this.f20086i = aVar;
            this.f20087j = e1Var2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            g gVar = c.this.f20081c;
            e1 e1Var = this.f20084g;
            boolean x = this.f20085h.x();
            kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar = this.f20086i;
            h w = this.f20087j.w();
            e0 c2 = gVar.c(e1Var, x, aVar.h(w != null ? w.s() : null));
            l.e(c2, "typeParameterUpperBoundE…efaultType)\n            )");
            return c2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(g gVar, k kVar) {
        l.f(gVar, "c");
        l.f(kVar, "typeParameterResolver");
        this.a = gVar;
        this.f20080b = kVar;
        g gVar2 = new g(null, 1, 0 == true ? 1 : 0);
        this.f20081c = gVar2;
        this.f20082d = new e(gVar2);
    }

    private final boolean b(j jVar, e eVar) {
        r1 n;
        if (!a0.a((x) r.f0(jVar.F()))) {
            return false;
        }
        List<e1> parameters = d.a.b(eVar).g().getParameters();
        l.e(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        e1 e1Var = (e1) r.f0(parameters);
        return (e1Var == null || (n = e1Var.n()) == null || n == r1.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if ((!r0.isEmpty()) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.x.internal.l0.l.g1> c(kotlin.reflect.x.internal.l0.d.a.n0.j r7, kotlin.reflect.x.internal.l0.d.a.l0.m.a r8, kotlin.reflect.x.internal.l0.l.e1 r9) {
        /*
            r6 = this;
            boolean r0 = r7.x()
            java.lang.String r1 = "constructor.parameters"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L25
            java.util.List r0 = r7.F()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.List r0 = r9.getParameters()
            kotlin.jvm.internal.l.e(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            java.util.List r4 = r9.getParameters()
            kotlin.jvm.internal.l.e(r4, r1)
            if (r0 == 0) goto L34
            java.util.List r7 = r6.d(r7, r4, r9, r8)
            return r7
        L34:
            int r8 = r4.size()
            java.util.List r9 = r7.F()
            int r9 = r9.size()
            r0 = 10
            if (r8 == r9) goto L82
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.r.t(r4, r0)
            r7.<init>(r8)
            java.util.Iterator r8 = r4.iterator()
        L51:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r9
            kotlin.f0.x.e.l0.l.i1 r0 = new kotlin.f0.x.e.l0.l.i1
            kotlin.f0.x.e.l0.l.u1.j r1 = kotlin.reflect.x.internal.l0.l.u1.j.Z
            java.lang.String[] r4 = new java.lang.String[r3]
            kotlin.f0.x.e.l0.f.f r9 = r9.getName()
            java.lang.String r9 = r9.f()
            java.lang.String r5 = "p.name.asString()"
            kotlin.jvm.internal.l.e(r9, r5)
            r4[r2] = r9
            kotlin.f0.x.e.l0.l.u1.h r9 = kotlin.reflect.x.internal.l0.l.u1.k.d(r1, r4)
            r0.<init>(r9)
            r7.add(r0)
            goto L51
        L7d:
            java.util.List r7 = kotlin.collections.r.y0(r7)
            return r7
        L82:
            java.util.List r7 = r7.F()
            java.lang.Iterable r7 = kotlin.collections.r.E0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.r.t(r7, r0)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L97:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lcc
            java.lang.Object r9 = r7.next()
            kotlin.w.g0 r9 = (kotlin.collections.IndexedValue) r9
            int r0 = r9.getIndex()
            java.lang.Object r9 = r9.b()
            kotlin.f0.x.e.l0.d.a.n0.x r9 = (kotlin.reflect.x.internal.l0.d.a.n0.x) r9
            int r1 = r4.size()
            java.lang.Object r0 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.e1) r0
            kotlin.f0.x.e.l0.d.a.j0.k r1 = kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON
            r3 = 3
            r5 = 0
            kotlin.f0.x.e.l0.d.a.l0.m.a r1 = kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(r1, r2, r5, r3, r5)
            java.lang.String r3 = "parameter"
            kotlin.jvm.internal.l.e(r0, r3)
            kotlin.f0.x.e.l0.l.g1 r9 = r6.p(r9, r1, r0)
            r8.add(r9)
            goto L97
        Lcc:
            java.util.List r7 = kotlin.collections.r.y0(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.l0.m.c.c(kotlin.f0.x.e.l0.d.a.n0.j, kotlin.f0.x.e.l0.d.a.l0.m.a, kotlin.f0.x.e.l0.l.e1):java.util.List");
    }

    private final List<g1> d(j jVar, List<? extends e1> list, kotlin.reflect.x.internal.l0.l.e1 e1Var, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        int t;
        g1 j2;
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (e1 e1Var2 : list) {
            if (kotlin.reflect.x.internal.l0.l.x1.a.k(e1Var2, null, aVar.f())) {
                j2 = d.b(e1Var2, aVar);
            } else {
                j2 = this.f20082d.j(e1Var2, jVar.x() ? aVar : aVar.i(b.INFLEXIBLE), new h0(this.a.e(), new a(e1Var2, jVar, aVar, e1Var)));
            }
            arrayList.add(j2);
        }
        return arrayList;
    }

    private final m0 e(j jVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, m0 m0Var) {
        a1 b2;
        if (m0Var == null || (b2 = m0Var.N0()) == null) {
            b2 = b1.b(new kotlin.reflect.x.internal.l0.d.a.l0.d(this.a, jVar, false, 4, null));
        }
        a1 a1Var = b2;
        kotlin.reflect.x.internal.l0.l.e1 f2 = f(jVar, aVar);
        if (f2 == null) {
            return null;
        }
        boolean i2 = i(aVar);
        if (l.a(m0Var != null ? m0Var.O0() : null, f2) && !jVar.x() && i2) {
            return m0Var.S0(true);
        }
        return f0.i(a1Var, f2, c(jVar, aVar, f2), i2, null, 16, null);
    }

    private final kotlin.reflect.x.internal.l0.l.e1 f(j jVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        kotlin.reflect.x.internal.l0.l.e1 g2;
        i b2 = jVar.b();
        if (b2 == null) {
            return g(jVar);
        }
        if (b2 instanceof kotlin.reflect.x.internal.l0.d.a.n0.g) {
            kotlin.reflect.x.internal.l0.d.a.n0.g gVar = (kotlin.reflect.x.internal.l0.d.a.n0.g) b2;
            kotlin.reflect.x.internal.l0.f.c d2 = gVar.d();
            if (d2 != null) {
                e j2 = j(jVar, aVar, d2);
                if (j2 == null) {
                    j2 = this.a.a().n().a(gVar);
                }
                return (j2 == null || (g2 = j2.g()) == null) ? g(jVar) : g2;
            }
            throw new AssertionError("Class type should have a FQ name: " + b2);
        }
        if (b2 instanceof y) {
            e1 a2 = this.f20080b.a((y) b2);
            if (a2 != null) {
                return a2.g();
            }
            return null;
        }
        throw new IllegalStateException("Unknown classifier kind: " + b2);
    }

    private final kotlin.reflect.x.internal.l0.l.e1 g(j jVar) {
        List<Integer> e2;
        b m = b.m(new kotlin.reflect.x.internal.l0.f.c(jVar.y()));
        l.e(m, "topLevel(FqName(javaType.classifierQualifiedName))");
        j0 q = this.a.a().b().d().q();
        e2 = s.e(0);
        kotlin.reflect.x.internal.l0.l.e1 g2 = q.d(m, e2).g();
        l.e(g2, "c.components.deserialize…istOf(0)).typeConstructor");
        return g2;
    }

    private final boolean h(r1 r1Var, e1 e1Var) {
        return (e1Var.n() == r1.INVARIANT || r1Var == e1Var.n()) ? false : true;
    }

    private final boolean i(kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        return (aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.g() || aVar.e() == kotlin.reflect.x.internal.l0.d.a.j0.k.SUPERTYPE) ? false : true;
    }

    private final e j(j jVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, kotlin.reflect.x.internal.l0.f.c cVar) {
        if (aVar.g() && l.a(cVar, d.a())) {
            return this.a.a().p().c();
        }
        d dVar = d.a;
        e f2 = d.f(dVar, cVar, this.a.d().o(), null, 4, null);
        if (f2 == null) {
            return null;
        }
        return (dVar.d(f2) && (aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.e() == kotlin.reflect.x.internal.l0.d.a.j0.k.SUPERTYPE || b(jVar, f2))) ? dVar.b(f2) : f2;
    }

    public static /* synthetic */ e0 l(c cVar, f fVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return cVar.k(fVar, aVar, z);
    }

    private final e0 m(j jVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        boolean z = (aVar.g() || aVar.e() == kotlin.reflect.x.internal.l0.d.a.j0.k.SUPERTYPE) ? false : true;
        boolean x = jVar.x();
        if (!x && !z) {
            m0 e2 = e(jVar, aVar, null);
            return e2 != null ? e2 : n(jVar);
        }
        m0 e3 = e(jVar, aVar.i(b.FLEXIBLE_LOWER_BOUND), null);
        if (e3 == null) {
            return n(jVar);
        }
        m0 e4 = e(jVar, aVar.i(b.FLEXIBLE_UPPER_BOUND), e3);
        if (e4 == null) {
            return n(jVar);
        }
        if (x) {
            return new f(e3, e4);
        }
        return f0.d(e3, e4);
    }

    private static final kotlin.reflect.x.internal.l0.l.u1.h n(j jVar) {
        return kotlin.reflect.x.internal.l0.l.u1.k.d(kotlin.reflect.x.internal.l0.l.u1.j.f21359i, jVar.n());
    }

    private final g1 p(x xVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, e1 e1Var) {
        if (xVar instanceof c0) {
            c0 c0Var = (c0) xVar;
            x C = c0Var.C();
            r1 r1Var = c0Var.J() ? r1.OUT_VARIANCE : r1.IN_VARIANCE;
            if (C != null && !h(r1Var, e1Var)) {
                return kotlin.reflect.x.internal.l0.l.x1.a.e(o(C, d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, false, null, 3, null)), r1Var, e1Var);
            }
            return d.b(e1Var, aVar);
        }
        return new i1(r1.INVARIANT, o(xVar, aVar));
    }

    public final e0 k(f fVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar, boolean z) {
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i0;
        l.f(fVar, "arrayType");
        l.f(aVar, "attr");
        x m = fVar.m();
        v vVar = m instanceof v ? (v) m : null;
        kotlin.reflect.x.internal.l0.b.i type = vVar != null ? vVar.getType() : null;
        kotlin.reflect.x.internal.l0.d.a.l0.d dVar = new kotlin.reflect.x.internal.l0.d.a.l0.d(this.a, fVar, true);
        if (type != null) {
            m0 O = this.a.d().o().O(type);
            l.e(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
            i0 = b0.i0(dVar, O.getAnnotations());
            kotlin.reflect.x.internal.l0.l.x1.a.u(O, aVar2.a(i0));
            return aVar.g() ? O : f0.d(O, O.S0(true));
        }
        e0 o = o(m, d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, aVar.g(), null, 2, null));
        if (aVar.g()) {
            m0 m2 = this.a.d().o().m(z ? r1.OUT_VARIANCE : r1.INVARIANT, o, dVar);
            l.e(m2, "c.module.builtIns.getArr…mponentType, annotations)");
            return m2;
        }
        m0 m3 = this.a.d().o().m(r1.INVARIANT, o, dVar);
        l.e(m3, "c.module.builtIns.getArr…mponentType, annotations)");
        return f0.d(m3, this.a.d().o().m(r1.OUT_VARIANCE, o, dVar).S0(true));
    }

    public final e0 o(x xVar, kotlin.reflect.x.internal.l0.d.a.l0.m.a aVar) {
        e0 o;
        m0 Z;
        l.f(aVar, "attr");
        if (xVar instanceof v) {
            kotlin.reflect.x.internal.l0.b.i type = ((v) xVar).getType();
            if (type != null) {
                Z = this.a.d().o().R(type);
            } else {
                Z = this.a.d().o().Z();
            }
            l.e(Z, "{\n                val pr…ns.unitType\n            }");
            return Z;
        }
        if (xVar instanceof j) {
            return m((j) xVar, aVar);
        }
        if (xVar instanceof f) {
            return l(this, (f) xVar, aVar, false, 4, null);
        }
        if (xVar instanceof c0) {
            x C = ((c0) xVar).C();
            if (C != null && (o = o(C, aVar)) != null) {
                return o;
            }
            m0 y = this.a.d().o().y();
            l.e(y, "c.module.builtIns.defaultBound");
            return y;
        }
        if (xVar == null) {
            m0 y2 = this.a.d().o().y();
            l.e(y2, "c.module.builtIns.defaultBound");
            return y2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
