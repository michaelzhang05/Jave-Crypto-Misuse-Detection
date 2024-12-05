package kotlin.reflect.x.internal.l0.j.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.j.b.g0.m;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.f0;
import kotlin.reflect.x.internal.l0.l.g0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.i1;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.p;
import kotlin.reflect.x.internal.l0.l.q0;
import kotlin.reflect.x.internal.l0.l.r0;
import kotlin.reflect.x.internal.l0.l.r1;
import kotlin.reflect.x.internal.l0.l.s0;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.y0;
import kotlin.reflect.x.internal.l0.l.z0;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;
import okhttp3.HttpUrl;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes2.dex */
public final class d0 {
    private final m a;

    /* renamed from: b */
    private final d0 f20984b;

    /* renamed from: c */
    private final String f20985c;

    /* renamed from: d */
    private final String f20986d;

    /* renamed from: e */
    private final Function1<Integer, h> f20987e;

    /* renamed from: f */
    private final Function1<Integer, h> f20988f;

    /* renamed from: g */
    private final Map<Integer, e1> f20989g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<Integer, h> {
        a() {
            super(1);
        }

        public final h b(int i2) {
            return d0.this.d(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ h invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c>> {

        /* renamed from: g */
        final /* synthetic */ q f20992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(0);
            this.f20992g = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> invoke() {
            return d0.this.a.c().d().d(this.f20992g, d0.this.a.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<Integer, h> {
        c() {
            super(1);
        }

        public final h b(int i2) {
            return d0.this.f(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ h invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends i implements Function1<kotlin.reflect.x.internal.l0.f.b, kotlin.reflect.x.internal.l0.f.b> {

        /* renamed from: h */
        public static final d f20994h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(kotlin.reflect.x.internal.l0.f.b.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r */
        public final kotlin.reflect.x.internal.l0.f.b invoke(kotlin.reflect.x.internal.l0.f.b bVar) {
            l.f(bVar, "p0");
            return bVar.g();
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<q, q> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final q invoke(q qVar) {
            l.f(qVar, "it");
            return kotlin.reflect.x.internal.l0.e.z.f.g(qVar, d0.this.a.j());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements Function1<q, Integer> {

        /* renamed from: f */
        public static final f f20996f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Integer invoke(q qVar) {
            l.f(qVar, "it");
            return Integer.valueOf(qVar.W());
        }
    }

    public d0(m mVar, d0 d0Var, List<s> list, String str, String str2) {
        Map<Integer, e1> linkedHashMap;
        l.f(mVar, "c");
        l.f(list, "typeParameterProtos");
        l.f(str, "debugName");
        l.f(str2, "containerPresentableName");
        this.a = mVar;
        this.f20984b = d0Var;
        this.f20985c = str;
        this.f20986d = str2;
        this.f20987e = mVar.h().i(new a());
        this.f20988f = mVar.h().i(new c());
        if (list.isEmpty()) {
            linkedHashMap = o0.i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i2 = 0;
            for (s sVar : list) {
                linkedHashMap.put(Integer.valueOf(sVar.O()), new m(this.a, sVar, i2));
                i2++;
            }
        }
        this.f20989g = linkedHashMap;
    }

    public final h d(int i2) {
        kotlin.reflect.x.internal.l0.f.b a2 = x.a(this.a.g(), i2);
        if (a2.k()) {
            return this.a.c().b(a2);
        }
        return x.b(this.a.c().p(), a2);
    }

    private final m0 e(int i2) {
        if (x.a(this.a.g(), i2).k()) {
            return this.a.c().n().a();
        }
        return null;
    }

    public final h f(int i2) {
        kotlin.reflect.x.internal.l0.f.b a2 = x.a(this.a.g(), i2);
        if (a2.k()) {
            return null;
        }
        return x.d(this.a.c().p(), a2);
    }

    private final m0 g(e0 e0Var, e0 e0Var2) {
        List M;
        int t;
        kotlin.reflect.x.internal.l0.b.h h2 = kotlin.reflect.x.internal.l0.l.x1.a.h(e0Var);
        g annotations = e0Var.getAnnotations();
        e0 j2 = kotlin.reflect.x.internal.l0.b.g.j(e0Var);
        List<e0> e2 = kotlin.reflect.x.internal.l0.b.g.e(e0Var);
        M = kotlin.collections.b0.M(kotlin.reflect.x.internal.l0.b.g.l(e0Var), 1);
        t = u.t(M, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(((g1) it.next()).getType());
        }
        return kotlin.reflect.x.internal.l0.b.g.b(h2, annotations, j2, e2, arrayList, null, e0Var2, true).S0(e0Var.P0());
    }

    private final m0 h(a1 a1Var, kotlin.reflect.x.internal.l0.l.e1 e1Var, List<? extends g1> list, boolean z) {
        int size;
        int size2 = e1Var.getParameters().size() - list.size();
        m0 m0Var = null;
        if (size2 == 0) {
            m0Var = i(a1Var, e1Var, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            kotlin.reflect.x.internal.l0.l.e1 g2 = e1Var.o().X(size).g();
            l.e(g2, "functionTypeConstructor.…on(arity).typeConstructor");
            m0Var = f0.i(a1Var, g2, list, z, null, 16, null);
        }
        return m0Var == null ? k.a.f(j.S, list, e1Var, new String[0]) : m0Var;
    }

    private final m0 i(a1 a1Var, kotlin.reflect.x.internal.l0.l.e1 e1Var, List<? extends g1> list, boolean z) {
        m0 i2 = f0.i(a1Var, e1Var, list, z, null, 16, null);
        if (kotlin.reflect.x.internal.l0.b.g.p(i2)) {
            return p(i2);
        }
        return null;
    }

    private final e1 k(int i2) {
        e1 e1Var = this.f20989g.get(Integer.valueOf(i2));
        if (e1Var != null) {
            return e1Var;
        }
        d0 d0Var = this.f20984b;
        if (d0Var != null) {
            return d0Var.k(i2);
        }
        return null;
    }

    private static final List<q.b> m(q qVar, d0 d0Var) {
        List<q.b> k0;
        List<q.b> X = qVar.X();
        l.e(X, "argumentList");
        q g2 = kotlin.reflect.x.internal.l0.e.z.f.g(qVar, d0Var.a.j());
        List<q.b> m = g2 != null ? m(g2, d0Var) : null;
        if (m == null) {
            m = t.i();
        }
        k0 = kotlin.collections.b0.k0(X, m);
        return k0;
    }

    public static /* synthetic */ m0 n(d0 d0Var, q qVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return d0Var.l(qVar, z);
    }

    private final a1 o(List<? extends z0> list, g gVar, kotlin.reflect.x.internal.l0.l.e1 e1Var, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        int t;
        List<? extends y0<?>> v;
        t = u.t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((z0) it.next()).a(gVar, e1Var, mVar));
        }
        v = u.v(arrayList);
        return a1.f21185g.g(v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.l.a(r2, r3) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.x.internal.l0.l.m0 p(kotlin.reflect.x.internal.l0.l.e0 r6) {
        /*
            r5 = this;
            java.util.List r0 = kotlin.reflect.x.internal.l0.b.g.l(r6)
            java.lang.Object r0 = kotlin.collections.r.f0(r0)
            kotlin.f0.x.e.l0.l.g1 r0 = (kotlin.reflect.x.internal.l0.l.g1) r0
            r1 = 0
            if (r0 == 0) goto L7d
            kotlin.f0.x.e.l0.l.e0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7d
        L14:
            kotlin.f0.x.e.l0.l.e1 r2 = r0.O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.w()
            if (r2 == 0) goto L23
            kotlin.f0.x.e.l0.f.c r2 = kotlin.reflect.x.internal.l0.i.t.a.h(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.M0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7a
            kotlin.f0.x.e.l0.f.c r3 = kotlin.reflect.x.internal.l0.b.k.m
            boolean r3 = kotlin.jvm.internal.l.a(r2, r3)
            if (r3 != 0) goto L42
            kotlin.f0.x.e.l0.f.c r3 = kotlin.reflect.x.internal.l0.j.b.e0.a()
            boolean r2 = kotlin.jvm.internal.l.a(r2, r3)
            if (r2 != 0) goto L42
            goto L7a
        L42:
            java.util.List r0 = r0.M0()
            java.lang.Object r0 = kotlin.collections.r.n0(r0)
            kotlin.f0.x.e.l0.l.g1 r0 = (kotlin.reflect.x.internal.l0.l.g1) r0
            kotlin.f0.x.e.l0.l.e0 r0 = r0.getType()
            java.lang.String r2 = "continuationArgumentType.arguments.single().type"
            kotlin.jvm.internal.l.e(r0, r2)
            kotlin.f0.x.e.l0.j.b.m r2 = r5.a
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r3 != 0) goto L60
            r2 = r1
        L60:
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            if (r2 == 0) goto L68
            kotlin.f0.x.e.l0.f.c r1 = kotlin.reflect.x.internal.l0.i.t.a.d(r2)
        L68:
            kotlin.f0.x.e.l0.f.c r2 = kotlin.reflect.x.internal.l0.j.b.c0.a
            boolean r1 = kotlin.jvm.internal.l.a(r1, r2)
            if (r1 == 0) goto L75
            kotlin.f0.x.e.l0.l.m0 r6 = r5.g(r6, r0)
            return r6
        L75:
            kotlin.f0.x.e.l0.l.m0 r6 = r5.g(r6, r0)
            return r6
        L7a:
            kotlin.f0.x.e.l0.l.m0 r6 = (kotlin.reflect.x.internal.l0.l.m0) r6
            return r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.d0.p(kotlin.f0.x.e.l0.l.e0):kotlin.f0.x.e.l0.l.m0");
    }

    private final g1 r(e1 e1Var, q.b bVar) {
        if (bVar.z() == q.b.c.STAR) {
            if (e1Var == null) {
                return new r0(this.a.c().p().o());
            }
            return new s0(e1Var);
        }
        a0 a0Var = a0.a;
        q.b.c z = bVar.z();
        l.e(z, "typeArgumentProto.projection");
        r1 c2 = a0Var.c(z);
        q m = kotlin.reflect.x.internal.l0.e.z.f.m(bVar, this.a.j());
        if (m == null) {
            return new i1(k.d(j.C0, bVar.toString()));
        }
        return new i1(c2, q(m));
    }

    private final kotlin.reflect.x.internal.l0.l.e1 s(q qVar) {
        h invoke;
        Object obj;
        if (qVar.n0()) {
            invoke = this.f20987e.invoke(Integer.valueOf(qVar.Y()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.Y());
            }
        } else if (qVar.w0()) {
            invoke = k(qVar.j0());
            if (invoke == null) {
                return k.a.e(j.Q, String.valueOf(qVar.j0()), this.f20986d);
            }
        } else if (qVar.x0()) {
            String string = this.a.g().getString(qVar.k0());
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l.a(((e1) obj).getName().f(), string)) {
                    break;
                }
            }
            invoke = (e1) obj;
            if (invoke == null) {
                return k.a.e(j.R, string, this.a.e().toString());
            }
        } else if (qVar.v0()) {
            invoke = this.f20988f.invoke(Integer.valueOf(qVar.i0()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.i0());
            }
        } else {
            return k.a.e(j.U, new String[0]);
        }
        kotlin.reflect.x.internal.l0.l.e1 g2 = invoke.g();
        l.e(g2, "classifier.typeConstructor");
        return g2;
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e t(d0 d0Var, q qVar, int i2) {
        Sequence f2;
        Sequence u;
        List<Integer> B;
        Sequence f3;
        int j2;
        kotlin.reflect.x.internal.l0.f.b a2 = x.a(d0Var.a.g(), i2);
        f2 = kotlin.sequences.l.f(qVar, new e());
        u = n.u(f2, f.f20996f);
        B = n.B(u);
        f3 = kotlin.sequences.l.f(a2, d.f20994h);
        j2 = n.j(f3);
        while (B.size() < j2) {
            B.add(0);
        }
        return d0Var.a.c().q().d(a2, B);
    }

    public final List<e1> j() {
        List<e1> y0;
        y0 = kotlin.collections.b0.y0(this.f20989g.values());
        return y0;
    }

    public final m0 l(q qVar, boolean z) {
        m0 e2;
        int t;
        List<? extends g1> y0;
        m0 i2;
        m0 j2;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.n1.c> i0;
        l.f(qVar, "proto");
        if (qVar.n0()) {
            e2 = e(qVar.Y());
        } else {
            e2 = qVar.v0() ? e(qVar.i0()) : null;
        }
        if (e2 != null) {
            return e2;
        }
        kotlin.reflect.x.internal.l0.l.e1 s = s(qVar);
        boolean z2 = true;
        if (k.m(s.w())) {
            return k.a.c(j.x0, s, s.toString());
        }
        kotlin.reflect.x.internal.l0.j.b.g0.a aVar = new kotlin.reflect.x.internal.l0.j.b.g0.a(this.a.h(), new b(qVar));
        a1 o = o(this.a.c().v(), aVar, s, this.a.e());
        List<q.b> m = m(qVar, this);
        t = u.t(m, 10);
        ArrayList arrayList = new ArrayList(t);
        int i3 = 0;
        for (Object obj : m) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                t.s();
            }
            List<e1> parameters = s.getParameters();
            l.e(parameters, "constructor.parameters");
            arrayList.add(r((e1) r.U(parameters, i3), (q.b) obj));
            i3 = i4;
        }
        y0 = kotlin.collections.b0.y0(arrayList);
        h w = s.w();
        if (z && (w instanceof d1)) {
            f0 f0Var = f0.a;
            m0 b2 = f0.b((d1) w, y0);
            List<z0> v = this.a.c().v();
            g.a aVar2 = g.f21674c;
            i0 = kotlin.collections.b0.i0(aVar, b2.getAnnotations());
            a1 o2 = o(v, aVar2.a(i0), s, this.a.e());
            if (!g0.b(b2) && !qVar.f0()) {
                z2 = false;
            }
            i2 = b2.S0(z2).U0(o2);
        } else {
            Boolean d2 = kotlin.reflect.x.internal.l0.e.z.b.a.d(qVar.b0());
            l.e(d2, "SUSPEND_TYPE.get(proto.flags)");
            if (d2.booleanValue()) {
                i2 = h(o, s, y0, qVar.f0());
            } else {
                i2 = f0.i(o, s, y0, qVar.f0(), null, 16, null);
                Boolean d3 = kotlin.reflect.x.internal.l0.e.z.b.f20691b.d(qVar.b0());
                l.e(d3, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (d3.booleanValue()) {
                    p c2 = p.a.c(p.f21280g, i2, false, 2, null);
                    if (c2 == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + i2 + '\'').toString());
                    }
                    i2 = c2;
                }
            }
        }
        q a2 = kotlin.reflect.x.internal.l0.e.z.f.a(qVar, this.a.j());
        if (a2 != null && (j2 = q0.j(i2, l(a2, false))) != null) {
            i2 = j2;
        }
        return qVar.n0() ? this.a.c().t().a(x.a(this.a.g(), qVar.Y()), i2) : i2;
    }

    public final e0 q(q qVar) {
        l.f(qVar, "proto");
        if (qVar.p0()) {
            String string = this.a.g().getString(qVar.c0());
            m0 n = n(this, qVar, false, 2, null);
            q c2 = kotlin.reflect.x.internal.l0.e.z.f.c(qVar, this.a.j());
            l.c(c2);
            return this.a.c().l().a(qVar, string, n, n(this, c2, false, 2, null));
        }
        return l(qVar, true);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20985c);
        if (this.f20984b == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ". Child of " + this.f20984b.f20985c;
        }
        sb.append(str);
        return sb.toString();
    }
}
