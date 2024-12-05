package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.utils.f;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.a.g0;
import kotlin.reflect.x.internal.l0.d.a.h0;
import kotlin.reflect.x.internal.l0.d.a.i0;
import kotlin.reflect.x.internal.l0.d.a.j0.j;
import kotlin.reflect.x.internal.l0.d.a.l0.l.j;
import kotlin.reflect.x.internal.l0.d.a.n0.k;
import kotlin.reflect.x.internal.l0.d.a.n0.n;
import kotlin.reflect.x.internal.l0.d.a.n0.q;
import kotlin.reflect.x.internal.l0.d.a.n0.r;
import kotlin.reflect.x.internal.l0.d.a.n0.w;
import kotlin.reflect.x.internal.l0.d.a.n0.x;
import kotlin.reflect.x.internal.l0.d.a.o;
import kotlin.reflect.x.internal.l0.d.a.z;
import kotlin.reflect.x.internal.l0.d.b.v;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.n1;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.reflect.x.internal.l0.d.a.l0.l.j {
    private final kotlin.reflect.jvm.internal.impl.descriptors.e n;
    private final kotlin.reflect.x.internal.l0.d.a.n0.g o;
    private final boolean p;
    private final kotlin.reflect.x.internal.l0.k.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> q;
    private final kotlin.reflect.x.internal.l0.k.i<Set<kotlin.reflect.x.internal.l0.f.f>> r;
    private final kotlin.reflect.x.internal.l0.k.i<Map<kotlin.reflect.x.internal.l0.f.f, n>> s;
    private final kotlin.reflect.x.internal.l0.k.h<kotlin.reflect.x.internal.l0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.p1.g> t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<q, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20014f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q qVar) {
            l.f(qVar, "it");
            return Boolean.valueOf(!qVar.Q());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    /* synthetic */ class b extends kotlin.jvm.internal.i implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(g.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "p0");
            return ((g) this.receiver).I0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    /* synthetic */ class c extends kotlin.jvm.internal.i implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(g.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "p0");
            return ((g) this.receiver).J0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "it");
            return g.this.I0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "it");
            return g.this.J0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements Function0<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.g f20018g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
            super(0);
            this.f20018g = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.d> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.d> y0;
            ?? m;
            Collection<k> k2 = g.this.o.k();
            ArrayList arrayList = new ArrayList(k2.size());
            Iterator<k> it = k2.iterator();
            while (it.hasNext()) {
                arrayList.add(g.this.G0(it.next()));
            }
            if (g.this.o.s()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d e0 = g.this.e0();
                boolean z = false;
                String c2 = v.c(e0, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (l.a(v.c((kotlin.reflect.jvm.internal.impl.descriptors.d) it2.next(), false, false, 2, null), c2)) {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList.add(e0);
                    this.f20018g.a().h().b(g.this.o, e0);
                }
            }
            this.f20018g.a().w().c(g.this.C(), arrayList);
            kotlin.reflect.x.internal.l0.d.a.o0.l r = this.f20018g.a().r();
            kotlin.reflect.x.internal.l0.d.a.l0.g gVar = this.f20018g;
            g gVar2 = g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                m = t.m(gVar2.d0());
                arrayList2 = m;
            }
            y0 = kotlin.collections.b0.y0(r.g(gVar, arrayList2));
            return y0;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.l0.l.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0292g extends Lambda implements Function0<Map<kotlin.reflect.x.internal.l0.f.f, ? extends n>> {
        C0292g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.x.internal.l0.f.f, n> invoke() {
            int t;
            int e2;
            int b2;
            Collection<n> D = g.this.o.D();
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (((n) obj).G()) {
                    arrayList.add(obj);
                }
            }
            t = u.t(arrayList, 10);
            e2 = n0.e(t);
            b2 = kotlin.ranges.f.b(e2, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, Collection<? extends y0>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f20020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f20021g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(y0 y0Var, g gVar) {
            super(1);
            this.f20020f = y0Var;
            this.f20021g = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<y0> invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            List k0;
            List e2;
            l.f(fVar, "accessorName");
            if (!l.a(this.f20020f.getName(), fVar)) {
                k0 = kotlin.collections.b0.k0(this.f20021g.I0(fVar), this.f20021g.J0(fVar));
                return k0;
            }
            e2 = s.e(this.f20020f);
            return e2;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class i extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
            Set<kotlin.reflect.x.internal.l0.f.f> C0;
            C0 = kotlin.collections.b0.C0(g.this.o.K());
            return C0;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes2.dex */
    static final class j extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.p1.g> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.g f20024g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyJavaClassMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<Set<? extends kotlin.reflect.x.internal.l0.f.f>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f20025f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f20025f = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.x.internal.l0.f.f> invoke() {
                Set<kotlin.reflect.x.internal.l0.f.f> j2;
                j2 = v0.j(this.f20025f.b(), this.f20025f.d());
                return j2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
            super(1);
            this.f20024g = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.p1.g invoke(kotlin.reflect.x.internal.l0.f.f fVar) {
            l.f(fVar, "name");
            if (!((Set) g.this.r.invoke()).contains(fVar)) {
                n nVar = (n) ((Map) g.this.s.invoke()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.p1.n.M0(this.f20024g.e(), g.this.C(), fVar, this.f20024g.e().d(new a(g.this)), kotlin.reflect.x.internal.l0.d.a.l0.e.a(this.f20024g, nVar), this.f20024g.a().t().a(nVar));
            }
            o d2 = this.f20024g.a().d();
            kotlin.reflect.x.internal.l0.f.b g2 = kotlin.reflect.x.internal.l0.i.t.a.g(g.this.C());
            l.c(g2);
            kotlin.reflect.x.internal.l0.f.b d3 = g2.d(fVar);
            l.e(d3, "ownerDescriptor.classId!…createNestedClassId(name)");
            kotlin.reflect.x.internal.l0.d.a.n0.g a2 = d2.a(new o.b(d3, null, g.this.o, 2, null));
            if (a2 == null) {
                return null;
            }
            kotlin.reflect.x.internal.l0.d.a.l0.g gVar = this.f20024g;
            kotlin.reflect.x.internal.l0.d.a.l0.l.f fVar2 = new kotlin.reflect.x.internal.l0.d.a.l0.l.f(gVar, g.this.C(), a2, null, 8, null);
            gVar.a().e().a(fVar2);
            return fVar2;
        }
    }

    public /* synthetic */ g(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.d.a.n0.g gVar2, boolean z, g gVar3, int i2, kotlin.jvm.internal.g gVar4) {
        this(gVar, eVar, gVar2, z, (i2 & 16) != 0 ? null : gVar3);
    }

    private final boolean A0(y0 y0Var, y yVar) {
        String c2 = v.c(y0Var, false, false, 2, null);
        y L0 = yVar.L0();
        l.e(L0, "builtinWithErasedParameters.original");
        return l.a(c2, v.c(L0, false, false, 2, null)) && !o0(y0Var, yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (kotlin.reflect.x.internal.l0.d.a.z.d(r4) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:31:0x003f->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean B0(kotlin.reflect.jvm.internal.impl.descriptors.y0 r7) {
        /*
            r6 = this;
            kotlin.f0.x.e.l0.f.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.l.e(r0, r1)
            java.util.List r0 = kotlin.reflect.x.internal.l0.d.a.e0.a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = 0
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            kotlin.f0.x.e.l0.f.f r1 = (kotlin.reflect.x.internal.l0.f.f) r1
            java.util.Set r1 = r6.z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = 0
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.t0) r4
            kotlin.f0.x.e.l0.d.a.l0.l.g$h r5 = new kotlin.f0.x.e.l0.d.a.l0.l.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.n0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.j0()
            if (r4 != 0) goto L6f
            kotlin.f0.x.e.l0.f.f r4 = r7.getName()
            java.lang.String r4 = r4.f()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.l.e(r4, r5)
            boolean r4 = kotlin.reflect.x.internal.l0.d.a.z.d(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = 1
            goto L72
        L71:
            r4 = 0
        L72:
            if (r4 == 0) goto L3f
            r1 = 1
        L75:
            if (r1 == 0) goto L1f
            r0 = 1
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.p0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.K0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.r0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = 0
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.l0.l.g.B0(kotlin.reflect.jvm.internal.impl.descriptors.y0):boolean");
    }

    private final y0 C0(y0 y0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1, Collection<? extends y0> collection) {
        y0 g0;
        y k2 = kotlin.reflect.x.internal.l0.d.a.f.k(y0Var);
        if (k2 == null || (g0 = g0(k2, function1)) == null) {
            return null;
        }
        if (!B0(g0)) {
            g0 = null;
        }
        if (g0 != null) {
            return f0(g0, k2, collection);
        }
        return null;
    }

    private final y0 D0(y0 y0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1, kotlin.reflect.x.internal.l0.f.f fVar, Collection<? extends y0> collection) {
        y0 y0Var2 = (y0) g0.d(y0Var);
        if (y0Var2 == null) {
            return null;
        }
        String b2 = g0.b(y0Var2);
        l.c(b2);
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(b2);
        l.e(r, "identifier(nameInJava)");
        Iterator<? extends y0> it = function1.invoke(r).iterator();
        while (it.hasNext()) {
            y0 l0 = l0(it.next(), fVar);
            if (q0(y0Var2, l0)) {
                return f0(l0, y0Var2, collection);
            }
        }
        return null;
    }

    private final y0 E0(y0 y0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        if (!y0Var.isSuspend()) {
            return null;
        }
        kotlin.reflect.x.internal.l0.f.f name = y0Var.getName();
        l.e(name, "descriptor.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            y0 m0 = m0((y0) it.next());
            if (m0 == null || !o0(m0, y0Var)) {
                m0 = null;
            }
            if (m0 != null) {
                return m0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.x.internal.l0.d.a.k0.b G0(k kVar) {
        int t;
        List<e1> k0;
        kotlin.reflect.jvm.internal.impl.descriptors.e C = C();
        kotlin.reflect.x.internal.l0.d.a.k0.b u1 = kotlin.reflect.x.internal.l0.d.a.k0.b.u1(C, kotlin.reflect.x.internal.l0.d.a.l0.e.a(w(), kVar), false, w().a().t().a(kVar));
        l.e(u1, "createJavaConstructor(\n …ce(constructor)\n        )");
        kotlin.reflect.x.internal.l0.d.a.l0.g e2 = kotlin.reflect.x.internal.l0.d.a.l0.a.e(w(), u1, kVar, C.w().size());
        j.b K = K(e2, u1, kVar.h());
        List<e1> w = C.w();
        l.e(w, "classDescriptor.declaredTypeParameters");
        List<kotlin.reflect.x.internal.l0.d.a.n0.y> typeParameters = kVar.getTypeParameters();
        t = u.t(typeParameters, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            e1 a2 = e2.f().a((kotlin.reflect.x.internal.l0.d.a.n0.y) it.next());
            l.c(a2);
            arrayList.add(a2);
        }
        k0 = kotlin.collections.b0.k0(w, arrayList);
        u1.s1(K.a(), i0.c(kVar.getVisibility()), k0);
        u1.Z0(false);
        u1.a1(K.b());
        u1.h1(C.s());
        e2.a().h().b(kVar, u1);
        return u1;
    }

    private final kotlin.reflect.x.internal.l0.d.a.k0.e H0(w wVar) {
        List<w0> i2;
        List<? extends e1> i3;
        List<i1> i4;
        kotlin.reflect.x.internal.l0.d.a.k0.e q1 = kotlin.reflect.x.internal.l0.d.a.k0.e.q1(C(), kotlin.reflect.x.internal.l0.d.a.l0.e.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        l.e(q1, "createJavaMethod(\n      …omponent), true\n        )");
        e0 o = w().g().o(wVar.getType(), kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, false, null, 2, null));
        w0 z = z();
        i2 = t.i();
        i3 = t.i();
        i4 = t.i();
        q1.p1(null, z, i2, i3, i4, o, d0.f21624f.a(false, false, true), kotlin.reflect.jvm.internal.impl.descriptors.t.f21863e, null);
        q1.t1(false, false);
        w().a().h().e(wVar, q1);
        return q1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<y0> I0(kotlin.reflect.x.internal.l0.f.f fVar) {
        int t;
        Collection<r> f2 = y().invoke().f(fVar);
        t = u.t(f2, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = f2.iterator();
        while (it.hasNext()) {
            arrayList.add(I((r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<y0> J0(kotlin.reflect.x.internal.l0.f.f fVar) {
        Set<y0> x0 = x0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x0) {
            y0 y0Var = (y0) obj;
            if (!(g0.a(y0Var) || kotlin.reflect.x.internal.l0.d.a.f.k(y0Var) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean K0(y0 y0Var) {
        kotlin.reflect.x.internal.l0.d.a.f fVar = kotlin.reflect.x.internal.l0.d.a.f.n;
        kotlin.reflect.x.internal.l0.f.f name = y0Var.getName();
        l.e(name, "name");
        if (!fVar.l(name)) {
            return false;
        }
        kotlin.reflect.x.internal.l0.f.f name2 = y0Var.getName();
        l.e(name2, "name");
        Set<y0> x0 = x0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = x0.iterator();
        while (it.hasNext()) {
            y k2 = kotlin.reflect.x.internal.l0.d.a.f.k((y0) it.next());
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (A0(y0Var, (y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void U(List<i1> list, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, int i2, r rVar, e0 e0Var, e0 e0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g b2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b();
        kotlin.reflect.x.internal.l0.f.f name = rVar.getName();
        e0 n = n1.n(e0Var);
        l.e(n, "makeNotNullable(returnType)");
        list.add(new l0(lVar, null, i2, b2, name, n, rVar.L(), false, false, e0Var2 != null ? n1.n(e0Var2) : null, w().a().t().a(rVar)));
    }

    private final void V(Collection<y0> collection, kotlin.reflect.x.internal.l0.f.f fVar, Collection<? extends y0> collection2, boolean z) {
        List k0;
        int t;
        Collection<? extends y0> d2 = kotlin.reflect.x.internal.l0.d.a.j0.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        l.e(d2, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(d2);
            return;
        }
        k0 = kotlin.collections.b0.k0(collection, d2);
        t = u.t(d2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (y0 y0Var : d2) {
            y0 y0Var2 = (y0) g0.e(y0Var);
            if (y0Var2 == null) {
                l.e(y0Var, "resolvedOverride");
            } else {
                l.e(y0Var, "resolvedOverride");
                y0Var = f0(y0Var, y0Var2, k0);
            }
            arrayList.add(y0Var);
        }
        collection.addAll(arrayList);
    }

    private final void W(kotlin.reflect.x.internal.l0.f.f fVar, Collection<? extends y0> collection, Collection<? extends y0> collection2, Collection<y0> collection3, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        for (y0 y0Var : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, D0(y0Var, function1, fVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, C0(y0Var, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, E0(y0Var, function1));
        }
    }

    private final void X(Set<? extends t0> set, Collection<t0> collection, Set<t0> set2, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        for (t0 t0Var : set) {
            kotlin.reflect.x.internal.l0.d.a.k0.f h0 = h0(t0Var, function1);
            if (h0 != null) {
                collection.add(h0);
                if (set2 != null) {
                    set2.add(t0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void Y(kotlin.reflect.x.internal.l0.f.f fVar, Collection<t0> collection) {
        r rVar = (r) kotlin.collections.r.o0(y().invoke().f(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(j0(this, rVar, null, d0.FINAL, 2, null));
    }

    private final Collection<e0> b0() {
        if (!this.p) {
            return w().a().k().c().g(C());
        }
        Collection<e0> a2 = C().g().a();
        l.e(a2, "ownerDescriptor.typeConstructor.supertypes");
        return a2;
    }

    private final List<i1> c0(kotlin.reflect.jvm.internal.impl.descriptors.p1.f fVar) {
        Pair pair;
        Collection<r> M = this.o.M();
        ArrayList arrayList = new ArrayList(M.size());
        kotlin.reflect.x.internal.l0.d.a.l0.m.a d2 = kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : M) {
            if (l.a(((r) obj).getName(), a0.f19834c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<r> list2 = (List) pair2.b();
        list.size();
        r rVar = (r) kotlin.collections.r.T(list);
        if (rVar != null) {
            x returnType = rVar.getReturnType();
            if (returnType instanceof kotlin.reflect.x.internal.l0.d.a.n0.f) {
                kotlin.reflect.x.internal.l0.d.a.n0.f fVar2 = (kotlin.reflect.x.internal.l0.d.a.n0.f) returnType;
                pair = new Pair(w().g().k(fVar2, d2, true), w().g().o(fVar2.m(), d2));
            } else {
                pair = new Pair(w().g().o(returnType, d2), null);
            }
            U(arrayList, fVar, 0, rVar, (e0) pair.a(), (e0) pair.b());
        }
        int i2 = 0;
        int i3 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            U(arrayList, fVar, i2 + i3, rVar2, w().g().o(rVar2.getReturnType(), d2), null);
            i2++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d d0() {
        List<i1> emptyList;
        boolean q = this.o.q();
        if ((this.o.H() || !this.o.t()) && !q) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e C = C();
        kotlin.reflect.x.internal.l0.d.a.k0.b u1 = kotlin.reflect.x.internal.l0.d.a.k0.b.u1(C, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), true, w().a().t().a(this.o));
        l.e(u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (q) {
            emptyList = c0(u1);
        } else {
            emptyList = Collections.emptyList();
        }
        u1.a1(false);
        u1.r1(emptyList, v0(C));
        u1.Z0(true);
        u1.h1(C.s());
        w().a().h().b(this.o, u1);
        return u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d e0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e C = C();
        kotlin.reflect.x.internal.l0.d.a.k0.b u1 = kotlin.reflect.x.internal.l0.d.a.k0.b.u1(C, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), true, w().a().t().a(this.o));
        l.e(u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<i1> k0 = k0(u1);
        u1.a1(false);
        u1.r1(k0, v0(C));
        u1.Z0(false);
        u1.h1(C.s());
        return u1;
    }

    private final y0 f0(y0 y0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends y0> collection) {
        boolean z = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (y0 y0Var2 : collection) {
                if (!l.a(y0Var, y0Var2) && y0Var2.d0() == null && o0(y0Var2, aVar)) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return y0Var;
        }
        y0 a2 = y0Var.u().q().a();
        l.c(a2);
        return a2;
    }

    private final y0 g0(y yVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        Object obj;
        int t;
        kotlin.reflect.x.internal.l0.f.f name = yVar.getName();
        l.e(name, "overridden.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (A0((y0) obj, yVar)) {
                break;
            }
        }
        y0 y0Var = (y0) obj;
        if (y0Var == null) {
            return null;
        }
        y.a<? extends y0> u = y0Var.u();
        List<i1> h2 = yVar.h();
        l.e(h2, "overridden.valueParameters");
        t = u.t(h2, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it2 = h2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((i1) it2.next()).getType());
        }
        List<i1> h3 = y0Var.h();
        l.e(h3, "override.valueParameters");
        u.c(kotlin.reflect.x.internal.l0.d.a.k0.h.a(arrayList, h3, yVar));
        u.u();
        u.f();
        u.n(kotlin.reflect.x.internal.l0.d.a.k0.e.K, Boolean.TRUE);
        return u.a();
    }

    private final kotlin.reflect.x.internal.l0.d.a.k0.f h0(t0 t0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        y0 y0Var;
        List<? extends e1> i2;
        List<w0> i3;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 e0Var = null;
        if (!n0(t0Var, function1)) {
            return null;
        }
        y0 t0 = t0(t0Var, function1);
        l.c(t0);
        if (t0Var.j0()) {
            y0Var = u0(t0Var, function1);
            l.c(y0Var);
        } else {
            y0Var = null;
        }
        if (y0Var != null) {
            y0Var.j();
            t0.j();
        }
        kotlin.reflect.x.internal.l0.d.a.k0.d dVar = new kotlin.reflect.x.internal.l0.d.a.k0.d(C(), t0, y0Var, t0Var);
        e0 returnType = t0.getReturnType();
        l.c(returnType);
        i2 = t.i();
        w0 z = z();
        i3 = t.i();
        dVar.c1(returnType, i2, z, null, i3);
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 j2 = kotlin.reflect.x.internal.l0.i.c.j(dVar, t0.getAnnotations(), false, false, false, t0.t());
        j2.O0(t0);
        j2.R0(dVar.getType());
        l.e(j2, "createGetter(\n          …escriptor.type)\n        }");
        if (y0Var != null) {
            List<i1> h2 = y0Var.h();
            l.e(h2, "setterMethod.valueParameters");
            i1 i1Var = (i1) kotlin.collections.r.T(h2);
            if (i1Var != null) {
                e0Var = kotlin.reflect.x.internal.l0.i.c.l(dVar, y0Var.getAnnotations(), i1Var.getAnnotations(), false, false, false, y0Var.getVisibility(), y0Var.t());
                e0Var.O0(y0Var);
            } else {
                throw new AssertionError("No parameter found for " + y0Var);
            }
        }
        dVar.V0(j2, e0Var);
        return dVar;
    }

    private final kotlin.reflect.x.internal.l0.d.a.k0.f i0(r rVar, e0 e0Var, d0 d0Var) {
        List<? extends e1> i2;
        List<w0> i3;
        kotlin.reflect.x.internal.l0.d.a.k0.f g1 = kotlin.reflect.x.internal.l0.d.a.k0.f.g1(C(), kotlin.reflect.x.internal.l0.d.a.l0.e.a(w(), rVar), d0Var, i0.c(rVar.getVisibility()), false, rVar.getName(), w().a().t().a(rVar), false);
        l.e(g1, "create(\n            owne…inal = */ false\n        )");
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d2 = kotlin.reflect.x.internal.l0.i.c.d(g1, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b());
        l.e(d2, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        g1.V0(d2, null);
        e0 q = e0Var == null ? q(rVar, kotlin.reflect.x.internal.l0.d.a.l0.a.f(w(), g1, rVar, 0, 4, null)) : e0Var;
        i2 = t.i();
        w0 z = z();
        i3 = t.i();
        g1.c1(q, i2, z, null, i3);
        d2.R0(q);
        return g1;
    }

    static /* synthetic */ kotlin.reflect.x.internal.l0.d.a.k0.f j0(g gVar, r rVar, e0 e0Var, d0 d0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            e0Var = null;
        }
        return gVar.i0(rVar, e0Var, d0Var);
    }

    private final List<i1> k0(kotlin.reflect.jvm.internal.impl.descriptors.p1.f fVar) {
        Collection<w> j2 = this.o.j();
        ArrayList arrayList = new ArrayList(j2.size());
        e0 e0Var = null;
        kotlin.reflect.x.internal.l0.d.a.l0.m.a d2 = kotlin.reflect.x.internal.l0.d.a.l0.m.d.d(kotlin.reflect.x.internal.l0.d.a.j0.k.COMMON, false, null, 2, null);
        int i2 = 0;
        for (w wVar : j2) {
            int i3 = i2 + 1;
            e0 o = w().g().o(wVar.getType(), d2);
            arrayList.add(new l0(fVar, null, i2, kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b(), wVar.getName(), o, false, false, false, wVar.g() ? w().a().m().o().k(o) : e0Var, w().a().t().a(wVar)));
            i2 = i3;
            e0Var = null;
        }
        return arrayList;
    }

    private final y0 l0(y0 y0Var, kotlin.reflect.x.internal.l0.f.f fVar) {
        y.a<? extends y0> u = y0Var.u();
        u.t(fVar);
        u.u();
        u.f();
        y0 a2 = u.a();
        l.c(a2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.y0 m0(kotlin.reflect.jvm.internal.impl.descriptors.y0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.l.e(r0, r1)
            java.lang.Object r0 = kotlin.collections.r.f0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r0
            r2 = 0
            if (r0 == 0) goto L7e
            kotlin.f0.x.e.l0.l.e0 r3 = r0.getType()
            kotlin.f0.x.e.l0.l.e1 r3 = r3.O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.w()
            if (r3 == 0) goto L35
            kotlin.f0.x.e.l0.f.d r3 = kotlin.reflect.x.internal.l0.i.t.a.i(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.f0.x.e.l0.f.c r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.f0.x.e.l0.f.c r4 = kotlin.reflect.x.internal.l0.b.k.m
            boolean r3 = kotlin.jvm.internal.l.a(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r6.u()
            java.util.List r6 = r6.h()
            kotlin.jvm.internal.l.e(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.r.M(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r2.c(r6)
            kotlin.f0.x.e.l0.l.e0 r0 = r0.getType()
            java.util.List r0 = r0.M0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.f0.x.e.l0.l.g1 r0 = (kotlin.reflect.x.internal.l0.l.g1) r0
            kotlin.f0.x.e.l0.l.e0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r6.g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.y0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.p1.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.p1.g0) r0
            if (r0 != 0) goto L7a
            goto L7d
        L7a:
            r0.i1(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.l0.l.g.m0(kotlin.reflect.jvm.internal.impl.descriptors.y0):kotlin.reflect.jvm.internal.impl.descriptors.y0");
    }

    private final boolean n0(t0 t0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        if (kotlin.reflect.x.internal.l0.d.a.l0.l.c.a(t0Var)) {
            return false;
        }
        y0 t0 = t0(t0Var, function1);
        y0 u0 = u0(t0Var, function1);
        if (t0 == null) {
            return false;
        }
        if (t0Var.j0()) {
            return u0 != null && u0.j() == t0.j();
        }
        return true;
    }

    private final boolean o0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        j.i.a c2 = kotlin.reflect.x.internal.l0.i.j.f20836b.F(aVar2, aVar, true).c();
        l.e(c2, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c2 == j.i.a.OVERRIDABLE && !kotlin.reflect.x.internal.l0.d.a.s.a.a(aVar2, aVar);
    }

    private final boolean p0(y0 y0Var) {
        h0.a aVar = h0.a;
        kotlin.reflect.x.internal.l0.f.f name = y0Var.getName();
        l.e(name, "name");
        kotlin.reflect.x.internal.l0.f.f b2 = aVar.b(name);
        if (b2 == null) {
            return false;
        }
        Set<y0> x0 = x0(b2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x0) {
            if (g0.a((y0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        y0 l0 = l0(y0Var, b2);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (q0((y0) it.next(), l0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean q0(y0 y0Var, y yVar) {
        if (kotlin.reflect.x.internal.l0.d.a.e.n.k(y0Var)) {
            yVar = yVar.L0();
        }
        l.e(yVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return o0(yVar, y0Var);
    }

    private final boolean r0(y0 y0Var) {
        y0 m0 = m0(y0Var);
        if (m0 == null) {
            return false;
        }
        kotlin.reflect.x.internal.l0.f.f name = y0Var.getName();
        l.e(name, "name");
        Set<y0> x0 = x0(name);
        if ((x0 instanceof Collection) && x0.isEmpty()) {
            return false;
        }
        for (y0 y0Var2 : x0) {
            if (y0Var2.isSuspend() && o0(m0, y0Var2)) {
                return true;
            }
        }
        return false;
    }

    private final y0 s0(t0 t0Var, String str, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        y0 y0Var;
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(str);
        l.e(r, "identifier(getterName)");
        Iterator<T> it = function1.invoke(r).iterator();
        do {
            y0Var = null;
            if (!it.hasNext()) {
                break;
            }
            y0 y0Var2 = (y0) it.next();
            if (y0Var2.h().size() == 0) {
                kotlin.reflect.x.internal.l0.l.t1.e eVar = kotlin.reflect.x.internal.l0.l.t1.e.a;
                e0 returnType = y0Var2.getReturnType();
                if (returnType == null ? false : eVar.d(returnType, t0Var.getType())) {
                    y0Var = y0Var2;
                }
            }
        } while (y0Var == null);
        return y0Var;
    }

    private final y0 t0(t0 t0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        u0 getter = t0Var.getGetter();
        u0 u0Var = getter != null ? (u0) g0.d(getter) : null;
        String a2 = u0Var != null ? kotlin.reflect.x.internal.l0.d.a.i.a.a(u0Var) : null;
        if (a2 != null && !g0.f(C(), u0Var)) {
            return s0(t0Var, a2, function1);
        }
        String f2 = t0Var.getName().f();
        l.e(f2, "name.asString()");
        return s0(t0Var, z.b(f2), function1);
    }

    private final y0 u0(t0 t0Var, Function1<? super kotlin.reflect.x.internal.l0.f.f, ? extends Collection<? extends y0>> function1) {
        y0 y0Var;
        e0 returnType;
        String f2 = t0Var.getName().f();
        l.e(f2, "name.asString()");
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(z.e(f2));
        l.e(r, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = function1.invoke(r).iterator();
        do {
            y0Var = null;
            if (!it.hasNext()) {
                break;
            }
            y0 y0Var2 = (y0) it.next();
            if (y0Var2.h().size() == 1 && (returnType = y0Var2.getReturnType()) != null && kotlin.reflect.x.internal.l0.b.h.B0(returnType)) {
                kotlin.reflect.x.internal.l0.l.t1.e eVar = kotlin.reflect.x.internal.l0.l.t1.e.a;
                List<i1> h2 = y0Var2.h();
                l.e(h2, "descriptor.valueParameters");
                if (eVar.b(((i1) kotlin.collections.r.n0(h2)).getType(), t0Var.getType())) {
                    y0Var = y0Var2;
                }
            }
        } while (y0Var == null);
        return y0Var;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.u v0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = eVar.getVisibility();
        l.e(visibility, "classDescriptor.visibility");
        if (!l.a(visibility, kotlin.reflect.x.internal.l0.d.a.r.f20194b)) {
            return visibility;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.x.internal.l0.d.a.r.f20195c;
        l.e(uVar, "PROTECTED_AND_PACKAGE");
        return uVar;
    }

    private final Set<y0> x0(kotlin.reflect.x.internal.l0.f.f fVar) {
        Collection<e0> b0 = b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = b0.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.y(linkedHashSet, ((e0) it.next()).q().a(fVar, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<t0> z0(kotlin.reflect.x.internal.l0.f.f fVar) {
        Set<t0> C0;
        int t;
        Collection<e0> b0 = b0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b0.iterator();
        while (it.hasNext()) {
            Collection<? extends t0> c2 = ((e0) it.next()).q().c(fVar, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_SUPER_MEMBERS);
            t = u.t(c2, 10);
            ArrayList arrayList2 = new ArrayList(t);
            Iterator<T> it2 = c2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((t0) it2.next());
            }
            kotlin.collections.y.y(arrayList, arrayList2);
        }
        C0 = kotlin.collections.b0.C0(arrayList);
        return C0;
    }

    public void F0(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        kotlin.reflect.x.internal.l0.c.a.a(w().a().l(), bVar, C(), fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected boolean G(kotlin.reflect.x.internal.l0.d.a.k0.e eVar) {
        l.f(eVar, "<this>");
        if (this.o.q()) {
            return false;
        }
        return B0(eVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected j.a H(r rVar, List<? extends e1> list, e0 e0Var, List<? extends i1> list2) {
        l.f(rVar, "method");
        l.f(list, "methodTypeParameters");
        l.f(e0Var, "returnType");
        l.f(list2, "valueParameters");
        j.b a2 = w().a().s().a(rVar, C(), e0Var, null, list2, list);
        l.e(a2, "c.components.signaturePr…dTypeParameters\n        )");
        e0 d2 = a2.d();
        l.e(d2, "propagated.returnType");
        e0 c2 = a2.c();
        List<i1> f2 = a2.f();
        l.e(f2, "propagated.valueParameters");
        List<e1> e2 = a2.e();
        l.e(e2, "propagated.typeParameters");
        boolean g2 = a2.g();
        List<String> b2 = a2.b();
        l.e(b2, "propagated.errors");
        return new j.a(d2, c2, f2, e2, g2, b2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<kotlin.reflect.x.internal.l0.f.f> n(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        l.f(dVar, "kindFilter");
        Collection<e0> a2 = C().g().a();
        l.e(a2, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<kotlin.reflect.x.internal.l0.f.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.y(linkedHashSet, ((e0) it.next()).q().b());
        }
        linkedHashSet.addAll(y().invoke().a());
        linkedHashSet.addAll(y().invoke().d());
        linkedHashSet.addAll(l(dVar, function1));
        linkedHashSet.addAll(w().a().w().d(C()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j, kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        F0(fVar, bVar);
        return super.a(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.x.internal.l0.d.a.l0.l.a p() {
        return new kotlin.reflect.x.internal.l0.d.a.l0.l.a(this.o, a.f20014f);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j, kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        F0(fVar, bVar);
        return super.c(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        kotlin.reflect.x.internal.l0.k.h<kotlin.reflect.x.internal.l0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.p1.g> hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.g invoke;
        l.f(fVar, "name");
        l.f(bVar, "location");
        F0(fVar, bVar);
        g gVar = (g) B();
        return (gVar == null || (hVar = gVar.t) == null || (invoke = hVar.invoke(fVar)) == null) ? this.t.invoke(fVar) : invoke;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<kotlin.reflect.x.internal.l0.f.f> l(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        Set<kotlin.reflect.x.internal.l0.f.f> j2;
        l.f(dVar, "kindFilter");
        j2 = v0.j(this.r.invoke(), this.s.invoke().keySet());
        return j2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void o(Collection<y0> collection, kotlin.reflect.x.internal.l0.f.f fVar) {
        l.f(collection, "result");
        l.f(fVar, "name");
        if (this.o.s() && y().invoke().b(fVar) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((y0) it.next()).h().isEmpty()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                w b2 = y().invoke().b(fVar);
                l.c(b2);
                collection.add(H0(b2));
            }
        }
        w().a().w().b(C(), fVar, collection);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void r(Collection<y0> collection, kotlin.reflect.x.internal.l0.f.f fVar) {
        List i2;
        List k0;
        boolean z;
        l.f(collection, "result");
        l.f(fVar, "name");
        Set<y0> x0 = x0(fVar);
        if (!h0.a.k(fVar) && !kotlin.reflect.x.internal.l0.d.a.f.n.l(fVar)) {
            if (!(x0 instanceof Collection) || !x0.isEmpty()) {
                Iterator<T> it = x0.iterator();
                while (it.hasNext()) {
                    if (((y) it.next()).isSuspend()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : x0) {
                    if (B0((y0) obj)) {
                        arrayList.add(obj);
                    }
                }
                V(collection, fVar, arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.f a2 = kotlin.reflect.jvm.internal.impl.utils.f.f22019f.a();
        i2 = t.i();
        Collection<? extends y0> d2 = kotlin.reflect.x.internal.l0.d.a.j0.a.d(fVar, x0, i2, C(), kotlin.reflect.x.internal.l0.j.b.r.a, w().a().k().a());
        l.e(d2, "resolveOverridesForNonSt….overridingUtil\n        )");
        W(fVar, collection, d2, collection, new b(this));
        W(fVar, collection, d2, a2, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : x0) {
            if (B0((y0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        k0 = kotlin.collections.b0.k0(arrayList2, a2);
        V(collection, fVar, k0, true);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void s(kotlin.reflect.x.internal.l0.f.f fVar, Collection<t0> collection) {
        Set<? extends t0> h2;
        Set j2;
        l.f(fVar, "name");
        l.f(collection, "result");
        if (this.o.q()) {
            Y(fVar, collection);
        }
        Set<t0> z0 = z0(fVar);
        if (z0.isEmpty()) {
            return;
        }
        f.b bVar = kotlin.reflect.jvm.internal.impl.utils.f.f22019f;
        kotlin.reflect.jvm.internal.impl.utils.f a2 = bVar.a();
        kotlin.reflect.jvm.internal.impl.utils.f a3 = bVar.a();
        X(z0, collection, a2, new d());
        h2 = v0.h(z0, a2);
        X(h2, a3, null, new e());
        j2 = v0.j(z0, a3);
        Collection<? extends t0> d2 = kotlin.reflect.x.internal.l0.d.a.j0.a.d(fVar, j2, collection, C(), w().a().c(), w().a().k().a());
        l.e(d2, "resolveOverridesForNonSt…rridingUtil\n            )");
        collection.addAll(d2);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<kotlin.reflect.x.internal.l0.f.f> t(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        l.f(dVar, "kindFilter");
        if (this.o.q()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y().invoke().e());
        Collection<e0> a2 = C().g().a();
        l.e(a2, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.y(linkedHashSet, ((e0) it.next()).q().d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    public String toString() {
        return "Lazy Java member scope for " + this.o.d();
    }

    public final kotlin.reflect.x.internal.l0.k.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> w0() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e C() {
        return this.n;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected w0 z() {
        return kotlin.reflect.x.internal.l0.i.d.l(C());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.d.a.n0.g gVar2, boolean z, g gVar3) {
        super(gVar, gVar3);
        l.f(gVar, "c");
        l.f(eVar, "ownerDescriptor");
        l.f(gVar2, "jClass");
        this.n = eVar;
        this.o = gVar2;
        this.p = z;
        this.q = gVar.e().d(new f(gVar));
        this.r = gVar.e().d(new i());
        this.s = gVar.e().d(new C0292g());
        this.t = gVar.e().i(new j(gVar));
    }
}
