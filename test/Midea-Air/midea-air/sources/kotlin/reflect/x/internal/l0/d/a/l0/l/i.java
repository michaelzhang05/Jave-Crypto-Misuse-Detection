package kotlin.reflect.x.internal.l0.d.a.l0.l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.d.a.l0.l.b;
import kotlin.reflect.x.internal.l0.d.a.n0.d0;
import kotlin.reflect.x.internal.l0.d.a.n0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.u;
import kotlin.reflect.x.internal.l0.d.a.o;
import kotlin.reflect.x.internal.l0.d.b.c0.a;
import kotlin.reflect.x.internal.l0.d.b.o;
import kotlin.reflect.x.internal.l0.d.b.p;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.k.h;
import kotlin.reflect.x.internal.l0.k.j;

/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes2.dex */
public final class i extends l {
    private final u n;
    private final h o;
    private final j<Set<String>> p;
    private final h<a, e> q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private final f a;

        /* renamed from: b, reason: collision with root package name */
        private final g f20029b;

        public a(f fVar, g gVar) {
            l.f(fVar, "name");
            this.a = fVar;
            this.f20029b = gVar;
        }

        public final g a() {
            return this.f20029b;
        }

        public final f b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            private final e a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(null);
                l.f(eVar, "descriptor");
                this.a = eVar;
            }

            public final e a() {
                return this.a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.a.l0.l.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0293b extends b {
            public static final C0293b a = new C0293b();

            private C0293b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes2.dex */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<a, e> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.g f20031g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.x.internal.l0.d.a.l0.g gVar) {
            super(1);
            this.f20031g = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke(a aVar) {
            o.a c2;
            byte[] bArr;
            l.f(aVar, "request");
            kotlin.reflect.x.internal.l0.f.b bVar = new kotlin.reflect.x.internal.l0.f.b(i.this.C().d(), aVar.b());
            if (aVar.a() != null) {
                c2 = this.f20031g.a().j().a(aVar.a());
            } else {
                c2 = this.f20031g.a().j().c(bVar);
            }
            q a = c2 != null ? c2.a() : null;
            kotlin.reflect.x.internal.l0.f.b c3 = a != null ? a.c() : null;
            if (c3 != null && (c3.l() || c3.k())) {
                return null;
            }
            b R = i.this.R(a);
            if (R instanceof b.a) {
                return ((b.a) R).a();
            }
            if (R instanceof b.c) {
                return null;
            }
            if (R instanceof b.C0293b) {
                g a2 = aVar.a();
                if (a2 == null) {
                    kotlin.reflect.x.internal.l0.d.a.o d2 = this.f20031g.a().d();
                    if (c2 != null) {
                        if (!(c2 instanceof o.a.C0310a)) {
                            c2 = null;
                        }
                        o.a.C0310a c0310a = (o.a.C0310a) c2;
                        if (c0310a != null) {
                            bArr = c0310a.b();
                            a2 = d2.a(new o.b(bVar, bArr, null, 4, null));
                        }
                    }
                    bArr = null;
                    a2 = d2.a(new o.b(bVar, bArr, null, 4, null));
                }
                g gVar = a2;
                if ((gVar != null ? gVar.I() : null) != d0.BINARY) {
                    kotlin.reflect.x.internal.l0.f.c d3 = gVar != null ? gVar.d() : null;
                    if (d3 == null || d3.d() || !l.a(d3.e(), i.this.C().d())) {
                        return null;
                    }
                    f fVar = new f(this.f20031g, i.this.C(), gVar, null, 8, null);
                    this.f20031g.a().e().a(fVar);
                    return fVar;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + p.a(this.f20031g.a().j(), gVar) + "\nfindKotlinClass(ClassId) = " + p.b(this.f20031g.a().j(), bVar) + '\n');
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function0<Set<? extends String>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.d.a.l0.g f20032f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f20033g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, i iVar) {
            super(0);
            this.f20032f = gVar;
            this.f20033g = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<String> invoke() {
            return this.f20032f.a().d().b(this.f20033g.C().d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.reflect.x.internal.l0.d.a.l0.g gVar, u uVar, h hVar) {
        super(gVar);
        l.f(gVar, "c");
        l.f(uVar, "jPackage");
        l.f(hVar, "ownerDescriptor");
        this.n = uVar;
        this.o = hVar;
        this.p = gVar.e().f(new d(gVar, this));
        this.q = gVar.e().i(new c(gVar));
    }

    private final e N(f fVar, g gVar) {
        if (!kotlin.reflect.x.internal.l0.f.h.a.a(fVar)) {
            return null;
        }
        Set<String> invoke = this.p.invoke();
        if (gVar != null || invoke == null || invoke.contains(fVar.f())) {
            return this.q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b R(q qVar) {
        if (qVar == null) {
            return b.C0293b.a;
        }
        if (qVar.a().c() == a.EnumC0304a.CLASS) {
            e k2 = w().a().b().k(qVar);
            return k2 != null ? new b.a(k2) : b.C0293b.a;
        }
        return b.c.a;
    }

    public final e O(g gVar) {
        l.f(gVar, "javaClass");
        return N(gVar.getName(), gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public e f(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return N(fVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public h C() {
        return this.o;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j, kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.h
    public Collection<t0> c(f fVar, kotlin.reflect.x.internal.l0.c.b.b bVar) {
        List i2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        i2 = t.i();
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC] */
    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j, kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(kotlin.reflect.x.internal.l0.i.w.d r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.x.internal.l0.f.f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.l.f(r6, r0)
            kotlin.f0.x.e.l0.i.w.d$a r0 = kotlin.reflect.x.internal.l0.i.w.d.a
            int r1 = r0.c()
            int r0 = r0.e()
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.r.i()
            goto L65
        L20:
            kotlin.f0.x.e.l0.k.i r5 = r4.v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e
            if (r3 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r2
            kotlin.f0.x.e.l0.f.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.l.e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.l0.l.i.g(kotlin.f0.x.e.l0.i.w.d, kotlin.a0.c.l):java.util.Collection");
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> l(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> d2;
        l.f(dVar, "kindFilter");
        if (!dVar.a(kotlin.reflect.x.internal.l0.i.w.d.a.e())) {
            d2 = u0.d();
            return d2;
        }
        Set<String> invoke = this.p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(f.r((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.n;
        if (function1 == null) {
            function1 = kotlin.reflect.jvm.internal.impl.utils.d.a();
        }
        Collection<g> p = uVar.p(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g gVar : p) {
            f name = gVar.I() == d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> n(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> d2;
        l.f(dVar, "kindFilter");
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected kotlin.reflect.x.internal.l0.d.a.l0.l.b p() {
        return b.a.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected void r(Collection<y0> collection, f fVar) {
        l.f(collection, "result");
        l.f(fVar, "name");
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.l.j
    protected Set<f> t(kotlin.reflect.x.internal.l0.i.w.d dVar, Function1<? super f, Boolean> function1) {
        Set<f> d2;
        l.f(dVar, "kindFilter");
        d2 = u0.d();
        return d2;
    }
}
