package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.x.internal.l0.d.a.n0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.q;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;
import kotlin.u;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes2.dex */
public final class k extends l {
    private final g n;
    private final f o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaStaticClassScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<q, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20066f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q qVar) {
            l.f(qVar, "it");
            return Boolean.valueOf(qVar.Q());
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<h, Collection<? extends t0>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f20067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.f20067f = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<? extends t0> invoke(h hVar) {
            l.f(hVar, "it");
            return hVar.c(this.f20067f, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<h, Collection<? extends f>> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f20068f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<f> invoke(h hVar) {
            l.f(hVar, "it");
            return hVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaStaticClassScope.kt */
    /* loaded from: classes2.dex */
    public static final class d<N> implements b.c {
        public static final d<N> a = new d<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyJavaStaticClassScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function1<e0, kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f20069f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(e0 e0Var) {
                kotlin.reflect.jvm.internal.impl.descriptors.h w = e0Var.O0().w();
                if (w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e) w;
                }
                return null;
            }
        }

        d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.e> a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            Sequence I;
            Sequence v;
            Iterable<kotlin.reflect.jvm.internal.impl.descriptors.e> i2;
            Collection<e0> a2 = eVar.g().a();
            l.e(a2, "it.typeConstructor.supertypes");
            I = b0.I(a2);
            v = n.v(I, a.f20069f);
            i2 = n.i(v);
            return i2;
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* loaded from: classes2.dex */
    public static final class e extends b.AbstractC0376b<kotlin.reflect.jvm.internal.impl.descriptors.e, u> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f20070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h, Collection<R>> f20071c;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, Function1<? super h, ? extends Collection<? extends R>> function1) {
            this.a = eVar;
            this.f20070b = set;
            this.f20071c = function1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return u.a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l.f(eVar, "current");
            if (eVar == this.a) {
                return true;
            }
            h S = eVar.S();
            l.e(S, "current.staticScope");
            if (!(S instanceof l)) {
                return true;
            }
            this.f20070b.addAll((Collection) this.f20071c.invoke(S));
            return false;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, g gVar2, f fVar) {
        super(gVar);
        l.f(gVar, "c");
        l.f(gVar2, "jClass");
        l.f(fVar, "ownerDescriptor");
        this.n = gVar2;
        this.o = fVar;
    }

    private final <R> Set<R> N(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, Function1<? super h, ? extends Collection<? extends R>> function1) {
        List e2;
        e2 = s.e(eVar);
        kotlin.reflect.jvm.internal.impl.utils.b.b(e2, d.a, new e(eVar, set, function1));
        return set;
    }

    private final t0 P(t0 t0Var) {
        int t;
        List K;
        if (t0Var.i().d()) {
            return t0Var;
        }
        Collection<? extends t0> e2 = t0Var.e();
        l.e(e2, "this.overriddenDescriptors");
        t = kotlin.collections.u.t(e2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (t0 t0Var2 : e2) {
            l.e(t0Var2, "it");
            arrayList.add(P(t0Var2));
        }
        K = b0.K(arrayList);
        return (t0) r.n0(K);
    }

    private final Set<y0> Q(f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Set<y0> C0;
        Set<y0> d2;
        k b2 = kotlin.reflect.x.internal.l0.d.a.k0.h.b(eVar);
        if (b2 == null) {
            d2 = u0.d();
            return d2;
        }
        C0 = b0.C0(b2.a(fVar, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_SUPER_MEMBERS));
        return C0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.x.internal.l0.d.a.l0.l.a p() {
        return new kotlin.reflect.x.internal.l0.d.a.l0.l.a(this.n, a.f20066f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public f C() {
        return this.o;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> l(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> d2;
        l.f(dVar, "kindFilter");
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> n(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> B0;
        List l;
        l.f(dVar, "kindFilter");
        B0 = b0.B0(y().invoke().a());
        k b2 = kotlin.reflect.x.internal.l0.d.a.k0.h.b(C());
        Set<f> b3 = b2 != null ? b2.b() : null;
        if (b3 == null) {
            b3 = u0.d();
        }
        B0.addAll(b3);
        if (this.n.B()) {
            l = t.l(kotlin.reflect.x.internal.l0.b.k.f19703e, kotlin.reflect.x.internal.l0.b.k.f19702d);
            B0.addAll(l);
        }
        B0.addAll(w().a().w().a(C()));
        return B0;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void o(Collection<y0> collection, f fVar) {
        l.f(collection, "result");
        l.f(fVar, "name");
        w().a().w().e(C(), fVar, collection);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void r(Collection<y0> collection, f fVar) {
        l.f(collection, "result");
        l.f(fVar, "name");
        Collection<? extends y0> e2 = kotlin.reflect.x.internal.l0.d.a.j0.a.e(fVar, Q(fVar, C()), collection, C(), w().a().c(), w().a().k().a());
        l.e(e2, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(e2);
        if (this.n.B()) {
            if (l.a(fVar, kotlin.reflect.x.internal.l0.b.k.f19703e)) {
                y0 f2 = kotlin.reflect.x.internal.l0.i.c.f(C());
                l.e(f2, "createEnumValueOfMethod(ownerDescriptor)");
                collection.add(f2);
            } else if (l.a(fVar, kotlin.reflect.x.internal.l0.b.k.f19702d)) {
                y0 g2 = kotlin.reflect.x.internal.l0.i.c.g(C());
                l.e(g2, "createEnumValuesMethod(ownerDescriptor)");
                collection.add(g2);
            }
        }
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.l, kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void s(f fVar, Collection<t0> collection) {
        l.f(fVar, "name");
        l.f(collection, "result");
        Set N = N(C(), new LinkedHashSet(), new b(fVar));
        if (!collection.isEmpty()) {
            Collection<? extends t0> e2 = kotlin.reflect.x.internal.l0.d.a.j0.a.e(fVar, N, collection, C(), w().a().c(), w().a().k().a());
            l.e(e2, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(e2);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : N) {
            t0 P = P((t0) obj);
            Object obj2 = linkedHashMap.get(P);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(P, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Collection e3 = kotlin.reflect.x.internal.l0.d.a.j0.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, C(), w().a().c(), w().a().k().a());
            l.e(e3, "resolveOverridesForStati…ingUtil\n                )");
            y.y(arrayList, e3);
        }
        collection.addAll(arrayList);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> t(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> B0;
        l.f(dVar, "kindFilter");
        B0 = b0.B0(y().invoke().e());
        N(C(), B0, c.f20068f);
        return B0;
    }
}
