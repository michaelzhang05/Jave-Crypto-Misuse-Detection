package kotlin.reflect.x.internal.l0.i.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.t1.p;
import kotlin.reflect.x.internal.l0.l.t1.x;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;

/* compiled from: DescriptorUtils.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final f a;

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.x.e.l0.i.t.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0339a<N> implements b.c {
        public static final C0339a<N> a = new C0339a<>();

        C0339a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<i1> a(i1 i1Var) {
            int t;
            Collection<i1> e2 = i1Var.e();
            t = u.t(e2, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = e2.iterator();
            while (it.hasNext()) {
                arrayList.add(((i1) it.next()).a());
            }
            return arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes2.dex */
    /* synthetic */ class b extends i implements Function1<i1, Boolean> {

        /* renamed from: h, reason: collision with root package name */
        public static final b f20892h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(i1.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i1 i1Var) {
            l.f(i1Var, "p0");
            return Boolean.valueOf(i1Var.u0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes2.dex */
    public static final class c<N> implements b.c {
        final /* synthetic */ boolean a;

        c(boolean z) {
            this.a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.b> a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            List i2;
            if (this.a) {
                bVar = bVar != null ? bVar.a() : null;
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e2 = bVar != null ? bVar.e() : null;
            if (e2 != null) {
                return e2;
            }
            i2 = t.i();
            return i2;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes2.dex */
    public static final class d extends b.AbstractC0376b<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.b> {
        final /* synthetic */ a0<kotlin.reflect.jvm.internal.impl.descriptors.b> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> f20893b;

        /* JADX WARN: Multi-variable type inference failed */
        d(a0<kotlin.reflect.jvm.internal.impl.descriptors.b> a0Var, Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> function1) {
            this.a = a0Var;
            this.f20893b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0376b, kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "current");
            if (this.a.f19460f == null && this.f20893b.invoke(bVar).booleanValue()) {
                this.a.f19460f = bVar;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "current");
            return this.a.f19460f == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.b a() {
            return this.a.f19460f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<m, m> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f20894f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke(m mVar) {
            l.f(mVar, "it");
            return mVar.b();
        }
    }

    static {
        f r = f.r("value");
        l.e(r, "identifier(\"value\")");
        a = r;
    }

    public static final boolean a(i1 i1Var) {
        List e2;
        l.f(i1Var, "<this>");
        e2 = s.e(i1Var);
        Boolean e3 = kotlin.reflect.jvm.internal.impl.utils.b.e(e2, C0339a.a, b.f20892h);
        l.e(e3, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e3.booleanValue();
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.b b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z, Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> function1) {
        List e2;
        l.f(bVar, "<this>");
        l.f(function1, "predicate");
        a0 a0Var = new a0();
        e2 = s.e(bVar);
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) kotlin.reflect.jvm.internal.impl.utils.b.b(e2, new c(z), new d(a0Var, function1));
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return b(bVar, z, function1);
    }

    public static final kotlin.reflect.x.internal.l0.f.c d(m mVar) {
        l.f(mVar, "<this>");
        kotlin.reflect.x.internal.l0.f.d i2 = i(mVar);
        if (!i2.f()) {
            i2 = null;
        }
        if (i2 != null) {
            return i2.l();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e e(kotlin.reflect.jvm.internal.impl.descriptors.n1.c cVar) {
        l.f(cVar, "<this>");
        h w = cVar.getType().O0().w();
        if (w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) w;
        }
        return null;
    }

    public static final kotlin.reflect.x.internal.l0.b.h f(m mVar) {
        l.f(mVar, "<this>");
        return l(mVar).o();
    }

    public static final kotlin.reflect.x.internal.l0.f.b g(h hVar) {
        m b2;
        kotlin.reflect.x.internal.l0.f.b g2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        if (b2 instanceof k0) {
            return new kotlin.reflect.x.internal.l0.f.b(((k0) b2).d(), hVar.getName());
        }
        if (!(b2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || (g2 = g((h) b2)) == null) {
            return null;
        }
        return g2.d(hVar.getName());
    }

    public static final kotlin.reflect.x.internal.l0.f.c h(m mVar) {
        l.f(mVar, "<this>");
        kotlin.reflect.x.internal.l0.f.c n = kotlin.reflect.x.internal.l0.i.d.n(mVar);
        l.e(n, "getFqNameSafe(this)");
        return n;
    }

    public static final kotlin.reflect.x.internal.l0.f.d i(m mVar) {
        l.f(mVar, "<this>");
        kotlin.reflect.x.internal.l0.f.d m = kotlin.reflect.x.internal.l0.i.d.m(mVar);
        l.e(m, "getFqName(this)");
        return m;
    }

    public static final z<m0> j(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        g1<m0> z0 = eVar != null ? eVar.z0() : null;
        if (z0 instanceof z) {
            return (z) z0;
        }
        return null;
    }

    public static final g k(g0 g0Var) {
        l.f(g0Var, "<this>");
        p pVar = (p) g0Var.I0(kotlin.reflect.x.internal.l0.l.t1.h.a());
        x xVar = pVar != null ? (x) pVar.a() : null;
        return xVar instanceof x.a ? ((x.a) xVar).b() : g.a.a;
    }

    public static final g0 l(m mVar) {
        l.f(mVar, "<this>");
        g0 g2 = kotlin.reflect.x.internal.l0.i.d.g(mVar);
        l.e(g2, "getContainingModule(this)");
        return g2;
    }

    public static final Sequence<m> m(m mVar) {
        Sequence<m> k2;
        l.f(mVar, "<this>");
        k2 = n.k(n(mVar), 1);
        return k2;
    }

    public static final Sequence<m> n(m mVar) {
        Sequence<m> f2;
        l.f(mVar, "<this>");
        f2 = kotlin.sequences.l.f(mVar, e.f20894f);
        return f2;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.b o(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l.f(bVar, "<this>");
        if (!(bVar instanceof s0)) {
            return bVar;
        }
        t0 B0 = ((s0) bVar).B0();
        l.e(B0, "correspondingProperty");
        return B0;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e p(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l.f(eVar, "<this>");
        for (e0 e0Var : eVar.s().O0().a()) {
            if (!kotlin.reflect.x.internal.l0.b.h.b0(e0Var)) {
                h w = e0Var.O0().w();
                if (kotlin.reflect.x.internal.l0.i.d.w(w)) {
                    l.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e) w;
                }
            }
        }
        return null;
    }

    public static final boolean q(g0 g0Var) {
        x xVar;
        l.f(g0Var, "<this>");
        p pVar = (p) g0Var.I0(kotlin.reflect.x.internal.l0.l.t1.h.a());
        return (pVar == null || (xVar = (x) pVar.a()) == null || !xVar.a()) ? false : true;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e r(g0 g0Var, kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(g0Var, "<this>");
        l.f(cVar, "topLevelClassFqName");
        l.f(bVar, "location");
        cVar.d();
        kotlin.reflect.x.internal.l0.f.c e2 = cVar.e();
        l.e(e2, "topLevelClassFqName.parent()");
        kotlin.reflect.x.internal.l0.i.w.h q = g0Var.N(e2).q();
        f g2 = cVar.g();
        l.e(g2, "topLevelClassFqName.shortName()");
        h f2 = q.f(g2, bVar);
        if (f2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) f2;
        }
        return null;
    }
}
