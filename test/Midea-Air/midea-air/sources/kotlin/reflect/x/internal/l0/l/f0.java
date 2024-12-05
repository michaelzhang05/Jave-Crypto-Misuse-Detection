package kotlin.reflect.x.internal.l0.l;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.u;
import kotlin.reflect.x.internal.l0.i.r.n;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.reflect.x.internal.l0.l.x0;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class f0 {
    public static final f0 a = new f0();

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<g, m0> f21224b = a.f21225f;

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21225f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(g gVar) {
            l.f(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final m0 a;

        /* renamed from: b, reason: collision with root package name */
        private final e1 f21226b;

        public b(m0 m0Var, e1 e1Var) {
            this.a = m0Var;
            this.f21226b = e1Var;
        }

        public final m0 a() {
            return this.a;
        }

        public final e1 b() {
            return this.f21226b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<g, m0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e1 f21227f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<g1> f21228g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a1 f21229h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f21230i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e1 e1Var, List<? extends g1> list, a1 a1Var, boolean z) {
            super(1);
            this.f21227f = e1Var;
            this.f21228g = list;
            this.f21229h = a1Var;
            this.f21230i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke(g gVar) {
            l.f(gVar, "refiner");
            b f2 = f0.a.f(this.f21227f, gVar, this.f21228g);
            if (f2 == null) {
                return null;
            }
            m0 a = f2.a();
            if (a != null) {
                return a;
            }
            a1 a1Var = this.f21229h;
            e1 b2 = f2.b();
            l.c(b2);
            return f0.h(a1Var, b2, this.f21228g, this.f21230i, gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<g, m0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e1 f21231f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<g1> f21232g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a1 f21233h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f21234i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f21235j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(e1 e1Var, List<? extends g1> list, a1 a1Var, boolean z, h hVar) {
            super(1);
            this.f21231f = e1Var;
            this.f21232g = list;
            this.f21233h = a1Var;
            this.f21234i = z;
            this.f21235j = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke(g gVar) {
            l.f(gVar, "kotlinTypeRefiner");
            b f2 = f0.a.f(this.f21231f, gVar, this.f21232g);
            if (f2 == null) {
                return null;
            }
            m0 a = f2.a();
            if (a != null) {
                return a;
            }
            a1 a1Var = this.f21233h;
            e1 b2 = f2.b();
            l.c(b2);
            return f0.j(a1Var, b2, this.f21232g, this.f21234i, this.f21235j);
        }
    }

    private f0() {
    }

    public static final m0 b(d1 d1Var, List<? extends g1> list) {
        l.f(d1Var, "<this>");
        l.f(list, "arguments");
        return new v0(x0.a.a, false).i(w0.a.a(null, d1Var, list), a1.f21185g.h());
    }

    private final h c(e1 e1Var, List<? extends g1> list, g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h w = e1Var.w();
        if (w instanceof e1) {
            return ((e1) w).s().q();
        }
        if (w instanceof e) {
            if (gVar == null) {
                gVar = kotlin.reflect.x.internal.l0.i.t.a.k(kotlin.reflect.x.internal.l0.i.t.a.l(w));
            }
            if (list.isEmpty()) {
                return u.b((e) w, gVar);
            }
            return u.a((e) w, f1.f21236c.b(e1Var, list), gVar);
        }
        if (w instanceof d1) {
            kotlin.reflect.x.internal.l0.l.u1.g gVar2 = kotlin.reflect.x.internal.l0.l.u1.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((d1) w).getName().toString();
            l.e(fVar, "descriptor.name.toString()");
            return k.a(gVar2, true, fVar);
        }
        if (e1Var instanceof d0) {
            return ((d0) e1Var).g();
        }
        throw new IllegalStateException("Unsupported classifier: " + w + " for constructor: " + e1Var);
    }

    public static final q1 d(m0 m0Var, m0 m0Var2) {
        l.f(m0Var, "lowerBound");
        l.f(m0Var2, "upperBound");
        return l.a(m0Var, m0Var2) ? m0Var : new z(m0Var, m0Var2);
    }

    public static final m0 e(a1 a1Var, n nVar, boolean z) {
        List i2;
        l.f(a1Var, "attributes");
        l.f(nVar, "constructor");
        i2 = t.i();
        return j(a1Var, nVar, i2, z, k.a(kotlin.reflect.x.internal.l0.l.u1.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b f(e1 e1Var, g gVar, List<? extends g1> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.h f2;
        kotlin.reflect.jvm.internal.impl.descriptors.h w = e1Var.w();
        if (w == null || (f2 = gVar.f(w)) == null) {
            return null;
        }
        if (f2 instanceof d1) {
            return new b(b((d1) f2, list), null);
        }
        e1 b2 = f2.g().b(gVar);
        l.e(b2, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, b2);
    }

    public static final m0 g(a1 a1Var, e eVar, List<? extends g1> list) {
        l.f(a1Var, "attributes");
        l.f(eVar, "descriptor");
        l.f(list, "arguments");
        e1 g2 = eVar.g();
        l.e(g2, "descriptor.typeConstructor");
        return i(a1Var, g2, list, false, null, 16, null);
    }

    public static final m0 h(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z, g gVar) {
        l.f(a1Var, "attributes");
        l.f(e1Var, "constructor");
        l.f(list, "arguments");
        if (a1Var.isEmpty() && list.isEmpty() && !z && e1Var.w() != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.h w = e1Var.w();
            l.c(w);
            m0 s = w.s();
            l.e(s, "constructor.declarationDescriptor!!.defaultType");
            return s;
        }
        return k(a1Var, e1Var, list, z, a.c(e1Var, list, gVar), new c(e1Var, list, a1Var, z));
    }

    public static /* synthetic */ m0 i(a1 a1Var, e1 e1Var, List list, boolean z, g gVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            gVar = null;
        }
        return h(a1Var, e1Var, list, z, gVar);
    }

    public static final m0 j(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z, h hVar) {
        l.f(a1Var, "attributes");
        l.f(e1Var, "constructor");
        l.f(list, "arguments");
        l.f(hVar, "memberScope");
        n0 n0Var = new n0(e1Var, list, z, hVar, new d(e1Var, list, a1Var, z, hVar));
        return a1Var.isEmpty() ? n0Var : new o0(n0Var, a1Var);
    }

    public static final m0 k(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z, h hVar, Function1<? super g, ? extends m0> function1) {
        l.f(a1Var, "attributes");
        l.f(e1Var, "constructor");
        l.f(list, "arguments");
        l.f(hVar, "memberScope");
        l.f(function1, "refinedTypeFactory");
        n0 n0Var = new n0(e1Var, list, z, hVar, function1);
        return a1Var.isEmpty() ? n0Var : new o0(n0Var, a1Var);
    }
}
