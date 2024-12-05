package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.d.a.i0;
import kotlin.reflect.x.internal.l0.d.a.n0.n;
import kotlin.reflect.x.internal.l0.d.a.n0.r;
import kotlin.reflect.x.internal.l0.d.a.n0.x;
import kotlin.reflect.x.internal.l0.d.a.n0.y;
import kotlin.reflect.x.internal.l0.i.w.c;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.s;

/* compiled from: LazyJavaScope.kt */
/* loaded from: classes2.dex */
public abstract class j extends kotlin.reflect.x.internal.l0.i.w.i {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f20034b = {b0.g(new v(b0.b(j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), b0.g(new v(b0.b(j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), b0.g(new v(b0.b(j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.a.l0.g f20035c;

    /* renamed from: d, reason: collision with root package name */
    private final j f20036d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f20037e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i<kotlin.reflect.x.internal.l0.d.a.l0.l.b> f20038f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.g<kotlin.reflect.x.internal.l0.f.f, Collection<y0>> f20039g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.h<kotlin.reflect.x.internal.l0.f.f, t0> f20040h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.g<kotlin.reflect.x.internal.l0.f.f, Collection<y0>> f20041i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f20042j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f20043k;
    private final kotlin.reflect.x.internal.l0.k.i l;
    private final kotlin.reflect.x.internal.l0.k.g<kotlin.reflect.x.internal.l0.f.f, List<t0>> m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final e0 a;

        /* renamed from: b, reason: collision with root package name */
        private final e0 f20044b;

        /* renamed from: c, reason: collision with root package name */
        private final List<i1> f20045c;

        /* renamed from: d, reason: collision with root package name */
        private final List<e1> f20046d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f20047e;

        /* renamed from: f, reason: collision with root package name */
        private final List<String> f20048f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e0 e0Var, e0 e0Var2, List<? extends i1> list, List<? extends e1> list2, boolean z, List<String> list3) {
            kotlin.jvm.internal.l.f(e0Var, "returnType");
            kotlin.jvm.internal.l.f(list, "valueParameters");
            kotlin.jvm.internal.l.f(list2, "typeParameters");
            kotlin.jvm.internal.l.f(list3, "errors");
            this.a = e0Var;
            this.f20044b = e0Var2;
            this.f20045c = list;
            this.f20046d = list2;
            this.f20047e = z;
            this.f20048f = list3;
        }

        public final List<String> a() {
            return this.f20048f;
        }

        public final boolean b() {
            return this.f20047e;
        }

        public final e0 c() {
            return this.f20044b;
        }

        public final e0 d() {
            return this.a;
        }

        public final List<e1> e() {
            return this.f20046d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.a(this.a, aVar.a) && kotlin.jvm.internal.l.a(this.f20044b, aVar.f20044b) && kotlin.jvm.internal.l.a(this.f20045c, aVar.f20045c) && kotlin.jvm.internal.l.a(this.f20046d, aVar.f20046d) && this.f20047e == aVar.f20047e && kotlin.jvm.internal.l.a(this.f20048f, aVar.f20048f);
        }

        public final List<i1> f() {
            return this.f20045c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e0 e0Var = this.f20044b;
            int hashCode2 = (((((hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31) + this.f20045c.hashCode()) * 31) + this.f20046d.hashCode()) * 31;
            boolean z = this.f20047e;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return ((hashCode2 + i2) * 31) + this.f20048f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=" + this.f20044b + ", valueParameters=" + this.f20045c + ", typeParameters=" + this.f20046d + ", hasStableParameterNames=" + this.f20047e + ", errors=" + this.f20048f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final List<i1> a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f20049b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends i1> list, boolean z) {
            kotlin.jvm.internal.l.f(list, "descriptors");
            this.a = list;
            this.f20049b = z;
        }

        public final List<i1> a() {
            return this.a;
        }

        public final boolean b() {
            return this.f20049b;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
            return j.this.m(kotlin.reflect.x.internal.l0.i.w.d.m, kotlin.reflect.x.internal.l0.i.w.h.a.a());
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
            return j.this.l(kotlin.reflect.x.internal.l0.i.w.d.r, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, t0> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            kotlin.jvm.internal.l.f(fVar, "name");
            if (j.this.B() != null) {
                return (t0) j.this.B().f20040h.invoke(fVar);
            }
            n c2 = j.this.y().invoke().c(fVar);
            if (c2 == null || c2.G()) {
                return null;
            }
            return j.this.J(c2);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            kotlin.jvm.internal.l.f(fVar, "name");
            if (j.this.B() != null) {
                return (Collection) j.this.B().f20039g.invoke(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : j.this.y().invoke().f(fVar)) {
                kotlin.reflect.x.internal.l0.d.a.k0.e I = j.this.I(rVar);
                if (j.this.G(I)) {
                    j.this.w().a().h().e(rVar, I);
                    arrayList.add(I);
                }
            }
            j.this.o(arrayList, fVar);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class g extends Lambda implements Function0<kotlin.reflect.x.internal.l0.d.a.l0.l.b> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.d.a.l0.l.b invoke() {
            return j.this.p();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class h extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
            return j.this.n(kotlin.reflect.x.internal.l0.i.w.d.t, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class i extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            List y0;
            kotlin.jvm.internal.l.f(fVar, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f20039g.invoke(fVar));
            j.this.L(linkedHashSet);
            j.this.r(linkedHashSet, fVar);
            y0 = kotlin.collections.b0.y0(j.this.w().a().r().g(j.this.w(), linkedHashSet));
            return y0;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.l0.l.j$j, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0294j extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, List<? extends t0>> {
        C0294j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<t0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            List<t0> y0;
            List<t0> y02;
            kotlin.jvm.internal.l.f(fVar, "name");
            ArrayList arrayList = new ArrayList();
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, j.this.f20040h.invoke(fVar));
            j.this.s(fVar, arrayList);
            if (kotlin.reflect.x.internal.l0.i.d.t(j.this.C())) {
                y02 = kotlin.collections.b0.y0(arrayList);
                return y02;
            }
            y0 = kotlin.collections.b0.y0(j.this.w().a().r().g(j.this.w(), arrayList));
            return y0;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    static final class k extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
            return j.this.t(kotlin.reflect.x.internal.l0.i.w.d.u, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements Function0<kotlin.reflect.x.internal.l0.k.j<? extends kotlin.reflect.x.internal.l0.i.r.g<?>>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f20060g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c0 f20061h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyJavaScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<kotlin.reflect.x.internal.l0.i.r.g<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j f20062f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f20063g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0 f20064h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, n nVar, c0 c0Var) {
                super(0);
                this.f20062f = jVar;
                this.f20063g = nVar;
                this.f20064h = c0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.x.internal.l0.i.r.g<?> invoke() {
                return this.f20062f.w().a().g().a(this.f20063g, this.f20064h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n nVar, c0 c0Var) {
            super(0);
            this.f20060g = nVar;
            this.f20061h = c0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.k.j<kotlin.reflect.x.internal.l0.i.r.g<?>> invoke() {
            return j.this.w().e().f(new a(j.this, this.f20060g, this.f20061h));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements Function1<y0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f20065f = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(y0 y0Var) {
            kotlin.jvm.internal.l.f(y0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return y0Var;
        }
    }

    public /* synthetic */ j(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, j jVar, int i2, kotlin.jvm.internal.g gVar2) {
        this(gVar, (i2 & 2) != 0 ? null : jVar);
    }

    private final Set<kotlin.reflect.x.internal.l0.f.f> A() {
        return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.f20042j, this, f20034b[0]);
    }

    private final Set<kotlin.reflect.x.internal.l0.f.f> D() {
        return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.f20043k, this, f20034b[1]);
    }

    private final e0 E(n nVar) {
        boolean z = false;
        e0 o = this.f20035c.g().o(nVar.getType(), kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, false, null, 3, null));
        if ((kotlin.reflect.x.internal.l0.b.h.r0(o) || kotlin.reflect.x.internal.l0.b.h.u0(o)) && F(nVar) && nVar.O()) {
            z = true;
        }
        if (!z) {
            return o;
        }
        e0 n = n1.n(o);
        kotlin.jvm.internal.l.e(n, "makeNotNullable(propertyType)");
        return n;
    }

    private final boolean F(n nVar) {
        return nVar.isFinal() && nVar.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0 J(n nVar) {
        List<? extends e1> i2;
        List<w0> i3;
        c0 u = u(nVar);
        u.W0(null, null, null, null);
        e0 E = E(nVar);
        i2 = t.i();
        w0 z = z();
        i3 = t.i();
        u.c1(E, i2, z, null, i3);
        if (kotlin.reflect.x.internal.l0.i.d.K(u, u.getType())) {
            u.M0(new l(nVar, u));
        }
        this.f20035c.a().h().d(nVar, u);
        return u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Set<y0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c2 = kotlin.reflect.x.internal.l0.d.b.v.c((y0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c2, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends y0> a2 = kotlin.reflect.x.internal.l0.i.l.a(list, m.f20065f);
                set.removeAll(list);
                set.addAll(a2);
            }
        }
    }

    private final c0 u(n nVar) {
        kotlin.reflect.x.internal.l0.d.a.k0.f g1 = kotlin.reflect.x.internal.l0.d.a.k0.f.g1(C(), kotlin.reflect.x.internal.l0.d.a.l0.e.a(this.f20035c, nVar), d0.FINAL, i0.c(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f20035c.a().t().a(nVar), F(nVar));
        kotlin.jvm.internal.l.e(g1, "create(\n            owne…d.isFinalStatic\n        )");
        return g1;
    }

    private final Set<kotlin.reflect.x.internal.l0.f.f> x() {
        return (Set) kotlin.reflect.x.internal.l0.k.m.a(this.l, this, f20034b[2]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j B() {
        return this.f20036d;
    }

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.m C();

    protected boolean G(kotlin.reflect.x.internal.l0.d.a.k0.e eVar) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        return true;
    }

    protected abstract a H(r rVar, List<? extends e1> list, e0 e0Var, List<? extends i1> list2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.d.a.k0.e I(r rVar) {
        int t;
        List<w0> i2;
        Map<? extends a.InterfaceC0365a<?>, ?> i3;
        kotlin.jvm.internal.l.f(rVar, "method");
        kotlin.reflect.x.internal.l0.d.a.k0.e q1 = kotlin.reflect.x.internal.l0.d.a.k0.e.q1(C(), kotlin.reflect.x.internal.l0.d.a.l0.e.a(this.f20035c, rVar), rVar.getName(), this.f20035c.a().t().a(rVar), this.f20038f.invoke().b(rVar.getName()) != null && rVar.h().isEmpty());
        kotlin.jvm.internal.l.e(q1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        kotlin.reflect.x.internal.l0.d.a.l0.g f2 = kotlin.reflect.x.internal.l0.d.a.l0.a.f(this.f20035c, q1, rVar, 0, 4, null);
        List<y> typeParameters = rVar.getTypeParameters();
        t = u.t(typeParameters, 10);
        List<? extends e1> arrayList = new ArrayList<>(t);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            e1 a2 = f2.f().a((y) it.next());
            kotlin.jvm.internal.l.c(a2);
            arrayList.add(a2);
        }
        b K = K(f2, q1, rVar.h());
        a H = H(rVar, arrayList, q(rVar, f2), K.a());
        e0 c2 = H.c();
        w0 h2 = c2 != null ? kotlin.reflect.x.internal.l0.i.c.h(q1, c2, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b()) : null;
        w0 z = z();
        i2 = t.i();
        List<e1> e2 = H.e();
        List<i1> f3 = H.f();
        e0 d2 = H.d();
        d0 a3 = d0.f21624f.a(false, rVar.isAbstract(), !rVar.isFinal());
        kotlin.reflect.jvm.internal.impl.descriptors.u c3 = i0.c(rVar.getVisibility());
        if (H.c() != null) {
            i3 = n0.f(s.a(kotlin.reflect.x.internal.l0.d.a.k0.e.J, kotlin.collections.r.R(K.a())));
        } else {
            i3 = o0.i();
        }
        q1.p1(h2, z, i2, e2, f3, d2, a3, c3, i3);
        q1.t1(H.b(), K.b());
        if (!H.a().isEmpty()) {
            f2.a().s().b(q1, H.a());
        }
        return q1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b K(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.y yVar, List<? extends kotlin.reflect.x.internal.l0.d.a.n0.b0> list) {
        Iterable<IndexedValue> E0;
        int t;
        List y0;
        Pair a2;
        kotlin.reflect.x.internal.l0.f.f name;
        kotlin.reflect.x.internal.l0.d.a.l0.g gVar2 = gVar;
        kotlin.jvm.internal.l.f(gVar2, "c");
        kotlin.jvm.internal.l.f(yVar, "function");
        kotlin.jvm.internal.l.f(list, "jValueParameters");
        E0 = kotlin.collections.b0.E0(list);
        t = u.t(E0, 10);
        ArrayList arrayList = new ArrayList(t);
        boolean z = false;
        boolean z2 = false;
        for (IndexedValue indexedValue : E0) {
            int index = indexedValue.getIndex();
            kotlin.reflect.x.internal.l0.d.a.n0.b0 b0Var = (kotlin.reflect.x.internal.l0.d.a.n0.b0) indexedValue.b();
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g a3 = kotlin.reflect.x.internal.l0.d.a.l0.e.a(gVar2, b0Var);
            kotlin.reflect.x.internal.l0.d.a.l0.m.a d2 = kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, z, null, 3, null);
            if (b0Var.g()) {
                x type = b0Var.getType();
                kotlin.reflect.x.internal.l0.d.a.n0.f fVar = type instanceof kotlin.reflect.x.internal.l0.d.a.n0.f ? (kotlin.reflect.x.internal.l0.d.a.n0.f) type : null;
                if (fVar != null) {
                    e0 k2 = gVar.g().k(fVar, d2, true);
                    a2 = s.a(k2, gVar.d().o().k(k2));
                } else {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
            } else {
                a2 = s.a(gVar.g().o(b0Var.getType(), d2), null);
            }
            e0 e0Var = (e0) a2.a();
            e0 e0Var2 = (e0) a2.b();
            if (kotlin.jvm.internal.l.a(yVar.getName().f(), "equals") && list.size() == 1 && kotlin.jvm.internal.l.a(gVar.d().o().I(), e0Var)) {
                name = kotlin.reflect.x.internal.l0.f.f.r("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(index);
                    name = kotlin.reflect.x.internal.l0.f.f.r(sb.toString());
                    kotlin.jvm.internal.l.e(name, "identifier(\"p$index\")");
                }
            }
            kotlin.reflect.x.internal.l0.f.f fVar2 = name;
            kotlin.jvm.internal.l.e(fVar2, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new l0(yVar, null, index, a3, fVar2, e0Var, false, false, false, e0Var2, gVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z2 = z2;
            z = false;
            gVar2 = gVar;
        }
        y0 = kotlin.collections.b0.y0(arrayList);
        return new b(y0, z2);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        List i2;
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        if (b().contains(fVar)) {
            return this.f20041i.invoke(fVar);
        }
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> b() {
        return A();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        List i2;
        kotlin.jvm.internal.l.f(fVar, "name");
        kotlin.jvm.internal.l.f(bVar, "location");
        if (d().contains(fVar)) {
            return this.m.invoke(fVar);
        }
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> d() {
        return D();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> e() {
        return x();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        kotlin.jvm.internal.l.f(dVar, "kindFilter");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        return this.f20037e.invoke();
    }

    protected abstract Set<kotlin.reflect.x.internal.l0.f.f> l(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1);

    protected final List<kotlin.reflect.jvm.internal.impl.descriptors.m> m(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> y0;
        kotlin.jvm.internal.l.f(dVar, "kindFilter");
        kotlin.jvm.internal.l.f(function1, "nameFilter");
        kotlin.reflect.x.internal.l0.c.b.d dVar2 = kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.c())) {
            for (kotlin.reflect.x.internal.l0.f.f fVar : l(dVar, function1)) {
                if (function1.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(linkedHashSet, f(fVar, dVar2));
                }
            }
        }
        if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.d()) && !dVar.l().contains(c.a.a)) {
            for (kotlin.reflect.x.internal.l0.f.f fVar2 : n(dVar, function1)) {
                if (function1.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.i()) && !dVar.l().contains(c.a.a)) {
            for (kotlin.reflect.x.internal.l0.f.f fVar3 : t(dVar, function1)) {
                if (function1.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar2));
                }
            }
        }
        y0 = kotlin.collections.b0.y0(linkedHashSet);
        return y0;
    }

    protected abstract Set<kotlin.reflect.x.internal.l0.f.f> n(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1);

    protected void o(Collection<y0> collection, kotlin.reflect.x.internal.l0.f.f fVar) {
        kotlin.jvm.internal.l.f(collection, "result");
        kotlin.jvm.internal.l.f(fVar, "name");
    }

    protected abstract kotlin.reflect.x.internal.l0.d.a.l0.l.b p();

    /* JADX INFO: Access modifiers changed from: protected */
    public final e0 q(r rVar, kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
        kotlin.jvm.internal.l.f(rVar, "method");
        kotlin.jvm.internal.l.f(gVar, "c");
        return gVar.g().o(rVar.getReturnType(), kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, rVar.P().q(), null, 2, null));
    }

    protected abstract void r(Collection<y0> collection, kotlin.reflect.x.internal.l0.f.f fVar);

    protected abstract void s(kotlin.reflect.x.internal.l0.f.f fVar, Collection<t0> collection);

    protected abstract Set<kotlin.reflect.x.internal.l0.f.f> t(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1);

    public String toString() {
        return "Lazy scope for " + C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.k.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> v() {
        return this.f20037e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.d.a.l0.g w() {
        return this.f20035c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.reflect.x.internal.l0.k.i<kotlin.reflect.x.internal.l0.d.a.l0.l.b> y() {
        return this.f20038f;
    }

    protected abstract w0 z();

    public j(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, j jVar) {
        List i2;
        kotlin.jvm.internal.l.f(gVar, "c");
        this.f20035c = gVar;
        this.f20036d = jVar;
        kotlin.reflect.x.internal.l0.k.n e2 = gVar.e();
        c cVar = new c();
        i2 = t.i();
        this.f20037e = e2.c(cVar, i2);
        this.f20038f = gVar.e().d(new g());
        this.f20039g = gVar.e().h(new f());
        this.f20040h = gVar.e().i(new e());
        this.f20041i = gVar.e().h(new i());
        this.f20042j = gVar.e().d(new h());
        this.f20043k = gVar.e().d(new k());
        this.l = gVar.e().d(new d());
        this.m = gVar.e().h(new C0294j());
    }
}
